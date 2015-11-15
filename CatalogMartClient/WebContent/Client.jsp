<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client JSP Page</title>
</head>
<body>

	<%-- start web service invocation --%>
	<hr />
	<%        

            try {
            	generated.CatalogServiceService cssrvc = new generated.CatalogServiceService();
            	generated.CatalogService port = cssrvc.getCatalogServicePort();
                
                // initialize WS operation arguments 

                int PId = Integer.parseInt(request.getParameter("PId"));
                
                // process result 

                java.lang.String result = port.get(PId);
                out.println("Product with this Id: " + result);

            } catch (Exception ex) {
                // handle custom exceptions 
                ex.printStackTrace();
            }
        %>
	<%-- end web service invocation --%>
	<hr />

</body>
</html>