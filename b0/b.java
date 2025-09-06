package b0;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final Vertical A;
    public final Horizontal B;
    public final FlingBehavior C;
    public final boolean D;
    public final Function1 E;
    public final int F;
    public final int G;
    public final Modifier w;
    public final LazyListState x;
    public final PaddingValues y;
    public final boolean z;

    public b(Modifier modifier0, LazyListState lazyListState0, PaddingValues paddingValues0, boolean z, Vertical arrangement$Vertical0, Horizontal alignment$Horizontal0, FlingBehavior flingBehavior0, boolean z1, Function1 function10, int v, int v1) {
        this.w = modifier0;
        this.x = lazyListState0;
        this.y = paddingValues0;
        this.z = z;
        this.A = arrangement$Vertical0;
        this.B = alignment$Horizontal0;
        this.C = flingBehavior0;
        this.D = z1;
        this.E = function10;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyDslKt.LazyColumn(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

