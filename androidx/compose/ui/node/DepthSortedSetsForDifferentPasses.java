package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\u000BJ\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u000F\u0010\nJ\u0015\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\u000BJ\r\u0010\u0010\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0016\u001A\u00020\f28\b\u0004\u0010\u0015\u001A2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0018\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001AJ\r\u0010\u001B\u001A\u00020\u0002¢\u0006\u0004\b\u001B\u0010\u0019¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "contains", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "add", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "remove", "pop", "()Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "block", "popEach", "(Lkotlin/jvm/functions/Function2;)V", "isEmpty", "()Z", "(Z)Z", "isNotEmpty", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,191:1\n102#2:192\n102#2:193\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n167#1:192\n179#1:193\n*E\n"})
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    public final DepthSortedSet a;
    public final DepthSortedSet b;

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.a = new DepthSortedSet(z);
        this.b = new DepthSortedSet(z);
    }

    public final void add(@NotNull LayoutNode layoutNode0, boolean z) {
        DepthSortedSet depthSortedSet0 = this.b;
        DepthSortedSet depthSortedSet1 = this.a;
        if(z) {
            depthSortedSet1.add(layoutNode0);
            depthSortedSet0.add(layoutNode0);
            return;
        }
        if(!depthSortedSet1.contains(layoutNode0)) {
            depthSortedSet0.add(layoutNode0);
        }
    }

    // 去混淆评级： 低(20)
    public final boolean contains(@NotNull LayoutNode layoutNode0) {
        return this.a.contains(layoutNode0) || this.b.contains(layoutNode0);
    }

    public final boolean contains(@NotNull LayoutNode layoutNode0, boolean z) {
        boolean z1 = this.a.contains(layoutNode0);
        return z ? z1 : z1 || this.b.contains(layoutNode0);
    }

    // 去混淆评级： 低(20)
    public final boolean isEmpty() {
        return this.b.isEmpty() && this.a.isEmpty();
    }

    // 去混淆评级： 低(20)
    public final boolean isEmpty(boolean z) {
        return z ? this.a.isEmpty() : this.b.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        return this.a.isEmpty() ? this.b.pop() : this.a.pop();
    }

    public final void popEach(@NotNull Function2 function20) {
        while(this.isNotEmpty()) {
            boolean z = this.a.isEmpty();
            function20.invoke((z ? this.b : this.a).pop(), Boolean.valueOf(!z));
        }
    }

    public final boolean remove(@NotNull LayoutNode layoutNode0) {
        boolean z = this.a.remove(layoutNode0);
        return this.b.remove(layoutNode0) || z;
    }

    // 去混淆评级： 低(20)
    public final boolean remove(@NotNull LayoutNode layoutNode0, boolean z) {
        return z ? this.a.remove(layoutNode0) : this.b.remove(layoutNode0);
    }
}

