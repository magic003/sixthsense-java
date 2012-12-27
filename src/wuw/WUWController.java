package wuw;

import javafx.event.ActionEvent;
import javafx.application.Platform;

public class WUWController {
    
    public void handleBtnExitAction(ActionEvent event) {
        Platform.exit();
    }
}
