package com.web.learm.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;

/**
 * Created by rohan on 2016-11-11.
 */
public class MyHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
        InputStream is = t.getRequestBody();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        System.out.println("Request" + out.toString());   //Prints the string content read from input stream
        reader.close();

        String response = "This is the response for " + out.toString();
        t.setAttribute("message", response);
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.flush();
        os.close();
    }
}
