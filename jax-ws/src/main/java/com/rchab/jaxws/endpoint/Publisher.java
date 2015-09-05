package com.rchab.jaxws.endpoint;

import javax.xml.ws.Endpoint;

import com.rchab.jaxws.ws.HelloWorldImpl;

public class Publisher {

    public static final String ADDRESS = "http://localhost:9999/ws/hello";

    public static void main(String[] args) {
        Endpoint.publish(ADDRESS, new HelloWorldImpl());
    }
}
