package v0;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final TargetedFlingBehavior A;
    public final PaddingValues B;
    public final Function4 C;
    public final int D;
    public final int E;
    public final CarouselState w;
    public final float x;
    public final Modifier y;
    public final float z;

    public h(CarouselState carouselState0, float f, Modifier modifier0, float f1, TargetedFlingBehavior targetedFlingBehavior0, PaddingValues paddingValues0, Function4 function40, int v, int v1) {
        this.w = carouselState0;
        this.x = f;
        this.y = modifier0;
        this.z = f1;
        this.A = targetedFlingBehavior0;
        this.B = paddingValues0;
        this.C = function40;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CarouselKt.HorizontalUncontainedCarousel-9QcgTRs(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.D | 1), this.E);
        return Unit.INSTANCE;
    }
}

