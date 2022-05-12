package crayon.jni;

public class JNITest {
    static{
        System.loadLibrary("JNITest3");
    }
    public native static void set(int i);
    public native static int get();
}
