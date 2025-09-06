package androidx.lifecycle;

import a2.b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BJ\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012-\u0010\r\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0007¢\u0006\u0002\b\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u001E\u0010\u0015\u001A\u00020\u00122\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001A\u00020\nH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\nH\u0014¢\u0006\u0004\b\u001B\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/DisposableHandle;", "emitSource$lifecycle_livedata_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "clearSource$lifecycle_livedata_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSource", "onActive", "()V", "onInactive", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CoroutineLiveData extends MediatorLiveData {
    public BlockRunner p;
    public EmittedSource q;

    public CoroutineLiveData(@NotNull CoroutineContext coroutineContext0, long v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(function20, "block");
        super();
        CompletableJob completableJob0 = SupervisorKt.SupervisorJob(((Job)coroutineContext0.get(Job.Key)));
        this.p = new BlockRunner(this, function20, v, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(coroutineContext0).plus(completableJob0)), new b(this, 19));
    }

    public CoroutineLiveData(CoroutineContext coroutineContext0, long v, Function2 function20, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v1 & 2) != 0) {
            v = 5000L;
        }
        this(coroutineContext0, v, function20);
    }

    @Nullable
    public final Object clearSource$lifecycle_livedata_release(@NotNull Continuation continuation0) {
        CoroutineLiveData coroutineLiveData0;
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.r;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.r = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                EmittedSource emittedSource0 = this.q;
                if(emittedSource0 != null) {
                    g0.o = this;
                    g0.r = 1;
                    if(emittedSource0.disposeNow(g0) == object1) {
                        return object1;
                    }
                }
                coroutineLiveData0 = this;
                break;
            }
            case 1: {
                coroutineLiveData0 = g0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        coroutineLiveData0.q = null;
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object emitSource$lifecycle_livedata_release(@NotNull LiveData liveData0, @NotNull Continuation continuation0) {
        CoroutineLiveData coroutineLiveData0;
        LiveData liveData1;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.s;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.s = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h0.o = this;
                h0.p = liveData0;
                h0.s = 1;
                if(this.clearSource$lifecycle_livedata_release(h0) == object1) {
                    return object1;
                }
                liveData1 = liveData0;
                coroutineLiveData0 = this;
                goto label_27;
            }
            case 1: {
                LiveData liveData2 = h0.p;
                CoroutineLiveData coroutineLiveData1 = h0.o;
                ResultKt.throwOnFailure(object0);
                liveData1 = liveData2;
                coroutineLiveData0 = coroutineLiveData1;
            label_27:
                h0.o = coroutineLiveData0;
                h0.p = null;
                h0.s = 2;
                object0 = CoroutineLiveDataKt.addDisposableSource(coroutineLiveData0, liveData1, h0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                coroutineLiveData0 = h0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        coroutineLiveData0.q = (EmittedSource)object0;
        return (EmittedSource)object0;
    }

    @Override  // androidx.lifecycle.MediatorLiveData
    public void onActive() {
        super.onActive();
        BlockRunner blockRunner0 = this.p;
        if(blockRunner0 != null) {
            blockRunner0.maybeRun();
        }
    }

    @Override  // androidx.lifecycle.MediatorLiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner blockRunner0 = this.p;
        if(blockRunner0 != null) {
            blockRunner0.cancel();
        }
    }
}

