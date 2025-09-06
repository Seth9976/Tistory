package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bb\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012-\u0010\n\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0002\b\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\b0\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/BlockRunner;", "T", "", "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "", "timeoutInMs", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/jvm/functions/Function2;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V", "maybeRun", "()V", "cancel", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BlockRunner {
    public final CoroutineLiveData a;
    public final Function2 b;
    public final long c;
    public final CoroutineScope d;
    public final Function0 e;
    public Job f;
    public Job g;

    public BlockRunner(@NotNull CoroutineLiveData coroutineLiveData0, @NotNull Function2 function20, long v, @NotNull CoroutineScope coroutineScope0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(coroutineLiveData0, "liveData");
        Intrinsics.checkNotNullParameter(function20, "block");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(function00, "onDone");
        super();
        this.a = coroutineLiveData0;
        this.b = function20;
        this.c = v;
        this.d = coroutineScope0;
        this.e = function00;
    }

    @MainThread
    public final void cancel() {
        if(this.g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        a a0 = new a(this, null);
        this.g = BuildersKt.launch$default(this.d, mainCoroutineDispatcher0, null, a0, 2, null);
    }

    @MainThread
    public final void maybeRun() {
        Job job0 = this.g;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.g = null;
        if(this.f != null) {
            return;
        }
        b b0 = new b(this, null);
        this.f = BuildersKt.launch$default(this.d, null, null, b0, 3, null);
    }
}

