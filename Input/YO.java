package Input;

class A implements Runnable {

    @Override
    public void run() {
        for(int i =1;i<=3;i++)
        {
            System.out.println("MCA");
        }
    }
    class Interface {
        public static void main(String[] args) {
            A ob = new A();
            Thread t = new Thread(ob);
            t.start();
        }
    }
}
