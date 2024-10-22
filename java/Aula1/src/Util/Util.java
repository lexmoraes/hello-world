package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    // Construtor privado para evitar instância da classe
    private Util() {
        throw new UnsupportedOperationException("Utils class cannot be instantiated");
    }

    public static Date getFormattedDate(String dateString) {
// Defina o formato da data
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        try {
// Parse da string para criar uma instância de Date
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;

    }
}