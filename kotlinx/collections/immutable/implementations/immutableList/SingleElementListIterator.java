package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000B"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/SingleElementListIterator;", "E", "Lkotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "element", "", "index", "<init>", "(Ljava/lang/Object;I)V", "next", "()Ljava/lang/Object;", "previous", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SingleElementListIterator extends AbstractListIterator {
    public final Object c;

    public SingleElementListIterator(Object object0, int v) {
        super(v, 1);
        this.c = object0;
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.checkHasNext$kotlinx_collections_immutable();
        this.setIndex(this.getIndex() + 1);
        return this.c;
    }

    @Override
    public Object previous() {
        this.checkHasPrevious$kotlinx_collections_immutable();
        this.setIndex(this.getIndex() - 1);
        return this.c;
    }
}

