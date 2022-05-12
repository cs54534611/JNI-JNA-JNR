package crayon.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface JNATest extends Library {
    //JNATest INSTANCE = (JNATest) Native.loadLibrary(
    //       "C:/Program Files/Java/jdk-18.0.1.1/bin/JNATest", JNATest.class);
    JNATest INSTANCE = Native.load("C:/Program Files/Java/jdk-18.0.1.1/bin/JNATest", JNATest.class);
    public void set(int i);
    public int get();
}
