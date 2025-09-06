package a;

import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function1 {
    public static final g0 a;

    static {
        g0.a = new g0();
    }

    public g0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KDPhoto)object0), "it");
        return ((KDPhoto)object0).getOriginalUri();
    }
}

