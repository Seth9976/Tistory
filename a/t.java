package a;

import android.graphics.Matrix;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class t extends SuspendLambda implements Function2 {
    public final PreviewGestureController a;
    public final PreviewAnimator b;

    public t(PreviewGestureController previewGestureController0, PreviewAnimator previewAnimator0, Continuation continuation0) {
        this.a = previewGestureController0;
        this.b = previewAnimator0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new t(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new t(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.a.resetGesture();
        Matrix matrix0 = this.a.getGestureMatrix();
        this.b.updateGestureMatrix(matrix0, false);
        return Unit.INSTANCE;
    }
}

