package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class ze extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final float C;
    public final WindowInsets D;
    public final Function3 E;
    public final int F;
    public final int G;
    public final int w;
    public final DrawerState x;
    public final Modifier y;
    public final Shape z;

    public ze(DrawerState drawerState0, Modifier modifier0, Shape shape0, long v, long v1, float f, WindowInsets windowInsets0, Function3 function30, int v2, int v3, int v4) {
        this.w = v4;
        this.x = drawerState0;
        this.y = modifier0;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = f;
        this.D = windowInsets0;
        this.E = function30;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            NavigationDrawerKt.ModalDrawerSheet-Snr_uVM(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        NavigationDrawerKt.DismissibleDrawerSheet-Snr_uVM(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

