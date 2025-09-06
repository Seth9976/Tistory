package a;

import androidx.room.CoroutinesRoom;
import com.kakao.kandinsky.b;
import e.o;
import e.p;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class v1 extends SuspendLambda implements Function2 {
    public int a;
    public final b b;
    public final List c;

    public v1(b b0, List list0, Continuation continuation0) {
        this.b = b0;
        this.c = list0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new v1(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new v1(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                p p0 = (p)this.b.c.a;
                o o0 = new o(p0, this.c);
                Unit unit0 = CoroutinesRoom.execute(p0.a, true, o0, this);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                return unit0 == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

