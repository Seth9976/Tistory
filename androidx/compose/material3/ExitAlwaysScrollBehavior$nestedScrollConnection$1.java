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

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n2\u0006\u0010\u0004\u001A\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"androidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ExitAlwaysScrollBehavior.nestedScrollConnection.1 implements NestedScrollConnection {
    public final e9 a;

    public ExitAlwaysScrollBehavior.nestedScrollConnection.1(e9 e90) {
        this.a = e90;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
        ExitAlwaysScrollBehavior.nestedScrollConnection.1 exitAlwaysScrollBehavior$nestedScrollConnection$10;
        i9 i90;
        if(continuation0 instanceof i9) {
            i90 = (i9)continuation0;
            int v2 = i90.s;
            if((v2 & 0x80000000) == 0) {
                i90 = new i9(this, continuation0);
            }
            else {
                i90.s = v2 ^ 0x80000000;
            }
        }
        else {
            i90 = new i9(this, continuation0);
        }
        Object object0 = i90.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i90.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                i90.o = this;
                i90.p = v1;
                i90.s = 1;
                object0 = NestedScrollConnection.super.onPostFling-RZ2iAVY(v, v1, i90);
                if(object0 == object1) {
                    return object1;
                }
                exitAlwaysScrollBehavior$nestedScrollConnection$10 = this;
                break;
            }
            case 1: {
                v1 = i90.p;
                exitAlwaysScrollBehavior$nestedScrollConnection$10 = i90.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                long v3 = i90.p;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.plus-AH228Gc(v3, ((Velocity)object0).unbox-impl()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v4 = ((Velocity)object0).unbox-impl();
        i90.o = null;
        i90.p = v4;
        i90.s = 2;
        object0 = AppBarKt.access$settleAppBarBottom(((BottomAppBarState)exitAlwaysScrollBehavior$nestedScrollConnection$10.a.e), Velocity.getY-impl(v1), ((DecayAnimationSpec)exitAlwaysScrollBehavior$nestedScrollConnection$10.a.c), ((AnimationSpec)exitAlwaysScrollBehavior$nestedScrollConnection$10.a.b), i90);
        return object0 == object1 ? object1 : Velocity.box-impl(Velocity.plus-AH228Gc(v4, ((Velocity)object0).unbox-impl()));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        e9 e90 = this.a;
        if(!((Boolean)((Function0)e90.d).invoke()).booleanValue()) {
            return 0L;
        }
        float f = ((BottomAppBarState)e90.e).getContentOffset();
        ((BottomAppBarState)e90.e).setContentOffset(Offset.getY-impl(v) + f);
        if((((BottomAppBarState)e90.e).getHeightOffset() == 0.0f || ((BottomAppBarState)e90.e).getHeightOffset() == ((BottomAppBarState)e90.e).getHeightOffsetLimit()) && Offset.getY-impl(v) == 0.0f && Offset.getY-impl(v1) > 0.0f) {
            ((BottomAppBarState)e90.e).setContentOffset(0.0f);
        }
        float f1 = ((BottomAppBarState)e90.e).getHeightOffset();
        ((BottomAppBarState)e90.e).setHeightOffset(Offset.getY-impl(v) + f1);
        return 0L;
    }
}

