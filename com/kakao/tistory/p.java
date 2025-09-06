package com.kakao.tistory;

import androidx.lifecycle.SavedStateHandle;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.domain.repository.PushRepository;
import dagger.internal.MapBuilder;
import java.util.Collections;
import java.util.Map;

public final class p extends ViewModelC {
    public final o A;
    public final o B;
    public final o C;
    public final o D;
    public final o E;
    public final o F;
    public final o G;
    public final o H;
    public final o I;
    public final o J;
    public final o K;
    public final o L;
    public final o M;
    public final o N;
    public final o O;
    public final o P;
    public final o Q;
    public final o R;
    public final o S;
    public final o T;
    public final o U;
    public final o V;
    public final o W;
    public final o X;
    public final o Y;
    public final o Z;
    public final SavedStateHandle a;
    public final o a0;
    public final k b;
    public final o b0;
    public final o c;
    public final o c0;
    public final o d;
    public final o d0;
    public final o e;
    public final o f;
    public final o g;
    public final o h;
    public final o i;
    public final o j;
    public final o k;
    public final o l;
    public final o m;
    public final o n;
    public final o o;
    public final o p;
    public final o q;
    public final o r;
    public final o s;
    public final o t;
    public final o u;
    public final o v;
    public final o w;
    public final o x;
    public final o y;
    public final o z;

    public p(k k0, e e0, SavedStateHandle savedStateHandle0) {
        this.b = k0;
        this.a = savedStateHandle0;
        this.c = new o(k0, this, 0);
        this.d = new o(k0, this, 1);
        this.e = new o(k0, this, 2);
        this.f = new o(k0, this, 3);
        this.g = new o(k0, this, 4);
        this.h = new o(k0, this, 5);
        this.i = new o(k0, this, 6);
        this.j = new o(k0, this, 7);
        this.k = new o(k0, this, 8);
        this.l = new o(k0, this, 9);
        this.m = new o(k0, this, 10);
        this.n = new o(k0, this, 11);
        this.o = new o(k0, this, 12);
        this.p = new o(k0, this, 13);
        this.q = new o(k0, this, 14);
        this.r = new o(k0, this, 15);
        this.s = new o(k0, this, 16);
        this.t = new o(k0, this, 17);
        this.u = new o(k0, this, 18);
        this.v = new o(k0, this, 19);
        this.w = new o(k0, this, 20);
        this.x = new o(k0, this, 21);
        this.y = new o(k0, this, 22);
        this.z = new o(k0, this, 23);
        this.A = new o(k0, this, 24);
        this.B = new o(k0, this, 25);
        this.C = new o(k0, this, 26);
        this.D = new o(k0, this, 27);
        this.E = new o(k0, this, 28);
        this.F = new o(k0, this, 29);
        this.G = new o(k0, this, 30);
        this.H = new o(k0, this, 0x1F);
        this.I = new o(k0, this, 0x20);
        this.J = new o(k0, this, 33);
        this.K = new o(k0, this, 34);
        this.L = new o(k0, this, 35);
        this.M = new o(k0, this, 36);
        this.N = new o(k0, this, 37);
        this.O = new o(k0, this, 38);
        this.P = new o(k0, this, 39);
        this.Q = new o(k0, this, 40);
        this.R = new o(k0, this, 41);
        this.S = new o(k0, this, 42);
        this.T = new o(k0, this, 43);
        this.U = new o(k0, this, 44);
        this.V = new o(k0, this, 45);
        this.W = new o(k0, this, 46);
        this.X = new o(k0, this, 0x2F);
        this.Y = new o(k0, this, 0x30);
        this.Z = new o(k0, this, 49);
        this.a0 = new o(k0, this, 50);
        this.b0 = new o(k0, this, 51);
        this.c0 = new o(k0, this, 52);
        this.d0 = new o(k0, this, 53);
    }

    public static PushTokenUseCase a(p p0) {
        return new PushTokenUseCase(((PushRepository)p0.b.Z.get()));
    }

    @Override  // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$ViewModelFactoriesEntryPoint
    public final Map getHiltViewModelAssistedMap() {
        return Collections.emptyMap();
    }

    @Override  // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$ViewModelFactoriesEntryPoint
    public final Map getHiltViewModelMap() {
        return MapBuilder.newMapBuilder(54).put("com.kakao.tistory.presentation.viewmodel.AppInfoViewModel", this.c).put("com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel", this.d).put("com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel", this.e).put("com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel", this.f).put("com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel", this.g).put("com.kakao.tistory.presentation.screen.blog.setting.BlogSettingViewModel", this.h).put("com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchViewModel", this.i).put("com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel", this.j).put("com.kakao.tistory.presentation.screen.blog.BlogViewModel", this.k).put("com.kakao.tistory.presentation.viewmodel.CommonWebViewModel", this.l).put("com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel", this.m).put("com.kakao.tistory.presentation.viewmodel.DefaultBlogViewModel", this.n).put("com.kakao.tistory.presentation.viewmodel.DraftViewModel", this.o).put("com.kakao.tistory.presentation.viewmodel.EditorTagViewModel", this.p).put("com.kakao.tistory.presentation.viewmodel.EditorViewModel", this.q).put("com.kakao.tistory.presentation.viewmodel.EntryViewModel", this.r).put("com.kakao.tistory.presentation.screen.feed.FeedViewModel", this.s).put("com.kakao.tistory.presentation.view.comment.guestbook.GuestbookModifyViewModel", this.t).put("com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel", this.u).put("com.kakao.tistory.presentation.screen.home.HomeViewModel", this.v).put("com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel", this.w).put("com.kakao.tistory.presentation.viewmodel.LeaveViewModel", this.x).put("com.kakao.tistory.presentation.main.MainAppViewModel", this.y).put("com.kakao.tistory.presentation.viewmodel.MigrationViewModel", this.z).put("com.kakao.tistory.presentation.screen.notification.NotificationViewModel", this.A).put("com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookModifyViewModel", this.B).put("com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel", this.C).put("com.kakao.tistory.presentation.view.comment.entry.PostCommentModifyViewModel", this.D).put("com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel", this.E).put("com.kakao.tistory.presentation.view.comment.entry.PostPinCommentModifyViewModel", this.F).put("com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel", this.G).put("com.kakao.tistory.presentation.viewmodel.ProtectedEntryCheckViewModel", this.H).put("com.kakao.tistory.presentation.viewmodel.PushViewModel", this.I).put("com.kakao.tistory.presentation.viewmodel.RefererEtcViewModel", this.J).put("com.kakao.tistory.presentation.viewmodel.RefererKeywordViewModel", this.K).put("com.kakao.tistory.presentation.viewmodel.RefererLogViewModel", this.L).put("com.kakao.tistory.presentation.viewmodel.ReportViewModel", this.M).put("com.kakao.tistory.presentation.screen.revenue.RevenueViewModel", this.N).put("com.kakao.tistory.presentation.viewmodel.SavedStateViewModel", this.O).put("com.kakao.tistory.presentation.viewmodel.SearchResultViewModel", this.P).put("com.kakao.tistory.presentation.viewmodel.SearchViewModel", this.Q).put("com.kakao.tistory.presentation.viewmodel.SecretLabViewModel", this.R).put("com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel", this.S).put("com.kakao.tistory.presentation.viewmodel.SettingViewModel", this.T).put("com.kakao.tistory.presentation.viewmodel.SignUpViewModel", this.U).put("com.kakao.tistory.presentation.viewmodel.SplashViewModel", this.V).put("com.kakao.tistory.presentation.viewmodel.StatisticsViewModel", this.W).put("com.kakao.tistory.presentation.viewmodel.ThrowableViewModel", this.X).put("com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel", this.Y).put("com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel", this.Z).put("com.kakao.tistory.presentation.TistoryMainViewModel", this.a0).put("com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel", this.b0).put("com.kakao.tistory.presentation.viewmodel.TopPostViewModel", this.c0).put("com.kakao.tistory.presentation.screen.revenue.vendorswitch.VendorSwitchViewModel", this.d0).build();
    }
}

