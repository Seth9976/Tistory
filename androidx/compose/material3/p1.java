package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p1 extends Lambda implements Function2 {
    public final long A;
    public final Shape B;
    public final int C;
    public final int D;
    public final Object E;
    public final int w;
    public final Modifier x;
    public final float y;
    public final float z;

    public p1(BottomSheetDefaults bottomSheetDefaults0, Modifier modifier0, float f, float f1, Shape shape0, long v, int v1, int v2) {
        this.w = 0;
        this.E = bottomSheetDefaults0;
        this.x = modifier0;
        this.y = f;
        this.z = f1;
        this.B = shape0;
        this.A = v;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    public p1(TabRowDefaults tabRowDefaults0, Modifier modifier0, float f, float f1, long v, Shape shape0, int v1, int v2) {
        this.w = 1;
        this.E = tabRowDefaults0;
        this.x = modifier0;
        this.y = f;
        this.z = f1;
        this.A = v;
        this.B = shape0;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((TabRowDefaults)this.E).PrimaryIndicator-10LGxhE(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ((BottomSheetDefaults)this.E).DragHandle-lgZ2HuY(this.x, this.y, this.z, this.B, this.A, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

