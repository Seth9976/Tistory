package kotlinx.collections.immutable;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0013J\u001B\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001C\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\tH&J\u000E\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH&J\u000E\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u001B\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\"\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0010H&J\u001C\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\tH&J\u001C\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\tH&¨\u0006\u0014"}, d2 = {"Lkotlinx/collections/immutable/PersistentSet;", "E", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlinx/collections/immutable/PersistentCollection;", "add", "element", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "clear", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "", "retainAll", "Builder", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PersistentSet extends ImmutableSet, PersistentCollection {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u000E\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lkotlinx/collections/immutable/PersistentSet$Builder;", "E", "", "Lkotlinx/collections/immutable/PersistentCollection$Builder;", "build", "Lkotlinx/collections/immutable/PersistentSet;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Builder extends Set, KMutableSet, kotlinx.collections.immutable.PersistentCollection.Builder {
        @NotNull
        PersistentSet build();
    }

    @NotNull
    PersistentSet add(Object arg1);

    @NotNull
    PersistentSet addAll(@NotNull Collection arg1);

    @NotNull
    Builder builder();

    @NotNull
    PersistentSet clear();

    @NotNull
    PersistentSet remove(Object arg1);

    @NotNull
    PersistentSet removeAll(@NotNull Collection arg1);

    @NotNull
    PersistentSet removeAll(@NotNull Function1 arg1);

    @NotNull
    PersistentSet retainAll(@NotNull Collection arg1);
}

