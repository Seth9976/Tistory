package androidx.compose.material3;

import androidx.compose.material.AlertDialogKt;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final float x;
    public final float y;
    public final Function2 z;

    public i(float f, float f1, Function2 function20, int v, int v1) {
        this.w = v1;
        this.x = f;
        this.y = f1;
        this.z = function20;
        this.A = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            AlertDialogKt.AlertDialogFlowRow-ixp7dh8(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
            return Unit.INSTANCE;
        }
        androidx.compose.material3.AlertDialogKt.AlertDialogFlowRow-ixp7dh8(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
        return Unit.INSTANCE;
    }
}

