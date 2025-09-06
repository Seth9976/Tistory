package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function2 {
    public final Function A;
    public final float B;
    public final float C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final int G;
    public final int H;
    public final int w;
    public final Function2 x;
    public final Modifier y;
    public final Function2 z;

    public i0(Function2 function20, Modifier modifier0, Function2 function21, Function2 function22, Function2 function23, Function2 function24, ListItemColors listItemColors0, float f, float f1, int v, int v1) {
        this.w = 2;
        this.x = function20;
        this.y = modifier0;
        this.z = function21;
        this.A = function22;
        this.D = function23;
        this.E = function24;
        this.F = listItemColors0;
        this.B = f;
        this.C = f1;
        this.G = v;
        this.H = v1;
        super(2);
    }

    public i0(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, float f, float f1, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, int v, int v1, int v2) {
        this.w = v2;
        this.x = function20;
        this.y = modifier0;
        this.z = function21;
        this.A = function30;
        this.B = f;
        this.C = f1;
        this.D = windowInsets0;
        this.E = topAppBarColors0;
        this.F = topAppBarScrollBehavior0;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AppBarKt.LargeTopAppBar-oKE7A98(this.x, this.y, this.z, ((Function3)this.A), this.B, this.C, ((WindowInsets)this.D), ((TopAppBarColors)this.E), ((TopAppBarScrollBehavior)this.F), ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                AppBarKt.MediumTopAppBar-oKE7A98(this.x, this.y, this.z, ((Function3)this.A), this.B, this.C, ((WindowInsets)this.D), ((TopAppBarColors)this.E), ((TopAppBarScrollBehavior)this.F), ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ListItemKt.ListItem-HXNGIdc(this.x, this.y, this.z, ((Function2)this.A), ((Function2)this.D), ((Function2)this.E), ((ListItemColors)this.F), this.B, this.C, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
        }
    }
}

