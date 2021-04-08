public class App {
    public static void main(String[] args) throws Exception {

        BinarySearchArray search01 = new BinarySearchArray();
        search01.insert(2);
        search01.insert(4);
        search01.insert(6);
        search01.insert(8);
        search01.insert(10);
        search01.insert(12);
        search01.insert(14);
        search01.insert(16);
        search01.insert(18);
        search01.insert(20);

        System.out.println(search01.binarySearch(20));
    }
}
