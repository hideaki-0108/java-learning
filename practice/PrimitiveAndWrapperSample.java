public class PrimitiveAndWrapperSample {

    public static void main(String[] args) {
        // プリミティブ型
        int primitiveInt = 10;
        long primitiveLong = 1_000_000_000L;
        double primitiveDouble = 3.14;
        boolean primitiveBoolean = true;

        // ラッパー型（オブジェクト）
        Integer wrapperInt = 10;
        Long wrapperLong = 1_000_000_000L;
        Double wrapperDouble = 3.14;
        Boolean wrapperBoolean = true;

        System.out.println("primitiveInt = " + primitiveInt);
        System.out.println("wrapperInt   = " + wrapperInt);

        // null を入れられるのはラッパー型だけ
        Integer nullable = null;
        System.out.println("nullable = " + nullable);

        // ↓ このコメントアウトを外すと NullPointerException が発生します
        // int x = nullable; // オートアンボクシング時に NPE

        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5, null);
        int sum = sum(numbers);
        System.out.println("sum = " + sum);
    }

    private static int sum(java.util.List<Integer> numbers) {
        int result = 0;
        for (Integer n : numbers) {
            if (n != null) { // null チェックしないとここでも NPE の可能性
                result += n;
            }
        }
        return result;
    }
}

