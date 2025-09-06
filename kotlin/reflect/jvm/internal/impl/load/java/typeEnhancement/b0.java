package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public final class b0 extends Lambda implements Function1 {
    public final String w;

    public b0(String s) {
        this.w = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FunctionEnhancementBuilder)object0), "$this$function");
        JavaTypeQualifiers[] arr_javaTypeQualifiers = {PredefinedEnhancementInfoKt.b};
        ((FunctionEnhancementBuilder)object0).parameter(this.w, arr_javaTypeQualifiers);
        ((FunctionEnhancementBuilder)object0).returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }
}

