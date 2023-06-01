package javafx;

import database.Connector;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class FormController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            for (Student s: HomeController.listStudents){
                if(s.getName().equals(name))
                    throw new Exception("Tên SV đã tồn tại");
                if(s.getEmail().equals(email))
                    throw new Exception("Email đã tồn tại");
            }
            Student sv = new Student(name,email,tel);
//            HomeController.listStudents.add(sv);
            // add to db
            Connection conn = new Connector().getConn();

            // query
//            Statement stt = conn.createStatement();
//            String sql = "insert into students(name,email,tel) values('"+
//                    sv.getName()+"','"+sv.getEmail()+"','"+sv.getTel()+"')";
//            stt.executeUpdate(sql);
            String sql = "insert into students(name,email,tel) values(?,?,?)";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setString(1,sv.getName());
            stt.setString(2,sv.getEmail());
            stt.setString(3,sv.getTel());
            stt.executeUpdate();

            backToList(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
