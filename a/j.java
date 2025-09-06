package a;

import android.content.Intent;
import b.a;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.launcher.KandinskyOutput;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

public final class j extends SuspendLambda implements Function2 {
    public Object a;
    public final KandinskyActivity b;

    public j(KandinskyActivity kandinskyActivity0, Continuation continuation0) {
        this.b = kandinskyActivity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        j j0 = new j(this.b, ((Continuation)object1));
        j0.a = (a)object0;
        return j0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        KandinskyOutput kandinskyOutput0 = ((a)this.a).a;
        if(kandinskyOutput0 != null) {
            Intent intent0 = new Intent();
            Json.Default.getSerializersModule();
            KSerializer kSerializer0 = KandinskyOutput.Companion.serializer();
            intent0.putExtra("EDITED_ITEMS", Json.Default.encodeToString(kSerializer0, kandinskyOutput0));
            this.b.setResult(-1, intent0);
        }
        this.b.finish();
        return Unit.INSTANCE;
    }
}

