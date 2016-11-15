package com.ro.learn.rest;

import com.ro.learn.util.bean.Order;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by rohan on 2016-11-11.
 */
@Path("/pojo")
public class Pojo_Rest {

    @POST
    @Path("new")                //todo explain
    @Produces({"application/json"})
    @Consumes({"application/json"})
    public String order(String order){
        System.out.println("POJO Rest Order new message received :" + order);

        return "{\"orderId\" : 1, \"status\" : \"Queued\"}";

    }

    @POST
    @Path("amend")
    @Produces({"application/json"})
    @Consumes({"application/json"})
    public Order order(Order order) {// todo explain
        System.out.println("POJO Rest Order amend message received : symbol :" + order.getSymbol() + " qty :" + order.getQuantity() + " price :" + order.getPrice());

        return order;

    }
}
