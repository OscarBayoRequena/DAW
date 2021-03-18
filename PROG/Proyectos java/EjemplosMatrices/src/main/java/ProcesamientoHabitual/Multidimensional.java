package ProcesamientoHabitual;


public class Multidimensional {

    public static void main(String[] args) {

        int[][] enteros;  //Declaracion

        enteros = new int[4][5];  //Creacion
/*
        int[][][] enteros1 = new int[4][5][2];  //Creacion y Declaracion juntas

        int enteros2[][] = new int[4][5];  //Creacion y Declaracion juntas con formato alternativo 
        // corchetes despues del nombre.

        enteros[0][0] = 11;         //inicializando
        enteros[0][1] = 12;
        enteros[0][2] = 13;

        int[][] enteros3 = {{2, 3, 4, 6},
                            {1, 3, 5, 7}}; // Creo Declaro e inicializo a la vez.
  */      
        double[][] arrayIrregular =new double[4][];  //declaro y Creo el array
        arrayIrregular[0] =new double [4];           // inicializo el array
        arrayIrregular[1] =new double [3];
        arrayIrregular[2] =new double [2];
        arrayIrregular[3] =new double [1];
        
        double[][] arrayIrregular2 ={{2, 3, 4, 6},
                                     {1, 3, 5},
                                     {1, 3},
                                     {1} };           /* Creo Declaro e inicializo a la vez.
                                                          un array irregular */  
        
        
    //    inicializar(enteros);
    //    imprimir(enteros);
        inicializar(arrayIrregular);
        imprimir(arrayIrregular);

    }

  
    static void inicializar(double[][] paramArray) {
        
        for(int i= 0; i< paramArray.length; i++){
            for (int j = 0; j < paramArray[i].length; j++) {
                paramArray[i][j]= (Math.random()*100);
            }
        }
    }
    
    
    static void imprimir(double[][] paramArray) {
        System.out.print("col1\tcol2\tcol3\tcol4\n");
        for(int i= 0; i< paramArray.length; i++){
            for (int j = 0; j < paramArray[i].length; j++) {
                System.out.print(paramArray[i][j]+",\t ");
            }
            System.out.println("\n");
        }
    }
    

}//fin de la clase
