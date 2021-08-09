import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperator {

    public static String createFile(String name) {

        try {

            String userPath = System.getProperty("user.home");
            File file = new File(userPath + "/Downloads/" + name + ".txt");

            if (file.createNewFile()) {

                System.out.println("File created: " + file.getPath());
                return file.getPath();
            } else {

                System.out.println("File already exists in Downloads Folder.");
                return null;
            }
        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

            return null;
        }
    }

    public static void writeToFile(String data, String path) {

        try {

            FileWriter fileWriter = new FileWriter(path);

            fileWriter.write(String.valueOf(data));
            fileWriter.close();

            System.out.println("Successfully wrote to " + path);
        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}