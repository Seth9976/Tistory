package hg;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;

public final class c extends ClassValue {
    @Override
    public final Object computeValue(Class class0) {
        Intrinsics.checkNotNullParameter(class0, "type");
        h h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
        h0.a = new SoftReference(null);
        return h0;
    }
}

