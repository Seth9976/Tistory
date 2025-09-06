package androidx.compose.material3;

import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class zj extends Lambda implements Function2 {
    public final int w;
    public final Function2 x;
    public final Function2 y;
    public final int z;

    public zj(Function2 function20, Function2 function21, int v, int v1) {
        this.w = v1;
        this.x = function20;
        this.y = function21;
        this.z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                SegmentedButtonKt.access$SegmentedButtonContent(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                TabKt.access$TabBaselineLayout(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                SnackbarKt.access$NewLineButtonSnackbar(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                SnackbarKt.access$OneRowSnackbar(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            default: {
                androidx.compose.material.TabKt.access$TabBaselineLayout(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

