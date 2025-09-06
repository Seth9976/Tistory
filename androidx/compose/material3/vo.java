package androidx.compose.material3;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class vo extends Lambda implements Function2 {
    public final int w;
    public final TextStyle x;
    public final Function2 y;
    public final int z;

    public vo(TextStyle textStyle0, Function2 function20, int v, int v1) {
        this.w = v1;
        this.x = textStyle0;
        this.y = function20;
        this.z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            TextKt.ProvideTextStyle(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
            return Unit.INSTANCE;
        }
        androidx.compose.material3.TextKt.ProvideTextStyle(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
        return Unit.INSTANCE;
    }
}

