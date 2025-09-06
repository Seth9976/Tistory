package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001A\u00020\u0006*\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0018J\u0010\u0010\u001C\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010 \u001A\u00020\u000BH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJK\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001A\u00020$H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010,\u001A\u00020\u00032\b\u0010+\u001A\u0004\u0018\u00010*H\u00D6\u0003\u00A2\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b\u0004\u0010\u0018R\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001AR\u0017\u0010\b\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b3\u0010/\u001A\u0004\b4\u0010\u0018R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001DR\u001D\u0010\f\u001A\u00020\u000B8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006;"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "threshold", "<init>", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "node", "update", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Z", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "component4", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "component5-D9Ej5fM", "()F", "component5", "copy-M2VBTUQ", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;F)Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "c", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "d", "getEnabled", "e", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "getState", "f", "F", "getThreshold-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PullToRefreshElement extends ModifierNodeElement {
    public static final int $stable;
    public final boolean b;
    public final Function0 c;
    public final boolean d;
    public final PullToRefreshState e;
    public final float f;

    public PullToRefreshElement(boolean z, Function0 function00, boolean z1, PullToRefreshState pullToRefreshState0, float f, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = z;
        this.c = function00;
        this.d = z1;
        this.e = pullToRefreshState0;
        this.f = f;
    }

    public final boolean component1() {
        return this.b;
    }

    @NotNull
    public final Function0 component2() {
        return this.c;
    }

    public final boolean component3() {
        return this.d;
    }

    @NotNull
    public final PullToRefreshState component4() {
        return this.e;
    }

    public final float component5-D9Ej5fM() {
        return this.f;
    }

    @NotNull
    public final PullToRefreshElement copy-M2VBTUQ(boolean z, @NotNull Function0 function00, boolean z1, @NotNull PullToRefreshState pullToRefreshState0, float f) {
        return new PullToRefreshElement(z, function00, z1, pullToRefreshState0, f, null);
    }

    public static PullToRefreshElement copy-M2VBTUQ$default(PullToRefreshElement pullToRefreshElement0, boolean z, Function0 function00, boolean z1, PullToRefreshState pullToRefreshState0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            z = pullToRefreshElement0.b;
        }
        if((v & 2) != 0) {
            function00 = pullToRefreshElement0.c;
        }
        if((v & 4) != 0) {
            z1 = pullToRefreshElement0.d;
        }
        if((v & 8) != 0) {
            pullToRefreshState0 = pullToRefreshElement0.e;
        }
        if((v & 16) != 0) {
            f = pullToRefreshElement0.f;
        }
        return pullToRefreshElement0.copy-M2VBTUQ(z, function00, z1, pullToRefreshState0, f);
    }

    @NotNull
    public PullToRefreshModifierNode create() {
        return new PullToRefreshModifierNode(this.b, this.c, this.d, this.e, this.f, null);
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
        if(!(object0 instanceof PullToRefreshElement)) {
            return false;
        }
        if(this.b != ((PullToRefreshElement)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((PullToRefreshElement)object0).c)) {
            return false;
        }
        if(this.d != ((PullToRefreshElement)object0).d) {
            return false;
        }
        return Intrinsics.areEqual(this.e, ((PullToRefreshElement)object0).e) ? Dp.equals-impl0(this.f, ((PullToRefreshElement)object0).f) : false;
    }

    public final boolean getEnabled() {
        return this.d;
    }

    @NotNull
    public final Function0 getOnRefresh() {
        return this.c;
    }

    @NotNull
    public final PullToRefreshState getState() {
        return this.e;
    }

    public final float getThreshold-D9Ej5fM() {
        return this.f;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Dp.hashCode-impl(this.f) + (this.e.hashCode() + a.e(a.g(this.c, Boolean.hashCode(this.b) * 0x1F, 0x1F), 0x1F, this.d)) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("PullToRefreshModifierNode");
        a.k(this.b, inspectorInfo0.getProperties(), "isRefreshing", inspectorInfo0).set("onRefresh", this.c);
        a.k(this.d, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("state", this.e);
        inspectorInfo0.getProperties().set("threshold", Dp.box-impl(this.f));
    }

    public final boolean isRefreshing() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.b + ", onRefresh=" + this.c + ", enabled=" + this.d + ", state=" + this.e + ", threshold=" + Dp.toString-impl(this.f) + ')';
    }

    public void update(@NotNull PullToRefreshModifierNode pullToRefreshModifierNode0) {
        pullToRefreshModifierNode0.setOnRefresh(this.c);
        pullToRefreshModifierNode0.setEnabled(this.d);
        pullToRefreshModifierNode0.setState(this.e);
        pullToRefreshModifierNode0.setThreshold-0680j_4(this.f);
        boolean z = this.b;
        if(pullToRefreshModifierNode0.isRefreshing() != z) {
            pullToRefreshModifierNode0.setRefreshing(z);
            pullToRefreshModifierNode0.update();
        }
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((PullToRefreshModifierNode)modifier$Node0));
    }
}

