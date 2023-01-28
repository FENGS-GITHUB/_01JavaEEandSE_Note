package _05InputStreamReader;

import java.io.InputStreamReader;

public class TestMethods {
    static void read(InputStreamReader inputStreamReader)throws Exception{
        int counter=0;
        while(counter!=-1){

            counter=inputStreamReader.read();
            System.out.println((char)counter);

        }

    }
}
