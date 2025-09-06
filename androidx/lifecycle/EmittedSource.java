package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/EmittedSource;", "Lkotlinx/coroutines/DisposableHandle;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/MediatorLiveData;", "mediator", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/MediatorLiveData;)V", "", "disposeNow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "()V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EmittedSource implements DisposableHandle {
    public final LiveData a;
    public final MediatorLiveData b;
    public boolean c;

    public EmittedSource(@NotNull LiveData liveData0, @NotNull MediatorLiveData mediatorLiveData0) {
        Intrinsics.checkNotNullParameter(liveData0, "source");
        Intrinsics.checkNotNullParameter(mediatorLiveData0, "mediator");
        super();
        this.a = liveData0;
        this.b = mediatorLiveData0;
    }

    public static final void access$removeSource(EmittedSource emittedSource0) {
        if(!emittedSource0.c) {
            emittedSource0.b.removeSource(emittedSource0.a);
            emittedSource0.c = true;
        }
    }

    @Override  // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new l(this, null), 3, null);
    }

    @Nullable
    public final Object disposeNow(@NotNull Continuation continuation0) {
        Object object0 = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new m(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

