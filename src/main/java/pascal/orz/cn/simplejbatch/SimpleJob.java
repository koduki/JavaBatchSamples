/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.simplejbatch;

import javax.ejb.Stateless;

/**
 *
 * @author koduki
 */
@Stateless
public class SimpleJob {

    public void run() throws Exception {
        Thread.sleep(10 * 1000);
    }
}
