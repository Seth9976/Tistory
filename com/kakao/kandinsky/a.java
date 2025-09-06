package com.kakao.kandinsky;

import android.content.Context;
import android.widget.Toast;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class a extends SuspendLambda implements Function2 {
    public Object a;
    public final Context b;

    public a(Context context0, Continuation continuation0) {
        this.b = context0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        a a0 = new a(this.b, ((Continuation)object1));
        a0.a = (KDPhoto)object0;
        return a0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(((KDPhoto)this.a).getTooLargeImage()) {
            String s = this.b.getString(string.too_large_image_toast, new Object[]{Boxing.boxInt(3000)});
            Toast.makeText(this.b, s, 0).show();
        }
        return Unit.INSTANCE;
    }
}

