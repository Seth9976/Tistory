package eb;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.kandinsky.textedit.ui.TextInputKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class m extends SuspendLambda implements Function2 {
    public final String o;
    public final MutableState p;

    public m(String s, MutableState mutableState0, Continuation continuation0) {
        this.o = s;
        this.p = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new m(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        MutableState mutableState0 = this.p;
        if(!Intrinsics.areEqual(TextInputKt.access$TextInput_ca1Bfew$lambda$4(mutableState0).getText(), this.o)) {
            TextFieldValue textFieldValue0 = TextInputKt.access$TextInput_ca1Bfew$lambda$4(mutableState0);
            long v = TextRangeKt.TextRange(this.o.length());
            TextInputKt.access$TextInput_ca1Bfew$lambda$5(mutableState0, TextFieldValue.copy-3r_uNRQ$default(textFieldValue0, this.o, v, null, 4, null));
        }
        return Unit.INSTANCE;
    }
}

