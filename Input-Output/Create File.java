package InputOutput;
import java.nio.file.*;

class CreateFile
{
    public static void main(String args[])
    {
        try
        {
            Path path = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test.txt");

            if (Files.exists(path)) {
                System.out.println("File already exists!");
            }
            else {
                Files.createFile(path);
                System.out.println("File created!");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}