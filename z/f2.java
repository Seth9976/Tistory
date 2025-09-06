package z;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import qd.a;

public final class f2 implements NestedScrollConnection {
    public final ScrollingLogic a;
    public boolean b;

    public f2(ScrollingLogic scrollingLogic0, boolean z) {
        this.a = scrollingLogic0;
        this.b = z;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object onPostFling-RZ2iAVY(long v, long v1, Continuation continuation0) {
        e2 e20;
        if(continuation0 instanceof e2) {
            e20 = (e2)continuation0;
            int v2 = e20.r;
            if((v2 & 0x80000000) == 0) {
                e20 = new e2(this, continuation0);
            }
            else {
                e20.r = v2 ^ 0x80000000;
            }
        }
        else {
            e20 = new e2(this, continuation0);
        }
        Object object0 = e20.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e20.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.b) {
                    e20.o = v1;
                    e20.r = 1;
                    object0 = this.a.doFlingAnimation-QWom1Mo(v1, e20);
                    return object0 == object1 ? object1 : Velocity.box-impl(Velocity.minus-AH228Gc(v1, ((Velocity)object0).unbox-impl()));
                }
                return Velocity.box-impl(0L);
            }
            case 1: {
                v1 = e20.o;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.minus-AH228Gc(v1, ((Velocity)object0).unbox-impl()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        return this.b ? this.a.performRawScroll-MK-Hz9U(v1) : 0L;
    }
}

