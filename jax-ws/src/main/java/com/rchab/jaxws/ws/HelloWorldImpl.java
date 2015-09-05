package com.rchab.jaxws.ws;


import javax.jws.WebService;

@WebService(endpointInterface = "com.rchab.jaxws.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(String name) {
        return "Hello world JAX-WS for " + name;
    }
}
