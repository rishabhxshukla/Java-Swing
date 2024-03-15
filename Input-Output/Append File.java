package InputOutput;
import java.nio.file.*;

class AppendData
{
    public static void main(String args[])
    {
        try
        {
            Path path = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\test.txt");

            if (Files.exists(path)) {
                String data = "\nNew text appended.";
                Files.write(
                        path,
                        data.getBytes(),
                        StandardOpenOption.APPEND
                );
                System.out.println("File appended!");
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