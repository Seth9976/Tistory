package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c4 extends Lambda implements Function2 {
    public final TextStyle A;
    public final Function2 B;
    public final Function2 C;
    public final Function2 D;
    public final float E;
    public final PaddingValues F;
    public final SelectableChipColors w;
    public final boolean x;
    public final boolean y;
    public final Function2 z;

    public c4(SelectableChipColors selectableChipColors0, boolean z, boolean z1, Function2 function20, TextStyle textStyle0, Function2 function21, Function2 function22, Function2 function23, float f, PaddingValues paddingValues0) {
        this.w = selectableChipColors0;
        this.x = z;
        this.y = z1;
        this.z = function20;
        this.A = textStyle0;
        this.B = function21;
        this.C = function22;
        this.D = function23;
        this.E = f;
        this.F = paddingValues0;
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
            ComposerKt.traceEventStart(0xDD924C22, v, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2024)");
        }
        long v1 = this.w.labelColor-WaAFU9c$material3_release(this.x, this.y);
        long v2 = this.w.leadingIconContentColor-WaAFU9c$material3_release(this.x, this.y);
        long v3 = this.w.trailingIconContentColor-WaAFU9c$material3_release(this.x, this.y);
        ChipKt.access$ChipContent-fe0OD_I(this.z, this.A, v1, this.B, this.C, this.D, v2, v3, this.E, this.F, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

