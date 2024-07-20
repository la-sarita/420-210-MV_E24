package mv420_210.projet.quizgen.controllers;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

// source : https://stackoverflow.com/questions/37200845/how-to-switch-scenes-in-javafx
public class ScreenController {
    private HashMap<String, Parent> screenMap = new HashMap<>();
    @FXML
    private Scene main;

    public ScreenController(Scene main) {
        this.main = main;
    }

    public void addScreen(String name, Parent pane){
        screenMap.put(name, pane);
    }

    public void setScreen(String name, Parent pane){
        screenMap.put(name, pane);
    }

    public void removeScreen(String name){
        screenMap.remove(name);
    }

    public void activate(String name){
        main.setRoot( getScreen(name));
    }

    public Parent getScreen(String name){
        return screenMap.get(name);
    }
}
