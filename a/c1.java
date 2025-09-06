package a;

import b.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function0 {
    public final b0 a;

    public c1(b0 b00) {
        this.a = b00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.n.invoke();
        return Unit.INSTANCE;
    }
}

