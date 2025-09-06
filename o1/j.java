package o1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierNode;

public final class j extends Node implements FocusRequesterModifierNode {
    public FocusRequester n;

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        super.onAttach();
        this.n.getFocusRequesterNodes$ui_release().add(this);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        this.n.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }
}

