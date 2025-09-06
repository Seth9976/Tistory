package eb;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.ColorPanelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class a extends Lambda implements Function4 {
    public final InputState w;

    public a(InputState inputState0) {
        this.w = inputState0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 14) == 0 ? (((Composer)object2).changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v2 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7DC049EC, v2, -1, "com.kakao.kandinsky.textedit.ui.ColorPanel.<anonymous>.<anonymous> (ColorPanel.kt:42)");
        }
        if(z) {
            j j0 = (j)ColorPanelKt.a.get(v);
            String s = String.valueOf(c.roundToInt(((Number)this.w.getValue()).floatValue()));
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object2), MaterialTheme.$stable).getHeadlineMedium();
            TextKt.Text--4IGK_g(s, null, (j0.b ? Color.copy-wmQWz5c$default(0xFFFFFFFF00000000L, 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : 0xFF00000000000000L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object2), 0, 0, 0xFFFA);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

