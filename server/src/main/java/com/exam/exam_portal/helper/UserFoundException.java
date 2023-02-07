package com.exam.exam_portal.helper;

public class UserFoundException extends Exception{

    public UserFoundException(){
        super("User with this username is already present!!");
    }

    public UserFoundException(String msg){
        super(msg);
    }
}
