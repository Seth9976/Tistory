package o4;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function4 {
    public static final a w;

    static {
        a.w = new a(4);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        AnimatedContentScope animatedContentScope0 = (AnimatedContentScope)object0;
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object1;
        Composer composer0 = (Composer)object2;
        int v = ((Number)object3).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x798B76F, v, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda-1.<anonymous> (ComposeNavigator.kt:59)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

