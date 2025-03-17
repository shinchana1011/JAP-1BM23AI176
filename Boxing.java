package S1BM23AI176;

public class Boxing {
    public static void main(String[] args){
        Integer boxedInt=Integer.valueOf(10);
        Double boxedDouble=Double.valueOf(20.5);
        Character boxedChar=Character.valueOf('A');
        Boolean boxedBoolean=Boolean.valueOf(true);
        Float boxedFloat=Float.valueOf(30.5f);

        int unboxedInt=boxedInt.intValue();
        double unboxedDouble=boxedDouble.doubleValue();
        char unboxedChar=boxedChar.charValue();
        boolean unboxedBoolean=boxedBoolean.booleanValue();
        float unboxedFloat=boxedFloat.floatValue();
        System.out.println("Boxed Integer:"+boxedInt);
        System.out.println("UnBoxed Integer:"+unboxedInt);
        System.out.println("Boxed Double:"+boxedDouble);
        System.out.println("unBoxed Double:"+unboxedDouble);
        System.out.println("Boxed character:"+boxedChar);
        System.out.println("unBoxed character:"+unboxedChar);
        System.out.println("Boxed boolean:"+boxedBoolean);
        System.out.println("unBoxed boolean:"+unboxedBoolean);
        System.out.println("Boxed float:"+boxedFloat);
        System.out.println("unBoxed float:"+unboxedFloat);




    }
}
