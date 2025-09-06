package com.kakao.tistory;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.repository.DashboardRepository;
import com.kakao.tistory.data.repository.OldStatisticsRepository;
import com.kakao.tistory.data.usecase.CheckSingUpUseCase;
import com.kakao.tistory.data.usecase.LoginByKakaoUseCase;
import com.kakao.tistory.data.usecase.LoginByTokenUseCase;
import com.kakao.tistory.data.usecase.LoginUseCase;
import com.kakao.tistory.domain.blog.repository.BlogRepository;
import com.kakao.tistory.domain.blog.usecase.ChangeBlockUseCase;
import com.kakao.tistory.domain.blog.usecase.GetBlogInfoUseCase;
import com.kakao.tistory.domain.blog.usecase.GetCategoriesUseCase;
import com.kakao.tistory.domain.blog.usecase.GetChallengeUseCase;
import com.kakao.tistory.domain.blog.usecase.GetEntryListUseCase;
import com.kakao.tistory.domain.blog.usecase.GetFirstOpenUseCase;
import com.kakao.tistory.domain.blog.usecase.GetNoticeListUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRecentNoticeListUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRefererKeywordsUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRefererLogUseCase;
import com.kakao.tistory.domain.blog.usecase.GetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.blog.usecase.GetTrendUseCase;
import com.kakao.tistory.domain.blog.usecase.SetFirstOpenedUseCase;
import com.kakao.tistory.domain.blog.usecase.SetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.entity.BuildType;
import com.kakao.tistory.domain.home.repository.HomeRepository;
import com.kakao.tistory.domain.home.usecase.GetCategorySlotListUseCase;
import com.kakao.tistory.domain.home.usecase.GetHomeSlotListUseCase;
import com.kakao.tistory.domain.home.usecase.SetCategoryPreferenceUseCase;
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
import com.kakao.tistory.domain.revenue.usecase.GetRevenueCurrentUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueGraphDetailInfoUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueGraphUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueInfoUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueSummaryUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueSupportUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueVendorListUseCase;
import com.kakao.tistory.domain.statistics.repository.StatisticsRepository;
import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesLastWeekUseCase;
import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesUseCase;
import com.kakao.tistory.domain.usecase.CheckLatestEditEntryUseCase;
import com.kakao.tistory.domain.usecase.CheckVerifyBlogNameUseCase;
import com.kakao.tistory.domain.usecase.CheckVerifyBlogNicknameUseCase;
import com.kakao.tistory.domain.usecase.DeleteCommentUseCase;
import com.kakao.tistory.domain.usecase.DeleteGuestbookUseCase;
import com.kakao.tistory.domain.usecase.DeletePushTokenUseCase;
import com.kakao.tistory.domain.usecase.FollowBlogUseCase;
import com.kakao.tistory.domain.usecase.GetAppInfoUseCase;
import com.kakao.tistory.domain.usecase.GetBlogFollowerCountUseCase;
import com.kakao.tistory.domain.usecase.GetBlogFollowingCountUseCase;
import com.kakao.tistory.domain.usecase.GetBlogUseCase;
import com.kakao.tistory.domain.usecase.GetChallengeRequirementsUseCase;
import com.kakao.tistory.domain.usecase.GetCommentsUseCase;
import com.kakao.tistory.domain.usecase.GetCurrentBlogNameUseCase;
import com.kakao.tistory.domain.usecase.GetEditableEntryUseCase;
import com.kakao.tistory.domain.usecase.GetGuestBookPinCommentUseCase;
import com.kakao.tistory.domain.usecase.GetGuestbookListUseCase;
import com.kakao.tistory.domain.usecase.GetIllegalFilmReportUrlUseCase;
import com.kakao.tistory.domain.usecase.GetInitRecommendedBlogNameUseCase;
import com.kakao.tistory.domain.usecase.GetLatestEditEntryUseCase;
import com.kakao.tistory.domain.usecase.GetMyBlogUseCase;
import com.kakao.tistory.domain.usecase.GetPinCommentUseCase;
import com.kakao.tistory.domain.usecase.GetPinGuestBookComment;
import com.kakao.tistory.domain.usecase.GetServerHostListUseCase;
import com.kakao.tistory.domain.usecase.LeaveUseCase;
import com.kakao.tistory.domain.usecase.LogoutUseCase;
import com.kakao.tistory.domain.usecase.PinCommentUseCase;
import com.kakao.tistory.domain.usecase.PinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.PostCommentUseCase;
import com.kakao.tistory.domain.usecase.PostEntryChallengeUseCase;
import com.kakao.tistory.domain.usecase.PostMemberJoinUseCase;
import com.kakao.tistory.domain.usecase.PostReportCommentUseCase;
import com.kakao.tistory.domain.usecase.PutCommentUseCase;
import com.kakao.tistory.domain.usecase.ReportBlogUseCase;
import com.kakao.tistory.domain.usecase.ReportGuestbookUseCase;
import com.kakao.tistory.domain.usecase.UnFollowBlogUseCase;
import com.kakao.tistory.domain.usecase.UnPinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.UnpinCommentUseCase;
import com.kakao.tistory.domain.usecase.UpdateGuestbookUseCase;
import com.kakao.tistory.domain.usecase.WriteGuestbookUseCase;
import com.kakao.tistory.presentation.TistoryMainViewModel;
import com.kakao.tistory.presentation.main.MainAppViewModel;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel;
import com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel;
import com.kakao.tistory.presentation.screen.blog.setting.BlogSettingViewModel;
import com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchViewModel;
import com.kakao.tistory.presentation.screen.feed.FeedViewModel;
import com.kakao.tistory.presentation.screen.home.HomeViewModel;
import com.kakao.tistory.presentation.screen.notification.NotificationViewModel;
import com.kakao.tistory.presentation.screen.revenue.RevenueViewModel;
import com.kakao.tistory.presentation.screen.revenue.vendorswitch.VendorSwitchViewModel;
import com.kakao.tistory.presentation.view.comment.entry.PostCommentModifyViewModel;
import com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel;
import com.kakao.tistory.presentation.view.comment.entry.PostPinCommentModifyViewModel;
import com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookModifyViewModel;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel;
import com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookModifyViewModel;
import com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel;
import com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel;
import com.kakao.tistory.presentation.viewmodel.AppInfoViewModel;
import com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel;
import com.kakao.tistory.presentation.viewmodel.CommonWebViewModel;
import com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel;
import com.kakao.tistory.presentation.viewmodel.DefaultBlogViewModel;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorTagViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel;
import com.kakao.tistory.presentation.viewmodel.LeaveViewModel;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryCheckViewModel;
import com.kakao.tistory.presentation.viewmodel.PushViewModel;
import com.kakao.tistory.presentation.viewmodel.RefererEtcViewModel;
import com.kakao.tistory.presentation.viewmodel.RefererKeywordViewModel;
import com.kakao.tistory.presentation.viewmodel.RefererLogViewModel;
import com.kakao.tistory.presentation.viewmodel.ReportViewModel;
import com.kakao.tistory.presentation.viewmodel.SavedStateViewModel;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import com.kakao.tistory.presentation.viewmodel.SecretLabViewModel;
import com.kakao.tistory.presentation.viewmodel.SettingViewModel;
import com.kakao.tistory.presentation.viewmodel.SignUpViewModel;
import com.kakao.tistory.presentation.viewmodel.SplashViewModel;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import com.kakao.tistory.presentation.viewmodel.ThrowableViewModel;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel;
import com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel;
import com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel;
import com.kakao.tistory.presentation.viewmodel.TopPostViewModel;
import javax.inject.Provider;

public final class o implements Provider {
    public final k a;
    public final p b;
    public final int c;

    public o(k k0, p p0, int v) {
        this.a = k0;
        this.b = p0;
        this.c = v;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        k k0 = this.a;
        p p0 = this.b;
        int v = this.c;
        switch(v) {
            case 0: {
                return new AppInfoViewModel(new GetAppInfoUseCase(((AppInfoRepository)p0.b.x.get())));
            }
            case 1: {
                return new BlogCategoryViewModel(((OldBlogRepository)k0.z.get()));
            }
            case 2: {
                return new BlogFollowViewModel(((FeedRepository)k0.B.get()), ((OldBlogRepository)k0.z.get()), new GetCurrentBlogNameUseCase(((AccountRepository)p0.b.m.get())));
            }
            case 3: {
                return new BlogMainViewModel(new GetTopEntriesLastWeekUseCase(((StatisticsRepository)p0.b.E.get())), new GetRecentNoticeListUseCase(((BlogRepository)p0.b.H.get())), new GetCategoriesUseCase(((BlogRepository)p0.b.H.get())), new GetEntryListUseCase(((BlogRepository)p0.b.H.get())), new FollowBlogUseCase(((OldBlogRepository)p0.b.z.get())), new UnFollowBlogUseCase(((OldBlogRepository)p0.b.z.get())), new GetTrendUseCase(((BlogRepository)p0.b.H.get())), new GetRefererLogUseCase(((BlogRepository)p0.b.H.get())), new GetRefererKeywordsUseCase(((BlogRepository)p0.b.H.get())), new GetRevenueVendorListUseCase(((RevenueVendorRepository)p0.b.J.get())), new GetRevenueCurrentUseCase(((RevenueVendorRepository)p0.b.J.get())), new GetFirstOpenUseCase(((BlogRepository)p0.b.H.get())), new SetFirstOpenedUseCase(((BlogRepository)p0.b.H.get())), new ChangeBlockUseCase(((BlogRepository)p0.b.H.get())), ((EntryRepository)k0.L.get()), new GetChallengeUseCase(((BlogRepository)p0.b.H.get())), ((AccountRepository)k0.m.get()));
            }
            case 4: {
                return new BlogNoticeListViewModel(((AccountRepository)k0.m.get()), new GetNoticeListUseCase(((BlogRepository)p0.b.H.get())), ((OldBlogRepository)k0.z.get()), ((EntryRepository)k0.L.get()));
            }
            case 5: {
                return new BlogSettingViewModel(((AppInfoRepository)k0.x.get()), ((OldBlogRepository)k0.z.get()), ((AccountRepository)k0.m.get()), new CheckVerifyBlogNicknameUseCase(((AccountRepository)p0.b.m.get())));
            }
            case 6: {
                return new BlogSwitchViewModel(((AccountRepository)k0.m.get()));
            }
            case 7: {
                return new com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel();
            }
            case 8: {
                return new BlogViewModel(new GetBlogInfoUseCase(((BlogRepository)p0.b.H.get())));
            }
            case 9: {
                return new CommonWebViewModel(((SessionRepository)k0.M.get()));
            }
            case 10: {
                return new DaumCategoryViewModel(((EntryRepository)k0.L.get()));
            }
            case 11: {
                return new DefaultBlogViewModel(((AccountRepository)k0.m.get()));
            }
            case 12: {
                return new DraftViewModel(((EntryRepository)k0.L.get()), ((AccountRepository)k0.m.get()));
            }
            case 13: {
                EntryRepository entryRepository0 = (EntryRepository)k0.L.get();
                AccountRepository accountRepository0 = (AccountRepository)k0.m.get();
                return new EditorTagViewModel(p0.a, entryRepository0, accountRepository0);
            }
            case 14: {
                return new EditorViewModel(((EntryRepository)k0.L.get()), ((EntryFileRepository)k0.N.get()), ((AccountRepository)k0.m.get()), ((AutoSaveRepository)k0.O.get()), ((GrammarRepository)k0.Q.get()), new GetEditableEntryUseCase(((EntryRepository)p0.b.L.get()), ((AutoSaveRepository)p0.b.O.get())), new GetLatestEditEntryUseCase(new CheckLatestEditEntryUseCase(((EntryRepository)p0.b.L.get()), ((AutoSaveRepository)p0.b.O.get())), ((AutoSaveRepository)p0.b.O.get())), new GetMyBlogUseCase(((AccountRepository)p0.b.m.get())), new GetChallengeRequirementsUseCase(((EntryRepository)p0.b.L.get())));
            }
            case 15: {
                return new EntryViewModel(((AccountRepository)k0.m.get()), ((SessionRepository)k0.M.get()), ((EntryRepository)k0.L.get()), ((OldBlogRepository)k0.z.get()), new PostEntryChallengeUseCase(((EntryRepository)p0.b.L.get())), new GetShowChallengeAuthUseCase(((BlogRepository)p0.b.H.get())), new SetShowChallengeAuthUseCase(((BlogRepository)p0.b.H.get())));
            }
            case 16: {
                return new FeedViewModel(((AccountRepository)k0.m.get()), ((FeedRepository)k0.B.get()), ((EntryRepository)k0.L.get()), new GetBlogFollowingCountUseCase(((FeedRepository)p0.b.B.get())), new GetBlogFollowerCountUseCase(((FeedRepository)p0.b.B.get())));
            }
            case 17: {
                return new GuestbookModifyViewModel(new UpdateGuestbookUseCase(((GuestbookRepository)p0.b.S.get())));
            }
            case 18: {
                return new GuestbookViewModel(((AccountRepository)k0.m.get()), new GetGuestbookListUseCase(((GuestbookRepository)p0.b.S.get())), new WriteGuestbookUseCase(((GuestbookRepository)p0.b.S.get())), new DeleteGuestbookUseCase(((GuestbookRepository)p0.b.S.get())), new PinGuestBookCommentUseCase(((GuestbookRepository)p0.b.S.get())), new UnPinGuestBookCommentUseCase(((GuestbookRepository)p0.b.S.get())), new GetGuestBookPinCommentUseCase(((GuestbookRepository)p0.b.S.get())), new GetBlogUseCase(((OldBlogRepository)p0.b.z.get())));
            }
            case 19: {
                return new HomeViewModel(((AccountRepository)k0.m.get()), new GetHomeSlotListUseCase(((HomeRepository)p0.b.V.get())), new GetCategorySlotListUseCase(((HomeRepository)p0.b.V.get())), new SetCategoryPreferenceUseCase(((HomeRepository)p0.b.V.get())), new FollowBlogUseCase(((OldBlogRepository)p0.b.z.get())), new UnFollowBlogUseCase(((OldBlogRepository)p0.b.z.get())));
            }
            case 20: {
                return new KakaoLoginViewModel(new LoginByKakaoUseCase(((AccountRepository)p0.b.m.get())), new CheckSingUpUseCase(((MemberRepository)p0.b.X.get())), p.a(p0), ((AppInfoRepository)k0.x.get()), ((DeviceInfoPreference)k0.j.get()));
            }
            case 21: {
                return new LeaveViewModel(new LeaveUseCase(new DeletePushTokenUseCase(((PushRepository)p0.b.Z.get())), new GetCurrentBlogNameUseCase(((AccountRepository)p0.b.m.get())), ((AccountRepository)p0.b.m.get()), ((AutoSaveRepository)p0.b.O.get()), ((SearchRepository)p0.b.c0.get())));
            }
            case 22: {
                Object object0 = k0.m.get();
                Object object1 = k0.e0.get();
                CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0 = new CheckLatestEditEntryUseCase(((EntryRepository)p0.b.L.get()), ((AutoSaveRepository)p0.b.O.get()));
                Object object2 = k0.O.get();
                return new MainAppViewModel(p0.a, ((AccountRepository)object0), ((NotificationRepository)object1), checkLatestEditEntryUseCase0, ((AutoSaveRepository)object2));
            }
            case 23: {
                return new MigrationViewModel(((AccountRepository)k0.m.get()), new LoginByTokenUseCase(((AccountRepository)p0.b.m.get())));
            }
            case 24: {
                return new NotificationViewModel(((AccountRepository)k0.m.get()), ((NotificationRepository)k0.e0.get()));
            }
            case 25: {
                return new PinGuestbookModifyViewModel(new UpdateGuestbookUseCase(((GuestbookRepository)p0.b.S.get())));
            }
            case 26: {
                return new PinGuestbookViewModel(((AccountRepository)k0.m.get()), new GetPinGuestBookComment(((GuestbookRepository)p0.b.S.get())), new GetGuestbookListUseCase(((GuestbookRepository)p0.b.S.get())), new UpdateGuestbookUseCase(((GuestbookRepository)p0.b.S.get())), new WriteGuestbookUseCase(((GuestbookRepository)p0.b.S.get())), new DeleteGuestbookUseCase(((GuestbookRepository)p0.b.S.get())), new PinGuestBookCommentUseCase(((GuestbookRepository)p0.b.S.get())), new UnPinGuestBookCommentUseCase(((GuestbookRepository)p0.b.S.get())), new GetGuestBookPinCommentUseCase(((GuestbookRepository)p0.b.S.get())), new GetBlogUseCase(((OldBlogRepository)p0.b.z.get())));
            }
            case 27: {
                return new PostCommentModifyViewModel(new PutCommentUseCase(((CommentRepository)p0.b.g0.get())));
            }
            case 28: {
                return new PostCommentViewModel(((AccountRepository)k0.m.get()), ((EntryRepository)k0.L.get()), new GetCommentsUseCase(((CommentRepository)p0.b.g0.get())), new PostCommentUseCase(((CommentRepository)p0.b.g0.get())), new DeleteCommentUseCase(((CommentRepository)p0.b.g0.get())), new PinCommentUseCase(((CommentRepository)p0.b.g0.get())), new UnpinCommentUseCase(((CommentRepository)p0.b.g0.get())), new GetPinCommentUseCase(((CommentRepository)p0.b.g0.get())));
            }
            case 29: {
                return new PostPinCommentModifyViewModel(new PutCommentUseCase(((CommentRepository)p0.b.g0.get())));
            }
            case 30: {
                return new PostPinCommentViewModel(((AccountRepository)k0.m.get()), ((EntryRepository)k0.L.get()), new GetCommentsUseCase(((CommentRepository)p0.b.g0.get())), new PostCommentUseCase(((CommentRepository)p0.b.g0.get())), new DeleteCommentUseCase(((CommentRepository)p0.b.g0.get())), new PinCommentUseCase(((CommentRepository)p0.b.g0.get())), new UnpinCommentUseCase(((CommentRepository)p0.b.g0.get())), new GetPinCommentUseCase(((CommentRepository)p0.b.g0.get())));
            }
            case 0x1F: {
                return new ProtectedEntryCheckViewModel(((EntryRepository)k0.L.get()));
            }
            case 0x20: {
                return new PushViewModel(((PushRepository)k0.Z.get()), ((DeviceInfoPreference)k0.j.get()));
            }
            case 33: {
                return new RefererEtcViewModel(((OldStatisticsRepository)k0.j0.get()));
            }
            case 34: {
                return new RefererKeywordViewModel();
            }
            case 35: {
                return new RefererLogViewModel(((AccountRepository)k0.m.get()), ((DashboardRepository)k0.l0.get()));
            }
            case 36: {
                return new ReportViewModel(((EntryRepository)k0.L.get()), new PostReportCommentUseCase(((CommentRepository)p0.b.g0.get())), new ReportGuestbookUseCase(((GuestbookRepository)p0.b.S.get())), new ReportBlogUseCase(((OldBlogRepository)p0.b.z.get())), new GetIllegalFilmReportUrlUseCase(((IllegalFilmReportRepository)p0.b.n0.get())));
            }
            case 37: {
                return new RevenueViewModel(new GetRevenueVendorListUseCase(((RevenueVendorRepository)p0.b.J.get())), new GetRevenueInfoUseCase(new GetRevenueSummaryUseCase(((RevenueVendorRepository)p0.b.J.get())), new GetRevenueGraphUseCase(((RevenueVendorRepository)p0.b.J.get())), new GetRevenueGraphDetailInfoUseCase(((RevenueVendorRepository)p0.b.J.get()))), new GetRevenueGraphDetailInfoUseCase(((RevenueVendorRepository)p0.b.J.get())), new GetRevenueSupportUseCase(((RevenueVendorRepository)p0.b.J.get())));
            }
            case 38: {
                AccountRepository accountRepository1 = (AccountRepository)k0.m.get();
                return new SavedStateViewModel(p0.a, accountRepository1);
            }
            case 39: {
                return new SearchResultViewModel(((AccountRepository)k0.m.get()), ((EntryRepository)k0.L.get()), ((OldBlogRepository)k0.z.get()), ((SearchRepository)k0.c0.get()));
            }
            case 40: {
                return new SearchViewModel(((SearchRepository)k0.c0.get()));
            }
            case 41: {
                return new SecretLabViewModel(((DeviceInfoPreference)k0.j.get()), new GetServerHostListUseCase(((SecretLabRepository)p0.b.p0.get())));
            }
            case 42: {
                return new SettingNoticeListViewModel(new GetEntryListUseCase(((BlogRepository)p0.b.H.get())), ((EntryRepository)k0.L.get()));
            }
            case 43: {
                return new SettingViewModel(((AccountRepository)k0.m.get()), new GetAppInfoUseCase(((AppInfoRepository)p0.b.x.get())), ((PushRepository)k0.Z.get()), ((DeviceInfoPreference)k0.j.get()), new LogoutUseCase(((AccountRepository)p0.b.m.get())), ((BuildType)k0.l.get()));
            }
            case 44: {
                return new SignUpViewModel(new GetInitRecommendedBlogNameUseCase(((MemberRepository)p0.b.X.get())), new CheckVerifyBlogNameUseCase(((MemberRepository)p0.b.X.get())), new PostMemberJoinUseCase(((MemberRepository)p0.b.X.get())), new LoginByKakaoUseCase(((AccountRepository)p0.b.m.get())), p.a(p0), ((DeviceInfoPreference)k0.j.get()));
            }
            case 45: {
                return new SplashViewModel(new GetAppInfoUseCase(((AppInfoRepository)p0.b.x.get())), new LoginByTokenUseCase(((AccountRepository)p0.b.m.get())), p.a(p0), ((NotificationRepository)k0.e0.get()), ((DeviceInfoPreference)k0.j.get()), ((AccountRepository)k0.m.get()));
            }
            case 46: {
                return new StatisticsViewModel(((AccountRepository)k0.m.get()), ((OldStatisticsRepository)k0.j0.get()), new GetTopEntriesUseCase(((StatisticsRepository)p0.b.E.get())));
            }
            case 0x2F: {
                return new ThrowableViewModel(((ThrowableRepository)k0.o.get()), ((AccountRepository)k0.m.get()));
            }
            case 0x30: {
                return new TistoryGuideViewModel();
            }
            case 49: {
                return new TistoryLoginViewModel(new LoginUseCase(((AccountRepository)p0.b.m.get())), p.a(p0), ((DeviceInfoPreference)k0.j.get()));
            }
            case 50: {
                return new TistoryMainViewModel(((EntryRepository)k0.L.get()), ((AccountRepository)k0.m.get()));
            }
            case 51: {
                return new TistoryToolbarViewModel(((AccountRepository)k0.m.get()), ((DeviceInfoPreference)k0.j.get()));
            }
            case 52: {
                return new TopPostViewModel(new GetTopEntriesUseCase(((StatisticsRepository)p0.b.E.get())));
            }
            case 53: {
                return new VendorSwitchViewModel(new GetRevenueVendorListUseCase(((RevenueVendorRepository)p0.b.J.get())));
            }
            default: {
                throw new AssertionError(v);
            }
        }
    }
}

