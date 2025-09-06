package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,113:1\n133#2,15:114\n*E\n"})
public final class FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 implements Flow {
    public final Flow a;
    public final Function4 b;

    public FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1(Flow flow0, Function4 function40) {
        this.a = flow0;
        this.b = function40;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        FlowCollector flowCollector1;
        Throwable throwable0;
        FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
        FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10;
        long v1;
        kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1.1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1.1) {
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1.1)continuation0;
            int v = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.p;
            if((v & 0x80000000) == 0) {
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public Object o;
                    public int p;
                    public FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 r;
                    public FlowCollector s;
                    public Throwable t;
                    public long u;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.o = object0;
                        this.p |= 0x80000000;
                        return continuation0.collect(null, this);
                    }
                };
            }
            else {
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.p = v ^ 0x80000000;
            }
        }
        else {
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public Object o;
                public int p;
                public FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 r;
                public FlowCollector s;
                public Throwable t;
                public long u;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return continuation0.collect(null, this);
                }
            };
        }
        Object object0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v1 = 0L;
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10 = this;
                goto label_35;
            }
            case 1: {
                v1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.u;
                flowCollector0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.s;
                FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.r;
                ResultKt.throwOnFailure(object0);
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11;
                goto label_45;
            }
            case 2: {
                v1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.u;
                throwable0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.t;
                flowCollector1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.s;
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Boolean)object0).booleanValue()) {
            ++v1;
            for(boolean z = true; true; z = false) {
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                if(!z) {
                    return Unit.INSTANCE;
                }
                flowCollector0 = flowCollector1;
            label_35:
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.r = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10;
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.s = flowCollector0;
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.t = null;
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.u = v1;
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.p = 1;
                Object object2 = FlowKt.catchImpl(flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10.a, flowCollector0, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10);
                if(object2 == object1) {
                    return object1;
                }
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10;
                object0 = object2;
            label_45:
                flowCollector1 = flowCollector0;
                throwable0 = (Throwable)object0;
                if(throwable0 != null) {
                    break;
                }
            }
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.r = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.s = flowCollector1;
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.t = throwable0;
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.u = v1;
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.p = 2;
            object0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.b.invoke(flowCollector1, throwable0, Boxing.boxLong(v1), flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        throw throwable0;
    }
}

