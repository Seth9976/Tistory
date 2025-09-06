package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

public final class h extends Lambda implements Function1 {
    public final SignatureBuildingComponents w;

    public h(SignatureBuildingComponents signatureBuildingComponents0) {
        this.w = signatureBuildingComponents0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FunctionEnhancementBuilder)object0), "$this$function");
        ((FunctionEnhancementBuilder)object0).returns("java/util/Spliterator", new JavaTypeQualifiers[]{PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b});
        return Unit.INSTANCE;
    }
}

