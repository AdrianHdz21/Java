package craps;
import java.util.Random;

public class Craps2 {
   //Variables globales importantes para el proceso
   private Random numerosAleatorios = new Random(); //Crea un generador de números aleatorios para usarlo en el método tirarDado
   private enum Estado {CONTINUA, GANO, PERDIO };

   //Constantes que representan tiros comunes del dado
   private final static int DOS_UNOS = 2;//PIERDES
   private final static int TRES = 3;    //PIERDES
   private final static int SIETE = 7;   //GANAS
   private final static int ONCE = 11;   //GANAS
   private final static int DOCE = 12;   //PIERDES

   //Ejecuta un juego de craps
   public void jugar()
   {
      int miPunto = 0; //Punto si no gana o pierde en el primer tiro
      Estado estadoJuego; //Puede contener CONTINUA, GANO o PERDIO

      int sumaDeDados = tirarDados(); //Primer tiro de los dados

      //Determina el estado del juego y el punto con base en el primer tiro
      switch ( sumaDeDados ) 
      {
         case SIETE: //Gana con 7 en el primer tiro         
         case ONCE: //Gana con 11 en el primer tiro 
            estadoJuego = Estado.GANO;
            VariablesG.jganot1++;
            break;
         case DOS_UNOS: //Pierde con 2 en el primer tiro
         case TRES: //Pierde con 3 en el primer tiro
         case DOCE: //Pierde con 12 en el primer tiro
            estadoJuego = Estado.PERDIO;
            VariablesG.jperdiot1++;
            break;
         default: //No ganó ni perdió, por lo que guarda el punto 
            estadoJuego = Estado.CONTINUA; //No ha terminado el juego
            miPunto = sumaDeDados; // guarda el punto  
            FCraps.ta_Datos.append("El punto es:" + miPunto + "\n" );
            switch(miPunto){
                case 4:
                    VariablesG.fsumdados[1]++;
                    break;
                case 5:
                    VariablesG.fsumdados[2]++;
                    break;
                case 6:
                    VariablesG.fsumdados[3]++;
                    break;
                case 8:
                    VariablesG.fsumdados[4]++;
                    break;
                case 9:
                    VariablesG.fsumdados[5]++;
                    break;
                case 10:
                    VariablesG.fsumdados[6]++;
                    break;
            }
            break; //Opcional al final del switch
      } //Fin de switch 

      //Mientras el juego no esté terminado
      while ( estadoJuego == Estado.CONTINUA ) //No GANO ni PERDIO
      { 
         sumaDeDados = tirarDados(); //Tira los dados de nuevo
         //Determina el estado del juego
         if ( sumaDeDados == miPunto ){//Gana haciendo un punto 
             VariablesG.puntomax++;
             estadoJuego = Estado.GANO;
            /* if(VariablesG.puntomax>VariablesG.maximo){
                 VariablesG.maximo=VariablesG.puntomax; 
             }*/
         }
         else
            if ( sumaDeDados == SIETE ){ //Pierde al tirar 7 antes del punto
               VariablesG.puntomin++;
               estadoJuego = Estado.PERDIO;
               /*if(VariablesG.puntomin<VariablesG.minimo){
                   VariablesG.minimo=VariablesG.puntomin;
               }*/
            }
      } //Fin de while 
      //Muestra mensaje de que ganó o perdió
      if ( estadoJuego == Estado.GANO )
         FCraps.ta_Datos.append("El jugador gana\n" + "----------------------------->Fin Ronda: " + FCraps.contador + "\n");
         else
         FCraps.ta_Datos.append("El jugador pierde\n" + "----------------------------->Fin Ronda: " + FCraps.contador + "\n");
   } //Fin del método jugar

   //Tira los dados, calcula la suma y muestra los resultados
   public int tirarDados()
   {
      //Elige valores aleatorios para los dados
      int dado1 = 1 + numerosAleatorios.nextInt( 6 ); //Primer tiro del dado
      switch(dado1){
          case 1:
              VariablesG.fdado1[1]++;
              break;
          case 2:
              VariablesG.fdado1[2]++;
              break;
          case 3:
              VariablesG.fdado1[3]++;
              break;
          case 4:
              VariablesG.fdado1[4]++;
              break;
          case 5:
              VariablesG.fdado1[5]++;
              break;
          case 6:
              VariablesG.fdado1[6]++;
              break;
      }
      int dado2 = 1 + numerosAleatorios.nextInt( 6 ); //Segundo tiro del dado
      switch(dado2){
          case 1:
              VariablesG.fdado2[1]++;              
              break;
          case 2:
              VariablesG.fdado2[2]++;    
              break;
          case 3:
              VariablesG.fdado2[3]++;    
              break;
          case 4:
              VariablesG.fdado2[4]++;    
              break;
          case 5:
              VariablesG.fdado2[5]++;    
              break;
          case 6:
              VariablesG.fdado2[6]++;    
              break;
      }
      int suma = dado1 + dado2; //Suma de los valores de los dados
      switch(suma){
          case 2:
              VariablesG.fcombdados[2]++;
              break;
          case 3:
              VariablesG.fcombdados[3]++;
              break;
          case 4:
              VariablesG.fcombdados[4]++;
              break;
          case 5:
              VariablesG.fcombdados[5]++;
              break;
          case 6:
              VariablesG.fcombdados[6]++;
              break;
          case 7:
              VariablesG.fcombdados[7]++;
              break;
          case 8:
              VariablesG.fcombdados[8]++;
              break;
          case 9:
              VariablesG.fcombdados[9]++;
              break;
          case 10:
              VariablesG.fcombdados[10]++;
              break;
          case 11:
              VariablesG.fcombdados[11]++;
              break;
          case 12:
              VariablesG.fcombdados[12]++;
              break;              
      }
      //Muestra los resultados de este tiro  "
      FCraps.ta_Datos.append("El jugador tiro: " + dado1 + " + " +  dado2 + " = " + suma + "\n");
      return suma; //Devuelve la suma de los dados  }
   } //Fin método tirarDados
   
   //Llama variables y muestra los resultados
   public void resultados(){
   //Impresion de resultados en el TextArea
   FCraps.ta_Datos.append("Se Jugaron: " + FCraps.contador + " Rondas En Total\n");
   FCraps.ta_Datos.append("Rondas ganadas con primer tiro: " + VariablesG.jganot1 + "\n");
   FCraps.ta_Datos.append("Rondas perdidas con primer tiro: " + VariablesG.jperdiot1 + "\n");
   FCraps.ta_Datos.append("Con punto juegos ganados: " + VariablesG.puntomax + "\n");
   FCraps.ta_Datos.append("Con punto juegos perdidos: " + VariablesG.puntomin + "\n");
   FCraps.ta_Datos.append("Frecuencia de combinacion de cara de dados:\n");
   FCraps.ta_Datos.append("\tCombinacion:"+ " 2 " + " 3 " + " 4 " + " 5 " + " 6 " + " 7 " + " 8 " + " 9 " + " 10 " + " 11 " + " 12 " + "\n");
   FCraps.ta_Datos.append("\t Frecuencia: " +   VariablesG.fcombdados[2] + "  " + VariablesG.fcombdados[3] + "  " + VariablesG.fcombdados[4] + "  " + VariablesG.fcombdados[5] + "  " + VariablesG.fcombdados[6] + "  " + VariablesG.fcombdados[7] + "  " + VariablesG.fcombdados[8] + "  " + VariablesG.fcombdados[9]+ "   " + VariablesG.fcombdados[10] + "   " + VariablesG.fcombdados[11] + "   " + VariablesG.fcombdados[12] + "\n");
   FCraps.ta_Datos.append("Frecuencia del punto:\n");
   FCraps.ta_Datos.append("\tCombinacion:" + " 4 " + " 5 " + " 6 " + " 8 " + " 9 " + " 10 " + "\n");
   FCraps.ta_Datos.append("\t Frecuencia: " + VariablesG.fsumdados[1] + "  " + VariablesG.fsumdados[2] + "  " +VariablesG.fsumdados[3] + "  " + VariablesG.fsumdados[4] + "  " + VariablesG.fsumdados[5] + "  " + VariablesG.fsumdados[6] + "\n");
   FCraps.ta_Datos.append("Frecuencia de caras Dado 1:\n");
   FCraps.ta_Datos.append("\t    Cara:" + " 1 " + " 2 " + " 3 " + " 4 " + " 5 " + " 6 " + "\n");
   FCraps.ta_Datos.append("\tCantidad:" + " " + VariablesG.fdado1[1] + "  " + VariablesG.fdado1[2] + "  " + VariablesG.fdado1[3] + "  " + VariablesG.fdado1[4] + "  " + VariablesG.fdado1[5] + "  " + VariablesG.fdado1[6] + "\n");   
   FCraps.ta_Datos.append("Frecuencia de caras Dado 2:\n");
   FCraps.ta_Datos.append("\t    Cara:" + " 1 " + " 2 " + " 3 " + " 4 " + " 5 " + " 6 " + "\n");
   FCraps.ta_Datos.append("\tCantidad:" + " " + VariablesG.fdado2[1] + "  " + VariablesG.fdado2[2] + "  " + VariablesG.fdado2[3] + "  " + VariablesG.fdado2[4] + "  " + VariablesG.fdado2[5] + "  " + VariablesG.fdado2[6] + "\n");   
   FCraps.ta_Datos.append("\nPara continuar tirando dados por favor limpie pantalla...");
   }
}
