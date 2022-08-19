//Напишите класс BaseConverter для конвертации из градусов по Цельсию в Кельвины , Фаренгейты , и так далее. У класса должен быть метод convert, который и делает
//       конвертацию
public class Main {
    public static void main(String[] args) {KelvinConverter kelvinConverter=new KelvinConverter();
        FahrenheitConverter fahrenheitConverter=new FahrenheitConverter();
        CelsiusConverter celsiusConverter=new CelsiusConverter();
        double temperature=17.5;
        System.out.println(celsiusConverter.getConvertedValue(temperature));
        System.out.println(kelvinConverter.getConvertedValue(temperature));
        System.out.println(fahrenheitConverter.getConvertedValue(temperature));}
}
