package InputOutput;
import java.util.List;
import java.nio.file.*;

class ReadFile
{
    public static void main(String args[])
    {
        try
        {
            Path path = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test.txt");

            if (Files.exists(path)) {
                List<String> data = Files.readAllLines(path);
                for (String line : data) {
                    System.out.println(line);
                }
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