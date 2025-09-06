package p0;

import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class ha implements FlowCollector {
    public final SnapshotStateList a;

    public ha(SnapshotStateList snapshotStateList0) {
        this.a = snapshotStateList0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        SnapshotStateList snapshotStateList0 = this.a;
        if(((Interaction)object0) instanceof Press) {
            snapshotStateList0.add(((Interaction)object0));
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Release) {
            snapshotStateList0.remove(((Release)(((Interaction)object0))).getPress());
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Cancel) {
            snapshotStateList0.remove(((Cancel)(((Interaction)object0))).getPress());
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Start) {
            snapshotStateList0.add(((Interaction)object0));
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Stop) {
            snapshotStateList0.remove(((Stop)(((Interaction)object0))).getStart());
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel) {
            snapshotStateList0.remove(((androidx.compose.foundation.interaction.DragInteraction.Cancel)(((Interaction)object0))).getStart());
        }
        return Unit.INSTANCE;
    }
}

