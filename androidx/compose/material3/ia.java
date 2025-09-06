package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction.Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

public final class ia implements FlowCollector {
    public final ArrayList a;
    public final CoroutineScope b;
    public final ma c;

    public ia(ArrayList arrayList0, CoroutineScope coroutineScope0, ma ma0) {
        this.a = arrayList0;
        this.b = coroutineScope0;
        this.c = ma0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        ArrayList arrayList0 = this.a;
        if(((Interaction)object0) instanceof Enter) {
            arrayList0.add(((Interaction)object0));
        }
        else if(((Interaction)object0) instanceof Exit) {
            arrayList0.remove(((Exit)(((Interaction)object0))).getEnter());
        }
        else if(((Interaction)object0) instanceof Focus) {
            arrayList0.add(((Interaction)object0));
        }
        else if(((Interaction)object0) instanceof Unfocus) {
            arrayList0.remove(((Unfocus)(((Interaction)object0))).getFocus());
        }
        else if(((Interaction)object0) instanceof Press) {
            arrayList0.add(((Interaction)object0));
        }
        else if(((Interaction)object0) instanceof Release) {
            arrayList0.remove(((Release)(((Interaction)object0))).getPress());
        }
        else if(((Interaction)object0) instanceof Cancel) {
            arrayList0.remove(((Cancel)(((Interaction)object0))).getPress());
        }
        Interaction interaction0 = (Interaction)CollectionsKt___CollectionsKt.lastOrNull(arrayList0);
        ha ha0 = new ha(this.c, interaction0, null);
        BuildersKt.launch$default(this.b, null, null, ha0, 3, null);
        return Unit.INSTANCE;
    }
}

