package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import z.j0;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J*\u0010\n\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"androidx/compose/foundation/gestures/DefaultTransformableState$transformScope$1", "Landroidx/compose/foundation/gestures/TransformScope;", "", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "transformBy-d-4ec7I", "(FJF)V", "transformBy", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultTransformableState.transformScope.1 implements TransformScope {
    public final j0 a;

    public DefaultTransformableState.transformScope.1(j0 j00) {
        this.a = j00;
    }

    @Override  // androidx.compose.foundation.gestures.TransformScope
    public void transformBy-d-4ec7I(float f, long v, float f1) {
        Offset offset0 = Offset.box-impl(v);
        this.a.a.invoke(f, offset0, f1);
    }
}

