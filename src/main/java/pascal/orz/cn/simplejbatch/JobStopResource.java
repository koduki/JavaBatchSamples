/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.simplejbatch;

import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author koduki
 */
@Path("jobstop")
public class JobStopResource {

    @GET
    public String get() {

        for (Map.Entry<String, Thread> job : JobManager.getInstance().getJobs().entrySet()) {
            job.getValue().stop();
        }

        return "success";

    }
}
