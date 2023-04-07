import org.w3c.dom.ls.LSOutput;

public class Aplicacion {

    int fila, columna, conteo , posicionX, posicionY;;

    public static void main(String[] args) {

        Aplicacion ap = new Aplicacion();

    }

    public Aplicacion(){


        int fila, columna, par;
        fila = 5;
        columna = 5;
        par = 1;
        int[][] matriz = new int[fila][columna];

        //inicia en 0, y//2
        posicionX = 0 ;
        posicionY= columna / 2;


        //llenar matriz

        matriz[posicionX][posicionY] = 1;

        for (conteo = 2 ; conteo <= (fila * columna); conteo++) {

            par++;

            if (par > fila) {
                posicionX += 1 ;
                par = 1;
            }
            else {

                posicionX -- ; //descuento en x

                if (posicionX < 0) {
                    posicionX = fila - 1;

                }

                posicionY ++; //aumento en y

                if (posicionY > columna -1 ) {
                    posicionY = 0;

                }

                }

                matriz[posicionX][posicionY] = conteo;
            }

        for (int i = 0; i < fila  ; i++) {

            for (int j = 0; j < columna  ; j++) {

                System.out.print(matriz[i][j] + "   ");

            }
            System.out.println();

        }


    }


}
