import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PruebasShould {

    @Test
    public void allow_void_expresion(){

        assertThat(2+3).isEqualTo(5);
    }

    @Test
    public void salir_un_numero_elegido_de_una_cifra(){

         String[] cero = new String[] {
                " _ ",
                "| |",
                "|_|"
        };

         int solucion = -1;
         //for (int i = 0; i< cero.length; i++) {
        if (cero[0].equals(" _ ")) {
            if (cero[1].equals("| |")) {
                solucion = 0;
            }
        }

        // }

        assertThat(solucion).isEqualTo(0);
    }

    @Test
    public void salir_un_numero_elegido_de_una_cifra_el_8(){

        String[] cero = new String[] {
                " _ ",
                "|_|",
                "|_|"
        };

        int solucion = -1;
        //for (int i = 0; i< cero.length; i++) {
        if (cero[0].equals(" _ ")) {
            if (cero[1].equals("| |")) {
                solucion = 0;
            } else if(cero[1].equals(" _|")) {
                if (cero[2].equals(" _|")) {
                    solucion = 3;
                } else {
                    solucion = 2;
                }
            } else if(cero[1].equals("|_ ")) {
                if (cero[2].equals(" _|")) {
                    solucion = 5;
                } else {
                    solucion = 6;
                }
            } else if(cero[1].equals("|_|")) {
                if (cero[2].equals("|_|")) {
                    solucion = 8;
                } else {
                    solucion = 9;
                }
            } else {
                solucion = 7;
            }
        } else {
            if (cero[1].equals("  |")) {
                solucion = 1;
            }
        }

        // }

        assertThat(solucion).isEqualTo(8);
    }

    @Test
    public void salir_un_numero_elegido_de_una_cifra_el_3(){

        String[] cero = new String[] {
                " _ ",
                " _|",
                " _|"
        };

        int solucion = -1;
        //for (int i = 0; i< cero.length; i++) {
        if (cero[0].equals(" _ ")) {
            if (cero[1].equals("| |")) {
                solucion = 0;
            } else if(cero[1].equals(" _|")) {
                if (cero[2].equals(" _|")) {
                    solucion = 3;
                } else {
                    solucion = 2;
                }
            } else if(cero[1].equals("|_ ")) {
                if (cero[2].equals(" _|")) {
                    solucion = 5;
                } else {
                    solucion = 6;
                }
            } else if(cero[1].equals("|_|")) {
                if (cero[2].equals("|_|")) {
                    solucion = 8;
                } else {
                    solucion = 9;
                }
            } else {
                solucion = 7;
            }
        } else {
            if (cero[1].equals("  |")) {
                solucion = 1;
            }
        }

        // }

        assertThat(solucion).isEqualTo(3);
    }

    @Test
    public void salir_un_numero_elegido_de_una_cifra_el_5(){

        String[] numerito = new String[] {
                " _ ",
                "|_ ",
                " _|"
        };

        BankOCR bankOCR = new BankOCR();
        String numero = bankOCR.sacarNumeros(numerito);

        assertThat(numero).isEqualTo("5");
    }

    @Test
    public void salir_un_numero_elegido_de_una_cifra_el_53(){

        String[] numerito = new String[] {
                " _  _ ",
                "|_  _|",
                " _| _|"
        };

        BankOCR bankOCR = new BankOCR();
        String numero = bankOCR.sacarNumeros(numerito);

        assertThat(numero).isEqualTo("53");
    }

}
