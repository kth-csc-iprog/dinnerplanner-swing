package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.DinnerModel;
import model.Dish;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Henri on 12-2-14 updated just now.
 */



public class dishController
{

    private Dish d;
    
    public dishController(Dish dish)
    {
        d = dish;
        
    }


    @FXML void initialize()
    {
        System.out.println(d.getName());
    }

}