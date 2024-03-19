package InputOutput;
import java.nio.file.*;
import java.util.stream.*;

class CreateDirectory
{
    public static void main(String args[])
    {
        try
        {
            Path path = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output");

            Stream<Path> stream = Files.list(path);

            stream.forEach((item) -> {
                String name = item.getFileName().toString();
                String token[] = name.split("\\.");
                String extension = token[token.length - 1];

                try {
                    Path dir = Paths.get(item.getParent() + "\\" + extension);
                    Files.createDirectory(dir);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}