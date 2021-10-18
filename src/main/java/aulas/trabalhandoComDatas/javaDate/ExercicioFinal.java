package aulas.trabalhandoComDatas.javaDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class ExercicioFinal {
    public static void main(String[] args) {
        //Descubra o timeInMillis do dia que você nasceu;
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.set(1976,10,28);

        Calendar dataParaComparar = Calendar.getInstance();
        dataParaComparar.set(2010,04,15);

        System.out.println("timeInMillis do meu nascimento " + dataNasc.getTimeInMillis());

        //Converte em umbjeto data
        Date nascimento = new Date(dataNasc.getTimeInMillis());
        SimpleDateFormat sdfNasc = new SimpleDateFormat("dd/MM/yyyy");
        Date compData = new Date(dataParaComparar.getTimeInMillis());
        Date compara = new Date(dataParaComparar.getTimeInMillis());
        SimpleDateFormat sdfCompara = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Data do nascimento: " + sdfNasc.format(nascimento));

        //Verificar se data é anterior ou posterior a 15/05/2021.
        if (dataNasc.before(dataParaComparar)){
            System.out.println("Data de nascimento é anterior a  " + sdfCompara.format(compara));
        } else {
            System.out.println("Data de nascimento é posterior a " + sdfCompara.format(compara));
        }



    }
}
