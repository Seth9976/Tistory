package com.kakao.tistory.presentation.screen.home;

import android.content.Context;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.kakao.tistory.presentation.common.CommonCompositionLocalKt;
import com.kakao.tistory.presentation.screen.home.contract.DialogType.Alert;
import com.kakao.tistory.presentation.screen.home.contract.DialogType;
import com.kakao.tistory.presentation.screen.home.contract.HomeUiState;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.LastSlotInfo;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import com.kakao.tistory.presentation.widget.dialog.AlertDialogData;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A?\u0010\n\u001A\u00020\u00002\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00000\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\u0010²\u0006\f\u0010\r\u001A\u00020\f8\nX\u008A\u0084\u0002²\u0006\u0010\u0010\u000F\u001A\u0004\u0018\u00010\u000E8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "TopAppBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "blogImageUrl", "Lkotlin/Function0;", "onClickSearch", "onClickBlogSwitch", "Lcom/kakao/tistory/presentation/screen/home/HomeViewModel;", "viewModel", "HomeScreen", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/home/HomeViewModel;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeUiState;", "uiState", "Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$LastSlotInfo;", "lastSlotTiaraInfo", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreen.kt\ncom/kakao/tistory/presentation/screen/home/HomeScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,223:1\n46#2,7:224\n86#3,6:231\n1223#4,6:237\n77#5:243\n81#6:244\n81#6:245\n107#6,2:246\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\ncom/kakao/tistory/presentation/screen/home/HomeScreenKt\n*L\n65#1:224,7\n65#1:231,6\n70#1:237,6\n200#1:243\n67#1:244\n70#1:245\n70#1:246,2\n*E\n"})
public final class HomeScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeScreen(@Nullable String s, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable HomeViewModel homeViewModel0, @Nullable Composer composer0, int v, int v1) {
        HomeViewModel homeViewModel1;
        HomeViewModel homeViewModel2;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClickSearch");
        Intrinsics.checkNotNullParameter(function01, "onClickBlogSwitch");
        Composer composer1 = composer0.startRestartGroup(0xE26C8A03);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x400;
        }
        if((v1 & 8) != 8 || (v2 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                homeViewModel2 = homeViewModel0;
            }
            else if((v1 & 8) == 0) {
                homeViewModel2 = homeViewModel0;
            }
            else {
                composer1.startReplaceableGroup(0x70B323C8);
                ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, LocalViewModelStoreOwner.$stable);
                if(viewModelStoreOwner0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                Factory viewModelProvider$Factory0 = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner0, composer1, 0);
                composer1.startReplaceableGroup(0x671A9C9B);
                CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
                ViewModel viewModel0 = ViewModelKt.viewModel(HomeViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
                homeViewModel2 = (HomeViewModel)viewModel0;
                v2 &= 0xFFFFE3FF;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE26C8A03, v2, -1, "com.kakao.tistory.presentation.screen.home.HomeScreen (HomeScreen.kt:65)");
            }
            State state0 = SnapshotStateKt.collectAsState(homeViewModel2.getUiState(), null, composer1, 8, 1);
            TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.pinnedScrollBehavior(null, null, composer1, TopAppBarDefaults.$stable << 6, 3);
            composer1.startReplaceGroup(209897063);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(CommonCompositionLocalKt.getLocalRefreshingState().provides(Boolean.valueOf(((HomeUiState)state0.getValue()).isRefreshing())), ComposableLambdaKt.rememberComposableLambda(0x29568D43, true, new k(state0, topAppBarScrollBehavior0, s, function00, function01, mutableState0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            DialogType dialogType0 = ((HomeUiState)state0.getValue()).getDialog();
            composer1.startReplaceGroup(209962837);
            if(dialogType0 != null) {
                composer1.startReplaceGroup(0xC83C901);
                if(dialogType0 instanceof Alert) {
                    TistoryComposeDialogKt.TistoryAlertDialog(((AlertDialogData)dialogType0), ((HomeUiState)state0.getValue()).getOnDismissDialog(), composer1, 0);
                }
                composer1.endReplaceGroup();
            }
            composer1.endReplaceGroup();
            HomeScreenKt.a(homeViewModel2, composer1, 8);
            HomeTiara.INSTANCE.TrackPage(composer1, 6);
            LastSlotInfo homeTiara$LastSlotInfo0 = (LastSlotInfo)mutableState0.getValue();
            HomeTiara.INSTANCE.TrackUsage(homeTiara$LastSlotInfo0, composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            homeViewModel1 = homeViewModel2;
        }
        else {
            composer1.skipToGroupEnd();
            homeViewModel1 = homeViewModel0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(s, function00, function01, homeViewModel1, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 375)
    public static final void TopAppBarPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2019136795);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2019136795, v, -1, "com.kakao.tistory.presentation.screen.home.TopAppBarPreview (HomeScreen.kt:46)");
            }
            TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.pinnedScrollBehavior(null, null, composer1, TopAppBarDefaults.$stable << 6, 3);
            HomeScreenKt.a("https://t1.daumcdn.net/daumtop_deco/images/pctop/2023/logo_daum.png", s.a, t.a, u.a, topAppBarScrollBehavior0, composer1, 3510);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(v));
        }
    }

    public static final void a(HomeViewModel homeViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAA15DCB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAA15DCB, v, -1, "com.kakao.tistory.presentation.screen.home.ConsumeEvent (HomeScreen.kt:198)");
        }
        EffectsKt.LaunchedEffect(homeViewModel0, new c(homeViewModel0, ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(homeViewModel0, v));
        }
    }

    public static final void a(String s, Function0 function00, Function0 function01, Function0 function02, TopAppBarScrollBehavior topAppBarScrollBehavior0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xBB4CD537);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function02) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBB4CD537, v1, -1, "com.kakao.tistory.presentation.screen.home.HomeTopAppBar (HomeScreen.kt:148)");
            }
            TistoryTopAppBarKt.TistoryTopAppBar-nbWgWpA(topAppBarScrollBehavior0, false, ComposableLambdaKt.rememberComposableLambda(0xF7726695, true, new n(function02), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x7093B4C8, true, new q(s, function00, function01), composer1, 54), null, 0.0f, 0.0f, composer1, v1 >> 12 & 14 | 0xD80, 0x72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(s, function00, function01, function02, topAppBarScrollBehavior0, v));
        }
    }

    public static final HomeUiState access$HomeScreen$lambda$0(State state0) {
        return (HomeUiState)state0.getValue();
    }

    public static final void access$HomeScreen$lambda$3(MutableState mutableState0, LastSlotInfo homeTiara$LastSlotInfo0) {
        mutableState0.setValue(homeTiara$LastSlotInfo0);
    }
}

