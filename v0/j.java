package v0;

import androidx.compose.material3.carousel.CarouselItemInfoImpl;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.carousel.Keyline;
import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListKt;
import androidx.compose.material3.carousel.Strategy;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final CarouselItemInfoImpl A;
    public final Shape B;
    public final boolean C;
    public final CarouselState w;
    public final Strategy x;
    public final int y;
    public final boolean z;

    public j(CarouselState carouselState0, Strategy strategy0, int v, boolean z, CarouselItemInfoImpl carouselItemInfoImpl0, Shape shape0, boolean z1) {
        this.w = carouselState0;
        this.x = strategy0;
        this.y = v;
        this.z = z;
        this.A = carouselItemInfoImpl0;
        this.B = shape0;
        this.C = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = CarouselKt.calculateCurrentScrollOffset(this.w, this.x);
        float f1 = CarouselKt.calculateMaxScrollOffset(this.w, this.x);
        KeylineList keylineList0 = Strategy.getKeylineListForScrollOffset$material3_release$default(this.x, f, f1, false, 4, null);
        KeylineList keylineList1 = this.x.getKeylineListForScrollOffset$material3_release(f, f1, true);
        float f2 = this.x.getItemMainAxisSize();
        float f3 = this.x.getItemMainAxisSize() / 2.0f + ((float)this.y) * (this.x.getItemSpacing() + f2) - f;
        Keyline keyline0 = keylineList0.getKeylineBefore(f3);
        Keyline keyline1 = keylineList0.getKeylineAfter(f3);
        Keyline keyline2 = KeylineListKt.lerp(keyline0, keyline1, CarouselKt.access$getProgress(keyline0, keyline1, f3));
        boolean z = Intrinsics.areEqual(keyline0, keyline1);
        boolean z1 = this.z;
        float f4 = z1 ? Size.getHeight-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc()) : this.x.getItemMainAxisSize();
        float f5 = z1 ? this.x.getItemMainAxisSize() : Size.getHeight-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc());
        float f6 = z1 ? Size.getWidth-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc()) : keyline2.getSize();
        float f7 = z1 ? keyline2.getSize() : Size.getHeight-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc());
        Rect rect0 = new Rect(f4 / 2.0f - f6 / 2.0f, f5 / 2.0f - f7 / 2.0f, f4 / 2.0f + f6 / 2.0f, f5 / 2.0f + f7 / 2.0f);
        CarouselItemInfoImpl carouselItemInfoImpl0 = this.A;
        carouselItemInfoImpl0.setSizeState(keyline2.getSize());
        Iterator iterator0 = keylineList1.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator0.next();
        if(iterator0.hasNext()) {
            float f8 = ((Keyline)object1).getSize();
            while(true) {
                Object object2 = iterator0.next();
                float f9 = ((Keyline)object2).getSize();
                if(Float.compare(f8, f9) > 0) {
                    object1 = object2;
                    f8 = f9;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
        carouselItemInfoImpl0.setMinSizeState(((Keyline)object1).getSize());
        carouselItemInfoImpl0.setMaxSizeState(keylineList1.getFirstFocal().getSize());
        carouselItemInfoImpl0.setMaskRectState(rect0);
        ((GraphicsLayerScope)object0).setClip(!Intrinsics.areEqual(rect0, new Rect(0.0f, 0.0f, Size.getWidth-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc()), Size.getHeight-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc()))));
        ((GraphicsLayerScope)object0).setShape(this.B);
        float f10 = z ? keyline2.getOffset() - f3 + (f3 - keyline2.getUnadjustedOffset()) / keyline2.getSize() : keyline2.getOffset() - f3;
        if(z1) {
            ((GraphicsLayerScope)object0).setTranslationY(f10);
            return Unit.INSTANCE;
        }
        if(this.C) {
            f10 = -f10;
        }
        ((GraphicsLayerScope)object0).setTranslationX(f10);
        return Unit.INSTANCE;
    }
}

