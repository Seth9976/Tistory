package androidx.compose.runtime.external.kotlinx.collections.immutable;

import b1.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "fromIndex", "toIndex", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "b1/a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ImmutableList extends ImmutableCollection, List, KMappedMarker {
    @NotNull
    default ImmutableList subList(int v, int v1) {
        return new a(this, v, v1);
    }

    @Override
    default List subList(int v, int v1) {
        return this.subList(v, v1);
    }
}

