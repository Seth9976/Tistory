package x9;

import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class b extends Lambda implements Function2 {
    public static final b w;

    static {
        b.w = new b(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).floatValue();
        Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$KDSlider");
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "crop-tab", "rotate-angle", null, null, 12, null);
        return Unit.INSTANCE;
    }
}

