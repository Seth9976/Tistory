package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012<\u0010\f\u001A8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000B0\u0005¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u000B8F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowItemIterator;", "", "Landroidx/compose/ui/layout/Measurable;", "", "itemCount", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "", "getMeasurables", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "", "hasNext", "()Z", "next", "()Landroidx/compose/ui/layout/Measurable;", "getNext$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "getNext", "getList", "()Ljava/util/List;", "list", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContextualFlowItemIterator implements Iterator, KMappedMarker {
    public static final int $stable = 8;
    public final int a;
    public final Function2 b;
    public final ArrayList c;
    public int d;
    public int e;

    public ContextualFlowItemIterator(int v, @NotNull Function2 function20) {
        this.a = v;
        this.b = function20;
        this.c = new ArrayList();
    }

    @NotNull
    public final List getList() {
        return this.c;
    }

    @NotNull
    public final Measurable getNext$foundation_layout_release(@NotNull FlowLineInfo flowLineInfo0) {
        if(this.e < this.getList().size()) {
            Measurable measurable0 = (Measurable)this.getList().get(this.e);
            ++this.e;
            return measurable0;
        }
        int v = this.d;
        if(v >= this.a) {
            throw new ArrayIndexOutOfBoundsException("No item returned at index call. Index: " + this.d);
        }
        List list0 = (List)this.b.invoke(v, flowLineInfo0);
        ++this.d;
        if(list0.isEmpty()) {
            return this.next();
        }
        Measurable measurable1 = (Measurable)CollectionsKt___CollectionsKt.first(list0);
        this.c.addAll(list0);
        ++this.e;
        return measurable1;
    }

    public static Measurable getNext$foundation_layout_release$default(ContextualFlowItemIterator contextualFlowItemIterator0, FlowLineInfo flowLineInfo0, int v, Object object0) {
        if((v & 1) != 0) {
            flowLineInfo0 = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator0.getNext$foundation_layout_release(flowLineInfo0);
    }

    @Override
    public boolean hasNext() {
        return this.e < this.getList().size() || this.d < this.a;
    }

    @NotNull
    public Measurable next() {
        return ContextualFlowItemIterator.getNext$foundation_layout_release$default(this, null, 1, null);
    }

    @Override
    public Object next() {
        return this.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

