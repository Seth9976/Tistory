package t0;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class i implements NestedScrollConnection {
    public final Function1 a;
    public final Function2 b;
    public final boolean c;

    public i(Function1 function10, Function2 function20, boolean z) {
        this.a = function10;
        this.b = function20;
        this.c = z;
    }

    // 去混淆评级： 低(26)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        if(!this.c) {
            return 0L;
        }
        return !NestedScrollSource.equals-impl0(v2, 1) || Offset.getY-impl(v1) <= 0.0f ? 0L : OffsetKt.Offset(0.0f, ((Number)this.a.invoke(Offset.getY-impl(v1))).floatValue());
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object onPreFling-QWom1Mo(long v, Continuation continuation0) {
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v1 = h0.q;
            if((v1 & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.q = v1 ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h0.q = 1;
                object0 = this.b.invoke(Boxing.boxFloat(Velocity.getY-impl(v)), h0);
                return object0 == object1 ? object1 : Velocity.box-impl(VelocityKt.Velocity(0.0f, ((Number)object0).floatValue()));
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(VelocityKt.Velocity(0.0f, ((Number)object0).floatValue()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(26)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPreScroll-OzD1aCk(long v, int v1) {
        if(!this.c) {
            return 0L;
        }
        return !NestedScrollSource.equals-impl0(v1, 1) || Offset.getY-impl(v) >= 0.0f ? 0L : OffsetKt.Offset(0.0f, ((Number)this.a.invoke(Offset.getY-impl(v))).floatValue());
    }
}

