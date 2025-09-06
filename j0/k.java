package j0;

import androidx.compose.foundation.text.SecureTextFieldController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class k extends SuspendLambda implements Function2 {
    public final boolean o;
    public final SecureTextFieldController p;

    public k(boolean z, SecureTextFieldController secureTextFieldController0, Continuation continuation0) {
        this.o = z;
        this.p = secureTextFieldController0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(!this.o) {
            this.p.getPasswordInputTransformation().hide();
        }
        return Unit.INSTANCE;
    }
}

