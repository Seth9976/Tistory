package p0;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.NavigationRailKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function2 {
    public final long A;
    public final float B;
    public final int C;
    public final int D;
    public final Object E;
    public final Object F;
    public final int w;
    public final Modifier x;
    public final Function y;
    public final long z;

    public h0(WindowInsets windowInsets0, Modifier modifier0, long v, long v1, float f, Function3 function30, Function3 function31, int v2, int v3) {
        this.w = 2;
        this.E = windowInsets0;
        this.x = modifier0;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.y = function30;
        this.F = function31;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    public h0(Modifier modifier0, long v, long v1, Shape shape0, float f, PaddingValues paddingValues0, Function3 function30, int v2, int v3) {
        this.w = 0;
        this.x = modifier0;
        this.z = v;
        this.A = v1;
        this.E = shape0;
        this.B = f;
        this.F = paddingValues0;
        this.y = function30;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    public h0(Modifier modifier0, Shape shape0, long v, long v1, BorderStroke borderStroke0, float f, Function2 function20, int v2, int v3) {
        this.w = 3;
        this.x = modifier0;
        this.E = shape0;
        this.z = v;
        this.A = v1;
        this.F = borderStroke0;
        this.B = f;
        this.y = function20;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    public h0(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, long v, long v1, float f, int v2, int v3) {
        this.w = 1;
        this.E = function20;
        this.x = modifier0;
        this.F = function21;
        this.y = function30;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.C = v2;
        this.D = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AppBarKt.BottomAppBar-Y1yfwus(this.x, this.z, this.A, ((Shape)this.E), this.B, ((PaddingValues)this.F), ((Function3)this.y), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                AppBarKt.TopAppBar-xWeB9-s(((Function2)this.E), this.x, ((Function2)this.F), ((Function3)this.y), this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                NavigationRailKt.NavigationRail-afqeVBk(((WindowInsets)this.E), this.x, this.z, this.A, this.B, ((Function3)this.y), ((Function3)this.F), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                SurfaceKt.Surface-F-jzlyU(this.x, ((Shape)this.E), this.z, this.A, ((BorderStroke)this.F), this.B, ((Function2)this.y), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
        }
    }
}

