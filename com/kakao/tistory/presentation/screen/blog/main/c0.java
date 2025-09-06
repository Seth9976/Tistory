package com.kakao.tistory.presentation.screen.blog.main;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.IllegalFilmType;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.common.event.ToastEventKt;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.CopyPassword;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.Finish;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoAuthWeb;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoBlogSetting;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntry;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntryEditor;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntryStatistics;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoFollowerList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoFollowingList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoGuestBook;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoNoticeList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoRefererKeyword;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoRefererLog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoRevenue;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoSearch;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoShare;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoStoryCreator;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoTopEntryList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoTrend;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoWeb;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowBlogSwitchBottomSheet;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowReportBottomSheet;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowToastBarDialog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment.Companion;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import com.kakao.tistory.presentation.view.common.dialog.ToastBarDialog;
import com.kakao.tistory.presentation.viewmodel.BlogTopReportData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class c0 extends SuspendLambda implements Function2 {
    public Object a;
    public final NavActions b;
    public final BlogNestedNavActions c;
    public final ClipboardManager d;
    public final Context e;
    public final ManagedActivityResultLauncher f;
    public final Activity g;

    public c0(NavActions navActions0, BlogNestedNavActions blogNestedNavActions0, ClipboardManager clipboardManager0, Context context0, ManagedActivityResultLauncher managedActivityResultLauncher0, Activity activity0, Continuation continuation0) {
        this.b = navActions0;
        this.c = blogNestedNavActions0;
        this.d = clipboardManager0;
        this.e = context0;
        this.f = managedActivityResultLauncher0;
        this.g = activity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c0(this.b, this.c, this.d, this.e, this.f, this.g, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c0)this.create(((BlogMainEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FragmentActivity fragmentActivity0 = null;
        ResultKt.throwOnFailure(object0);
        BlogMainEvent blogMainEvent0 = (BlogMainEvent)this.a;
        if(blogMainEvent0 instanceof GoStoryCreator) {
            this.b.getGoStoryCreator().invoke(((GoStoryCreator)blogMainEvent0).getLink());
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoFollowerList) {
            this.b.getGoFollowerList().invoke(((GoFollowerList)blogMainEvent0).getBlogName());
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoFollowingList) {
            this.b.getGoFollowingList().invoke(((GoFollowingList)blogMainEvent0).getBlogName());
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(blogMainEvent0, GoBlogSetting.INSTANCE)) {
            this.c.getGoSetting().invoke();
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoGuestBook) {
            this.b.getGoGuestbook().invoke(((GoGuestBook)blogMainEvent0).getGuestbookExtra());
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoShare) {
            this.b.getGoShare().invoke(((GoShare)blogMainEvent0).getTitle(), ((GoShare)blogMainEvent0).getUrl());
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoTopEntryList) {
            this.b.getGoTopEntryList().invoke(((GoTopEntryList)blogMainEvent0).getBlogName(), Boxing.boxBoolean(((GoTopEntryList)blogMainEvent0).isMine()));
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoNoticeList) {
            this.c.getGoNoticeList().invoke();
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoEntry) {
            this.b.getGoEntry().invoke(((GoEntry)blogMainEvent0).getBlogName(), Boxing.boxLong(((GoEntry)blogMainEvent0).getEntryId()));
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoEntryStatistics) {
            this.b.getGoEntryStatistics().invoke(((GoEntryStatistics)blogMainEvent0).getBlogName(), Boxing.boxLong(((GoEntryStatistics)blogMainEvent0).getEntryId()), ((GoEntryStatistics)blogMainEvent0).getTitle());
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof GoEntryEditor) {
            this.b.getGoEntryEditor().invoke(((GoEntryEditor)blogMainEvent0).getBlogName(), Boxing.boxLong(((GoEntryEditor)blogMainEvent0).getEntryId()));
            return Unit.INSTANCE;
        }
        if(blogMainEvent0 instanceof CopyPassword) {
            this.d.getNativeClipboard().setPrimaryClip(ClipData.newPlainText("text", ((CopyPassword)blogMainEvent0).getPassword()));
            if(Build.VERSION.SDK_INT < 33) {
                String s = this.e.getString(string.label_blog_toast_copy_password);
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                ToastUtils.show$default(ToastUtils.INSTANCE, this.e, s, 0, 1, 4, null);
                return Unit.INSTANCE;
            }
        }
        else {
            if(blogMainEvent0 instanceof GoTrend) {
                this.b.getGoTrend().invoke(((GoTrend)blogMainEvent0).getBlogName());
                return Unit.INSTANCE;
            }
            if(blogMainEvent0 instanceof GoRefererLog) {
                this.b.getGoRefererLog().invoke(((GoRefererLog)blogMainEvent0).getBlogName());
                return Unit.INSTANCE;
            }
            if(blogMainEvent0 instanceof GoRefererKeyword) {
                this.b.getGoRefererKeyword().invoke(((GoRefererKeyword)blogMainEvent0).getList());
                return Unit.INSTANCE;
            }
            if(Intrinsics.areEqual(blogMainEvent0, GoRevenue.INSTANCE)) {
                this.c.getGoRevenue().invoke();
                return Unit.INSTANCE;
            }
            if(blogMainEvent0 instanceof GoWeb) {
                this.b.getGoWeb().invoke(((GoWeb)blogMainEvent0).getUrl());
                return Unit.INSTANCE;
            }
            if(blogMainEvent0 instanceof GoAuthWeb) {
                String s1 = ((GoAuthWeb)blogMainEvent0).getUrl();
                NavigatorExtensionKt.goToWebView$default(this.f, this.e, s1, false, false, false, false, 60, null);
                return Unit.INSTANCE;
            }
            if(blogMainEvent0 instanceof GoSearch) {
                this.b.getGoSearch().invoke(((GoSearch)blogMainEvent0).getBlogName());
                return Unit.INSTANCE;
            }
            if(Intrinsics.areEqual(blogMainEvent0, ShowBlogSwitchBottomSheet.INSTANCE)) {
                this.b.getShowBlogSwitchBottomSheet().invoke();
                return Unit.INSTANCE;
            }
            if(blogMainEvent0 instanceof ShowReportBottomSheet) {
                Context context0 = this.e;
                if(context0 instanceof FragmentActivity) {
                    fragmentActivity0 = (FragmentActivity)context0;
                }
                if(fragmentActivity0 != null) {
                    String s2 = ((ShowReportBottomSheet)blogMainEvent0).getBlogName();
                    Long long0 = Boxing.boxLong(((ShowReportBottomSheet)blogMainEvent0).getBlogId());
                    BlogTopReportData blogTopReportData0 = ((ShowReportBottomSheet)blogMainEvent0).getBlogReportData();
                    Companion.newInstance$default(ReportDialogFragment.Companion, "블로그", "블로그탑", s2, long0, null, null, null, null, IllegalFilmType.PROFILE_IMAGE, null, blogTopReportData0, 0x2F0, null).show(fragmentActivity0.getSupportFragmentManager(), "ReportDialogFragment");
                    return Unit.INSTANCE;
                }
            }
            else {
                if(blogMainEvent0 instanceof ShowToast) {
                    ToastEventKt.showToast(this.e, ((ShowToastEvent)blogMainEvent0));
                    return Unit.INSTANCE;
                }
                if(blogMainEvent0 instanceof ShowToastBarDialog) {
                    Activity activity0 = this.g;
                    if(activity0 != null) {
                        ToastBarDialog.showTop$default(new ToastBarDialog(activity0, ((ShowToastBarDialog)blogMainEvent0).getMessageRes()), false, 1, null);
                        return Unit.INSTANCE;
                    }
                }
                else if(Intrinsics.areEqual(blogMainEvent0, Finish.INSTANCE)) {
                    this.b.getFinish().invoke();
                }
            }
        }
        return Unit.INSTANCE;
    }
}

