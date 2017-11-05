/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author New User
 */
public class LoggingDispatcher implements ConnectionReplyInterceptor {
    
    List<ConnectionReplyInterceptor> interceptors = new ArrayList<ConnectionReplyInterceptor>(); 
    
    public void registerLoggingInterceptor(ConnectionReplyInterceptor interceptor){
        interceptors.add(interceptor); 
    }
    
    @Override
    public void preRemoteReply(ConnectionReplyContext context) {
        for(ConnectionReplyInterceptor interceptor:interceptors){
            interceptor.preRemoteReply(context);
        }
    }

    @Override
    public void postRemoteReply(ConnectionReplyContext context) {
         for(ConnectionReplyInterceptor interceptor:interceptors){
            interceptor.postRemoteReply(context);
        }
    }
    
}
