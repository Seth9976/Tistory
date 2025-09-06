package v0;

import androidx.compose.material3.carousel.CarouselItemInfoImpl;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.carousel.Strategy;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final boolean A;
    public final CarouselItemInfoImpl B;
    public final Shape C;
    public final boolean D;
    public final Placeable w;
    public final CarouselState x;
    public final Strategy y;
    public final int z;

    public k(Placeable placeable0, CarouselState carouselState0, Strategy strategy0, int v, boolean z, CarouselItemInfoImpl carouselItemInfoImpl0, Shape shape0, boolean z1) {
        this.w = placeable0;
        this.x = carouselState0;
        this.y = strategy0;
        this.z = v;
        this.A = z;
        this.B = carouselItemInfoImpl0;
        this.C = shape0;
        this.D = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        j j0 = new j(this.x, this.y, this.z, this.A, this.B, this.C, this.D);
        PlacementScope.placeWithLayer$default(((PlacementScope)object0), this.w, 0, 0, 0.0f, j0, 4, null);
        return Unit.INSTANCE;
    }
}

