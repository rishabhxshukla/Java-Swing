package InputOutput;
import java.util.List;
import java.nio.file.*;

class CopyData
{
    public static void main(String args[])
    {
        try
        {
            //Original file path
            Path oldFile = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test.txt");

            if (Files.exists(oldFile)) {

                //Creating new file
                Path newFile = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\abc.txt");
                Files.createFile(newFile);

                //Reading old file
                List<String> data = Files.readAllLines(oldFile);

                //Copying the data
                Files.write(newFile, data);

                System.out.println("Data copied!");
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