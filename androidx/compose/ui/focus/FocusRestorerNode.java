package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0017\u0012\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R*\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/FocusRequester;", "onRestoreFailed", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "onDetach", "()V", "n", "Lkotlin/jvm/functions/Function0;", "getOnRestoreFailed", "()Lkotlin/jvm/functions/Function0;", "setOnRestoreFailed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FocusRestorerNode extends Node implements FocusPropertiesModifierNode, FocusRequesterModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    public Function0 n;
    public PinnedHandle o;
    public final f p;
    public final e q;

    public FocusRestorerNode(@Nullable Function0 function00) {
        this.n = function00;
        this.p = new f(this);
        this.q = new e(this);
    }

    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@NotNull FocusProperties focusProperties0) {
        focusProperties0.setEnter(this.q);
        focusProperties0.setExit(this.p);
    }

    @Nullable
    public final Function0 getOnRestoreFailed() {
        return this.n;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        PinnedHandle pinnableContainer$PinnedHandle0 = this.o;
        if(pinnableContainer$PinnedHandle0 != null) {
            pinnableContainer$PinnedHandle0.release();
        }
        this.o = null;
        super.onDetach();
    }

    public final void setOnRestoreFailed(@Nullable Function0 function00) {
        this.n = function00;
    }
}

