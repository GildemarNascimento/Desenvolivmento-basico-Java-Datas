package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

import static java.lang.System.*;

/**
 *  Exemplo de utilização da classe Calendar
 */
public class Exemplo006 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        out.println("A data corrente é : " + agora.getTime());
        // A data corrente é : Sun Jul 14 20:50:31 BRT 2019

        agora.add(Calendar.DATE, -15);
        out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Sat Jun 29 20:50:31 BRT 2019

        agora.add(Calendar.MONTH, 4);
        out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Tue Oct 29 20:50:31 BRT 2019

        agora.add(Calendar.YEAR, 2);
        out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Fri Oct 29 20:50:31 BRT 2021

        Calendar data = Calendar.getInstance();
        data.set(2021,10,18);

        out.println(data.getTimeZone());


    }
}
