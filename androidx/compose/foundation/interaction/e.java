package androidx.compose.foundation.interaction;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

public final class e implements FlowCollector {
    public final ArrayList a;
    public final MutableState b;

    public e(ArrayList arrayList0, MutableState mutableState0) {
        this.a = arrayList0;
        this.b = mutableState0;
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
        this.b.setValue(Boxing.boxBoolean(!arrayList0.isEmpty()));
        return Unit.INSTANCE;
    }
}

