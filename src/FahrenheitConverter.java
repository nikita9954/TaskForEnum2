public class FahrenheitConverter implements Convertor{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue+273.15;
    }
}
