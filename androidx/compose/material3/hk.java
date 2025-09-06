package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class hk extends Lambda implements Function2 {
    public static final hk w;

    static {
        hk.w = new hk(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return ((SheetState)object1).getCurrentValue();
    }
}

