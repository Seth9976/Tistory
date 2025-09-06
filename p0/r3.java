package p0;

import androidx.compose.material.BottomDrawerState;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class r3 extends Lambda implements Function2 {
    public final Shape A;
    public final float B;
    public final long C;
    public final long D;
    public final long E;
    public final Function2 F;
    public final int G;
    public final int H;
    public final Object I;
    public final int w;
    public final Function3 x;
    public final Modifier y;
    public final boolean z;

    public r3(Function3 function30, Modifier modifier0, Object object0, boolean z, Shape shape0, float f, long v, long v1, long v2, Function2 function20, int v3, int v4, int v5) {
        this.w = v5;
        this.x = function30;
        this.y = modifier0;
        this.I = object0;
        this.z = z;
        this.A = shape0;
        this.B = f;
        this.C = v;
        this.D = v1;
        this.E = v2;
        this.F = function20;
        this.G = v3;
        this.H = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                DrawerKt.BottomDrawer-Gs3lGvM(this.x, this.y, ((BottomDrawerState)this.I), this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                DrawerKt.ModalDrawer-Gs3lGvM(this.x, this.y, ((DrawerState)this.I), this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ModalBottomSheetKt.ModalBottomSheetLayout-Gs3lGvM(this.x, this.y, ((ModalBottomSheetState)this.I), this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
        }
    }
}

