package com.example.wagner_pc.quiz;

public class BancoQuestoes {
    private String Questoes[] = {
            "Qual o ano do descobrimento do Brasil?",
            "Quanto que é 2+2?",
            "Qual o planeta mais próximo do sol?",
            "Qual o planeta mais distante do sol ?",
            "Qual o maior planeta do nosso sistema solar?",
            "Qual o ano da independência do Brasil?",
            "Quem descobriu o Brasil?",
            "Quem é o professor que da mais aula no 6º período",
            "4x4 é igual a ?",
            "Qual a raiz quadrada de 16"
    };
    private String Respostas[][] = {
            {"1357", "1565", "1230", "1500"},
            {"4", "8", "10", "3"},
            {"Mercúrio", "Terra", "Marte", "Urano"},
            {"Mercúrio", "Terra", "Netuno", "Urano"},
            {"Mercúrio", "Júpiter", "Netuno", "Urano"},
            {"1357", "1565", "1822", "1500"},
            {"Lula", "Pedro ALves Cabral", "Indios", "Newarney"},
            {"Navas", "Luciana", "Newarney", "nda"},
            {"210", "16", "18", "8"},
            {"8", "4", "25", "nda"}
    };
    private String RespCor[] = {"1500", "4", "Mercúrio", "Netuno", "Júpiter", "1822", "Indios", "Navas", "16","4"};

    public String obtQuest(int a) {
        String questao = Questoes[a];
        return questao;
    }

    public String obtRes1(int a) {
        String res1 = Respostas[a][0];
        return res1;
    }

    public String obtRes2(int a) {
        String res2 = Respostas[a][1];
        return res2;
    }

    public String obtRes3(int a) {
        String res3 = Respostas[a][2];
        return res3;
    }

    public String obtRes4(int a) {
        String res4 = Respostas[a][3];
        return res4;
    }

    public  String obtResCorr(int a){
        String correta = RespCor[a];
        return correta;
    }
}
