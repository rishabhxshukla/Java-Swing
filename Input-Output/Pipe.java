package InputOutput;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

class MyPipe
{
    public static void main(String args[]) throws IOException
    {
        /* Data */
        String str = "Hello world!";

        /* Pipe */
        Pipe pipe = Pipe.open();

        /* Sink */
        Pipe.SinkChannel sink = pipe.sink();

        /* Byte Buffer */
        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.put(str.getBytes());
        bb.flip();

        while (bb.hasRemaining())
        {
            sink.write(bb);
        }

        /* Source */
        Pipe.SourceChannel source = pipe.source();
        bb = ByteBuffer.allocate(1024);

        while (source.read(bb) > 0)
        {
            bb.flip();

            while (bb.hasRemaining())
            {
                char ch = (char) bb.get();
                System.out.print(ch);
            }
        }

        bb.clear();
        pipe.sink().close();
        pipe.source().close();
    }
}