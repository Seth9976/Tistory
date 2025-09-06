package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class lj extends Lambda implements Function2 {
    public final Modifier A;
    public final Function2 B;
    public final Shape C;
    public final SearchBarColors D;
    public final float E;
    public final float F;
    public final WindowInsets G;
    public final Function3 H;
    public final int I;
    public final int J;
    public final int K;
    public final Animatable w;
    public final MutableFloatState x;
    public final MutableState y;
    public final MutableState z;

    public lj(Animatable animatable0, MutableFloatState mutableFloatState0, MutableState mutableState0, MutableState mutableState1, Modifier modifier0, Function2 function20, Shape shape0, SearchBarColors searchBarColors0, float f, float f1, WindowInsets windowInsets0, Function3 function30, int v, int v1, int v2) {
        this.w = animatable0;
        this.x = mutableFloatState0;
        this.y = mutableState0;
        this.z = mutableState1;
        this.A = modifier0;
        this.B = function20;
        this.C = shape0;
        this.D = searchBarColors0;
        this.E = f;
        this.F = f1;
        this.G = windowInsets0;
        this.H = function30;
        this.I = v;
        this.J = v1;
        this.K = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchBar_androidKt.SearchBarImpl-j1jLAyQ(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

