package com.kakao.tistory.presentation.screen.feed;

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
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.main.MainAppKt;
import com.kakao.tistory.presentation.screen.feed.tiara.FeedTiara;
import com.kakao.tistory.presentation.screen.feed.ui.FeedListKt;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001A?\u0010\b\u001A\u00020\u00032\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0013²\u0006\u0010\u0010\u000B\u001A\u0004\u0018\u00010\n8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\r\u001A\u00020\f8\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u000E\u001A\u00020\f8\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u0011\u001A\n \u0010*\u0004\u0018\u00010\u000F0\u000F8\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u0012\u001A\n \u0010*\u0004\u0018\u00010\u000F0\u000F8\nX\u008A\u0084\u0002"}, d2 = {"", "blogImageUrl", "Lkotlin/Function0;", "", "onClickSearch", "onClickBlogSwitch", "Lcom/kakao/tistory/presentation/screen/feed/FeedViewModel;", "feedViewModel", "FeedScreen", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/feed/FeedViewModel;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "", "isRefreshing", "showLoading", "", "kotlin.jvm.PlatformType", "followingCount", "followerCount", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFeedScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedScreen.kt\ncom/kakao/tistory/presentation/screen/feed/FeedScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,206:1\n46#2,7:207\n86#3,6:214\n1223#4,6:220\n1223#4,6:226\n1223#4,6:232\n71#5:238\n69#5,5:239\n74#5:272\n78#5:316\n78#6,6:244\n85#6,4:259\n89#6,2:269\n78#6,6:280\n85#6,4:295\n89#6,2:305\n93#6:311\n93#6:315\n368#7,9:250\n377#7:271\n368#7,9:286\n377#7:307\n378#7,2:309\n378#7,2:313\n4032#8,6:263\n4032#8,6:299\n85#9:273\n82#9,6:274\n88#9:308\n92#9:312\n77#10:317\n77#10:318\n77#10:319\n77#10:320\n81#11:321\n107#11,2:322\n81#11:324\n107#11,2:325\n81#11:327\n81#11:328\n81#11:329\n*S KotlinDebug\n*F\n+ 1 FeedScreen.kt\ncom/kakao/tistory/presentation/screen/feed/FeedScreenKt\n*L\n54#1:207,7\n54#1:214,6\n66#1:220,6\n68#1:226,6\n69#1:232,6\n89#1:238\n89#1:239,5\n89#1:272\n89#1:316\n89#1:244,6\n89#1:259,4\n89#1:269,2\n95#1:280,6\n95#1:295,4\n95#1:305,2\n95#1:311\n89#1:315\n89#1:250,9\n89#1:271\n95#1:286,9\n95#1:307\n95#1:309,2\n89#1:313,2\n89#1:263,6\n95#1:299,6\n95#1:273\n95#1:274,6\n95#1:308\n95#1:312\n141#1:317\n157#1:318\n165#1:319\n166#1:320\n66#1:321\n66#1:322,2\n68#1:324\n68#1:325,2\n69#1:327\n86#1:328\n87#1:329\n*E\n"})
public final class FeedScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void FeedScreen(@Nullable String s, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable FeedViewModel feedViewModel0, @Nullable Composer composer0, int v, int v1) {
        FeedViewModel feedViewModel1;
        State state3;
        FeedViewModel feedViewModel2;
        int v4;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClickSearch");
        Intrinsics.checkNotNullParameter(function01, "onClickBlogSwitch");
        Composer composer1 = composer0.startRestartGroup(0x9DA22F43);
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
                feedViewModel2 = feedViewModel0;
            }
            else if((v1 & 8) == 0) {
                v4 = v3;
                feedViewModel2 = feedViewModel0;
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
                ViewModel viewModel0 = ViewModelKt.viewModel(FeedViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
                feedViewModel2 = (FeedViewModel)viewModel0;
                v4 = v3 & 0xFFFFE3FF;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9DA22F43, v4, -1, "com.kakao.tistory.presentation.screen.feed.FeedScreen (FeedScreen.kt:54)");
            }
            FeedTiara.INSTANCE.TrackPage(composer1, 6);
            FeedTiara.INSTANCE.TrackUsage(composer1, 6);
            FeedScreenKt.a(feedViewModel2, composer1, 8);
            TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(null, null, null, null, composer1, TopAppBarDefaults.$stable << 12, 15);
            LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(feedViewModel2.getFeedList(), null, composer1, 8, 1);
            composer1.startReplaceGroup(0xD3E0F9B4);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableState mutableState1 = b.a(composer1, -740228440);
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            State state0 = b.a(composer1, 0xD3E10B11);
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new n(lazyPagingItems0, mutableState0, mutableState1));
                composer1.updateRememberedValue(state0);
            }
            composer1.endReplaceGroup();
            PullRefreshState pullRefreshState0 = PullRefreshStateKt.rememberPullRefreshState-UuyPYSY(((Boolean)mutableState1.getValue()).booleanValue(), new m(feedViewModel2, lazyPagingItems0, mutableState1), 0.0f, 0.0f, composer1, 0, 12);
            State state1 = LiveDataAdapterKt.observeAsState(feedViewModel2.getFollowingCount(), 0L, composer1, 56);
            State state2 = LiveDataAdapterKt.observeAsState(feedViewModel2.getFollowerCount(), 0L, composer1, 56);
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
                state3 = state1;
                d.a(v5, composer1, v5, function20);
            }
            else {
                state3 = state1;
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
            TistoryTopAppBarKt.TistoryCollapsingTopAppBar-88mDfTA(topAppBarScrollBehavior0, ComposableSingletons.FeedScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), null, false, null, ComposableLambdaKt.rememberComposableLambda(1530606584, true, new com.kakao.tistory.presentation.screen.feed.d(s, function00, function01), composer1, 54), ComposableLambdaKt.rememberComposableLambda(-1937404561, true, new g(feedViewModel2, state3, state2), composer1, 54), 0L, composer1, 0x1B0030, 0x9C);
            FeedListKt.FeedList(lazyPagingItems0, feedViewModel2, !((Boolean)state0.getValue()).booleanValue(), composer1, LazyPagingItems.$stable | 0x40);
            composer1.endNode();
            PullRefreshIndicatorKt.PullRefreshIndicator-jB83MbM(((Boolean)mutableState1.getValue()).booleanValue(), pullRefreshState0, modifier$Companion0, 0L, 0L, false, composer1, PullRefreshState.$stable << 3 | 0x180, 56);
            composer1.endNode();
            composer1.startReplaceGroup(-740154458);
            if(((Boolean)state0.getValue()).booleanValue()) {
                LoadingDialogKt.LoadingDialog(composer1, 0);
            }
            composer1.endReplaceGroup();
            feedViewModel1 = feedViewModel2;
            j j0 = new j(feedViewModel1, ((LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())), lazyPagingItems0, null);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, j0, composer1, 70);
            if(((ErrorModel)mutableState0.getValue()) != null) {
                CommonExceptionViewKt.CommonExceptionView(new ErrorModel(), true, null, ((Boolean)composer1.consume(MainAppKt.getLocalOnlineState())).booleanValue(), new k(feedViewModel1, lazyPagingItems0), composer1, 56, 4);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            feedViewModel1 = feedViewModel0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(s, function00, function01, feedViewModel1, v, v1));
        }
    }

    public static final void a(FeedViewModel feedViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF91A0D12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF91A0D12, v, -1, "com.kakao.tistory.presentation.screen.feed.InitViewModel (FeedScreen.kt:163)");
        }
        EffectsKt.LaunchedEffect(feedViewModel0, new w(feedViewModel0, ((LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())), ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(feedViewModel0, v));
        }
    }

    public static final void access$FeedScreen$lambda$2(MutableState mutableState0, ErrorModel errorModel0) {
        mutableState0.setValue(errorModel0);
    }

    public static final void access$FeedScreen$lambda$5(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final Long access$FeedScreen$lambda$8(State state0) {
        return (Long)state0.getValue();
    }

    public static final Long access$FeedScreen$lambda$9(State state0) {
        return (Long)state0.getValue();
    }

    public static final void access$refresh(FeedViewModel feedViewModel0, LazyPagingItems lazyPagingItems0) {
        feedViewModel0.refresh();
        lazyPagingItems0.refresh();
    }
}

