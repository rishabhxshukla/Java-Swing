package InputOutput;
import java.nio.file.*;

class UpdateFile
{
    public static void main(String args[])
    {
        try
        {
            Path path = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test.txt");

            if (Files.exists(path)) {
                String data = "This is a sample text data.";
                Files.write(path, data.getBytes());
                System.out.println("File updated!");
            }
            else {
                System.out.println("No such file present!");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}