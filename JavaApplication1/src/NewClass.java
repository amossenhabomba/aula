/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhabomba
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;


public class NewClass {

    public static void main(String args[]) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int preco = 200;
        char k;
        int biologia, tecn, hist, valpt, valph, valpb, soma;
        do {
            System.out.print("introduza o numero de livros para tecn");
            tecn = Integer.parseInt(x.readLine());
            valpt = preco * tecn;
            System.out.print(" o valor a pagar " + valpt);
            System.out.print("introduza o numero de livros para tecn");
            hist = Integer.parseInt(x.readLine());
            valph = (preco | 2) * hist;
            System.out.print(" o valor a pagar " + valph);
            System.out.print("introduza o numero de livros para tecn");
            biologia = Integer.parseInt(x.readLine());
            valpb = preco * biologia;
            System.out.print(" o valor a pagar " + valpb);
            System.out.print("desreja continuar s/n");
            k = x.readLine().charAt(1);
        } while (k == 'n');
        soma = valpb + valph + valpt;
        System.out.print(soma);

    }
}

