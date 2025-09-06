package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ*\u0010\u0010\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    public final NestedScrollingChildHelper a;
    public final int[] b;

    public NestedScrollInteropConnection(@NotNull View view0) {
        NestedScrollingChildHelper nestedScrollingChildHelper0 = new NestedScrollingChildHelper(view0);
        nestedScrollingChildHelper0.setNestedScrollingEnabled(true);
        this.a = nestedScrollingChildHelper0;
        this.b = new int[2];
        ViewCompat.setNestedScrollingEnabled(view0, true);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
        NestedScrollingChildHelper nestedScrollingChildHelper0 = this.a;
        if(!nestedScrollingChildHelper0.dispatchNestedFling(Velocity.getX-impl(v1) * -1.0f, Velocity.getY-impl(v1) * -1.0f, true)) {
            v1 = 0L;
        }
        if(nestedScrollingChildHelper0.hasNestedScrollingParent(0)) {
            nestedScrollingChildHelper0.stopNestedScroll(0);
        }
        if(nestedScrollingChildHelper0.hasNestedScrollingParent(1)) {
            nestedScrollingChildHelper0.stopNestedScroll(1);
        }
        return Velocity.box-impl(v1);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        int v3 = NestedScrollInteropConnectionKt.access$toViewType-GyEprt8(v2);
        if(this.a.startNestedScroll(NestedScrollInteropConnectionKt.access$getScrollAxes-k-4lQ0M(v1), v3)) {
            ArraysKt___ArraysJvmKt.fill$default(this.b, 0, 0, 0, 6, null);
            int v4 = NestedScrollInteropConnectionKt.access$toViewType-GyEprt8(v2);
            this.a.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getX-impl(v)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getY-impl(v)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getX-impl(v1)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getY-impl(v1)), null, v4, this.b);
            return NestedScrollInteropConnectionKt.access$toOffset-Uv8p0NA(this.b, v1);
        }
        return 0L;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
        NestedScrollingChildHelper nestedScrollingChildHelper0 = this.a;
        if(!nestedScrollingChildHelper0.dispatchNestedPreFling(Velocity.getX-impl(v) * -1.0f, Velocity.getY-impl(v) * -1.0f)) {
            v = 0L;
        }
        if(nestedScrollingChildHelper0.hasNestedScrollingParent(0)) {
            nestedScrollingChildHelper0.stopNestedScroll(0);
        }
        if(nestedScrollingChildHelper0.hasNestedScrollingParent(1)) {
            nestedScrollingChildHelper0.stopNestedScroll(1);
        }
        return Velocity.box-impl(v);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPreScroll-OzD1aCk(long v, int v1) {
        int v2 = NestedScrollInteropConnectionKt.access$toViewType-GyEprt8(v1);
        if(this.a.startNestedScroll(NestedScrollInteropConnectionKt.access$getScrollAxes-k-4lQ0M(v), v2)) {
            ArraysKt___ArraysJvmKt.fill$default(this.b, 0, 0, 0, 6, null);
            int v3 = NestedScrollInteropConnectionKt.access$toViewType-GyEprt8(v1);
            this.a.dispatchNestedPreScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getX-impl(v)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getY-impl(v)), this.b, null, v3);
            return NestedScrollInteropConnectionKt.access$toOffset-Uv8p0NA(this.b, v);
        }
        return 0L;
    }
}

