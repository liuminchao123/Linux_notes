// 用一个类继承 异常处理类
class MyEx extends Exception{}

public class ExTestDrive{

    public static void main(String [] args) {
        String test = "yes";
        try {
            System.out.print("t");
            doRisky(test);  //   执行抛出异常，转到catch
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
        }
        System.out.println("s");
    }
    static void doRisky(String t) throws MyEx{
        System.out.print("h");
        // 成立的
        if("yes".equals(t)){
            // 抛出异常
            throw new MyEx();
        }
        System.out.print("r");
    }
}
