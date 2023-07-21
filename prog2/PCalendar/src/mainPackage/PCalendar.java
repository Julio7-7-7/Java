package mainPackage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import packageDate.classFecha;
import packageHour.classHour;

public class PCalendar {

    public static void main(String[] args) {
        
        classFecha o1;
        o1 = new classFecha();
        
        
        classHour o2;
        o2 = new classHour();
        
        /*
        o1.setDia(LocalDate.now().getDayOfMonth());
        o1.setMes(LocalDate.now().getMonthValue());
        o1.setAño(LocalDate.now().getYear());
        
        o2.setHora(LocalTime.now().getHour());
        o2.setMinuto(LocalTime.now().getMinute());
        o2.setSegundo(LocalTime.now().getSecond());
        
        System.out.println("La fecha es " + o1 + " y la hora es " + o2);

        */
        
        Date fecha = new Date();
        o1.setDia(fecha.getDay() +2);
        o1.setMes(fecha.getMonth() + 1);
        o1.setAño(fecha.getYear() + 1900);
        o2.setHora(fecha.getHours());
        o2.setMinuto(fecha.getMinutes());
        o2.setSegundo(fecha.getSeconds());
        
        System.out.println("La fecha es:" + o1 + " y la hora es " + o2 );
        
        
    }
    
}
