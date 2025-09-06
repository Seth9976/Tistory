package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public static final j A;
    public final int w;
    public static final j x;
    public static final j y;
    public static final j z;

    static {
        j.x = new j(1, 0);
        j.y = new j(1, 1);
        j.z = new j(1, 2);
        j.A = new j(1, 3);
    }

    public j(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((String)object0), "line");
                return (String)object0;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((CharSequence)object0), "it");
                return ((CharSequence)object0).toString();
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((CharSequence)object0), "it");
                return ((CharSequence)object0).toString();
            }
            default: {
                Intrinsics.checkNotNullParameter(((CharSequence)object0), "it");
                return ((CharSequence)object0).toString();
            }
        }
    }
}

