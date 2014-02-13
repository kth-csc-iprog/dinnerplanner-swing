package controllers;

import javafx.fxml.Initializable;
import model.Dish;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Henri on 12-2-14 updated just now.
 */
public class dishController implements Initializable {

    public dishController(Dish dish)
    {
        System.out.println(dish.getName());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}