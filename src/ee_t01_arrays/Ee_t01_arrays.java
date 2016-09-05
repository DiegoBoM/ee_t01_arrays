/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t01_arrays;

/**
 *
 * @author Diego Bolaños Miguel
 */
import java.io.*;
import java.util.*;
public class Ee_t01_arrays {
   String nombre;//variable que guarda el nombre del archivo a leer
   public Ee_t01_arrays(){
       
   }
    public void leer(String nombre) {//se introduce la direccion del archivo que se va abrir
        ArrayList<String> archivo = new ArrayList<String>(); //creacion del arraylist
        int conta=-1;//declaracion del contador
        String s;
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream(nombre);
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                StringTokenizer st = new StringTokenizer (strLinea);
                archivo.add(strLinea);//se agraga la linea del archivo al arraylist
                conta++;//el contador se incrementa
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        //se imprime el contenido del archivo
        Iterator<String> it = archivo.iterator();
        System.out.println("ENTRADA:");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //se imprime el archivo en forma descendente
        System.out.println("");
        System.out.println("SALIDA:");
        for(int x=conta;x>0;x--){
            s=archivo.get(x);
            System.out.println(""+s);
        }

    }

    /**
     * @param args the command line arguments
     */
    //metodo main
    public static void main(String[] args) {
        Ee_t01_arrays a = new Ee_t01_arrays();
        a.leer("diego.txt");//la direccion del archivo va en los parametros
        // TODO code application logic here
    }
    
}
