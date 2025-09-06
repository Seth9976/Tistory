package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\"\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ#\u0010\u0010\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"androidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EnterAlwaysScrollBehavior.nestedScrollConnection.1 implements NestedScrollConnection {
    public final e9 a;

    public EnterAlwaysScrollBehavior.nestedScrollConnection.1(e9 e90) {
        this.a = e90;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
        EnterAlwaysScrollBehavior.nestedScrollConnection.1 enterAlwaysScrollBehavior$nestedScrollConnection$10;
        d9 d90;
        if(continuation0 instanceof d9) {
            d90 = (d9)continuation0;
            int v2 = d90.s;
            if((v2 & 0x80000000) == 0) {
                d90 = new d9(this, continuation0);
            }
            else {
                d90.s = v2 ^ 0x80000000;
            }
        }
        else {
            d90 = new d9(this, continuation0);
        }
        Object object0 = d90.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d90.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                d90.o = this;
                d90.p = v1;
                d90.s = 1;
                object0 = NestedScrollConnection.super.onPostFling-RZ2iAVY(v, v1, d90);
                if(object0 == object1) {
                    return object1;
                }
                enterAlwaysScrollBehavior$nestedScrollConnection$10 = this;
                break;
            }
            case 1: {
                v1 = d90.p;
                enterAlwaysScrollBehavior$nestedScrollConnection$10 = d90.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                long v3 = d90.p;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.plus-AH228Gc(v3, ((Velocity)object0).unbox-impl()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v4 = ((Velocity)object0).unbox-impl();
        d90.o = null;
        d90.p = v4;
        d90.s = 2;
        object0 = AppBarKt.access$settleAppBar(((TopAppBarState)enterAlwaysScrollBehavior$nestedScrollConnection$10.a.e), Velocity.getY-impl(v1), ((DecayAnimationSpec)enterAlwaysScrollBehavior$nestedScrollConnection$10.a.c), ((AnimationSpec)enterAlwaysScrollBehavior$nestedScrollConnection$10.a.b), d90);
        return object0 == object1 ? object1 : Velocity.box-impl(Velocity.plus-AH228Gc(v4, ((Velocity)object0).unbox-impl()));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        e9 e90 = this.a;
        if(!((Boolean)((Function0)e90.d).invoke()).booleanValue()) {
            return 0L;
        }
        float f = ((TopAppBarState)e90.e).getContentOffset();
        ((TopAppBarState)e90.e).setContentOffset(Offset.getY-impl(v) + f);
        if((((TopAppBarState)e90.e).getHeightOffset() == 0.0f || ((TopAppBarState)e90.e).getHeightOffset() == ((TopAppBarState)e90.e).getHeightOffsetLimit()) && Offset.getY-impl(v) == 0.0f && Offset.getY-impl(v1) > 0.0f) {
            ((TopAppBarState)e90.e).setContentOffset(0.0f);
        }
        float f1 = ((TopAppBarState)e90.e).getHeightOffset();
        ((TopAppBarState)e90.e).setHeightOffset(Offset.getY-impl(v) + f1);
        return 0L;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPreScroll-OzD1aCk(long v, int v1) {
        e9 e90 = this.a;
        if(!((Boolean)((Function0)e90.d).invoke()).booleanValue()) {
            return 0L;
        }
        float f = ((TopAppBarState)e90.e).getHeightOffset();
        float f1 = ((TopAppBarState)e90.e).getHeightOffset();
        ((TopAppBarState)e90.e).setHeightOffset(Offset.getY-impl(v) + f1);
        return f == ((TopAppBarState)e90.e).getHeightOffset() ? 0L : Offset.copy-dBAh8RU$default(v, 0.0f, 0.0f, 2, null);
    }
}

