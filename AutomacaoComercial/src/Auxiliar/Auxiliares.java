package Auxiliar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Fabricio
 */
public class Auxiliares {

    /**
     * Método recebe duas datas e faz o cálculo da diferença. Retorna um inteiro
     * com a idade.
     *
     * @author Fabrio
     * @return int Idade
     */
    public int retornaIdade(String primeiraData, String segundaData) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = df.parse(primeiraData);
        Date data2 = df.parse(segundaData);
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(data1);
        cal2.setTime(data2);
        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        int month1 = cal1.get(Calendar.MONTH);
        int month2 = cal2.get(Calendar.MONTH);
        int day1 = cal1.get(Calendar.DAY_OF_MONTH);
        int day2 = cal2.get(Calendar.DAY_OF_MONTH);
        int idade = year2 - year1;
        if ((month2 < month1)
                || ((month2 == month1) && (day2 < day1))) {
            idade -= 1;
        }

        return idade;
    }

    /**
     * Método que retorna uma string com o dia atual no formato dd/MM/yyyy
     *
     * @author Fabrício
     * @return String DtFormatada
     */
    public static String Hoje() {
        //SETA A DATA DO DIA PARA O CAMPO DE DATA DE CADASTRO
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dtFormatada = sdf.format(new Date());
        return dtFormatada;
    }
}
