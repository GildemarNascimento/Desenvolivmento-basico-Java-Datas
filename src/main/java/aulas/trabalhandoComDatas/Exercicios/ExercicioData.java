package aulas.trabalhandoComDatas.Exercicios;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class ExercicioData {
    public static void main(String[] args) {
        //Descubra o timeInMillis do dia que você nasceu;
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.set(1976, Calendar.OCTOBER,28);

        Calendar dataParaComparar = Calendar.getInstance();
        dataParaComparar.set(2010, Calendar.MAY,15);
        Long millisNascimento = dataNasc.getTimeInMillis();
        Long millisDataParaComparar = dataParaComparar.getTimeInMillis();

        System.out.println("timeInMillis do meu nascimento " + millisNascimento);

        //Converte em umbjeto data

        Instant nascimento = dataNasc.toInstant();
        Instant  comparaData = dataParaComparar.toInstant();

        System.out.println("Data do nascimento: " + nascimento);

        //Verificar se data é anterior ou posterior a 15/05/2021.
        if (dataNasc.before(dataParaComparar)) System.out.println("Data de nascimento é anterior a  " + comparaData);
        else {
            System.out.println("Data de nascimento é posterior a " + comparaData);
        }
    }
}
