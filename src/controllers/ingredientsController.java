package controllers;

import javafx.fxml.Initializable;
import model.DinnerModel;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Henri on 12-2-14.
 */
public class ingredientsController implements Initializable {

    public ingredientsController(DinnerModel dinnerModel)
    {
        System.out.println(dinnerModel.getFullMenu());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}