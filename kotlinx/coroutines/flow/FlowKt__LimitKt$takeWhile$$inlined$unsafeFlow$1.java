package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n85#2:114\n126#2,15:115\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n85#1:115,15\n*E\n"})
public final class FlowKt__LimitKt.takeWhile..inlined.unsafeFlow.1 implements Flow {
    public final Flow a;
    public final Function2 b;

    public FlowKt__LimitKt.takeWhile..inlined.unsafeFlow.1(Flow flow0, Function2 function20) {
        this.a = flow0;
        this.b = function20;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10;
        kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile..inlined.unsafeFlow.1.1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile..inlined.unsafeFlow.1.1) {
            flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10 = (kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile..inlined.unsafeFlow.1.1)continuation0;
            int v = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10.p;
            if((v & 0x80000000) == 0) {
                flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public Object o;
                    public int p;
                    public FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 r;

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
                flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10.p = v ^ 0x80000000;
            }
        }
        else {
            flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public Object o;
                public int p;
                public FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 r;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return continuation0.collect(null, this);
                }
            };
        }
        Object object0 = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$11 = new FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1(this.b, flowCollector0);
                try {
                    flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10.r = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$11;
                    flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10.p = 1;
                    return this.a.collect(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$11, flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10) == object1 ? object1 : Unit.INSTANCE;
                }
                catch(AbortFlowException abortFlowException0) {
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$11;
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10);
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10 = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$10.r;
                    ResultKt.throwOnFailure(object0);
                }
                catch(AbortFlowException abortFlowException0) {
                    FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10);
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

