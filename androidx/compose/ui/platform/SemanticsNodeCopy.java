package androidx.compose.ui.platform;

import androidx.collection.IntObjectMap;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000E\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001A\u00020\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/SemanticsNodeCopy;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/collection/IntObjectMap;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "a", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "Landroidx/collection/MutableIntSet;", "b", "Landroidx/collection/MutableIntSet;", "getChildren", "()Landroidx/collection/MutableIntSet;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,234:1\n33#2,6:235\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n*L\n53#1:235,6\n*E\n"})
public final class SemanticsNodeCopy {
    public static final int $stable = 8;
    public final SemanticsConfiguration a;
    public final MutableIntSet b;

    public SemanticsNodeCopy(@NotNull SemanticsNode semanticsNode0, @NotNull IntObjectMap intObjectMap0) {
        this.a = semanticsNode0.getUnmergedConfig$ui_release();
        this.b = IntSetKt.mutableIntSetOf();
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v1);
            if(intObjectMap0.contains(semanticsNode1.getId())) {
                this.b.add(semanticsNode1.getId());
            }
        }
    }

    @NotNull
    public final MutableIntSet getChildren() {
        return this.b;
    }

    @NotNull
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.a;
    }
}

