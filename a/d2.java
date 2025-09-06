package a;

import b.i;
import com.kakao.kandinsky.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d2 extends Lambda implements Function0 {
    public final b a;

    public d2(b b0) {
        this.a = b0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(i.a);
        return Unit.INSTANCE;
    }
}

