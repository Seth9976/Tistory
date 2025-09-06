package sa;

import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class h extends Lambda implements Function2 {
    public static final h w;

    static {
        h.w = new h(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).floatValue();
        Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$KDSlider");
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "image-tab", "transparency-degree", null, 8, null);
        return Unit.INSTANCE;
    }
}

