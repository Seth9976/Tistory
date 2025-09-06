package com.kakao.tistory.presentation.main.navigation;

import android.content.Context;
import androidx.navigation.NavGraphBuilder;
import com.kakao.tistory.presentation.main.MainAppState;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNavigationKt;
import com.kakao.tistory.presentation.screen.blog.navigation.FromRefer;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchNavigationKt;
import com.kakao.tistory.presentation.screen.feed.navigation.FeedNavigationKt;
import com.kakao.tistory.presentation.screen.home.navigation.HomeNavigationKt;
import com.kakao.tistory.presentation.screen.notification.navigation.NotificationNavigationKt;
import com.kakao.tistory.presentation.widget.dialog.WelcomeDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final String a;
    public final MainAppState b;
    public final String c;
    public final Context d;

    public o(String s, MainAppState mainAppState0, String s1, Context context0) {
        this.a = s;
        this.b = mainAppState0;
        this.c = s1;
        this.d = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavGraphBuilder)object0), "$this$NavHost");
        MainNavHostKt.MainNavHost.1.navActions.1 mainNavHostKt$MainNavHost$1$navActions$10 = new MainNavHostKt.MainNavHost.1.navActions.1(this.b);
        d d0 = new d(this.b);
        e e0 = new e(this.b);
        HomeNavigationKt.homeScreen(((NavGraphBuilder)object0), this.a, d0, e0);
        f f0 = new f(this.b);
        g g0 = new g(this.b);
        FeedNavigationKt.feedScreen(((NavGraphBuilder)object0), this.a, f0, g0);
        h h0 = new h(this.b);
        i i0 = new i(this.b);
        NotificationNavigationKt.notificationScreen(((NavGraphBuilder)object0), this.a, h0, i0);
        BlogNavigationKt.blogScreen(((NavGraphBuilder)object0), this.b.getNavController(), this.c, FromRefer.TABS, mainNavHostKt$MainNavHost$1$navActions$10);
        BlogSwitchNavigationKt.blogSwitchBottomSheet(((NavGraphBuilder)object0), new j(this.b), new k(this.b), new l(this.b));
        WelcomeDialogKt.welcomeDialog(((NavGraphBuilder)object0), new a(this.d), new b(this.b), new c(this.b));
        return Unit.INSTANCE;
    }
}

