package com.kakao.tistory.presentation.screen.notification.navigation;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavOptions;
import androidx.navigation.compose.NavGraphBuilderKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0012\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006\u001A0\u0010\u0007\u001A\u00020\u0003*\u00020\b2\b\u0010\t\u001A\u0004\u0018\u00010\u00012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00030\u000B\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"NOTIFICATION_ROUTE", "", "navigateToNotification", "", "Landroidx/navigation/NavController;", "navOptions", "Landroidx/navigation/NavOptions;", "notificationScreen", "Landroidx/navigation/NavGraphBuilder;", "blogImageUrl", "onClickSearch", "Lkotlin/Function0;", "onClickBlogSwitch", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class NotificationNavigationKt {
    @NotNull
    public static final String NOTIFICATION_ROUTE = "notification";

    public static final void navigateToNotification(@NotNull NavController navController0, @NotNull NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        Intrinsics.checkNotNullParameter(navOptions0, "navOptions");
        NavController.navigate$default(navController0, "notification", navOptions0, null, 4, null);
    }

    public static final void notificationScreen(@NotNull NavGraphBuilder navGraphBuilder0, @Nullable String s, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClickSearch");
        Intrinsics.checkNotNullParameter(function01, "onClickBlogSwitch");
        NavGraphBuilderKt.composable$default(navGraphBuilder0, "notification", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-802087396, true, new a(s, function00, function01)), 0xFE, null);
    }
}

