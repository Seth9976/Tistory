package p0;

import androidx.compose.material.DismissDirection;
import androidx.compose.material.FixedThreshold;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n9 extends Lambda implements Function1 {
    public static final n9 w;

    static {
        n9.w = new n9(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DismissDirection dismissDirection0 = (DismissDirection)object0;
        return new FixedThreshold(56.0f, null);
    }
}

