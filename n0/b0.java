package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class b0 extends SuspendLambda implements Function2 {
    public Object o;
    public final TextFieldSelectionState p;

    public b0(TextFieldSelectionState textFieldSelectionState0, Continuation continuation0) {
        this.p = textFieldSelectionState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b0(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        BuildersKt.launch$default(coroutineScope0, null, null, new z(this.p, null), 3, null);
        return BuildersKt.launch$default(coroutineScope0, null, null, new a0(this.p, null), 3, null);
    }
}

