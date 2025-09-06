package u1;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.VectorComposeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final List E;
    public final Function2 F;
    public final int G;
    public final int H;
    public final String w;
    public final float x;
    public final float y;
    public final float z;

    public d(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, Function2 function20, int v, int v1) {
        this.w = s;
        this.x = f;
        this.y = f1;
        this.z = f2;
        this.A = f3;
        this.B = f4;
        this.C = f5;
        this.D = f6;
        this.E = list0;
        this.F = function20;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        VectorComposeKt.Group(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

