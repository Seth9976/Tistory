package ke;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;

public final class f extends Lambda implements Function1 {
    public static final f w;

    static {
        f.w = new f(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PackageFragmentDescriptor)object0), "it");
        return ((PackageFragmentDescriptor)object0).getFqName();
    }
}

