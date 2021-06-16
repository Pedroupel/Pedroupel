//Autor: Pedro Pastran
//Version 0.1
//fecha 15/06/2021

import java.util.Scanner;//importando utilidad Scanner
import java.io.*;//inicio
   public class ejercicio_2_reporte_upel
   {// inicio clase
      public static void main (String args[])
      {//inicio cuerpo
         int cedula=0;//variable guarda cedula
         int hijos=0;//variable guarda cantidad hijos
         int ciclo=1;//variable controla ciclo while
         int contador=0;//variable acumula conteo para sacar promedio
         int conversionRespuesta=3;//variable guarda conversion respuesta string a int
         final float sueldoBase=20000;//contante sueldo base
         final float prima=1500;//contante monto prima por hijo
         final int seguroSocial=4;//contante porcentaje seguro social
         final int impuesto=2;//contante porcentaje impuesto
         float promedio=0;//variable guarda suma de sueldos acumulados
         float promedioFinal=0;//variable guarda el promedio de sueldos
         float bonoHijos=0;//variable guarda cantidad prima por hijo
         float sueldoNeto=0;//variable guarda sueldo neto sin deducciones
         float deduccionSs=0;//variable guarda deducciones seguro social
         float deduccionIm=0;//variable guarda deducciones impuesto sobre la renta
         float total=0;//variable guarda el total a pagar con deducciones
         String decanato="";//variable guarda respuesta decanato
         String sexo="";//variable guarda respuesta genero
         String respuesta="";//varible guarda respuesta ciclo while
         Scanner s1 = new Scanner(System.in);//escanner pregunta ciclo while
         Scanner s2 = new Scanner(System.in);//escaner pregunta decanato
         Scanner s3 = new Scanner(System.in);//escaner pregunta cedula
         Scanner s4 = new Scanner(System.in);//escaner pregunta genero
         Scanner s5 = new Scanner(System.in);//escaner pregunta hijos
         
         while (ciclo == 1)
         {//inicio while
            System.out.println("¿DESEA INSCRIBIR UN NUEVO DOCENTE?");
            System.out.println("CONTESTE SOLO USANDO NUMEROS");
            System.out.println("");
            System.out.println("SI : 1 y NO : 0");
            respuesta = s1.nextLine();
            conversionRespuesta = Integer.parseInt(respuesta);
            
            if (conversionRespuesta == 1)
            {//inicio del if
            
               System.out.println("");
               System.out.println("Ingrese al decanato que pertenece");
               decanato = s2.nextLine();
               System.out.println("");
               System.out.println("Ingrese su cedula de identidad");
               respuesta = s3.nextLine();
               cedula = Integer.parseInt(respuesta);
               System.out.println("");
               System.out.println("Ingrese su Genero");
               sexo = s4.nextLine();
               System.out.println("");
               System.out.println("Ingrese la cantidad de hijos que tiene");
               respuesta = s5.nextLine();
               hijos = Integer.parseInt(respuesta);
               
               bonoHijos=prima*hijos;//calculo prima por hijos
               sueldoNeto=bonoHijos+sueldoBase;//suma de sueldo base y prima
               deduccionSs=(sueldoNeto*seguroSocial)/100;//sacando 4% de sueldo seguro social
               deduccionIm=(sueldoNeto*impuesto)/100;//sacando 2% de sueldo impuesto sobre la renta
               total=sueldoNeto-deduccionSs-deduccionIm;//calculando total a pagar con deducciones
               contador=contador+1;//contador que controla la cantidad de docentes ingresados
               promedio=promedio+total;//acumulador de sueldos para calcular promedio
               
               System.out.println("Procesando sueldo");
               System.out.println("");
               System.out.println("PERTENCIENTE AL DECANATO: "+decanato);
               System.out.println("CEDULA: "+cedula);
               System.out.println("GENERO: "+sexo);
               System.out.println("NUMERO DE HIJOS: "+hijos);
               System.out.println("SUELDO BASE: "+sueldoBase);
               System.out.println("");
               System.out.println("ASIGNACION PRIMA POR HIJOS "+bonoHijos);
               System.out.println("DEDUCCION SEGURO SOCIAL DEL 4% : "+deduccionSs);
               System.out.println("DECUCCION IMPUESTO SOBRE LA RENTA 2% : "+deduccionIm);
               System.out.println("");
               System.out.println("TOTAL A PAGAR: "+total);
               System.out.println("");
                                  
            }//cierre del if
            else
            {//inicio del else
            
               promedioFinal=promedio/contador;//calculando promedio de sueldos
               
               System.out.println("TERMINANDO LLENADO DE DATOS");
               System.out.println("");
               System.out.println("Cantidad de docentes en sistema: "+contador);
               System.out.println("");
               System.out.println("Cantidad de Dinero pagado en Sueldos de Docentes: "+promedio);
               System.out.println("");
               System.out.println("Promedio de Sueldos: "+promedioFinal);

               ciclo=0;//finalizador de ciclo
            }//cierre del else
            
         }//cierre while
        
        

      }//cierre cuerpo
   }//cierre class