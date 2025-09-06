package va;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public static final g w;

    static {
        g.w = new g(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        ((Composer)object0).startReplaceGroup(0xFD183347);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFD183347, v, -1, "com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheet.<anonymous>.<anonymous> (SavedSignatureBottomSheet.kt:77)");
        }
        WindowInsets windowInsets0 = WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object0).endReplaceGroup();
        return windowInsets0;
    }
}

