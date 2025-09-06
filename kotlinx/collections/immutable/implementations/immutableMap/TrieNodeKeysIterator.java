package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNodeKeysIterator;", "K", "V", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "()V", "next", "()Ljava/lang/Object;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TrieNodeKeysIterator extends TrieNodeBaseIterator {
    @Override
    public Object next() {
        this.setIndex(this.getIndex() + 2);
        return this.getBuffer()[this.getIndex() - 2];
    }
}

