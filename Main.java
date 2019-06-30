import java.time.*;



public class Main {



public static void main(String[] args) {



LocalDate date = LocalDate.now();



int currentDate = date.getYear();



if (currentDate > 1980) {



System.out.println("Today is later than January 1, 1980.");



}

if (currentDate < 2020) {



System.out.println("Today is earlier than January 1, 2020.");



}

}

}
