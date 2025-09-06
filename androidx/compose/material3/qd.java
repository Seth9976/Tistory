package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class qd extends Lambda implements Function2 {
    public final float A;
    public final Shape B;
    public final long C;
    public final long D;
    public final float E;
    public final long F;
    public final Function2 G;
    public final ModalBottomSheetProperties H;
    public final Function3 I;
    public final int J;
    public final int K;
    public final int L;
    public final Object M;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final SheetState z;

    public qd(Function0 function00, Modifier modifier0, SheetState sheetState0, float f, Shape shape0, long v, long v1, float f1, long v2, Function2 function20, Object object0, ModalBottomSheetProperties modalBottomSheetProperties0, Function3 function30, int v3, int v4, int v5, int v6) {
        this.w = v6;
        this.x = function00;
        this.y = modifier0;
        this.z = sheetState0;
        this.A = f;
        this.B = shape0;
        this.C = v;
        this.D = v1;
        this.E = f1;
        this.F = v2;
        this.G = function20;
        this.M = object0;
        this.H = modalBottomSheetProperties0;
        this.I = function30;
        this.J = v3;
        this.K = v4;
        this.L = v5;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ModalBottomSheet_androidKt.ModalBottomSheet-dYc4hso(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((WindowInsets)this.M), this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ModalBottomSheetKt.ModalBottomSheet-dYc4hso(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Function2)this.M), this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
        return Unit.INSTANCE;
    }
}

