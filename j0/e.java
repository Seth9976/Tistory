package j0;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function3 {
    public static final e w;

    static {
        e.w = new e(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0x813A1807);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x813A1807, v, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
        }
        long v1 = ((TextSelectionColors)((Composer)object1).consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getHandleColor-0d7_KjU();
        Companion modifier$Companion0 = Modifier.Companion;
        boolean z = ((Composer)object1).changed(v1);
        d d0 = ((Composer)object1).rememberedValue();
        if(z || d0 == Composer.Companion.getEmpty()) {
            d0 = new d(v1);
            ((Composer)object1).updateRememberedValue(d0);
        }
        Modifier modifier0 = ((Modifier)object0).then(DrawModifierKt.drawWithCache(modifier$Companion0, d0));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

