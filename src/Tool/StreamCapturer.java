package Tool;

import java.awt.TextArea;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class StreamCapturer extends OutputStream{
	 private StringBuilder buffer;
     private String prefix;
     private PrintStream old;
     private TextArea t;
           
     public StreamCapturer(String prefix, TextArea t, PrintStream old) {
         this.prefix = prefix;
         buffer = new StringBuilder(128);
         buffer.append("").append(prefix).append("");
         this.old = old;
         this.t=t;
     }

     @Override
     public void write(int b) throws IOException {
         char c = (char) b;
         String value = Character.toString(c);
         buffer.append(value);
         if (value.equals("\n")) {
             t.appendText(buffer.toString());
             buffer.delete(0, buffer.length());
             buffer.append("").append(prefix).append("");
         }
         old.print(c);
     }    
     
     
 }   
