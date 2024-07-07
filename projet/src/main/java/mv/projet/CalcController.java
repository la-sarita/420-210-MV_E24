package mv.projet;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalcController {
    @FXML
    private TextField resultatCalcul;

    @FXML
    protected void onClickBtnClick(){
        System.out.println("onClickBtnClick");
        resultatCalcul.setText(resultatCalcul.getText() + "100");
    }
}
