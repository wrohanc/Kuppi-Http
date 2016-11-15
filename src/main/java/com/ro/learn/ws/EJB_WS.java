package com.ro.learn.ws;


import com.ro.learn.util.bean.Order;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by rohan on 2016-11-11.
 */
@WebService
@Stateless
@LocalBean
public class EJB_WS {
    @WebMethod(operationName = "orderNew")
    public String order(@WebParam(name = "order") String order){
        System.out.println("EJB WS Order new message received :" + order);

        return "{\"orderId\" : 1, \"status\" : \"Queued\"}";

    }

    @WebMethod(operationName = "amend")
    public Order amend(@WebParam(name = "order") Order order) {// todo explain
        System.out.println("EJB WS Order amend message received : symbol :" + order.getSymbol() + " qty :" + order.getQuantity() + " price :" + order.getPrice());

        return order;

    }
}
