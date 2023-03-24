import java.util.Scanner;

/**
Delta Dragons Game */
public class Game
{
 public static void main(){
     int answer;
     System.out.println("Kakws irthes sto IEK Delta 360 ths patras. Eisai sthn kentrikh eisodo kai akous fones apo ton hmiorofo. Ti kaneis?");
     System.out.println("1-Fevgw pros to coffee island");
     System.out.println("2-Anevainw me to asanser");
     System.out.println("3-Anevainw me tis skales");
     System.out.println("Pata ton arithmo ths epiloghs sou");
     Scanner myObj = new Scanner (System.in);
     answer=myObj.nextInt();
     if (answer==1){
         System.out.println("Eisai flwros kai se efage enas drakos");
     }
     else if(answer==2){
         System.out.println("Anoigeis porta asanser mpaineis mesa kleinoun oi portes kai vlepeis dipla sou ton bobo pou einai Zombie. Ti kaneis?");
         System.out.println("1-Prospathw na tou milhsw");
     System.out.println("2-Ton varaw");
     System.out.println("3-Prospathw na vgw apo to asanser");
     answer=myObj.nextInt();
     if(answer==1){
         System.out.println("Milaei mono Java.Ti kaneis");         
         System.out.println("1-Den milaw java giati einai ektrwma");
         System.out.println("2-System out println Hello world");
         answer=myObj.nextInt();
         if(answer==1){
             System.out.println(" me dagkwnei kai ginomai zombie. TELOS PAIXNIDIOU");
         }
         
         //na diorthothei i epilogi 2
          if(answer==2){
             System.out.println(" ");
         }

     }
     else if(answer==2){
         System.out.println("Se dagkwnei kai ginesai kai sy zombie. TELOS PAIXNIDIOU");
     }
      else if(answer==3){
         System.out.println("To asanser kollaei anamesa stous 2 orofous. Ginesai Zombie giati se dagkwnei o bobos. TELOS PAIXNIDIOU");
       //naprostethoun epiloges kai ypo-periptoseis
        }
     }
     else if(answer==3){
                   System.out.println("Stis skales petyxaineis thn kyria Iwannidou me 3 neropistola. Ti kaneis?");
     System.out.println("1-Pairnw to neropistolo kai kanoume maxh");
     System.out.println("2-Mou rixnei me to neropistolo");
     System.out.println("3-Den exw idea ti allo na kanw. Synexizw me thn mera mou");
     answer=myObj.nextInt();
     if (answer==1){
         System.out.println("To neropistolo exei mesa oksi opoios petyxei prwtos zei");
     }
     if (answer==2){
         System.out.println("To neropistolo exei oksi kai liwneis. TELOS PAIXNIDIOU");
     }
     if (answer==3){
         System.out.println("Ezhses kai synexizeis me thn mera sou kanonika GJ");
     }
    }
     else{
         System.out.println("Lathos apanthsh");
     }
 }
}
