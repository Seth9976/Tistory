package da;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.room.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public final int w;
    public static final b x;
    public static final b y;

    static {
        b.x = new b(3, 0);
        b.y = new b(3, 1);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = a.c(((Number)object2), ((Modifier)object0), "$this$null", ((Composer)object1), 0xCEF33BDE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCEF33BDE, v, -1, "com.kakao.kandinsky.designsystem.theme.byOrientation.<anonymous> (Orientation.kt:25)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ((Composer)object1).endReplaceGroup();
            return (Modifier)object0;
        }
        int v1 = a.c(((Number)object2), ((Modifier)object0), "$this$null", ((Composer)object1), 0x198E6894);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x198E6894, v1, -1, "com.kakao.kandinsky.designsystem.theme.byOrientation.<anonymous> (Orientation.kt:24)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return (Modifier)object0;
    }
}

