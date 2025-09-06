package d0;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function2 {
    public static final e0 w;

    static {
        e0.w = new e0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        Map map0 = ((f0)object1).performSave();
        return map0.isEmpty() ? null : map0;
    }
}

