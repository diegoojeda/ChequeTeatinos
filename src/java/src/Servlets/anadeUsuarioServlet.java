/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.Servlets;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.Entities.Cliente;
import src.Facades.ClienteFacade;

/**
 *
 * @author diegoojedagarcia
 */
@WebServlet(name = "anadeUsuarioServlet", urlPatterns = {"/anadeUsuarioServlet"})
public class anadeUsuarioServlet extends HttpServlet {
    @EJB
    private ClienteFacade clienteFacade;



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
        super.doGet(request, response);
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
        String email = request.getParameter("email");
        if (clienteFacade.find(email) != null){
            request.getRequestDispatcher("errorSignup.jsp").forward(request, response);
        }
        else{
            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setEmail(email);
            nuevoCliente.setPass(request.getParameter("password"));
            nuevoCliente.setApellidos(request.getParameter("apellidos"));
            nuevoCliente.setEsAdmin((short)0);
            nuevoCliente.setNombre(request.getParameter("nombre"));
            nuevoCliente.setTelefono(Integer.parseInt(request.getParameter("telefono")));
            clienteFacade.create(nuevoCliente);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
