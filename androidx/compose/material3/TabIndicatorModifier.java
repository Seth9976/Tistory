package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001A\u00020\u0010*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001C\u0010\u0016\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\tHÆ\u0003¢\u0006\u0004\b\u001A\u0010\u001BJ:\u0010\u001C\u001A\u00020\u00002\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\tHÆ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u001EHÖ\u0001¢\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u001A\u0010$\u001A\u00020\t2\b\u0010#\u001A\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R#\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0017R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0019R\u0017\u0010\n\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001B¨\u0006/"}, d2 = {"Landroidx/compose/material3/TabIndicatorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "<init>", "(Landroidx/compose/runtime/State;IZ)V", "create", "()Landroidx/compose/material3/TabIndicatorOffsetNode;", "node", "", "update", "(Landroidx/compose/material3/TabIndicatorOffsetNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/runtime/State;", "component2", "()I", "component3", "()Z", "copy", "(Landroidx/compose/runtime/State;IZ)Landroidx/compose/material3/TabIndicatorModifier;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/State;", "getTabPositionsState", "c", "I", "getSelectedTabIndex", "d", "Z", "getFollowContentSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TabIndicatorModifier extends ModifierNodeElement {
    public static final int $stable;
    public final State b;
    public final int c;
    public final boolean d;

    public TabIndicatorModifier(@NotNull State state0, int v, boolean z) {
        this.b = state0;
        this.c = v;
        this.d = z;
    }

    @NotNull
    public final State component1() {
        return this.b;
    }

    public final int component2() {
        return this.c;
    }

    public final boolean component3() {
        return this.d;
    }

    @NotNull
    public final TabIndicatorModifier copy(@NotNull State state0, int v, boolean z) {
        return new TabIndicatorModifier(state0, v, z);
    }

    public static TabIndicatorModifier copy$default(TabIndicatorModifier tabIndicatorModifier0, State state0, int v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            state0 = tabIndicatorModifier0.b;
        }
        if((v1 & 2) != 0) {
            v = tabIndicatorModifier0.c;
        }
        if((v1 & 4) != 0) {
            z = tabIndicatorModifier0.d;
        }
        return tabIndicatorModifier0.copy(state0, v, z);
    }

    @NotNull
    public TabIndicatorOffsetNode create() {
        return new TabIndicatorOffsetNode(this.b, this.c, this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TabIndicatorModifier)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TabIndicatorModifier)object0).b)) {
            return false;
        }
        return this.c == ((TabIndicatorModifier)object0).c ? this.d == ((TabIndicatorModifier)object0).d : false;
    }

    public final boolean getFollowContentSize() {
        return this.d;
    }

    public final int getSelectedTabIndex() {
        return this.c;
    }

    @NotNull
    public final State getTabPositionsState() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.d) + a.c(this.c, this.b.hashCode() * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TabIndicatorModifier(tabPositionsState=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", selectedTabIndex=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", followContentSize=");
        return a.p(stringBuilder0, this.d, ')');
    }

    public void update(@NotNull TabIndicatorOffsetNode tabIndicatorOffsetNode0) {
        tabIndicatorOffsetNode0.setTabPositionsState(this.b);
        tabIndicatorOffsetNode0.setSelectedTabIndex(this.c);
        tabIndicatorOffsetNode0.setFollowContentSize(this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((TabIndicatorOffsetNode)modifier$Node0));
    }
}

