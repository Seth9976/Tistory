package p6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function4 {
    public static final b w;

    static {
        b.w = new b(4);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        float f = ((Dp)object1).unbox-impl();
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((SwipeRefreshState)object0), "s");
        int v1 = (v & 14) == 0 ? (((Composer)object2).changed(((SwipeRefreshState)object0)) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(f) ? 0x20 : 16);
        }
        if((v1 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA34E0E41, v1, -1, "com.google.accompanist.swiperefresh.ComposableSingletons$SwipeRefreshKt.lambda-1.<anonymous> (SwipeRefresh.kt:267)");
        }
        SwipeRefreshIndicatorKt.SwipeRefreshIndicator-_UAkqwU(((SwipeRefreshState)object0), f, null, false, false, false, 0L, 0L, null, 0.0f, false, 0.0f, ((Composer)object2), v1 & 0x7E, 0, 0xFFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

