package ga;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class d extends Lambda implements Function4 {
    public final float w;

    public d(float f) {
        this.w = f;
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
            ComposerKt.traceEventStart(-2042460318, v2, -1, "com.kakao.kandinsky.filter.ui.FilterMenu.<anonymous> (FilterMenu.kt:39)");
        }
        if(z && v != 0) {
            String s = String.valueOf(c.roundToInt(this.w * 100.0f));
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object2), MaterialTheme.$stable).getHeadlineMedium();
            TextKt.Text--4IGK_g(s, null, MaterialTheme.INSTANCE.getColorScheme(((Composer)object2), MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object2), 0, 0, 0xFFFA);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

