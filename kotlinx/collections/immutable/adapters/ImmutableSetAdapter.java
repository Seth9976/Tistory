package kotlinx.collections.immutable.adapters;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/collections/immutable/adapters/ImmutableSetAdapter;", "E", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", "impl", "", "(Ljava/util/Set;)V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImmutableSetAdapter extends ImmutableCollectionAdapter implements ImmutableSet {
    public ImmutableSetAdapter(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "impl");
        super(set0);
    }
}

