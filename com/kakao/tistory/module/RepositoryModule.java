package com.kakao.tistory.module;

import com.kakao.tistory.data.blog.repository.BlogRepositoryImpl;
import com.kakao.tistory.data.home.repository.HomeRepositoryImpl;
import com.kakao.tistory.data.repository.ADIDRepositoryImpl;
import com.kakao.tistory.data.repository.AccountRepositoryImpl;
import com.kakao.tistory.data.repository.AppInfoRepositoryImpl;
import com.kakao.tistory.data.repository.AutoSaveRepositoryImpl;
import com.kakao.tistory.data.repository.CommentRepositoryImpl;
import com.kakao.tistory.data.repository.DashboardRepository;
import com.kakao.tistory.data.repository.DashboardRepositoryImpl;
import com.kakao.tistory.data.repository.EntryFileRepositoryImpl;
import com.kakao.tistory.data.repository.EntryRepositoryImpl;
import com.kakao.tistory.data.repository.FeedRepositoryImpl;
import com.kakao.tistory.data.repository.GrammarRepositoryImpl;
import com.kakao.tistory.data.repository.GuestbookRepositoryImpl;
import com.kakao.tistory.data.repository.IllegalFilmReportRepositoryImpl;
import com.kakao.tistory.data.repository.MemberRepositoryImpl;
import com.kakao.tistory.data.repository.NotificationRepositoryImpl;
import com.kakao.tistory.data.repository.OldBlogRepositoryImpl;
import com.kakao.tistory.data.repository.OldStatisticsRepository;
import com.kakao.tistory.data.repository.OldStatisticsRepositoryImpl;
import com.kakao.tistory.data.repository.PushRepositoryImpl;
import com.kakao.tistory.data.repository.SearchRepositoryImpl;
import com.kakao.tistory.data.repository.SecretLabRepositoryImpl;
import com.kakao.tistory.data.repository.SessionRepositoryImpl;
import com.kakao.tistory.data.repository.ThrowableRepositoryImpl;
import com.kakao.tistory.data.revenue.repository.RevenueVendorRepositoryImpl;
import com.kakao.tistory.data.statistics.repository.StatisticsRepositoryImpl;
import com.kakao.tistory.domain.blog.repository.BlogRepository;
import com.kakao.tistory.domain.home.repository.HomeRepository;
import com.kakao.tistory.domain.repository.ADIDRepository;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AppInfoRepository;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.CommentRepository;
import com.kakao.tistory.domain.repository.EntryFileRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.FeedRepository;
import com.kakao.tistory.domain.repository.GrammarRepository;
import com.kakao.tistory.domain.repository.GuestbookRepository;
import com.kakao.tistory.domain.repository.IllegalFilmReportRepository;
import com.kakao.tistory.domain.repository.MemberRepository;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.repository.PushRepository;
import com.kakao.tistory.domain.repository.SearchRepository;
import com.kakao.tistory.domain.repository.SecretLabRepository;
import com.kakao.tistory.domain.repository.SessionRepository;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository;
import com.kakao.tistory.domain.statistics.repository.StatisticsRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000\u00B8\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\'J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\'J\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\'J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0012H\'J\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0016H\'J\u0010\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001AH\'J\u0010\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\u001EH\'J\u0010\u0010\u001F\u001A\u00020 2\u0006\u0010!\u001A\u00020\"H\'J\u0010\u0010#\u001A\u00020$2\u0006\u0010%\u001A\u00020&H\'J\u0010\u0010\'\u001A\u00020(2\u0006\u0010)\u001A\u00020*H\'J\u0010\u0010+\u001A\u00020,2\u0006\u0010-\u001A\u00020.H\'J\u0010\u0010/\u001A\u0002002\u0006\u00101\u001A\u000202H\'J\u0010\u00103\u001A\u0002042\u0006\u00105\u001A\u000206H\'J\u0010\u00107\u001A\u0002082\u0006\u00109\u001A\u00020:H\'J\u0010\u0010;\u001A\u00020<2\u0006\u0010=\u001A\u00020>H\'J\u0010\u0010?\u001A\u00020@2\u0006\u0010A\u001A\u00020BH\'J\u0010\u0010C\u001A\u00020D2\u0006\u0010E\u001A\u00020FH\'J\u0010\u0010G\u001A\u00020H2\u0006\u0010I\u001A\u00020JH\'J\u0010\u0010K\u001A\u00020L2\u0006\u0010M\u001A\u00020NH\'J\u0010\u0010O\u001A\u00020P2\u0006\u0010Q\u001A\u00020RH\'J\u0010\u0010S\u001A\u00020T2\u0006\u0010U\u001A\u00020VH\'J\u0010\u0010W\u001A\u00020X2\u0006\u0010Y\u001A\u00020ZH\'J\u0010\u0010[\u001A\u00020\\2\u0006\u0010]\u001A\u00020^H\'J\u0010\u0010_\u001A\u00020`2\u0006\u0010a\u001A\u00020bH\'J\u0010\u0010c\u001A\u00020d2\u0006\u0010e\u001A\u00020fH\'\u00A8\u0006g"}, d2 = {"Lcom/kakao/tistory/module/RepositoryModule;", "", "()V", "bindADIDRepository", "Lcom/kakao/tistory/domain/repository/ADIDRepository;", "adidRepository", "Lcom/kakao/tistory/data/repository/ADIDRepositoryImpl;", "bindAccountRepository", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/data/repository/AccountRepositoryImpl;", "bindAppInfoRepository", "Lcom/kakao/tistory/domain/repository/AppInfoRepository;", "appInfoRepository", "Lcom/kakao/tistory/data/repository/AppInfoRepositoryImpl;", "bindAutoSaveRepository", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "autoSaveRepository", "Lcom/kakao/tistory/data/repository/AutoSaveRepositoryImpl;", "bindBlogRepository", "Lcom/kakao/tistory/domain/blog/repository/BlogRepository;", "blogRepository", "Lcom/kakao/tistory/data/blog/repository/BlogRepositoryImpl;", "bindCommentRepository", "Lcom/kakao/tistory/domain/repository/CommentRepository;", "commentRepository", "Lcom/kakao/tistory/data/repository/CommentRepositoryImpl;", "bindDashboardRepository", "Lcom/kakao/tistory/data/repository/DashboardRepository;", "dashboardRepository", "Lcom/kakao/tistory/data/repository/DashboardRepositoryImpl;", "bindEntryFileRepository", "Lcom/kakao/tistory/domain/repository/EntryFileRepository;", "entryFileRepository", "Lcom/kakao/tistory/data/repository/EntryFileRepositoryImpl;", "bindEntryRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/data/repository/EntryRepositoryImpl;", "bindFeedRepository", "Lcom/kakao/tistory/domain/repository/FeedRepository;", "feedRepository", "Lcom/kakao/tistory/data/repository/FeedRepositoryImpl;", "bindGrammarRepository", "Lcom/kakao/tistory/domain/repository/GrammarRepository;", "grammarRepository", "Lcom/kakao/tistory/data/repository/GrammarRepositoryImpl;", "bindGuestbookRepository", "Lcom/kakao/tistory/domain/repository/GuestbookRepository;", "guestbookRepository", "Lcom/kakao/tistory/data/repository/GuestbookRepositoryImpl;", "bindHomeRepository", "Lcom/kakao/tistory/domain/home/repository/HomeRepository;", "homeRepository", "Lcom/kakao/tistory/data/home/repository/HomeRepositoryImpl;", "bindIllegalFilmReportRepository", "Lcom/kakao/tistory/domain/repository/IllegalFilmReportRepository;", "illegalFilmReportRepository", "Lcom/kakao/tistory/data/repository/IllegalFilmReportRepositoryImpl;", "bindMemberRepository", "Lcom/kakao/tistory/domain/repository/MemberRepository;", "memberRepository", "Lcom/kakao/tistory/data/repository/MemberRepositoryImpl;", "bindNotificationRepository", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "notificationRepository", "Lcom/kakao/tistory/data/repository/NotificationRepositoryImpl;", "bindOldBlogRepository", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "Lcom/kakao/tistory/data/repository/OldBlogRepositoryImpl;", "bindOldStatisticsRepository", "Lcom/kakao/tistory/data/repository/OldStatisticsRepository;", "oldStatisticsRepository", "Lcom/kakao/tistory/data/repository/OldStatisticsRepositoryImpl;", "bindPushRepository", "Lcom/kakao/tistory/domain/repository/PushRepository;", "pushRepository", "Lcom/kakao/tistory/data/repository/PushRepositoryImpl;", "bindRevenueVendorRepository", "Lcom/kakao/tistory/domain/revenue/repository/RevenueVendorRepository;", "revenueVendorRepository", "Lcom/kakao/tistory/data/revenue/repository/RevenueVendorRepositoryImpl;", "bindSearchRepository", "Lcom/kakao/tistory/domain/repository/SearchRepository;", "SearchRepository", "Lcom/kakao/tistory/data/repository/SearchRepositoryImpl;", "bindSecretLabRepository", "Lcom/kakao/tistory/domain/repository/SecretLabRepository;", "secretLabRepository", "Lcom/kakao/tistory/data/repository/SecretLabRepositoryImpl;", "bindStatisticsRepository", "Lcom/kakao/tistory/domain/statistics/repository/StatisticsRepository;", "statisticsRepository", "Lcom/kakao/tistory/data/statistics/repository/StatisticsRepositoryImpl;", "bindThrowableRepository", "Lcom/kakao/tistory/domain/repository/ThrowableRepository;", "throwableRepository", "Lcom/kakao/tistory/data/repository/ThrowableRepositoryImpl;", "provideSessionRepository", "Lcom/kakao/tistory/domain/repository/SessionRepository;", "sessionRepository", "Lcom/kakao/tistory/data/repository/SessionRepositoryImpl;", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class RepositoryModule {
    @Binds
    @Singleton
    @NotNull
    public abstract ADIDRepository bindADIDRepository(@NotNull ADIDRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract AccountRepository bindAccountRepository(@NotNull AccountRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract AppInfoRepository bindAppInfoRepository(@NotNull AppInfoRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract AutoSaveRepository bindAutoSaveRepository(@NotNull AutoSaveRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract BlogRepository bindBlogRepository(@NotNull BlogRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract CommentRepository bindCommentRepository(@NotNull CommentRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract DashboardRepository bindDashboardRepository(@NotNull DashboardRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract EntryFileRepository bindEntryFileRepository(@NotNull EntryFileRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract EntryRepository bindEntryRepository(@NotNull EntryRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract FeedRepository bindFeedRepository(@NotNull FeedRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract GrammarRepository bindGrammarRepository(@NotNull GrammarRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract GuestbookRepository bindGuestbookRepository(@NotNull GuestbookRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract HomeRepository bindHomeRepository(@NotNull HomeRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract IllegalFilmReportRepository bindIllegalFilmReportRepository(@NotNull IllegalFilmReportRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract MemberRepository bindMemberRepository(@NotNull MemberRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract NotificationRepository bindNotificationRepository(@NotNull NotificationRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract OldBlogRepository bindOldBlogRepository(@NotNull OldBlogRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract OldStatisticsRepository bindOldStatisticsRepository(@NotNull OldStatisticsRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract PushRepository bindPushRepository(@NotNull PushRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract RevenueVendorRepository bindRevenueVendorRepository(@NotNull RevenueVendorRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract SearchRepository bindSearchRepository(@NotNull SearchRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract SecretLabRepository bindSecretLabRepository(@NotNull SecretLabRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract StatisticsRepository bindStatisticsRepository(@NotNull StatisticsRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract ThrowableRepository bindThrowableRepository(@NotNull ThrowableRepositoryImpl arg1);

    @Binds
    @Singleton
    @NotNull
    public abstract SessionRepository provideSessionRepository(@NotNull SessionRepositoryImpl arg1);
}

