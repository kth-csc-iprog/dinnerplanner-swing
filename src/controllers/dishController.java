package controllers;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
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
    @FXML public Text dishDescription;
    @FXML public VBox dishImageBox = new VBox();

    // The table and columns
    @FXML TableView<Items> itemTbl;
    @FXML TableColumn dishIngredient;
    @FXML TableColumn ingredientQuantity;
    @FXML TableColumn ingredientCost;

    private DinnerModel dM;
    private Dish d;

    // The table's data
    ObservableList<Items> data;

    static long nextId = 1;
    
    public dishController(Dish dish, DinnerModel dinnerModel)
    {
        d = dish;
        dM = dinnerModel;
    }


    @FXML void initialize()
    {
        System.out.println(d.getName());


        dishImageBox.getChildren().clear();

            Image dishImage;
            ImageView dishImageView;

            final Text dishLabel;
            VBox dishBox = new VBox();

            dishImage = new Image(new File("images/"+d.getImage()).toURI().toString());
            //dishLabel = new Text(d.getName());
           // dishLabel.setTextAlignment(TextAlignment.RIGHT);
            dishImageView = new ImageView(dishImage);
            dishBox.getChildren().add(dishImageView);
            //dishBox.getChildren().add(dishLabel);
            dishBox.getStyleClass().add("recipe");

        dishImageBox.getChildren().add(dishBox);

        dishName.setText(d.getName());
        dishPrice.setText("$ "+String.valueOf(getDishPrice())+" for "+(String.valueOf(dM.getNumberOfGuests()))+" Person(s)");
        dishDescription.setText(d.getDescription());
        dishDescription.setWrappingWidth(200);

        // Set up the table data
        dishIngredient.setCellValueFactory(
                new PropertyValueFactory<Items,String>("Ingredient")
        );
        ingredientQuantity.setCellValueFactory(
                new PropertyValueFactory<Items,Integer>("Quantity")
        );
        ingredientCost.setCellValueFactory(
                new PropertyValueFactory<Items,String>("Cost")
        );

        data = FXCollections.observableArrayList();
        itemTbl.setItems(data);
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

    public class Items
    {
        public SimpleStringProperty ingredient = new SimpleStringProperty();
        public SimpleIntegerProperty quantity = new SimpleIntegerProperty();
        public SimpleFloatProperty cost = new SimpleFloatProperty();

        public String getIngredient() {
            return ingredient.get();
        }

        public Float getCost() {
            return cost.get();
        }

        public Integer getQuantity() {
            return quantity.get();
        }
    }

}
