package com.kakao.tistory.presentation.screen.notification;

import a;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.entity.NotificationItem;
import com.kakao.tistory.domain.entity.SortItem.NotificationSortItem;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.main.MainAppKt;
import com.kakao.tistory.presentation.screen.notification.tiara.NotificationTiara;
import com.kakao.tistory.presentation.screen.notification.ui.DeleteBottomSheetKt;
import com.kakao.tistory.presentation.screen.notification.ui.NotificationListKt;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A?\u0010\b\u001A\u00020\u00032\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0013²\u0006\u0010\u0010\u000B\u001A\u0004\u0018\u00010\n8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\r\u001A\u00020\f8\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u000E\u001A\u00020\f8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\nX\u008A\u0084\u0002²\u0006\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u00118\n@\nX\u008A\u008E\u0002"}, d2 = {"", "blogImageUrl", "Lkotlin/Function0;", "", "onClickSearch", "onClickBlogSwitch", "Lcom/kakao/tistory/presentation/screen/notification/NotificationViewModel;", "notificationViewModel", "NotificationScreen", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/notification/NotificationViewModel;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "", "isRefreshing", "showLoading", "Lcom/kakao/tistory/domain/entity/SortItem$NotificationSortItem;", "selectedSortItem", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "showDeleteBottomSheet", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNotificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationScreen.kt\ncom/kakao/tistory/presentation/screen/notification/NotificationScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,194:1\n46#2,7:195\n86#3,6:202\n1223#4,6:208\n1223#4,6:214\n1223#4,6:220\n1223#4,6:308\n1223#4,6:314\n71#5:226\n69#5,5:227\n74#5:260\n78#5:304\n78#6,6:232\n85#6,4:247\n89#6,2:257\n78#6,6:268\n85#6,4:283\n89#6,2:293\n93#6:299\n93#6:303\n368#7,9:238\n377#7:259\n368#7,9:274\n377#7:295\n378#7,2:297\n378#7,2:301\n4032#8,6:251\n4032#8,6:287\n85#9:261\n82#9,6:262\n88#9:296\n92#9:300\n77#10:305\n77#10:306\n77#10:307\n81#11:320\n107#11,2:321\n81#11:323\n107#11,2:324\n81#11:326\n81#11:327\n81#11:328\n107#11,2:329\n*S KotlinDebug\n*F\n+ 1 NotificationScreen.kt\ncom/kakao/tistory/presentation/screen/notification/NotificationScreenKt\n*L\n50#1:195,7\n50#1:202,6\n60#1:208,6\n62#1:214,6\n63#1:220,6\n145#1:308,6\n151#1:314,6\n82#1:226\n82#1:227,5\n82#1:260\n82#1:304\n82#1:232,6\n82#1:247,4\n82#1:257,2\n88#1:268,6\n88#1:283,4\n88#1:293,2\n88#1:299\n82#1:303\n82#1:238,9\n82#1:259\n88#1:274,9\n88#1:295\n88#1:297,2\n82#1:301,2\n82#1:251,6\n88#1:287,6\n88#1:261\n88#1:262,6\n88#1:296\n88#1:300\n134#1:305\n142#1:306\n143#1:307\n60#1:320\n60#1:321,2\n62#1:323\n62#1:324,2\n63#1:326\n80#1:327\n145#1:328\n145#1:329,2\n*E\n"})
public final class NotificationScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NotificationScreen(@Nullable String s, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable NotificationViewModel notificationViewModel0, @Nullable Composer composer0, int v, int v1) {
        NotificationViewModel notificationViewModel1;
        PullRefreshState pullRefreshState1;
        NotificationViewModel notificationViewModel2;
        int v4;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClickSearch");
        Intrinsics.checkNotNullParameter(function01, "onClickBlogSwitch");
        Composer composer1 = composer0.startRestartGroup(0xA7E45A03);
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
        int v3 = v2;
        if((v1 & 8) != 8 || (v3 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                v4 = v3;
                notificationViewModel2 = notificationViewModel0;
            }
            else if((v1 & 8) == 0) {
                v4 = v3;
                notificationViewModel2 = notificationViewModel0;
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
                ViewModel viewModel0 = ViewModelKt.viewModel(NotificationViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
                notificationViewModel2 = (NotificationViewModel)viewModel0;
                v4 = v3 & 0xFFFFE3FF;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA7E45A03, v4, -1, "com.kakao.tistory.presentation.screen.notification.NotificationScreen (NotificationScreen.kt:50)");
            }
            NotificationTiara.INSTANCE.trackPage(composer1, 6);
            NotificationScreenKt.a(notificationViewModel2, composer1, 8);
            TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(null, null, null, null, composer1, TopAppBarDefaults.$stable << 12, 15);
            LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(notificationViewModel2.getNotifications(), null, composer1, 8, 1);
            composer1.startReplaceGroup(0xD2BDF794);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableState mutableState1 = b.a(composer1, 0xD2BE0088);
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            State state0 = b.a(composer1, 0xD2BE08F6);
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new u(lazyPagingItems0, mutableState0, mutableState1));
                composer1.updateRememberedValue(state0);
            }
            composer1.endReplaceGroup();
            PullRefreshState pullRefreshState0 = PullRefreshStateKt.rememberPullRefreshState-UuyPYSY(((Boolean)mutableState1.getValue()).booleanValue(), new t(notificationViewModel2, lazyPagingItems0, mutableState1), 0.0f, 0.0f, composer1, 0, 12);
            State state1 = LiveDataAdapterKt.observeAsState(notificationViewModel2.getSelectedSortItem(), composer1, 8);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PullRefreshKt.pullRefresh(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), pullRefreshState0, !((Boolean)state0.getValue()).booleanValue());
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopCenter(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                pullRefreshState1 = pullRefreshState0;
                d.a(v5, composer1, v5, function20);
            }
            else {
                pullRefreshState1 = pullRefreshState0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    d.a(v5, composer1, v5, function20);
                }
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), topAppBarScrollBehavior0.getNestedScrollConnection(), null, 2, null);
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                d.a(v6, composer1, v6, function21);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            TistoryTopAppBarKt.TistoryCollapsingTopAppBar-88mDfTA(topAppBarScrollBehavior0, ComposableSingletons.NotificationScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), null, false, null, ComposableLambdaKt.rememberComposableLambda(0x19F54AB8, true, new o(s, function00, function01), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x22E4082F, true, new q(state1, notificationViewModel2), composer1, 54), 0L, composer1, 0x1B0030, 0x9C);
            NotificationListKt.NotificationList(notificationViewModel2, lazyPagingItems0, composer1, LazyPagingItems.$stable << 3 | 8);
            composer1.endNode();
            PullRefreshIndicatorKt.PullRefreshIndicator-jB83MbM(((Boolean)mutableState1.getValue()).booleanValue(), pullRefreshState1, modifier$Companion0, 0L, 0L, false, composer1, PullRefreshState.$stable << 3 | 0x180, 56);
            composer1.endNode();
            composer1.startReplaceGroup(0xD2BF0E46);
            if(((Boolean)state0.getValue()).booleanValue()) {
                LoadingDialogKt.LoadingDialog(composer1, 0);
            }
            composer1.endReplaceGroup();
            if(((ErrorModel)mutableState0.getValue()) != null) {
                CommonExceptionViewKt.CommonExceptionView(new ErrorModel(), true, null, ((Boolean)composer1.consume(MainAppKt.getLocalOnlineState())).booleanValue(), new r(notificationViewModel2, lazyPagingItems0), composer1, 56, 4);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            notificationViewModel1 = notificationViewModel2;
        }
        else {
            composer1.skipToGroupEnd();
            notificationViewModel1 = notificationViewModel0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(s, function00, function01, notificationViewModel1, v, v1));
        }
    }

    public static final void a(NotificationViewModel notificationViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xBC240045);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBC240045, v, -1, "com.kakao.tistory.presentation.screen.notification.InitViewModel (NotificationScreen.kt:140)");
        }
        Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        Object object1 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer1.startReplaceGroup(0xB361C9E6);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        NotificationItem notificationItem0 = (NotificationItem)mutableState0.getValue();
        composer1.startReplaceGroup(0xB361D238);
        if(notificationItem0 != null) {
            com.kakao.tistory.presentation.screen.notification.b b0 = new com.kakao.tistory.presentation.screen.notification.b(notificationViewModel0, notificationItem0);
            composer1.startReplaceGroup(1488701240);
            c c0 = composer1.rememberedValue();
            if(c0 == composer$Companion0.getEmpty()) {
                c0 = new c(mutableState0);
                composer1.updateRememberedValue(c0);
            }
            composer1.endReplaceGroup();
            DeleteBottomSheetKt.DeleteBottomSheet(b0, c0, composer1, 0x30);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(notificationViewModel0, new k(notificationViewModel0, ((LifecycleOwner)object0), ((Context)object1), mutableState0, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(notificationViewModel0, v));
        }
    }

    public static final void access$InitViewModel$lambda$14(MutableState mutableState0, NotificationItem notificationItem0) {
        mutableState0.setValue(notificationItem0);
    }

    public static final void access$NotificationScreen$lambda$2(MutableState mutableState0, ErrorModel errorModel0) {
        mutableState0.setValue(errorModel0);
    }

    public static final void access$NotificationScreen$lambda$5(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final NotificationSortItem access$NotificationScreen$lambda$8(State state0) {
        return (NotificationSortItem)state0.getValue();
    }

    public static final void access$refresh(NotificationViewModel notificationViewModel0, LazyPagingItems lazyPagingItems0) {
        notificationViewModel0.syncUserProfile();
        lazyPagingItems0.refresh();
    }
}

