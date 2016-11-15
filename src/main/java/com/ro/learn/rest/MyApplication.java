package com.ro.learn.rest;

import javax.ws.rs.core.Application;

/**
 * Created by rohan on 2016-11-11.
 */
@javax.ws.rs.ApplicationPath("/rest")//todo why? full path is <ip>:port/<Context root>/rest
public class MyApplication extends Application {//todo why
}
