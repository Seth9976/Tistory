package a;

import b.l;
import com.kakao.kandinsky.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class z1 extends Lambda implements Function1 {
    public final b a;

    public z1(b b0) {
        this.a = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        l l0 = new l(((Number)object0).intValue());
        this.a.sendIntent(l0);
        return Unit.INSTANCE;
    }
}

