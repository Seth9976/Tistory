package b;

import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public static final v a;

    static {
        v.a = new v();
    }

    public v() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KDPhoto)object0), "it");
        return Unit.INSTANCE;
    }
}

