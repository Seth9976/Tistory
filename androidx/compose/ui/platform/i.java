package androidx.compose.ui.platform;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import ca.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonElementMarker;

public final class i extends FunctionReferenceImpl implements Function2 {
    public final int a;

    public i(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.a = v2;
        super(v, object0, class0, s, s1, v1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                return Boolean.valueOf(AndroidComposeView.access$onRequestFocusForOwner-7o62pno(((AndroidComposeView)this.receiver), ((FocusDirection)object0), ((Rect)object1)));
            }
            case 1: {
                ((o0)this.receiver).a.invoke(object0, object1);
                return Unit.INSTANCE;
            }
            case 2: {
                return ((o0)this.receiver).a.invoke(object0, object1);
            }
            case 3: {
                return LazyStaggeredGridState.access$fillNearestIndices(((LazyStaggeredGridState)this.receiver), ((Number)object0).intValue(), ((Number)object1).intValue());
            }
            default: {
                Intrinsics.checkNotNullParameter(((SerialDescriptor)object0), "p0");
                return Boolean.valueOf(JsonElementMarker.access$readIfAbsent(((JsonElementMarker)this.receiver), ((SerialDescriptor)object0), ((Number)object1).intValue()));
            }
        }
    }
}

