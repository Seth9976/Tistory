package androidx.compose.material3;

import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final long A;
    public final PopupProperties B;
    public final Function3 C;
    public final int D;
    public final int E;
    public final int w;
    public final boolean x;
    public final Function0 y;
    public final Modifier z;

    public w(boolean z, Function0 function00, Modifier modifier0, long v, PopupProperties popupProperties0, Function3 function30, int v1, int v2, int v3) {
        this.w = v3;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = v;
        this.B = popupProperties0;
        this.C = function30;
        this.D = v1;
        this.E = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            AndroidMenu_androidKt.DropdownMenu-ILWXrKs(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.AndroidMenu_androidKt.DropdownMenu-ILWXrKs(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

