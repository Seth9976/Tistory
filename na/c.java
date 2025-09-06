package na;

import android.graphics.Matrix;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewUiState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class c extends SuspendLambda implements Function2 {
    public final PreviewAnimator o;
    public final PreviewUiState p;

    public c(PreviewAnimator previewAnimator0, PreviewUiState previewUiState0, Continuation continuation0) {
        this.o = previewAnimator0;
        this.p = previewUiState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Matrix matrix0 = this.p.getPreviewMatrix();
        this.o.updateAbsoluteMatrix(matrix0);
        return Unit.INSTANCE;
    }
}

