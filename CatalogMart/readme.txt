
PROJECT CatalogMart:
	- The CatalogMart web service is used to get information about Products from the Catalog database

Description of project contents:

1) CatalogDatabase.sql: 
  sql script to create a database in MySQL with two tables and populate them with values

2) hibernate.cfg.xml: specifies configuration settings for Hibernate 

3) Project must include following dependencies:
	3.1) Hibernate jars
	3.2) mysql-connector-java jar
	3.3) JUnit4

4) Java Resources:
	4.1) The src folder has four packages
		4.1.1) mypackage: CatalogDriver class is to write test code while project is being developed
		4.1.2) mypackage.dao: This has CatalogDAO class which contains operations for interaction with the database
		4.1.3) mypackage.dto: This has Category and Product classes which map to Hibernate entities in the database
		4.1.4) mypackage.service: This has CatalogService which is the web service and CatalogServiceInterface which is the Service Endpoint Interface

	4.2) The test folder has one package
		4.2.1) mypackage.test: CatalogService.test includes JUnit tests to test methods in the CatalogService class 

5) WebContent:
	5.1) TestFile.jsp: simple jsp to test successful deployment 
