package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.AppBarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function2 {
    public final long A;
    public final float B;
    public final PaddingValues C;
    public final Function3 D;
    public final int E;
    public final int F;
    public final int w;
    public final WindowInsets x;
    public final Modifier y;
    public final long z;

    public c0(WindowInsets windowInsets0, Modifier modifier0, long v, long v1, float f, PaddingValues paddingValues0, Function3 function30, int v2, int v3) {
        this.w = 1;
        this.x = windowInsets0;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.C = paddingValues0;
        this.D = function30;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    public c0(Modifier modifier0, long v, long v1, float f, PaddingValues paddingValues0, WindowInsets windowInsets0, Function3 function30, int v2, int v3) {
        this.w = 0;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.C = paddingValues0;
        this.x = windowInsets0;
        this.D = function30;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            AppBarKt.TopAppBar-afqeVBk(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        androidx.compose.material3.AppBarKt.BottomAppBar-1oL4kX8(this.y, this.z, this.A, this.B, this.C, this.x, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

