package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChargeCard extends HttpServlet {

  public ChargeCard() {
    System.out.println("Charge Card Servlet called");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
    System.out.println("Charge Card doPost method called");

    System.out.println("request = " + request);
    System.out.println("response = " + response);
    String paymentMethodId  = (String)request.getParameter("paymentMethodId");

    String nameoncard = (String)request.getParameter("nameoncard");

    System.out.println("paymentMethodId = " + paymentMethodId);

    System.out.println("nameoncard = " + nameoncard);

  }
}
