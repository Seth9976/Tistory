package androidx.compose.runtime;

import androidx.compose.foundation.layout.b4;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\'\u0010\n\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000E¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;
    public final Function2 a;
    public final CoroutineScope b;
    public Job c;

    public LaunchedEffectImpl(@NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) {
        this.a = function20;
        this.b = CoroutineScopeKt.CoroutineScope(coroutineContext0);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Job job0 = this.c;
        if(job0 != null) {
            job0.cancel(new b4(5));
        }
        this.c = null;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Job job0 = this.c;
        if(job0 != null) {
            job0.cancel(new b4(5));
        }
        this.c = null;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Job job0 = this.c;
        if(job0 != null) {
            JobKt.cancel$default(job0, "Old job was still running!", null, 2, null);
        }
        this.c = BuildersKt.launch$default(this.b, null, null, this.a, 3, null);
    }
}

