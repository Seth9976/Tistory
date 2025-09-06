package androidx.compose.ui.platform;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function1 {
    public final int w;
    public final Function2 x;

    public k1(Function2 function20, int v) {
        this.w = v;
        this.x = function20;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                this.x.invoke(((Canvas)object0), null);
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.invoke(Boolean.FALSE, ((Number)object0).intValue());
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((IndexedValue)object0), "it");
                Integer integer0 = ((IndexedValue)object0).getIndex();
                Object object1 = ((IndexedValue)object0).getValue();
                return (Boolean)this.x.invoke(integer0, object1);
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((WeakReference)object0), "it");
                return ((WeakReference)object0).get() == null || ((WeakReference)object0).get() == this.x;
            }
            case 4: {
                Object object2 = ((AnimationScope)object0).getValue();
                Float float1 = ((AnimationVector1D)((AnimationScope)object0).getVelocityVector()).getValue();
                this.x.invoke(object2, float1);
                return Unit.INSTANCE;
            }
            case 5: {
                Offset offset0 = Offset.box-impl(PointerEventKt.positionChange(((PointerInputChange)object0)));
                this.x.invoke(((PointerInputChange)object0), offset0);
                ((PointerInputChange)object0).consume();
                return Unit.INSTANCE;
            }
            case 6: {
                Float float2 = Offset.getX-impl(PointerEventKt.positionChange(((PointerInputChange)object0)));
                this.x.invoke(((PointerInputChange)object0), float2);
                ((PointerInputChange)object0).consume();
                return Unit.INSTANCE;
            }
            default: {
                Float float0 = Offset.getY-impl(PointerEventKt.positionChange(((PointerInputChange)object0)));
                this.x.invoke(((PointerInputChange)object0), float0);
                ((PointerInputChange)object0).consume();
                return Unit.INSTANCE;
            }
        }
    }
}

