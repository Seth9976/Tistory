package oa;

import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PreviewTextureLoader q;
    public final KDPhoto r;

    public e(PreviewTextureLoader previewTextureLoader0, KDPhoto kDPhoto0, Continuation continuation0) {
        this.q = previewTextureLoader0;
        this.r = kDPhoto0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((ViewFilterEngine)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        KDPhoto kDPhoto0 = this.r;
        PreviewTextureLoader previewTextureLoader0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = PreviewTextureLoader.access$update(previewTextureLoader0, ((ViewFilterEngine)this.p), previewTextureLoader0.h, kDPhoto0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        previewTextureLoader0.h = kDPhoto0;
        return Boxing.boxBoolean(((Boolean)object0).booleanValue());
    }
}

