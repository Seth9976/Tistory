package zf;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final Constructor x;

    public b(Constructor constructor0, int v) {
        this.w = v;
        this.x = constructor0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Object object2 = this.x.newInstance(((Throwable)object0).getMessage(), ((Throwable)object0));
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable)object2;
            }
            case 1: {
                Object object3 = this.x.newInstance(((Throwable)object0).getMessage());
                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Throwable");
                ((Throwable)object3).initCause(((Throwable)object0));
                return (Throwable)object3;
            }
            case 2: {
                Object object4 = this.x.newInstance(((Throwable)object0));
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable)object4;
            }
            default: {
                Object object1 = this.x.newInstance(null);
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Throwable");
                ((Throwable)object1).initCause(((Throwable)object0));
                return (Throwable)object1;
            }
        }
    }
}

