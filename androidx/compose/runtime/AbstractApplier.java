package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0012\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\u0007¢\u0006\u0004\b\u000B\u0010\nJ\u000F\u0010\f\u001A\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001A\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000EH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001A\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000EH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR*\u0010\u001F\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00028\u00008\u0016@TX\u0096\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u0018\u001A\u0004\b\u001D\u0010\u001A\"\u0004\b\u001E\u0010\u0005¨\u0006 "}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "down", "up", "()V", "clear", "onClear", "", "", "index", "count", "remove", "(Ljava/util/List;II)V", "from", "to", "move", "(Ljava/util/List;III)V", "a", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "<set-?>", "c", "getCurrent", "setCurrent", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,289:1\n50#2,7:290\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n*L\n206#1:290,7\n*E\n"})
public abstract class AbstractApplier implements Applier {
    public static final int $stable = 8;
    public final Object a;
    public final ArrayList b;
    public Object c;

    public AbstractApplier(Object object0) {
        this.a = object0;
        this.b = new ArrayList();
        this.c = object0;
    }

    @Override  // androidx.compose.runtime.Applier
    public final void clear() {
        this.b.clear();
        this.setCurrent(this.a);
        this.onClear();
    }

    @Override  // androidx.compose.runtime.Applier
    public void down(Object object0) {
        this.b.add(this.getCurrent());
        this.setCurrent(object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public Object getCurrent() {
        return this.c;
    }

    public final Object getRoot() {
        return this.a;
    }

    public final void move(@NotNull List list0, int v, int v1, int v2) {
        int v3 = v <= v1 ? v1 - v2 : v1;
        if(v2 == 1) {
            if(v != v1 + 1 && v != v1 - 1) {
                list0.add(v3, list0.remove(v));
                return;
            }
            list0.set(v, list0.set(v1, list0.get(v)));
            return;
        }
        List list1 = list0.subList(v, v2 + v);
        List list2 = CollectionsKt___CollectionsKt.toMutableList(list1);
        list1.clear();
        list0.addAll(v3, list2);
    }

    public abstract void onClear();

    public final void remove(@NotNull List list0, int v, int v1) {
        if(v1 == 1) {
            list0.remove(v);
            return;
        }
        list0.subList(v, v1 + v).clear();
    }

    public void setCurrent(Object object0) {
        this.c = object0;
    }

    @Override  // androidx.compose.runtime.Applier
    public void up() {
        ArrayList arrayList0 = this.b;
        if(arrayList0.isEmpty()) {
            PreconditionsKt.throwIllegalStateException("empty stack");
        }
        this.setCurrent(arrayList0.remove(arrayList0.size() - 1));
    }
}

