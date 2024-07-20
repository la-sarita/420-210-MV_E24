package mv420_210.projet.quizgen;

import javafx.application.Application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import mv420_210.projet.quizgen.controllers.ScreenController;
import mv420_210.projet.quizgen.models.Quiz;
import mv420_210.projet.quizgen.models.gestionFichier.ManipulationFichier;
import mv420_210.projet.quizgen.ui.quiz.QuizBox;

import static mv420_210.projet.quizgen.models.Utilities.*;


public class QuizApplication extends Application {

    @FXML
    static Scene scene;
    static ScreenController screenController;

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(QuizApplication.class.getResource("views/quiz-template.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        screenController = new ScreenController(scene);
        String[] screenNames = new String[]{MAIN_VIEW_NAME, CREATE_QUIZ_VIEW_NAME, SELECT_QUIZ_VIEW_NAME, QUIZ_TEMPLATE_NAME};
        for (String screenName : screenNames) {
            screenController.addScreen(screenName, new FXMLLoader(getClass().getResource( "views/" + screenName + ".fxml" )).load());
        }

        screenController.activate(screenNames[0]);
        //Quiz quiz = ManipulationFichier.deserialize(CHEMIN_QUIZ + "quiz2.json");
        stage.setTitle(SCENE_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //genererQuiz();
        launch();
    }

    public static Scene getScene() {
        return scene;
    }

    public static ScreenController getScreenController() {
        return screenController;
    }

    private MenuBar createMenuBar() {
        MenuBar menuBar = new MenuBar();
        Menu menuQuiz = new Menu("Quiz");
        MenuItem createQuiz = new MenuItem("Create Quiz");
        MenuItem editQuiz = new MenuItem("Edit Quiz");
        MenuItem takeQuiz = new MenuItem("Take Quiz");

        createQuiz.setOnAction(e -> createQuiz());
        editQuiz.setOnAction(e -> editQuiz());
        takeQuiz.setOnAction(e -> takeQuiz());

        menuQuiz.getItems().addAll(createQuiz, editQuiz, takeQuiz);
        menuBar.getMenus().add(menuQuiz);

        return menuBar;
    }

    private void createQuiz() {
        System.out.println("Create Quiz");
        // Logic to create a quiz
    }

    private void editQuiz() {
        System.out.println("Edit Quiz");
        // Logic to edit a quiz
    }

    private void takeQuiz() {
        System.out.println("Take Quiz");
        // Logic to take a quiz
    }

}