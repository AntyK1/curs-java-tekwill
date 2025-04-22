package homework3.conversion;

public class Wrapper {
    public static void main (String[] args) {

        boolean booleanWrapperFromText = Boolean.parseBoolean("tRue");
        byte byteWrapper = Byte.parseByte("120");
        short shortWrapper = Short.parseShort("32000");
        int intWrapper = Integer.parseInt("147895632");
        long longWrapper = Long.parseLong("987654321987654321");
        double doubleWrapper = Double.valueOf("4444.5d");
        float floatWrapper = Float.valueOf("2354.56f");


        System.out.println("boolean: " + booleanWrapperFromText);
        System.out.println("byte: " + byteWrapper);
        System.out.println("short: " + shortWrapper);
        System.out.println("int: " + intWrapper);
        System.out.println("long: " + longWrapper);
        System.out.println("double: " + doubleWrapper);
        System.out.println("float: " + floatWrapper);

    }
}
