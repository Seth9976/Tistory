package t;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o0.e;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public FloatRef o;
    public int p;
    public Object q;
    public final MutableState r;
    public final InfiniteTransition s;

    public m(MutableState mutableState0, InfiniteTransition infiniteTransition0, Continuation continuation0) {
        this.r = mutableState0;
        this.s = infiniteTransition0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FloatRef ref$FloatRef0;
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.q;
                ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = 1.0f;
                break;
            }
            case 1: {
                ref$FloatRef0 = this.o;
                CoroutineScope coroutineScope1 = (CoroutineScope)this.q;
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = coroutineScope1;
                goto label_23;
            }
            case 2: {
                ref$FloatRef0 = this.o;
                CoroutineScope coroutineScope2 = (CoroutineScope)this.q;
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = coroutineScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            do {
                androidx.compose.animation.core.a a0 = new androidx.compose.animation.core.a(this.r, this.s, ref$FloatRef0, coroutineScope0);
                this.q = coroutineScope0;
                this.o = ref$FloatRef0;
                this.p = 1;
                if(InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(a0, this) == object1) {
                    return object1;
                }
            label_23:
            }
            while(ref$FloatRef0.element != 0.0f);
            Flow flow0 = SnapshotStateKt.snapshotFlow(new e(coroutineScope0, 21));
            l l0 = new l(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
            this.q = coroutineScope0;
            this.o = ref$FloatRef0;
            this.p = 2;
        }
        while(FlowKt.first(flow0, l0, this) != object1);
        return object1;
    }
}

