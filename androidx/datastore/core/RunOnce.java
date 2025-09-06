package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.j0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001A\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001A\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitComplete", "runIfNeeded", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,546:1\n120#2,10:547\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n503#1:547,10\n*E\n"})
public abstract class RunOnce {
    public final Mutex a;
    public final CompletableDeferred b;

    public RunOnce() {
        this.a = MutexKt.Mutex$default(false, 1, null);
        this.b = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    @Nullable
    public final Object awaitComplete(@NotNull Continuation continuation0) {
        Object object0 = this.b.await(continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public abstract Object doRun(@NotNull Continuation arg1);

    @Nullable
    public final Object runIfNeeded(@NotNull Continuation continuation0) {
        RunOnce runOnce1;
        Throwable throwable1;
        Mutex mutex2;
        RunOnce runOnce0;
        Mutex mutex0;
        j0 j00;
        if(continuation0 instanceof j0) {
            j00 = (j0)continuation0;
            int v = j00.s;
            if((v & 0x80000000) == 0) {
                j00 = new j0(this, continuation0);
            }
            else {
                j00.s = v ^ 0x80000000;
            }
        }
        else {
            j00 = new j0(this, continuation0);
        }
        Object object0 = j00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.b.isCompleted()) {
                    return Unit.INSTANCE;
                }
                j00.o = this;
                mutex0 = this.a;
                j00.p = mutex0;
                j00.s = 1;
                if(mutex0.lock(null, j00) == object1) {
                    return object1;
                }
                runOnce0 = this;
                goto label_28;
            }
            case 1: {
                Mutex mutex1 = j00.p;
                runOnce0 = j00.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                try {
                label_28:
                    if(!runOnce0.b.isCompleted()) {
                        j00.o = runOnce0;
                        j00.p = mutex0;
                        j00.s = 2;
                        if(runOnce0.doRun(j00) == object1) {
                            return object1;
                        }
                        mutex2 = mutex0;
                        runOnce1 = runOnce0;
                        goto label_47;
                    }
                }
                catch(Throwable throwable0) {
                    mutex2 = mutex0;
                    throwable1 = throwable0;
                    break;
                }
                mutex0.unlock(null);
                return Unit.INSTANCE;
            }
            case 2: {
                try {
                    mutex2 = j00.p;
                    runOnce1 = j00.o;
                    ResultKt.throwOnFailure(object0);
                label_47:
                    runOnce1.b.complete(Unit.INSTANCE);
                    goto label_52;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex2.unlock(null);
        throw throwable1;
    label_52:
        mutex2.unlock(null);
        return Unit.INSTANCE;
    }
}

