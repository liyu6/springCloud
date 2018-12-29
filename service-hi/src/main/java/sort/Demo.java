package sort;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        stackOverFlow();
        outOfMemory();
    };

    /**
     *
     * 栈溢出
     */
    public  static  void  stackOverFlow(){

        stackOverFlow();

    }




    static class TestBean{}
    /**
     *
     * 堆溢出 Java heap space
     */
    public  static  void  outOfMemory(){
        try {
            List<Object> list=new ArrayList<>();
            while (true){

                list.add( new TestBean());

            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
