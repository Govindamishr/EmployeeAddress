# EmployeeAddress
:house: **EmployeeAddress**

### ***Framework***
---------
- spring boot

-------------

### ***Project management tool***
-------
- Maven


-----------------
### ***DataBase***
****************
- MySql
****************

### **use of dependency**
-----
- <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
- <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
     </dependency>

- <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-devtools</artifactId>
	<scope>runtime</scope>
	<optional>true</optional>
	</dependency>
- <dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.0.33</version>
 </dependency>

- <dependency>
       <groupId>org.projectlombok</groupId>
       <artifactId>lombok</artifactId>
       <optional>true</optional>
	</dependency>
- <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-test</artifactId>
     <scope>test</scope>
     </dependency>
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation -->
- <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
	<version>3.0.6</version>
	</dependency>





--------

### **packages and class**

---------
- model 
  - Employee
  - Address

- controller
   - EmployeeController
   - AddressController

- service
   - EmployeeService
   - AddressService
- Repository
  - IEmployeeRepository
  - IAddressRepository
 
-------------


### **Run tests**

------

⭕ postman 

:globe_with_meridians: chrome browser

********

### **Data structure And programming language**

-----

 - core java
 
 --------

  :point_down: **Summary**
*****
This is a Java Spring Boot project with two entity classes, Employee and Address, and two corresponding controller classes, EmployeeController and AddressController. The Employee class has a one-to-one mapping with the Address class, achieved using the @OneToOne annotation in the Employee class.

The Employee and Address classes have similar attributes such as id, firstName, lastName, and address for Employee, and id, street, city, state, and zipcode for Address.

The EmployeeController class has methods for CRUD (Create, Read, Update, and Delete) operations on Employee objects, including getAllEmployees, getEmployeeById, createEmployee, updateEmployeeById, and deleteEmployeeById.

Similarly, the AddressController class has methods for CRUD operations on Address objects, including getAllAddresses, getAddressById, createAddress, updateAddressById, and deleteAddressById.

Overall, this project provides a simple example of how to implement a one-to-one mapping between two entities in Spring Boot and perform CRUD operations on them using RESTful APIs.
*****

### **Show your Support** 
****
:star: Thankyou 

****
