package aa;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.decoration.ControlKt;
import com.kakao.kandinsky.decoration.DecorationRect;
import com.kakao.kandinsky.decoration.DecorationStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function5 {
    public final DecorationStatus w;
    public final Function3 x;

    public d0(DecorationStatus decorationStatus0, Function3 function30) {
        this.w = decorationStatus0;
        this.x = function30;
        super(5);
    }

    @Override  // kotlin.jvm.functions.Function5
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        long v = ((Size)object1).unbox-impl();
        int v1 = ((Number)object4).intValue();
        Intrinsics.checkNotNullParameter(((Modifier)object0), "modifier");
        Intrinsics.checkNotNullParameter(((DecorationRect)object2), "decorationRect");
        int v2 = (v1 & 14) == 0 ? (((Composer)object3).changed(((Modifier)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (((Composer)object3).changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (((Composer)object3).changed(((DecorationRect)object2)) ? 0x100 : 0x80);
        }
        if((v2 & 5851) == 1170 && ((Composer)object3).getSkipping()) {
            ((Composer)object3).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(478661830, v2, -1, "com.kakao.kandinsky.decoration.DecorationBox.<anonymous> (DecorationBox.kt:49)");
        }
        boolean z = false;
        boolean z1 = this.w == DecorationStatus.Selected;
        ((Composer)object3).startReplaceGroup(-1125307811);
        c0 c00 = ((Composer)object3).rememberedValue();
        if((v2 & 0x380) == 0x100 || c00 == Composer.Companion.getEmpty()) {
            c00 = new c0(((DecorationRect)object2), 0);
            ((Composer)object3).updateRememberedValue(c00);
        }
        ((Composer)object3).endReplaceGroup();
        ((Composer)object3).startReplaceGroup(-1125307756);
        c0 c01 = ((Composer)object3).rememberedValue();
        if((v2 & 0x380) == 0x100 || c01 == Composer.Companion.getEmpty()) {
            c01 = new c0(((DecorationRect)object2), 1);
            ((Composer)object3).updateRememberedValue(c01);
        }
        ((Composer)object3).endReplaceGroup();
        ((Composer)object3).startReplaceGroup(0xBCED2AE1);
        if((v2 & 0x380) == 0x100) {
            z = true;
        }
        c0 c02 = ((Composer)object3).rememberedValue();
        if(z || c02 == Composer.Companion.getEmpty()) {
            c02 = new c0(((DecorationRect)object2), 2);
            ((Composer)object3).updateRememberedValue(c02);
        }
        ((Composer)object3).endReplaceGroup();
        ControlKt.ContentMoveControl-dBrA5TM(((Modifier)object0), z1, v, c00, c01, c02, this.x, ((Composer)object3), v2 & 14 | v2 << 3 & 0x380, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

