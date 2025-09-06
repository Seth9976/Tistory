package a6;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class e {
    public static final Charset a;
    public static final Charset b;

    static {
        e.a = Charset.forName("US-ASCII");
        e.b = Charset.forName("UTF-8");
    }

    public static void a(File file0) {
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            throw new IOException("not a readable directory: " + file0);
        }
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            if(file1.isDirectory()) {
                e.a(file1);
            }
            if(!file1.delete()) {
                throw new IOException("failed to delete file: " + file1);
            }
        }
    }
}

