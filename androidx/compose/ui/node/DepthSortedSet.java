package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import b2.f;
import java.util.Comparator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000E\u001A\u00020\u0006¢\u0006\u0004\b\u000E\u0010\u000FJ&\u0010\u0012\u001A\u00020\n2\u0014\b\u0004\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0015J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "contains", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "add", "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "pop", "()Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "block", "popEach", "(Lkotlin/jvm/functions/Function1;)V", "isEmpty", "()Z", "isNotEmpty", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,191:1\n102#1:227\n42#2,7:192\n42#2,7:199\n42#2,7:206\n42#2,7:213\n42#2,7:220\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n93#1:227\n54#1:192,7\n62#1:199,7\n68#1:206,7\n75#1:213,7\n79#1:220,7\n*E\n"})
public final class DepthSortedSet {
    public static final int $stable = 8;
    public final boolean a;
    public final Lazy b;
    public final TreeSet c;

    public DepthSortedSet(boolean z) {
        this.a = z;
        this.b = c.lazy(LazyThreadSafetyMode.NONE, f.x);
        this.c = new TreeSet(new androidx.compose.ui.node.DepthSortedSet.DepthComparator.1());  // 初始化器: Ljava/lang/Object;-><init>()V

        @Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/node/DepthSortedSet$DepthComparator$1", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "compare", "", "l1", "l2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.node.DepthSortedSet.DepthComparator.1 implements Comparator {
            public int compare(@NotNull LayoutNode layoutNode0, @NotNull LayoutNode layoutNode1) {
                int v = Intrinsics.compare(layoutNode0.getDepth$ui_release(), layoutNode1.getDepth$ui_release());
                return v == 0 ? Intrinsics.compare(layoutNode0.hashCode(), layoutNode1.hashCode()) : v;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.compare(((LayoutNode)object0), ((LayoutNode)object1));
            }
        }

    }

    public final void add(@NotNull LayoutNode layoutNode0) {
        if(!layoutNode0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if(this.a) {
            Lazy lazy0 = this.b;
            Integer integer0 = (Integer)((Map)lazy0.getValue()).get(layoutNode0);
            if(integer0 == null) {
                ((Map)lazy0.getValue()).put(layoutNode0, layoutNode0.getDepth$ui_release());
            }
            else if(((int)integer0) != layoutNode0.getDepth$ui_release()) {
                InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        this.c.add(layoutNode0);
    }

    public final boolean contains(@NotNull LayoutNode layoutNode0) {
        boolean z = this.c.contains(layoutNode0);
        if(this.a && z != ((Map)this.b.getValue()).containsKey(layoutNode0)) {
            InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
        }
        return z;
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        LayoutNode layoutNode0 = (LayoutNode)this.c.first();
        this.remove(layoutNode0);
        return layoutNode0;
    }

    public final void popEach(@NotNull Function1 function10) {
        while(!this.isEmpty()) {
            function10.invoke(this.pop());
        }
    }

    public final boolean remove(@NotNull LayoutNode layoutNode0) {
        if(!layoutNode0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean z = this.c.remove(layoutNode0);
        if(this.a && !Intrinsics.areEqual(((Integer)((Map)this.b.getValue()).remove(layoutNode0)), (z ? layoutNode0.getDepth$ui_release() : null))) {
            InlineClassHelperKt.throwIllegalStateException("invalid node depth");
        }
        return z;
    }

    @Override
    @NotNull
    public String toString() {
        return this.c.toString();
    }
}

