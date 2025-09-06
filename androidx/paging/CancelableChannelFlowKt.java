package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s4.p;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AP\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042-\u0010\u0005\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006¢\u0006\u0002\b\u000BH\u0000¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"cancelableChannelFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "controller", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Landroidx/paging/SimpleProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CancelableChannelFlowKt {
    @NotNull
    public static final Flow cancelableChannelFlow(@NotNull Job job0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(job0, "controller");
        Intrinsics.checkNotNullParameter(function20, "block");
        return SimpleChannelFlowKt.simpleChannelFlow(new p(job0, function20, null));
    }
}

