package p0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.NavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function2 {
    public final float A;
    public final Function3 B;
    public final int C;
    public final int D;
    public final Object E;
    public final int w;
    public final Modifier x;
    public final long y;
    public final long z;

    public k0(Modifier modifier0, long v, long v1, float f, PaddingValues paddingValues0, Function3 function30, int v2, int v3) {
        this.w = 0;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        this.A = f;
        this.E = paddingValues0;
        this.B = function30;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    public k0(Modifier modifier0, long v, long v1, float f, Function3 function30, Function3 function31, int v2, int v3) {
        this.w = 1;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        this.A = f;
        this.B = function30;
        this.E = function31;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            NavigationRailKt.NavigationRail-HsRjFd4(this.x, this.y, this.z, this.A, this.B, ((Function3)this.E), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        AppBarKt.TopAppBar-HsRjFd4(this.x, this.y, this.z, this.A, ((PaddingValues)this.E), this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

