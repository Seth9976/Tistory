package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00028\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u0005¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/runtime/CompositionLocalMap;", "map", "<init>", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "", "onAttach", "()V", "value", "n", "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CompositionLocalMapInjectionNode extends Node {
    public static final int $stable = 8;
    public CompositionLocalMap n;

    public CompositionLocalMapInjectionNode(@NotNull CompositionLocalMap compositionLocalMap0) {
        this.n = compositionLocalMap0;
    }

    @NotNull
    public final CompositionLocalMap getMap() {
        return this.n;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.n);
    }

    public final void setMap(@NotNull CompositionLocalMap compositionLocalMap0) {
        this.n = compositionLocalMap0;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(compositionLocalMap0);
    }
}

