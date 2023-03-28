import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class Punto3 {
    public static void main(String[] args) throws IOException {

        String leerEntrada = args[2];
        String leerSalida = args[3];


        if (Objects.equals(args[0], "codificacion")){

            //String frase = "franco rivera";
            String frase = Files.readAllLines(Paths.get(leerEntrada)).get(0);
            String abecedario = " abcdefghijklmnopqrstuvwxyz";
            String codCesar = "";
            int posicion;
            int nuevaPosicion;
            char letra;
            char nuevaLetra;

            for (int t = 0; t < frase.length(); t++) {
                letra = frase.charAt(t);
                posicion = abecedario.indexOf(letra);
                nuevaPosicion = (posicion + Integer.parseInt(args[1])) % abecedario.length();
                nuevaLetra = abecedario.charAt(nuevaPosicion);
                codCesar = codCesar + nuevaLetra;
            }

            Files.writeString(Paths.get(leerSalida), codCesar);
            System.out.println("String procesado: "+ frase + "  resultado codificado:" +codCesar);

        }
        else if(Objects.equals(args[0], "decodificacion")){
            String frase = Files.readAllLines(Paths.get(leerEntrada)).get(0);
            String abecedario = " abcdefghijklmnopqrstuvwxyz";
            String codCesar = "";
            int posicion;
            int nuevaPosicion;
            char letra;
            char nuevaLetra;

            for (int t = 0; t < frase.length(); t++) {
                letra = frase.charAt(t);
                posicion = abecedario.indexOf(letra);
                nuevaPosicion = (posicion - (Integer.parseInt(args[1]) * -1) ) % abecedario.length();
                nuevaLetra = abecedario.charAt(nuevaPosicion);
                codCesar = codCesar + nuevaLetra;
            }

            Files.writeString(Paths.get(leerSalida), codCesar);
            System.out.println("String procesado: "+ frase + "  resultado decodificado:" +codCesar);
        }

    }
}
