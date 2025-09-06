package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final String w;
    public final String x;

    public x(String s, String s1) {
        this.w = s;
        this.x = s1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FunctionEnhancementBuilder)object0), "$this$function");
        ((FunctionEnhancementBuilder)object0).parameter(this.w, new JavaTypeQualifiers[]{PredefinedEnhancementInfoKt.a});
        ((FunctionEnhancementBuilder)object0).returns(this.x, new JavaTypeQualifiers[]{PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c});
        return Unit.INSTANCE;
    }
}

