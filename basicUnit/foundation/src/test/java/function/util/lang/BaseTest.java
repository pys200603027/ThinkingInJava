package function.util.lang;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import function.util.TimeUtils;

public class BaseTest {
    /**
     * 测试数据传递
     */
    class ClassPass {
        List<String> list;

        ClassPass(List<String> list) {
            this.list = list;
        }

        /**
         * 这里list指向了另一个指针，因此失去了之前传入当联系
         */
        void method1() {
            List<String> temp = new ArrayList<>();
            temp.add("Hello World");
            list = temp;
        }

        void method2() {
            list.add("One");
            list.add("Second");
        }

        void method3() {
            List<String> temp = new ArrayList<>();
            temp.add("One");
            temp.add("Second");
            temp.add("Three");

            list.addAll(temp);
        }
    }

    /**
     * 当对象作为null传递过去时，并没有发生引用传递
     */
    @Test
    public void testReferencePassNull() {
        List<String> list = null;
        ClassPass classPass = new ClassPass(list);
        classPass.method1();
        System.out.println(list.size());
    }

    @Test
    public void testReferencePassEmpty1() {
        List<String> list = new ArrayList<>();
        ClassPass classPass = new ClassPass(list);
        classPass.method1();
        System.out.println(list.size());
    }

    @Test
    public void testReferencePassEmpty2() {
        List<String> list = new ArrayList<>();
        ClassPass classPass = new ClassPass(list);
        classPass.method2();
        System.out.println(list.size());
    }

    @Test
    public void testReferencePassEmpty3() {
        List<String> list = new ArrayList<>();
        ClassPass classPass = new ClassPass(list);
        classPass.method3();
        System.out.println(list.size());
    }

    /**
     * 测试表情长度
     */
    @Test
    public void testEmojLenght() {
        String s = "你👫好dddddwerer";

        System.out.println(s.length());
    }

    /**
     * 测试数组随机
     */
    @Test
    public void testRandomArray() {
        Random random = new Random();
        List<Integer> arrays = new ArrayList<>();
        arrays.add(0);
        arrays.add(1);

        for (int n = 0; n < 100; n++) {
            int i = random.nextInt(arrays.size());
            System.out.println(i);
        }
    }



    /**
     * 测试执行线程时
     */
    @Test
    public void testAyncThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Test aync.." + i);
                }
                try {
                    TimeUnit.SECONDS.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(runnable).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStringToInteget() {
        long time = 1537426606;

        String s = String.valueOf(time);

        System.out.println(s);

    }

    @Test
    public void removeUnuseString() {
        String s = "{\"music_body\":\"{\\\"jump_notify\\\": {\\\"path\\\":1}}\",\"extra\":2}";
        System.out.println(s);
        if (s.contains("\\")) {
            s = s.replace("\\", "");
        }
        if (s.contains(":\"")) {
            s = s.replace(":\"", ":");
        }
        if (s.contains("}\"")) {
            s = s.replace("}\"", "}");
        }

        System.out.println(s);
    }

    @Test
    public void testTimeStamp() {
        Date date = new Date();
        long timeStamp = date.getTime() / 1000;

        String time = String.valueOf(timeStamp);
        System.out.println(time);

        System.out.println(time.substring(2, time.length()));

    }

    @Test
    public void trimTest() {
        String s = "haha；";
        String result = "";
        if (null != s && !"".equals(s)) {
            result = s.replaceAll("^[　*| *| *|//s*]*", "").replaceAll("[　*| *| *|//s*]*$", "");
        }
        System.out.println(result);
    }

    @Test
    public void testZero() {
        System.out.println(0 % 2);
        System.out.println(1 % 2);
        System.out.println(2 % 2);
        System.out.println(3 % 2);
    }

    class Message {
        long time;
        boolean isShowTime = false;

        @Override
        public String toString() {
            return time + ",is:" + isShowTime;
        }
    }

    @Test
    public void testPickGroup() {
        List<Message> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Message message = new Message();
            if (i < 4) {
                message.time = i;
            } else if (i >= 4 && i < 7) {
                message.time = i + 10;
            } else {
                message.time = i + 20;
            }
            data.add(message);
        }

        System.out.println(data);

        //间隔十分钟
        int timeInterval = 10;

        Message mFlag = data.get(data.size() - 1);
        for (int i = data.size() - 1; i >= 0; i--) {
            Message m = data.get(i);

            if (mFlag.time - m.time <= timeInterval) {
                System.out.println("bingo i:" + i);
            } else {
                //标记上一个item显示时间
                int preIndex = i + 1;

                System.out.println("i:" + i + ",preIndex:" + preIndex);

                //标记下一个待比较数据
                int nextFlagIndex = i - 1;
                if (nextFlagIndex < 0) {
                    nextFlagIndex = 0;
                }
                mFlag = data.get(nextFlagIndex);
            }
        }
    }

    /**
     * 时间格式化 今天，昨天，更早
     */
    @Test
    public void testTimeFormat() throws ParseException {
        System.out.println(IMTimeFormat(1544430687000L));
    }

    public static String IMTimeFormat(long time) throws ParseException {
        Date date = new Date(time);
        boolean isToday = TimeUtils.isToday(time);
        int isYeaterday = TimeUtils.isYeaterday(date, null);
        if (isToday) {
            return "今天 " + new SimpleDateFormat("ahh:mm").format(date);
        } else if (isYeaterday == 0) {
            return "昨天 " + new SimpleDateFormat("ahh:mm").format(date);
        } else {
            return new SimpleDateFormat("yyyy/MM/dd").format(date);
        }
    }

    /**
     * 计算比例关系
     */
    @Test
    public void testRatio() {
        int height = 120;
        int width = 120;

//        float imageRatio = 16.0f / 9.0f;
        float imageRatio = 16.0f / 9.0f;

        //长图
        if (imageRatio > (16.0f / 9.0f)) {
            height = 540;
            width = (int) (height / imageRatio);
        } else if (imageRatio > (3.0f / 4.0f) && imageRatio <= (16.0f / 9.0f)) {
            height = 540;
            width = (int) (height / imageRatio);
        } else {
            width = 720;
            height = (int) (width * imageRatio);
        }
        System.out.println("123" + "height:" + height + ",width:" + width);
    }

    @Test
    public void testRatio2() {
        float maxDuratio = 60.f;
        int maxProgress = 220 - 70;

        int x1 = (int) (maxProgress / maxDuratio * 2);
        System.out.println(x1);

        int x2 = (int) (maxProgress / maxDuratio * 20);
        System.out.println(x2);

        int x3 = (int) (maxProgress / maxDuratio * 30);
        System.out.println(x3);

        int x4 = (int) (maxProgress / maxDuratio * 40);
        System.out.println(x4);

        int x5 = (int) (maxProgress / maxDuratio * 50);
        System.out.println(x5);

        int x6 = (int) (maxProgress / maxDuratio * 60);
        System.out.println(x6);

    }

    @Test
    public void test45() {
        float f = 10.62f;
        int i = (int) Math.ceil(f);
        System.out.println(i);

        double ceil = Math.ceil(0);
        System.out.println(ceil);
    }

    @Test
    public void testSort() {
        Random random = new Random(24);
        List<Integer> times = new ArrayList();

        times.add(random.nextInt(100));
        times.add(random.nextInt(100));
        times.add(random.nextInt(100));
        times.add(random.nextInt(100));
        times.add(random.nextInt(100));

        System.out.println(times);

        for (int i = 0; i < times.size(); i++) {
            for (int j = 1; j < times.size() - i - 1; j++) {
                if (times.get(i) < times.get(j)) {
                    Integer temp = times.get(i);
                    times.set(i, times.get(j));
                    times.set(j, temp);
                }
            }
        }

        System.out.println(times);
    }

    /**
     * 测试% 计算符号
     */
    @Test
    public void test5() {
        int index = 1;
        int count = 5;

        for (int i = 0; i < 10; i++) {
            int temp = index % count;
            System.out.println(temp);
            index++;
        }
    }


    /**
     * 测试引用在数组里面的值
     */
    @Test
    public void test6() {
        class Result {
            private int count = 0;
            private String name;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "name:" + name + ",count:" + count;
            }
        }


        Result result = new Result();
        result.setCount(0);
        result.setName("result");

        List<Result> mlist = new ArrayList<>();
        mlist.add(result);
        mlist.add(result);

        for (Result r : mlist) {
            System.out.println(r);
        }

        Result result1 = mlist.get(0);
        result1.setName("new Name");
        result1.setCount(1);


        for (Result r : mlist) {
            System.out.println(r);
        }
    }
}
