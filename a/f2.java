package a;

import b.e;
import com.kakao.kandinsky.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f2 extends Lambda implements Function0 {
    public final b a;

    public f2(b b0) {
        this.a = b0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(e.a);
        return Unit.INSTANCE;
    }
}

