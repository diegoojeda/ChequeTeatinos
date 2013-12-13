package src.Servlets;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import src.Beans.loginBean;
import src.Entities.Cliente;
import src.Facades.ClienteFacade;


@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

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
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        loginBean lb = new loginBean();
        try {
            lb.setC(clienteFacade.findClienteEmailPass(email, pass));
        } catch (Exception ex) {
            request.getRequestDispatcher("error.jsp"); //Crear pagina error de login
            System.out.println("ERROR!!");
        }
        HttpSession sesion = request.getSession();
        sesion.setAttribute("cliente", lb);
        request.getRequestDispatcher("home.jsp").forward(request, response);
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
        String pass = request.getParameter("password");
        Cliente c = null;
        try {
            c = clienteFacade.findClienteEmailPass(email, pass);
        } catch (Exception ex) {
            request.getRequestDispatcher("error.jsp"); //Crear pagina error de login
        }
        System.out.println("esito");
        request.setAttribute("cliente", c);
        request.getRequestDispatcher("home.jsp").forward(request, response);
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
