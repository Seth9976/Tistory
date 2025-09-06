package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class xe extends Lambda implements Function2 {
    public final long A;
    public final float B;
    public final WindowInsets C;
    public final Function3 D;
    public final int E;
    public final int F;
    public final int w;
    public final Modifier x;
    public final Shape y;
    public final long z;

    public xe(Modifier modifier0, Shape shape0, long v, long v1, float f, WindowInsets windowInsets0, Function3 function30, int v2, int v3, int v4) {
        this.w = v4;
        this.x = modifier0;
        this.y = shape0;
        this.z = v;
        this.A = v1;
        this.B = f;
        this.C = windowInsets0;
        this.D = function30;
        this.E = v2;
        this.F = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                NavigationDrawerKt.DismissibleDrawerSheet-afqeVBk(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                NavigationDrawerKt.ModalDrawerSheet-afqeVBk(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                NavigationDrawerKt.PermanentDrawerSheet-afqeVBk(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
        }
    }
}

