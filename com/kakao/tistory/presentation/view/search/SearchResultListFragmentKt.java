package com.kakao.tistory.presentation.view.search;

import android.util.LongSparseArray;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.room.a;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.kakao.tistory.data.datasource.BaseSearchDataSource.DataType;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.SearchResultItem.BlogItem;
import com.kakao.tistory.domain.entity.SearchResultItem.Top;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.Thumbnail;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import com.kakao.tistory.presentation.widget.HighlightTextKt;
import com.kakao.tistory.presentation.widget.common.BlogFollowingKt;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import d;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A-\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A%\u0010\u000E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000BH\u0007¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006&²\u0006\u0014\u0010\u0012\u001A\n \u0011*\u0004\u0018\u00010\u00100\u00108\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0014\u001A\u00020\u00138\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0015\u001A\u00020\u00138\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0016\u001A\u00020\u00108\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u0017\u001A\u00020\u00138\nX\u008A\u0084\u0002²\u0006\f\u0010\u0018\u001A\u00020\u00138\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001A\u001A\u0004\u0018\u00010\u00198\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u001D\u001A\n\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u001B8\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u001F\u001A\n\u0012\u0004\u0012\u00020\u001E\u0018\u00010\u001B8\nX\u008A\u0084\u0002²\u0006\f\u0010!\u001A\u00020 8\nX\u008A\u0084\u0002²\u0006\u001C\u0010#\u001A\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001E\u0012\u0004\u0012\u00020\u0013\u0018\u00010\"8\nX\u008A\u0084\u0002²\u0006\f\u0010$\u001A\u00020\u00138\nX\u008A\u0084\u0002²\u0006\u000E\u0010%\u001A\u0004\u0018\u00010\u00198\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SearchViewModel;", "searchViewModel", "Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;", "topViewModel", "Lcom/kakao/tistory/presentation/viewmodel/SearchResultViewModel;", "searchResultViewModel", "", "SearchResultPager", "(Lcom/kakao/tistory/presentation/viewmodel/SearchViewModel;Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;Lcom/kakao/tistory/presentation/viewmodel/SearchResultViewModel;Landroidx/compose/runtime/Composer;II)V", "Lcom/google/accompanist/pager/PagerState;", "pagerState", "", "Lcom/kakao/tistory/presentation/view/search/ResultViewType;", "pageTypes", "SearchResultTab", "(Lcom/google/accompanist/pager/PagerState;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "", "kotlin.jvm.PlatformType", "keyword", "", "isInit", "isFromSwipe", "prevType", "dragged", "isSelected", "Lcom/kakao/tistory/domain/entity/SortItem;", "sortType", "Landroid/util/LongSparseArray;", "Lcom/kakao/tistory/domain/entity/entry/LikeState;", "updatedLike", "", "updatedComment", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entry", "Lkotlin/Pair;", "updatedBlog", "isSubscriber", "sort", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchResultListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultListFragment.kt\ncom/kakao/tistory/presentation/view/search/SearchResultListFragmentKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 14 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 15 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,442:1\n55#2,11:443\n55#2,11:454\n55#2,11:465\n488#3:476\n487#3,4:477\n491#3,2:484\n495#3:490\n488#3:550\n487#3,4:551\n491#3,2:558\n495#3:564\n1223#4,3:481\n1226#4,3:487\n1223#4,6:532\n1223#4,6:538\n1223#4,6:544\n1223#4,3:555\n1226#4,3:561\n1223#4,6:566\n1223#4,6:572\n1223#4,6:578\n487#5:486\n487#5:560\n85#6:491\n81#6,7:492\n88#6:527\n92#6:531\n78#7,6:499\n85#7,4:514\n89#7,2:524\n93#7:530\n78#7,6:592\n85#7,4:607\n89#7,2:617\n93#7:625\n78#7,6:647\n85#7,4:662\n89#7,2:672\n93#7:678\n78#7,6:684\n85#7,4:699\n89#7,2:709\n93#7:716\n368#8,9:505\n377#8:526\n378#8,2:528\n368#8,9:598\n377#8:619\n378#8,2:623\n368#8,9:653\n377#8:674\n378#8,2:676\n368#8,9:690\n377#8:711\n378#8,2:714\n4032#9,6:518\n4032#9,6:611\n4032#9,6:666\n4032#9,6:703\n148#10:565\n158#10:622\n148#10:636\n148#10:637\n148#10:638\n148#10:639\n148#10:680\n148#10:713\n71#11:584\n67#11,7:585\n74#11:620\n78#11:626\n1#12:621\n1240#13:627\n1039#13,6:628\n1313#14,2:634\n98#15:640\n95#15,6:641\n101#15:675\n105#15:679\n98#15,3:681\n101#15:712\n105#15:717\n81#16:718\n81#16:719\n107#16,2:720\n81#16:722\n107#16,2:723\n81#16:725\n107#16,2:726\n81#16:728\n81#16:729\n81#16:730\n81#16:731\n81#16:732\n81#16:733\n81#16:734\n*S KotlinDebug\n*F\n+ 1 SearchResultListFragment.kt\ncom/kakao/tistory/presentation/view/search/SearchResultListFragmentKt\n*L\n67#1:443,11\n68#1:454,11\n69#1:465,11\n80#1:476\n80#1:477,4\n80#1:484,2\n80#1:490\n144#1:550\n144#1:551,4\n144#1:558,2\n144#1:564\n80#1:481,3\n80#1:487,3\n123#1:532,6\n124#1:538,6\n125#1:544,6\n144#1:555,3\n144#1:561,3\n202#1:566,6\n280#1:572,6\n298#1:578,6\n80#1:486\n144#1:560\n95#1:491\n95#1:492,7\n95#1:527\n95#1:531\n95#1:499,6\n95#1:514,4\n95#1:524,2\n95#1:530\n305#1:592,6\n305#1:607,4\n305#1:617,2\n305#1:625\n372#1:647,6\n372#1:662,4\n372#1:672,2\n372#1:678\n425#1:684,6\n425#1:699,4\n425#1:709,2\n425#1:716\n95#1:505,9\n95#1:526\n95#1:528,2\n305#1:598,9\n305#1:619\n305#1:623,2\n372#1:653,9\n372#1:674\n372#1:676,2\n425#1:690,9\n425#1:711\n425#1:714,2\n95#1:518,6\n305#1:611,6\n372#1:666,6\n425#1:703,6\n186#1:565\n316#1:622\n374#1:636\n375#1:637\n376#1:638\n377#1:639\n428#1:680\n437#1:713\n305#1:584\n305#1:585,7\n305#1:620\n305#1:626\n358#1:627\n360#1:628,6\n364#1:634,2\n372#1:640\n372#1:641,6\n372#1:675\n372#1:679\n425#1:681,3\n425#1:712\n425#1:717\n71#1:718\n123#1:719\n123#1:720,2\n124#1:722\n124#1:723,2\n125#1:725\n125#1:726,2\n127#1:728\n199#1:729\n226#1:730\n227#1:731\n295#1:732\n298#1:733\n424#1:734\n*E\n"})
public final class SearchResultListFragmentKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SearchResultPager(@Nullable SearchViewModel searchViewModel0, @Nullable TopViewModel topViewModel0, @Nullable SearchResultViewModel searchResultViewModel0, @Nullable Composer composer0, int v, int v1) {
        SearchResultViewModel searchResultViewModel1;
        TopViewModel topViewModel1;
        SearchViewModel searchViewModel1;
        SearchResultViewModel searchResultViewModel2;
        TopViewModel topViewModel2;
        SearchViewModel searchViewModel2;
        int v5;
        TopViewModel topViewModel3;
        SearchViewModel searchViewModel3;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-1960563086);
        int v2 = (v1 & 1) == 0 ? v : v | 2;
        if((v1 & 2) != 0) {
            v2 |= 16;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        int v3 = v2;
        if((v1 & 7) != 7 || (v3 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) == 0) {
                    v4 = v3;
                    searchViewModel3 = searchViewModel0;
                }
                else {
                    composer1.startReplaceableGroup(0x671A9C9B);
                    ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, 6);
                    if(viewModelStoreOwner0 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
                    ViewModel viewModel0 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(SearchViewModel.class), viewModelStoreOwner0, null, null, creationExtras0, composer1, 0, 0);
                    composer1.endReplaceableGroup();
                    v4 = v3 & -15;
                    searchViewModel3 = (SearchViewModel)viewModel0;
                }
                if((v1 & 2) == 0) {
                    topViewModel3 = topViewModel0;
                    v5 = v4;
                }
                else {
                    composer1.startReplaceableGroup(0x671A9C9B);
                    ViewModelStoreOwner viewModelStoreOwner1 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, 6);
                    if(viewModelStoreOwner1 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras creationExtras1 = viewModelStoreOwner1 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner1).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
                    ViewModel viewModel1 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(TopViewModel.class), viewModelStoreOwner1, null, null, creationExtras1, composer1, 0, 0);
                    composer1.endReplaceableGroup();
                    topViewModel3 = (TopViewModel)viewModel1;
                    v5 = v4 & 0xFFFFFF8F;
                }
                if((v1 & 4) == 0) {
                    searchResultViewModel2 = searchResultViewModel0;
                    topViewModel2 = topViewModel3;
                    searchViewModel2 = searchViewModel3;
                    v3 = v5;
                }
                else {
                    composer1.startReplaceableGroup(0x671A9C9B);
                    ViewModelStoreOwner viewModelStoreOwner2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, 6);
                    if(viewModelStoreOwner2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras creationExtras2 = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner2).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
                    ViewModel viewModel2 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(SearchResultViewModel.class), viewModelStoreOwner2, null, null, creationExtras2, composer1, 0, 0);
                    composer1.endReplaceableGroup();
                    searchResultViewModel2 = (SearchResultViewModel)viewModel2;
                    topViewModel2 = topViewModel3;
                    searchViewModel2 = searchViewModel3;
                    v3 = v5 & -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 1) != 0) {
                    v3 &= -15;
                }
                if((v1 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    v3 &= -897;
                }
                searchViewModel2 = searchViewModel0;
                topViewModel2 = topViewModel0;
                searchResultViewModel2 = searchResultViewModel0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1960563086, v3, -1, "com.kakao.tistory.presentation.view.search.SearchResultPager (SearchResultListFragment.kt:69)");
            }
            State state0 = LiveDataAdapterKt.observeAsState(searchViewModel2.getSearchKeyword(), "", composer1, 56);
            ResultViewType resultViewType0 = searchViewModel2.isBlogSearch() ? ResultViewType.TAG : ResultViewType.BLOG;
            List list0 = CollectionsKt__CollectionsKt.listOf(new ResultViewType[]{ResultViewType.POST, resultViewType0});
            PagerState pagerState0 = PagerStateKt.rememberPagerState(0, composer1, 6, 0);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            EffectsKt.LaunchedEffect(searchViewModel2.getRedirectDestination(), new v1(searchViewModel2, list0, pagerState0, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), null), composer1, 0x40);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                d.a(v6, composer1, v6, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            SearchResultListFragmentKt.SearchResultTab(pagerState0, list0, composer1, 0);
            Pager.HorizontalPager-7SJ-wSw(list0.size(), null, pagerState0, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(0xA19F94ED, true, new w1(list0, searchViewModel2, topViewModel2, searchResultViewModel2, state0), composer1, 54), composer1, 0, 6, 0x3FA);
            composer1.endNode();
            SearchResultListFragmentKt.a(pagerState0, list0, searchViewModel2, composer1, 0x200);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            searchViewModel1 = searchViewModel2;
            topViewModel1 = topViewModel2;
            searchResultViewModel1 = searchResultViewModel2;
        }
        else {
            composer1.skipToGroupEnd();
            searchViewModel1 = searchViewModel0;
            topViewModel1 = topViewModel0;
            searchResultViewModel1 = searchResultViewModel0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x1(searchViewModel1, topViewModel1, searchResultViewModel1, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SearchResultTab(@NotNull PagerState pagerState0, @NotNull List list0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(pagerState0, "pagerState");
        Intrinsics.checkNotNullParameter(list0, "pageTypes");
        Composer composer1 = composer0.startRestartGroup(0x91683546);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x91683546, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultTab (SearchResultListFragment.kt:142)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        TabRowKt.TabRow-pAZo6Ak(pagerState0.getCurrentPage(), null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(0xAEF14AAE, true, new y1(pagerState0), composer1, 54), null, ComposableLambdaKt.rememberComposableLambda(0x4E50D8AE, true, new d2(list0, pagerState0, compositionScopedCoroutineScopeCanceller0.getCoroutineScope()), composer1, 54), composer1, 0x186180, 42);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e2(pagerState0, list0, v));
        }
    }

    public static final AnnotatedString a(String s, String s1) {
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        int v = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null));
        try {
            annotatedString$Builder0.append(s);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
        Locale locale0 = Locale.ROOT;
        String s2 = s1.toLowerCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
        Regex regex0 = new Regex(s2, RegexOption.LITERAL);
        String s3 = s.toLowerCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s3, "toLowerCase(...)");
        for(Object object0: Regex.findAll$default(regex0, s3, 0, 2, null)) {
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), ((MatchResult)object0).getRange().getFirst(), ((MatchResult)object0).getRange().getLast() + 1);
        }
        return annotatedString$Builder0.toAnnotatedString();
    }

    public static final void a(Modifier modifier0, String s, long v, Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x9D14F498);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v2 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9D14F498, v3, -1, "com.kakao.tistory.presentation.view.search.SearchCountText (SearchResultListFragment.kt:389)");
            }
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(TTextStyle.INSTANCE.getSize14Weight400()), ComposableLambdaKt.rememberComposableLambda(457017688, true, new h1(modifier0, s, v), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i1(modifier0, s, v, v1, v2));
        }
    }

    public static final void a(PagerState pagerState0, List list0, SearchViewModel searchViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2023845185);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2023845185, v, -1, "com.kakao.tistory.presentation.view.search.TrackSearchResultTiara (SearchResultListFragment.kt:121)");
        }
        composer1.startReplaceGroup(0xFCBD1657);
        MutableState mutableState0 = composer1.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        MutableState mutableState1 = b.a(composer1, -54715016);
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        MutableState mutableState2 = b.a(composer1, 0xFCBD246B);
        if(mutableState2 == composer$Companion0.getEmpty()) {
            mutableState2 = SnapshotStateKt.mutableStateOf$default(((ResultViewType)list0.get(0)).getTiaraCode(), null, 2, null);
            composer1.updateRememberedValue(mutableState2);
        }
        composer1.endReplaceGroup();
        if(((Boolean)DragInteractionKt.collectIsDraggedAsState(pagerState0.getInteractionSource(), composer1, 0).getValue()).booleanValue()) {
            mutableState1.setValue(Boolean.TRUE);
        }
        EffectsKt.LaunchedEffect(pagerState0.getCurrentPage(), new j2(list0, pagerState0, searchViewModel0, mutableState0, mutableState2, mutableState1, null), composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k2(pagerState0, list0, searchViewModel0, v));
        }
    }

    public static final void a(TopViewModel topViewModel0, Composer composer0, int v) {
        String s;
        Composer composer1 = composer0.startRestartGroup(0xB9F7DA98);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB9F7DA98, v, -1, "com.kakao.tistory.presentation.view.search.SearchSortSelector (SearchResultListFragment.kt:422)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(topViewModel0.getSelectedSortItem(), composer1, 8);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ModifierKt.noRippleClickable(modifier$Companion0, new f2(topViewModel0));
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(6.0f), Alignment.Companion.getCenterVertically(), composer1, 54);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        SortItem sortItem0 = (SortItem)state0.getValue();
        if(sortItem0 == null) {
            s = "";
        }
        else {
            s = sortItem0.getTitle();
            if(s == null) {
                s = "";
            }
        }
        TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0x1BC23D70AL, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize14Weight400(), composer1, 0xC00000, 0x180000, 0xFF7E);
        Modifier modifier2 = SizeKt.width-3ABfNKs(modifier$Companion0, 12.0f);
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_list_fold, composer1, 0), null, modifier2, null, null, 0.0f, null, composer1, 440, 120);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g2(topViewModel0, v));
        }
    }

    public static final void access$SearchBlogResult(BlogItem searchResultItem$BlogItem0, SearchResultViewModel searchResultViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x3E71401);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3E71401, v, -1, "com.kakao.tistory.presentation.view.search.SearchBlogResult (SearchResultListFragment.kt:293)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(searchResultViewModel0.getUpdatedBlog(), composer1, 8);
        Blog blog0 = searchResultItem$BlogItem0 == null ? null : searchResultItem$BlogItem0.getBlogItem();
        if(blog0 != null) {
            composer1.startReplaceGroup(0x59A5F050);
            boolean z = composer1.changed(blog0.getId());
            State state1 = composer1.rememberedValue();
            if(z || state1 == Composer.Companion.getEmpty()) {
                state1 = SnapshotStateKt.derivedStateOf(new f1(blog0, state0));
                composer1.updateRememberedValue(state1);
            }
            composer1.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            blog0.setSubscriber(((Boolean)state1.getValue()).booleanValue());
            BlogFollowingKt.BlogFollowing(blog0, !searchResultViewModel0.hasBlogRole(blog0.getName()), new d1(searchResultViewModel0), new e1(searchResultViewModel0), composer1, 8, 0);
            DividerKt.HorizontalDivider-9IZ8Weo(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getBottomCenter()), 0.5f, ColorResources_androidKt.colorResource(color.gray4, composer1, 0), composer1, 0x30, 0);
            composer1.endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g1(searchResultItem$BlogItem0, searchResultViewModel0, v));
        }
    }

    public static final Pair access$SearchBlogResult$lambda$17(State state0) {
        return (Pair)state0.getValue();
    }

    public static final void access$SearchPostResult(int v, EntryItem entryItem0, String s, boolean z, SearchResultViewModel searchResultViewModel0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(564940195);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(564940195, v1, -1, "com.kakao.tistory.presentation.view.search.SearchPostResult (SearchResultListFragment.kt:329)");
        }
        j1 j10 = new j1(searchResultViewModel0, v, entryItem0);
        composer1.startReplaceGroup(833439022);
        ThumbnailUiState thumbnailUiState0 = null;
        ComposableLambda composableLambda0 = z ? null : ComposableLambdaKt.rememberComposableLambda(0x2C38E513, true, new l1(entryItem0, searchResultViewModel0), composer1, 54);
        composer1.endReplaceGroup();
        String s1 = entryItem0.getTitle();
        if(s1 == null) {
            s1 = "";
        }
        AnnotatedString annotatedString0 = SearchResultListFragmentKt.a(s1, s);
        AnnotatedString annotatedString1 = SearchResultListFragmentKt.a((entryItem0.getSummary() == null ? "" : entryItem0.getSummary()), s);
        Thumbnail thumbnail0 = entryItem0.getThumbnail();
        if(thumbnail0 != null) {
            thumbnailUiState0 = ThumbnailUiStateKt.toItem(thumbnail0);
        }
        String s2 = entryItem0.getPublished();
        EntryListKt.EntryListItem(j10, null, false, null, composableLambda0, annotatedString0, annotatedString1, thumbnailUiState0, ((int)entryItem0.getLikeCount()), ((int)entryItem0.getCommentCount()), (s2 == null ? "" : s2), false, null, composer1, 0, 0, 0x180E);
        ListItemDividerKt.ListItemDivider-rAjV9yQ(false, 0.0f, composer1, 0, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m1(v, entryItem0, s, z, searchResultViewModel0, v1));
        }
    }

    public static final void access$SearchResultList(LazyPagingItems lazyPagingItems0, String s, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x30788142);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x30788142, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultList (SearchResultListFragment.kt:224)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(searchResultViewModel0.getUpdatedLikeStates(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(searchResultViewModel0.getUpdatedCommentCounts(), composer1, 8);
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, null, false, null, null, null, false, new o1(lazyPagingItems0, topViewModel0, searchResultViewModel0, s, state0, state1), composer1, 6, 0xFE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p1(lazyPagingItems0, s, topViewModel0, searchResultViewModel0, v));
        }
    }

    public static final LongSparseArray access$SearchResultList$lambda$14(State state0) {
        return (LongSparseArray)state0.getValue();
    }

    public static final LongSparseArray access$SearchResultList$lambda$15(State state0) {
        return (LongSparseArray)state0.getValue();
    }

    public static final void access$SearchResultPage(String s, String s1, DataType baseSearchDataSource$DataType0, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA3B5D7F8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA3B5D7F8, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultPage (SearchResultListFragment.kt:197)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(topViewModel0.getSelectedSortItem(), composer1, 8);
        int v1 = 0;
        SwipeRefreshState swipeRefreshState0 = SwipeRefreshKt.rememberSwipeRefreshState(false, composer1, 6);
        SortItem sortItem0 = (SortItem)state0.getValue();
        composer1.startReplaceGroup(0x6DE9FEE4);
        int v2 = ((v & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(baseSearchDataSource$DataType0)) && (v & 0x180) != 0x100 ? 0 : 1;
        int v3 = ((6 ^ v & 14) <= 4 || !composer1.changed(s)) && (v & 6) != 4 ? 0 : 1;
        if((v & 0x70 ^ 0x30) > 0x20 && composer1.changed(s1) || (v & 0x30) == 0x20) {
            v1 = 1;
        }
        boolean z = composer1.changed(sortItem0);
        Flow flow0 = composer1.rememberedValue();
        if((v1 | (v3 | v2) | z) != 0 || flow0 == Composer.Companion.getEmpty()) {
            SortItem sortItem1 = (SortItem)state0.getValue();
            flow0 = searchResultViewModel0.getSearchResultFlow(baseSearchDataSource$DataType0, s, s1, (sortItem1 == null ? null : sortItem1.getType()));
            composer1.updateRememberedValue(flow0);
        }
        composer1.endReplaceGroup();
        LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(flow0, null, composer1, 8, 1);
        CompositionLocalKt.CompositionLocalProvider(HighlightTextKt.getLocalHighlightTargetQuery().provides(s), ComposableLambdaKt.rememberComposableLambda(0x9388DCB8, true, new s1(swipeRefreshState0, lazyPagingItems0, s, topViewModel0, searchResultViewModel0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t1(s, s1, baseSearchDataSource$DataType0, topViewModel0, searchResultViewModel0, v));
        }
    }

    public static final String access$SearchResultPager$lambda$0(State state0) {
        return (String)state0.getValue();
    }

    public static final void access$SearchTabIndicator-i1RSzL4(float f, float f1, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(367414120);
        int v1 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(f1) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(367414120, v1, -1, "com.kakao.tistory.presentation.view.search.SearchTabIndicator (SearchResultListFragment.kt:180)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.size-VpY3zN4(OffsetKt.offset-VpY3zN4$default(SizeKt.wrapContentSize$default(Modifier.Companion, Alignment.Companion.getBottomStart(), false, 2, null), f1, 0.0f, 2, null), f, 1.0f), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h2(f, f1, v));
        }
    }

    public static final void access$SearchTop(Top searchResultItem$Top0, TopViewModel topViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1251108973);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1251108973, v, -1, "com.kakao.tistory.presentation.view.search.SearchTop (SearchResultListFragment.kt:369)");
        }
        if(searchResultItem$Top0 != null) {
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0(modifier$Companion0, 20.0f, 17.0f, 20.0f, 5.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            SearchResultListFragmentKt.a(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), searchResultItem$Top0.getBlogName(), searchResultItem$Top0.getTotalCount(), composer1, 0, 0);
            composer1.startReplaceGroup(-213310179);
            if(searchResultItem$Top0.isShowSortSelector()) {
                SearchResultListFragmentKt.a(topViewModel0, composer1, 8);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i2(searchResultItem$Top0, topViewModel0, v));
        }
    }

    public static final void access$TrackSearchResultTiara$lambda$10(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }

    public static final boolean access$TrackSearchResultTiara$lambda$3(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$TrackSearchResultTiara$lambda$4(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final boolean access$TrackSearchResultTiara$lambda$6(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$TrackSearchResultTiara$lambda$7(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final String access$TrackSearchResultTiara$lambda$9(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    public static final State access$getUpdatedEntry(EntryItem entryItem0, long v, long v1, Composer composer0, int v2) {
        composer0.startReplaceGroup(-1041839309);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1041839309, v2, -1, "com.kakao.tistory.presentation.view.search.getUpdatedEntry (SearchResultListFragment.kt:278)");
        }
        composer0.startReplaceGroup(0xC831EFC9);
        int v3 = 0;
        int v4 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(entryItem0)) && (v2 & 6) != 4 ? 0 : 1;
        int v5 = ((v2 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(v)) && (v2 & 0x30) != 0x20 ? 0 : 1;
        if((v2 & 0x380 ^ 0x180) > 0x100 && composer0.changed(v1) || (v2 & 0x180) == 0x100) {
            v3 = 1;
        }
        State state0 = composer0.rememberedValue();
        if((v4 | v5 | v3) != 0 || state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new l2(entryItem0, v, v1));
            composer0.updateRememberedValue(state0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }
}

