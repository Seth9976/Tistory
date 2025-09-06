package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\u008A@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {0xC1, 0xC1}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,218:1\n*E\n"})
public final class FlowKt__MergeKt.flatMapLatest.1 extends SuspendLambda implements Function3 {
    public int o;
    public FlowCollector p;
    public Object q;
    public final Function2 r;

    public FlowKt__MergeKt.flatMapLatest.1(Function2 function20, Continuation continuation0) {
        this.r = function20;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
        FlowKt__MergeKt.flatMapLatest.1 flowKt__MergeKt$flatMapLatest$10 = new FlowKt__MergeKt.flatMapLatest.1(this.r, continuation0);
        flowKt__MergeKt$flatMapLatest$10.p = flowCollector0;
        flowKt__MergeKt$flatMapLatest$10.q = object0;
        return flowKt__MergeKt$flatMapLatest$10.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = this.p;
                this.p = flowCollector0;
                this.o = 1;
                object0 = this.r.invoke(this.q, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                flowCollector0 = this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.p = null;
        this.o = 2;
        return FlowKt.emitAll(flowCollector0, ((Flow)object0), this) == object1 ? object1 : Unit.INSTANCE;
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object object0) {
        FlowKt.emitAll(this.p, ((Flow)this.r.invoke(this.q, this)), this);
        return Unit.INSTANCE;
    }
}

