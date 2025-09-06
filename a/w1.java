package a;

import b.b0;
import b.o;
import com.kakao.kandinsky.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function0 {
    public final b a;
    public final b0 b;

    public w1(b b0, b0 b00) {
        this.a = b0;
        this.b = b00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o o0 = new o(this.b.o.reset());
        this.a.sendIntent(o0);
        return Unit.INSTANCE;
    }
}

