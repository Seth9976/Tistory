package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00028\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u000F\u0010\u0017\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u0018\u001A\u00020\u00078\u0000@BX\u0080\u000E¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u0016¨\u0006\u001D"}, d2 = {"Landroidx/paging/InvalidateCallbackTracker;", "T", "", "Lkotlin/Function1;", "", "callbackInvoker", "Lkotlin/Function0;", "", "invalidGetter", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "callbackCount$paging_common_release", "()I", "callbackCount", "callback", "registerInvalidatedCallback$paging_common_release", "(Ljava/lang/Object;)V", "registerInvalidatedCallback", "unregisterInvalidatedCallback$paging_common_release", "unregisterInvalidatedCallback", "invalidate$paging_common_release", "()Z", "invalidate", "<set-?>", "e", "Z", "getInvalid$paging_common_release", "invalid", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInvalidateCallbackTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n+ 2 Atomics.kt\nandroidx/paging/internal/AtomicsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n54#2,6:91\n54#2,6:97\n54#2,6:103\n1855#3,2:109\n*S KotlinDebug\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n*L\n54#1:91,6\n69#1:97,6\n77#1:103,6\n86#1:109,2\n*E\n"})
public final class InvalidateCallbackTracker {
    public final Function1 a;
    public final Function0 b;
    public final ReentrantLock c;
    public final ArrayList d;
    public boolean e;

    public InvalidateCallbackTracker(@NotNull Function1 function10, @Nullable Function0 function00) {
        Intrinsics.checkNotNullParameter(function10, "callbackInvoker");
        super();
        this.a = function10;
        this.b = function00;
        this.c = new ReentrantLock();
        this.d = new ArrayList();
    }

    public InvalidateCallbackTracker(Function1 function10, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        this(function10, function00);
    }

    @VisibleForTesting
    public final int callbackCount$paging_common_release() {
        return this.d.size();
    }

    public final boolean getInvalid$paging_common_release() {
        return this.e;
    }

    public final boolean invalidate$paging_common_release() {
        ReentrantLock reentrantLock0;
        if(this.e) {
            return false;
        }
        try {
            reentrantLock0 = this.c;
            reentrantLock0.lock();
            if(this.e) {
                return false;
            }
            this.e = true;
            List list0 = CollectionsKt___CollectionsKt.toList(this.d);
            this.d.clear();
        }
        finally {
            reentrantLock0.unlock();
        }
        for(Object object0: list0) {
            this.a.invoke(object0);
        }
        return true;
    }

    public final void registerInvalidatedCallback$paging_common_release(Object object0) {
        ReentrantLock reentrantLock0;
        boolean z = true;
        if(this.b != null && ((Boolean)this.b.invoke()).booleanValue()) {
            this.invalidate$paging_common_release();
        }
        Function1 function10 = this.a;
        if(this.e) {
            function10.invoke(object0);
            return;
        }
        try {
            reentrantLock0 = this.c;
            reentrantLock0.lock();
            if(!this.e) {
                this.d.add(object0);
                z = false;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        if(z) {
            function10.invoke(object0);
        }
    }

    public final void unregisterInvalidatedCallback$paging_common_release(Object object0) {
        try {
            this.c.lock();
            this.d.remove(object0);
        }
        finally {
            this.c.unlock();
        }
    }
}

