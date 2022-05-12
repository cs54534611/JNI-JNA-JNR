package crayon.jna;

public class TestJNA {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        int i;int j;
        for(i=0;i<1000;i++){
            for(j=0;j<1000;j++){
                JNATest.INSTANCE.set(i*j);
                JNATest.INSTANCE.get();
            }
        }
        long totalTime = System.currentTimeMillis()-beginTime;
        System.out.println("JNI消耗的总时间（ms）："+totalTime);
    }
}
