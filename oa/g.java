package oa;

import android.graphics.SurfaceTexture;
import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class g extends SuspendLambda implements Function2 {
    public int o;
    public final PreviewTextureLoader p;
    public final SurfaceTexture q;
    public final int r;
    public final int s;

    public g(PreviewTextureLoader previewTextureLoader0, SurfaceTexture surfaceTexture0, int v, int v1, Continuation continuation0) {
        this.p = previewTextureLoader0;
        this.q = surfaceTexture0;
        this.r = v;
        this.s = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PreviewTextureLoader previewTextureLoader0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ViewFilterEngine viewFilterEngine0 = PreviewTextureLoader.access$getFilterEngine(previewTextureLoader0);
                this.o = 1;
                if(viewFilterEngine0.updateOutput(this.q, this) == object1) {
                    return object1;
                }
            label_17:
                ViewFilterEngine viewFilterEngine1 = PreviewTextureLoader.access$getFilterEngine(previewTextureLoader0);
                this.o = 2;
                if(viewFilterEngine1.updateOutputSize(this.r, this.s, this) == object1) {
                    return object1;
                }
            label_21:
                ViewFilterEngine viewFilterEngine2 = PreviewTextureLoader.access$getFilterEngine(previewTextureLoader0);
                this.o = 3;
                if(viewFilterEngine2.updateInput(previewTextureLoader0.f, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                goto label_17;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                goto label_21;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 4: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ViewFilterEngine viewFilterEngine3 = PreviewTextureLoader.access$getFilterEngine(previewTextureLoader0);
        this.o = 4;
        return ViewFilterEngine.updateAndExecute$default(viewFilterEngine3, null, null, this, 3, null) == object1 ? object1 : Unit.INSTANCE;
    }
}

