package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class vd extends Lambda implements Function2 {
    public static final vd w;

    static {
        vd.w = new vd(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        ((Composer)object0).startReplaceGroup(-11444670);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-11444670, v, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:212)");
        }
        WindowInsets windowInsets0 = BottomSheetDefaults.INSTANCE.getWindowInsets(((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object0).endReplaceGroup();
        return windowInsets0;
    }
}

