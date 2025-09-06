package w3;

import androidx.datastore.core.InterProcessCoordinator_jvmKt;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public static final c0 w;

    static {
        c0.w = new c0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((File)object0), "it");
        return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(((File)object0));
    }
}

