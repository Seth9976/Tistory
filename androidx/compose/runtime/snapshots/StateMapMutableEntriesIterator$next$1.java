package androidx.compose.runtime.snapshots;

import i1.g;
import java.util.ConcurrentModificationException;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap.Entry;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\'\n\u0002\b\r\b\n\u0018\u00002\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001A\u00028\u00012\u0006\u0010\u0002\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001A\u0010\t\u001A\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR\"\u0010\r\u001A\u00028\u00018\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001A\u0004\b\u000B\u0010\b\"\u0004\b\u0003\u0010\f¨\u0006\u000E"}, d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "b", "getValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n317#2,4:373\n1#3:377\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n334#1:373,4\n334#1:377\n*E\n"})
public final class StateMapMutableEntriesIterator.next.1 implements Map.Entry, Entry {
    public final Object a;
    public Object b;
    public final g c;

    public StateMapMutableEntriesIterator.next.1(g g0) {
        this.c = g0;
        Map.Entry map$Entry0 = g0.d;
        Intrinsics.checkNotNull(map$Entry0);
        this.a = map$Entry0.getKey();
        Map.Entry map$Entry1 = g0.d;
        Intrinsics.checkNotNull(map$Entry1);
        this.b = map$Entry1.getValue();
    }

    @Override
    public Object getKey() {
        return this.a;
    }

    @Override
    public Object getValue() {
        return this.b;
    }

    @Override
    public Object setValue(Object object0) {
        g g0 = this.c;
        if(g0.a.getModification$runtime_release() != g0.c) {
            throw new ConcurrentModificationException();
        }
        g0.a.put(this.getKey(), object0);
        this.setValue(object0);
        return this.getValue();
    }

    public void setValue(Object object0) {
        this.b = object0;
    }
}

