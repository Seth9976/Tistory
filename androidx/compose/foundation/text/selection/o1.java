package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function2 {
    public static final o1 w;

    static {
        o1.w = new o1(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return ((SelectionRegistrarImpl)object1).d.get();
    }
}

