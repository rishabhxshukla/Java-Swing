package InputOutput;
import java.nio.file.*;

class FileProperties
{
    public static void main(String args[])
    {
        Path path = Paths.get("D:\\PROGRAMMING\\Java Swing\\Input-Output\\file.docx");

        System.out.println(path);

        System.out.println(path.getParent());

        System.out.println(path.getRoot());

        System.out.println(path.getFileName());

        System.out.println(Files.exists(path));

        System.out.println(Files.notExists(path));
    }
}