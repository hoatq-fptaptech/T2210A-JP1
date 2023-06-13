package javafx;

import database.Connector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main extends Application {

    public static void main(String[] args) {
        // add user with hash password
            String name = "abc xyz";
            String email = "abcxyz@gmail.com";
            String pwd = "123456";
            // hash password
            String salt = BCrypt.gensalt();
            String hashedPwd = BCrypt.hashpw(pwd,salt);
            // save to db
//            String sql = "insert into users(name,email,password) values(?,?,?)";
            try {
//                Connection conn = Connector.getInstance().getConn();
//                PreparedStatement ptt = conn.prepareStatement(sql);
//                ptt.setString(1,name);
//                ptt.setString(2,email);
//                ptt.setString(3,hashedPwd);
//                ptt.executeUpdate();
            }catch (Exception e){}

            // login
//            String dbPass = "$2a$10$NEdIkEQyZ9Ej1qe0jKSmD.cXxz92qpFoxR234Ynhgexbode8/vGti";
//            String pass = "123456";
//            boolean check = BCrypt.checkpw(pass,dbPass);
//        System.out.println(check);
        //end
        launch(args);
    }
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.setTitle("T2210A JavaFX Demo");
        primaryStage.show();
    }
}
