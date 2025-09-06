package wd;

import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class c extends b {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final f f;

    public c(f f0, File file0) {
        Intrinsics.checkNotNullParameter(file0, "rootDir");
        this.f = f0;
        super(file0);
    }

    @Override  // wd.g
    public final File a() {
        f f0 = this.f;
        File file0 = this.a;
        if(!this.e && this.c == null) {
            Function1 function10 = f0.d.c;
            if(function10 != null && !((Boolean)function10.invoke(file0)).booleanValue()) {
                return null;
            }
            File[] arr_file = file0.listFiles();
            this.c = arr_file;
            if(arr_file == null) {
                Function2 function20 = f0.d.e;
                if(function20 != null) {
                    function20.invoke(file0, new AccessDeniedException(this.a, null, "Cannot list files in a directory", 2, null));
                }
                this.e = true;
            }
        }
        File[] arr_file1 = this.c;
        if(arr_file1 != null) {
            int v = this.d;
            Intrinsics.checkNotNull(arr_file1);
            if(v < arr_file1.length) {
                File[] arr_file2 = this.c;
                Intrinsics.checkNotNull(arr_file2);
                int v1 = this.d;
                this.d = v1 + 1;
                return arr_file2[v1];
            }
        }
        if(!this.b) {
            this.b = true;
            return file0;
        }
        Function1 function11 = f0.d.d;
        if(function11 != null) {
            function11.invoke(file0);
        }
        return null;
    }
}

