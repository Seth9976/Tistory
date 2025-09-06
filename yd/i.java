package yd;

import java.nio.file.Path;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function3 {
    public final int w;
    public static final i x;
    public static final i y;

    static {
        i.x = new i(3, 0);
        i.y = new i(3, 1);
    }

    public i(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Path)object0), "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(((Path)object1), "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(((Exception)object2), "exception");
            throw (Exception)object2;
        }
        Intrinsics.checkNotNullParameter(((Path)object0), "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(((Path)object1), "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(((Exception)object2), "exception");
        throw (Exception)object2;
    }
}

