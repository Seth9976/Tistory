package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class cm extends Lambda implements Function2 {
    public final TextStyle A;
    public final long B;
    public final long C;
    public final int D;
    public final int w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public cm(Function2 function20, Function2 function21, Function2 function22, TextStyle textStyle0, long v, long v1, int v2, int v3) {
        this.w = v3;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.A = textStyle0;
        this.B = v;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SnackbarKt.access$OneRowSnackbar-kKq0p4A(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SnackbarKt.access$NewLineButtonSnackbar-kKq0p4A(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
        return Unit.INSTANCE;
    }
}

