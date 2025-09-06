package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class kd extends Lambda implements Function2 {
    public static final kd w;

    static {
        kd.w = new kd(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        ((Composer)object0).startReplaceGroup(0x37C7584);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x37C7584, v, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
        }
        WindowInsets windowInsets0 = BottomSheetDefaults.INSTANCE.getWindowInsets(((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object0).endReplaceGroup();
        return windowInsets0;
    }
}

