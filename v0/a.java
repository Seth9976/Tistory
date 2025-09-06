package v0;

import androidx.compose.material3.carousel.CarouselItemScopeImpl;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public final CarouselItemScopeImpl w;
    public final Shape x;
    public final Density y;

    public a(CarouselItemScopeImpl carouselItemScopeImpl0, Shape shape0, Density density0) {
        this.w = carouselItemScopeImpl0;
        this.x = shape0;
        this.y = density0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Rect rect0 = this.w.getCarouselItemInfo().getMaskRect().intersect(SizeKt.toRect-uvyYCjk(((Size)object1).unbox-impl()));
        long v = rect0.getSize-NH-jbRc();
        OutlineKt.addOutline(((Path)object0), this.x.createOutline-Pq9zytI(v, ((LayoutDirection)object2), this.y));
        ((Path)object0).translate-k-4lQ0M(OffsetKt.Offset(rect0.getLeft(), rect0.getTop()));
        return Unit.INSTANCE;
    }
}

