package b0;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final Horizontal A;
    public final Vertical B;
    public final FlingBehavior C;
    public final Function1 D;
    public final int E;
    public final int F;
    public final Modifier w;
    public final LazyListState x;
    public final PaddingValues y;
    public final boolean z;

    public e(Modifier modifier0, LazyListState lazyListState0, PaddingValues paddingValues0, boolean z, Horizontal arrangement$Horizontal0, Vertical alignment$Vertical0, FlingBehavior flingBehavior0, Function1 function10, int v, int v1) {
        this.w = modifier0;
        this.x = lazyListState0;
        this.y = paddingValues0;
        this.z = z;
        this.A = arrangement$Horizontal0;
        this.B = alignment$Vertical0;
        this.C = flingBehavior0;
        this.D = function10;
        this.E = v;
        this.F = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyDslKt.LazyRow(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.E | 1), this.F);
        return Unit.INSTANCE;
    }
}

