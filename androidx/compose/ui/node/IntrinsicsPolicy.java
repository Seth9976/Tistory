package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\f¢\u0006\u0004\b\u0011\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u0012\u0010\u000FJ\u0015\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\f¢\u0006\u0004\b\u0013\u0010\u000FJ\u0015\u0010\u0014\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u0014\u0010\u000FJ\u0015\u0010\u0015\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\f¢\u0006\u0004\b\u0015\u0010\u000FJ\u0015\u0010\u0016\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u0016\u0010\u000FJ\u0015\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\f¢\u0006\u0004\b\u0017\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/MeasurePolicy;", "policy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "", "updateFrom", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "minLookaheadIntrinsicWidth", "minLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "maxLookaheadIntrinsicHeight", "a", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,80:1\n81#2:81\n107#2,2:82\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:81\n30#1:82,2\n*E\n"})
public final class IntrinsicsPolicy {
    public static final int $stable = 8;
    public final LayoutNode a;
    public final MutableState b;

    public IntrinsicsPolicy(@NotNull LayoutNode layoutNode0, @NotNull MeasurePolicy measurePolicy0) {
        this.a = layoutNode0;
        this.b = SnapshotStateKt.mutableStateOf$default(measurePolicy0, null, 2, null);
    }

    public final MeasurePolicy a() {
        return (MeasurePolicy)this.b.getValue();
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.a;
    }

    public final int maxIntrinsicHeight(int v) {
        return this.a().maxIntrinsicHeight(this.a.getOuterCoordinator$ui_release(), this.a.getChildMeasurables$ui_release(), v);
    }

    public final int maxIntrinsicWidth(int v) {
        return this.a().maxIntrinsicWidth(this.a.getOuterCoordinator$ui_release(), this.a.getChildMeasurables$ui_release(), v);
    }

    public final int maxLookaheadIntrinsicHeight(int v) {
        return this.a().maxIntrinsicHeight(this.a.getOuterCoordinator$ui_release(), this.a.getChildLookaheadMeasurables$ui_release(), v);
    }

    public final int maxLookaheadIntrinsicWidth(int v) {
        return this.a().maxIntrinsicWidth(this.a.getOuterCoordinator$ui_release(), this.a.getChildLookaheadMeasurables$ui_release(), v);
    }

    public final int minIntrinsicHeight(int v) {
        return this.a().minIntrinsicHeight(this.a.getOuterCoordinator$ui_release(), this.a.getChildMeasurables$ui_release(), v);
    }

    public final int minIntrinsicWidth(int v) {
        return this.a().minIntrinsicWidth(this.a.getOuterCoordinator$ui_release(), this.a.getChildMeasurables$ui_release(), v);
    }

    public final int minLookaheadIntrinsicHeight(int v) {
        return this.a().minIntrinsicHeight(this.a.getOuterCoordinator$ui_release(), this.a.getChildLookaheadMeasurables$ui_release(), v);
    }

    public final int minLookaheadIntrinsicWidth(int v) {
        return this.a().minIntrinsicWidth(this.a.getOuterCoordinator$ui_release(), this.a.getChildLookaheadMeasurables$ui_release(), v);
    }

    public final void updateFrom(@NotNull MeasurePolicy measurePolicy0) {
        this.b.setValue(measurePolicy0);
    }
}

