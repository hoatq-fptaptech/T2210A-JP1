package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HomeController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;
    public Text txtOut;

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String tel = txtTel.getText();
        txtOut.setText(name+"\n"+email+"\n"+tel);
    }
}
