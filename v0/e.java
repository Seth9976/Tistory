package v0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final int A;
    public final Modifier B;
    public final float C;
    public final TargetedFlingBehavior D;
    public final Function4 E;
    public final int F;
    public final int G;
    public final CarouselState w;
    public final Orientation x;
    public final Function2 y;
    public final PaddingValues z;

    public e(CarouselState carouselState0, Orientation orientation0, Function2 function20, PaddingValues paddingValues0, int v, Modifier modifier0, float f, TargetedFlingBehavior targetedFlingBehavior0, Function4 function40, int v1, int v2) {
        this.w = carouselState0;
        this.x = orientation0;
        this.y = function20;
        this.z = paddingValues0;
        this.A = v;
        this.B = modifier0;
        this.C = f;
        this.D = targetedFlingBehavior0;
        this.E = function40;
        this.F = v1;
        this.G = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CarouselKt.Carousel-V-95POc(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

