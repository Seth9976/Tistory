package d6;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public int a;
    public int b;
    public final ArrayList c;
    public Object d;

    public c() {
        this.a = 0x40;
        this.c = new ArrayList();
    }

    public c(HashMap hashMap0) {
        this.d = hashMap0;
        this.c = new ArrayList(hashMap0.keySet());
        for(Object object0: hashMap0.values()) {
            this.a = ((int)(((Integer)object0))) + this.a;
        }
    }

    public void a(Exception exception0) {
        Intrinsics.checkNotNullParameter(exception0, "exception");
        ++this.b;
        ArrayList arrayList0 = this.c;
        if(arrayList0.size() < this.a) {
            if(((Path)this.d) != null) {
                Throwable throwable0 = new FileSystemException(String.valueOf(((Path)this.d))).initCause(exception0);
                Intrinsics.checkNotNull(throwable0, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception0 = (FileSystemException)throwable0;
            }
            arrayList0.add(exception0);
        }
    }
}

