package com.example.rencontre_11_2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        try {
            jacksonTest();
        } catch (JsonProcessingException e) {
            System.out.println("Erreur!");
        }
        launch();
    }

    public static void jacksonTest() throws JsonProcessingException {
        // Créez un objet ObjectMapper, qui est la classe principale de Jackson pour la conversion JSON
        ObjectMapper objectMapper = new ObjectMapper();

        // Créez un objet Employee
        Employee employee = new Employee("John Doe", 30, "Developer");

        // Sérialisez l'objet Employee en JSON
        String json = objectMapper.writeValueAsString(employee);
        System.out.println("JSON représentant l'employé :");
        System.out.println(json);

        // Désérialisez le JSON en un objet Employee
        Employee deserializedEmployee = objectMapper.readValue(json, Employee.class);
        System.out.println("\nObjet Employee désérialisé :");
        System.out.println(deserializedEmployee);
        try {
            serialize(employee);
            Employee employee1 = deserialize();
            System.out.println(employee1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void serialize(Employee obj) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String path = "src/main/resources/test.json";
        mapper.writeValue(new File(path), obj);
    }

    public static Employee deserialize() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String path = "src/main/resources/test.json";
        return mapper.readValue(new File(path), Employee.class);

    }
}