public class Main4 {
    public static void main(String[] args) {
        IntDynamicArray dynamicArray = new IntDynamicArray(1);

        dynamicArray.add(1);
        System.out.println(dynamicArray.getSize());

        dynamicArray.add(4);
        System.out.println(dynamicArray.getSize());

        dynamicArray.add(4);
        System.out.println(dynamicArray.getSize());

        dynamicArray.remove(1);
        System.out.println(dynamicArray.getSize());

        System.out.println(dynamicArray.get(0));
        System.out.println(dynamicArray.get(1));

    }
}
