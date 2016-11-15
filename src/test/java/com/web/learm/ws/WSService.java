package com.web.learm.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by rohan on 2016-11-11.
 */
@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC) // without this it does not work automatically.
public class WSService {
    @WebMethod
    public String placeOrder(@WebParam String order) {
        return "Hello "+order+" !";
    }
}
