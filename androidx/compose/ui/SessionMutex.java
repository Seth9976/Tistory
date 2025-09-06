package androidx.compose.ui;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import k1.e;
import k1.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@InternalComposeUiApi
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J]\u0010\u0011\u001A\u00028\u0001\"\u0004\b\u0001\u0010\u00052\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000621\u0010\u000E\u001A-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0086@¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0015\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001E\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0013\u0010!\u001A\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001A\u0004\b\u001F\u0010 \u0088\u0001#\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0$j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"`%¨\u0006&"}, d2 = {"Landroidx/compose/ui/SessionMutex;", "T", "", "constructor-impl", "()Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "Lkotlinx/coroutines/CoroutineScope;", "sessionInitializer", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Lkotlin/coroutines/Continuation;", "session", "withSessionCancellingPrevious-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withSessionCancellingPrevious", "", "toString-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)I", "hashCode", "other", "", "equals-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)Z", "equals", "getCurrentSession-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "k1/e", "currentSessionHolder", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/AtomicReference;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class SessionMutex {
    public final AtomicReference a;

    public SessionMutex(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    public static final SessionMutex box-impl(AtomicReference atomicReference0) {
        return new SessionMutex(atomicReference0);
    }

    @NotNull
    public static AtomicReference constructor-impl() {
        return new AtomicReference(null);
    }

    @Override
    public boolean equals(Object object0) {
        return SessionMutex.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(AtomicReference atomicReference0, Object object0) {
        return object0 instanceof SessionMutex ? Intrinsics.areEqual(atomicReference0, ((SessionMutex)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(AtomicReference atomicReference0, AtomicReference atomicReference1) {
        return Intrinsics.areEqual(atomicReference0, atomicReference1);
    }

    @Nullable
    public static final Object getCurrentSession-impl(AtomicReference atomicReference0) {
        e e0 = (e)atomicReference0.get();
        return e0 == null ? null : e0.b;
    }

    @Override
    public int hashCode() {
        return SessionMutex.hashCode-impl(this.a);
    }

    public static int hashCode-impl(AtomicReference atomicReference0) {
        return atomicReference0.hashCode();
    }

    @Override
    public String toString() {
        return "SessionMutex(currentSessionHolder=" + this.a + ')';
    }

    public static String toString-impl(AtomicReference atomicReference0) [...] // Inlined contents

    public final AtomicReference unbox-impl() {
        return this.a;
    }

    @Nullable
    public static final Object withSessionCancellingPrevious-impl(AtomicReference atomicReference0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new f(atomicReference0, function10, function20, null), continuation0);
    }
}

