package kotlinx.collections.immutable;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import nf.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "E", "", "Lkotlinx/collections/immutable/ImmutableCollection;", "", "fromIndex", "toIndex", "subList", "(II)Lkotlinx/collections/immutable/ImmutableList;", "nf/a", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ImmutableList extends List, KMappedMarker, ImmutableCollection {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @NotNull
        public static ImmutableList subList(@NotNull ImmutableList immutableList0, int v, int v1) {
            return new a(immutableList0, v, v1);
        }
    }

    @NotNull
    ImmutableList subList(int arg1, int arg2);
}

