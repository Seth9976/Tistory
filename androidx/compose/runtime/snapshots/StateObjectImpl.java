package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001A\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\r\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/ReaderKind;", "reader", "", "recordReadIn-h_f27i8$runtime_release", "(I)V", "recordReadIn", "", "isReadIn-h_f27i8$runtime_release", "(I)Z", "isReadIn", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,55:1\n47#2:56\n45#2:57\n47#2:58\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n32#1:56\n34#1:57\n39#1:58\n*E\n"})
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable;
    public final AtomicInt a;

    public StateObjectImpl() {
        this.a = new AtomicInt(0);
    }

    public final boolean isReadIn-h_f27i8$runtime_release(int v) {
        return (v & ReaderKind.constructor-impl(this.a.get())) != 0;
    }

    public final void recordReadIn-h_f27i8$runtime_release(int v) {
        do {
            AtomicInt atomicInt0 = this.a;
            int v1 = ReaderKind.constructor-impl(atomicInt0.get());
            if((v1 & v) != 0) {
                return;
            }
        }
        while(!atomicInt0.compareAndSet(v1, v1 | v));
    }
}

