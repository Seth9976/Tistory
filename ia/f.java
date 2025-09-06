package ia;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.room.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function3 {
    public static final f w;

    static {
        f.w = new f(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x61E9AC0E);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x61E9AC0E, v, -1, "com.kakao.kandinsky.home.BottomBar.<anonymous> (HomeScreen.kt:207)");
        }
        Modifier modifier0 = SizeKt.height-3ABfNKs(((Modifier)object0), 108.0f);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

