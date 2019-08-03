import java.util.Scanner;
public class Test {
    private static void Tests (Scanner scanner, int value)  {
        System.out.println("Version 1.0");
        zeroMenu();

    }
    private  static void firstMenu   ()  {
        System.out.println( "1 - Поиск по VIN коду машины. ");
        System.out.println( "2 - Поиск по регистрационному номеру машины. ");
        System.out.println( "3 - Поиск по марки и модели. ");
        System.out.println( "4 - Поиск по году выпуска от ... до ");
        System.out.println( "5 - Поиск по пробегу от ... до");
        System.out.println( "6 - Поиск по цене от ... до");
        System.out.println( "7 - Отобразить список всех машин.");
        System.out.println( "0 - Назад.");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 0:{
                Tests(scanner,1);
                break;

            }
            case 1:{
                System.out.println( "Введите VIN код машины. ");
                System.out.println( "0 - Назад. ");
                String s = "Машина с VIN ";
                String r = " существует в базе. \n" +
                        "Введите другой VIN номер машины. Для возврата в предыдущее меню введите цифру 0.";
                inMenu(s,r);
                break;

            }
            case 2:{
                System.out.println( "Введите регистарционный номер машины. ");
                System.out.println( "0 - Назад. ");
                String s = "Машина с регистарционным номером ";
                String r = " существует в базе. \n" +
                        "Введите другой регистарционный номер. Для возврата в предыдущее меню введите цифру 0.";
                inMenu(s,r);
                break;
            }
            case 3:{
                System.out.println( "Введите марку_модель. ");
                System.out.println( "0 - Назад. ");
                String s = "Машина  ";
                String r = " существует в базе. \n" +
                        "Введите другую марку_модель . Для возврата в предыдущее меню введите цифру 0.";
                inMenu(s,r);
                break;
            }
            case 4:{
                System.out.println( "Введите год выпуска вашего авто. ");
                System.out.println( "0 - Назад. ");
                String s = "В базе отсутствуют авто   ";
                String r = " года выпуска. \n" +
                        "Введите другой год выпуска авто . Для возврата в предыдущее меню введите цифру 0.";
                inMenu(s,r);
                break;
            }
            case 5:{
                System.out.println( "Введите пробег вашего авто. ");
                System.out.println( "0 - Назад. ");
                String s = "В базе отсутствуют авто   ";
                String r = " с пробегом. \n" +
                        "Введите другой пробег . Для возврата в предыдущее меню введите цифру 0.";
                inMenu(s,r);
                break;
            }
            case 6:{
                System.out.println( "Введите цену: от ... до. ");
                System.out.println( "0 - Назад. ");
                String s = "В базе отсутствуют авто   ";
                String r = " в ценовом диапазоне . \n" +
                        "Введите другой ценовой диапазон  . Для возврата в предыдущее меню введите цифру 0.";
                inMenu(s,r);
                break;
            }
            case 7:{
                System.out.println( "В базе отсутствуют авто ");
                System.out.println( "0 - Назад. ");
                String s = "В базе отсутствуют авто. \n  ";
                String r = "Для возврата в предыдущее меню введите цифру 0.";
                Scanner scan= new Scanner(System.in);
                int a ;
                do {
                    System.out.println(s + r);
                    a  = scan.nextInt();

                }
                while (a != 0);
                {
                    firstMenu();

                }
            }
        }
    }
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush(); }
    private static void zeroMenu()  {
        System.out.println( "1 - Меню поиска. ");
        System.out.println( "2 - Занести в базу данные о новой машине. ");
        System.out.println( "3 - Редактировать информацию о машине по VIN коду. ");
        System.out.println( "4 - Удалить машину с базы по VIN коду. ");
        System.out.println( "0 - Назад.");
        System.out.println( "-1 - Выход из программы.");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 0:{
                Tests(scanner,1);
                break;
            }
            case 1:{
                firstMenu();
                break;
            }
            case 2:{

                notWork();
                break;
             }
            case 3:{
                notWork();
                break;
            }
            case 4:{
                notWork();
                break;
            }
            case -1:{
                break;
            }
        }
    }
    private  static  void notWork (){
        String b = "Данная функция сейчас недоступна, будет реализована в следующем обновлении.\n";
        String v = "0 - Назад. ";
        Scanner scan= new Scanner(System.in);
        String a ;
        do {
            System.out.println(b + v);
              a  = scan.next();

        }
        while (!a.equals("0"));
        {
            zeroMenu();

        }
    }
    private static void inMenu(String s, String r){
        Scanner scan= new Scanner(System.in);
        String a  = scan.next();
        do {
            System.out.println(s +  a + r);
            a  = scan.next();


        }
        while (!a.equals("0"));
        {
            firstMenu();

        }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Tests(scanner,1);
    }

}
