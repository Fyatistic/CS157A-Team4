<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ page import="java.sql.*"%>
  <html>
    <head>
      <title>Around The World</title>
    </head>
    <body>
      <h1>Welcome to 'Around The World'</h1>
      <%
      String db = "aroundtheworldtest",
      username  = "Team4",
      password  = "Team4",
      table     = "test_table";

      try {
        java.sql.Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, username, password);
        out.println(db + " database successfully opened.");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from "+ db + "." + table);

        //This code can be changed to be a nice header instead of just hello
        out.println("Test Text -- expected table below");

        //This code displays the information retreived from your hw1 table
        while (rs.next())
        out.println("<br>" + rs.getInt(1) + " " + rs.getString(2));
        con.close();

      } catch (SQLException e) {
        out.println("SQLException caught: " + e.getMessage());
      }
      %>
    </body>
  </html>
