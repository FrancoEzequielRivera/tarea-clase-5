import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class Punto2 {
    public static void main(String[] args) throws IOException {
        String archivo = args[0];

        if (Objects.equals(args[1], "suma")){

            int suma = 0;
            int i;
            String a = Files.readAllLines(Paths.get(archivo)).get(0);
            String[] conSplit;

            conSplit = a.split(",");

            for (i = 0; i < conSplit.length; i++){
                suma += Integer.parseInt(conSplit[i]);
            }

            System.out.println(suma);

        }
        else if (Objects.equals(args[1], "multiplicacion")){

            int multi = 1;
            int i;
            String a = Files.readAllLines(Paths.get(archivo)).get(0);
            String[] conSplit;

            conSplit = a.split(",");

            for (i = 0; i < conSplit.length; i++){
                multi *= Integer.parseInt(conSplit[i]);
            }

            System.out.println(multi);

        }
    }

}
