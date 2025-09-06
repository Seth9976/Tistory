package j0;

import aa.l;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.o7;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class j1 extends SuspendLambda implements Function2 {
    public int o;
    public final LegacyTextFieldState p;
    public final State q;
    public final TextInputService r;
    public final TextFieldSelectionManager s;
    public final ImeOptions t;

    public j1(LegacyTextFieldState legacyTextFieldState0, State state0, TextInputService textInputService0, TextFieldSelectionManager textFieldSelectionManager0, ImeOptions imeOptions0, Continuation continuation0) {
        this.p = legacyTextFieldState0;
        this.q = state0;
        this.r = textInputService0;
        this.s = textFieldSelectionManager0;
        this.t = imeOptions0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j1(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LegacyTextFieldState legacyTextFieldState0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    Flow flow0 = SnapshotStateKt.snapshotFlow(new l(this.q, 16));
                    o7 o70 = new o7(1, legacyTextFieldState0, this.r, this.s, this.t);
                    this.o = 1;
                    if(flow0.collect(o70, this) == object1) {
                        return object1;
                    label_10:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    CoreTextFieldKt.access$endInputSession(legacyTextFieldState0);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_10;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        CoreTextFieldKt.access$endInputSession(legacyTextFieldState0);
        return Unit.INSTANCE;
    }
}

