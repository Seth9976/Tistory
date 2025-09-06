package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class uj extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final int w;
    public final Modifier x;
    public final float y;
    public final Function3 z;

    public uj(Modifier modifier0, float f, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = modifier0;
        this.y = f;
        this.z = function30;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SegmentedButtonKt.SingleChoiceSegmentedButtonRow-uFdPcIQ(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SegmentedButtonKt.MultiChoiceSegmentedButtonRow-uFdPcIQ(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
        return Unit.INSTANCE;
    }
}

