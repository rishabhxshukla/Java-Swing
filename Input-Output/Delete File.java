package InputOutput;
import java.nio.file.*;

class DeleteFile
{
    public static void main(String args[])
    {
        try
        {
            Path path = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test.txt");

            if (Files.exists(path)) {
                Files.delete(path);
                System.out.println("File deleted!");
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