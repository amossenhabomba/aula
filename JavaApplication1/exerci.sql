/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Nhabomba
 * Created: Oct 5, 2022
 */
import java.io*;
public class Exerc{
public static void main(String args[]) throws IOException{
BufferedReader k=new BufferedReader(new InputStreamReader(System.in ) );

System.out.println("QUANTOS nUMEROS Pretende Introduzir " );

int p=Integer.parseInt(k.readLine());
int val[]=new int[p];
System.out.println("Introduza "+p+" valores Inteiros " );

for(int x=o; x<p; x++ ){
System.out.println(x++ " o valor : " );

val[x]=Integer.parseInt(k.readLine());
}

for(int t=0; t<p; t++ ){
System.out.println( val[x] );}

int soma=0;
for( int x=0; x<p; x++ ){
soma + =p[x];
System.out.println( " Soma: "  +soma);
}




}}

