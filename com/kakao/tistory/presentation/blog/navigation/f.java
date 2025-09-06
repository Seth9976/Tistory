package com.kakao.tistory.presentation.blog.navigation;

import androidx.navigation.NavGraphBuilder;
import com.kakao.tistory.presentation.blog.BlogAppState;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNavigationKt;
import com.kakao.tistory.presentation.screen.blog.navigation.FromRefer;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchNavigationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final BlogAppState a;

    public f(BlogAppState blogAppState0) {
        this.a = blogAppState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavGraphBuilder)object0), "$this$NavHost");
        BlogNavHostKt.BlogNavHost.1.1.navActions.1 blogNavHostKt$BlogNavHost$1$1$navActions$10 = new BlogNavHostKt.BlogNavHost.1.1.navActions.1(this.a);
        BlogNavigationKt.blogScreen(((NavGraphBuilder)object0), this.a.getNavController(), this.a.getBlogName(), FromRefer.OTHERS, blogNavHostKt$BlogNavHost$1$1$navActions$10);
        BlogSwitchNavigationKt.blogSwitchBottomSheet(((NavGraphBuilder)object0), new a(this.a), new b(this.a), new c(this.a));
        return Unit.INSTANCE;
    }
}

