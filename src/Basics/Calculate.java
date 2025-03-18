package Basics;

class ObjectP {

    public int add(int a, int b){

        return a+b;
    }

}
class Calculate{
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        ObjectP obj = new ObjectP();
        int r = obj.add(num1 , num2);
        System.out.println(r);
    }
}