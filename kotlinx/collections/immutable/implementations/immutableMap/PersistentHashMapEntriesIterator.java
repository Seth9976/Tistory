package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntriesIterator;", "K", "V", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "", "node", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentHashMapEntriesIterator extends PersistentHashMapBaseIterator {
    public PersistentHashMapEntriesIterator(@NotNull TrieNode trieNode0) {
        Intrinsics.checkNotNullParameter(trieNode0, "node");
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = new TrieNodeBaseIterator[8];
        for(int v = 0; v < 8; ++v) {
            arr_trieNodeBaseIterator[v] = new TrieNodeEntriesIterator();
        }
        super(trieNode0, arr_trieNodeBaseIterator);
    }
}

