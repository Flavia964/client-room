package com.digital.crud.saladereuniao.exception;

import java.util.Date;

public class ErrorDetails {

    private Date timestamp;
    private String details;
    private String message;


    public
    Date getTimestamp ( ) {
        return timestamp;
    }

    public
    String getDetails ( ) {
        return details;
    }

    public
    String getMessage ( ) {
        return message;
    }

    public ErrorDetails ( Date timestamp , String message , String details ) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

}
