package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001A\u0002H\u0002H\u008A@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n*L\n1#1,222:1\n*E\n"})
public final class FlowKt__EmittersKt.unsafeTransform.1.1 implements FlowCollector {
    public final Function3 a;
    public final FlowCollector b;

    public FlowKt__EmittersKt.unsafeTransform.1.1(Function3 function30, FlowCollector flowCollector0) {
        this.a = function30;
        this.b = flowCollector0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public final Object emit(Object object0, @NotNull Continuation continuation0) {
        kotlinx.coroutines.flow.FlowKt__EmittersKt.unsafeTransform.1.1.emit.1 flowKt__EmittersKt$unsafeTransform$1$1$emit$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.unsafeTransform.1.1.emit.1) {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$10 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.unsafeTransform.1.1.emit.1)continuation0;
            int v = flowKt__EmittersKt$unsafeTransform$1$1$emit$10.q;
            if((v & 0x80000000) == 0) {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public Object o;
                    public int q;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.o = object0;
                        this.q |= 0x80000000;
                        return continuation0.emit(null, this);
                    }
                };
            }
            else {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$10.q = v ^ 0x80000000;
            }
        }
        else {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public Object o;
                public int q;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.o = object0;
                    this.q |= 0x80000000;
                    return continuation0.emit(null, this);
                }
            };
        }
        Object object1 = flowKt__EmittersKt$unsafeTransform$1$1$emit$10.o;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__EmittersKt$unsafeTransform$1$1$emit$10.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                flowKt__EmittersKt$unsafeTransform$1$1$emit$10.q = 1;
                return this.a.invoke(this.b, object0, flowKt__EmittersKt$unsafeTransform$1$1$emit$10) == object2 ? object2 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object1);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public final Object emit$$forInline(Object object0, @NotNull Continuation continuation0) {
        new kotlinx.coroutines.flow.FlowKt__EmittersKt.unsafeTransform.1.1.emit.1(this, continuation0);
        this.a.invoke(this.b, object0, continuation0);
        return Unit.INSTANCE;
    }
}

