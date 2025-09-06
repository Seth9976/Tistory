package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import xf.b1;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n53#2,3:114\n66#2,4:117\n*E\n"})
public final class FlowKt__LimitKt.take..inlined.unsafeFlow.1 implements Flow {
    public final Flow a;
    public final int b;

    public FlowKt__LimitKt.take..inlined.unsafeFlow.1(Flow flow0, int v) {
        this.a = flow0;
        this.b = v;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        kotlinx.coroutines.flow.FlowKt__LimitKt.take..inlined.unsafeFlow.1.1 flowKt__LimitKt$take$$inlined$unsafeFlow$1$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.take..inlined.unsafeFlow.1.1) {
            flowKt__LimitKt$take$$inlined$unsafeFlow$1$10 = (kotlinx.coroutines.flow.FlowKt__LimitKt.take..inlined.unsafeFlow.1.1)continuation0;
            int v = flowKt__LimitKt$take$$inlined$unsafeFlow$1$10.p;
            if((v & 0x80000000) == 0) {
                flowKt__LimitKt$take$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public Object o;
                    public int p;
                    public FlowCollector r;

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
                flowKt__LimitKt$take$$inlined$unsafeFlow$1$10.p = v ^ 0x80000000;
            }
        }
        else {
            flowKt__LimitKt$take$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public Object o;
                public int p;
                public FlowCollector r;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return continuation0.collect(null, this);
                }
            };
        }
        Object object0 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__LimitKt$take$$inlined$unsafeFlow$1$10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                IntRef ref$IntRef0 = new IntRef();
                try {
                    b1 b10 = new b1(ref$IntRef0, this.b, flowCollector0);
                    flowKt__LimitKt$take$$inlined$unsafeFlow$1$10.r = flowCollector0;
                    flowKt__LimitKt$take$$inlined$unsafeFlow$1$10.p = 1;
                    if(this.a.collect(b10, flowKt__LimitKt$take$$inlined$unsafeFlow$1$10) == object1) {
                        return object1;
                    }
                }
                catch(AbortFlowException abortFlowException0) {
                    FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowCollector0);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    flowCollector0 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$10.r;
                    ResultKt.throwOnFailure(object0);
                }
                catch(AbortFlowException abortFlowException0) {
                    FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowCollector0);
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

