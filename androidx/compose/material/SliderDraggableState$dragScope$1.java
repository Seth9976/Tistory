package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;
import p0.j7;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/material/SliderDraggableState$dragScope$1", "Landroidx/compose/foundation/gestures/DragScope;", "", "pixels", "", "dragBy", "(F)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SliderDraggableState.dragScope.1 implements DragScope {
    public final j7 a;

    public SliderDraggableState.dragScope.1(j7 j70) {
        this.a = j70;
    }

    @Override  // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f) {
        this.a.a.invoke(f);
    }
}

