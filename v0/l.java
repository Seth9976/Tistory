package v0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.carousel.CarouselItemInfoImpl;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.carousel.Strategy;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class l extends Lambda implements Function3 {
    public final Shape A;
    public final Function0 w;
    public final CarouselState x;
    public final int y;
    public final CarouselItemInfoImpl z;

    public l(Function0 function00, CarouselState carouselState0, int v, CarouselItemInfoImpl carouselItemInfoImpl0, Shape shape0) {
        this.w = function00;
        this.x = carouselState0;
        this.y = v;
        this.z = carouselItemInfoImpl0;
        this.A = shape0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        long v = ((Constraints)object2).unbox-impl();
        Strategy strategy0 = (Strategy)this.w.invoke();
        if(!strategy0.isValid()) {
            return MeasureScope.layout$default(((MeasureScope)object0), 0, 0, null, i.w, 4, null);
        }
        boolean z = this.x.getPagerState$material3_release().getLayoutInfo().getOrientation() == Orientation.Vertical;
        boolean z1 = ((MeasureScope)object0).getLayoutDirection() == LayoutDirection.Rtl;
        float f = strategy0.getItemMainAxisSize();
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0((z ? Constraints.copy-Zbe2FdA(v, Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v), c.roundToInt(f), c.roundToInt(f)) : Constraints.copy-Zbe2FdA(v, c.roundToInt(f), c.roundToInt(f), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v))));
        return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight(), null, new k(placeable0, this.x, strategy0, this.y, z, this.z, this.A, z1), 4, null);
    }
}

