package br.com.s2it.ex8;

import java.util.stream.IntStream;

public class CompletingNumbers {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calcNumber(){
        int aLen = 1 + (int)Math.floor(Math.log10(a));
        int bLen = 1 + (int)Math.floor(Math.log10(b));
        int len = aLen >= bLen ? aLen : bLen;
        StringBuilder c = new StringBuilder();

        IntStream.range(0, len).forEach(i -> {
            if (i < aLen) c.append(String.valueOf(a).charAt(i));
            if (i < bLen) c.append(String.valueOf(b).charAt(i));
        });

        return Integer.parseInt(c.toString()) < 1000000 ? Integer.parseInt(c.toString()) : -1;
    }

}
