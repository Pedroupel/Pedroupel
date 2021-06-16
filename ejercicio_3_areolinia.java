//Autor: Pedro Pastran
//Version 0.1
//fecha 16/06/2021

import java.util.Scanner;//importando utilidad Scanner
import java.io.*;//inicio
   public class ejercicio_3_areolinia
   {// inicio clase
      public static void main (String args[])
      {//inicio cuerpo
      int pasajeros=0;//variable guarda cantidad pasajeros por registro
      int pasajerosAvensa=0;//variable guarda cantidad de pasajeros avensa
      int pasajerosAreopostal=0;//variable guarda cantidad de pasajeros areopostal
      int pasajerosZuliana=0;//variable guarda cantidad de pasajeros zuliana
      int pasajerosAserca=0;//variable guarda cantidad de pasajeros aserca
      int totalPasajeros=0;//variable guarda total pasajeros arepuerto
      int ciclo=1;//variable controla el ciclo while
      int numeroVuelo=0;//variable guarda el numero vuelo asignado
      int cantidadInternacional=0;//variable guarda cantidad vuelos internacionales
      int cantidadNacional=0;//variable guarda cantidad vuelos nacionales
      int conversionRespuesta=3;//variable guarda respuesta conversion control while
      String respuesta="";//variable guarda respuesta string para conversiones
      String horaSalida="";//variable guarda hora salida vuelo asignada
      int lineaAerea=0;//variable guarda respuesta linea aeria asignada
      int tipoVuelo=0;//variable guarda respuesta tipo vuelo asignado
      String destino="";//variable guarda respuesta destino asignada
      String respuestaVuelo="";//variable guarda respuesta string tipo vuelo
      String respuestaLinea="";//variable guarda respuesta string liena aeria
      String mayoriaVuelos="";//variable guarda respuesta a mayoria de vuelos realizados
      Scanner s1 = new Scanner(System.in);//escaner pregunta de ciclo while
      Scanner s2 = new Scanner(System.in);//escaner pregunta hora vuelo
      Scanner s3 = new Scanner(System.in);//escaner pregunta numero vuelo
      Scanner s4 = new Scanner(System.in);//escaner pregunta linea aerea
      Scanner s5 = new Scanner(System.in);//escaner tipo de vuelo
      Scanner s6 = new Scanner(System.in);//escaner pasajeros
      Scanner s7 = new Scanner(System.in);//escaner destino
         
         while (ciclo == 1)
         {//inicio while
         
            System.out.println("");
            System.out.println("¿DESEA AGREGAR UN NUEVO VUELO?");
            System.out.println("CONTESTE SOLO USANDO NUMEROS");
            System.out.println("");
            System.out.println("SI : 1 y NO : 0");
            respuesta = s1.nextLine();
            conversionRespuesta = Integer.parseInt(respuesta);
            
            if (conversionRespuesta==1)
            {//inicio if principal
            
               System.out.println("");
               System.out.println("ingrese hora de salida del vuelo");
               horaSalida = s2.nextLine();
               
               System.out.println("");
               System.out.println("indique el numero del vuelo");
               respuesta = s3.nextLine();
               numeroVuelo = Integer.parseInt(respuesta);
               
               System.out.println("");
               System.out.println("indique la linea aerea");
               System.out.println("CONTESTE SOLO USANDO NUMEROS");
               System.out.println("");
               System.out.println("AVENSA: 1|AREOPOSTAL: 2|ZULIANA: 3|ASERCA: 4");
               respuesta = s4.nextLine();
               lineaAerea = Integer.parseInt(respuesta);
                             
               System.out.println("");
               System.out.println("indique el tipo de vuelo");
               System.out.println("CONTESTE SOLO USANDO NUMEROS");
               System.out.println("");
               System.out.println("NACIONAL: 1|INTERNACIONAL: 2|");
               respuesta = s5.nextLine();
               tipoVuelo= Integer.parseInt(respuesta);
               
               System.out.println("");
               System.out.println("indique cantidad de pasajeros en el vuelo");
               respuesta = s6.nextLine();
               pasajeros= Integer.parseInt(respuesta);
               
               System.out.println("");
               System.out.println("indique el destino del vuelo");
               destino = s7.nextLine();
               
               if (lineaAerea==1)
               {//inicio if linea avensa
                  respuestaLinea="Avensa";
                  pasajerosAvensa=pasajerosAvensa+pasajeros;//suma consecutiva de pasajeros de esta linea   
               }//cierre if linea avensa
               
               if (lineaAerea==2)
               {//inicio if linea areopostal
                  respuestaLinea="Areopostal";
                  pasajerosAreopostal=pasajerosAreopostal+pasajeros;//suma consecutiva de pasajeros de esta linea 
               }//cierre if linea areopostal
               
               if (lineaAerea==3)
               {//inicio if linea zuliana
                  respuestaLinea="Zuliana";
                  pasajerosZuliana=pasajerosZuliana+pasajeros;//suma consecutiva de pasajeros de esta linea 
               }//cierre if linea suliana
               
               if (lineaAerea==4)
               {//inicio if linea aserca
                  respuestaLinea="Aserca";
                  pasajerosAserca=pasajerosAserca+pasajeros;//suma consecutiva de pasajeros de esta linea   
               }//cierre if linea aserca
               
               if (tipoVuelo==1)
               {//inicio if vuelo nacional
                  respuestaVuelo="Nacional";
                  cantidadNacional=cantidadNacional+1;//suma consecutiva cantidad de tipo de vuelo   
               }//cierre if vuelo nacional
               
               if (tipoVuelo==2)
               {//inicio if internacional
                  respuestaVuelo="Internacional"; 
                  cantidadInternacional=cantidadInternacional+1;//suma consecutiva cantidad de tipo de vuelo  
               }//cierre if internacional
               
               System.out.println("");
               System.out.println("DATOS REGISTRADOS");
               System.out.println("");
               System.out.println("Hora de Salida: "+horaSalida);
               System.out.println("Numero de Vuelo: "+numeroVuelo);
               System.out.println("Linea Aerea: "+respuestaLinea);
               System.out.println("Destino: "+destino);
               System.out.println("Tipo de Vuelo: "+respuestaVuelo);
               System.out.println("numero de pasajeros : "+pasajeros);
               
               

            }//cierre if principal
            else
            {//inicio else principal
               ciclo=0;//cierre del ciclo while
            }//cierre else principal
                        
         }//cierre while
         
      if (cantidadNacional>cantidadInternacional)
      {//inicio if mayor vuelo
        mayoriaVuelos="Nacional";  
      }//cierre if mayor vuelo
               
      if (cantidadNacional<cantidadInternacional)
      {//inicio if menor vuelo
        mayoriaVuelos="Internacional";  
      }//cierre if menor vuelo
               
      if (cantidadNacional==cantidadInternacional)
      {//inicio if igual vuelo
         mayoriaVuelos="Salieron la misma Cantidad de Vuelos";  
      }//cierre if igual vuelo
      
      totalPasajeros=pasajerosAvensa+pasajerosAreopostal+pasajerosZuliana+pasajerosAserca;//suma total de pasajeros que salieron del areopuesto

         
      System.out.println("");
      System.out.println("FINALIZANDO RESGISTROS");
      System.out.println("");
      System.out.println("Cantidad de pasajeros por cada Vuelo");
      System.out.println("Avensa: "+pasajerosAvensa);
      System.out.println("Areopostal: "+pasajerosAreopostal);
      System.out.println("Zuliana: "+pasajerosZuliana);
      System.out.println("Aserca: "+pasajerosAserca);
      System.out.println("");
      System.out.println("Total de vuelos Internacionales: "+cantidadInternacional);
      System.out.println("Total de vuelos Nacionales: "+cantidadNacional);
      System.out.println("");
      System.out.println("Tipo de Vuelo con Mayor numero de vuelos: "+mayoriaVuelos);
      System.out.println("");
      System.out.println("Total de Pasajeros que Salieron del Areopuerto: "+totalPasajeros);
        

      }//cierre cuerpo
   }//cierre class