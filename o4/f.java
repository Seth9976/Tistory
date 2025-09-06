package o4;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public static final f w;

    static {
        f.w = new f(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return ((NavHostController)object1).saveState();
    }
}

