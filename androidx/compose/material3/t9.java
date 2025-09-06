package androidx.compose.material3;

import androidx.compose.material.ExposedDropdownMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class t9 extends Lambda implements Function2 {
    public final Function3 A;
    public final int B;
    public final int C;
    public final int w;
    public final boolean x;
    public final Function1 y;
    public final Modifier z;

    public t9(boolean z, Function1 function10, Modifier modifier0, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.y = function10;
        this.z = modifier0;
        this.A = function30;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

