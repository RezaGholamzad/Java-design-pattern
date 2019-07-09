public class SingletonPatternDemo {

    public static void main(String[] args) {

        //Get the only object available
        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();
    }
}
