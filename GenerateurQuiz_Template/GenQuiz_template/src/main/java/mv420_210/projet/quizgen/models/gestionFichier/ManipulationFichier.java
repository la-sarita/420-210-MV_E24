package mv420_210.projet.quizgen.models.gestionFichier;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import javafx.scene.control.ListView;
import mv420_210.projet.quizgen.QuizApplication;
import mv420_210.projet.quizgen.models.Quiz;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static mv420_210.projet.quizgen.models.Utilities.URL_DATA;

public class ManipulationFichier {

    public static void serialize(Quiz obj, String path) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);;
            mapper.writeValue(new File(path), obj);
        } catch (IOException ex) {
            System.out.println("L'objet n'a pas pu être sérialisé");
            System.out.println(ex);
        }
    }

    public static Quiz deserialize(String path) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            return mapper.readValue(new File(path), Quiz.class);
        } catch (IOException ex) {
            System.err.println("Une erreur s'est produite lors de la lecture du fichier");
            System.out.println(ex);
        }
        return new Quiz();
    }


    public static void loadQuizFiles(ArrayList<String> listView) {
        try {
            URL url = URL_DATA;
            if (url != null) {
                File folder = new File(url.toURI());
                File[] fichiers = folder.listFiles();
                if (fichiers != null) {
                    for (File file : fichiers) {
                        if (file.isFile()) {
                            listView.add(file.getName());
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur, chemin invalid ou fichier ne peut pas être chargé!");
            e.printStackTrace();
        }
    }


}
