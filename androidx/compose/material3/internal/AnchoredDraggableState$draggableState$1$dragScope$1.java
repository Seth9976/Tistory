package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$dragScope$1", "Landroidx/compose/foundation/gestures/DragScope;", "", "pixels", "", "dragBy", "(F)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$dragScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1#2:869\n*E\n"})
public final class AnchoredDraggableState.draggableState.1.dragScope.1 implements DragScope {
    public final AnchoredDraggableState a;

    public AnchoredDraggableState.draggableState.1.dragScope.1(AnchoredDraggableState anchoredDraggableState0) {
        this.a = anchoredDraggableState0;
    }

    @Override  // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f) {
        AnchoredDragScope.dragTo$default(AnchoredDraggableState.access$getAnchoredDragScope$p(this.a), this.a.newOffsetForDelta$material3_release(f), 0.0f, 2, null);
    }
}

