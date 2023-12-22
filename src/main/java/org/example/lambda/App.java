package org.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
//  Lambda input is just give some string
// like "Welcome Lambda", now skip json format.
public class App {

    public static String handleRequest(String args, Context context){
        return args;
    }
}


// refer - https://www.sentinelone.com/blog/aws-lambda-java-simple-introduction-examples/