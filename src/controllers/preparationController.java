package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import model.DinnerModel;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Henri on 12-2-14.
 */
public class preparationController {

    @FXML VBox preparationMenuBox;

    public preparationController(DinnerModel dinnerModel)
    {
        /*System.out.println(dinnerModel.getFullMenu());*/
        // Here you should add both the label of the dish and the preparation instructions.
        // It can be done like the updateMenu function in the main controller using:
        //
        // for(Dish d : dinnerModel.getFullMenu()) { code }
        //
        // the d then is one dish object which has all the properties
    }

    @FXML void initialize() {
        preparationMenuBox.getChildren().add(new Label("something"));
    }


}