package i4;

import androidx.compose.runtime.ProduceStateScope;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class b implements FlowCollector {
    public final int a;
    public final ProduceStateScope b;

    public b(ProduceStateScope produceStateScope0, int v) {
        this.a = v;
        this.b = produceStateScope0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        switch(this.a) {
            case 0: {
                this.b.setValue(object0);
                return Unit.INSTANCE;
            }
            case 1: {
                this.b.setValue(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                this.b.setValue(((NavBackStackEntry)object0));
                return Unit.INSTANCE;
            }
            case 3: {
                this.b.setValue(object0);
                return Unit.INSTANCE;
            }
            default: {
                this.b.setValue(object0);
                return Unit.INSTANCE;
            }
        }
    }
}

