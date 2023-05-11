/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Nhabomba
 */
public class afdgdagds {
    
  
/*static void calculo(int quant){ 
int preco=3000;
if(quant>=5){
    int valp=(preco*quant)-4000;
    System.out.println(" o desconto sera "+ valp);
}else { int valp=(preco*quant);
    System.out.println("o valor a pagar será"+valp);}

}static void dados( char letra ) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        int quant;
          
        
     switch(letra){
         case 'p':{System.out.println("introduza a quantidade");
        quant = Integer.parseInt(x.readLine());
          calculo(quant);}break;
       
         
        case 's':
     {System.out.println("introduza a quantidade");
        quant = Integer.parseInt(x.readLine());
        calculo(quant);}break;
        default:System.out.println("preste mas atenção");break;
        
     }
}
     static void escolha( )throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        
        char letra ;
         System.out.println("o que pretende comprar , iphone(p), samsung(s) ");
        letra= x.readLine().charAt(0);
      
       
     dados(letra);
        
     }
        public static void main(String[] args) throws IOException {
   BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
escolha();
}}*/
    

    
    
    
    
    
    
    
    
   /* static void escolha( )throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        
        char letra ;int val;
         System.out.println("o que pretende comprar , iphone(p), samsung(s) ");
        letra= x.readLine().charAt(0);
       switch(letra){
         case 'p':{
          quantidade( letra);}break;
       
         
        case 's':
     {quantidade (letra);}break;
        default:System.out.println("preste mas atenção");break;
        
     }

    
    
    }
    
    
    static void quantidade(int val)throws IOException {
   BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("introduza a quantidade");
       int quant = Integer.parseInt(x.readLine());
    
    
    calculo(quant);
    }
   
    
    static void calculo(int quant){ 
int preco=3000;
if(quant>=5){
    int valp=(preco*quant)-4000;
    System.out.println(" o desconto sera "+ valp);
}else { int valp=(preco*quant);
    System.out.println("o valor a pagar será"+valp);}}

  public static void main(String[] args) throws IOException {
   BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
escolha();}}*/
    


    static void vector()throws IOException {
   BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    int num;
        System.out.println("quantos numeros pretende cadestrar");
    num=Integer.parseInt(x.readLine());
    int vectorn[]=new int [num];
    for(int i=0;i<num;i++){
        System.out.println("introduza  "+(i+1)+" vector");
    }
    visualizar(vectorn);
    }
    
    static void visualizar(int vectorn[]){
        
        for(int i=0;i<num;i++){
            System.out.println(vectorn[i]);
    }
    
    }
    
    
public static void main(String[] args) throws IOException {
   BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

}}