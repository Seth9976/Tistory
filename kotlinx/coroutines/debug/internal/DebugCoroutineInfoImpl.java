package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import wf.f;
import wf.g;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0001\u0018\u00002\u00020\u0001B%\b\u0000\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u000B\u001A\u00020\n2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001FR\u0016\u0010 \u001A\u00020\n8\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b#\u0010$R\u001E\u0010\'\u001A\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\'\u0010(R\u0013\u0010\u0003\u001A\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001A\u0004\b)\u0010*R\u0017\u0010,\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001A\u0004\b+\u0010\u0017R\u0014\u0010\u000B\u001A\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b-\u0010\u001AR(\u00103\u001A\u0004\u0018\u00010&2\b\u0010.\u001A\u0004\u0018\u00010&8@@@X\u0080\u000E¢\u0006\f\u001A\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "creationStackBottom", "", "sequenceNumber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "", "state", "Lkotlin/coroutines/Continuation;", "frame", "", "shouldBeMatched", "", "updateState$kotlinx_coroutines_core", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;Z)V", "updateState", "", "Ljava/lang/StackTraceElement;", "lastObservedStackTrace$kotlinx_coroutines_core", "()Ljava/util/List;", "lastObservedStackTrace", "toString", "()Ljava/lang/String;", "a", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "J", "_state", "Ljava/lang/String;", "Ljava/lang/Thread;", "lastObservedThread", "Ljava/lang/Thread;", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_lastObservedFrame", "Ljava/lang/ref/WeakReference;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackTrace", "creationStackTrace", "getState$kotlinx_coroutines_core", "value", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
public final class DebugCoroutineInfoImpl {
    @JvmField
    @Nullable
    public volatile WeakReference _lastObservedFrame;
    @JvmField
    @NotNull
    public volatile String _state;
    public final StackTraceFrame a;
    public final WeakReference b;
    public int c;
    @JvmField
    @Nullable
    public volatile Thread lastObservedThread;
    @JvmField
    public final long sequenceNumber;

    public DebugCoroutineInfoImpl(@Nullable CoroutineContext coroutineContext0, @Nullable StackTraceFrame stackTraceFrame0, long v) {
        this.a = stackTraceFrame0;
        this.sequenceNumber = v;
        this.b = new WeakReference(coroutineContext0);
        this._state = "CREATED";
    }

    public static final Object access$yieldFrames(DebugCoroutineInfoImpl debugCoroutineInfoImpl0, SequenceScope sequenceScope0, CoroutineStackFrame coroutineStackFrame0, Continuation continuation0) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl1;
        CoroutineStackFrame coroutineStackFrame1;
        g g0;
        debugCoroutineInfoImpl0.getClass();
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.t;
            if((v & 0x80000000) == 0) {
                g0 = new g(continuation0, debugCoroutineInfoImpl0);
            }
            else {
                g0.t = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(continuation0, debugCoroutineInfoImpl0);
        }
        Object object0 = g0.r;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(g0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_25;
            }
            case 1: {
                coroutineStackFrame1 = g0.q;
                sequenceScope0 = g0.p;
                debugCoroutineInfoImpl1 = g0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            coroutineStackFrame0 = coroutineStackFrame1;
            debugCoroutineInfoImpl0 = debugCoroutineInfoImpl1;
            do {
                coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
                if(coroutineStackFrame0 == null) {
                    return Unit.INSTANCE;
                }
            label_25:
                if(coroutineStackFrame0 == null) {
                    return Unit.INSTANCE;
                }
                StackTraceElement stackTraceElement0 = coroutineStackFrame0.getStackTraceElement();
            }
            while(stackTraceElement0 == null);
            g0.o = debugCoroutineInfoImpl0;
            g0.p = sequenceScope0;
            g0.q = coroutineStackFrame0;
            g0.t = 1;
            if(sequenceScope0.yield(stackTraceElement0, g0) == unit0) {
                break;
            }
            debugCoroutineInfoImpl1 = debugCoroutineInfoImpl0;
            coroutineStackFrame1 = coroutineStackFrame0;
        }
        return unit0;
    }

    @Nullable
    public final CoroutineContext getContext() {
        return (CoroutineContext)this.b.get();
    }

    @Nullable
    public final StackTraceFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.a;
    }

    @NotNull
    public final List getCreationStackTrace() {
        return this.a == null ? CollectionsKt__CollectionsKt.emptyList() : SequencesKt___SequencesKt.toList(SequencesKt__SequenceBuilderKt.sequence(new f(this, this.a, null)));
    }

    @Nullable
    public final CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
        return this._lastObservedFrame == null ? null : ((CoroutineStackFrame)this._lastObservedFrame.get());
    }

    @NotNull
    public final String getState$kotlinx_coroutines_core() {
        return this._state;
    }

    @NotNull
    public final List lastObservedStackTrace$kotlinx_coroutines_core() {
        CoroutineStackFrame coroutineStackFrame0 = this.getLastObservedFrame$kotlinx_coroutines_core();
        if(coroutineStackFrame0 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList();
        while(coroutineStackFrame0 != null) {
            StackTraceElement stackTraceElement0 = coroutineStackFrame0.getStackTraceElement();
            if(stackTraceElement0 != null) {
                ((ArrayList)list0).add(stackTraceElement0);
            }
            coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
        }
        return list0;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(@Nullable CoroutineStackFrame coroutineStackFrame0) {
        this._lastObservedFrame = coroutineStackFrame0 == null ? null : new WeakReference(coroutineStackFrame0);
    }

    @Override
    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + this.getState$kotlinx_coroutines_core() + ",context=" + this.getContext() + ')';
    }

    public final void updateState$kotlinx_coroutines_core(@NotNull String s, @NotNull Continuation continuation0, boolean z) {
        synchronized(this) {
            if(Intrinsics.areEqual(this._state, "RUNNING") && Intrinsics.areEqual(s, "RUNNING") && z) {
                ++this.c;
            }
            else if(this.c > 0 && Intrinsics.areEqual(s, "SUSPENDED")) {
                --this.c;
                return;
            }
            if(Intrinsics.areEqual(this._state, s) && Intrinsics.areEqual(s, "SUSPENDED") && this.getLastObservedFrame$kotlinx_coroutines_core() != null) {
                return;
            }
            this._state = s;
            Thread thread0 = null;
            this.setLastObservedFrame$kotlinx_coroutines_core((continuation0 instanceof CoroutineStackFrame ? ((CoroutineStackFrame)continuation0) : null));
            if(Intrinsics.areEqual(s, "RUNNING")) {
                thread0 = Thread.currentThread();
            }
            this.lastObservedThread = thread0;
        }
    }
}

