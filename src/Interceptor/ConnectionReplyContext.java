/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.util.Date;

/**
 *
 * @author New User
 */
public class ConnectionReplyContext {
    
    private Date startTime;
    
    public ConnectionReplyContext(Date startTime){
        this.startTime = startTime; 
    }
    
    public Date getStartTime(){
        return startTime; 
    }
    
    
    
}
