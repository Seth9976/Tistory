package v0;

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

public final class g extends Lambda implements Function2 {
    public final TargetedFlingBehavior A;
    public final float B;
    public final float C;
    public final PaddingValues D;
    public final Function4 E;
    public final int F;
    public final int G;
    public final CarouselState w;
    public final float x;
    public final Modifier y;
    public final float z;

    public g(CarouselState carouselState0, float f, Modifier modifier0, float f1, TargetedFlingBehavior targetedFlingBehavior0, float f2, float f3, PaddingValues paddingValues0, Function4 function40, int v, int v1) {
        this.w = carouselState0;
        this.x = f;
        this.y = modifier0;
        this.z = f1;
        this.A = targetedFlingBehavior0;
        this.B = f2;
        this.C = f3;
        this.D = paddingValues0;
        this.E = function40;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CarouselKt.HorizontalMultiBrowseCarousel-zCIJ0Nk(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

