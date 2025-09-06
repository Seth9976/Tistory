package a;

import b.n;
import com.kakao.kandinsky.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b2 extends Lambda implements Function1 {
    public final b a;

    public b2(b b0) {
        this.a = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "it");
        n n0 = new n(((List)object0));
        this.a.sendIntent(n0);
        return Unit.INSTANCE;
    }
}

