package lektion2;

/**
 * Напишите метод, который проверяет, является ли введенная строка корректной
 * датой в формате "YYYY-MM-DD". Дата должна быть в пределах от 0001-01-01
 * до 9999-12-31. Если дата корректна, возвращайте её. Если нет — сообщение
 * об ошибке.
 */
public class program1 {
    public static void main(String[] args) {
        String date = "0005-12-22";
        dateValidator(date);

    }

    public static void dateValidator(String date) {
        try {
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(5, 7));
            int day = Integer.parseInt(date.substring(8, 10));
            if ((date.charAt(4)=='-')&&(date.charAt(7)=='-')&&(date.length() == 10)&&(year > 0) && (year <= 9999) && (month >0) && (month <= 12) && checkDay(year, month, day)) {
                System.out.println("Дата - " + date);
            } else System.out.println("Формат даты не корректен");

        } catch (NumberFormatException e) {
            System.out.println("Формат даты не корректен");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка");
        }

    }

    public static boolean checkDay(int year,int month, int day) {
        boolean ch = false;
        int daymax = 0;
        switch (month) {
            case 1:
                daymax = 31;
                break;
            case 2:
            if (year%4 == 0) daymax = 29;
            else daymax = 28;
                break;
            case 3:
                daymax = 31;
                break;
            case 4:
            daymax = 30;
                break;
            case 5:
                daymax = 31;
                break;
            case 6:
            daymax = 30;
                break;
            case 7:
                daymax = 31;
                break;
            case 8:
                daymax = 31;
                break;
            case 9:
            daymax = 30;
                break;
            case 10:
                daymax = 31;
                break;
            case 11:
            daymax = 30;
                break;
            case 12:
                daymax = 31;
                break;
            default:
                break;
        }
        if ((day>0)&&(day<=daymax)) ch = true;
        return ch;
    }
}
