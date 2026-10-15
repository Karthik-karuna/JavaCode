package assignmentDay7;

public class WrapperConversionAssignment {
    public static void main(String[] args) {
        int primitiveNum = 25;

        // i) Convert primitive int to Integer object (Autoboxing)
        Integer wrapperObj = primitiveNum;

        // ii) Convert Integer object back to primitive int (Unboxing)
        int unboxedNum = wrapperObj;

        // iii) Print both values to the console
        System.out.println("Integer object value (Autoboxed): " + wrapperObj);
        System.out.println("Primitive int value (Unboxed): " + unboxedNum);
    }
}
