package main;

import java.io.*;

/**
 * Lukija-luokka, joka vastaa tiedostosta lukemisesta ja uuteen tiedostoon kirjoittamsesta.
 */

public class Reader {

    static String[][] Read() throws IOException {
        String[][] locker = new String[20][20];
        String[] parts;
        int space = 0;
        try {
            FileInputStream stream = new FileInputStream("input.txt");
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffReader = new BufferedReader(reader);


            while (buffReader.ready()) {

                String line = buffReader.readLine();
                line = line.replaceAll("\\s","");
                parts = line.split(",");
                for(int i = 0; i < parts.length; i++){
                    locker[space][i] = parts[i];
                }
                space++;
            }
            buffReader.close();
            System.out.println("Luku onnistunut!");
        }
        catch ( FileNotFoundException e){
            System.out.println("Tiedostoa ei löytynyt!");
        }
        catch(Exception e){
            System.out.println("Virhe lukiessa: "+e);
        }
        return locker;
    }

    /**
     * Saver-method that is used to save the output of the program for the user.
     *
     * @throws IOException
     */
    static void Save(String output) throws IOException{

        try {
            File saver = new File("output.txt");
            FileOutputStream saveStream = new FileOutputStream(saver);
            PrintWriter writer = new PrintWriter(saveStream,true);

            writer.println(output);

            saveStream.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Tiedostoa ei Löytynyt!");
        }
        catch(Exception e){
            System.out.println("Virhe tallentaessa!");
        }
    }
}
