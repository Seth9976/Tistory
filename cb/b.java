package cb;

import androidx.compose.runtime.MutableState;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.textedit.TextEditorKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class b extends SuspendLambda implements Function2 {
    public final Function2 o;
    public final MutableState p;
    public final MutableState q;

    public b(Function2 function20, MutableState mutableState0, MutableState mutableState1, Continuation continuation0) {
        this.o = function20;
        this.p = mutableState0;
        this.q = mutableState1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        TextData textData0 = TextEditorKt.access$TextEditor$lambda$9(this.p);
        Boolean boolean0 = Boxing.boxBoolean(TextEditorKt.access$TextEditor$lambda$12(this.q));
        this.o.invoke(textData0, boolean0);
        return Unit.INSTANCE;
    }
}

