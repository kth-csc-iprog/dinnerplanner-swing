package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import model.DinnerModel;
import model.Dish;
import model.Ingredient;

import java.io.File;

/**
 * Created by Henri on 12-2-14 updated just now.
 */

public class dishController
{
    @FXML public Label dishName;
    @FXML public Label dishPrice;
    @FXML public Label dishDescription;
    @FXML public VBox dishOverview = new VBox();

    private DinnerModel dM;
    private Dish d;
    
    public dishController(Dish dish, DinnerModel dinnerModel)
    {
        d = dish;
        dM = dinnerModel;
    }


    @FXML void initialize()
    {
        System.out.println(d.getName());
        dishName.setText(d.getName());

        dishOverview.getChildren().clear();

            Image dishImage;
            ImageView dishImageView;
            VBox dishBox = new VBox();

            dishImage = new Image(new File("images/"+d.getImage()).toURI().toString());
            dishImageView = new ImageView(dishImage);
            dishBox.getChildren().add(dishImageView);
            dishBox.getStyleClass().add("recipe");

         dishOverview.getChildren().add(dishBox);

        dishPrice.setText(String.valueOf(getDishPrice()));
        dishDescription.setText(d.getDescription());

    }

    public float getDishPrice()
    {
        double price = 0;
        for(Ingredient i : d.getIngredients())
        {
            price += i.getPrice();
        }
        price = price * dM.getNumberOfGuests();
        return (float) price;
    }



}
