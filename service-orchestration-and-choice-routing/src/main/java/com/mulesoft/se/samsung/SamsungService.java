/**
 * MuleSoft Examples
 * Copyright 2014 MuleSoft, Inc.
 *
 * This product includes software developed at
 * MuleSoft, Inc. (http://www.mulesoft.com/).
 */

package com.mulesoft.se.samsung;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-05-05T15:57:37.994-03:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://samsung.se.mulesoft.com/", name = "SamsungService")
@XmlSeeAlso({ObjectFactory.class})
public interface SamsungService {

    @WebResult(name = "orderResponse", targetNamespace = "")
    @RequestWrapper(localName = "purchase", targetNamespace = "http://samsung.se.mulesoft.com/", className = "com.mulesoft.se.samsung.Purchase")
    @WebMethod
    @ResponseWrapper(localName = "purchaseResponse", targetNamespace = "http://samsung.se.mulesoft.com/", className = "com.mulesoft.se.samsung.PurchaseResponse")
    public com.mulesoft.se.samsung.OrderResponse purchase(
        @WebParam(name = "orderRequest", targetNamespace = "")
        com.mulesoft.se.samsung.OrderRequest orderRequest
    );
}