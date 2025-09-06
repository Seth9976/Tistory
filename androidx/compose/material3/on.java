package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class on extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final float C;
    public final Function2 D;
    public final Function2 E;
    public final ScrollState F;
    public final int G;
    public final int H;
    public final int w;
    public final int x;
    public final Function3 y;
    public final Modifier z;

    public on(int v, Modifier modifier0, ScrollState scrollState0, long v1, long v2, float f, Function3 function30, Function2 function20, Function2 function21, int v3, int v4, int v5) {
        this.w = v5;
        this.x = v;
        this.z = modifier0;
        this.F = scrollState0;
        this.A = v1;
        this.B = v2;
        this.C = f;
        this.y = function30;
        this.D = function20;
        this.E = function21;
        this.G = v3;
        this.H = v4;
        super(2);
    }

    public on(int v, Function3 function30, Modifier modifier0, long v1, long v2, float f, Function2 function20, Function2 function21, ScrollState scrollState0, int v3, int v4) {
        this.w = 1;
        this.x = v;
        this.y = function30;
        this.z = modifier0;
        this.A = v1;
        this.B = v2;
        this.C = f;
        this.D = function20;
        this.E = function21;
        this.F = scrollState0;
        this.G = v3;
        this.H = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                TabRowKt.PrimaryScrollableTabRow-qhFBPw4(this.x, this.z, this.F, this.A, this.B, this.C, this.y, this.D, this.E, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                TabRowKt.b(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                TabRowKt.SecondaryScrollableTabRow-qhFBPw4(this.x, this.z, this.F, this.A, this.B, this.C, this.y, this.D, this.E, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
        }
    }
}

