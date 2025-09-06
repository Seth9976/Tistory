package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u001C\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001H&J\u0010\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "areCompatible", "", "slotId", "reusableSlotId", "getSlotsToRetain", "", "slotIds", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "SlotIdsSet", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SubcomposeSlotReusePolicy {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001B\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001A\u00020\b2\u000E\u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u0012\u001A\u00020\b2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\nJ\u0018\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001A\u00020\b2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u001D\u0010\u0018\u001A\u00020\b2\u000E\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0018\u0010\rJ#\u0010\u0018\u001A\u00020\b2\u0014\u0010\u001A\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0004\b\u0018\u0010\u001BJ\u001D\u0010\u001C\u001A\u00020\b2\u000E\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u001C\u0010\rJ#\u0010\u001C\u001A\u00020\b2\u0014\u0010\u001A\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0004\b\u001C\u0010\u001BJ\r\u0010\u001E\u001A\u00020\u001D¢\u0006\u0004\b\u001E\u0010\u001FR\u0014\u0010#\u001A\u00020 8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "", "set", "<init>", "(Ljava/util/Set;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "slotId", "add$ui_release", "add", "", "iterator", "()Ljava/util/Iterator;", "remove", "slotIds", "removeAll", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Z", "retainAll", "", "clear", "()V", "", "getSize", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class SlotIdsSet implements Collection, KMappedMarker {
        public static final int $stable = 8;
        public final Set a;

        public SlotIdsSet() {
            this(null, 1, null);
        }

        public SlotIdsSet(@NotNull Set set0) {
            this.a = set0;
        }

        public SlotIdsSet(Set set0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                set0 = new LinkedHashSet();
            }
            this(set0);
        }

        @Override
        public boolean add(Object object0) {
            return this.add$ui_release(object0);
        }

        public final boolean add$ui_release(@Nullable Object object0) {
            return this.a.add(object0);
        }

        @Override
        public boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final void clear() {
            this.a.clear();
        }

        @Override
        public boolean contains(@Nullable Object object0) {
            return this.a.contains(object0);
        }

        @Override
        public boolean containsAll(@NotNull Collection collection0) {
            return this.a.containsAll(collection0);
        }

        public int getSize() {
            return this.a.size();
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        @NotNull
        public Iterator iterator() {
            return this.a.iterator();
        }

        @Override
        public final boolean remove(@Nullable Object object0) {
            return this.a.remove(object0);
        }

        @Override
        public final boolean removeAll(@NotNull Collection collection0) {
            return this.a.remove(collection0);
        }

        public final boolean removeAll(@NotNull Function1 function10) {
            return o.removeAll(this.a, function10);
        }

        @Override
        public boolean removeIf(Predicate predicate0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final boolean retainAll(@NotNull Collection collection0) {
            return this.a.retainAll(collection0);
        }

        public final boolean retainAll(@NotNull Function1 function10) {
            return o.retainAll(this.a, function10);
        }

        @Override
        public final int size() {
            return this.getSize();
        }

        @Override
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return CollectionToArray.toArray(this, arr_object);
        }
    }

    boolean areCompatible(@Nullable Object arg1, @Nullable Object arg2);

    void getSlotsToRetain(@NotNull SlotIdsSet arg1);
}

