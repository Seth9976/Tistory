package com.kakao.tistory;

import com.kakao.tistory.presentation.TistoryMainActivity;
import com.kakao.tistory.presentation.blog.BlogActivity;
import com.kakao.tistory.presentation.view.SplashActivity;
import com.kakao.tistory.presentation.view.accountMigration.AccountMigrationActivity;
import com.kakao.tistory.presentation.view.blog.BlogFollowActivity;
import com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity;
import com.kakao.tistory.presentation.view.comment.entry.PostPinCommentActivity;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookActivity;
import com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookActivity;
import com.kakao.tistory.presentation.view.editor.EditorActivity;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity;
import com.kakao.tistory.presentation.view.exception.TistoryGuideActivity;
import com.kakao.tistory.presentation.view.home.RefererKeywordListActivity;
import com.kakao.tistory.presentation.view.home.RefererLogListActivity;
import com.kakao.tistory.presentation.view.leave.LeaveActivity;
import com.kakao.tistory.presentation.view.leave.LeaveCompleteActivity;
import com.kakao.tistory.presentation.view.login.KakaoLoginActivity;
import com.kakao.tistory.presentation.view.login.TistroyLoginActivity;
import com.kakao.tistory.presentation.view.search.SearchActivity;
import com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity;
import com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity;
import com.kakao.tistory.presentation.view.setting.SettingListActivity;
import com.kakao.tistory.presentation.view.setting.SettingPushActivity;
import com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity;
import com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity;
import com.kakao.tistory.presentation.view.signup.SignUpActivity;
import com.kakao.tistory.presentation.view.statistics.RefererEtcListActivity;
import com.kakao.tistory.presentation.view.statistics.StatisticsActivity;
import com.kakao.tistory.presentation.view.toppost.TopPostListActivity;
import com.kakao.tistory.presentation.view.webview.CommonWebViewActivity;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.internal.SetBuilder;
import java.util.Set;

public final class b extends ActivityC {
    public final k a;
    public final e b;
    public final b c;

    public b(k k0, e e0) {
        this.c = this;
        this.a = k0;
        this.b = e0;
    }

    @Override  // dagger.hilt.android.internal.managers.FragmentComponentManager$FragmentComponentBuilderEntryPoint
    public final FragmentComponentBuilder fragmentComponentBuilder() {
        return new f(this.a, this.b, this.c);
    }

    @Override  // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories$ActivityEntryPoint
    public final InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(this.getViewModelKeys(), new n(this.a, this.b));
    }

    @Override  // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$ActivityCreatorEntryPoint
    public final ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new n(this.a, this.b);
    }

    // 去混淆评级： 额外(1080)
    @Override  // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$ActivityCreatorEntryPoint
    public final Set getViewModelKeys() {
        return SetBuilder.newSetBuilder(54).add("com.kakao.tistory.presentation.viewmodel.AppInfoViewModel").add("com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel").add("com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel").add("com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel").add("com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel").add("com.kakao.tistory.presentation.screen.blog.setting.BlogSettingViewModel").add("com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchViewModel").add("com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel").add("com.kakao.tistory.presentation.screen.blog.BlogViewModel").add("com.kakao.tistory.presentation.viewmodel.CommonWebViewModel").add("com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel").add("com.kakao.tistory.presentation.viewmodel.DefaultBlogViewModel").add("com.kakao.tistory.presentation.viewmodel.DraftViewModel").add("com.kakao.tistory.presentation.viewmodel.EditorTagViewModel").add("com.kakao.tistory.presentation.viewmodel.EditorViewModel").add("com.kakao.tistory.presentation.viewmodel.EntryViewModel").add("com.kakao.tistory.presentation.screen.feed.FeedViewModel").add("com.kakao.tistory.presentation.view.comment.guestbook.GuestbookModifyViewModel").add("com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel").add("com.kakao.tistory.presentation.screen.home.HomeViewModel").add("com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel").add("com.kakao.tistory.presentation.viewmodel.LeaveViewModel").add("com.kakao.tistory.presentation.main.MainAppViewModel").add("com.kakao.tistory.presentation.viewmodel.MigrationViewModel").add("com.kakao.tistory.presentation.screen.notification.NotificationViewModel").add("com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookModifyViewModel").add("com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel").add("com.kakao.tistory.presentation.view.comment.entry.PostCommentModifyViewModel").add("com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel").add("com.kakao.tistory.presentation.view.comment.entry.PostPinCommentModifyViewModel").add("com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel").add("com.kakao.tistory.presentation.viewmodel.ProtectedEntryCheckViewModel").add("com.kakao.tistory.presentation.viewmodel.PushViewModel").add("com.kakao.tistory.presentation.viewmodel.RefererEtcViewModel").add("com.kakao.tistory.presentation.viewmodel.RefererKeywordViewModel").add("com.kakao.tistory.presentation.viewmodel.RefererLogViewModel").add("com.kakao.tistory.presentation.viewmodel.ReportViewModel").add("com.kakao.tistory.presentation.screen.revenue.RevenueViewModel").add("com.kakao.tistory.presentation.viewmodel.SavedStateViewModel").add("com.kakao.tistory.presentation.viewmodel.SearchResultViewModel").add("com.kakao.tistory.presentation.viewmodel.SearchViewModel").add("com.kakao.tistory.presentation.viewmodel.SecretLabViewModel").add("com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel").add("com.kakao.tistory.presentation.viewmodel.SettingViewModel").add("com.kakao.tistory.presentation.viewmodel.SignUpViewModel").add("com.kakao.tistory.presentation.viewmodel.SplashViewModel").add("com.kakao.tistory.presentation.viewmodel.StatisticsViewModel").add("com.kakao.tistory.presentation.viewmodel.ThrowableViewModel").add("com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel").add("com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel").add("com.kakao.tistory.presentation.TistoryMainViewModel").add("com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel").add("com.kakao.tistory.presentation.viewmodel.TopPostViewModel").add("com.kakao.tistory.presentation.screen.revenue.vendorswitch.VendorSwitchViewModel").build();
    }

    @Override  // com.kakao.tistory.presentation.view.accountMigration.AccountMigrationActivity_GeneratedInjector
    public final void injectAccountMigrationActivity(AccountMigrationActivity accountMigrationActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.blog.BlogActivity_GeneratedInjector
    public final void injectBlogActivity(BlogActivity blogActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.blog.BlogFollowActivity_GeneratedInjector
    public final void injectBlogFollowActivity(BlogFollowActivity blogFollowActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.webview.CommonWebViewActivity_GeneratedInjector
    public final void injectCommonWebViewActivity(CommonWebViewActivity commonWebViewActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.editor.EditorActivity_GeneratedInjector
    public final void injectEditorActivity(EditorActivity editorActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.entry.EntryViewActivity_GeneratedInjector
    public final void injectEntryViewActivity(EntryViewActivity entryViewActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookActivity_GeneratedInjector
    public final void injectGuestbookActivity(GuestbookActivity guestbookActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.login.KakaoLoginActivity_GeneratedInjector
    public final void injectKakaoLoginActivity(KakaoLoginActivity kakaoLoginActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.leave.LeaveActivity_GeneratedInjector
    public final void injectLeaveActivity(LeaveActivity leaveActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.leave.LeaveCompleteActivity_GeneratedInjector
    public final void injectLeaveCompleteActivity(LeaveCompleteActivity leaveCompleteActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookActivity_GeneratedInjector
    public final void injectPinGuestbookActivity(PinGuestbookActivity pinGuestbookActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity_GeneratedInjector
    public final void injectPostCommentActivity(PostCommentActivity postCommentActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostPinCommentActivity_GeneratedInjector
    public final void injectPostPinCommentActivity(PostPinCommentActivity postPinCommentActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.statistics.RefererEtcListActivity_GeneratedInjector
    public final void injectRefererEtcListActivity(RefererEtcListActivity refererEtcListActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.home.RefererKeywordListActivity_GeneratedInjector
    public final void injectRefererKeywordListActivity(RefererKeywordListActivity refererKeywordListActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.home.RefererLogListActivity_GeneratedInjector
    public final void injectRefererLogListActivity(RefererLogListActivity refererLogListActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.search.SearchActivity_GeneratedInjector
    public final void injectSearchActivity(SearchActivity searchActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity_GeneratedInjector
    public final void injectSecretLabActivity(SecretLabActivity secretLabActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity_GeneratedInjector
    public final void injectSettingAppInfoActivity(SettingAppInfoActivity settingAppInfoActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity_GeneratedInjector
    public final void injectSettingDefaultBlogActivity(SettingDefaultBlogActivity settingDefaultBlogActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.setting.SettingListActivity_GeneratedInjector
    public final void injectSettingListActivity(SettingListActivity settingListActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity_GeneratedInjector
    public final void injectSettingNoticeListActivity(SettingNoticeListActivity settingNoticeListActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.setting.SettingPushActivity_GeneratedInjector
    public final void injectSettingPushActivity(SettingPushActivity settingPushActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.signup.SignUpActivity_GeneratedInjector
    public final void injectSignUpActivity(SignUpActivity signUpActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.SplashActivity_GeneratedInjector
    public final void injectSplashActivity(SplashActivity splashActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.statistics.StatisticsActivity_GeneratedInjector
    public final void injectStatisticsActivity(StatisticsActivity statisticsActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.exception.TistoryGuideActivity_GeneratedInjector
    public final void injectTistoryGuideActivity(TistoryGuideActivity tistoryGuideActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.TistoryMainActivity_GeneratedInjector
    public final void injectTistoryMainActivity(TistoryMainActivity tistoryMainActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.login.TistroyLoginActivity_GeneratedInjector
    public final void injectTistroyLoginActivity(TistroyLoginActivity tistroyLoginActivity0) {
    }

    @Override  // com.kakao.tistory.presentation.view.toppost.TopPostListActivity_GeneratedInjector
    public final void injectTopPostListActivity(TopPostListActivity topPostListActivity0) {
    }

    @Override  // dagger.hilt.android.internal.managers.ViewComponentManager$ViewComponentBuilderEntryPoint
    public final ViewComponentBuilder viewComponentBuilder() {
        return new l();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

