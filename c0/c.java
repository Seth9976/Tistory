package c0;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final boolean A;
    public final Horizontal B;
    public final Vertical C;
    public final FlingBehavior D;
    public final boolean E;
    public final Function1 F;
    public final int G;
    public final int H;
    public final GridCells w;
    public final Modifier x;
    public final LazyGridState y;
    public final PaddingValues z;

    public c(int v, int v1, FlingBehavior flingBehavior0, Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, PaddingValues paddingValues0, GridCells gridCells0, LazyGridState lazyGridState0, Modifier modifier0, Function1 function10, boolean z, boolean z1) {
        this.w = gridCells0;
        this.x = modifier0;
        this.y = lazyGridState0;
        this.z = paddingValues0;
        this.A = z;
        this.B = arrangement$Horizontal0;
        this.C = arrangement$Vertical0;
        this.D = flingBehavior0;
        this.E = z1;
        this.F = function10;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyGridDslKt.LazyHorizontalGrid(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

