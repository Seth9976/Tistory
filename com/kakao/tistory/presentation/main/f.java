package com.kakao.tistory.presentation.main;

import android.app.Activity;
import android.content.Context;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.common.event.ToastEventKt;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.main.contract.MainEvent.ChangeMainDestination;
import com.kakao.tistory.presentation.main.contract.MainEvent.FinishApp;
import com.kakao.tistory.presentation.main.contract.MainEvent.GoEditor;
import com.kakao.tistory.presentation.main.contract.MainEvent.RedirectUrl;
import com.kakao.tistory.presentation.main.contract.MainEvent.ShowDialog;
import com.kakao.tistory.presentation.main.contract.MainEvent.ShowToast;
import com.kakao.tistory.presentation.main.contract.MainEvent.ShowWelcomeDialog;
import com.kakao.tistory.presentation.main.contract.MainEvent;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import com.kakao.tistory.presentation.widget.dialog.WelcomeDialogKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class f extends SuspendLambda implements Function2 {
    public Object a;
    public final MainAppState b;
    public final Context c;

    public f(MainAppState mainAppState0, Context context0, Continuation continuation0) {
        this.b = mainAppState0;
        this.c = context0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.b, this.c, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((MainEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        MainEvent mainEvent0 = (MainEvent)this.a;
        if(mainEvent0 instanceof ChangeMainDestination) {
            MainDestination mainDestination0 = ((ChangeMainDestination)mainEvent0).getDestination();
            this.b.navigateToMainDestination(mainDestination0);
            return Unit.INSTANCE;
        }
        if(mainEvent0 instanceof ShowWelcomeDialog) {
            WelcomeDialogKt.navigateToWelcomeDialog(this.b.getNavController(), ((ShowWelcomeDialog)mainEvent0).getUserName());
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(mainEvent0, FinishApp.INSTANCE)) {
            Activity activity0 = this.c instanceof Activity ? ((Activity)this.c) : null;
            if(activity0 != null) {
                activity0.finishAffinity();
                return Unit.INSTANCE;
            }
        }
        else {
            if(mainEvent0 instanceof RedirectUrl) {
                String s = ((RedirectUrl)mainEvent0).getUrl();
                NavigatorExtensionKt.goToRedirectInternally(this.c, s);
                return Unit.INSTANCE;
            }
            if(mainEvent0 instanceof GoEditor) {
                boolean z = ((GoEditor)mainEvent0).getOpenLatestEdit();
                this.b.navigateToEditor(z);
                return Unit.INSTANCE;
            }
            if(mainEvent0 instanceof ShowDialog) {
                String s1 = ((ShowDialog)mainEvent0).getTitle();
                this.b.navigateToOkDialog(s1, ((ShowDialog)mainEvent0).getMessage());
                return Unit.INSTANCE;
            }
            if(mainEvent0 instanceof ShowToast) {
                ToastEventKt.showToast(this.c, ((ShowToastEvent)mainEvent0));
            }
        }
        return Unit.INSTANCE;
    }
}

