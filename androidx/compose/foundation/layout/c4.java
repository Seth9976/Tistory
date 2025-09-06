package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class c4 extends Lambda implements Function3 {
    public static final c4 w;

    static {
        c4.w = new c4(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0xE9F29258);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE9F29258, v, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:80)");
        }
        Modifier modifier0 = NestedScrollModifierKt.nestedScroll$default(((Modifier)object0), WindowInsetsConnection_androidKt.rememberWindowInsetsConnection-VRgvIgI(WindowInsetsHolder.Companion.current(((Composer)object1), 6).getIme(), 0x20, ((Composer)object1), 0x30), null, 2, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

