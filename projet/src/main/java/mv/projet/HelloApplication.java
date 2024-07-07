package mv.projet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calc.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void getSceneCodeDynamically(Stage stage) throws IOException {
        // Permet de créer du texte pour être ajouté plus tard
        Text texte = new Text("Le bouton est cliqué");

        //Permet de créer un bouton pour être ajouté plus tard
        Button bouton = new Button();
        bouton.setText("Cliquez-moi");

        // Permet d'avoir une mise en page qui organise ses nœuds de contenu verticalement dans une seule colonne
        VBox box = new VBox();

        //ajoute le texte et le bouton dans le page
        box.getChildren().add(texte);
        box.getChildren().add(bouton);

        //ajoute 50 pixels d'espace entre le texte et le bouton
        box.setSpacing(50);

        //Les composants vont s'afficher au centre
        box.setAlignment(Pos.CENTER);

        Scene scene = new Scene(box, 700, 400);
        scene.setFill(Color.rgb(100, 200, 150));

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        //Crée une action qui va s'exécuter quand on clique sur le bouton
        bouton.setOnAction(actionEvent -> {
            texte.setText("Texte changé");
            texte.setFont(new Font(40));
            texte.setFill(Color.RED);
            stage.setFullScreen(true);
        });

    }
}