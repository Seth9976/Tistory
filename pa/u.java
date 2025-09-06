package pa;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function3 {
    public final boolean w;
    public final String x;

    public u(boolean z, String s) {
        this.w = z;
        this.x = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$KDButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x86C7EF4F, v, -1, "com.kakao.kandinsky.resize.ResizeTypeButton.<anonymous> (ReSizeScreen.kt:464)");
        }
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getBodyMedium();
        FontWeight fontWeight0 = this.w ? FontWeight.Companion.getBold() : null;
        TextAlign textAlign0 = TextAlign.box-impl(3);
        TextKt.Text--4IGK_g(this.x, null, 0L, 0L, null, fontWeight0, null, 0L, null, textAlign0, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0, 0xFDDE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

