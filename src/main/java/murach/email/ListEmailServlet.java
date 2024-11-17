package murach.email;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import murach.business.User;

public class ListEmailServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        } else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // get the new parameters
            String hearAboutUs = request.getParameter("hearAboutUs");
            String receiveAnnouncements = request.getParameter("receiveAnnouncements");

            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email);

            // Log or process the new parameters
            System.out.println("How did you hear about us: " + hearAboutUs);
            System.out.println("Would you like to receive announcements: " + receiveAnnouncements);

            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }        

    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }
}
