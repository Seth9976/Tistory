package androidx.compose.material3;

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

public final class h2 implements FlowCollector {
    public final SnapshotStateList a;

    public h2(SnapshotStateList snapshotStateList0) {
        this.a = snapshotStateList0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        SnapshotStateList snapshotStateList0 = this.a;
        if(((Interaction)object0) instanceof Enter) {
            snapshotStateList0.add(((Interaction)object0));
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Exit) {
            snapshotStateList0.remove(((Exit)(((Interaction)object0))).getEnter());
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Focus) {
            snapshotStateList0.add(((Interaction)object0));
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Unfocus) {
            snapshotStateList0.remove(((Unfocus)(((Interaction)object0))).getFocus());
            return Unit.INSTANCE;
        }
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
        }
        return Unit.INSTANCE;
    }
}

