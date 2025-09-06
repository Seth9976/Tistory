package com.kakao.tistory.presentation.view.setting.notice;

import a;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.view.common.PagingItemListKt;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListUiState;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@AndroidEntryPoint
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0010²\u0006\f\u0010\n\u001A\u00020\t8\nX\u008A\u0084\u0002²\u0006\f\u0010\f\u001A\u00020\u000B8\nX\u008A\u0084\u0002²\u0006\u0012\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/SettingNoticeListActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryAppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "isOnline", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListUiState;", "uiState", "Landroidx/paging/ItemSnapshotList;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeEntry;", "snapshotList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingNoticeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingNoticeListActivity.kt\ncom/kakao/tistory/presentation/view/setting/notice/SettingNoticeListActivity\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,179:1\n46#2,7:180\n86#3,6:187\n85#4:193\n82#4,6:194\n88#4:228\n92#4:232\n78#5,6:200\n85#5,4:215\n89#5,2:225\n93#5:231\n368#6,9:206\n377#6:227\n378#6,2:229\n4032#7,6:219\n81#8:233\n81#8:234\n*S KotlinDebug\n*F\n+ 1 SettingNoticeListActivity.kt\ncom/kakao/tistory/presentation/view/setting/notice/SettingNoticeListActivity\n*L\n84#1:180,7\n84#1:187,6\n126#1:193\n126#1:194,6\n126#1:228\n126#1:232\n126#1:200,6\n126#1:215,4\n126#1:225,2\n126#1:231\n126#1:206,9\n126#1:227\n126#1:229,2\n126#1:219,6\n86#1:233\n142#1:234\n*E\n"})
public final class SettingNoticeListActivity extends Hilt_SettingNoticeListActivity {
    public static final int $stable;

    public static final void access$ConsumeEvent(SettingNoticeListActivity settingNoticeListActivity0, Flow flow0, Composer composer0, int v) {
        settingNoticeListActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xCC446011);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCC446011, v, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.ConsumeEvent (SettingNoticeListActivity.kt:167)");
        }
        EffectsKt.LaunchedEffect(flow0, new e(flow0, settingNoticeListActivity0, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(settingNoticeListActivity0, flow0, v));
        }
    }

    public static final void access$SettingNoticeContent(SettingNoticeListActivity settingNoticeListActivity0, LazyPagingItems lazyPagingItems0, Function0 function00, Composer composer0, int v) {
        settingNoticeListActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xF8F46CCA);
        int v1 = (v & 14) == 0 ? (composer1.changed(lazyPagingItems0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF8F46CCA, v1, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.SettingNoticeContent (SettingNoticeListActivity.kt:122)");
            }
            TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(null, null, null, null, composer1, TopAppBarDefaults.$stable << 12, 15);
            Modifier modifier0 = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), topAppBarScrollBehavior0.getNestedScrollConnection(), null, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TistoryTopAppBarKt.TistoryCollapsingTopAppBar-88mDfTA(topAppBarScrollBehavior0, ComposableSingletons.SettingNoticeListActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), null, false, ComposableLambdaKt.rememberComposableLambda(0x2CED81FE, true, new g(function00), composer1, 54), null, null, 0L, composer1, 0x6030, 0xEC);
            composer1.startReplaceGroup(1138013719);
            if(lazyPagingItems0 != null) {
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new h(lazyPagingItems0, PagingItemListKt.rememberPagingSnapshot(lazyPagingItems0, composer1, LazyPagingItems.$stable | v1 & 14)), composer1, 0, 0xFF);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(settingNoticeListActivity0, lazyPagingItems0, function00, v));
        }
    }

    public static final ItemSnapshotList access$SettingNoticeContent$lambda$2$lambda$1(State state0) {
        return (ItemSnapshotList)state0.getValue();
    }

    public static final void access$SettingNoticeScreen(SettingNoticeListActivity settingNoticeListActivity0, Function0 function00, Modifier modifier0, SettingNoticeListViewModel settingNoticeListViewModel0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        SettingNoticeListViewModel settingNoticeListViewModel1;
        int v3;
        int v2;
        settingNoticeListActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(-1641805340);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(settingNoticeListActivity0) ? 0x800 : 0x400);
        }
        if((v1 & 4) != 4 || (v2 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) == 0) {
                    settingNoticeListViewModel1 = settingNoticeListViewModel0;
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
                    ViewModel viewModel0 = ViewModelKt.viewModel(SettingNoticeListViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
                    composer1.endReplaceableGroup();
                    composer1.endReplaceableGroup();
                    v2 &= -897;
                    settingNoticeListViewModel1 = (SettingNoticeListViewModel)viewModel0;
                }
                v3 = v2;
                modifier1 = modifier2;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                settingNoticeListViewModel1 = settingNoticeListViewModel0;
                v3 = v2;
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1641805340, v3, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.SettingNoticeScreen (SettingNoticeListActivity.kt:84)");
            }
            Flow flow0 = ((SettingNoticeListUiState)SnapshotStateKt.collectAsState(settingNoticeListViewModel1.getUiState(), null, composer1, 8, 1).getValue()).getNoticeList();
            composer1.startReplaceGroup(0xE58CC6D8);
            LazyPagingItems lazyPagingItems0 = flow0 == null ? null : LazyPagingItemsKt.collectAsLazyPagingItems(flow0, null, composer1, 8, 1);
            composer1.endReplaceGroup();
            PullToRefreshKt.PullToRefreshBox(PagingItemListKt.isRefreshing(lazyPagingItems0), new j(lazyPagingItems0), modifier1, null, null, null, ComposableLambdaKt.rememberComposableLambda(0xF21662BE, true, new l(lazyPagingItems0, settingNoticeListActivity0, function00), composer1, 54), composer1, v3 << 3 & 0x380 | 0x180000, 56);
            composer1.startReplaceGroup(0xE58D17C0);
            if(PagingItemListKt.isLoading(lazyPagingItems0)) {
                LoadingDialogKt.LoadingDialog(composer1, 0);
            }
            composer1.endReplaceGroup();
            Flow flow1 = settingNoticeListViewModel1.getEvent();
            int v4 = v3 >> 6 & 0x70 | 8;
            Composer composer2 = composer1.startRestartGroup(0xCC446011);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCC446011, v4, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.ConsumeEvent (SettingNoticeListActivity.kt:167)");
            }
            EffectsKt.LaunchedEffect(flow1, new e(flow1, settingNoticeListActivity0, null), composer2, 72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer2.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new f(settingNoticeListActivity0, flow1, v4));
            }
            SettingNoticeTiara.INSTANCE.TrackPage(composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            settingNoticeListViewModel1 = settingNoticeListViewModel0;
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new com.kakao.tistory.presentation.view.setting.notice.m(settingNoticeListActivity0, function00, modifier1, settingNoticeListViewModel1, v, v1));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        SystemBarStyle systemBarStyle0 = SystemBarStyle.Companion.light(-1, -1);
        int v = ColorKt.toArgb-8_81llA(0L);
        int v1 = ColorKt.toArgb-8_81llA(0L);
        EdgeToEdge.enable(this, systemBarStyle0, SystemBarStyle.Companion.light(v, v1));
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2022688205, true, new r(this)), 1, null);
    }
}

