package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000F\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u000F\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0011\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001A\u00020\u00062\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001A\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\fH\u0086\u0002¢\u0006\u0004\b\u001A\u0010\u0012R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0011\u0010%\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "T", "", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "Lkotlin/Function0;", "", "onVectorMutated", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;Lkotlin/jvm/functions/Function0;)V", "clear", "()V", "", "index", "element", "add", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "", "asList", "()Ljava/util/List;", "get", "a", "Landroidx/compose/runtime/collection/MutableVector;", "getVector", "()Landroidx/compose/runtime/collection/MutableVector;", "b", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "getSize", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,54:1\n460#2,11:55\n523#2:66\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:55,11\n52#1:66\n*E\n"})
public final class MutableVectorWithMutationTracking {
    public static final int $stable;
    public final MutableVector a;
    public final Function0 b;

    static {
        MutableVectorWithMutationTracking.$stable = MutableVector.$stable;
    }

    public MutableVectorWithMutationTracking(@NotNull MutableVector mutableVector0, @NotNull Function0 function00) {
        this.a = mutableVector0;
        this.b = function00;
    }

    public final void add(int v, Object object0) {
        this.a.add(v, object0);
        this.b.invoke();
    }

    @NotNull
    public final List asList() {
        return this.a.asMutableList();
    }

    public final void clear() {
        this.a.clear();
        this.b.invoke();
    }

    public final void forEach(@NotNull Function1 function10) {
        MutableVector mutableVector0 = this.getVector();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                function10.invoke(arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final Object get(int v) {
        return this.a.getContent()[v];
    }

    @NotNull
    public final Function0 getOnVectorMutated() {
        return this.b;
    }

    public final int getSize() {
        return this.a.getSize();
    }

    @NotNull
    public final MutableVector getVector() {
        return this.a;
    }

    public final Object removeAt(int v) {
        Object object0 = this.a.removeAt(v);
        this.b.invoke();
        return object0;
    }
}

