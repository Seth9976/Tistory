package androidx.compose.material3.carousel;

import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J*\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"androidx/compose/material3/carousel/CarouselKt$Carousel$2$clipShape$1$1", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CarouselKt.Carousel.2.clipShape.1.1 implements Shape {
    public final CarouselItemInfoImpl a;

    public CarouselKt.Carousel.2.clipShape.1.1(CarouselItemInfoImpl carouselItemInfoImpl0) {
        this.a = carouselItemInfoImpl0;
    }

    @Override  // androidx.compose.ui.graphics.Shape
    @NotNull
    public Outline createOutline-Pq9zytI(long v, @NotNull LayoutDirection layoutDirection0, @NotNull Density density0) {
        return new Rectangle(this.a.getMaskRect());
    }
}

