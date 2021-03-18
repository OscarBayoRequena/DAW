
package recursos;

public class HerramientasArray {

    
    //<editor-fold desc="Métodos para el manejo de arrays de bytes" defaultstate="collapsed">
    
    static String muestraArrayBytes(byte[] array) {
        String matriz = "";

        for (int j = 0; j < array.length; j++) {
            matriz = matriz + array[j] + "\t";
        }

        return matriz;
    }

    static String muestraMatrizBytes(byte[][] array) {
        String matriz = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matriz = matriz + array[i][j] + "\t";
            }
            matriz = matriz + "\n";
        }
        return matriz;
    }
    
    static void aleatorizarArrayBytes(byte[] array, byte min, byte max) {
        for (int i = 0; i < array.length; i++) {   
            
                array[i] = (byte) (Math.random() * max - min);

        }
    }
    
    static void aleatorizarMatrizBytes(byte[][] array, byte min, byte max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (byte) (Math.random() * max - min);
            }
        }
    }

    static byte[][] hacerTraspuestaBytes(byte[][] array) {
        
        byte[][] traspuesta = new byte[array.length][array[array.length - 1].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                traspuesta[j][i] = array[i][j];
            }
        }
        return traspuesta;

    }

    //</editor-fold>
    
    //<editor-fold desc="Métodos para el manejo de arrays de shorts" defaultstate="collapsed">
    
    static String muestraArrayShort(short[] array) {
        String matriz = "";

        for (int j = 0; j < array.length; j++) {
            matriz = matriz + array[j] + "\t";
        }

        return matriz;
    }

    static String muestraMatrizShort(short[][] array) {
        String matriz = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matriz = matriz + array[i][j] + "\t";
            }
            matriz = matriz + "\n";
        }
        return matriz;
    }
    
    static void aleatorizarArrayShort(short[] array, short min, short max) {
        for (int i = 0; i < array.length; i++) {
            
                array[i] = (short) (Math.random() * max - min);
            
        }
    }
    
    static void aleatorizarMatrizShort(short[][] array, short min, short max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (short) (Math.random() * max - min);
            }
        }
    }

    static short[][] hacerTraspuestaShort(short[][] array) {
        
        short[][] traspuesta = new short[array.length][array[array.length - 1].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                traspuesta[j][i] = array[i][j];
            }
        }
        return traspuesta;

    }
    
    //</editor-fold>
    
    //<editor-fold desc="Métodos para el manejo de arrays de ints" defaultstate="collapsed">
    
    static String muestraArrayInt(int[] array) {
        String matriz = "";

        for (int j = 0; j < array.length; j++) {
            matriz = matriz + array[j] + "\t";
        }

        return matriz;
    }

    static String muestraMatrizInt(int[][] array) {
        String matriz = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matriz = matriz + array[i][j] + "\t";
            }
            matriz = matriz + "\n";
        }
        return matriz;
    }
    
    static void aleatorizarArrayInt(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            
                array[i] = (int) (Math.random() * max - min);
            
        }
    }
    
    static void aleatorizarMatrizInt(int[][] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * max - min);
            }
        }
    }
    
    static int[][] hacerTraspuestaInt(int[][] array) {
        
        int[][] traspuesta = new int[array.length][array[array.length - 1].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                traspuesta[j][i] = array[i][j];
            }
        }
        return traspuesta;

    }
    
    //</editor-fold>
        
    //<editor-fold desc="Métodos para el manejo de arrays de longs" defaultstate="collapsed">
    
    static String muestraArrayLong(long[] array) {
        String matriz = "";

        for (int j = 0; j < array.length; j++) {
            matriz = matriz + array[j] + "\t";
        }

        return matriz;
    }

    static String muestraMatrizLong(Long[][] array) {
        String matriz = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matriz = matriz + array[i][j] + "\t";
            }
            matriz = matriz + "\n";
        }
        return matriz;
    }
    
    static void aleatorizarArrayLong(long[] array, long min, long max) {
        for (int i = 0; i < array.length; i++) {
            
                array[i] = (long) (Math.random() * max - min);
            
        }
    }
    
    static void aleatorizarMatrizLong(long[][] array, long min, long max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (long) (Math.random() * max - min);
            }
        }
    }

    static long[][] hacerTraspuestaLong(long[][] array) {
        
        long[][] traspuesta = new long[array.length][array[array.length - 1].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                traspuesta[j][i] = array[i][j];
            }
        }
        return traspuesta;

    }
    
    //</editor-fold>

    //<editor-fold desc="Métodos para el manejo de arrays de Strings" defaultstate="collapsed">

    
    static String muestraArrayString(String[] array) {
        String matriz = "";

        for (int j = 0; j < array.length; j++) {
            matriz = matriz + array[j] + "\n";
        }

        return matriz;
    }

    static String muestraMatrizString(String[][] array) {
        String matriz = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matriz = matriz + array[i][j] + "\n";
            }
            matriz = matriz + "\n";
        }
        return matriz;
    }

    static String[][] hacerTraspuestaString(String[][] array) {
        
        String[][] traspuesta = new String[array.length][array[array.length - 1].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                traspuesta[j][i] = array[i][j];
            }
        }
        return traspuesta;

    }
    
    //</editor-fold>
    
    //<editor-fold desc="Métodos para el manejo de arrays de objetos" defaultstate="collapsed">

    
    static String muestraArrayObjetos(Object[] array) {
        String matriz = "";

        for (int j = 0; j < array.length; j++) {
            matriz = matriz + array[j] + "\n";
        }

        return matriz;
    }

    static String muestraMatrizObjetos(Object[][] array) {
        String matriz = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matriz = matriz + array[i][j] + "\n";
            }
            matriz = matriz + "\n";
        }
        return matriz;
    }

    static Object[][] hacerTraspuestaObjetos(Object[][] array) {
        
        Object[][] traspuesta = new Object[array.length][array[array.length - 1].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                traspuesta[j][i] = array[i][j];
            }
        }
        return traspuesta;

    }
    
    //</editor-fold>

}
