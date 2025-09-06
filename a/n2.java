package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

public final class n2 extends Lambda implements Function1 {
    public static final n2 a;

    static {
        n2.a = new n2();
    }

    public n2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((JsonBuilder)object0), "$this$Json");
        ((JsonBuilder)object0).setSerializersModule(o2.a);
        return Unit.INSTANCE;
    }
}

