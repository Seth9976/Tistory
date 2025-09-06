package androidx.compose.material3;

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
import qd.a;

@Stable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001A\u001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000EH\u0086@¢\u0006\u0004\b\f\u0010\u0010R/\u0010\u0019\u001A\u0004\u0018\u00010\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u00118F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001C"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "duration", "Landroidx/compose/material3/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarData;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData", "androidx/compose/material3/zl", "androidx/compose/material3/am", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,440:1\n81#2:441\n107#2,2:442\n120#3,8:444\n129#3:463\n314#4,11:452\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n71#1:441\n71#1:442,2\n126#1:444,8\n126#1:463\n128#1:452,11\n*E\n"})
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
    public final Object showSnackbar(@NotNull SnackbarVisuals snackbarVisuals0, @NotNull Continuation continuation0) {
        Mutex mutex2;
        Throwable throwable1;
        SnackbarHostState snackbarHostState1;
        Object object2;
        SnackbarHostState snackbarHostState0;
        Mutex mutex0;
        bm bm0;
        if(continuation0 instanceof bm) {
            bm0 = (bm)continuation0;
            int v = bm0.t;
            if((v & 0x80000000) == 0) {
                bm0 = new bm(this, continuation0);
            }
            else {
                bm0.t = v ^ 0x80000000;
            }
        }
        else {
            bm0 = new bm(this, continuation0);
        }
        Object object0 = bm0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(bm0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                bm0.o = this;
                bm0.p = snackbarVisuals0;
                mutex0 = this.a;
                bm0.q = mutex0;
                bm0.t = 1;
                if(mutex0.lock(null, bm0) == object1) {
                    return object1;
                }
                snackbarHostState0 = this;
                goto label_29;
            }
            case 1: {
                Mutex mutex1 = bm0.q;
                SnackbarVisuals snackbarVisuals1 = bm0.p;
                snackbarHostState0 = bm0.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                snackbarVisuals0 = snackbarVisuals1;
                try {
                label_29:
                    bm0.o = snackbarHostState0;
                    bm0.p = snackbarVisuals0;
                    bm0.q = mutex0;
                    bm0.t = 2;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bm0), 1);
                    cancellableContinuationImpl0.initCancellability();
                    SnackbarHostState.access$setCurrentSnackbarData(snackbarHostState0, new zl(snackbarVisuals0, cancellableContinuationImpl0));
                    object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(bm0);
                    }
                }
                catch(Throwable throwable0) {
                    snackbarHostState1 = snackbarHostState0;
                    throwable1 = throwable0;
                    mutex2 = mutex0;
                    goto label_56;
                }
                if(object2 == object1) {
                    return object1;
                }
                snackbarHostState1 = snackbarHostState0;
                object0 = object2;
                mutex2 = mutex0;
                goto label_58;
            }
            case 2: {
                try {
                    mutex2 = bm0.q;
                    snackbarHostState1 = bm0.o;
                    ResultKt.throwOnFailure(object0);
                    goto label_58;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_56:
                    snackbarHostState1.b.setValue(null);
                    throw throwable1;
                label_58:
                    snackbarHostState1.b.setValue(null);
                    goto label_63;
                }
                catch(Throwable throwable2) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex2.unlock(null);
        throw throwable2;
    label_63:
        mutex2.unlock(null);
        return object0;
    }

    @Nullable
    public final Object showSnackbar(@NotNull String s, @Nullable String s1, boolean z, @NotNull SnackbarDuration snackbarDuration0, @NotNull Continuation continuation0) {
        return this.showSnackbar(new am(s, s1, z, snackbarDuration0), continuation0);
    }

    public static Object showSnackbar$default(SnackbarHostState snackbarHostState0, String s, String s1, boolean z, SnackbarDuration snackbarDuration0, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            return s1 == null ? snackbarHostState0.showSnackbar(s, null, z, SnackbarDuration.Short, continuation0) : snackbarHostState0.showSnackbar(s, s1, z, SnackbarDuration.Indefinite, continuation0);
        }
        return snackbarHostState0.showSnackbar(s, s1, z, snackbarDuration0, continuation0);
    }
}

