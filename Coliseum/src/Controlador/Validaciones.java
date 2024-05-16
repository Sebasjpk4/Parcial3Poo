package Controlador;

/**
 *
 * @author Sebas
 */
public class Validaciones {

    public static int RedondearMinutos(String minuto) {
        int m = 0;

        try {
            m = Integer.parseInt(minuto);
        } catch (Exception e) {
            System.out.println("el dato tiene que ser un numero");
        }
        if (m < 30) {
            m = 0;
        } else if (m >= 30) {
            m = 30;
        }
        return m;
    }

    public static String Elegir(int h) {
        String t;
        switch (h) {
            case 1:
                t = "1 hora";
                return t;

            case 2:
                t = "2 horas";
                return t;

            case 3:
                t = "3 horas";
                return t;

            case 4:
                t = "4 horas";
                return t;

            case 5:
                t = "5 horas";
                return t;

            case 6:
                t = "6 horas";
                return t;

            case 12:
                t = "12 horas";
                return t;

            case 24:
                t = "Todo el dia";
                return t;

            default:
                t = "";
                return t;
        }
    }

}
