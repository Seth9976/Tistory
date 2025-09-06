package v0;

import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.carousel.KeylinesKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final float A;
    public final Density w;
    public final float x;
    public final CarouselState y;
    public final float z;

    public f(Density density0, float f, CarouselState carouselState0, float f1, float f2) {
        this.w = density0;
        this.x = f;
        this.y = carouselState0;
        this.z = f1;
        this.A = f2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f = this.w.toPx-0680j_4(this.x);
        int v = ((Number)((Function0)this.y.getItemCountState().getValue()).invoke()).intValue();
        float f1 = this.w.toPx-0680j_4(this.z);
        float f2 = this.w.toPx-0680j_4(this.A);
        return KeylinesKt.multiBrowseKeylineList(this.w, ((Number)object0).floatValue(), f, ((Number)object1).floatValue(), v, f1, f2);
    }
}

