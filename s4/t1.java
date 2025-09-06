package s4;

import androidx.paging.e1;
import androidx.paging.f1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class t1 extends SuspendLambda implements Function2 {
    public BooleanRef o;
    public int p;
    public final f1 q;

    public t1(f1 f10, Continuation continuation0) {
        this.q = f10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new t1(this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        BooleanRef ref$BooleanRef1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        f1 f10 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                BooleanRef ref$BooleanRef0 = new BooleanRef();
                e1 e10 = new e1(f10, ref$BooleanRef0, null);
                this.o = ref$BooleanRef0;
                this.p = 1;
                if(f10.d.runInIsolation(2, e10, this) == object1) {
                    return object1;
                }
                ref$BooleanRef1 = ref$BooleanRef0;
                break;
            }
            case 1: {
                ref$BooleanRef1 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ref$BooleanRef1.element) {
            f10.getClass();
            s1 s10 = new s1(f10, null);
            BuildersKt.launch$default(f10.a, null, null, s10, 3, null);
        }
        return Unit.INSTANCE;
    }
}

