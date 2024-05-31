package dz_sem3;

public class Calculator {
    public static <T extends Number, V extends Number> Number sum(T a, V b) {
        return new Number(){

            @Override
            public double doubleValue() {
                return a.doubleValue() + b.doubleValue();
            }
            @Override
            public int intValue() {
                return a.intValue() + b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() + b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue() + b.floatValue();
            }
        };
    }
    public static <T extends Number, V extends Number> Number multiply(T a, V b) {
        return new Number(){
            @Override
            public double doubleValue() {
                return a.doubleValue() * b.doubleValue();
            }
            @Override
            public int intValue() {
                return a.intValue() * b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() * b.longValue();
            }
            @Override
            public float floatValue() {
                return a.floatValue() * b.floatValue();
            }
        };
    }
    public static <T extends Number, V extends Number> Number divide(T a, V b) {
        return new Number(){
            @Override
            public double doubleValue() {
                return a.doubleValue() / b.doubleValue();
            }
            @Override
            public int intValue() {
                return a.intValue() / b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() / b.longValue();
            }
            @Override
            public float floatValue() {
                return a.floatValue() / b.floatValue();
            }
        };
    }
    public static <T extends Number, V extends Number> Number subtract(T a, V b) {
        return new Number(){
            @Override
            public double doubleValue() {
                return a.doubleValue() - b.doubleValue();
            }
            @Override
            public int intValue() {
                return a.intValue() - b.intValue();
            }
            @Override
            public long longValue() {
                return a.longValue() - b.longValue();
            }
            @Override
            public float floatValue() {
                return a.floatValue() - b.floatValue();
            }
        };
    }
}
