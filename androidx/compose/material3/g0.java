package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final Function3 A;
    public final WindowInsets B;
    public final TopAppBarColors C;
    public final TopAppBarScrollBehavior D;
    public final int E;
    public final int F;
    public final int w;
    public final Function2 x;
    public final Modifier y;
    public final Function2 z;

    public g0(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, int v, int v1, int v2) {
        this.w = v2;
        this.x = function20;
        this.y = modifier0;
        this.z = function21;
        this.A = function30;
        this.B = windowInsets0;
        this.C = topAppBarColors0;
        this.D = topAppBarScrollBehavior0;
        this.E = v;
        this.F = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AppBarKt.CenterAlignedTopAppBar(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                AppBarKt.LargeTopAppBar(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                AppBarKt.MediumTopAppBar(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                AppBarKt.TopAppBar(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
        }
    }
}

