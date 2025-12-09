public class VariableNamesTheme {
    public static void main(String[] args) {
        //РАЗНЫЕ ПЕРЕМЕННЫЕ
        System.out.println("\nРАЗНЫЕ ПЕРЕМЕННЫЕ\n");

        //цифра
        int digit = 5;
        System.out.println("цифра " + digit);

        //сумма чисел
        int digitSum = digit + 7;
        System.out.println("сумма чисел " + digitSum);

        //произведение цифр
        int digitMulti = digit * digitSum;
        System.out.println("произведение цифр " + digitMulti);

        //максимальное число
        int digitMax = 9999;
        System.out.println("максимальное число " + digitMax);

        //количество десятков
        int countTen = 5;
        System.out.println("количество десятков " + countTen);

        //вес собаки
        float dogWeight = 5.23f;
        System.out.println("вес собаки " + dogWeight+ " кг");

        //исходное число
        int digitOrig = 5;
        System.out.println("исходное число " + digitOrig );

        //процент по вкладу
        double depositPersent = 6.7;
        System.out.println("процент по вкладу " + depositPersent + "%");

        //символ &
        char ampersand = '&';
        System.out.println("символ " + ampersand);

        //код ошибки
        int subrc = 4;
        System.out.println("код ошибки " + subrc);

        //тип сообщения
        char msgType = 'E';
        System.out.println("тип сообщения " + msgType);

        //число нулей
        int countZero = 5;
        System.out.println("число нулей " + countZero);

        //уникальное число
        int digitUni = 15;
        System.out.println("уникальное число " + digitUni);

        //случайное число
        int digitRandom = 51;
        System.out.println("случайное число " + digitRandom);

        //математическое выражение
        String expressionMath = "A + B = C";
        System.out.println("математическое выражение '" + expressionMath + "'");

        //счет в игре
        String gameScore = "4:3";
        System.out.println("счет в игре '" + gameScore + "'");

        //максимальная длина
        double maxLen = 5.123;
        System.out.println("максимальная длина " + maxLen + " метров");

        //пункт меню
        int menuPoint = 3;
        System.out.println("пункт меню " + menuPoint);

        //стоимость кофе
        float cofeeCoast = 500.50f;
        System.out.println("стоимость кофе " + String.format("%.2f", cofeeCoast) + " рублей");

        //начальная дата
        String initDate = "09.12.2025";
        System.out.println("начальная дата " + initDate + "г.");

        //окончание диапазона
        double to = 95;
        System.out.println("окончание диапазона " + to);

        //имя работника месяца
        String employeeMonthName = "Виктор";
        System.out.println("имя работника месяца - " + employeeMonthName);

        //название электронной книги
        String eBookName = "Война и мир";
        System.out.println("название электронной книги " + eBookName);

        //размер
        String size = "XXL";
        System.out.println("размер " + size);

        //вместимость
        double volume = 50.455;
        System.out.println("вместимость " + volume + " литров");

        //счетчик
        int i = 5;
        System.out.println("счетчик " + i);

        //путь до файла
        String path = "C:\\JAVA\\StartJava\\Lesson1";
        System.out.println("путь до файла " + path);

        //количество чисел в строке
        int countDigitInLine = 5;
        System.out.println("количество чисел в строке " + countDigitInLine);

        //BOOLEAN-ПЕРЕМЕННЫЕ
        System.out.println("\nBOOLEAN-ПЕРЕМЕННЫЕ\n");
        String answer = "";

        //сотни равны?
        boolean isEqualHundred = false;
        
        if (isEqualHundred) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("сотни равны? - " + answer);

        //компьютер включен?
        boolean isOnPC = true;
        
        if (isOnPC ) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("компьютер включен? - " + answer);

        //есть равные цифры?
        boolean hasEqualDigits = true;
        
        if (hasEqualDigits ) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("есть равные цифры? - " + answer);

        //служба создана?
        boolean isCreateService = false;
        
        if (isCreateService ) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("служба создана? - " + answer);

        //файл пустой?
        boolean isEmptyFile = true;
        
        if (isEmptyFile ) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("файл пустой? - " + answer);

        //соединение активное?
        boolean isConnectionActive = true;
        
        if (isConnectionActive ) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("соединение активное? - " + answer);

        //новый?
        boolean isNew = true;
        
        if (isNew) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("новый? - " + answer);

        //электронная почта действительная?
        boolean isActualEmail = false;
        
        if (isActualEmail ) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("электронная почта действительная? - " + answer);

        //имеются уникальные строки?
        boolean isLinesUnique = true;
        
        if (isLinesUnique ) {
            answer = "да";
        } else {
            answer = "нет";
        }
        System.out.println("имеются уникальные строки? - " + answer);

        //АББРЕВИАТУРЫ
        System.out.println("\nАББРЕВИАТУРЫ\n");

        //старый universally unique identifier
        String unique = "unique";
        System.out.println("старый universally unique identifier " + unique);

        //производитель оперативной памяти
        String ram = "Kingston";
        System.out.println("производитель оперативной памяти " + ram);

        //емкость жесткого диска
        int hdd = 1024;
        System.out.println("емкость жесткого диска " + hdd);

        //определение термина протокола передачи гипертекста
        String http = "";
        System.out.println("определение термина протокола передачи гипертекста " + http);

        //сокращенный uniform resource locator
        String url = "http://github.com/vik0310";
        System.out.println("сокращенный uniform resource locator " + url);

        //новый идентификатор клиента
        int clientId = 5;
        System.out.println("новый идентификатор клиента " + clientId);

        //количество символов в american standard code for information interchange
        int ascii = 128;
        System.out.println("количество символов в american standard code for information interchange " + ascii);
    }
}