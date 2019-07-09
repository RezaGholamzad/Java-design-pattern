class SingleObject {

    //create an object of SingleObject
    private static SingleObject singleObject = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    static SingleObject getInstance(){
        return singleObject;
    }

    void showMessage(){
        System.out.println("hello world");
    }

}
