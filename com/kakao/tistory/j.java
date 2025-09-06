package com.kakao.tistory;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.kakao.tistory.data.blog.api.BlogService;
import com.kakao.tistory.data.blog.repository.BlogRepositoryImpl;
import com.kakao.tistory.data.blog.repository.BlogRepositoryImpl_Factory;
import com.kakao.tistory.data.home.api.HomeService;
import com.kakao.tistory.data.home.repository.HomeRepositoryImpl;
import com.kakao.tistory.data.home.repository.HomeRepositoryImpl_Factory;
import com.kakao.tistory.data.mapper.AutoSavedMapper;
import com.kakao.tistory.data.preference.AppSessionPreference;
import com.kakao.tistory.data.preference.BlogPreference;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.preference.HomePreference;
import com.kakao.tistory.data.preference.SearchPreference;
import com.kakao.tistory.data.repository.ADIDRepositoryImpl;
import com.kakao.tistory.data.repository.ADIDRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.AccountRepositoryImpl;
import com.kakao.tistory.data.repository.AccountRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.AppInfoRepositoryImpl;
import com.kakao.tistory.data.repository.AppInfoRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.AutoSaveRepositoryImpl;
import com.kakao.tistory.data.repository.BaseRepository_MembersInjector;
import com.kakao.tistory.data.repository.CommentRepositoryImpl;
import com.kakao.tistory.data.repository.CommentRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.DashboardRepositoryImpl;
import com.kakao.tistory.data.repository.DashboardRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.EntryFileRepositoryImpl;
import com.kakao.tistory.data.repository.EntryFileRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.EntryRepositoryImpl;
import com.kakao.tistory.data.repository.EntryRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.FeedRepositoryImpl;
import com.kakao.tistory.data.repository.FeedRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.GrammarRepositoryImpl;
import com.kakao.tistory.data.repository.GrammarRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.GuestbookRepositoryImpl;
import com.kakao.tistory.data.repository.GuestbookRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.IllegalFilmReportRepositoryImpl;
import com.kakao.tistory.data.repository.IllegalFilmReportRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.MemberRepositoryImpl;
import com.kakao.tistory.data.repository.MemberRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.NotificationRepositoryImpl;
import com.kakao.tistory.data.repository.NotificationRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.OldBlogRepositoryImpl;
import com.kakao.tistory.data.repository.OldBlogRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.OldStatisticsRepositoryImpl;
import com.kakao.tistory.data.repository.OldStatisticsRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.PushRepositoryImpl;
import com.kakao.tistory.data.repository.PushRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.SearchRepositoryImpl;
import com.kakao.tistory.data.repository.SearchRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.SecretLabRepositoryImpl;
import com.kakao.tistory.data.repository.SecretLabRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.SessionRepositoryImpl;
import com.kakao.tistory.data.repository.SessionRepositoryImpl_Factory;
import com.kakao.tistory.data.repository.ThrowableRepositoryImpl;
import com.kakao.tistory.data.revenue.api.RevenueService;
import com.kakao.tistory.data.revenue.repository.RevenueVendorRepositoryImpl;
import com.kakao.tistory.data.revenue.repository.RevenueVendorRepositoryImpl_Factory;
import com.kakao.tistory.data.service.AccountService;
import com.kakao.tistory.data.service.AppInfoService;
import com.kakao.tistory.data.service.CommentService;
import com.kakao.tistory.data.service.DashboardService;
import com.kakao.tistory.data.service.EntryService;
import com.kakao.tistory.data.service.FeedService;
import com.kakao.tistory.data.service.GrammarService;
import com.kakao.tistory.data.service.GuestbookService;
import com.kakao.tistory.data.service.IllegalFilmReportService;
import com.kakao.tistory.data.service.MemberService;
import com.kakao.tistory.data.service.NotificationService;
import com.kakao.tistory.data.service.OldBlogService;
import com.kakao.tistory.data.service.OldBlogStatisticsService;
import com.kakao.tistory.data.service.OldEntryStatisticsService;
import com.kakao.tistory.data.service.PushService;
import com.kakao.tistory.data.service.SearchService;
import com.kakao.tistory.data.service.SecretLabService;
import com.kakao.tistory.data.statistics.repository.StatisticsRepositoryImpl;
import com.kakao.tistory.data.statistics.repository.StatisticsRepositoryImpl_Factory;
import com.kakao.tistory.data.statistics.service.BlogStatisticsService;
import com.kakao.tistory.domain.entity.BuildType;
import com.kakao.tistory.domain.repository.ADIDRepository;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import com.kakao.tistory.module.ContextModule_ProvideContentResolverFactory;
import com.kakao.tistory.module.DataStoreModule_ProvideBlogDataStoreFactory;
import com.kakao.tistory.module.DataStoreModule_ProvideHomeDataStoreFactory;
import com.kakao.tistory.module.GradleModule_ProvideBuildTypeFactory;
import com.kakao.tistory.module.PreferenceModule_ProvideAppSessionPreferenceFactory;
import com.kakao.tistory.module.PreferenceModule_ProvideDeviceInfoPreferenceFactory;
import com.kakao.tistory.module.PreferenceModule_ProvideSearchPreferenceFactory;
import com.kakao.tistory.module.RetrofitModule_ProvideBaseUrlFactory;
import com.kakao.tistory.module.RetrofitModule_ProvideHeaderInterceptorFactory;
import com.kakao.tistory.module.RetrofitModule_ProvideLoggingInterceptorFactory;
import com.kakao.tistory.module.RetrofitModule_ProvideOkHttpClientFactory;
import com.kakao.tistory.module.RetrofitModule_ProvideRetrofitFactory;
import com.kakao.tistory.module.RetrofitModule_ProvideSerializationRetrofitFactory;
import com.kakao.tistory.module.ServiceModule_ProvideAccountServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideAppInfoServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideBlogServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideBlogStatisticsServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideCommentServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideDashboardServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideEntryServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideFeedServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideGrammarServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideGuestbookServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideHomeServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideIllegalFilmReportServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideMemberServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideNotificationServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideOldBlogServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideOldBlogStatisticsServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideOldEntryStatisticsServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvidePushServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideRevenueServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideSearchServiceFactory;
import com.kakao.tistory.module.ServiceModule_ProvideSecretLabServiceFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public final class j implements Provider {
    public final k a;
    public final int b;

    public j(k k0, int v) {
        this.a = k0;
        this.b = v;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        k k0 = this.a;
        int v = this.b;
        switch(v) {
            case 0: {
                Context context0 = ApplicationContextModule_ProvideContextFactory.provideContext(k0.a);
                return PreferenceModule_ProvideDeviceInfoPreferenceFactory.provideDeviceInfoPreference(k0.b, context0);
            }
            case 1: {
                AccountRepositoryImpl accountRepositoryImpl0 = AccountRepositoryImpl_Factory.newInstance(((AppSessionPreference)k0.k.get()), ((DeviceInfoPreference)k0.j.get()), ((AccountService)k0.v.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(accountRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return accountRepositoryImpl0;
            }
            case 2: {
                Context context1 = ApplicationContextModule_ProvideContextFactory.provideContext(k0.a);
                return PreferenceModule_ProvideAppSessionPreferenceFactory.provideAppSessionPreference(k0.b, context1);
            }
            case 3: {
                Retrofit retrofit0 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideAccountServiceFactory.provideAccountService(k0.d, retrofit0);
            }
            case 4: {
                DeviceInfoPreference deviceInfoPreference0 = (DeviceInfoPreference)k0.j.get();
                BuildType buildType0 = (BuildType)k0.l.get();
                String s = RetrofitModule_ProvideBaseUrlFactory.provideBaseUrl(k0.e, deviceInfoPreference0, buildType0);
                OkHttpClient okHttpClient0 = (OkHttpClient)k0.t.get();
                return RetrofitModule_ProvideRetrofitFactory.provideRetrofit(k0.e, s, okHttpClient0);
            }
            case 5: {
                return GradleModule_ProvideBuildTypeFactory.provideBuildType(k0.f);
            }
            case 6: {
                Interceptor interceptor0 = (Interceptor)k0.r.get();
                HttpLoggingInterceptor httpLoggingInterceptor0 = (HttpLoggingInterceptor)k0.s.get();
                return RetrofitModule_ProvideOkHttpClientFactory.provideOkHttpClient(k0.e, interceptor0, httpLoggingInterceptor0);
            }
            case 7: {
                return RetrofitModule_ProvideHeaderInterceptorFactory.provideHeaderInterceptor(k0.e, k0.n, k0.q);
            }
            case 8: {
                AccountRepository accountRepository0 = (AccountRepository)k0.m.get();
                return k0.e.provideAccessToken(accountRepository0);
            }
            case 9: {
                ADIDRepository aDIDRepository0 = (ADIDRepository)k0.p.get();
                return k0.e.provideAdInfo(aDIDRepository0);
            }
            case 10: {
                ADIDRepositoryImpl aDIDRepositoryImpl0 = ADIDRepositoryImpl_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(k0.a));
                BaseRepository_MembersInjector.injectThrowableRepository(aDIDRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return aDIDRepositoryImpl0;
            }
            case 11: {
                return new ThrowableRepositoryImpl();
            }
            case 12: {
                return RetrofitModule_ProvideLoggingInterceptorFactory.provideLoggingInterceptor(k0.e);
            }
            case 13: {
                AppInfoRepositoryImpl appInfoRepositoryImpl0 = AppInfoRepositoryImpl_Factory.newInstance(((AppInfoService)k0.w.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(appInfoRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return appInfoRepositoryImpl0;
            }
            case 14: {
                Retrofit retrofit1 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideAppInfoServiceFactory.provideAppInfoService(k0.d, retrofit1);
            }
            case 15: {
                OldBlogRepositoryImpl oldBlogRepositoryImpl0 = OldBlogRepositoryImpl_Factory.newInstance(((OldBlogService)k0.y.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(oldBlogRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return oldBlogRepositoryImpl0;
            }
            case 16: {
                Retrofit retrofit2 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideOldBlogServiceFactory.provideOldBlogService(k0.d, retrofit2);
            }
            case 17: {
                FeedRepositoryImpl feedRepositoryImpl0 = FeedRepositoryImpl_Factory.newInstance(((FeedService)k0.A.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(feedRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return feedRepositoryImpl0;
            }
            case 18: {
                Retrofit retrofit3 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideFeedServiceFactory.provideFeedService(k0.d, retrofit3);
            }
            case 19: {
                StatisticsRepositoryImpl statisticsRepositoryImpl0 = StatisticsRepositoryImpl_Factory.newInstance(((BlogStatisticsService)k0.D.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(statisticsRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return statisticsRepositoryImpl0;
            }
            case 20: {
                Retrofit retrofit4 = (Retrofit)k0.C.get();
                return ServiceModule_ProvideBlogStatisticsServiceFactory.provideBlogStatisticsService(k0.d, retrofit4);
            }
            case 21: {
                DeviceInfoPreference deviceInfoPreference1 = (DeviceInfoPreference)k0.j.get();
                BuildType buildType1 = (BuildType)k0.l.get();
                String s1 = RetrofitModule_ProvideBaseUrlFactory.provideBaseUrl(k0.e, deviceInfoPreference1, buildType1);
                OkHttpClient okHttpClient1 = (OkHttpClient)k0.t.get();
                return RetrofitModule_ProvideSerializationRetrofitFactory.provideSerializationRetrofit(k0.e, s1, okHttpClient1);
            }
            case 22: {
                BlogRepositoryImpl blogRepositoryImpl0 = BlogRepositoryImpl_Factory.newInstance(((BlogService)k0.F.get()), new BlogPreference(((DataStore)k0.G.get())));
                BaseRepository_MembersInjector.injectThrowableRepository(blogRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return blogRepositoryImpl0;
            }
            case 23: {
                Retrofit retrofit5 = (Retrofit)k0.C.get();
                return ServiceModule_ProvideBlogServiceFactory.provideBlogService(k0.d, retrofit5);
            }
            case 24: {
                Context context2 = ApplicationContextModule_ProvideContextFactory.provideContext(k0.a);
                return DataStoreModule_ProvideBlogDataStoreFactory.provideBlogDataStore(k0.g, context2);
            }
            case 25: {
                RevenueVendorRepositoryImpl revenueVendorRepositoryImpl0 = RevenueVendorRepositoryImpl_Factory.newInstance(((RevenueService)k0.I.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(revenueVendorRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return revenueVendorRepositoryImpl0;
            }
            case 26: {
                Retrofit retrofit6 = (Retrofit)k0.C.get();
                return ServiceModule_ProvideRevenueServiceFactory.provideRevenueService(k0.d, retrofit6);
            }
            case 27: {
                EntryRepositoryImpl entryRepositoryImpl0 = EntryRepositoryImpl_Factory.newInstance(((EntryService)k0.K.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(entryRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return entryRepositoryImpl0;
            }
            case 28: {
                Retrofit retrofit7 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideEntryServiceFactory.provideEntryService(k0.d, retrofit7);
            }
            case 29: {
                SessionRepositoryImpl sessionRepositoryImpl0 = SessionRepositoryImpl_Factory.newInstance(((AppSessionPreference)k0.k.get()), ((AccountService)k0.v.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(sessionRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return sessionRepositoryImpl0;
            }
            case 30: {
                EntryService entryService0 = (EntryService)k0.K.get();
                Context context3 = ApplicationContextModule_ProvideContextFactory.provideContext(k0.a);
                EntryFileRepositoryImpl entryFileRepositoryImpl0 = EntryFileRepositoryImpl_Factory.newInstance(entryService0, ContextModule_ProvideContentResolverFactory.provideContentResolver(k0.h, context3));
                BaseRepository_MembersInjector.injectThrowableRepository(entryFileRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return entryFileRepositoryImpl0;
            }
            case 0x1F: {
                return new AutoSaveRepositoryImpl(new AutoSavedMapper());
            }
            case 0x20: {
                GrammarRepositoryImpl grammarRepositoryImpl0 = GrammarRepositoryImpl_Factory.newInstance(((GrammarService)k0.P.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(grammarRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return grammarRepositoryImpl0;
            }
            case 33: {
                Retrofit retrofit8 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideGrammarServiceFactory.provideGrammarService(k0.d, retrofit8);
            }
            case 34: {
                GuestbookRepositoryImpl guestbookRepositoryImpl0 = GuestbookRepositoryImpl_Factory.newInstance(((GuestbookService)k0.R.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(guestbookRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return guestbookRepositoryImpl0;
            }
            case 35: {
                Retrofit retrofit9 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideGuestbookServiceFactory.provideGuestbookService(k0.d, retrofit9);
            }
            case 36: {
                HomeRepositoryImpl homeRepositoryImpl0 = HomeRepositoryImpl_Factory.newInstance(((HomeService)k0.T.get()), new HomePreference(((DataStore)k0.U.get())));
                BaseRepository_MembersInjector.injectThrowableRepository(homeRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return homeRepositoryImpl0;
            }
            case 37: {
                Retrofit retrofit10 = (Retrofit)k0.C.get();
                return ServiceModule_ProvideHomeServiceFactory.provideHomeService(k0.d, retrofit10);
            }
            case 38: {
                Context context4 = ApplicationContextModule_ProvideContextFactory.provideContext(k0.a);
                return DataStoreModule_ProvideHomeDataStoreFactory.provideHomeDataStore(k0.g, context4);
            }
            case 39: {
                MemberRepositoryImpl memberRepositoryImpl0 = MemberRepositoryImpl_Factory.newInstance(((MemberService)k0.W.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(memberRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return memberRepositoryImpl0;
            }
            case 40: {
                Retrofit retrofit11 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideMemberServiceFactory.provideMemberService(k0.d, retrofit11);
            }
            case 41: {
                PushRepositoryImpl pushRepositoryImpl0 = PushRepositoryImpl_Factory.newInstance(((DeviceInfoPreference)k0.j.get()), ((PushService)k0.Y.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(pushRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return pushRepositoryImpl0;
            }
            case 42: {
                Retrofit retrofit12 = (Retrofit)k0.u.get();
                return ServiceModule_ProvidePushServiceFactory.providePushService(k0.d, retrofit12);
            }
            case 43: {
                SearchRepositoryImpl searchRepositoryImpl0 = SearchRepositoryImpl_Factory.newInstance(((SearchPreference)k0.a0.get()), ((SearchService)k0.b0.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(searchRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return searchRepositoryImpl0;
            }
            case 44: {
                Context context5 = ApplicationContextModule_ProvideContextFactory.provideContext(k0.a);
                return PreferenceModule_ProvideSearchPreferenceFactory.provideSearchPreference(k0.b, context5);
            }
            case 45: {
                Retrofit retrofit13 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideSearchServiceFactory.provideSearchService(k0.d, retrofit13);
            }
            case 46: {
                NotificationRepositoryImpl notificationRepositoryImpl0 = NotificationRepositoryImpl_Factory.newInstance(((NotificationService)k0.d0.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(notificationRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return notificationRepositoryImpl0;
            }
            case 0x2F: {
                Retrofit retrofit14 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideNotificationServiceFactory.provideNotificationService(k0.d, retrofit14);
            }
            case 0x30: {
                CommentRepositoryImpl commentRepositoryImpl0 = CommentRepositoryImpl_Factory.newInstance(((CommentService)k0.f0.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(commentRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return commentRepositoryImpl0;
            }
            case 49: {
                Retrofit retrofit15 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideCommentServiceFactory.provideCommentService(k0.d, retrofit15);
            }
            case 50: {
                OldStatisticsRepositoryImpl oldStatisticsRepositoryImpl0 = OldStatisticsRepositoryImpl_Factory.newInstance(((OldBlogStatisticsService)k0.h0.get()), ((OldEntryStatisticsService)k0.i0.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(oldStatisticsRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return oldStatisticsRepositoryImpl0;
            }
            case 51: {
                Retrofit retrofit16 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideOldBlogStatisticsServiceFactory.provideOldBlogStatisticsService(k0.d, retrofit16);
            }
            case 52: {
                Retrofit retrofit17 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideOldEntryStatisticsServiceFactory.provideOldEntryStatisticsService(k0.d, retrofit17);
            }
            case 53: {
                DashboardRepositoryImpl dashboardRepositoryImpl0 = DashboardRepositoryImpl_Factory.newInstance(((DashboardService)k0.k0.get()), ((OldBlogService)k0.y.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(dashboardRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return dashboardRepositoryImpl0;
            }
            case 54: {
                Retrofit retrofit18 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideDashboardServiceFactory.provideDashboardService(k0.d, retrofit18);
            }
            case 55: {
                IllegalFilmReportRepositoryImpl illegalFilmReportRepositoryImpl0 = IllegalFilmReportRepositoryImpl_Factory.newInstance(((IllegalFilmReportService)k0.m0.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(illegalFilmReportRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return illegalFilmReportRepositoryImpl0;
            }
            case 56: {
                Retrofit retrofit19 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideIllegalFilmReportServiceFactory.provideIllegalFilmReportService(k0.d, retrofit19);
            }
            case 57: {
                SecretLabRepositoryImpl secretLabRepositoryImpl0 = SecretLabRepositoryImpl_Factory.newInstance(((SecretLabService)k0.o0.get()));
                BaseRepository_MembersInjector.injectThrowableRepository(secretLabRepositoryImpl0, ((ThrowableRepository)k0.o.get()));
                return secretLabRepositoryImpl0;
            }
            case 58: {
                Retrofit retrofit20 = (Retrofit)k0.u.get();
                return ServiceModule_ProvideSecretLabServiceFactory.provideSecretLabService(k0.d, retrofit20);
            }
            default: {
                throw new AssertionError(v);
            }
        }
    }
}

