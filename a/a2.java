package a;

import b.o;
import com.kakao.kandinsky.b;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a2 extends Lambda implements Function1 {
    public final b a;

    public a2(b b0) {
        this.a = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KDPhoto)object0), "it");
        o o0 = new o(((KDPhoto)object0));
        this.a.sendIntent(o0);
        return Unit.INSTANCE;
    }
}

