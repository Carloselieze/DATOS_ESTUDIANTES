/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class datos_estudiante {
private static String llave;
private static Scanner inputLlave;
private static Object consola;

    //MENU PRINCIPAL
    public static void main(String[] args) throws IOException {
         Scanner op = new Scanner(System.in);
        int opc, resp, respu;  
        do{
       System.out.println("-----ANÁLISIS DE DATOS DE ESTUDIANTES-------");
         System.out.println("");
         System.out.println("Ingrese la opcion que desee:");
         System.out.println("1. Ingreso de Datos");
         System.out.println("2. Análisis de Datos");
         System.out.println("3. Salir");
         System.out.println("Seleccione una opcion :");
         opc = op.nextInt();
         
         switch (opc){
             case 1 : 
                 System.out.println("--------------------------------------------");
                 MenuProductos();
                 
                 break;
             case 2 :
                 System.out.println("");
                 System.out.println("------ANÁLISIS DE DATOS DE ESTUDIANTE------");             
                 MenuBodega();
                 break;
             case 3 :
                 System.out.println("----------El programa se cerro----------");
                 System.exit(0);
                 break;  
        }
                    System.out.println("------------------------------------------");
                    System.out.println("Deseas regresar al Menú principal          ");
                    System.out.println("    1)SI                    2)NO         ");
                    System.out.println("------------------------------------------");
                    resp=op.nextInt();
        }
    while(resp==1);
    }

    public static void MenuProductos() throws IOException  { 
           Scanner op = new Scanner(System.in);
           int opc = 0;
           int respuesta = 0;
           do{
         System.out.println("------------INGRESO DE DATOS----------------");
         System.out.println("");
         System.out.println("Ingrese la opcion que desee:");
         System.out.println("1) Ingresar Datos del Estudiante");
         System.out.println("2) Regresa menu principal");
         System.out.println("Seleccione una opcion :");
         opc = op.nextInt();
         
         switch (opc){
             case 1 : 
                 System.out.println("*** Ingresar Datos ****");             
                 Scanner teclado = new Scanner(System.in);
                 
                 
                 System.out.println("Introduzca Datos");
                 
                 System.out.println("Introduzca su nombre");
                 String codigo = teclado.nextLine();
                 System.out.println("Introduzca su apellido");
                 String codigos = teclado.nextLine();
                 System.out.println("Ingrese el numero del carnet");
                 String codigoss = teclado.nextLine();
                 System.out.println("Ingrese su edad");
                 String codig = teclado.nextLine();
                 System.out.println("Ingrese el sexo");
                 String seco = teclado.nextLine();
                 System.out.println("Ingrese su carrera");
                 String carrera = teclado.nextLine();
                 System.out.println("Total de créditos obtenidos");
                 String creditos = teclado.nextLine();
                 System.out.println("Curso aprobado");
                 String clase = teclado.nextLine();
                 System.out.println("");
                 System.out.println("Listado de curso aprobado (los siguientes datos se deben ingresar por cada curso aprobado por el estudiante):");
                 System.out.println("semestre al que pertenece el curso");
                 String curso = teclado.nextLine();
                 System.out.println("nombre del curso");
                 String cursos = teclado.nextLine();
                 System.out.println("código de curso");
                 String cos = teclado.nextLine();
                 System.out.println("zona obtenida por el estudiante");
                 String estudian = teclado.nextLine();
                 System.out.println("nota de examen final obtenida por el estudiante");
                 String nota = teclado.nextLine();
                 System.out.println("fecha aprobación del curso");
                 String fecha = teclado.nextLine();
                 System.out.println("");
                 System.out.println("Listado de curso reprobado (los siguientes datos se deben ingresar por cada curso reprobado por el estudiante):");
                 System.out.println("semestre al que pertenece el curso");
                 String co = teclado.nextLine();
                 System.out.println("nombre del curso");
                 String cursoss = teclado.nextLine();
                 System.out.println("código de curso");
                 String clases = teclado.nextLine();
                 System.out.println("zona obtenida por el estudiante");
                 String zana = teclado.nextLine();
                 System.out.println("nota de examen final obtenida por el estudiante");
                 String zona = teclado.nextLine();
                 System.out.println("fecha reprobación del curso");
                 String fechas = teclado.nextLine();
                 
                 System.out.println("nombre;_____________________"+codigo);
                 System.out.println("apellido;___________________"+codigos);
                 System.out.println("No. de carnet_______________"+codigoss);
                 System.out.println("edad;_______________________"+codig);
                 System.out.println("sexo;_______________________"+seco);
                 System.out.println("carrera;____________________"+carrera);
                 System.out.println("creditos obtenidos;_________"+creditos);
                 System.out.println("");
                 System.out.println("--------CURSO APROBADO------------");
                 System.out.println("");
                 System.out.println("curso aprobado;_____________"+clase);
                 System.out.println("codigo del curso;___________"+cos);
                 System.out.println("zona obtenida del curso;____"+estudian);
                 System.out.println("nota examen final;__________"+nota);
                 System.out.println("fecha de aprobacion;________"+fecha);
                 System.out.println("");
                 System.out.println("--------CURSO REPROBADO------------");
                 System.out.println("");
                 System.out.println("curso reprobado;_____________"+cursoss);
                 System.out.println("codigo del curso;___________"+clases);
                 System.out.println("zona obtenida del curso;____"+zana);
                 System.out.println("nota examen final;__________"+zona);
                 System.out.println("fecha de reprobacion;________"+fechas);
                 
                 break;


             case 2:
                 
                 break;
        }
                    System.out.println("------------------------------------------");
                    System.out.println("Deseas regresar al Menú Principal         ");
                    System.out.println("    1)SI                    2)NO         ");
                    opc=op.nextInt(); 
           } while(respuesta==1);        
        }
   
    public static void MenuBodega() throws IOException  { 
           Scanner op = new Scanner(System.in);
           int opc ;
           int respuesta;
           do{
         System.out.println("-------------ANÁLISIS DE DATOS-----------------");
         System.out.println("");
         System.out.println("1) Datos Personales del Estudiante:");
         System.out.println("2) Cantidad de Estudiantes M y F");
         System.out.println("3) Mejor promedio de Cada Carrera");
         System.out.println("4) Datos académicos de estudiantes");
         System.out.println("5) Constancia de Cursos Aprobados");
         System.out.println("6) Salir");         
         System.out.println("Seleccione una opcion:");         
         opc = op.nextInt();
         
         switch (opc){
             case 1 : 
                 System.out.println("*** DATOS PERSONALES ****");
                 MenuBodega();
                 break;
             case 2 :
                 System.out.println("*** CANTIDAD DE ESTUDIANTES ****");             
                      
                     opc = op.nextInt();
                     switch(opc){
                         case 1:
                             MenuBodega();
                             break;
                         case 2 :
                             MenuBodega();
                             break;
                         case 3 : 
                             break;
                     }
                 break;
             case 3 :
                 System.out.println("*** Mejor promedio de Cada Carrera ****");
                 MenuBodega();
                 break;  
             case 4:
                 System.out.println("***Datos académicos de estudiantes***");
                 MenuBodega();
                 break;
             case 5:
                 break;
             case 6:
                 System.out.println("----------El programa se cerro----------");
                 System.exit(0);
                 break;      
        }
                    System.out.println("------------------------------------------");
                    System.out.println("Deseas regresar al Menú Estudiante ");
                    System.out.println("    1)SI                    2)NO         ");
                    System.out.println("------------------------------------------");
                    opc=op.nextInt(); 
           } while(opc==0);        
        }     
}