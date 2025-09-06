package kotlinx.collections.immutable.implementations.immutableList;

import androidx.fragment.app.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentList.Builder;
import kotlinx.collections.immutable.PersistentList.DefaultImpls;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001A\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001C\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000E\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0016\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000FJ\u0016\u0010\u0010\u001A\u00020\r2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000F\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0002J\u000E\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u001B\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000E\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001C\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001C\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001E\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001A2\u0006\u0010\u001B\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u0007H\u0016¨\u0006\u001D"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "E", "Lkotlinx/collections/immutable/PersistentList;", "Lkotlin/collections/AbstractList;", "()V", "addAll", "index", "", "c", "", "elements", "clear", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "", "listIterator", "", "remove", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;", "removeAll", "retainAll", "subList", "Lkotlinx/collections/immutable/ImmutableList;", "fromIndex", "toIndex", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
public abstract class AbstractPersistentList extends AbstractList implements PersistentList {
    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList addAll(int v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "c");
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(v, collection0);
        return persistentList$Builder0.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(collection0);
        return persistentList$Builder0.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList clear() {
        return UtilsKt.persistentVectorOf();
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override  // kotlin.collections.AbstractList
    @NotNull
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override  // kotlin.collections.AbstractList
    @NotNull
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList remove(Object object0) {
        int v = this.indexOf(object0);
        return v != -1 ? this.removeAt(v) : this;
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Collection collection0) {
        return this.removeAll(collection0);
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.removeAll(new l(collection0, 6));
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection retainAll(Collection collection0) {
        return this.retainAll(collection0);
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.removeAll(new l(collection0, 7));
    }

    @Override  // kotlin.collections.AbstractList
    public List subList(int v, int v1) {
        return this.subList(v, v1);
    }

    @Override  // kotlinx.collections.immutable.ImmutableList
    @NotNull
    public ImmutableList subList(int v, int v1) {
        return DefaultImpls.subList(this, v, v1);
    }
}

