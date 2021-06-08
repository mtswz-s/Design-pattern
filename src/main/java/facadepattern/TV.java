package facadepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 8:01
 * @Version 1.0
 */
public class TV {
        private static TV tv = new TV();

        private TV() {

        }

        public static TV getInstance(){
            return tv;
        }

        public void open(){
            System.out.println("打开电视");
        }

        public void run(){
            System.out.println("看电视");
        }

        public void close(){
            System.out.println("关闭电视");
        }

}
