package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final String w;

    public a0(String s) {
        this.w = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FunctionEnhancementBuilder)object0), "$this$function");
        JavaTypeQualifiers[] arr_javaTypeQualifiers = {PredefinedEnhancementInfoKt.a};
        ((FunctionEnhancementBuilder)object0).returns(this.w, arr_javaTypeQualifiers);
        return Unit.INSTANCE;
    }
}

