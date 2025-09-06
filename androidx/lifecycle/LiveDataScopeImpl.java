package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001D\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001E\u0010\f\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00028\u0000H\u0097@¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001A\u001A\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", "T", "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/CoroutineLiveData;", "target", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/DisposableHandle;", "emitSource", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/lifecycle/CoroutineLiveData;", "getTarget$lifecycle_livedata_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LiveDataScopeImpl implements LiveDataScope {
    public CoroutineLiveData a;
    public final CoroutineContext b;

    public LiveDataScopeImpl(@NotNull CoroutineLiveData coroutineLiveData0, @NotNull CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(coroutineLiveData0, "target");
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        super();
        this.a = coroutineLiveData0;
        this.b = coroutineContext0.plus(Dispatchers.getMain().getImmediate());
    }

    @Override  // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        d0 d00 = new d0(this, object0, null);
        Object object1 = BuildersKt.withContext(this.b, d00, continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // androidx.lifecycle.LiveDataScope
    @Nullable
    public Object emitSource(@NotNull LiveData liveData0, @NotNull Continuation continuation0) {
        e0 e00 = new e0(this, liveData0, null);
        return BuildersKt.withContext(this.b, e00, continuation0);
    }

    @Override  // androidx.lifecycle.LiveDataScope
    @Nullable
    public Object getLatestValue() {
        return this.a.getValue();
    }

    @NotNull
    public final CoroutineLiveData getTarget$lifecycle_livedata_release() {
        return this.a;
    }

    public final void setTarget$lifecycle_livedata_release(@NotNull CoroutineLiveData coroutineLiveData0) {
        Intrinsics.checkNotNullParameter(coroutineLiveData0, "<set-?>");
        this.a = coroutineLiveData0;
    }
}

