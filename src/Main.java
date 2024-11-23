import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in); int t = in.nextInt();

        while (t--> 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;


            for (int j = 0; j < n; j++) {
                result += (1 << j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
            /*
            Scanner in = new Scanner(System.in);

            int a;


            int t = in.nextInt();
            int r = 0;

            //s0 es estatica a=0 + n=1.b=2   = 2
            //cuadrado de un numero
            for (int i = 0 ; i<= t; i++){
                int a;
                r = (int)(Math.pow(2,i));
                System.out.println(r);
            }
            */
            /*
            for (int i = 0; i < t; i++ ){


                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();



                for (int c = 1; c <= n; c++){

                     r = r + ((a+z)*b) ;

                     z = c + c;

                     System.out.print(r + " ");
                }
            }

             */



           // in.close();



        /*
        //DECLARACION DE VARIABLES
        char[][] asientos = new char[10][10];
        boolean bandera = false;
        int fila = 0, asiento = 0;
        String pregAsientos;
        String verMapaAsientos;
        boolean asientoCorrecto = false;
        Scanner teclado = new Scanner(System.in);


        //CARGA DE LA MATRIZ DE ASIENTOS
        for (int f = 0; f < 10; f++){
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }


        System.out.println("***************BIENVENIDO AL SISTEMA DE RESERVAS DE ASIENTOS***************");

        while(bandera!=true){
            System.out.println("¿Desea ver los asientos disponibles? S SI, cualquier otra letra: NO");
            verMapaAsientos = teclado.next();
            if (verMapaAsientos.equalsIgnoreCase("S")){
                mapaAsientos(asientos);
            }

            //RESERVA DE ASIENTO
            while(asientoCorrecto != true){

                System.out.println("\nIngrese FILA y ASIENTO a reservar");
                System.out.println("Fila (entre 0 y 9): ");
                fila = teclado.nextInt();
                System.out.println("Asiento (entre 0 y 9): ");
                asiento = teclado.nextInt();

                if (fila >=0 && fila <=9){
                    if (asiento >=0 && asiento <=9){
                        asientoCorrecto = true;
                    }else {
                        System.out.println("El numero del asiento no es válido");
                    }
                }else{
                    System.out.println("El numero de fila no es válido");
                }
            }

            if (asientos[fila][asiento] == 'L'){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado exitosamente");
            }else {
                System.out.println("El asiento esta ocupado, elija otro por favor");
            }

            //Validar si quiere reservar otro asiento
            System.out.println("¿Desea finalizar la reserva de asientos? S=SI, Cualquier otra tecla NO");
            pregAsientos = teclado.next();
            if (pregAsientos.equalsIgnoreCase("S")){
                bandera = true;
                System.out.println("¡GRACIAS POR SU COMPRA!");
            }
            //se queda con los valores (8 5) fila y asiento por lo que asiento correcto queda true y se salta el while que valida si existen.
            // y en el if esta fila y asiento con los valores de (8 5) y valida como si estuviera ocupado
            asientoCorrecto = false;

        }
    }

    //Metodo "Procedimiento" para mostrar los asientos de manera grafica
    static void mapaAsientos(char asientos [][]){

        //recorrido de asientos
        for(int f=0;f<=9;f++){
            System.out.print(f + " ");
            for (int c=0;c<=9;c++){
                System.out.print("[" + asientos[f][c] + "]");
                System.out.print(c + " ");
            }
            System.out.println("");
        }

         */
    }
}






/*
        Suponer un sistema de reserva de asientos para un anfiteatro. El teatro cuenta
        con 10 filas de 10 asientos cada una. se necesita desarrollar un sistema
        (Sin uso de base de datos, únicamente manejo de datos de forma lógica), que
        permita llevar a cabo lo siguiente:

        1.- Cargar el "mapa" de las filas y asientos. Indicando con una "X" los
        asientos ocupados y con una "L" los asientos libres. Al iniciar el programa,
        todos los asientos deben estar libres.

        2.- Manejar la reserva de asientos contemplando que un asiento SOLO PUEDE SER
        RESERVADO si se encuentra en estado "L",  en caso de que esté en estado "X", se
        deberá permitir al comprador elegir otro asiento. Si esta en estado "L", debera
        pasar en automáticamente al estado "X".

        3.- Para finalizar el programa deberá ingrear un valor en particular. Contemplar
        que no existe una cantidad exacta de veces que el programa se pueda ejecutar.

        4.- Contemplar que SOLO EXISTEN 10 FILAS CON 10 ASIENTOS. No se pueden vender
        asientos fuera de esas numeraciones. No se permite "sobreventa".

        CONSIDERACIONES: No es necesaria implementación ni de IGU (Interfaz grafica),
        ni de BD (Base de datos). Se evaluara 100% el manejo lógico del desarrollo de
        la aplicación.

        EXTRA: En caso de que un cliente solicite visualizar cuáles son los asientos libres,
        el sistema debe permitir mostrar de forma gráfica el mapa de asientos. NO UTILIZAR IGU,
        para este caso. Utilizar UNICAMENTE lógica y la salida por cosola.

         */

        //Las variables estan dentro del main (son variables locales solo se pueden utilizar dentro de main)

        //DECLARACION DE VARIABLES
        //10 filas con 10 asientos
        //creación matriz de chars(letras) de 10 x 10
        /*
        char asientos [][]= new char[10][10]; //Inicializacion de matriz de char
        boolean bandera = false; //Bandera (centinela) para cambiar valor false => true
        int fila = 0, asiento = 0; //Variables para pedir al cliente los asientos
        String pregAsientos; //Variable para preguntar si quieres reservar mas asientos
        String verMapaAsientos;
        boolean asientoCorrecto = false;

        //Ingreso de datos
        Scanner teclado = new Scanner(System.in);

        //CARGA DE LA MATRIZ DE ASIENTOS
        //Recorrer filas
        for (int f = 0; f < 10; f++){
            //Recorrer columnas
            for (int c = 0; c < 10; c++) {
                //asignar la letra L a los asientos vacios
                //asientos en la posición fila de la columna, rellenar con L
                asientos[f][c] = 'L';
                //System.out.print(asientos[f][c]);

            }
            //System.out.println("");
        }


        //BIENVENIDA AL SISTEMA
        System.out.println("***************BIENVENIDO AL SISTEMA DE RESERVAS DE ASIENTOS***************");
        //Se puede preguntar cuantos boletos quiere y depende a esso seria el numero de repeticiones del ciclo de reserva "While"


        //RESERVA DE ASIENTOS
        //Ejecutar n cantidad de veces dependiendo a los asientos requeridos por el cliente
        //Bandera (centinela) para cambiar valor false => true
        while(bandera != true){ //Bandera sea distinta de true

            //VISUALIZACION DE MAPA DE ASIENTOS
            //Preguntar al cliente si quiere ver los asientos que estan diponibles
            System.out.println("¿Desea ver los asientos disponibles? S SI, cualquier otra letra: NO");
            verMapaAsientos = teclado.next(); //Recibe la respuesta de la pregunta

            //Evalua la respuesta del cliente y mustra de manera grafica la matriz de asientos
            if (verMapaAsientos.equalsIgnoreCase("S")){
                //Llamar al metodo de mostrar los asientos
                mapaAsientos(asientos);//llamar a traer la funcion creada en esta clase que muestra de manera grafica los asientos
            }

            //Problema con vectores y matricez

            //RESERVA DE ASIENTO

            while(asientoCorrecto != true){

                //Primero pedir la fila
                //Salto de linea
                System.out.println("\nIngrese FILA y ASIENTO a reservar");
                //No se puede sobrevender asientos por eso se indica el limite de fila y asientos
                System.out.println("Fila (entre 0 y 9): ");
                //funcion para recibir un numero entero
                fila = teclado.nextInt();

                //Posicion de fila y asiento(columna)
                //Segundo pedir el asiento
                System.out.println("Ingrese asiento a reservar");
                //No se puede sobrevender asientos por eso se indica el limite de fila y asientos
                System.out.println("Asiento (entre 0 y 9): ");
                asiento = teclado.nextInt();

                if (fila >=0 && fila <=9){
                    if (asiento >=0 && asiento <=9){
                        asientoCorrecto = true;
                    }else {
                        System.out.println("El numero del asiento no es valido");
                    }
                }else{
                    System.out.println("El numero de fila no es valido");
                }

            }
                                        //CHAR no es un objeto pero STRING si, el equals es para string cadena de caracteres
                                        //por eso no se puede utilizar equals ya que es una matriz de chars
                                        //Si la matriz se declarara con string si se usaria equals
            //verificar si el asiento esta disponible 'L' o si esta ocupado 'X'
            if (asientos[fila][asiento] == 'L'){
                //Se marca como reservado
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado exitosamente");
            }else {
                //El asiento no esta disponible
                System.out.println("El asiento esta ocupado, elija otro por favor");
            }

            //Validar si quiere reservar otro asiento
            System.out.println("¿Desea finalizar la reserva de asientos? S=SI, Cualquier otra tecla NO");
                                    //La funcion next devuelve palabra por palabra por separado de una cadena de texto, la funcion nextLine devuelve cada caracter en una linea de texto "osea linea de texto por linea"
            pregAsientos = teclado.next();

                            //Forma de comparar strings o
                            //A diferencia de equals, equalsIgnoreCase ignora si es mayusculas o minusculas el String que recibe
            if (pregAsientos.equalsIgnoreCase("S")){
                bandera = true;
                System.out.println("Gracias por su compra");
            }
        }
    }
    //procedimiento "METODO" para mostrar la fila y columna que es y los asientos vacios de cada una
    //Void cuando el metodo es un procedimiento y no retornara ningun valor, a diferencia de una funcion que si retorna "return"
                            //Se recibe como parametro la matriz ya que esta fuera del main la cual es una variable local
    //El STATIC se comparte con toda la clase, el metodo no va a cambiar
    static void mapaAsientos(char asientos [][]){

        //En java  se tiene que recorrer las posiciones para poder imprimirlas con el iterador del for

        //recorrido de asientos
        for(int f=0;f<=9;f++){
            System.out.print(f + " ");
            for (int c=0;c<=9;c++){

                System.out.print("[" + asientos[f][c] + "]");
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }
}









*/

        /*
        Matrices : Una matriz es un arreglo bidimensional, nesecita dos ïndices oara acceder a sus
        elementos. Graficamente podemos representar una matriz como una tabla de n filas y m columnas
        cuyos elementos son todos del mismo tipo.
        */

        /*
        //arreglo
        int arreglo [] = {1,2,3,4,5,6,7,8,9,10};

        for (int x = 0; x < 9; x++){
            System.out.print(arreglo[x]);
        }
        System.out.println("");
                //mattriz declara con los datos
        int matriz [][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < 3; i++){//numero de filas
            for (int j = 0; j <3; j++){//numero de columnas
                System.out.print(matriz[i][j]);
            }
            //Salto separador por filas
            System.out.println("");
        }
        */

        /*
        //matriz de numeros enteros
        int matrizz [][];
        int numerofilas, numeroColumnas, y = 0;

        numerofilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        numeroColumnas  =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matrizz = new int [numerofilas][numeroColumnas];

        for (int f = 0; f < numerofilas; f++){

            for (int c = 0; c < numeroColumnas; c++){

                matrizz [f][c] = y;
                System.out.print(matrizz[f][c] + " ");

                y++;
            }
            System.out.println("");
        }

        */

        /*
        //matriz de numeros enteros
        int matrizz [][];
        int numerofilas, numeroColumnas;

        Scanner teclado = new Scanner(System.in);

        numerofilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        numeroColumnas  =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        matrizz = new int [numerofilas][numeroColumnas];

        System.out.println("Digite los valores de la matriz: ");

        for (int f = 0; f < numerofilas; f++){

            for (int c = 0; c < numeroColumnas; c++){

                //Ingresar los valores en cada espacio de la matriz
                System.out.print("Matriz ["+ f +"]["+ c+ "]");
                matrizz[f][c] = teclado.nextInt();

                //System.out.print(matrizz[f][c] + " ");


            }
            //System.out.println("");
        }
        System.out.println("La matriz es: ");
        for (int f = 0; f < numerofilas; f++){

            for (int c = 0; c < numeroColumnas; c++){

                System.out.print(matrizz[f][c] + " ");


            }
            System.out.println("");
        }
        */

        /*
        int x, y = 0;
        System.out.println("Ingresa las cantidades: ");
        for (int i = 0; i <= 11; i++){
            Scanner teclado = new Scanner(System.in);

            x = teclado.nextInt();
            y = y + x;
        }
        System.out.println("la suma es: $" + y);
        //8615

        */












