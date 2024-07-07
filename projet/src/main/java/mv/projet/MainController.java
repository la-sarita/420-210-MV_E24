package mv.projet;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label btnText;

    @FXML
    protected void onClickBtnClick() {
        if(btnText.isVisible()) {
            btnText.setVisible(false);
        }else{
            btnText.setVisible(true);
        }
    }
}
