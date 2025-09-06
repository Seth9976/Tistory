package o4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public static final b w;

    static {
        b.w = new b(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object0;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092249270, v, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:58)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

