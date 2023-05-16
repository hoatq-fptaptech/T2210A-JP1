package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HomeController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;
    public Text txtOut;

    public ArrayList<String> emailList= new ArrayList<>();
    public ArrayList<String> tellList= new ArrayList<>();

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            if(emailList.contains(email))
                throw new Exception("Email đã tồn tại");
            if(tellList.contains(tel))
                throw new Exception("Tel đã tồn tại");
            emailList.add(email);
            tellList.add(tel);
            String sv = "\n"+name+"\n"+email+"\n"+tel;
            txtOut.setText(txtOut.getText()+sv);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
