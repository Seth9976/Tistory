package p0;

import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function2 {
    public final float A;
    public final long B;
    public final long C;
    public final Modifier D;
    public final Function3 E;
    public final int F;
    public final int G;
    public final BottomSheetState w;
    public final boolean x;
    public final Function1 y;
    public final Shape z;

    public s1(BottomSheetState bottomSheetState0, boolean z, Function1 function10, Shape shape0, float f, long v, long v1, Modifier modifier0, Function3 function30, int v2, int v3) {
        this.w = bottomSheetState0;
        this.x = z;
        this.y = function10;
        this.z = shape0;
        this.A = f;
        this.B = v;
        this.C = v1;
        this.D = modifier0;
        this.E = function30;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetScaffoldKt.access$BottomSheet-0cLKjW4(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

