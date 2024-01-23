public class TestClass<T> extends TestExtendClass<T> implements TestInterface<T> {
    
    public int add(T t){
        return 1;
    }

    public TestClass(T t){

    }

    public static void main(String[] args) {
        TestClass<String> testclass = new TestClass<>("ABC");
    }

}
