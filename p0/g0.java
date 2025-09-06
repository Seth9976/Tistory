package p0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.AppBarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final long A;
    public final Shape B;
    public final float C;
    public final PaddingValues D;
    public final Function3 E;
    public final int F;
    public final int G;
    public final int w;
    public final WindowInsets x;
    public final Modifier y;
    public final long z;

    public g0(long v, long v1, float f, PaddingValues paddingValues0, Shape shape0, WindowInsets windowInsets0, Modifier modifier0, Function3 function30, int v2, int v3) {
        this.w = 0;
        this.z = v;
        this.A = v1;
        this.C = f;
        this.D = paddingValues0;
        this.B = shape0;
        this.x = windowInsets0;
        this.y = modifier0;
        this.E = function30;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    public g0(WindowInsets windowInsets0, Modifier modifier0, long v, long v1, Shape shape0, float f, PaddingValues paddingValues0, Function3 function30, int v2, int v3) {
        this.w = 1;
        this.x = windowInsets0;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = shape0;
        this.C = f;
        this.D = paddingValues0;
        this.E = function30;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            AppBarKt.BottomAppBar-DanWW-k(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        AppBarKt.a(this.z, this.A, this.C, this.D, this.B, this.x, this.y, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

