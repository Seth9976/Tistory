package ya;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.room.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function3 {
    public final int w;
    public static final e x;
    public static final e y;

    static {
        e.x = new e(3, 0);
        e.y = new e(3, 1);
    }

    public e(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 1041967754);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1041967754, v, -1, "com.kakao.kandinsky.sticker.ui.StickerList.<anonymous> (StickerList.kt:52)");
            }
            Modifier modifier0 = SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(((Modifier)object0), 220.0f), 0.0f, 1, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ((Composer)object1).endReplaceGroup();
            return modifier0;
        }
        int v1 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x5052C76B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5052C76B, v1, -1, "com.kakao.kandinsky.sticker.ui.StickerList.<anonymous> (StickerList.kt:51)");
        }
        Modifier modifier1 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(((Modifier)object0), 200.0f), 0.0f, 1, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

