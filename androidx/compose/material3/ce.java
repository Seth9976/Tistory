package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class ce extends Lambda implements Function2 {
    public final Function1 A;
    public final Modifier B;
    public final SheetState C;
    public final float D;
    public final Shape E;
    public final long F;
    public final long G;
    public final float H;
    public final Function2 I;
    public final Function2 J;
    public final Function3 K;
    public final int L;
    public final int M;
    public final int N;
    public final BoxScope w;
    public final Animatable x;
    public final CoroutineScope y;
    public final Function0 z;

    public ce(BoxScope boxScope0, Animatable animatable0, CoroutineScope coroutineScope0, Function0 function00, Function1 function10, Modifier modifier0, SheetState sheetState0, float f, Shape shape0, long v, long v1, float f1, Function2 function20, Function2 function21, Function3 function30, int v2, int v3, int v4) {
        this.w = boxScope0;
        this.x = animatable0;
        this.y = coroutineScope0;
        this.z = function00;
        this.A = function10;
        this.B = modifier0;
        this.C = sheetState0;
        this.D = f;
        this.E = shape0;
        this.F = v;
        this.G = v1;
        this.H = f1;
        this.I = function20;
        this.J = function21;
        this.K = function30;
        this.L = v2;
        this.M = v3;
        this.N = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ModalBottomSheetKt.ModalBottomSheetContent-IQkwcL4(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, ((Composer)object0), (this.L | 1) & -920350135 | ((0x24924924 & (this.L | 1)) >> 1 | 306783378 & (this.L | 1)) | (306783378 & (this.L | 1)) << 1 & (0x24924924 & (this.L | 1)), this.M & -920350135 | ((0x24924924 & this.M) >> 1 | 306783378 & this.M) | (306783378 & this.M) << 1 & (0x24924924 & this.M), this.N);
        return Unit.INSTANCE;
    }
}

