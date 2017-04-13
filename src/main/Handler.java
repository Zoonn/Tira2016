package main;

import main.structures.HeapPriorityQueue;
import main.structures.Item;
import main.structures.Position;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Käsittelijä-luokka, joka vastaa prioriteettijonon toimonnoista. Käsittelijä-luokassa myös alustetaan
 * ja luodaan prioriteettijono sovelluksen käynnistyessä.
 */

public class Handler {
    public void start() throws IOException, InvalidKeyException, IndexOutOfBoundsException {
        System.out.println("Aloitetaan!");
        boolean cont = true;
        int i = 0;
        HeapPriorityQueue prioque = new HeapPriorityQueue();
        String[][] commands = Reader.Read();
        List<String> saveCommands = new ArrayList<String>();
        boolean firstAdd = true;

        for(int j = 0; j < commands.length;j++) {
            List<String> list = new ArrayList<String>();
            for (String s : commands[j]) {

                if (s != null && s.length() > 0) {
                    list.add(s);
                }
            }
            commands[j] = list.toArray(new String[list.size()]);
        }

        while(cont){
            String command = commands[i][0];
            if(command.equals("i")){
                int avain = Integer.parseInt(commands[i][1]);
                String mjono = commands[i][2];
                prioque.insertItem(avain, mjono);
                saveCommands.add("(" + avain + "," + mjono + ") lis.");
                System.out.println("(" + avain + "," + mjono + ") lis.");
                firstAdd = false;

            }
            else if(command.equals("r")){
                Item s = prioque.deleteMin();

                saveCommands.add("("+s.key()+","+s.element()+") poistettu.");
                System.out.println("("+s.key()+","+s.element()+") poistettu.");
            }
            else if(command.equals("m")){
                Item s = prioque.minElement();
                int key = s.key();
                String string = (String)s.element();
                saveCommands.add("Pienin alkio on ("+key+","+string+").");
                System.out.println("Pienin alkio on ("+key+","+string+").");
            }
            else if(command.equals("p")){
                System.out.println();

            }
            else if(command.equals("s")){
                int size = prioque.size();
                String smallest = Integer.toString(size);
                saveCommands.add(smallest);
                System.out.println(size);
            }
            else if(command.equals("q")){
                cont = false;
                saveCommands.add("Ohjelma lopetettu.");
                System.out.println("Ohjelma lopetettu.");
            }
            else{
                saveCommands.add("Virheellinen syöte.");
                System.out.println("Virheellinen syöte.");
            }
            i++;
        }



        System.out.println("Valmis!");

    }
}
