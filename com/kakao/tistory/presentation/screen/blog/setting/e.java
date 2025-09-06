package com.kakao.tistory.presentation.screen.blog.setting;

import android.content.Context;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.common.event.ToastEventKt;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.Complete;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.Finish;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.SelectImage;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent;
import com.kakao.tistory.presentation.screen.blog.setting.util.GalleryPermissionLauncherKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class e extends SuspendLambda implements Function2 {
    public Object a;
    public final Function1 b;
    public final NavActions c;
    public final Context d;
    public final i e;
    public final h f;

    public e(Function1 function10, NavActions navActions0, Context context0, i i0, h h0, Continuation continuation0) {
        this.b = function10;
        this.c = navActions0;
        this.d = context0;
        this.e = i0;
        this.f = h0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e(this.b, this.c, this.d, this.e, this.f, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((BlogSettingEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        BlogSettingEvent blogSettingEvent0 = (BlogSettingEvent)this.a;
        if(blogSettingEvent0 instanceof Complete) {
            BlogInfo blogInfo0 = ((Complete)blogSettingEvent0).getBlogInfo();
            this.b.invoke(blogInfo0);
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(blogSettingEvent0, Finish.INSTANCE)) {
            this.c.getFinish().invoke();
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(blogSettingEvent0, SelectImage.INSTANCE)) {
            GalleryPermissionLauncherKt.galleryPermissionCheck(this.d, this.e, this.f);
            return Unit.INSTANCE;
        }
        if(blogSettingEvent0 instanceof ShowToast) {
            ToastEventKt.showToast(this.d, ((ShowToastEvent)blogSettingEvent0));
        }
        return Unit.INSTANCE;
    }
}

