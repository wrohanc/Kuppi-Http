package com.web.learm.ws;

import javax.xml.ws.Endpoint;

/**
 * Created by rohan on 2016-11-11.
 */

public class J2SEWebService {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/test",
                new WSService());
    }
}
