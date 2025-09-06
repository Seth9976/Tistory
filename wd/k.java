package wd;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public static final k w;

    static {
        k.w = new k(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((File)object0), "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(((IOException)object1), "exception");
        throw (IOException)object1;
    }
}

