package com.kakao.tistory.presentation.screen.blogswitch.navigation;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavOptions;
import com.google.accompanist.navigation.material.NavGraphBuilderKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001A3\u0010\t\u001A\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001A;\u0010\u0010\u001A\u00020\b*\u00020\u000B2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/navigation/NavController;", "Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "type", "", "section", "page", "Landroidx/navigation/NavOptions;", "navOptions", "", "navigateToBlogSwitch", "(Landroidx/navigation/NavController;Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavOptions;)V", "Landroidx/navigation/NavGraphBuilder;", "Lkotlin/Function0;", "onClickSetting", "onClickBlog", "onDismiss", "blogSwitchBottomSheet", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "BLOG_SWITCH_ROUTE", "Ljava/lang/String;", "BLOG_SWITCH_SECTION", "BLOG_SWITCH_PAGE", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSwitchNavigationKt {
    @NotNull
    public static final String BLOG_SWITCH_PAGE = "page";
    @NotNull
    public static final String BLOG_SWITCH_ROUTE = "blogSwitchRoute";
    @NotNull
    public static final String BLOG_SWITCH_SECTION = "section";

    public static final void blogSwitchBottomSheet(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClickSetting");
        Intrinsics.checkNotNullParameter(function01, "onClickBlog");
        Intrinsics.checkNotNullParameter(function02, "onDismiss");
        NavGraphBuilderKt.bottomSheet$default(navGraphBuilder0, "blogSwitchRoute/{type}?section={section}&page={page}", CollectionsKt__CollectionsKt.listOf(new NamedNavArgument[]{NamedNavArgumentKt.navArgument("type", a.a), NamedNavArgumentKt.navArgument("section", b.a), NamedNavArgumentKt.navArgument("page", c.a)}), null, ComposableLambdaKt.composableLambdaInstance(-1470308220, true, new d(function00, function01, function02)), 4, null);
    }

    public static final void navigateToBlogSwitch(@NotNull NavController navController0, @NotNull BlogSwitchType blogSwitchType0, @NotNull String s, @NotNull String s1, @NotNull NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        Intrinsics.checkNotNullParameter(blogSwitchType0, "type");
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(navOptions0, "navOptions");
        StringBuilder stringBuilder0 = a5.b.w("blogSwitchRoute/", blogSwitchType0.name(), "?section=", s, "&page=");
        stringBuilder0.append(s1);
        NavController.navigate$default(navController0, stringBuilder0.toString(), navOptions0, null, 4, null);
    }

    public static void navigateToBlogSwitch$default(NavController navController0, BlogSwitchType blogSwitchType0, String s, String s1, NavOptions navOptions0, int v, Object object0) {
        if((v & 1) != 0) {
            blogSwitchType0 = BlogSwitchType.NORMAL;
        }
        BlogSwitchNavigationKt.navigateToBlogSwitch(navController0, blogSwitchType0, s, s1, navOptions0);
    }
}

