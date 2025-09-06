package androidx.compose.material3;

import androidx.compose.material.CheckboxColors;
import androidx.compose.material.CheckboxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f3 extends Lambda implements Function2 {
    public final int A;
    public final Object B;
    public final int w;
    public final boolean x;
    public final ToggleableState y;
    public final Modifier z;

    public f3(boolean z, ToggleableState toggleableState0, Modifier modifier0, Object object0, int v, int v1) {
        this.w = v1;
        this.x = z;
        this.y = toggleableState0;
        this.z = modifier0;
        this.B = object0;
        this.A = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            CheckboxKt.a(this.x, this.y, this.z, ((CheckboxColors)this.B), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.CheckboxKt.a(this.x, this.y, this.z, ((androidx.compose.material3.CheckboxColors)this.B), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
        return Unit.INSTANCE;
    }
}

