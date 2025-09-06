package u2;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class g extends SuspendLambda implements Function2 {
    public int o;
    public final boolean p;
    public final AndroidViewHolder q;
    public final long r;

    public g(boolean z, AndroidViewHolder androidViewHolder0, long v, Continuation continuation0) {
        this.p = z;
        this.q = androidViewHolder0;
        this.r = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AndroidViewHolder androidViewHolder0 = this.q;
                if(this.p) {
                    this.o = 2;
                    if(androidViewHolder0.a.dispatchPostFling-RZ2iAVY(this.r, 0L, this) == object1) {
                        return object1;
                    }
                }
                else {
                    this.o = 1;
                    if(androidViewHolder0.a.dispatchPostFling-RZ2iAVY(0L, this.r, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: 
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

