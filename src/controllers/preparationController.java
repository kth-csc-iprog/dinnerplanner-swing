package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import model.DinnerModel;


/**
 * Created by Henri on 12-2-14.
 */
public class preparationController {

    @FXML VBox preparationMenuBox;
    DinnerModel dM;
    public preparationController(DinnerModel dinnerModel)
    {
        dM = dinnerModel;
    }

    @FXML void initialize() {
        // Here you should add both the label of the dish and the preparation instructions.
        // It can be done like the updateMenu function in the main controller using:
        //
        // for(Dish d : dM.getFullMenu()) { code }
        //
        // the d then is one dish object which has all the properties
        preparationMenuBox.getChildren().add(new Label(dM.toString()));
    }


}