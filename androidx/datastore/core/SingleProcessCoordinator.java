package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.l0;
import w3.m0;
import w3.n0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000B\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001C\u0010\n\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000B\u0010\fJ:\u0010\u000F\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001A\u001E\b\u0001\u0012\u0004\u0012\u00020\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R \u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "tryLock", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "Lkotlinx/coroutines/flow/Flow;", "", "c", "Lkotlinx/coroutines/flow/Flow;", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSingleProcessCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,60:1\n120#2,10:61\n32#3,10:71\n*S KotlinDebug\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n*L\n40#1:61,10\n49#1:71,10\n*E\n"})
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    public final Mutex a;
    public final AtomicInt b;
    public final Flow c;

    public SingleProcessCoordinator(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "filePath");
        super();
        this.a = MutexKt.Mutex$default(false, 1, null);
        this.b = new AtomicInt(0);
        this.c = FlowKt.flow(new n0(2, null));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @NotNull
    public Flow getUpdateNotifications() {
        return this.c;
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object getVersion(@NotNull Continuation continuation0) {
        return Boxing.boxInt(this.b.get());
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object incrementAndGetVersion(@NotNull Continuation continuation0) {
        return Boxing.boxInt(this.b.incrementAndGet());
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object lock(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        Mutex mutex2;
        Throwable throwable1;
        Object object2;
        Mutex mutex0;
        l0 l00;
        if(continuation0 instanceof l0) {
            l00 = (l0)continuation0;
            int v = l00.s;
            if((v & 0x80000000) == 0) {
                l00 = new l0(this, continuation0);
            }
            else {
                l00.s = v ^ 0x80000000;
            }
        }
        else {
            l00 = new l0(this, continuation0);
        }
        Object object0 = l00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                l00.o = function10;
                mutex0 = this.a;
                l00.p = mutex0;
                l00.s = 1;
                if(mutex0.lock(null, l00) == object1) {
                    return object1;
                }
                goto label_25;
            }
            case 1: {
                Mutex mutex1 = l00.p;
                Function1 function11 = (Function1)l00.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                function10 = function11;
                try {
                label_25:
                    l00.o = mutex0;
                    l00.p = null;
                    l00.s = 2;
                    object2 = function10.invoke(l00);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    mutex2 = mutex0;
                    mutex2.unlock(null);
                    throw throwable1;
                }
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                mutex2 = mutex0;
                break;
            }
            case 2: {
                mutex2 = (Mutex)l00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                mutex2.unlock(null);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex2.unlock(null);
        return object0;
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object tryLock(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        boolean z1;
        Throwable throwable1;
        Mutex mutex1;
        Object object2;
        m0 m00;
        if(continuation0 instanceof m0) {
            m00 = (m0)continuation0;
            int v = m00.s;
            if((v & 0x80000000) == 0) {
                m00 = new m0(this, continuation0);
            }
            else {
                m00.s = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(this, continuation0);
        }
        Object object0 = m00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Mutex mutex0 = this.a;
                boolean z = mutex0.tryLock(null);
                try {
                    m00.o = mutex0;
                    m00.p = z;
                    m00.s = 1;
                    object2 = function20.invoke(Boxing.boxBoolean(z), m00);
                }
                catch(Throwable throwable0) {
                    mutex1 = mutex0;
                    throwable1 = throwable0;
                    z1 = z;
                    goto label_37;
                }
                if(object2 == object1) {
                    return object1;
                }
                mutex1 = mutex0;
                object0 = object2;
                z1 = z;
                break;
            }
            case 1: {
                try {
                    z1 = m00.p;
                    mutex1 = m00.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
            label_37:
                if(z1) {
                    mutex1.unlock(null);
                }
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(z1) {
            mutex1.unlock(null);
        }
        return object0;
    }
}

