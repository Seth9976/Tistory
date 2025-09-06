package oa;

import android.util.Size;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class j extends SuspendLambda implements Function2 {
    public final PreviewTextureLoader o;
    public final KDPhoto p;
    public final Size q;

    public j(Size size0, KDPhoto kDPhoto0, PreviewTextureLoader previewTextureLoader0, Continuation continuation0) {
        this.o = previewTextureLoader0;
        this.p = kDPhoto0;
        this.q = size0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.q, this.p, this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.loadPhotoBitmap(this.p, this.q);
        return Unit.INSTANCE;
    }
}

