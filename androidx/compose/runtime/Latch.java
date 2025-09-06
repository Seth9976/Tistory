package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u2.b;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000B\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\u0003J\u0010\u0010\f\u001A\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000F\u001A\u00020\u000E8F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "<init>", "()V", "R", "Lkotlin/Function0;", "block", "withClosed", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "closeLatch", "openLatch", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isOpen", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n89#2:92\n89#2:93\n89#2:94\n89#2:104\n314#3,9:95\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:92\n51#1:93\n57#1:94\n79#1:104\n78#1:95,9\n78#1:105,2\n*E\n"})
public final class Latch {
    public static final int $stable = 8;
    public final Object a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;

    public Latch() {
        this.a = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = true;
    }

    @Nullable
    public final Object await(@NotNull Continuation continuation0) {
        if(this.isOpen()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        synchronized(this.a) {
            this.b.add(cancellableContinuationImpl0);
        }
        cancellableContinuationImpl0.invokeOnCancellation(new b(9, this, cancellableContinuationImpl0));
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public final void closeLatch() {
        synchronized(this.a) {
            this.d = false;
        }
    }

    public final boolean isOpen() {
        synchronized(this.a) {
        }
        return this.d;
    }

    public final void openLatch() {
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            if(!this.isOpen()) {
                ArrayList arrayList0 = this.b;
                this.b = this.c;
                this.c = arrayList0;
                this.d = true;
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((Continuation)arrayList0.get(v1)).resumeWith(Unit.INSTANCE);
                }
                arrayList0.clear();
                goto label_18;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    label_18:
        __monitor_exit(object0);
        return;
    label_20:
        __monitor_exit(object0);
    }

    public final Object withClosed(@NotNull Function0 function00) {
        this.closeLatch();
        try {
            return function00.invoke();
        }
        finally {
            this.openLatch();
        }
    }
}

