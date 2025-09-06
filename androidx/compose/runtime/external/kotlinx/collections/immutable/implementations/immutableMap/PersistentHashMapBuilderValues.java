package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0016\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderValues;", "K", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PersistentHashMapBuilderValues extends AbstractMutableCollection implements Collection, KMutableCollection {
    public static final int $stable = 8;
    public final PersistentHashMapBuilder a;

    public PersistentHashMapBuilderValues(@NotNull PersistentHashMapBuilder persistentHashMapBuilder0) {
        this.a = persistentHashMapBuilder0;
    }

    @Override  // kotlin.collections.AbstractMutableCollection
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override  // kotlin.collections.AbstractMutableCollection
    public int getSize() {
        return this.a.size();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new PersistentHashMapBuilderValuesIterator(this.a);
    }
}

