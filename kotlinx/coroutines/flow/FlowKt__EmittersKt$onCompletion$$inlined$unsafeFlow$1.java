package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import xf.o0;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,113:1\n147#2,13:114\n160#2,6:128\n329#3:127\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n159#1:127\n*E\n"})
public final class FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1 implements Flow {
    public final Flow a;
    public final Function3 b;

    public FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1(Flow flow0, Function3 function30) {
        this.a = flow0;
        this.b = function30;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        SafeCollector safeCollector1;
        Throwable throwable2;
        FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$10;
        kotlinx.coroutines.flow.FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1.1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1.1) {
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1.1)continuation0;
            int v = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.p;
            if((v & 0x80000000) == 0) {
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public Object o;
                    public int p;
                    public Object r;
                    public FlowCollector s;

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
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.p = v ^ 0x80000000;
            }
        }
        else {
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public Object o;
                public int p;
                public Object r;
                public FlowCollector s;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return continuation0.collect(null, this);
                }
            };
        }
        Object object0 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.r = this;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.s = flowCollector0;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.p = 1;
                    if(this.a.collect(flowCollector0, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$10 = this;
                    goto label_30;
                }
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$10 = this;
                goto label_36;
            }
            case 1: {
                flowCollector0 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.s;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$10 = (FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1)flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.r;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_36;
                }
                catch(Throwable throwable0) {
                }
            label_30:
                ThrowingCollector throwingCollector0 = new ThrowingCollector(throwable0);
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.r = throwable0;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.s = null;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.p = 2;
                if(o0.a(throwingCollector0, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$10.b, throwable0, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10) != object1) {
                    throw throwable0;
                }
                return object1;
            label_36:
                SafeCollector safeCollector0 = new SafeCollector(flowCollector0, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.getContext());
                try {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.r = safeCollector0;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.s = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.p = 3;
                    if(flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$10.b.invoke(safeCollector0, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    safeCollector1 = safeCollector0;
                    safeCollector1.releaseIntercepted();
                    throw throwable2;
                }
                safeCollector1 = safeCollector0;
                break;
            }
            case 2: {
                throwable0 = (Throwable)flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.r;
                ResultKt.throwOnFailure(object0);
                throw throwable0;
            }
            case 3: {
                safeCollector1 = (SafeCollector)flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$10.r;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable2) {
                }
                safeCollector1.releaseIntercepted();
                throw throwable2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        safeCollector1.releaseIntercepted();
        return Unit.INSTANCE;
    }
}

