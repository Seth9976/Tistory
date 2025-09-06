package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p3 extends Lambda implements Function2 {
    public final Function2 A;
    public final ChipColors B;
    public final boolean C;
    public final float D;
    public final PaddingValues E;
    public final Function2 w;
    public final TextStyle x;
    public final long y;
    public final Function2 z;

    public p3(Function2 function20, TextStyle textStyle0, long v, Function2 function21, Function2 function22, ChipColors chipColors0, boolean z, float f, PaddingValues paddingValues0) {
        this.w = function20;
        this.x = textStyle0;
        this.y = v;
        this.z = function21;
        this.A = function22;
        this.B = chipColors0;
        this.C = z;
        this.D = f;
        this.E = paddingValues0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x89A09D64, v, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1976)");
        }
        long v1 = this.B.leadingIconContentColor-vNxB06k$material3_release(this.C);
        long v2 = this.B.trailingIconContentColor-vNxB06k$material3_release(this.C);
        ChipKt.access$ChipContent-fe0OD_I(this.w, this.x, this.y, this.z, null, this.A, v1, v2, this.D, this.E, ((Composer)object0), 0x6000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

