package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.b9;
import p0.c9;
import qd.a;

@Stable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001A\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000BR/\u0010\u0014\u001A\u0004\u0018\u00010\f2\b\u0010\r\u001A\u0004\u0018\u00010\f8F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "Landroidx/compose/material/SnackbarDuration;", "duration", "Landroidx/compose/material/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/SnackbarData;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData", "p0/b9", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,381:1\n81#2:382\n107#2,2:383\n120#3,8:385\n129#3:404\n314#4,11:393\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n75#1:382\n75#1:383,2\n105#1:385,8\n105#1:404\n107#1:393,11\n*E\n"})
public final class SnackbarHostState {
    public static final int $stable;
    public final Mutex a;
    public final MutableState b;

    public SnackbarHostState() {
        this.a = MutexKt.Mutex$default(false, 1, null);
        this.b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final void access$setCurrentSnackbarData(SnackbarHostState snackbarHostState0, SnackbarData snackbarData0) {
        snackbarHostState0.b.setValue(snackbarData0);
    }

    @Nullable
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData)this.b.getValue();
    }

    @Nullable
    public final Object showSnackbar(@NotNull String s, @Nullable String s1, @NotNull SnackbarDuration snackbarDuration0, @NotNull Continuation continuation0) {
        Mutex mutex2;
        Object object2;
        SnackbarHostState snackbarHostState0;
        String s2;
        SnackbarDuration snackbarDuration1;
        Mutex mutex0;
        c9 c90;
        if(continuation0 instanceof c9) {
            c90 = (c9)continuation0;
            int v = c90.v;
            if((v & 0x80000000) == 0) {
                c90 = new c9(this, continuation0);
            }
            else {
                c90.v = v ^ 0x80000000;
            }
        }
        else {
            c90 = new c9(this, continuation0);
        }
        Object object0 = c90.t;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c90.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                c90.o = this;
                c90.p = s;
                c90.q = s1;
                c90.r = snackbarDuration0;
                mutex0 = this.a;
                c90.s = mutex0;
                c90.v = 1;
                if(mutex0.lock(null, c90) == object1) {
                    return object1;
                }
                snackbarDuration1 = snackbarDuration0;
                s2 = s1;
                snackbarHostState0 = this;
                goto label_38;
            }
            case 1: {
                Mutex mutex1 = c90.s;
                SnackbarDuration snackbarDuration2 = c90.r;
                String s3 = c90.q;
                String s4 = c90.p;
                SnackbarHostState snackbarHostState1 = c90.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                s = s4;
                snackbarDuration1 = snackbarDuration2;
                s2 = s3;
                snackbarHostState0 = snackbarHostState1;
                try {
                label_38:
                    c90.o = snackbarHostState0;
                    c90.p = s;
                    c90.q = s2;
                    c90.r = snackbarDuration1;
                    c90.s = mutex0;
                    c90.v = 2;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c90), 1);
                    cancellableContinuationImpl0.initCancellability();
                    SnackbarHostState.access$setCurrentSnackbarData(snackbarHostState0, new b9(s, s2, snackbarDuration1, cancellableContinuationImpl0));
                    object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c90);
                    }
                }
                catch(Throwable throwable0) {
                    mutex2 = mutex0;
                    goto label_64;
                }
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                mutex2 = mutex0;
                goto label_66;
            }
            case 2: {
                try {
                    mutex2 = c90.s;
                    snackbarHostState0 = c90.o;
                    ResultKt.throwOnFailure(object0);
                    goto label_66;
                }
                catch(Throwable throwable0) {
                }
                try {
                label_64:
                    snackbarHostState0.b.setValue(null);
                    throw throwable0;
                label_66:
                    snackbarHostState0.b.setValue(null);
                    goto label_71;
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
    label_71:
        mutex2.unlock(null);
        return object0;
    }

    public static Object showSnackbar$default(SnackbarHostState snackbarHostState0, String s, String s1, SnackbarDuration snackbarDuration0, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            snackbarDuration0 = SnackbarDuration.Short;
        }
        return snackbarHostState0.showSnackbar(s, s1, snackbarDuration0, continuation0);
    }
}

