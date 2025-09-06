package v9;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import com.kakao.kandinsky.core.filter.gl.GLBitmapTexture;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class b extends SuspendLambda implements Function2 {
    public final Bitmap o;

    public b(Bitmap bitmap0, Continuation continuation0) {
        this.o = bitmap0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Bitmap bitmap0 = this.o.copy(Bitmap.Config.ARGB_8888, false);
        Intrinsics.checkNotNullExpressionValue(bitmap0, "copy(...)");
        return new GLBitmapTexture(bitmap0);
    }
}

