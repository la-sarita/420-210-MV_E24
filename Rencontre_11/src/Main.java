import java.io.*;
import java.util.Scanner;

public class Main {
    static final String FILE_PATH = "data/filename.txt";
    public static void main(String[] args) {
        creerFichier(FILE_PATH);
        ecrireFichier(FILE_PATH);
        //lireFichier(FILE_PATH);
        lireFichierFileReader(FILE_PATH);
        getInfoFichier(FILE_PATH);
        supprimerFichier("filename.txt");
        supprimerDossier("DeleteMe");
    }

    public static void creerFichier(String fichier) {
        try {
            File myObj = new File(fichier);
            if(!myObj.exists()) {
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File cannot be created: " + myObj.getName());
                }
            } else {
                System.err.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void ecrireFichier(String fichier) {
        try {
            FileWriter myWriter = new FileWriter(fichier, true);
            myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
            System.out.println("Successfully wrote to the file.");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            //e.printStackTrace();
        }
    }

    public static void lireFichier(String fichier) {
        try {
            File myObj = new File(fichier);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void lireFichierFileReader(String fichier) {
        try {
            FileReader reader = new FileReader(fichier);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }

            reader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    public static void getInfoFichier(String fichier) {
        File myObj = new File(fichier);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    public static void supprimerFichier(String fichier) {
        File myObj = new File(fichier);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void supprimerDossier(String dossier){
        File myObj = new File(dossier);
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
