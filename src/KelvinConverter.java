public class KelvinConverter implements Convertor {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8*baseValue+32;
    }
}
