package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.DinnerModel;
import model.Dish;


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


        for(Dish d : dM.getFullMenu())
        {

            Label label = new Label();
            Text text = new Text();
            text.maxWidth(400);
            text.setWrappingWidth(550);

            if(d.getType() == 1)
            {
                label.setText("Starter");
            }
            else if(d.getType()==2)
            {
                label.setText("Main");
            }
            else if(d.getType()==3)
            {
                label.setText("Desert");
            }

            text.setText(d.getDescription());
            preparationMenuBox.getChildren().add(label);
            preparationMenuBox.getChildren().add(text);


        }
    }


}