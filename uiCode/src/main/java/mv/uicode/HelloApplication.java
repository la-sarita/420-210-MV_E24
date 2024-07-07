package mv.uicode;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        GridPane grid = new GridPane();
        // Création du TableView
        createTableView(grid);
        // Création du Combobox
        createComboBox(grid);
        // Création du textField
        createTextField(grid);
        // Création du premier bouton
        createAddButton(grid);
        // Création du HBox
        createHBox(grid);
        // Création du deuxième bouton
        Button btn2 = new Button("Bouton 2");
        GridPane.setConstraints(btn2, 3, 3, 1, 1);
        grid.getChildren().add(btn2);

        btn2.setOnAction(actionEvent -> {
            System.out.println("Button 2 clicked");
        });

        // Configurer le style
        grid.setHgap(20);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        Scene scene = new Scene(grid, 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void createTableView(GridPane grid){
        TableView tableView = new TableView();
        GridPane.setConstraints(tableView, 1, 1, 3,1);
        grid.getChildren().add(tableView);
        tableView.setPrefWidth(700);
        //tableView.setEditable(true);
        // Ajout des colonnes dans le TableView
        TableColumn tableColumn1 = new TableColumn("Nom");
        TableColumn tableColumn2 = new TableColumn("Prenom");
        TableColumn tableColumn3 = new TableColumn("Email");
        tableView.getColumns().addAll(tableColumn1, tableColumn2, tableColumn3);
    }

    public static void createComboBox(GridPane grid){
        ComboBox<String> comboBox = new ComboBox<>();
        GridPane.setConstraints(comboBox, 1, 2, 1, 1);
        grid.getChildren().add(comboBox);
    }

    public static void createTextField(GridPane grid){
        TextField textField = new TextField();
        GridPane.setConstraints(textField, 2, 2, 1, 1);
        grid.getChildren().add(textField);
    }

    public static void createAddButton(GridPane grid){
        Button btn = new Button("Bouton 1");
        GridPane.setConstraints(btn, 3, 2, 1, 1);
        grid.getChildren().add(btn);
    }

    public static void createHBox(GridPane grid){
        HBox hBox = new HBox();
        GridPane.setConstraints(hBox, 2, 3, 1, 1);
        grid.getChildren().add(hBox);
        // Ajout du Label dans le HBox
        createHboxLabel(grid, hBox);
        // Ajout du Spinner dans le HBox
        createHboxSpinner(grid, hBox);
        // Ajout du CheckBox dans le HBox
        createHboxCheckBox(grid, hBox);
    }

    public static void createHboxLabel(GridPane grid, HBox hBox){
        Label label = new Label("Hi!");
        hBox.getChildren().add(label);
    }

    public static void createHboxSpinner(GridPane grid, HBox hBox) {
        Spinner<Integer> spinner = new Spinner<>();
        hBox.getChildren().add(spinner);
    }

    public static void createHboxCheckBox(GridPane grid, HBox hBox){
        CheckBox checkBox = new CheckBox();
        hBox.getChildren().add(checkBox);
    }
    public static void main(String[] args) {
        launch();
    }
}