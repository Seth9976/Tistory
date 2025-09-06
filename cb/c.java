package cb;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.textedit.TextEditorKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class c extends SuspendLambda implements Function2 {
    public final Density o;
    public final h p;
    public final MutableState q;

    public c(Density density0, h h0, MutableState mutableState0, Continuation continuation0) {
        this.o = density0;
        this.p = h0;
        this.q = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        TextData textData0 = TextEditorKt.access$TextEditor$lambda$9(this.q);
        float f = this.o.toPx--R2X_6o(this.p.c);
        float f1 = this.o.toPx--R2X_6o(this.p.d);
        TextData textData1 = TextData.copy-A15cKkk$default(textData0, null, 0L, 0.0f, 0L, 0.0f, 0L, this.o.toSize-XkaWNTQ(this.p.e), false, false, false, 0, null, f, f1, 0xFBF, null);
        TextEditorKt.access$TextEditor$lambda$10(this.q, textData1);
        return Unit.INSTANCE;
    }
}

