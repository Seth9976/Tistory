package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 4)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeValuesIterator;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "()V", "next", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TrieNodeValuesIterator extends TrieNodeBaseIterator {
    public static final int $stable;

    @Override
    public Object next() {
        this.setIndex(this.getIndex() + 2);
        return this.getBuffer()[this.getIndex() - 1];
    }
}

