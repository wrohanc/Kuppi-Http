package com.web.learm.http;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

/**
 * Created by rohan on 2016-11-11.
 */
public class SimpleHttpServer {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
