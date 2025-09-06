package com.kakao.tistory.presentation.screen.blog.main;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.ui.platform.ClipboardManager;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class d0 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;
    public final NavActions c;
    public final BlogNestedNavActions d;
    public final ClipboardManager e;
    public final Context f;
    public final ManagedActivityResultLauncher g;
    public final Activity h;

    public d0(BlogMainViewModel blogMainViewModel0, NavActions navActions0, BlogNestedNavActions blogNestedNavActions0, ClipboardManager clipboardManager0, Context context0, ManagedActivityResultLauncher managedActivityResultLauncher0, Activity activity0, Continuation continuation0) {
        this.b = blogMainViewModel0;
        this.c = navActions0;
        this.d = blogNestedNavActions0;
        this.e = clipboardManager0;
        this.f = context0;
        this.g = managedActivityResultLauncher0;
        this.h = activity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                c0 c00 = new c0(this.c, this.d, this.e, this.f, this.g, this.h, null);
                this.a = 1;
                return FlowKt.collectLatest(this.b.getEvent(), c00, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

