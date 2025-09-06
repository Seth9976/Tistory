package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xf.y1;
import xf.z1;

public final class a extends SuspendLambda implements Function2 {
    public int o;
    public final SharingStarted p;
    public final Flow q;
    public final MutableSharedFlow r;
    public final Object s;

    public a(SharingStarted sharingStarted0, Flow flow0, MutableSharedFlow mutableSharedFlow0, Object object0, Continuation continuation0) {
        this.p = sharingStarted0;
        this.q = flow0;
        this.r = mutableSharedFlow0;
        this.s = object0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        Flow flow0 = this.q;
        MutableSharedFlow mutableSharedFlow0 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Companion sharingStarted$Companion0 = SharingStarted.Companion;
                SharingStarted sharingStarted0 = this.p;
                if(sharingStarted0 == sharingStarted$Companion0.getEagerly()) {
                    this.o = 1;
                    if(flow0.collect(mutableSharedFlow0, this) == object1) {
                        return object1;
                    }
                }
                else if(sharingStarted0 == sharingStarted$Companion0.getLazily()) {
                    StateFlow stateFlow0 = mutableSharedFlow0.getSubscriptionCount();
                    y1 y10 = new y1(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
                    this.o = 2;
                    if(FlowKt.first(stateFlow0, y10, this) == object1) {
                        return object1;
                    }
                label_22:
                    this.o = 3;
                    if(flow0.collect(mutableSharedFlow0, this) == object1) {
                        return object1;
                    }
                }
                else {
                    Flow flow1 = FlowKt.distinctUntilChanged(sharingStarted0.command(mutableSharedFlow0.getSubscriptionCount()));
                    z1 z10 = new z1(flow0, mutableSharedFlow0, this.s, null);
                    this.o = 4;
                    if(FlowKt.collectLatest(flow1, z10, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                goto label_22;
            }
            case 1: 
            case 3: 
            case 4: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

