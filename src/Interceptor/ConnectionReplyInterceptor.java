/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

/**
 *
 * @author New User
 */
public interface ConnectionReplyInterceptor {
    
    public void preRemoteReply(ConnectionReplyContext context); 
    public void postRemoteReply(ConnectionReplyContext context); 
    
}
