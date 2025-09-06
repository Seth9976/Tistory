package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final float A;
    public final Object B;
    public final Object C;
    public final Function3 D;
    public final int E;
    public final int F;
    public final Object G;
    public final int w;
    public final Modifier x;
    public final long y;
    public final long z;

    public z(int v, Modifier modifier0, long v1, long v2, float f, ScrollState scrollState0, Function3 function30, Function2 function20, Function2 function21, int v3) {
        this.w = 3;
        this.E = v;
        this.x = modifier0;
        this.y = v1;
        this.z = v2;
        this.A = f;
        this.B = scrollState0;
        this.D = function30;
        this.G = function20;
        this.C = function21;
        this.F = v3;
        super(2);
    }

    public z(DrawerPredictiveBackState drawerPredictiveBackState0, WindowInsets windowInsets0, Modifier modifier0, Shape shape0, long v, long v1, float f, Function3 function30, int v2, int v3) {
        this.w = 2;
        this.G = drawerPredictiveBackState0;
        this.C = windowInsets0;
        this.x = modifier0;
        this.B = shape0;
        this.y = v;
        this.z = v1;
        this.A = f;
        this.D = function30;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    public z(Modifier modifier0, long v, long v1, float f, PaddingValues paddingValues0, WindowInsets windowInsets0, BottomAppBarScrollBehavior bottomAppBarScrollBehavior0, Function3 function30, int v2, int v3) {
        this.w = 1;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        this.A = f;
        this.B = paddingValues0;
        this.C = windowInsets0;
        this.G = bottomAppBarScrollBehavior0;
        this.D = function30;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    public z(Function2 function20, WindowInsets windowInsets0, Modifier modifier0, Function2 function21, Function3 function30, long v, long v1, float f, int v2, int v3) {
        this.w = 4;
        this.G = function20;
        this.C = windowInsets0;
        this.x = modifier0;
        this.B = function21;
        this.D = function30;
        this.y = v;
        this.z = v1;
        this.A = f;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    public z(Function3 function30, Modifier modifier0, Function2 function20, long v, long v1, float f, PaddingValues paddingValues0, WindowInsets windowInsets0, int v2, int v3) {
        this.w = 0;
        this.D = function30;
        this.x = modifier0;
        this.G = function20;
        this.y = v;
        this.z = v1;
        this.A = f;
        this.B = paddingValues0;
        this.C = windowInsets0;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AppBarKt.BottomAppBar-Snr_uVM(this.D, this.x, ((Function2)this.G), this.y, this.z, this.A, ((PaddingValues)this.B), ((WindowInsets)this.C), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                AppBarKt.BottomAppBar-e-3WI5M(this.x, this.y, this.z, this.A, ((PaddingValues)this.B), ((WindowInsets)this.C), ((BottomAppBarScrollBehavior)this.G), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                NavigationDrawerKt.DrawerSheet-7zSek6w(((DrawerPredictiveBackState)this.G), ((WindowInsets)this.C), this.x, ((Shape)this.B), this.y, this.z, this.A, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                TabRowKt.a(this.E, this.x, this.y, this.z, this.A, ((ScrollState)this.B), this.D, ((Function2)this.G), ((Function2)this.C), ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material.AppBarKt.TopAppBar-Rx1qByU(((Function2)this.G), ((WindowInsets)this.C), this.x, ((Function2)this.B), this.D, this.y, this.z, this.A, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
        }
    }
}

