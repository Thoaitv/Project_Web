/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thoai
 */
@WebServlet(name = "TestUpdateServlet", urlPatterns = {"/test"})
public class TestUpdateServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String userId = request.getParameter("id");
        String fullName = request.getParameter("fullName");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String role = request.getParameter("role");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
        AdminDAO dao = new AdminDAO();

        request.setAttribute("id", userId);
        request.setAttribute("fullName", fullName);
        request.setAttribute("gender", gender + "");
        request.setAttribute("role", role);
        request.setAttribute("phone", phone);
        request.setAttribute("address", address);
        request.setAttribute("password", password);
        request.getRequestDispatcher("updateAccount.jsp").forward(request, response);

//        int countUser = dao.countUser();
//        int countProduct = dao.countProduct();
//        int countOrder = dao.countOrder();
//
//        request.setAttribute("countUser", countUser);
//        request.setAttribute("countProduct", countProduct);
//        request.setAttribute("countOrder", countOrder);
//        request.setAttribute("user", dao.getAllUserByUserId(userId));
//        dao.updateAccount(password, fullName, phone, address, role, gender, userId);
        request.getRequestDispatcher("updateAccount.jsp").forward(request, response);

//        response.sendRedirect("UserInAdminServlet");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
