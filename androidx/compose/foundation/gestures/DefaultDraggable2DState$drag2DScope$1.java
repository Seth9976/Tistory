package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import z.z;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/DefaultDraggable2DState$drag2DScope$1", "Landroidx/compose/foundation/gestures/Drag2DScope;", "Landroidx/compose/ui/geometry/Offset;", "pixels", "", "dragBy-k-4lQ0M", "(J)V", "dragBy", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultDraggable2DState.drag2DScope.1 implements Drag2DScope {
    public final z a;

    public DefaultDraggable2DState.drag2DScope.1(z z0) {
        this.a = z0;
    }

    @Override  // androidx.compose.foundation.gestures.Drag2DScope
    public void dragBy-k-4lQ0M(long v) {
        Offset offset0 = Offset.box-impl(v);
        this.a.a.invoke(offset0);
    }
}

