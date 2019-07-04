# Employee Manager

Simple Java project using OpenXava framework

Steps to build

1) Clone.
2) Configure Database 
    ## We are using Postgres
       a) Start Postgres Service in port 5432
       b) With-in Tomcat config content.xml add 
          <Resource name="jdbc/employee_managerDS" auth="Container" type="javax.sql.DataSource"
           maxActive="20" maxIdle="5" maxWait="10000" username="postgres" password="postgres"
           driverClassName="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/employee_manager"/>
3) ant compile
4) ant
5) Start Tomcat
   a) With-in bin 
       ./startup.sh
