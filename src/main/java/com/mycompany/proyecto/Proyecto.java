/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import mundo.Alumno;
import java.util.ArrayList;


/**
 *
 * @author Nicolás.
 */
public class Proyecto {

    public static void main(String[] args)throws IOException {
        
        //Opción "Scanner" para guardar la opción seleccionada por el usuario.
        Scanner lector= new Scanner(System.in);
        
        //Opción bandera para poder finalizar con gusto el programa.
        boolean activo=true;
        ArrayList<Alumno> misAlumnos = new ArrayList<>();
        //Se despeglará el menú principal de opciones que aparecerá en la pantalla principal.
        leerArchivo(misAlumnos);
        
        do{
            interfaz();
        
        int opcion= lector.nextInt();
        lector.nextLine();
        //Se despliega el menú principal "lector" para el registro de las variables.
            switch (opcion) {
                case 1:
                    
                    insertaElAlumno(misAlumnos, lector);
                    escribirEnArchivo(misAlumnos);
                    
                    break;
                case 2:
                     
                    elimnarElAlumno(misAlumnos, lector);
                    escribirEnArchivo(misAlumnos);
                    
                    break;
                case 3:
                    
                    modificarElAlumno(misAlumnos, lector);
                    escribirEnArchivo(misAlumnos);
                    
                    break;
                case 4:
                    
                    mostrarElAlumno(misAlumnos, lector);
                    escribirEnArchivo(misAlumnos);
                    
                    break;
                case 5:
                    //Se activa la opción marcada como "Finalización" dandole el nuevo comienzo al código.
                     System.out.println("El proceso ha finalizado.");
                    activo = false;

                    break;
                default:
                    System.out.println("Selecciona una de las opciones que hay en el menú");
                    break;
            }
        }
        while (activo);           
    }
    public static void interfaz (){
        System.out.println("Enseguida se desplegará el menú solicitado");
        System.out.println("======Seleccione una opción valida======");
        System.out.println("1. Insertar alumno");
        System.out.println("2. Eliminar alumno");
        System.out.println("3. Modificar alumno");
        System.out.println("4. Consultar alumno");
        System.out.println("5. Finalizar sistema");
        System.out.println("======Opciones validas hasta el numeral 5======");
        
    }
    
    public static void insertaElAlumno(ArrayList<Alumno> misAlumnos,Scanner lector) {
        System.out.println("Inserta el nombre del alumno");
                    String nombre= lector.next();
                    
                    System.out.println("Inserta el apellido del alumno");
                    String apellido= lector.next();
                    
                    System.out.println("Inserta la cedula del alumno");
                    float cedula= lector.nextFloat();
                    
                     System.out.println("Inserta el correo del alumno");
                    String correo= lector.next();
                    
                    System.out.println("Inserta el celular del alumno");
                    float celular= lector.nextFloat();
                    
                    System.out.println("Inserta el semestre del alumno");
                    int semestre= lector.nextInt();
                   
                    Alumno a= new Alumno();
                    //Se crea un objeto con el fin de así guardar la información de un alumno.
                    //se crea un objeto para guardar la informacion de un alumno.
                    
                    a.setNombre(nombre);
                    a.setApellido(apellido);
                    a.setCedula(cedula);
                    a.setCorreo(correo);
                    a.setCelular(celular);
                     a.setSemestre(semestre);
                    
                    
                    //Se agrega el valor del objeto al listArray.
                    misAlumnos.add(a);
    }
    
    public static void elimnarElAlumno(ArrayList<Alumno> misAlumnos,Scanner lector) {
        if (misAlumnos.isEmpty()){
                        System.out.println("No existen alumnos registrados.");
                    }else{
                    System.out.println("Ingresé la cedula del alumno que desea eliminar:");
                    int cedulaDelete = lector.nextInt();
                    
                    // Variable util para saber si se encontró al alumno.
                    boolean alumnoEncontrado = false; 
                    
                   
                    for (Alumno alumno : misAlumnos) {
                        if (alumno.getCedula() == cedulaDelete) {
                            // Se encontró al alumno mediante la cedula.
                            alumnoEncontrado = true; 
                            

                            // Remueve al alumno del ArrayList
                            misAlumnos.remove(alumno);
                            
                        // Salir del bucle, ya que se eliminó al alumno con exíto.
                            System.out.println("Se ha eliminado al alumno con exíto de los registros.");
                            break; 
                        // Finalización del caso número 2.            
                        }
                    }
                }
    }
    
    public static void modificarElAlumno(ArrayList<Alumno> misAlumnos,Scanner lector) {
        if (misAlumnos.isEmpty()){
                        System.out.println("No hay alumnos registrados.");
                    }else{
                    System.out.println("Ingrese cedula del alumno que quiere modificar.");
                    float cedulaModificar = lector.nextFloat();

                    boolean alumnoEncontrado = false; 
                    // Variable util para saber si se encontró al alumno.

                    for (Alumno alumno : misAlumnos) {
                        if (alumno.getCedula() == cedulaModificar) {
                            
                            // Se encontró al alumno mediante la cedula.
                            alumnoEncontrado = true; 
                            
                            //Se desplegará el menú para la modificación del alumno.
                            
                            
                            
                            System.out.println("Ingrese el nuevo nombre:");
                            String nuevoNombre = lector.nextLine();
                            
                            
                            System.out.println("Ingrese el nuevo apellido:");
                            String nuevoApellido = lector.nextLine();
                            
                            
                            System.out.println("Ingrese la nueva cedula:");
                            float nuevaCedula= lector.nextFloat();
                            lector.nextLine();
                            
                            System.out.println("Ingrese el nuevo correo:");
                            String nuevoCorreo = lector.nextLine();
                            
                            System.out.println("Ingrese el nuevo celular:");
                            float nuevoCelular= lector.nextFloat();
                            lector.nextLine();
                            
                            System.out.println("Ingrese el nuevo semestre:");
                            int nuevoSemestre= lector.nextInt();
                            
                        
                            
                            // Funcion para la actualización de la información del alumno.
                            
                            alumno.setNombre(nuevoNombre);
                            alumno.setApellido(nuevoApellido);
                            alumno.setCedula(nuevaCedula);
                            alumno.setCorreo(nuevoCorreo);
                            alumno.setCelular(nuevoCelular);
                            alumno.setSemestre(nuevoSemestre);
                           

                            System.out.println("La información del alumno ha sido modificada con exíto.");
                            break;
                            //Finalización del caso 3 (Modificación).
                        }
                    }
                }
    }
    
    public static void mostrarElAlumno(ArrayList<Alumno> misAlumnos,Scanner lector) {
        //Indicará los datos del alumno en un listado, con la iniciación de la revisión de si hay registro.
                    
                    if (misAlumnos.isEmpty()){
                        System.out.println("Todavia no hay alumnos registrados.");
                    }else{
                        
                    //Se desplegará el menú de los alumnos registrados.
                    System.out.println("Alumnos registrados:");
                    for (Alumno alumno : misAlumnos){
                        System.out.println("-----------------------------------");   
                        System.out.println("Nombre: " + alumno.getNombre());
                        System.out.println("Apellido: "+ alumno.getApellido());
                        System.out.println("Cedula: "+ alumno.getCedula());
                        System.out.println("Correo: "+ alumno.getCorreo());
                        System.out.println(" Celular: "+ alumno.getCelular());
                        System.out.println("Semestre: "+ alumno.getSemestre());
                        System.out.println("-----------------------------------"); 
                        }  
                    }
                    //Finalización del caso 4(Registro).
    }
    
    public static void escribirEnArchivo(ArrayList<Alumno> misAlumnos)throws FileNotFoundException {
        try {
        // Ruta del archivo a escribir (puede ajustarse según tus necesidades)
        File archivo = new File("./data/Reporte.txt");

        // Crear PrintWriter para escribir en el archivo
        PrintWriter pluma = new PrintWriter(archivo);

        for (Alumno alumno : misAlumnos) {
            String infoEstudiante = alumno.getNombre() + "," + alumno.getApellido() + ","
                    + alumno.getCedula() + "," + alumno.getCorreo() + "," + alumno.getCelular() + ","
                    + alumno.getSemestre();

            pluma.println(infoEstudiante);
        }
        pluma.close();
    } catch (IOException e) {
        // Manejar la excepción si ocurre algún error de escritura
        e.printStackTrace();
    }

    }
    
    public static void leerArchivo(ArrayList<Alumno> misAlumnos)throws FileNotFoundException, IOException {
        try {
          
        File archivo = new File ("./data/Reporte.txt");
            
            FileReader jr = new FileReader (archivo);
            BufferedReader lector = new BufferedReader(jr);            
            String espacio;
            
            while ((espacio = lector.readLine()) != null) {
                String[] partes = espacio.split(",");
                String Nombre = partes[0];
                String Apellido = partes[1];
                float Cedula = Float.parseFloat(partes[2]);
                String Correo = partes[3];
                float Celular = Float.parseFloat(partes[4]);
                int Semestre = Integer.parseInt(partes[5]);
                
                Alumno alumno = new Alumno(Nombre,Apellido,Cedula,Correo,Celular,Semestre);
                misAlumnos.add(alumno);
            }
            
            lector.close();
            
        } catch (Exception e) {
        }
    }
}

