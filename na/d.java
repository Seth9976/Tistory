package na;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kandinsky.preview.PreviewUiState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class d extends SuspendLambda implements Function2 {
    public final PreviewAnimator o;
    public final PreviewUiState p;
    public final PreviewGestureController q;

    public d(PreviewAnimator previewAnimator0, PreviewUiState previewUiState0, PreviewGestureController previewGestureController0, Continuation continuation0) {
        this.o = previewAnimator0;
        this.p = previewUiState0;
        this.q = previewGestureController0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        long v = this.p.getPhoto().getCropSize-NH-jbRc();
        Matrix matrix0 = this.p.getDisplayMatrix();
        this.o.updateRelativeMatrix-TmRCtEA(v, matrix0);
        Rect rect0 = this.p.getDisplayCropRect();
        this.q.updateDisplayInfo(rect0);
        return Unit.INSTANCE;
    }
}

