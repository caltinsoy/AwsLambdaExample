package com.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.models.s3.S3EventNotification;

import java.util.logging.Logger;


public class LambdaHandler implements RequestHandler<S3EventNotification, String> {

    private final static Logger logger = Logger.getLogger(LambdaHandler.class.getName());

    public String handleRequest(S3EventNotification s3EventNotification, Context context) {

        logger.info("--------Lambda Function--------");


        logger.info("--------Lambda Function with S3--------");

        return null;
    }
}
