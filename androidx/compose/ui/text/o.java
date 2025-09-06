package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public static final o w;

    static {
        o.w = new o(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        ArrayList arrayList0 = new ArrayList(((List)object0).size());
        int v = ((List)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = ((List)object0).get(v1);
            Saver saver0 = SaversKt.c;
            Range annotatedString$Range0 = Intrinsics.areEqual(object1, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver) || object1 == null ? null : ((Range)saver0.restore(object1));
            Intrinsics.checkNotNull(annotatedString$Range0);
            arrayList0.add(annotatedString$Range0);
        }
        return arrayList0;
    }
}

