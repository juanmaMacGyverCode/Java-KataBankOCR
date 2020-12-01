public class BankOCR {

    public String sacarNumeros(String[] numero) {

        int solucion = -1;
        for (int i = 0; i< numero.length; i++) {
            if (numero[0].equals(" _ ")) {
                if (numero[1].equals("| |")) {
                    solucion = 0;
                } else if (numero[1].equals(" _|")) {
                    if (numero[2].equals(" _|")) {
                        solucion = 3;
                    } else {
                        solucion = 2;
                    }
                } else if (numero[1].equals("|_ ")) {
                    if (numero[2].equals(" _|")) {
                        solucion = 5;
                    } else {
                        solucion = 6;
                    }
                } else if (numero[1].equals("|_|")) {
                    if (numero[2].equals("|_|")) {
                        solucion = 8;
                    } else {
                        solucion = 9;
                    }
                } else {
                    solucion = 7;
                }
            } else {
                if (numero[1].equals("  |")) {
                    solucion = 1;
                }
            }
        }
        return ""+solucion;
    }
}
