package InputOutput;
import java.nio.file.*;

class CopyFile
{
    public static void main(String args[])
    {
        try
        {
            //Original file path
            Path source = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test.txt");
            //New file path
            Path destination = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test_copy.txt");

            if (Files.exists(source)) {
                //Copying the file
                Files.copy(source, destination);
                System.out.println("File copied!");
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