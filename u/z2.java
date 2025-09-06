package u;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z2 extends Lambda implements Function2 {
    public static final z2 w;

    static {
        z2.w = new z2(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return ((ScrollState)object1).getValue();
    }
}

