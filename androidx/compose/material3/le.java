package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.BottomNavigationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class le extends Lambda implements Function2 {
    public final long A;
    public final float B;
    public final Function3 C;
    public final int D;
    public final int E;
    public final int w;
    public final WindowInsets x;
    public final Modifier y;
    public final long z;

    public le(WindowInsets windowInsets0, Modifier modifier0, long v, long v1, float f, Function3 function30, int v2, int v3) {
        this.w = 1;
        this.x = windowInsets0;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.C = function30;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    public le(Modifier modifier0, long v, long v1, float f, WindowInsets windowInsets0, Function3 function30, int v2, int v3) {
        this.w = 0;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.x = windowInsets0;
        this.C = function30;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            BottomNavigationKt.BottomNavigation-_UMDTes(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        NavigationBarKt.NavigationBar-HsRjFd4(this.y, this.z, this.A, this.B, this.x, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

