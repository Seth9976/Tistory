package com.kakao.tistory.presentation.screen.blog.navigation;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavOptions;
import androidx.navigation.compose.NavGraphBuilderKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0019\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u0019\u0010\u0006\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001A\u0019\u0010\u0007\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001A3\u0010\u0010\u001A\u00020\u0003*\u00020\b2\u0006\u0010\t\u001A\u00020\u00002\b\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavController;", "Landroidx/navigation/NavOptions;", "navOptions", "", "navigateToMy", "(Landroidx/navigation/NavController;Landroidx/navigation/NavOptions;)V", "navigateToBlogSetting", "navigateToBlogNoticeList", "Landroidx/navigation/NavGraphBuilder;", "navController", "", "currentBlogName", "Lcom/kakao/tistory/presentation/screen/blog/navigation/FromRefer;", "refer", "Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "navActions", "blogScreen", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavController;Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blog/navigation/FromRefer;Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;)V", "BLOG_GRAPH", "Ljava/lang/String;", "MY_ROUTE", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogNavigation.kt\ncom/kakao/tistory/presentation/screen/blog/navigation/BlogNavigationKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 5 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,163:1\n131#2:164\n1223#3,6:165\n51#4,2:171\n86#5,6:173\n*S KotlinDebug\n*F\n+ 1 BlogNavigation.kt\ncom/kakao/tistory/presentation/screen/blog/navigation/BlogNavigationKt\n*L\n116#1:164\n157#1:165,6\n159#1:171,2\n159#1:173,6\n*E\n"})
public final class BlogNavigationKt {
    @NotNull
    public static final String BLOG_GRAPH = "BLOG_GRAPH";
    @NotNull
    public static final String MY_ROUTE = "BLOG";

    public static final void blogScreen(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull NavController navController0, @Nullable String s, @NotNull FromRefer fromRefer0, @NotNull NavActions navActions0) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Intrinsics.checkNotNullParameter(fromRefer0, "refer");
        Intrinsics.checkNotNullParameter(navActions0, "navActions");
        com.kakao.tistory.presentation.screen.blog.navigation.BlogNavigationKt.blogScreen.nestedNavActions.1 blogNavigationKt$blogScreen$nestedNavActions$10 = new BlogNestedNavActions() {
            public final j a;
            public final h b;
            public final f c;

            {
                NavController navController0 = navController0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = new j(navController0);
                this.b = new h(navController0);
                this.c = new f(navController0);
            }

            @Override  // com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions
            @NotNull
            public Function0 getGoNoticeList() {
                return this.c;
            }

            @Override  // com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions
            @NotNull
            public Function0 getGoRevenue() {
                return this.b;
            }

            @Override  // com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions
            @NotNull
            public Function0 getGoSetting() {
                return this.a;
            }
        };
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), "BLOG", "BLOG_GRAPH");
        NavGraphBuilderKt.composable$default(navGraphBuilder1, "BLOG", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(0xD4D41B09, true, new a(navController0, s, fromRefer0, navActions0, blogNavigationKt$blogScreen$nestedNavActions$10)), 0xFE, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder1, "SETTING", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(0xB2260F32, true, new b(navController0, s, navActions0)), 0xFE, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder1, "REVENUE", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2100801169, true, new c(navController0, s, navActions0)), 0xFE, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder1, "NOTICE_LIST", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(0x48494DF0, true, new d(navController0, s, navActions0)), 0xFE, null);
        navGraphBuilder0.destination(navGraphBuilder1);
    }

    public static final void navigateToBlogNoticeList(@NotNull NavController navController0, @NotNull NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        Intrinsics.checkNotNullParameter(navOptions0, "navOptions");
        NavDestination navDestination0 = navController0.getCurrentDestination();
        if(!Intrinsics.areEqual((navDestination0 == null ? null : navDestination0.getRoute()), "BLOG") && !navController0.popBackStack("BLOG", false, false)) {
            NavController.navigate$default(navController0, "BLOG_GRAPH", null, null, 6, null);
        }
        NavController.navigate$default(navController0, "NOTICE_LIST", navOptions0, null, 4, null);
    }

    public static final void navigateToBlogSetting(@NotNull NavController navController0, @NotNull NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        Intrinsics.checkNotNullParameter(navOptions0, "navOptions");
        NavDestination navDestination0 = navController0.getCurrentDestination();
        if(!Intrinsics.areEqual((navDestination0 == null ? null : navDestination0.getRoute()), "BLOG") && !navController0.popBackStack("BLOG", false, false)) {
            NavController.navigate$default(navController0, "BLOG_GRAPH", null, null, 6, null);
        }
        NavController.navigate$default(navController0, "SETTING", navOptions0, null, 4, null);
    }

    public static final void navigateToMy(@NotNull NavController navController0, @NotNull NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        Intrinsics.checkNotNullParameter(navOptions0, "navOptions");
        NavController.navigate$default(navController0, "BLOG_GRAPH", navOptions0, null, 4, null);
    }
}

