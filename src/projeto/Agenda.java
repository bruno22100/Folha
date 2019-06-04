package projeto;

import java.util.Calendar;
public class Agenda {

    int id;
    String titulo;
    boolean ativo;

    boolean mensal = false;
    int diaMes = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);

    boolean semanal = false;
    int intervaloSemanas = 1;
    int diaSemana = Calendar.FRIDAY;

}
