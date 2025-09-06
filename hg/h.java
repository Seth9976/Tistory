package hg;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class h {
    public volatile SoftReference a;

    public final Object a(Function0 function00) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(function00, "factory");
            Object object0 = this.a.get();
            if(object0 != null) {
                return object0;
            }
            Object object1 = function00.invoke();
            this.a = new SoftReference(object1);
            return object1;
        }
    }
}

