package a;

import b.d;
import b.s;
import com.kakao.kandinsky.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c2 extends Lambda implements Function1 {
    public final b a;

    public c2(b b0) {
        this.a = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((s)object0), "it");
        d d0 = new d(((s)object0));
        this.a.sendIntent(d0);
        return Unit.INSTANCE;
    }
}

