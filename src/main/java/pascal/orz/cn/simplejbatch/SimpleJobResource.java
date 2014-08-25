/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.simplejbatch;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author koduki
 */
@Path("simplejob")
public class SimpleJobResource {

    @EJB
    SimpleJob simpleJob;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SimpleJobResource
     */
    public SimpleJobResource() {
    }

    /**
     * Retrieves representation of an instance of
     * pascal.orz.cn.simplejbatch.SimpleJobResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    public String get() {
        String jobName = this.getClass().getSimpleName() + System.currentTimeMillis();
        try {

            JobManager.getInstance().getJobs().put(jobName, Thread.currentThread());
            System.out.println("Job start:" + jobName);

            simpleJob.run();

        } catch (Exception ex) {
            return "error:" + ex.getMessage();
        } finally {
            System.out.println("Job end:" + jobName);
            JobManager.getInstance().getJobs().remove(jobName, Thread.currentThread());
        }

        return "success";

    }

}
