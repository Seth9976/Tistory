package v0;

import androidx.compose.material3.carousel.CarouselPageSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final CarouselPageSize x;

    public b(CarouselPageSize carouselPageSize0, int v) {
        this.w = v;
        this.x = carouselPageSize0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.x.getStrategy();
    }
}

