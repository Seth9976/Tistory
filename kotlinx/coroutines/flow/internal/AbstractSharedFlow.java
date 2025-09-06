package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\f\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000B2\u0006\u0010\n\u001A\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00028\u0000H\u0004¢\u0006\u0004\b\u000E\u0010\bJ\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001A\u00020\u00102\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0013H\u0084\b¢\u0006\u0004\b\u0015\u0010\u0016R8\u0010\u001C\u001A\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000B2\u0010\u0010\u0017\u001A\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000B8\u0004@BX\u0084\u000E¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR$\u0010!\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\t8\u0004@BX\u0084\u000E¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0017\u0010%\u001A\b\u0012\u0004\u0012\u00020\t0\"8F¢\u0006\u0006\u001A\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "createSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", "size", "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "allocateSlot", "slot", "", "freeSlot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "Lkotlin/Function1;", "block", "forEachSlotLocked", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "a", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "slots", "b", "I", "getNCollectors", "()I", "nCollectors", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n28#2,4:144\n20#3:137\n20#3:142\n20#3:148\n1#4:143\n13579#5,2:149\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n30#1:133,4\n45#1:138,4\n76#1:144,4\n30#1:137\n45#1:142\n76#1:148\n95#1:149,2\n*E\n"})
public abstract class AbstractSharedFlow {
    public AbstractSharedFlowSlot[] a;
    public int b;
    public int c;
    public c0 d;

    @NotNull
    public final AbstractSharedFlowSlot allocateSlot() {
        c0 c00;
        AbstractSharedFlowSlot abstractSharedFlowSlot0;
        synchronized(this) {
            AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = this.a;
            if(arr_abstractSharedFlowSlot == null) {
                arr_abstractSharedFlowSlot = this.createSlotArray(2);
                this.a = arr_abstractSharedFlowSlot;
            }
            else if(this.b >= arr_abstractSharedFlowSlot.length) {
                Object[] arr_object = Arrays.copyOf(arr_abstractSharedFlowSlot, arr_abstractSharedFlowSlot.length * 2);
                Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
                this.a = (AbstractSharedFlowSlot[])arr_object;
                arr_abstractSharedFlowSlot = (AbstractSharedFlowSlot[])arr_object;
            }
            int v1 = this.c;
            do {
                abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v1];
                if(abstractSharedFlowSlot0 == null) {
                    abstractSharedFlowSlot0 = this.createSlot();
                    arr_abstractSharedFlowSlot[v1] = abstractSharedFlowSlot0;
                }
                ++v1;
                v1 = v1 < arr_abstractSharedFlowSlot.length ? v1 + 1 : 0;
                Intrinsics.checkNotNull(abstractSharedFlowSlot0, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            }
            while(!abstractSharedFlowSlot0.allocateLocked(this));
            this.c = v1;
            ++this.b;
            c00 = this.d;
        }
        if(c00 != null) {
            c00.n(1);
        }
        return abstractSharedFlowSlot0;
    }

    @NotNull
    public abstract AbstractSharedFlowSlot createSlot();

    @NotNull
    public abstract AbstractSharedFlowSlot[] createSlotArray(int arg1);

    public final void forEachSlotLocked(@NotNull Function1 function10) {
        if(this.b == 0) {
            return;
        }
        AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = this.a;
        if(arr_abstractSharedFlowSlot != null) {
            for(int v = 0; v < arr_abstractSharedFlowSlot.length; ++v) {
                AbstractSharedFlowSlot abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v];
                if(abstractSharedFlowSlot0 != null) {
                    function10.invoke(abstractSharedFlowSlot0);
                }
            }
        }
    }

    public final void freeSlot(@NotNull AbstractSharedFlowSlot abstractSharedFlowSlot0) {
        Continuation[] arr_continuation;
        c0 c00;
        synchronized(this) {
            int v1 = this.b - 1;
            this.b = v1;
            c00 = this.d;
            if(v1 == 0) {
                this.c = 0;
            }
            Intrinsics.checkNotNull(abstractSharedFlowSlot0, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            arr_continuation = abstractSharedFlowSlot0.freeLocked(this);
        }
        for(int v2 = 0; v2 < arr_continuation.length; ++v2) {
            Continuation continuation0 = arr_continuation[v2];
            if(continuation0 != null) {
                continuation0.resumeWith(Unit.INSTANCE);
            }
        }
        if(c00 != null) {
            c00.n(-1);
        }
    }

    public final int getNCollectors() {
        return this.b;
    }

    @Nullable
    public final AbstractSharedFlowSlot[] getSlots() {
        return this.a;
    }

    @NotNull
    public final StateFlow getSubscriptionCount() {
        synchronized(this) {
            c0 c00 = this.d;
            if(c00 == null) {
                int v1 = this.b;
                c00 = new c0(1, 0x7FFFFFFF, BufferOverflow.DROP_OLDEST);  // 初始化器: Lkotlinx/coroutines/flow/SharedFlowImpl;-><init>(IILkotlinx/coroutines/channels/BufferOverflow;)V
                c00.tryEmit(v1);
                this.d = c00;
            }
            return c00;
        }
    }
}

