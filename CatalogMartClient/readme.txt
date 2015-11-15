
PROJECT CatalogMartClient:
	- The CatalogMartClient tests the web service 
	- Project CatalogMart is a required for this project
	
Description of project contents:
	
1) Java Resources:
	This has two packages (generated and mypack)
	1.1) generated: this package was used to import all the .java files obtained by running the wsimport command with the wsdl for CatalogService 
	1.2) mypack: CMClient class has a method that tests the web service by creating a new instance of the web service and invoking a method on it 

2) WebContent:
	2.1) InputForm.html: Form to get input from a web service user and submit to Client.jsp
	2.2) Client.jsp: Invokes the web service, initializes web service operation arguments and processes results

