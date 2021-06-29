package com.company;

import com.company.classes.Corrida;
import com.company.classes.StringUtil;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Corrida corrida = new Corrida(200.0,100000, "Grande prêmio pneu furado", 10);

        corrida.registrarSocorristaCarro();
        corrida.registrarSocorristaMoto();

        Random rVelocidade = new Random(),
                rAceleracao = new Random(),
                rAngulodeGiro = new Random();

        // começo do 2 pois dois socorristas ja foram adicionados e ocupam os registros 0 e 1
        for(int i = 2; i < 10; i++){

            if(i%2==0)
                corrida.registrarCarro(rVelocidade.nextInt(200 - 9),  rAceleracao.nextInt(101), rAngulodeGiro.nextInt(181), "ABC-"+ StringUtil.lPad(String.valueOf(i),'0',4));
            else
                corrida.registrarMoto(rVelocidade.nextInt(200 - 9),  rAceleracao.nextInt(101), rAngulodeGiro.nextInt(181), "ABC-"+ StringUtil.lPad(String.valueOf(i),'0',4));
        }

        corrida.iniciarCorrida();

    }
}
