package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final long C;
    public final float D;
    public final float E;
    public final Function2 F;
    public final Function3 G;
    public final int H;
    public final int I;
    public final SheetState w;
    public final float x;
    public final float y;
    public final boolean z;

    public e2(SheetState sheetState0, float f, float f1, boolean z, Shape shape0, long v, long v1, float f2, float f3, Function2 function20, Function3 function30, int v2, int v3) {
        this.w = sheetState0;
        this.x = f;
        this.y = f1;
        this.z = z;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        this.D = f2;
        this.E = f3;
        this.F = function20;
        this.G = function30;
        this.H = v2;
        this.I = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetScaffoldKt.access$StandardBottomSheet-w7I5h1o(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I));
        return Unit.INSTANCE;
    }
}

