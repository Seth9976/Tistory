package v2;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final int w;
    public final PopupLayout x;

    public i(PopupLayout popupLayout0, int v) {
        this.w = v;
        this.x = popupLayout0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                LayoutCoordinates layoutCoordinates0 = ((LayoutCoordinates)object0).getParentLayoutCoordinates();
                Intrinsics.checkNotNull(layoutCoordinates0);
                this.x.updateParentLayoutCoordinates(layoutCoordinates0);
                return Unit.INSTANCE;
            }
            case 1: {
                IntSize intSize0 = IntSize.box-impl(((IntSize)object0).unbox-impl());
                this.x.setPopupContentSize-fhxjrPA(intSize0);
                this.x.updatePosition();
                return Unit.INSTANCE;
            }
            default: {
                PopupLayout popupLayout0 = this.x;
                Handler handler0 = popupLayout0.getHandler();
                if((handler0 == null ? null : handler0.getLooper()) == Looper.myLooper()) {
                    ((Function0)object0).invoke();
                    return Unit.INSTANCE;
                }
                Handler handler1 = popupLayout0.getHandler();
                if(handler1 != null) {
                    handler1.post(new m(((Function0)object0), 4));
                }
                return Unit.INSTANCE;
            }
        }
    }
}

