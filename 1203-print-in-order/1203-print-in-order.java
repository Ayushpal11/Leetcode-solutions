class Foo {

    public Foo() {
        
    }

    public List<Integer> arrange = new ArrayList<>();

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        arrange.add(1);
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        while (!arrange.contains(1)){
        }
        printSecond.run();
        arrange.add(2);
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        while(!arrange.contains(2)){
        }
        printThird.run();
    }
}