package w0;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final long x;
    public final TextStyle y;
    public final Function2 z;

    public c1(long v, TextStyle textStyle0, Function2 function20, int v1, int v2) {
        this.w = v2;
        this.x = v;
        this.y = textStyle0;
        this.z = function20;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TextFieldImplKt.access$Decoration-3J-VO9M(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
        return Unit.INSTANCE;
    }
}

