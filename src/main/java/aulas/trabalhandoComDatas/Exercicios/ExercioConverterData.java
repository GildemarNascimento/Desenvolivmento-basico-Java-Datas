package aulas.trabalhandoComDatas.Exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercioConverterData {
    public static void main(String[] args) {
        //Converte a data atual no formato DD/MM/YYYY HH:MM:SS:MMM.
        Date dataAtual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");
        String formatoAtual = sdf.format(dataAtual);
        System.out.println(formatoAtual);
        //18/10/2021 04:35:19:035
    }
}
