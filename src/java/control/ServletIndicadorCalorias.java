/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import calculos.IndicadorCaloriasReq;
import calculos.strategy.CaloriasRequeridas;
import calculos.strategy.MetodoBH;
import calculos.strategy.MetodoCS;
import calculos.strategy.MetodoHB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
@WebServlet(name = "ServletIndicadorCalorias", urlPatterns = {"/ServletIndicadorCalorias"})
public class ServletIndicadorCalorias extends HttpServlet {

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
        HttpSession sesion = request.getSession();
        
        double peso = Double.parseDouble(request.getParameter("peso"));
        double estatura = Double.parseDouble(request.getParameter("estatura"));
        int numActividad = Integer.parseInt(request.getParameter("actividad"));
        String metodo = request.getParameter("metodo");
        
        IndicadorCaloriasReq calorias = new IndicadorCaloriasReq();
        Usuario user = (Usuario) sesion.getAttribute("usuario");
        CaloriasRequeridas strategy;
       
        switch (metodo) {
            case "bh":
                strategy = new MetodoBH();
                break;
            case "hb":
                strategy = new MetodoHB();
                break;
            case "cs":
                strategy = new MetodoCS();
                break;
            default:
                strategy = new MetodoCS();
        }
        
        calorias.setUsuario(user);
//        calorias.setEstatura(estatura);
//        calorias.setPeso(peso);
        calorias.setFactorActividad(numActividad);
        calorias.setCaloriasRequeridas(strategy);
        
        sesion.setAttribute("indicadorCalorias", calorias);
        
        request.getRequestDispatcher("resultados/CaloriasRequeridas.jsp").forward(request, response);
        
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
