package ca;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function3 {
    public final boolean w;
    public final boolean x;
    public final String y;

    public y(String s, boolean z, boolean z1) {
        this.w = z;
        this.x = z1;
        this.y = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        TextStyle textStyle0;
        long v1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$KDButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x25173181, v, -1, "com.kakao.kandinsky.designsystem.common.BottomBarFeatureTypeText.<anonymous> (FeatureBottomBar.kt:109)");
        }
        boolean z = this.x;
        boolean z1 = this.w;
        if(z1 || !z) {
            ((Composer)object1).startReplaceGroup(0x82D59D6);
            v1 = MaterialTheme.INSTANCE.getColorScheme(((Composer)object1), MaterialTheme.$stable).getSecondary-0d7_KjU();
        }
        else {
            ((Composer)object1).startReplaceGroup(0x82D59FF);
            v1 = MaterialTheme.INSTANCE.getColorScheme(((Composer)object1), MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
        }
        ((Composer)object1).endReplaceGroup();
        if(z1 || !z) {
            ((Composer)object1).startReplaceGroup(0x82D5A63);
            textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getHeadlineMedium();
        }
        else {
            ((Composer)object1).startReplaceGroup(137190032);
            textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getHeadlineSmall();
        }
        ((Composer)object1).endReplaceGroup();
        TextAlign textAlign0 = TextAlign.box-impl(3);
        TextKt.Text--4IGK_g(this.y, null, v1, 0L, null, null, null, 0L, null, textAlign0, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0, 0xFDFA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

