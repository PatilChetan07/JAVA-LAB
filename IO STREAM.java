/* Java uses the concept of a stream to make I/O operation fast. 
The java.io package contains all the classes required for input and output operations.
3 streams are created for us automatically.
1)System.out: standard output stream 2)System.in: standard input stream 3)System.err: standard error stream */

import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        char c;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the character : ");
        c = (char)br.read();
        System.out.println(c);

        FileInputStream in = new FileInputStream("Input.txt");
        FileOutputStream out = new FileOutputStream("Output.txt");
        int a;
        int k = 0;
        while((a = in.read()) != -1){
            out.write(a);
            System.out.print((char)a);
            k++;
        }
        System.out.println();
        System.out.println("No of char copied : " + k);
    }
}
