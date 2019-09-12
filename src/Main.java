import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.enigma.model.Mobil;


public class Main {
    public static void main(String[] args) throws IOException {
        // membuat scanner
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Kordinat Awal x,y : ");
        String coordinate = reader.readLine();
        String[] post = coordinate.split(",");
        Mobil rush = new Mobil(Integer.parseInt(post[0]), Integer.parseInt(post[1]));

        System.out.print("Masukkan Bensin : ");
        String bensin = reader.readLine();
//        int bsn = Integer.parseInt(bensin);
        rush.setFuel(Integer.parseInt(bensin));

        System.out.print("masukan arah R,L,F,B : ");
        String mo = reader.readLine();
        rush.setCommands(mo);
        rush.run();
        //System.out.println(rush.print());
    }

}

