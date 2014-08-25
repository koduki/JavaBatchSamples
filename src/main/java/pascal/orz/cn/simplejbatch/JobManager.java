/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.simplejbatch;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author koduki
 */
public class JobManager {

    private static JobManager self = null;
    private Map<String, Thread> jobs;

    private JobManager() {
        this.jobs = new HashMap<String, Thread>();
    }

    public static JobManager getInstance() {
        if (self == null) {
            self = new JobManager();
        }

        return self;
    }

    public Map<String, Thread> getJobs() {
        return this.jobs;
    }

}
