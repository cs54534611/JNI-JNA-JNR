package crayon.jna;
import jnr.ffi.LibraryLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class JNRTest {
    public interface LibC {
        public void set(int i);
        public int get();
    }

    public static void main(String[] args) {
        LibC libc = LibraryLoader.create(LibC.class).load("lib/JNRTest");
        long beginTime = System.currentTimeMillis();
        int i;int j;
        for(i=0;i<1000;i++){
            for(j=0;j<1000;j++){
                libc.set(i*j);
                libc.get();
            }
        }
        long totalTime = System.currentTimeMillis()-beginTime;
        System.out.println("JNI消耗的总时间（ms）："+totalTime);
    }
}
