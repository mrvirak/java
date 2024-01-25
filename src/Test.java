public class Test {
    public static int input(int num) throws IllegalArgumentException{
        if (num==0){
            throw new IllegalArgumentException("cannot input zero");
        }
        else {
            return num;
        }
    }


}
