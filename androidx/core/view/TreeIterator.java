package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001A\u0010\u0005\u001A\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/core/view/TreeIterator;", "T", "", "rootIterator", "Lkotlin/Function1;", "getChildIterator", "<init>", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TreeIterator implements Iterator, KMappedMarker {
    public final Function1 a;
    public final ArrayList b;
    public Iterator c;

    public TreeIterator(@NotNull Iterator iterator0, @NotNull Function1 function10) {
        this.a = function10;
        this.b = new ArrayList();
        this.c = iterator0;
    }

    @Override
    public boolean hasNext() {
        return this.c.hasNext();
    }

    @Override
    public Object next() {
        Object object0 = this.c.next();
        Iterator iterator0 = (Iterator)this.a.invoke(object0);
        ArrayList arrayList0 = this.b;
        if(iterator0 != null && iterator0.hasNext()) {
            arrayList0.add(this.c);
            this.c = iterator0;
            return object0;
        }
        while(!this.c.hasNext() && !arrayList0.isEmpty()) {
            this.c = (Iterator)CollectionsKt___CollectionsKt.last(arrayList0);
            o.removeLast(arrayList0);
        }
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

