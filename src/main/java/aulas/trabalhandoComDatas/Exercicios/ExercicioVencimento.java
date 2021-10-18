package aulas.trabalhandoComDatas.Exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class ExercicioVencimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, mes, dia;
        System.out.print("Digite a data do vencimento no formato (mm/dd/aaaa): ");

        Calendar vencimento = Calendar.getInstance();

        String data = sc.nextLine().replace("/","");

        ano = Integer.parseInt(data.substring(4,8));
        mes = Integer.parseInt(data.substring(2,4))-1;
        dia = Integer.parseInt(data.substring(0,2));

        vencimento.set(ano, mes ,dia);

        vencimento.add(Calendar.DAY_OF_MONTH,10);

        System.out.println("Vencimento acrescentado 10 dia: " + vencimento.getTime());

        int diaSemana = vencimento.get(Calendar.DAY_OF_WEEK) ;

        switch (diaSemana){
            case 1:
                vencimento.add(Calendar.DAY_OF_MONTH,1);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                vencimento.add(Calendar.DAY_OF_MONTH,0);
                break;
            case 7:
                vencimento.add(Calendar.DAY_OF_MONTH,2);
                break;
            }
        System.out.println("Vencimento considerado final de semana: " + vencimento.getTime());
        }
        }











