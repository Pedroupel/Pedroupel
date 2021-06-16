//Autor: Pedro Pastran
//Version 0.1
//fecha 13/06/2021

import java.util.Scanner;//importando utilidad Scanner
import java.io.*;//inicio
   public class ejercicio_1_auto_encuestas
   {// inicio clase
      public static void main (String args[])
      {//inicio cuerpo
         int pan=0;//variable conteo votos harina pan
         int juana=0;//variable conteo votos harina juana
         int ambas=0;//variable conteo votos ambas harinas
         int ninguna=0;//variable conteo votos ninguna harina
         String respuesta="";//variable de respuestas de los scaner
         int conversionEncuesta = 3;//variable guarda conversion string a int pregunta cliclo while
         int conversionPan =3;//variable guarda conversion string a int pregunta harina pan
         int conversionJuana =3;//variable guarda conversion string a int pregunta harina juana
         int ciclo=1;//variable controla ciclo while
         int encuesta=0;//variable conteo cantidad encuestas realizadas
         float porcentajePAN;//variable guarda operacion porcentaje harina pan
         float porcentajeJUANA;//variable guarda operacion porcentaje harina juana
         float porcentajePANJUANA;//variable guarda operacion porcentaje ambas harinas
         float porcentajeNO;//variable guarda operacion porcentaje ninguna harina
         Scanner s1 = new Scanner(System.in);//escaner de ciclo while
         Scanner s2 = new Scanner(System.in);//escaner de harina pan
         Scanner s3 = new Scanner(System.in);//escaner de harina juana
        
         
         while (ciclo == 1)
         {//inicio while
            System.out.println("¿DESEA COMENZAR UNA NUEVA ENCUESTA?");
            System.out.println("CONTESTE SOLO USANDO NUMEROS");
            System.out.println("");
            System.out.println("SI : 1 y NO : 0");
            respuesta = s1.nextLine();
            conversionEncuesta = Integer.parseInt(respuesta);
           
            if (conversionEncuesta == 1) 
              {//inicio if encuesta
               encuesta=encuesta+1;
               System.out.println("");
               System.out.println("Usted Consume Harina PAN?");
               System.out.println("conteste usando solamente numeros");
               System.out.println("");
               System.out.println("SI : 1 y NO : 0");
               respuesta = s2.nextLine();
               conversionPan = Integer.parseInt(respuesta);
                  if (conversionPan == 1)
                  {//inicio if harina pan
                     pan=pan+1;
                     System.out.println(" ");
                     System.out.println("Respuesta Guardada");
                     System.out.println(" ");
                  }//cierre if harina pan
                  else
                  {//inicio else harina pan
                     System.out.println(" ");
                     System.out.println("Respuesta Guardada");
                     System.out.println(" ");
                  }//cierre else harina pan
               System.out.println("");
               System.out.println("Usted Consume Harina JUANA?");
               System.out.println("conteste usando solamente numeros");
               System.out.println("");
               System.out.println("SI : 1 y NO : 0");
               respuesta = s3.nextLine();
               conversionJuana = Integer.parseInt(respuesta);
                  if (conversionJuana == 1)
                  {//inicio if harina juana
                     juana=juana+1;
                     System.out.println(" ");
                     System.out.println("Respuesta Guardada");
                     System.out.println(" ");
                  }//cierre if harina juana
                  else
                  {//inicio else harina juana
                     System.out.println(" ");
                     System.out.println("Respuesta Guardada");
                     System.out.println(" ");
                  }//cierre else harina juana
                  if (conversionPan == 1 && conversionJuana == 1)
                  {//inicio if ambas harinas
                     ambas=ambas+1;
                  }//cierre if ambas harinas
                  if (conversionPan == 0 && conversionJuana == 0)
                  {//inicio if ninguna harina
                     ninguna=ninguna+1;
                  }//cierre if ninguna harina


              }//cierre if encuesta
              else
              {//inicio del else encuesta
               System.out.println(" ");
               System.out.println("Terminando proceso de encuestas");
               System.out.println(" ");
               ciclo=0;
              }//final else encuesta

         }//cierre while
         porcentajePAN=(pan*100)/encuesta;//operacion matematica porcentaje regla de 3
         System.out.println("");
         System.out.println("Consumidores Harina PAN : "+porcentajePAN+" %");
         System.out.println("");
         porcentajeJUANA=(juana*100)/encuesta;//operacion matematica porcentaje regla de 3
         System.out.println("");
         System.out.println("Consumidores Harina JUANA : "+porcentajeJUANA+" %");
         System.out.println("");
         porcentajePANJUANA=(ambas*100)/encuesta;//operacion matematica porcentaje regla de 3
         System.out.println("");
         System.out.println("Consumidores de ambas Harinas : "+porcentajePANJUANA+" %");
         System.out.println("");
         porcentajeNO=(ninguna*100)/encuesta;//operacion matematica porcentaje regla de 3
         System.out.println("");
         System.out.println("No consumen ninguna : "+porcentajeNO+" %");//operacion matematica porcentaje regla de 3
         System.out.println("");
                  
         
         System.out.println("Total Votos Harina PAN: "+pan);
         System.out.println("Total Votos Harina JUANA: "+juana);
         System.out.println("Total Votos Por Ambas: "+ambas);
         System.out.println("Total de Votos por Ninguna: "+ninguna);
         System.out.println("Total de Encuestas Realizadas: "+encuesta);

      }//cierre cuerpo
   }//cierre class