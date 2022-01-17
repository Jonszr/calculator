/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JonSZR
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String first = request.getParameter("fvalue");
            String second = request.getParameter("svalue");
            String op = request.getParameter("op");
            String message;
            int first1;
            int second1;
            if(first!= "" && second != ""){

            try{
            first1 = Integer.parseInt(first);
            second1 = Integer.parseInt(second);
            int result = 0;
            
            if(op == null){
            message = "plz press a operator to caculate!";
            return;
            }
            else if(op.equals("+")){
            result = first1 + second1;
            }else if(op.equals("-")){result = first1 - second1;}
            else if(op.equals("*")){result = first1 * second1;}
            else if(op.equals("%")){result = first1 % second1;}
            message = String.format("The result is %d",result);
            }catch(Exception ex){
            message = "The input is not a number";
            }}else{
            message = "Input is missing"; 
            }
            request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
