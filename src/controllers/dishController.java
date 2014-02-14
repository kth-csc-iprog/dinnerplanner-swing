package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.DinnerModel;
import model.Dish;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Henri on 12-2-14
 * Not sure what has changed and how things need to be changed? (Wouter)
 */
public class dishController implements Initializable {

    private DinnerModel dinnerModel = new DinnerModel();
    // The components of our views
    // Components for the menu

    @FXML public Label dishName = new Label();

    private String currentDish = "macaroni";


    public dishController(Dish dish)
    {
        System.out.println(dish.getName());

        currentDish = (dish.getName());
        //currentDish = currentDish.substring(0,currentDish.length()-2);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    dishName.setText("SEK 600"+ DinnerModel.dishLabel);
    }


    @FXML void initialize()
    {

    }

    public void updatePrice()
    {

    }

}