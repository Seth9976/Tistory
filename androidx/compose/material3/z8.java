package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z8 extends Lambda implements Function2 {
    public static final z8 w;

    static {
        z8.w = new z8(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return ((DrawerState)object1).getCurrentValue();
    }
}

