package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.h5;
import p0.i5;
import qd.a;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\"\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ#\u0010\u0013\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"androidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1 implements NestedScrollConnection {
    public final AnchoredDraggableState a;
    public final Orientation b;

    public ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1(AnchoredDraggableState anchoredDraggableState0, Orientation orientation0) {
        this.a = anchoredDraggableState0;
        this.b = orientation0;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
        h5 h50;
        if(continuation0 instanceof h5) {
            h50 = (h5)continuation0;
            int v2 = h50.r;
            if((v2 & 0x80000000) == 0) {
                h50 = new h5(this, continuation0);
            }
            else {
                h50.r = v2 ^ 0x80000000;
            }
        }
        else {
            h50 = new h5(this, continuation0);
        }
        Object object0 = h50.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h50.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h50.o = v1;
                h50.r = 1;
                return this.a.settle((this.b == Orientation.Horizontal ? Velocity.getX-impl(v1) : Velocity.getY-impl(v1)), h50) == object1 ? object1 : Velocity.box-impl(v1);
            }
            case 1: {
                v1 = h50.o;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(v1);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        if(NestedScrollSource.equals-impl0(v2, 1)) {
            float f = this.a.dispatchRawDelta((this.b == Orientation.Horizontal ? Offset.getX-impl(v1) : Offset.getY-impl(v1)));
            float f1 = this.b == Orientation.Horizontal ? f : 0.0f;
            if(this.b != Orientation.Vertical) {
                f = 0.0f;
            }
            return OffsetKt.Offset(f1, f);
        }
        return 0L;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
        i5 i50;
        if(continuation0 instanceof i5) {
            i50 = (i5)continuation0;
            int v1 = i50.r;
            if((v1 & 0x80000000) == 0) {
                i50 = new i5(this, continuation0);
            }
            else {
                i50.r = v1 ^ 0x80000000;
            }
        }
        else {
            i50 = new i5(this, continuation0);
        }
        Object object0 = i50.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i50.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = this.b == Orientation.Horizontal ? Velocity.getX-impl(v) : Velocity.getY-impl(v);
                AnchoredDraggableState anchoredDraggableState0 = this.a;
                if(f >= 0.0f || anchoredDraggableState0.requireOffset() <= anchoredDraggableState0.getAnchors().minAnchor()) {
                    v = 0L;
                }
                else {
                    i50.o = v;
                    i50.r = 1;
                    if(anchoredDraggableState0.settle(f, i50) == object1) {
                        return object1;
                    }
                }
                return Velocity.box-impl(v);
            }
            case 1: {
                v = i50.o;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(v);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPreScroll-OzD1aCk(long v, int v1) {
        Orientation orientation0 = Orientation.Horizontal;
        Orientation orientation1 = this.b;
        float f = orientation1 == orientation0 ? Offset.getX-impl(v) : Offset.getY-impl(v);
        float f1 = 0.0f;
        if(f < 0.0f && NestedScrollSource.equals-impl0(v1, 1)) {
            float f2 = this.a.dispatchRawDelta(f);
            if(orientation1 == Orientation.Vertical) {
                f1 = f2;
            }
            return OffsetKt.Offset((orientation1 == orientation0 ? f2 : 0.0f), f1);
        }
        return 0L;
    }
}

