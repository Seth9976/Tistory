package com.kakao.tistory.presentation.screen.blog.noticeList;

import a;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.blog.BlogConsumeEventKt;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogUiState;
import com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryModifyBottomSheetKt;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListUiState;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.DialogType.Alert;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.DialogType.Delete;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.DialogType;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.NoticeBottomSheet.Modify;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.NoticeBottomSheet;
import com.kakao.tistory.presentation.screen.item.ViewState;
import com.kakao.tistory.presentation.view.common.PagingItemListKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import com.kakao.tistory.presentation.widget.dialog.AlertDialogData;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A)\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0010²\u0006\f\u0010\n\u001A\u00020\t8\nX\u008A\u0084\u0002²\u0006\f\u0010\f\u001A\u00020\u000B8\nX\u008A\u0084\u0002²\u0006\u0012\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "navActions", "Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;", "blogViewModel", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListViewModel;", "blogNoticeListViewModel", "", "BlogNoticeScreen", "(Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;Lcom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListViewModel;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "blogState", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListUiState;", "uiState", "Landroidx/paging/ItemSnapshotList;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "snapshotList", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogNoticeListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogNoticeListScreen.kt\ncom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,193:1\n46#2,7:194\n86#3,6:201\n1223#4,6:207\n85#5:213\n82#5,6:214\n88#5:248\n92#5:252\n78#6,6:220\n85#6,4:235\n89#6,2:245\n93#6:251\n368#7,9:226\n377#7:247\n378#7,2:249\n4032#8,6:239\n77#9:253\n81#10:254\n81#10:255\n81#10:256\n*S KotlinDebug\n*F\n+ 1 BlogNoticeListScreen.kt\ncom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListScreenKt\n*L\n46#1:194,7\n46#1:201,6\n53#1:207,6\n140#1:213\n140#1:214,6\n140#1:248\n140#1:252\n140#1:220,6\n140#1:235,4\n140#1:245,2\n140#1:251\n140#1:226,9\n140#1:247\n140#1:249,2\n140#1:239,6\n176#1:253\n48#1:254\n49#1:255\n159#1:256\n*E\n"})
public final class BlogNoticeListScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogNoticeScreen(@NotNull NavActions navActions0, @NotNull BlogViewModel blogViewModel0, @Nullable BlogNoticeListViewModel blogNoticeListViewModel0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        BlogNoticeListViewModel blogNoticeListViewModel1;
        Intrinsics.checkNotNullParameter(navActions0, "navActions");
        Intrinsics.checkNotNullParameter(blogViewModel0, "blogViewModel");
        Composer composer1 = composer0.startRestartGroup(-1585980022);
        if((v1 & 4) == 0) {
            blogNoticeListViewModel1 = blogNoticeListViewModel0;
            v2 = v;
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
            ViewModel viewModel0 = ViewModelKt.viewModel(BlogNoticeListViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            blogNoticeListViewModel1 = (BlogNoticeListViewModel)viewModel0;
            v2 = v & -897;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1585980022, v2, -1, "com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeScreen (BlogNoticeListScreen.kt:46)");
        }
        LazyPagingItems lazyPagingItems0 = null;
        State state0 = SnapshotStateKt.collectAsState(blogViewModel0.getUiState(), null, composer1, 8, 1);
        State state1 = SnapshotStateKt.collectAsState(blogNoticeListViewModel1.getUiState(), null, composer1, 8, 1);
        ViewState viewState0 = ((BlogUiState)state0.getValue()).getState();
        composer1.startReplaceGroup(1160516802);
        boolean z = composer1.changed(viewState0);
        boolean z1 = (v & 14 ^ 6) > 4 && composer1.changed(navActions0) || (v & 6) == 4;
        boolean z2 = composer1.changed(state1);
        e e0 = composer1.rememberedValue();
        if((z | z1 | z2) != 0 || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(viewState0, navActions0, state1, null);
            composer1.updateRememberedValue(e0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(viewState0, e0, composer1, 0x40);
        Flow flow0 = ((BlogNoticeListUiState)state1.getValue()).getNoticeList();
        composer1.startReplaceGroup(0x452C3260);
        if(flow0 != null) {
            lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(flow0, null, composer1, 8, 1);
        }
        composer1.endReplaceGroup();
        PullToRefreshKt.PullToRefreshBox(PagingItemListKt.isRefreshing(lazyPagingItems0), new f(lazyPagingItems0), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-324891420, true, new g(lazyPagingItems0, navActions0, state1), composer1, 54), composer1, 0x180000, 60);
        NoticeBottomSheet noticeBottomSheet0 = ((BlogNoticeListUiState)state1.getValue()).getBottomSheet();
        composer1.startReplaceGroup(1160545202);
        if(noticeBottomSheet0 != null) {
            composer1.startReplaceGroup(1160545630);
            if(noticeBottomSheet0 instanceof Modify) {
                EntryVisibilityType entryVisibilityType0 = ((Modify)noticeBottomSheet0).getVisibilityType();
                List list0 = CollectionsKt__CollectionsKt.listOf(new EntryVisibilityType[]{EntryVisibilityType.PUBLIC, EntryVisibilityType.PRIVATE});
                h h0 = new h(noticeBottomSheet0, state1);
                i i0 = new i(noticeBottomSheet0, state1);
                j j0 = new j(noticeBottomSheet0, state1);
                k k0 = new k(noticeBottomSheet0, state1);
                Function0 function00 = ((BlogNoticeListUiState)state1.getValue()).getOnDismissBottomSheet();
                BlogEntryModifyBottomSheetKt.BlogEntryModifyBottomSheet(entryVisibilityType0, list0, h0, i0, j0, k0, l.a, function00, composer1, 0x180030, 0);
            }
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        DialogType dialogType0 = ((BlogNoticeListUiState)state1.getValue()).getDialog();
        composer1.startReplaceGroup(0x452CFB22);
        if(dialogType0 != null) {
            if(dialogType0 instanceof Alert) {
                composer1.startReplaceGroup(0x42207927);
                TistoryComposeDialogKt.TistoryAlertDialog(((AlertDialogData)dialogType0), ((BlogNoticeListUiState)state1.getValue()).getOnDismissDialog(), composer1, 0);
            }
            else if(dialogType0 instanceof Delete) {
                composer1.startReplaceGroup(0x1F075B5);
                String s = StringResources_androidKt.stringResource(string.label_dialog_entry_delete, composer1, 0);
                int v3 = string.label_dialog_delete;
                TistoryComposeDialogKt.TistoryAlertDialog(s, null, true, ((BlogNoticeListUiState)state1.getValue()).getOnDismissDialog(), 0, v3, true, false, null, new m(dialogType0, state1), composer1, 0x180180, 402);
            }
            else {
                composer1.startReplaceGroup(0x1F8B49D);
            }
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(1160598730);
        if(PagingItemListKt.isLoading(lazyPagingItems0)) {
            LoadingDialogKt.LoadingDialog(composer1, 0);
        }
        composer1.endReplaceGroup();
        int v4 = v2 << 3 & 0x70 | 8;
        BlogConsumeEventKt.BlogConsumeEvent(blogViewModel0, navActions0, composer1, v4);
        BlogNoticeListScreenKt.a(blogNoticeListViewModel1, navActions0, composer1, v4);
        BlogNoticeListTiara.INSTANCE.TrackPage(composer1, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(navActions0, blogViewModel0, blogNoticeListViewModel1, v, v1));
        }
    }

    public static final void a(BlogNoticeListViewModel blogNoticeListViewModel0, NavActions navActions0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1201953156);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1201953156, v, -1, "com.kakao.tistory.presentation.screen.blog.noticeList.ConsumeEvent (BlogNoticeListScreen.kt:174)");
        }
        Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        EffectsKt.LaunchedEffect(blogNoticeListViewModel0, new p(blogNoticeListViewModel0, navActions0, ((Context)object0), (((Context)object0) instanceof Activity ? ((Activity)(((Context)object0))) : null), null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(blogNoticeListViewModel0, navActions0, v));
        }
    }

    public static final void access$BlogNoticeContent(LazyPagingItems lazyPagingItems0, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA68C8DB);
        int v1 = (v & 14) == 0 ? (composer1.changed(lazyPagingItems0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA68C8DB, v1, -1, "com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeContent (BlogNoticeListScreen.kt:136)");
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
            TistoryTopAppBarKt.TistoryCollapsingTopAppBar-88mDfTA(topAppBarScrollBehavior0, ComposableSingletons.BlogNoticeListScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), ComposableLambdaKt.rememberComposableLambda(401353509, true, new com.kakao.tistory.presentation.screen.blog.noticeList.a(lazyPagingItems0), composer1, 54), false, ComposableLambdaKt.rememberComposableLambda(0xF0587327, true, new b(function00), composer1, 54), null, null, 0L, composer1, 25008, 0xE8);
            composer1.startReplaceGroup(665640920);
            if(lazyPagingItems0 != null) {
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new c(lazyPagingItems0, PagingItemListKt.rememberPagingSnapshot(lazyPagingItems0, composer1, v1 & 14 | LazyPagingItems.$stable)), composer1, 0, 0xFF);
            }
            if(com.kakao.tistory.presentation.design.ui.list.m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.blog.noticeList.d(lazyPagingItems0, function00, v));
        }
    }

    public static final ItemSnapshotList access$BlogNoticeContent$lambda$6$lambda$5(State state0) {
        return (ItemSnapshotList)state0.getValue();
    }

    public static final BlogNoticeListUiState access$BlogNoticeScreen$lambda$1(State state0) {
        return (BlogNoticeListUiState)state0.getValue();
    }
}

