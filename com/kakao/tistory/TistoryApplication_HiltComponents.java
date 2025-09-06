package com.kakao.tistory;

import com.kakao.tistory.module.ContextModule;
import com.kakao.tistory.module.DataStoreModule;
import com.kakao.tistory.module.GradleModule;
import com.kakao.tistory.module.PreferenceModule;
import com.kakao.tistory.module.PushBuilderModule;
import com.kakao.tistory.module.RepositoryModule;
import com.kakao.tistory.module.RetrofitModule;
import com.kakao.tistory.module.ServiceModule;
import com.kakao.tistory.presentation.TistoryMainActivity_GeneratedInjector;
import com.kakao.tistory.presentation.blog.BlogActivity_GeneratedInjector;
import com.kakao.tistory.presentation.common.push.PushMessagingService_GeneratedInjector;
import com.kakao.tistory.presentation.view.SplashActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.accountMigration.AccountMigrationActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.accountMigration.LoginFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.accountMigration.MigrationFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.accountMigration.UsedAccountFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.blog.BlogFollowActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.blog.BlogFollowerFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.blog.BlogFollowingFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.entry.PostCommentFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.entry.PostPinCommentActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.entry.PostPinCommentFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.editor.EditorActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.editor.EditorFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.editor.EditorSettingFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.editor.EditorTagFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.exception.TistoryGuideActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.home.RefererKeywordListActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.home.RefererLogListActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.leave.LeaveActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.leave.LeaveCompleteActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.login.KakaoLoginActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.login.TistroyLoginActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.search.SearchActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.setting.SettingListActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.setting.SettingPushActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.signup.SignUpActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.statistics.RefererEtcListActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.statistics.RefererEtcListFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.statistics.StatisticsActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.statistics.StatisticsFragment_GeneratedInjector;
import com.kakao.tistory.presentation.view.toppost.TopPostListActivity_GeneratedInjector;
import com.kakao.tistory.presentation.view.webview.CommonWebViewActivity_GeneratedInjector;
import com.kakao.tistory.presentation.viewmodel.AppInfoViewModel_HiltModules.BindsModule;
import com.kakao.tistory.presentation.viewmodel.AppInfoViewModel_HiltModules.KeyModule;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent.Builder;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

public final class TistoryApplication_HiltComponents {
    @Subcomponent(modules = {HiltWrapper_ActivityModule.class, HiltWrapper_DefaultViewModelFactories_ActivityModule.class, FragmentCBuilderModule.class, ViewCBuilderModule.class})
    @ActivityScoped
    public static abstract class ActivityC implements TistoryMainActivity_GeneratedInjector, BlogActivity_GeneratedInjector, SplashActivity_GeneratedInjector, AccountMigrationActivity_GeneratedInjector, BlogFollowActivity_GeneratedInjector, PostCommentActivity_GeneratedInjector, PostPinCommentActivity_GeneratedInjector, GuestbookActivity_GeneratedInjector, PinGuestbookActivity_GeneratedInjector, EditorActivity_GeneratedInjector, EntryViewActivity_GeneratedInjector, TistoryGuideActivity_GeneratedInjector, RefererKeywordListActivity_GeneratedInjector, RefererLogListActivity_GeneratedInjector, LeaveActivity_GeneratedInjector, LeaveCompleteActivity_GeneratedInjector, KakaoLoginActivity_GeneratedInjector, TistroyLoginActivity_GeneratedInjector, SearchActivity_GeneratedInjector, SettingAppInfoActivity_GeneratedInjector, SettingDefaultBlogActivity_GeneratedInjector, SettingListActivity_GeneratedInjector, SettingPushActivity_GeneratedInjector, SettingNoticeListActivity_GeneratedInjector, SecretLabActivity_GeneratedInjector, SignUpActivity_GeneratedInjector, RefererEtcListActivity_GeneratedInjector, StatisticsActivity_GeneratedInjector, TopPostListActivity_GeneratedInjector, CommonWebViewActivity_GeneratedInjector, ActivityComponent, ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentBuilderEntryPoint, ViewComponentBuilderEntryPoint, GeneratedComponent {
        @Builder
        interface com.kakao.tistory.TistoryApplication_HiltComponents.ActivityC.Builder extends ActivityComponentBuilder {
        }

    }

    @Module(subcomponents = {ActivityC.class})
    @DisableInstallInCheck
    interface ActivityCBuilderModule {
        @Binds
        ActivityComponentBuilder bind(com.kakao.tistory.TistoryApplication_HiltComponents.ActivityC.Builder arg1);
    }

    @Subcomponent(modules = {KeyModule.class, com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.blog.setting.BlogSettingViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.blog.BlogViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.CommonWebViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.DefaultBlogViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.DraftViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.EditorTagViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.EditorViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.EntryViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.feed.FeedViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.guestbook.GuestbookModifyViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel_HiltModules.KeyModule.class, HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class, HiltWrapper_SavedStateHandleModule.class, com.kakao.tistory.presentation.screen.home.HomeViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.LeaveViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.main.MainAppViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.MigrationViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.notification.NotificationViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookModifyViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.entry.PostCommentModifyViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.entry.PostPinCommentModifyViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.ProtectedEntryCheckViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.PushViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.RefererEtcViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.RefererKeywordViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.RefererLogViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.ReportViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.revenue.RevenueViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.SavedStateViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.SearchResultViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.SearchViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.SecretLabViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.SettingViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.SignUpViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.SplashViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.StatisticsViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.ThrowableViewModel_HiltModules.KeyModule.class, ActivityCBuilderModule.class, ViewModelCBuilderModule.class, com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.TistoryMainViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.viewmodel.TopPostViewModel_HiltModules.KeyModule.class, com.kakao.tistory.presentation.screen.revenue.vendorswitch.VendorSwitchViewModel_HiltModules.KeyModule.class})
    @ActivityRetainedScoped
    public static abstract class ActivityRetainedC implements ActivityRetainedComponent, ActivityComponentBuilderEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint, GeneratedComponent {
        @Builder
        interface com.kakao.tistory.TistoryApplication_HiltComponents.ActivityRetainedC.Builder extends ActivityRetainedComponentBuilder {
        }

    }

    @Module(subcomponents = {ActivityRetainedC.class})
    @DisableInstallInCheck
    interface ActivityRetainedCBuilderModule {
        @Binds
        ActivityRetainedComponentBuilder bind(com.kakao.tistory.TistoryApplication_HiltComponents.ActivityRetainedC.Builder arg1);
    }

    @Subcomponent(modules = {ViewWithFragmentCBuilderModule.class})
    @FragmentScoped
    public static abstract class FragmentC implements LoginFragment_GeneratedInjector, MigrationFragment_GeneratedInjector, UsedAccountFragment_GeneratedInjector, BlogFollowerFragment_GeneratedInjector, BlogFollowingFragment_GeneratedInjector, BlogCategoryDialogFragment_GeneratedInjector, DaumCategoryDialogFragment_GeneratedInjector, ReportDialogFragment_GeneratedInjector, PostCommentFragment_GeneratedInjector, PostPinCommentFragment_GeneratedInjector, GuestbookFragment_GeneratedInjector, PinGuestbookFragment_GeneratedInjector, EntryPasswordDialogFragment_GeneratedInjector, EditorFragment_GeneratedInjector, EditorSettingFragment_GeneratedInjector, EditorTagFragment_GeneratedInjector, RefererEtcListFragment_GeneratedInjector, StatisticsFragment_GeneratedInjector, FragmentComponent, FragmentEntryPoint, ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {
        @Builder
        interface com.kakao.tistory.TistoryApplication_HiltComponents.FragmentC.Builder extends FragmentComponentBuilder {
        }

    }

    @Module(subcomponents = {FragmentC.class})
    @DisableInstallInCheck
    interface FragmentCBuilderModule {
        @Binds
        FragmentComponentBuilder bind(com.kakao.tistory.TistoryApplication_HiltComponents.FragmentC.Builder arg1);
    }

    @Subcomponent
    @ServiceScoped
    public static abstract class ServiceC implements PushMessagingService_GeneratedInjector, ServiceComponent, GeneratedComponent {
        @Builder
        interface com.kakao.tistory.TistoryApplication_HiltComponents.ServiceC.Builder extends ServiceComponentBuilder {
        }

    }

    @Module(subcomponents = {ServiceC.class})
    @DisableInstallInCheck
    interface ServiceCBuilderModule {
        @Binds
        ServiceComponentBuilder bind(com.kakao.tistory.TistoryApplication_HiltComponents.ServiceC.Builder arg1);
    }

    @Component(modules = {ApplicationContextModule.class, ContextModule.class, DataStoreModule.class, GradleModule.class, HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class, PreferenceModule.class, PushBuilderModule.class, RepositoryModule.class, RetrofitModule.class, ServiceModule.class, ActivityRetainedCBuilderModule.class, ServiceCBuilderModule.class})
    @Singleton
    public static abstract class SingletonC implements TistoryApplication_GeneratedInjector, FragmentGetContextFixEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint, ServiceComponentBuilderEntryPoint, SingletonComponent, GeneratedComponent {
    }

    @Subcomponent
    @ViewScoped
    public static abstract class ViewC implements ViewComponent, GeneratedComponent {
        @Builder
        interface com.kakao.tistory.TistoryApplication_HiltComponents.ViewC.Builder extends ViewComponentBuilder {
        }

    }

    @Module(subcomponents = {ViewC.class})
    @DisableInstallInCheck
    interface ViewCBuilderModule {
        @Binds
        ViewComponentBuilder bind(com.kakao.tistory.TistoryApplication_HiltComponents.ViewC.Builder arg1);
    }

    @Subcomponent(modules = {BindsModule.class, com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.blog.setting.BlogSettingViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.blog.BlogViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.CommonWebViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.DefaultBlogViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.DraftViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.EditorTagViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.EditorViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.EntryViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.feed.FeedViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.guestbook.GuestbookModifyViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel_HiltModules.BindsModule.class, HiltWrapper_HiltViewModelFactory_ViewModelModule.class, com.kakao.tistory.presentation.screen.home.HomeViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.LeaveViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.main.MainAppViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.MigrationViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.notification.NotificationViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookModifyViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.entry.PostCommentModifyViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.entry.PostPinCommentModifyViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.ProtectedEntryCheckViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.PushViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.RefererEtcViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.RefererKeywordViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.RefererLogViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.ReportViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.revenue.RevenueViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.SavedStateViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.SearchResultViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.SearchViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.SecretLabViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.SettingViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.SignUpViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.SplashViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.StatisticsViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.ThrowableViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.TistoryMainViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.viewmodel.TopPostViewModel_HiltModules.BindsModule.class, com.kakao.tistory.presentation.screen.revenue.vendorswitch.VendorSwitchViewModel_HiltModules.BindsModule.class})
    @ViewModelScoped
    public static abstract class ViewModelC implements ViewModelComponent, ViewModelFactoriesEntryPoint, GeneratedComponent {
        @Builder
        interface com.kakao.tistory.TistoryApplication_HiltComponents.ViewModelC.Builder extends ViewModelComponentBuilder {
        }

    }

    @Module(subcomponents = {ViewModelC.class})
    @DisableInstallInCheck
    interface ViewModelCBuilderModule {
        @Binds
        ViewModelComponentBuilder bind(com.kakao.tistory.TistoryApplication_HiltComponents.ViewModelC.Builder arg1);
    }

    @Subcomponent
    @ViewScoped
    public static abstract class ViewWithFragmentC implements ViewWithFragmentComponent, GeneratedComponent {
        @Builder
        interface com.kakao.tistory.TistoryApplication_HiltComponents.ViewWithFragmentC.Builder extends ViewWithFragmentComponentBuilder {
        }

    }

    @Module(subcomponents = {ViewWithFragmentC.class})
    @DisableInstallInCheck
    interface ViewWithFragmentCBuilderModule {
        @Binds
        ViewWithFragmentComponentBuilder bind(com.kakao.tistory.TistoryApplication_HiltComponents.ViewWithFragmentC.Builder arg1);
    }

}

