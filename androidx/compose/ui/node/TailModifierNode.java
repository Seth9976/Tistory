package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000F\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001A\u00020\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/TailModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "onAttach", "onDetach", "", "n", "Z", "getAttachHasBeenRun", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TailModifierNode extends Node {
    public static final int $stable = 8;
    public boolean n;

    public TailModifierNode() {
        this.setAggregateChildKindSet$ui_release(0);
    }

    public final boolean getAttachHasBeenRun() {
        return this.n;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.n = true;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.n = false;
    }

    public final void setAttachHasBeenRun(boolean z) {
        this.n = z;
    }

    @Override
    @NotNull
    public String toString() {
        return "<tail>";
    }
}

