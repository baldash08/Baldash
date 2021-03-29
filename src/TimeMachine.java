public class TimeMachine {
    int age;
    public void goToFuture(int age) {
        this.age = age;
        age += 10;
        System.out.println(age);
    }
    public void goToPast(int age) {
        this.age = age;
        age-=10;
        System.out.println(age);
    }
    static void adder(String...name) {
        for(String names : name) {
            System.out.println("hello" + names);
        }
    }
    public static void main(String[] args) { ;

    }

}
