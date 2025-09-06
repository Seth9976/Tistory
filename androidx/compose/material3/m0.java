package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function3 B;
    public final float C;
    public final WindowInsets D;
    public final TopAppBarColors E;
    public final TopAppBarScrollBehavior F;
    public final int G;
    public final int H;
    public final Modifier w;
    public final Function2 x;
    public final TextStyle y;
    public final boolean z;

    public m0(Modifier modifier0, Function2 function20, TextStyle textStyle0, boolean z, Function2 function21, Function3 function30, float f, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, int v, int v1) {
        this.w = modifier0;
        this.x = function20;
        this.y = textStyle0;
        this.z = z;
        this.A = function21;
        this.B = function30;
        this.C = f;
        this.D = windowInsets0;
        this.E = topAppBarColors0;
        this.F = topAppBarScrollBehavior0;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AppBarKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

