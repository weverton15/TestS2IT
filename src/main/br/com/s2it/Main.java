package br.com.s2it;

import br.com.s2it.ex8.CompletingNumbers;
import br.com.s2it.ex9.BinaryTree;

public class Main {

    public static void main(String... args) {
        CompletingNumbers compNum = new CompletingNumbers();
        compNum.setA(10);
        compNum.setB(5198);
        System.out.println("O Número C (entre 0 e 1.000.000) é - " + String.valueOf(compNum.calcNumber()));

        BinaryTree bt = new BinaryTree();
        BinaryTree btL = new BinaryTree();
        BinaryTree btR = new BinaryTree();
        bt.setValue(10);
        btL.setValue(25);
        btR.setValue(15);
        bt.setLeft(btL);
        bt.setRight(btR);
        System.out.println("Soma Nó central - " + String.valueOf(bt.sum(bt)));
        System.out.println("Soma Nó esquerdo - " + String.valueOf(btL.sum(btL)));
        System.out.println("Soma Nó direito - " + String.valueOf(btR.sum(btR)));
    }
}
