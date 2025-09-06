package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public static final a w;

    static {
        a.w = new a(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceLoader serviceLoader0 = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
        Intrinsics.checkNotNullExpressionValue(serviceLoader0, "implementations");
        BuiltInsLoader builtInsLoader0 = (BuiltInsLoader)CollectionsKt___CollectionsKt.firstOrNull(serviceLoader0);
        if(builtInsLoader0 == null) {
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return builtInsLoader0;
    }
}

