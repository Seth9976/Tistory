package kotlinx.coroutines.flow.internal;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AN\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0005\u0010\u0003\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001A\u0018\u0010\u000B\u001A\u00020\u0007*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001A\u00020\u000EH\u0001\u001A\u001B\u0010\u000F\u001A\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0080\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "checkContext", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SafeCollector_commonKt {
    @JvmName(name = "checkContext")
    public static final void checkContext(@NotNull SafeCollector safeCollector0, @NotNull CoroutineContext coroutineContext0) {
        if(((Number)coroutineContext0.fold(0, new a0(safeCollector0))).intValue() != safeCollector0.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector0.collectContext + ",\n\t\tbut emission happened in " + coroutineContext0 + ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead").toString());
        }
    }

    @Nullable
    public static final Job transitiveCoroutineParent(@Nullable Job job0, @Nullable Job job1) {
        while(true) {
            if(job0 == null) {
                return null;
            }
            if(job0 == job1) {
                return job0;
            }
            if(!(job0 instanceof ScopeCoroutine)) {
                return job0;
            }
            job0 = job0.getParent();
        }
    }

    @PublishedApi
    @NotNull
    public static final Flow unsafeFlow(@BuilderInference @NotNull Function2 function20) {
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                Object object0 = function20.invoke(flowCollector0, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
                @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
                public final class kotlinx.coroutines.flow.internal.SafeCollector_commonKt.unsafeFlow.1.collect.1 extends ContinuationImpl {
                    public Object o;

                    public kotlinx.coroutines.flow.internal.SafeCollector_commonKt.unsafeFlow.1.collect.1(kotlinx.coroutines.flow.internal.SafeCollector_commonKt.unsafeFlow.1 safeCollector_commonKt$unsafeFlow$10, Continuation continuation0) {
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.o = object0;
                        return this.p.collect(null, this);
                    }
                }

            }

            @Nullable
            public Object collect$$forInline(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                new kotlinx.coroutines.flow.internal.SafeCollector_commonKt.unsafeFlow.1.collect.1(this, continuation0);
                function20.invoke(flowCollector0, continuation0);
                return Unit.INSTANCE;
            }
        };
    }
}

