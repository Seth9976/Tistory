package com.kakao.tistory.presentation.view.search;

import a;
import androidx.annotation.StringRes;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.kakao.tistory.domain.entity.SearchItem.Bottom;
import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.HighlightTextKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import com.kakao.tistory.presentation.widget.common.VerticalDividerKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0019\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A#\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0001\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u0015²\u0006\u000E\u0010\f\u001A\u0004\u0018\u00010\u000B8\nX\u008A\u0084\u0002²\u0006\f\u0010\u000E\u001A\u00020\r8\nX\u008A\u0084\u0002²\u0006 \u0010\u0012\u001A\u0016\u0012\u0004\u0012\u00020\u0010 \u0011*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000F0\u000F8\nX\u008A\u0084\u0002²\u0006\f\u0010\u0013\u001A\u00020\r8\nX\u008A\u0084\u0002²\u0006\f\u0010\u0014\u001A\u00020\r8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SearchViewModel;", "searchViewModel", "", "SearchKeywordPage", "(Lcom/kakao/tistory/presentation/viewmodel/SearchViewModel;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "stringRes", "SearchEmptyView", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "", "searchKeyword", "", "isShowActionbarDivider", "", "Lcom/kakao/tistory/domain/entity/SearchItem;", "kotlin.jvm.PlatformType", "suggestItems", "dragged", "isSameKeyword", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchKeywordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchKeywordFragment.kt\ncom/kakao/tistory/presentation/view/search/SearchKeywordFragmentKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,246:1\n55#2,11:247\n71#3:258\n67#3,7:259\n74#3:294\n78#3:298\n71#3:407\n68#3,6:408\n74#3:442\n78#3:448\n78#4,6:266\n85#4,4:281\n89#4,2:291\n93#4:297\n78#4,6:323\n85#4,4:338\n89#4,2:348\n93#4:356\n78#4,6:367\n85#4,4:382\n89#4,2:392\n93#4:401\n78#4,6:414\n85#4,4:429\n89#4,2:439\n93#4:447\n368#5,9:272\n377#5:293\n378#5,2:295\n368#5,9:329\n377#5:350\n378#5,2:354\n368#5,9:373\n377#5:394\n378#5,2:399\n368#5,9:420\n377#5:441\n378#5,2:445\n4032#6,6:285\n4032#6,6:342\n4032#6,6:386\n4032#6,6:433\n1223#7,6:299\n1223#7,6:307\n158#8:305\n148#8:313\n148#8:314\n148#8:315\n158#8:352\n148#8:353\n148#8:358\n148#8:359\n158#8:396\n148#8:397\n158#8:398\n148#8:403\n148#8:404\n148#8:405\n148#8:406\n77#9:306\n98#10:316\n95#10,6:317\n101#10:351\n105#10:357\n98#10:360\n95#10,6:361\n101#10:395\n105#10:402\n95#11,2:443\n81#12:449\n81#12:450\n81#12:451\n81#12:452\n81#12:453\n*S KotlinDebug\n*F\n+ 1 SearchKeywordFragment.kt\ncom/kakao/tistory/presentation/view/search/SearchKeywordFragmentKt\n*L\n44#1:247,11\n48#1:258\n48#1:259,7\n48#1:294\n48#1:298\n231#1:407\n231#1:408,6\n231#1:442\n231#1:448\n48#1:266,6\n48#1:281,4\n48#1:291,2\n48#1:297\n144#1:323,6\n144#1:338,4\n144#1:348,2\n144#1:356\n193#1:367,6\n193#1:382,4\n193#1:392,2\n193#1:401\n231#1:414,6\n231#1:429,4\n231#1:439,2\n231#1:447\n48#1:272,9\n48#1:293\n48#1:295,2\n144#1:329,9\n144#1:350\n144#1:354,2\n193#1:373,9\n193#1:394\n193#1:399,2\n231#1:420,9\n231#1:441\n231#1:445,2\n48#1:285,6\n144#1:342,6\n193#1:386,6\n231#1:433,6\n68#1:299,6\n119#1:307,6\n76#1:305\n127#1:313\n146#1:314\n147#1:315\n155#1:352\n172#1:353\n179#1:358\n194#1:359\n200#1:396\n213#1:397\n219#1:398\n233#1:403\n234#1:404\n235#1:405\n236#1:406\n115#1:306\n144#1:316\n144#1:317,6\n144#1:351\n144#1:357\n193#1:360\n193#1:361,6\n193#1:395\n193#1:402\n242#1:443,2\n46#1:449\n68#1:450\n83#1:451\n117#1:452\n140#1:453\n*E\n"})
public final class SearchKeywordFragmentKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SearchEmptyView(@Nullable Modifier modifier0, @StringRes int v, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xEBF7E594);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            modifier1 = modifier0;
        }
        else if((v1 & 14) == 0) {
            modifier1 = modifier0;
            v3 = (composer1.changed(modifier1) ? 4 : 2) | v1;
        }
        else {
            modifier1 = modifier0;
            v3 = v1;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v2 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEBF7E594, v3, -1, "com.kakao.tistory.presentation.view.search.SearchEmptyView (SearchKeywordFragment.kt:229)");
            }
            Modifier modifier3 = PaddingKt.padding-qDBjuR0(modifier2, 20.0f, 18.0f, 20.0f, 8.0f);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            String s = StringResources_androidKt.stringResource(v, composer1, v3 >> 3 & 14);
            TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, ColorResources_androidKt.colorResource(color.gray7, composer1, 0), 0x141600000L, null, null, null, 0x1BDCCCCCDL, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0xC00, 0, 0x3FF72);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o0(modifier1, v, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SearchKeywordPage(@Nullable SearchViewModel searchViewModel0, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(-1499098492);
        int v2 = (v1 & 1) == 0 ? v : v | 2;
        if((v1 & 1) != 1 || (v2 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 1) != 0) {
                    v2 &= -15;
                }
            }
            else if((v1 & 1) != 0) {
                composer1.startReplaceableGroup(0x671A9C9B);
                ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, 6);
                if(viewModelStoreOwner0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
                ViewModel viewModel0 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(SearchViewModel.class), viewModelStoreOwner0, null, null, creationExtras0, composer1, 0, 0);
                composer1.endReplaceableGroup();
                searchViewModel0 = (SearchViewModel)viewModel0;
                v2 &= -15;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1499098492, v2, -1, "com.kakao.tistory.presentation.view.search.SearchKeywordPage (SearchKeywordFragment.kt:43)");
            }
            LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
            State state0 = LiveDataAdapterKt.observeAsState(searchViewModel0.getSearchKeyword(), composer1, 8);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            SearchKeywordFragmentKt.a(lazyListState0, composer1, 0);
            CompositionLocalKt.CompositionLocalProvider(HighlightTextKt.getLocalHighlightTargetQuery().provides(((String)state0.getValue())), ComposableLambdaKt.rememberComposableLambda(-286992950, true, new y0(lazyListState0, searchViewModel0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            composer1.endNode();
            SearchKeywordFragmentKt.a(lazyListState0.getInteractionSource(), composer1, 0);
            z0 z00 = new z0(searchViewModel0, null);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, z00, composer1, 70);
            EffectsKt.LaunchedEffect(((String)state0.getValue()), new a1(searchViewModel0, state0, null), composer1, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b1(searchViewModel0, v, v1));
        }
    }

    public static final void a(InteractionSource interactionSource0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x603BB6C6);
        int v1 = (v & 14) == 0 ? (composer1.changed(interactionSource0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x603BB6C6, v1, -1, "com.kakao.tistory.presentation.view.search.KeyboardHideHandler (SearchKeywordFragment.kt:113)");
            }
            SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            State state0 = DragInteractionKt.collectIsDraggedAsState(interactionSource0, composer1, v1 & 14);
            Boolean boolean0 = (Boolean)state0.getValue();
            boolean0.getClass();
            composer1.startReplaceGroup(0x11D8464D);
            boolean z = composer1.changed(state0);
            boolean z1 = composer1.changed(softwareKeyboardController0);
            g0 g00 = composer1.rememberedValue();
            if(z || z1 || g00 == Composer.Companion.getEmpty()) {
                g00 = new g0(softwareKeyboardController0, state0, null);
                composer1.updateRememberedValue(g00);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, g00, composer1, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(interactionSource0, v));
        }
    }

    public static final void a(LazyListState lazyListState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2004304649);
        int v1 = (v & 14) == 0 ? (composer1.changed(lazyListState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2004304649, v1, -1, "com.kakao.tistory.presentation.view.search.SearchActionBarDivider (SearchKeywordFragment.kt:66)");
            }
            composer1.startReplaceGroup(0xBCB46FE4);
            State state0 = composer1.rememberedValue();
            if((v1 & 14) == 4 || state0 == Composer.Companion.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new j0(lazyListState0));
                composer1.updateRememberedValue(state0);
            }
            composer1.endReplaceGroup();
            if(((Boolean)state0.getValue()).booleanValue()) {
                DividerKt.Divider-oMI9zvI(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.5f, 0.0f, composer1, 390, 8);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(lazyListState0, v));
        }
    }

    public static final void a(Keyword searchItem$Keyword0, SearchViewModel searchViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xDDEF273);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDDEF273, v, -1, "com.kakao.tistory.presentation.view.search.SearchItemIconButton (SearchKeywordFragment.kt:177)");
        }
        Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 42.0f);
        IconButtonKt.IconButton(new p0(searchItem$Keyword0, searchViewModel0), modifier0, false, null, ComposableLambdaKt.rememberComposableLambda(0xD3C6AF57, true, new q0(searchItem$Keyword0), composer1, 54), composer1, 0x6030, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r0(searchItem$Keyword0, searchViewModel0, v));
        }
    }

    public static final boolean access$KeyboardHideHandler$lambda$5(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final void access$SearchBottom(Bottom searchItem$Bottom0, SearchViewModel searchViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x456AA450);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x456AA450, v, -1, "com.kakao.tistory.presentation.view.search.SearchBottom (SearchKeywordFragment.kt:191)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(modifier$Companion0, 20.0f, 8.0f, 20.0f, 15.0f);
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
        Integer integer0 = searchItem$Bottom0.getSwitchTitle();
        composer1.startReplaceGroup(0x54E49F41);
        if(integer0 != null) {
            int v2 = integer0.intValue();
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 7.5f, 0.0f, 11, null);
            k0 k00 = searchItem$Bottom0.isRecentKeyword() ? new k0(searchViewModel0) : new l0(searchViewModel0);
            Modifier modifier3 = ModifierKt.noRippleClickable(modifier2, k00);
            String s = StringResources_androidKt.stringResource(v2, composer1, 0);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier3, ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0, 0, 0x1FFF8);
        }
        composer1.endReplaceGroup();
        Integer integer1 = searchItem$Bottom0.getClearTitle();
        composer1.startReplaceGroup(1424287530);
        if(integer1 != null) {
            VerticalDividerKt.VerticalDivider-aM-cp0Q(SizeKt.height-3ABfNKs(modifier$Companion0, 13.0f), ColorResources_androidKt.colorResource(color.color_ececec, composer1, 0), 0.0f, composer1, 6, 4);
            Modifier modifier4 = ModifierKt.noRippleClickable(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 10.5f, 0.0f, 0.0f, 0.0f, 14, null), new m0(searchViewModel0));
            String s1 = StringResources_androidKt.stringResource(integer1.intValue(), composer1, 0);
            TextStyle textStyle1 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, modifier4, ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle1, composer1, 0, 0, 0x1FFF8);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n0(searchItem$Bottom0, searchViewModel0, v));
        }
    }

    public static final void access$SearchKeyword(int v, Keyword searchItem$Keyword0, SearchViewModel searchViewModel0, Function2 function20, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xE57C7C23);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE57C7C23, v1, -1, "com.kakao.tistory.presentation.view.search.SearchKeyword (SearchKeywordFragment.kt:138)");
        }
        State state0 = SnapshotStateKt.derivedStateOf(new u0(searchViewModel0, searchItem$Keyword0));
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 20.0f, (v == 0 ? 10.0f : 0.0f), 10.0f, 0.0f, 8, null), 47.0f), 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        HighlightTextKt.HighlightText-fLXpl1I(searchItem$Keyword0.getKeywordItem().getKeyword(), PaddingKt.padding-qDBjuR0$default(ModifierKt.noRippleClickable(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), new s0(function20, v, searchItem$Keyword0)), 0.0f, 0.0f, 8.5f, 0.0f, 11, null), 0L, 0x141700000L, null, null, null, 0L, null, null, 0L, 2, false, 1, MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), null, composer1, 0xC00, 0xC30, 38900);
        FontWeight fontWeight0 = FontWeight.Companion.getLight();
        long v3 = ColorResources_androidKt.colorResource(color.color_909090, composer1, 0);
        DateTimeTextKt.DateTimeText-Vc6wB30(searchItem$Keyword0.getKeywordItem().getDate(), DateTimeFormat.DATE_TIME_FORMAT_M_d_1, false, TypeKt.getTFont(), fontWeight0, 0x141400000L, v3, null, composer1, 0x36C38, 0x84);
        SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, ((float)(((Boolean)state0.getValue()).booleanValue() ? 46 : 4))), composer1, 0);
        composer1.startReplaceGroup(-1902595148);
        if(!((Boolean)state0.getValue()).booleanValue()) {
            SearchKeywordFragmentKt.a(searchItem$Keyword0, searchViewModel0, composer1, 72);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t0(v, searchItem$Keyword0, searchViewModel0, function20, v1));
        }
    }

    public static final void access$SearchKeywordList(LazyListState lazyListState0, SearchViewModel searchViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2020090874);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020090874, v, -1, "com.kakao.tistory.presentation.view.search.SearchKeywordList (SearchKeywordFragment.kt:81)");
        }
        LazyDslKt.LazyColumn(null, lazyListState0, null, false, null, null, null, false, new w0(LiveDataAdapterKt.observeAsState(searchViewModel0.getSuggestItems(), CollectionsKt__CollectionsKt.emptyList(), composer1, 56), searchViewModel0), composer1, v << 3 & 0x70, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(lazyListState0, searchViewModel0, v));
        }
    }

    public static final List access$SearchKeywordList$lambda$4(State state0) {
        return (List)state0.getValue();
    }

    public static final String access$SearchKeywordPage$lambda$0(State state0) {
        return (String)state0.getValue();
    }

    public static final void access$SearchTop(int v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(547048308);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547048308, v2, -1, "com.kakao.tistory.presentation.view.search.SearchTop (SearchKeywordFragment.kt:124)");
            }
            Modifier modifier0 = PaddingKt.padding-qDBjuR0(Modifier.Companion, 20.0f, 23.0f, 20.0f, 13.0f);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(v, composer1, v2 & 14), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TypeKt.getH8(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, 0, 0, 0x1FFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c1(v, v1));
        }
    }
}

