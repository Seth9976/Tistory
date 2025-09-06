package vc;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class a extends FunctionReferenceImpl implements Function1 {
    public static final a a;

    static {
        a.a = new a(1, b.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListItemInfo)object0), "p0");
        return new b(((LazyListItemInfo)object0));
    }
}

