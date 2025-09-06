package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction.Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class ck implements FlowCollector {
    public final SnapshotStateList a;

    public ck(SnapshotStateList snapshotStateList0) {
        this.a = snapshotStateList0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Interaction interaction0 = (Interaction)object0;
        SnapshotStateList snapshotStateList0 = this.a;
        if(interaction0 instanceof Enter) {
            snapshotStateList0.add(interaction0);
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Exit) {
            snapshotStateList0.remove(((Exit)interaction0).getEnter());
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Focus) {
            snapshotStateList0.add(interaction0);
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Unfocus) {
            snapshotStateList0.remove(((Unfocus)interaction0).getFocus());
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Press) {
            snapshotStateList0.add(interaction0);
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Release) {
            snapshotStateList0.remove(((Release)interaction0).getPress());
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Cancel) {
            snapshotStateList0.remove(((Cancel)interaction0).getPress());
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Start) {
            snapshotStateList0.add(interaction0);
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof Stop) {
            snapshotStateList0.remove(((Stop)interaction0).getStart());
            return Unit.INSTANCE;
        }
        if(interaction0 instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel) {
            snapshotStateList0.remove(((androidx.compose.foundation.interaction.DragInteraction.Cancel)interaction0).getStart());
        }
        return Unit.INSTANCE;
    }
}

