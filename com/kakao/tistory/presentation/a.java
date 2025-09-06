package com.kakao.tistory.presentation;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Size;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest.Builder;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public int a;
    public final Context b;
    public final Object c;
    public final Size d;

    public a(Context context0, Object object0, Size size0, Continuation continuation0) {
        this.b = context0;
        this.c = object0;
        this.d = size0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ImageLoader imageLoader0 = Coil.imageLoader(this.b);
                Builder imageRequest$Builder0 = new Builder(this.b);
                Size size0 = this.d;
                imageRequest$Builder0.data(this.c);
                imageRequest$Builder0.allowHardware(false);
                if(size0 == null) {
                    imageRequest$Builder0.size(coil.size.Size.ORIGINAL);
                }
                else {
                    imageRequest$Builder0.size(size0.getWidth(), size0.getHeight());
                }
                ImageRequest imageRequest0 = imageRequest$Builder0.build();
                this.a = 1;
                object0 = imageLoader0.execute(imageRequest0, this);
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
        SuccessResult successResult0 = object0 instanceof SuccessResult ? ((SuccessResult)object0) : null;
        Drawable drawable0 = successResult0 == null ? null : successResult0.getDrawable();
        BitmapDrawable bitmapDrawable0 = drawable0 instanceof BitmapDrawable ? ((BitmapDrawable)drawable0) : null;
        return bitmapDrawable0 == null ? null : bitmapDrawable0.getBitmap();
    }
}

