package com.kakao.tistory.presentation.main;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import com.kakao.android.base.utils.Logger;
import com.kakao.tistory.presentation.ActivityNavigator;
import com.kakao.tistory.presentation.ActivityNavigatorImpl;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.network.NetworkConnection;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import com.kakao.tistory.presentation.main.tiara.MainTiara;
import com.kakao.tistory.presentation.screen.blog.main.BlogMainTiara;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNavigationKt;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchNavigationKt;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import com.kakao.tistory.presentation.screen.feed.navigation.FeedNavigationKt;
import com.kakao.tistory.presentation.screen.feed.tiara.FeedTiara;
import com.kakao.tistory.presentation.screen.home.navigation.HomeNavigationKt;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import com.kakao.tistory.presentation.screen.notification.navigation.NotificationNavigationKt;
import com.kakao.tistory.presentation.screen.notification.tiara.NotificationTiara;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import com.kakao.tistory.presentation.widget.dialog.DialogController;
import com.kakao.tistory.presentation.widget.dialog.DialogEvent;
import dc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001hB)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0096\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u0011H\u0096\u0001\u00A2\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0015H\u0096\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0015H\u0096\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0018J(\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u00152\u0006\u0010\u001B\u001A\u00020\fH\u0096\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ \u0010 \u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u001F\u001A\u00020\u001EH\u0096\u0001\u00A2\u0006\u0004\b \u0010!J\u0018\u0010$\u001A\u00020\u000E2\u0006\u0010#\u001A\u00020\"H\u0096\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u000EH\u0096\u0001\u00A2\u0006\u0004\b&\u0010\'J\u001E\u0010+\u001A\u00020\u000E2\f\u0010*\u001A\b\u0012\u0004\u0012\u00020)0(H\u0096\u0001\u00A2\u0006\u0004\b+\u0010,J\u0018\u0010-\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0096\u0001\u00A2\u0006\u0004\b-\u0010\u0010J\u001C\u0010.\u001A\u00020\u000E2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0001\u00A2\u0006\u0004\b.\u0010\u0010J\u0010\u0010/\u001A\u00020\u000EH\u0096\u0001\u00A2\u0006\u0004\b/\u0010\'J\u0018\u00101\u001A\u00020\u000E2\u0006\u00100\u001A\u00020\fH\u0096\u0001\u00A2\u0006\u0004\b1\u0010\u0010J \u00104\u001A\u00020\u000E2\u0006\u00102\u001A\u00020\f2\u0006\u00103\u001A\u00020\fH\u0096\u0001\u00A2\u0006\u0004\b4\u00105J \u00107\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u00106\u001A\u00020\u0011H\u0096\u0001\u00A2\u0006\u0004\b7\u00108J\u0018\u00109\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0096\u0001\u00A2\u0006\u0004\b9\u0010\u0010J\u0018\u0010;\u001A\u00020\u000E2\u0006\u0010:\u001A\u00020\fH\u0096\u0001\u00A2\u0006\u0004\b;\u0010\u0010J\u0015\u0010>\u001A\u00020\u000E2\u0006\u0010=\u001A\u00020<\u00A2\u0006\u0004\b>\u0010?J\r\u0010@\u001A\u00020\u000E\u00A2\u0006\u0004\b@\u0010\'J!\u0010B\u001A\u00020\u000E2\u0006\u0010\u001B\u001A\u00020\f2\n\b\u0002\u0010A\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\bB\u00105J\u0017\u0010D\u001A\u00020\u000E2\b\b\u0002\u0010C\u001A\u00020\u0011\u00A2\u0006\u0004\bD\u0010\u0014J\r\u0010E\u001A\u00020\u000E\u00A2\u0006\u0004\bE\u0010\'R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010MR\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010QR\u001D\u0010X\u001A\b\u0012\u0004\u0012\u00020S0R8\u0006\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010WR\u001D\u0010]\u001A\b\u0012\u0004\u0012\u00020<0(8\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\R\u0013\u0010`\u001A\u0004\u0018\u00010<8G\u00A2\u0006\u0006\u001A\u0004\b^\u0010_R\u0013\u0010d\u001A\u0004\u0018\u00010a8G\u00A2\u0006\u0006\u001A\u0004\bb\u0010cR\u0011\u0010g\u001A\u00020\u00118G\u00A2\u0006\u0006\u001A\u0004\be\u0010f\u00A8\u0006i"}, d2 = {"Lcom/kakao/tistory/presentation/main/MainAppState;", "Lcom/kakao/tistory/presentation/ActivityNavigator;", "Landroid/content/Context;", "context", "Landroidx/navigation/NavHostController;", "navController", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "bottomSheetNavigator", "Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "networkChecker", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavHostController;Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Lcom/kakao/tistory/presentation/common/network/NetworkConnection;)V", "", "blogName", "", "navigateToBlog", "(Ljava/lang/String;)V", "", "openLatestEdit", "navigateToEditor", "(Z)V", "", "entryId", "navigateToEntry", "(Ljava/lang/String;J)V", "navigateToEntryEditor", "id", "title", "navigateToEntryStatistics", "(Ljava/lang/String;JLjava/lang/String;)V", "Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "type", "navigateToFollowScreen", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;)V", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "guestbookExtra", "navigateToGuestbook", "(Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;)V", "navigateToMainMy", "()V", "", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "list", "navigateToRefererKeyword", "(Ljava/util/List;)V", "navigateToRefererLog", "navigateToSearch", "navigateToSetting", "link", "navigateToStoryCreator", "subject", "text", "navigateToTextShare", "(Ljava/lang/String;Ljava/lang/String;)V", "isMine", "navigateToTopEntryList", "(Ljava/lang/String;Z)V", "navigateToTrend", "url", "navigateToWeb", "Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "destination", "navigateToMainDestination", "(Lcom/kakao/tistory/presentation/main/navigation/MainDestination;)V", "navigateToMy", "message", "navigateToOkDialog", "isQuick", "navigateToBlogSwitchBottomSheet", "navigateToPop", "b", "Landroidx/navigation/NavHostController;", "getNavController", "()Landroidx/navigation/NavHostController;", "c", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "getBottomSheetNavigator", "()Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "d", "Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "getNetworkChecker", "()Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/presentation/main/MainAppState$MainAppDialogEvent;", "g", "Lkotlinx/coroutines/flow/Flow;", "getDialogEvent", "()Lkotlinx/coroutines/flow/Flow;", "dialogEvent", "h", "Ljava/util/List;", "getMainDestinations", "()Ljava/util/List;", "mainDestinations", "getCurrentMainDestinationState", "(Landroidx/compose/runtime/Composer;I)Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "currentMainDestinationState", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "getCurrentTiaraState", "(Landroidx/compose/runtime/Composer;I)Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "currentTiaraState", "getShowBottomBar", "(Landroidx/compose/runtime/Composer;I)Z", "showBottomBar", "MainAppDialogEvent", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MainAppState implements ActivityNavigator {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/main/MainAppState$MainAppDialogEvent;", "Lcom/kakao/tistory/presentation/widget/dialog/DialogEvent;", "ShowOk", "Lcom/kakao/tistory/presentation/main/MainAppState$MainAppDialogEvent$ShowOk;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class MainAppDialogEvent implements DialogEvent {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\b¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/main/MainAppState$MainAppDialogEvent$ShowOk;", "Lcom/kakao/tistory/presentation/main/MainAppState$MainAppDialogEvent;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/main/MainAppState$MainAppDialogEvent$ShowOk;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class ShowOk extends MainAppDialogEvent {
            public static final int $stable;
            public final String a;
            public final String b;

            public ShowOk(@NotNull String s, @Nullable String s1) {
                Intrinsics.checkNotNullParameter(s, "title");
                super(null);
                this.a = s;
                this.b = s1;
            }

            @NotNull
            public final String component1() {
                return this.a;
            }

            @Nullable
            public final String component2() {
                return this.b;
            }

            @NotNull
            public final ShowOk copy(@NotNull String s, @Nullable String s1) {
                Intrinsics.checkNotNullParameter(s, "title");
                return new ShowOk(s, s1);
            }

            public static ShowOk copy$default(ShowOk mainAppState$MainAppDialogEvent$ShowOk0, String s, String s1, int v, Object object0) {
                if((v & 1) != 0) {
                    s = mainAppState$MainAppDialogEvent$ShowOk0.a;
                }
                if((v & 2) != 0) {
                    s1 = mainAppState$MainAppDialogEvent$ShowOk0.b;
                }
                return mainAppState$MainAppDialogEvent$ShowOk0.copy(s, s1);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof ShowOk)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((ShowOk)object0).a) ? Intrinsics.areEqual(this.b, ((ShowOk)object0).b) : false;
            }

            @Nullable
            public final String getMessage() {
                return this.b;
            }

            @NotNull
            public final String getTitle() {
                return this.a;
            }

            @Override
            public int hashCode() {
                int v = this.a.hashCode();
                return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "ShowOk(title=" + this.a + ", message=" + this.b + ")";
            }
        }

        public static final int $stable;

        public MainAppDialogEvent(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[MainDestination.values().length];
            try {
                arr_v[MainDestination.HOME.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.FEED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.NOTIFICATION.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.MY.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.EDITOR.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final Context a;
    public final NavHostController b;
    public final BottomSheetNavigator c;
    public final NetworkConnection d;
    public final ActivityNavigatorImpl e;
    public final DialogController f;
    public final Flow g;
    public final EnumEntries h;

    public MainAppState(@NotNull Context context0, @NotNull NavHostController navHostController0, @NotNull BottomSheetNavigator bottomSheetNavigator0, @NotNull NetworkConnection networkConnection0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(navHostController0, "navController");
        Intrinsics.checkNotNullParameter(bottomSheetNavigator0, "bottomSheetNavigator");
        Intrinsics.checkNotNullParameter(networkConnection0, "networkChecker");
        super();
        this.a = context0;
        this.b = navHostController0;
        this.c = bottomSheetNavigator0;
        this.d = networkConnection0;
        this.e = new ActivityNavigatorImpl(context0);
        DialogController dialogController0 = new DialogController();
        this.f = dialogController0;
        this.g = dialogController0.getEventFlow();
        this.h = MainDestination.getEntries();
        navHostController0.addOnDestinationChangedListener(new a(this));
    }

    public MainAppState(Context context0, NavHostController navHostController0, BottomSheetNavigator bottomSheetNavigator0, NetworkConnection networkConnection0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            networkConnection0 = new NetworkConnection(context0);
        }
        this(context0, navHostController0, bottomSheetNavigator0, networkConnection0);
    }

    public static MainDestination a(String s) {
        if(s != null) {
            switch(s) {
                case "BLOG": {
                    return MainDestination.MY;
                }
                case "feed": {
                    return MainDestination.FEED;
                }
                case "home": {
                    return MainDestination.HOME;
                }
                case "notification": {
                    return MainDestination.NOTIFICATION;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    public static final void a(MainAppState mainAppState0, NavController navController0, NavDestination navDestination0, Bundle bundle0) {
        HomeTiara homeTiara0;
        Intrinsics.checkNotNullParameter(mainAppState0, "this$0");
        Intrinsics.checkNotNullParameter(navController0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        String s = navDestination0.getRoute();
        if(s == null) {
            homeTiara0 = null;
        }
        else {
            mainAppState0.getClass();
            MainDestination mainDestination0 = MainAppState.a(s);
            if(mainDestination0 == null) {
                homeTiara0 = null;
            }
            else {
                switch(WhenMappings.$EnumSwitchMapping$0[mainDestination0.ordinal()]) {
                    case 1: {
                        homeTiara0 = HomeTiara.INSTANCE;
                        break;
                    }
                    case 2: {
                        homeTiara0 = FeedTiara.INSTANCE;
                        break;
                    }
                    case 3: {
                        homeTiara0 = NotificationTiara.INSTANCE;
                        break;
                    }
                    case 4: {
                        homeTiara0 = BlogMainTiara.INSTANCE;
                        break;
                    }
                    default: {
                        homeTiara0 = null;
                    }
                }
            }
        }
        if(homeTiara0 != null) {
            String s1 = homeTiara0.getSection();
            String s2 = homeTiara0.getPage();
            MainTiara.INSTANCE.update(s1, s2);
        }
    }

    @NotNull
    public final BottomSheetNavigator getBottomSheetNavigator() {
        return this.c;
    }

    @Composable
    @JvmName(name = "getCurrentMainDestinationState")
    @Nullable
    public final MainDestination getCurrentMainDestinationState(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x42CEFBE1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x42CEFBE1, v, -1, "com.kakao.tistory.presentation.main.MainAppState.<get-currentMainDestinationState> (MainAppState.kt:86)");
        }
        composer0.startReplaceGroup(0x8688EAF1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8688EAF1, v & 14, -1, "com.kakao.tistory.presentation.main.MainAppState.<get-currentDestinationState> (MainAppState.kt:83)");
        }
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)NavHostControllerKt.currentBackStackEntryAsState(this.b, composer0, 8).getValue();
        String s = null;
        NavDestination navDestination0 = navBackStackEntry0 == null ? null : navBackStackEntry0.getDestination();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        if(navDestination0 != null) {
            s = navDestination0.getRoute();
        }
        MainDestination mainDestination0 = MainAppState.a(s);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return mainDestination0;
    }

    @Composable
    @JvmName(name = "getCurrentTiaraState")
    @Nullable
    public final TiaraPage getCurrentTiaraState(@Nullable Composer composer0, int v) {
        TiaraPage tiaraPage0;
        composer0.startReplaceGroup(610414890);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(610414890, v, -1, "com.kakao.tistory.presentation.main.MainAppState.<get-currentTiaraState> (MainAppState.kt:89)");
        }
        MainDestination mainDestination0 = this.getCurrentMainDestinationState(composer0, v & 14);
        if(mainDestination0 == null) {
            tiaraPage0 = null;
        }
        else {
            switch(WhenMappings.$EnumSwitchMapping$0[mainDestination0.ordinal()]) {
                case 1: {
                    tiaraPage0 = HomeTiara.INSTANCE;
                    break;
                }
                case 2: {
                    tiaraPage0 = FeedTiara.INSTANCE;
                    break;
                }
                case 3: {
                    tiaraPage0 = NotificationTiara.INSTANCE;
                    break;
                }
                case 4: {
                    tiaraPage0 = BlogMainTiara.INSTANCE;
                    break;
                }
                default: {
                    tiaraPage0 = null;
                }
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return tiaraPage0;
    }

    @NotNull
    public final Flow getDialogEvent() {
        return this.g;
    }

    @NotNull
    public final List getMainDestinations() {
        return this.h;
    }

    @NotNull
    public final NavHostController getNavController() {
        return this.b;
    }

    @NotNull
    public final NetworkConnection getNetworkChecker() {
        return this.d;
    }

    @Composable
    @JvmName(name = "getShowBottomBar")
    public final boolean getShowBottomBar(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(-915024096);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915024096, v, -1, "com.kakao.tistory.presentation.main.MainAppState.<get-showBottomBar> (MainAppState.kt:92)");
        }
        boolean z = this.getCurrentMainDestinationState(composer0, v & 14) != null;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return z;
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToBlog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToBlog(s);
    }

    // 去混淆评级： 低(30)
    public final void navigateToBlogSwitchBottomSheet(boolean z) {
        BlogSwitchNavigationKt.navigateToBlogSwitch(this.b, (z ? BlogSwitchType.QUICK : BlogSwitchType.NORMAL), "", "", NavOptionsBuilderKt.navOptions(w.a));
    }

    public static void navigateToBlogSwitchBottomSheet$default(MainAppState mainAppState0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        mainAppState0.navigateToBlogSwitchBottomSheet(z);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEditor(boolean z) {
        this.e.navigateToEditor(z);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntry(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToEntry(s, v);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntryEditor(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToEntryEditor(s, v);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntryStatistics(@NotNull String s, long v, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "title");
        this.e.navigateToEntryStatistics(s, v, s1);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToFollowScreen(@NotNull String s, @NotNull Type blogFollowViewModel$Type0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(blogFollowViewModel$Type0, "type");
        this.e.navigateToFollowScreen(s, blogFollowViewModel$Type0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToGuestbook(@NotNull GuestbookExtra guestbookExtra0) {
        Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
        this.e.navigateToGuestbook(guestbookExtra0);
    }

    public final void navigateToMainDestination(@NotNull MainDestination mainDestination0) {
        Intrinsics.checkNotNullParameter(mainDestination0, "destination");
        Logger.INSTANCE.log("navigateToMainDestination : " + mainDestination0);
        NavOptions navOptions0 = NavOptionsBuilderKt.navOptions(new y(this));
        switch(WhenMappings.$EnumSwitchMapping$0[mainDestination0.ordinal()]) {
            case 1: {
                HomeNavigationKt.navigateTohHome(this.b, navOptions0);
                return;
            }
            case 2: {
                FeedNavigationKt.navigateToFeed(this.b, navOptions0);
                return;
            }
            case 3: {
                NotificationNavigationKt.navigateToNotification(this.b, navOptions0);
                return;
            }
            case 4: {
                BlogNavigationKt.navigateToMy(this.b, navOptions0);
                return;
            }
            case 5: {
                NavigatorExtensionKt.goToEditor$default(this.a, false, 1, null);
            }
        }
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToMainMy() {
        this.e.navigateToMainMy();
    }

    public final void navigateToMy() {
        this.navigateToMainDestination(MainDestination.MY);
    }

    public final void navigateToOkDialog(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "title");
        ShowOk mainAppState$MainAppDialogEvent$ShowOk0 = new ShowOk(s, s1);
        this.f.sendDialogEvent(mainAppState$MainAppDialogEvent$ShowOk0);
    }

    public static void navigateToOkDialog$default(MainAppState mainAppState0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        mainAppState0.navigateToOkDialog(s, s1);
    }

    public final void navigateToPop() {
        Logger.INSTANCE.log("navigateToPop");
        this.b.navigateUp();
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToRefererKeyword(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "list");
        this.e.navigateToRefererKeyword(list0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToRefererLog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToRefererLog(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToSearch(@Nullable String s) {
        this.e.navigateToSearch(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToSetting() {
        this.e.navigateToSetting();
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToStoryCreator(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "link");
        this.e.navigateToStoryCreator(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTextShare(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "subject");
        Intrinsics.checkNotNullParameter(s1, "text");
        this.e.navigateToTextShare(s, s1);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTopEntryList(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToTopEntryList(s, z);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTrend(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToTrend(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToWeb(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        this.e.navigateToWeb(s);
    }
}

