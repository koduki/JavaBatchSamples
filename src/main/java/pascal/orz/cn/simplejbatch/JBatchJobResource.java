/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.simplejbatch;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
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
@Path("jbatchjob")
public class JBatchJobResource {

    @EJB
    SimpleJob simpleJob;

    @Context
    private UriInfo context;

    
    @GET
    public String get() {
        JobOperator job = BatchRuntime.getJobOperator();

        long id = job.start("sample-job", null);
        System.out.println("id = " + id);
        job.stop(id);

        return "success";

    }

}
