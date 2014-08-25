/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbatchsample;

import javax.batch.api.Batchlet;

/**
 *
 * @author koduki
 */
public class SampleBatchlet implements Batchlet {

    @Override
    public String process() throws Exception {
        System.out.println("## start");
        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
        }
        System.out.println("## finish sleep");

        return null;
    }

    @Override
    public void stop() throws Exception {
        System.out.println("## stop");
    }

}
