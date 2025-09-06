package kotlinx.coroutines.sync;

import androidx.compose.material3.e0;
import dg.b;
import dg.c;
import dg.d;
import dg.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002$%B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\f\u001A\u00020\u000B2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000E\u001A\u00020\u00032\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000E\u0010\nJ\u0019\u0010\u000F\u001A\u00020\u000B2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J%\u0010\u0013\u001A\u00020\u000B2\n\u0010\u0012\u001A\u0006\u0012\u0002\b\u00030\u00112\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001A\u0004\u0018\u00010\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR(\u0010 \u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00020\u001B8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001E\u0010\u001F\u001A\u0004\b\u001C\u0010\u001DR\u0014\u0010!\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u0013\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Mutex;", "", "locked", "<init>", "(Z)V", "", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "onLockRegFunction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "result", "onLockProcessResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock$annotations", "()V", "onLock", "isLocked", "()Z", "Lkotlinx/atomicfu/AtomicRef;", "dg/b", "dg/c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n332#2,12:311\n1#3:323\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n175#1:311,12\n*E\n"})
public class MutexImpl extends SemaphoreImpl implements Mutex {
    public final e0 h;
    public static final AtomicReferenceFieldUpdater i;
    @Volatile
    @Nullable
    private volatile Object owner;

    static {
        MutexImpl.i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner");
    }

    public MutexImpl(boolean z) {
        super(1, ((int)z));
        this.owner = z ? null : MutexKt.access$getNO_OWNER$p();
        this.h = new e0(this, 4);
    }

    public static final AtomicReferenceFieldUpdater access$getOwner$FU$p() {
        return MutexImpl.i;
    }

    public static final Object access$lockSuspend(MutexImpl mutexImpl0, Object object0, Continuation continuation0) {
        return mutexImpl0.c(object0, continuation0);
    }

    public final Object c(Object object0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0));
        try {
            this.acquire(new b(this, cancellableContinuationImpl0, object0));
        }
        catch(Throwable throwable0) {
            cancellableContinuationImpl0.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw throwable0;
        }
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.sync.Mutex
    @NotNull
    public SelectClause2 getOnLock() {
        Intrinsics.checkNotNull(d.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function30 = (Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(d.a, 3);
        Intrinsics.checkNotNull(e.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, function30, ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(e.a, 3)), this.h);
    }

    public static void getOnLock$annotations() {
    }

    @Override  // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(@NotNull Object object0) {
        Object object1;
        do {
            if(!this.isLocked()) {
                return false;
            }
            object1 = MutexImpl.i.get(this);
        }
        while(object1 == MutexKt.access$getNO_OWNER$p());
        return object1 == object0;
    }

    @Override  // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return this.getAvailablePermits() == 0;
    }

    @Override  // kotlinx.coroutines.sync.Mutex
    @Nullable
    public Object lock(@Nullable Object object0, @NotNull Continuation continuation0) {
        if(this.tryLock(object0)) {
            return Unit.INSTANCE;
        }
        Unit unit0 = this.c(object0, continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public Object onLockProcessResult(@Nullable Object object0, @Nullable Object object1) {
        if(Intrinsics.areEqual(object1, MutexKt.access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p())) {
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + object0).toString());
        }
        return this;
    }

    public void onLockRegFunction(@NotNull SelectInstance selectInstance0, @Nullable Object object0) {
        if(object0 != null && this.holdsLock(object0)) {
            selectInstance0.selectInRegistrationPhase(MutexKt.access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p());
            return;
        }
        Intrinsics.checkNotNull(selectInstance0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        this.onAcquireRegFunction(new c(this, ((SelectInstanceInternal)selectInstance0), object0), object0);
    }

    @Override
    @NotNull
    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + this.isLocked() + ",owner=" + MutexImpl.i.get(this) + ']';
    }

    // This method was un-flattened
    @Override  // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(@Nullable Object object0) {
    alab1:
        while(true) {
            boolean z = this.tryAcquire();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = MutexImpl.i;
            if(z) {
                atomicReferenceFieldUpdater0.set(this, object0);
                return true;
            }
            if(object0 == null) {
                break;
            }
            while(this.isLocked()) {
                Object object1 = atomicReferenceFieldUpdater0.get(this);
                if(object1 == MutexKt.a) {
                    continue;
                }
                if(object1 == object0) {
                    throw new IllegalStateException(("This mutex is already locked by the specified owner: " + object0).toString());
                }
                break alab1;
            }
        }
        return false;
    }

    @Override  // kotlinx.coroutines.sync.Mutex
    public void unlock(@Nullable Object object0) {
        while(this.isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = MutexImpl.i;
            Object object1 = atomicReferenceFieldUpdater0.get(this);
            if(object1 != MutexKt.access$getNO_OWNER$p()) {
                if(object1 != object0 && object0 != null) {
                    throw new IllegalStateException(("This mutex is locked by " + object1 + ", but " + object0 + " is expected").toString());
                }
                Symbol symbol0 = MutexKt.access$getNO_OWNER$p();
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object1, symbol0)) {
                        this.release();
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object1);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}

