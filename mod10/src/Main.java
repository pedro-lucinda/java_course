public class Main {
    public static void main(String[] args){
        FlowControl flowControl = new FlowControl();
        Integer[] grades = {10, 10, 10,3};

        String result = flowControl.getResult(grades);
        System.out.println(result);
    }
}
