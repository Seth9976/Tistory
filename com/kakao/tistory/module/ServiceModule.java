package com.kakao.tistory.module;

import a5.b;
import com.kakao.tistory.data.blog.api.BlogService;
import com.kakao.tistory.data.home.api.HomeService;
import com.kakao.tistory.data.revenue.api.RevenueService;
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
import com.kakao.tistory.data.statistics.service.BlogStatisticsService;
import com.kakao.tistory.data.statistics.service.EntryStatisticsService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010\t\u001A\u00020\n2\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010\u000B\u001A\u00020\f2\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010\u0013\u001A\u00020\u00142\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010\u001B\u001A\u00020\u001C2\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\u001F\u001A\u00020 2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010!\u001A\u00020\"2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010#\u001A\u00020$2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010%\u001A\u00020&2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010\'\u001A\u00020(2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010)\u001A\u00020*2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010+\u001A\u00020,2\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010-\u001A\u00020.2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0010\u0010/\u001A\u0002002\u0006\u0010\u0005\u001A\u00020\u0006H\u0007\u00A8\u00061"}, d2 = {"Lcom/kakao/tistory/module/ServiceModule;", "", "()V", "provideAccountService", "Lcom/kakao/tistory/data/service/AccountService;", "retrofit", "Lretrofit2/Retrofit;", "provideAppInfoService", "Lcom/kakao/tistory/data/service/AppInfoService;", "provideBlogService", "Lcom/kakao/tistory/data/blog/api/BlogService;", "provideBlogStatisticsService", "Lcom/kakao/tistory/data/statistics/service/BlogStatisticsService;", "provideCommentService", "Lcom/kakao/tistory/data/service/CommentService;", "provideDashboardService", "Lcom/kakao/tistory/data/service/DashboardService;", "provideEntryService", "Lcom/kakao/tistory/data/service/EntryService;", "provideEntryStatisticsService", "Lcom/kakao/tistory/data/statistics/service/EntryStatisticsService;", "provideFeedService", "Lcom/kakao/tistory/data/service/FeedService;", "provideGrammarService", "Lcom/kakao/tistory/data/service/GrammarService;", "provideGuestbookService", "Lcom/kakao/tistory/data/service/GuestbookService;", "provideHomeService", "Lcom/kakao/tistory/data/home/api/HomeService;", "provideIllegalFilmReportService", "Lcom/kakao/tistory/data/service/IllegalFilmReportService;", "provideMemberService", "Lcom/kakao/tistory/data/service/MemberService;", "provideNotificationService", "Lcom/kakao/tistory/data/service/NotificationService;", "provideOldBlogService", "Lcom/kakao/tistory/data/service/OldBlogService;", "provideOldBlogStatisticsService", "Lcom/kakao/tistory/data/service/OldBlogStatisticsService;", "provideOldEntryStatisticsService", "Lcom/kakao/tistory/data/service/OldEntryStatisticsService;", "providePushService", "Lcom/kakao/tistory/data/service/PushService;", "provideRevenueService", "Lcom/kakao/tistory/data/revenue/api/RevenueService;", "provideSearchService", "Lcom/kakao/tistory/data/service/SearchService;", "provideSecretLabService", "Lcom/kakao/tistory/data/service/SecretLabService;", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ServiceModule {
    @Provides
    @Singleton
    @NotNull
    public final AccountService provideAccountService(@NotNull Retrofit retrofit0) {
        return (AccountService)b.d(retrofit0, "retrofit", AccountService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final AppInfoService provideAppInfoService(@NotNull Retrofit retrofit0) {
        return (AppInfoService)b.d(retrofit0, "retrofit", AppInfoService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final BlogService provideBlogService(@SerializationRetrofit @NotNull Retrofit retrofit0) {
        return (BlogService)b.d(retrofit0, "retrofit", BlogService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final BlogStatisticsService provideBlogStatisticsService(@SerializationRetrofit @NotNull Retrofit retrofit0) {
        return (BlogStatisticsService)b.d(retrofit0, "retrofit", BlogStatisticsService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final CommentService provideCommentService(@NotNull Retrofit retrofit0) {
        return (CommentService)b.d(retrofit0, "retrofit", CommentService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final DashboardService provideDashboardService(@NotNull Retrofit retrofit0) {
        return (DashboardService)b.d(retrofit0, "retrofit", DashboardService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final EntryService provideEntryService(@NotNull Retrofit retrofit0) {
        return (EntryService)b.d(retrofit0, "retrofit", EntryService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final EntryStatisticsService provideEntryStatisticsService(@SerializationRetrofit @NotNull Retrofit retrofit0) {
        return (EntryStatisticsService)b.d(retrofit0, "retrofit", EntryStatisticsService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final FeedService provideFeedService(@NotNull Retrofit retrofit0) {
        return (FeedService)b.d(retrofit0, "retrofit", FeedService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final GrammarService provideGrammarService(@NotNull Retrofit retrofit0) {
        return (GrammarService)b.d(retrofit0, "retrofit", GrammarService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final GuestbookService provideGuestbookService(@NotNull Retrofit retrofit0) {
        return (GuestbookService)b.d(retrofit0, "retrofit", GuestbookService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final HomeService provideHomeService(@SerializationRetrofit @NotNull Retrofit retrofit0) {
        return (HomeService)b.d(retrofit0, "retrofit", HomeService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final IllegalFilmReportService provideIllegalFilmReportService(@NotNull Retrofit retrofit0) {
        return (IllegalFilmReportService)b.d(retrofit0, "retrofit", IllegalFilmReportService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final MemberService provideMemberService(@NotNull Retrofit retrofit0) {
        return (MemberService)b.d(retrofit0, "retrofit", MemberService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final NotificationService provideNotificationService(@NotNull Retrofit retrofit0) {
        return (NotificationService)b.d(retrofit0, "retrofit", NotificationService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final OldBlogService provideOldBlogService(@NotNull Retrofit retrofit0) {
        return (OldBlogService)b.d(retrofit0, "retrofit", OldBlogService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final OldBlogStatisticsService provideOldBlogStatisticsService(@NotNull Retrofit retrofit0) {
        return (OldBlogStatisticsService)b.d(retrofit0, "retrofit", OldBlogStatisticsService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final OldEntryStatisticsService provideOldEntryStatisticsService(@NotNull Retrofit retrofit0) {
        return (OldEntryStatisticsService)b.d(retrofit0, "retrofit", OldEntryStatisticsService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final PushService providePushService(@NotNull Retrofit retrofit0) {
        return (PushService)b.d(retrofit0, "retrofit", PushService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final RevenueService provideRevenueService(@SerializationRetrofit @NotNull Retrofit retrofit0) {
        return (RevenueService)b.d(retrofit0, "retrofit", RevenueService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final SearchService provideSearchService(@NotNull Retrofit retrofit0) {
        return (SearchService)b.d(retrofit0, "retrofit", SearchService.class, "create(...)");
    }

    @Provides
    @Singleton
    @NotNull
    public final SecretLabService provideSecretLabService(@NotNull Retrofit retrofit0) {
        return (SecretLabService)b.d(retrofit0, "retrofit", SecretLabService.class, "create(...)");
    }
}

