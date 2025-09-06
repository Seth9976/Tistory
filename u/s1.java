package u;

import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import j0.b2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

public final class s1 extends Node {
    public MutableInteractionSource n;
    public Focus o;

    public final void b(MutableInteractionSource mutableInteractionSource0, FocusInteraction focusInteraction0) {
        if(this.isAttached()) {
            Job job0 = (Job)this.getCoroutineScope().getCoroutineContext().get(Job.Key);
            DisposableHandle disposableHandle0 = job0 == null ? null : job0.invokeOnCompletion(new b2(29, mutableInteractionSource0, focusInteraction0));
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new r1(mutableInteractionSource0, focusInteraction0, disposableHandle0, null), 3, null);
            return;
        }
        mutableInteractionSource0.tryEmit(focusInteraction0);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}

