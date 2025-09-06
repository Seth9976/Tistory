package n6;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function4 {
    public static final e w;

    static {
        e.w = new e(4);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        Composer composer0 = (Composer)object2;
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$$receiver");
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object1), "it");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCF243659, v, -1, "com.google.accompanist.navigation.material.ComposableSingletons$BottomSheetNavigatorKt.lambda-1.<anonymous> (BottomSheetNavigator.kt:225)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

