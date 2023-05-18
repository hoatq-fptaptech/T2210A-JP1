package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HomeController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;


    public static ObservableList<Student> listStudents = FXCollections.observableArrayList();
    public ListView<Student> lv;
    public static Student editStudent;

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            if(editStudent != null){
                editStudent.setName(name);
                editStudent.setEmail(email);
                editStudent.setTel(tel);
                lv.setItems(listStudents);
                lv.refresh();
                editStudent = null;
                txtName.clear();
                txtEmail.clear();
                txtTel.clear();
                return;
            }
            for (Student s: listStudents){
                if(s.getName().equals(name))
                    throw new Exception("Tên SV đã tồn tại");
                if(s.getEmail().equals(email))
                    throw new Exception("Email đã tồn tại");
            }
            Student sv = new Student(name,email,tel);
            listStudents.add(sv);
            lv.setItems(listStudents);
            txtName.clear();
            txtEmail.clear();
            txtTel.clear();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void editStudent(MouseEvent mouseEvent) {
        editStudent = lv.getSelectionModel().getSelectedItem();
        if(editStudent != null){
            txtName.setText(editStudent.getName());
            txtEmail.setText(editStudent.getEmail());
            txtTel.setText(editStudent.getTel());
        }
    }
}// ListView
