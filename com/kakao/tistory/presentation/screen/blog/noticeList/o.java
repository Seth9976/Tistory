package com.kakao.tistory.presentation.screen.blog.noticeList;

import android.app.Activity;
import android.content.Context;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.common.event.ToastEventKt;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.Finish;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.GoEditor;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.GoNotice;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.GoStatistics;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.ShowToastBarDialog;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent;
import com.kakao.tistory.presentation.view.common.dialog.ToastBarDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class o extends SuspendLambda implements Function2 {
    public Object a;
    public final NavActions b;
    public final Context c;
    public final Activity d;

    public o(NavActions navActions0, Context context0, Activity activity0, Continuation continuation0) {
        this.b = navActions0;
        this.c = context0;
        this.d = activity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new o(this.b, this.c, this.d, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o)this.create(((BlogNoticeListEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        BlogNoticeListEvent blogNoticeListEvent0 = (BlogNoticeListEvent)this.a;
        if(Intrinsics.areEqual(blogNoticeListEvent0, Finish.INSTANCE)) {
            this.b.getFinish().invoke();
            return Unit.INSTANCE;
        }
        if(blogNoticeListEvent0 instanceof GoNotice) {
            String s = ((GoNotice)blogNoticeListEvent0).getBlogName();
            Long long0 = Boxing.boxLong(((GoNotice)blogNoticeListEvent0).getNoticeId());
            this.b.getGoEntry().invoke(s, long0);
            return Unit.INSTANCE;
        }
        if(blogNoticeListEvent0 instanceof GoStatistics) {
            String s1 = ((GoStatistics)blogNoticeListEvent0).getBlogName();
            Long long1 = Boxing.boxLong(((GoStatistics)blogNoticeListEvent0).getId());
            String s2 = ((GoStatistics)blogNoticeListEvent0).getTitle();
            this.b.getGoEntryStatistics().invoke(s1, long1, s2);
            return Unit.INSTANCE;
        }
        if(blogNoticeListEvent0 instanceof GoEditor) {
            String s3 = ((GoEditor)blogNoticeListEvent0).getBlogName();
            Long long2 = Boxing.boxLong(((GoEditor)blogNoticeListEvent0).getId());
            this.b.getGoEntryEditor().invoke(s3, long2);
            return Unit.INSTANCE;
        }
        if(blogNoticeListEvent0 instanceof ShowToast) {
            ToastEventKt.showToast(this.c, ((ShowToastEvent)blogNoticeListEvent0));
            return Unit.INSTANCE;
        }
        if(blogNoticeListEvent0 instanceof ShowToastBarDialog) {
            Activity activity0 = this.d;
            if(activity0 != null) {
                ToastBarDialog.showTop$default(new ToastBarDialog(activity0, ((ShowToastBarDialog)blogNoticeListEvent0).getMessageRes()), false, 1, null);
            }
        }
        return Unit.INSTANCE;
    }
}

