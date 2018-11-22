//package project;
//import java.sql.*;
//import java.util.ArrayList;
//
//public class DB_connect {
//    Statement st;
//    ResultSet rs;
//    Connection con;
//    boolean isLoggedIn = false;
//    DB_connect(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//
//            con = DriverManager.getConnection("jdbc:mysql://localhost/PetShop","aibol","777");
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//    }
//    public String getData(String username) throws SQLException {
//        String query = "SELECT * from users";
//        PreparedStatement ps = con.prepareStatement(query);
//        rs = ps.executeQuery();
//        System.out.println("Records from db : ");
//        while(rs.next()){
//            String name = rs.getString("username");
//            if(username.equals(name)){
//                return rs.getString("password");
//            }
//        }
//        return null;
//    }
//    public void login(String username, String password) throws SQLException {
//        if(getData(username).equals(password)){
//            isLoggedIn = true;
//        }
//    }
//    public void logout(){
//        isLoggedIn = false;
//    }
//    public void register(String username, String password) throws SQLException {
//        String query = String.format("INSERT INTO `users`(`username`, `password`) VALUES (%s , $s)", username, password);
//        PreparedStatement ps = con.prepareStatement(query);
//        rs = ps.executeQuery();
//    }
//    public boolean isLoggedIn() {
//        return isLoggedIn;
//    }
//
//}
