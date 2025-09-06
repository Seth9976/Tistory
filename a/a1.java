package a;

import b.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function1 {
    public final b0 a;

    public a1(b0 b00) {
        this.a = b00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.h.invoke(((Number)object0).intValue());
        return Unit.INSTANCE;
    }
}

