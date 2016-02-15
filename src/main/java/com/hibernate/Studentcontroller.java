/*package com.hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class Studentcontroller extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		    Session session = HibernateSessionManager.getSessionFactory().openSession();
		    session.beginTransaction();
		    Query query = session.createQuery("from STUDENT_DETAILS");
		    List list = query.list();
		    PrintWriter out = response.getWriter();
		    request.setAttribute("data",list);
		    request.getRequestDispatcher("/table.jsp").forward(request, response);

	}
}
*/

package com.hibernate;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 

 
public class Studentcontroller extends HttpServlet {
     
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String LastName = request.getParameter("lastName");
        String FirstName = request.getParameter("firstName");
        String PhoneNo = request.getParameter("phoneNO");
         
        HttpSession session = request.getSession(true);
        try {
            StudentDAO studentDAO = new StudentDAO();
            studentDAO.addStudentDetails(LastName, FirstName, PhoneNo);
            //response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }
}

