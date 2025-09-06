package wd;

import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class e extends b {
    public boolean b;
    public File[] c;
    public int d;
    public final f e;

    public e(f f0, File file0) {
        Intrinsics.checkNotNullParameter(file0, "rootDir");
        this.e = f0;
        super(file0);
    }

    @Override  // wd.g
    public final File a() {
        f f0 = this.e;
        File file0 = this.a;
        if(!this.b) {
            Function1 function10 = f0.d.c;
            if(function10 != null && !((Boolean)function10.invoke(file0)).booleanValue()) {
                return null;
            }
            this.b = true;
            return file0;
        }
        File[] arr_file = this.c;
        if(arr_file != null) {
            int v = this.d;
            Intrinsics.checkNotNull(arr_file);
            if(v >= arr_file.length) {
                Function1 function11 = f0.d.d;
                if(function11 != null) {
                    function11.invoke(file0);
                }
                return null;
            }
        }
        if(this.c == null) {
            File[] arr_file1 = file0.listFiles();
            this.c = arr_file1;
            if(arr_file1 == null) {
                Function2 function20 = f0.d.e;
                if(function20 != null) {
                    function20.invoke(file0, new AccessDeniedException(this.a, null, "Cannot list files in a directory", 2, null));
                }
            }
            File[] arr_file2 = this.c;
            if(arr_file2 == null) {
                goto label_28;
            }
            Intrinsics.checkNotNull(arr_file2);
            if(arr_file2.length == 0) {
            label_28:
                Function1 function12 = f0.d.d;
                if(function12 != null) {
                    function12.invoke(file0);
                }
                return null;
            }
        }
        File[] arr_file3 = this.c;
        Intrinsics.checkNotNull(arr_file3);
        int v1 = this.d;
        this.d = v1 + 1;
        return arr_file3[v1];
    }
}

