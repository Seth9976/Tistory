package com.kakao.tistory.presentation.view.editor;

import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.room.a;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.widget.CommonTitleKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetModalKt;
import com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetValue;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import com.kakao.tistory.presentation.widget.swipe.CommonSwipeGroupState;
import com.kakao.tistory.presentation.widget.swipe.SwipeableItemKt;
import d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\u001A\u001F\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001A1\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00010\u000BH\u0007¢\u0006\u0002\u0010\r\u001Am\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\t0\u00122\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\f\u0010\u0013\u001A\u0004\u0018\u00010\u0014X\u008A\u0084\u0002²\u0006\u0012\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001BX\u008A\u0084\u0002²\u0006\n\u0010\u001C\u001A\u00020\u001DX\u008A\u0084\u0002"}, d2 = {"DraftBottomSheet", "", "window", "Landroid/view/Window;", "draftViewModel", "Lcom/kakao/tistory/presentation/viewmodel/DraftViewModel;", "(Landroid/view/Window;Lcom/kakao/tistory/presentation/viewmodel/DraftViewModel;Landroidx/compose/runtime/Composer;II)V", "DraftItemView", "draft", "Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "onClick", "Lkotlin/Function0;", "onLongClick", "(Lcom/kakao/tistory/domain/entity/entry/DraftItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DraftList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "draftItems", "Landroidx/paging/compose/LazyPagingItems;", "draftCount", "", "Lkotlin/Function1;", "onClickDelete", "onClickAccessibility", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/paging/compose/LazyPagingItems;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease", "refresh", "Lcom/kakao/tistory/presentation/common/extension/Event;", "dragged", ""}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDraftBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraftBottomSheet.kt\ncom/kakao/tistory/presentation/view/editor/DraftBottomSheetKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n55#2,11:234\n77#3:245\n77#3:246\n77#3:247\n488#4:248\n487#4,4:249\n491#4,2:256\n495#4:262\n1223#5,3:253\n1226#5,3:259\n1223#5,6:299\n1223#5,6:349\n487#6:258\n85#7:263\n82#7,6:264\n88#7:298\n92#7:309\n85#7:356\n83#7,5:357\n88#7:390\n92#7:397\n78#8,6:270\n85#8,4:285\n89#8,2:295\n93#8:308\n78#8,6:318\n85#8,4:333\n89#8,2:343\n78#8,6:362\n85#8,4:377\n89#8,2:387\n93#8:396\n93#8:401\n368#9,9:276\n377#9:297\n378#9,2:306\n368#9,9:324\n377#9:345\n368#9,9:368\n377#9:389\n378#9,2:394\n378#9,2:399\n4032#10,6:289\n4032#10,6:337\n4032#10,6:381\n148#11:305\n148#11:348\n148#11:355\n148#11:393\n158#11:398\n71#12:310\n67#12,7:311\n74#12:346\n78#12:402\n1#13:347\n95#14,2:391\n81#15:403\n81#15:404\n81#15:405\n*S KotlinDebug\n*F\n+ 1 DraftBottomSheet.kt\ncom/kakao/tistory/presentation/view/editor/DraftBottomSheetKt\n*L\n57#1:234,11\n59#1:245\n62#1:246\n73#1:247\n74#1:248\n74#1:249,4\n74#1:256,2\n74#1:262\n74#1:253,3\n74#1:259,3\n125#1:299,6\n174#1:349,6\n74#1:258\n123#1:263\n123#1:264,6\n123#1:298\n123#1:309\n169#1:356\n169#1:357,5\n169#1:390\n169#1:397\n123#1:270,6\n123#1:285,4\n123#1:295,2\n123#1:308\n165#1:318,6\n165#1:333,4\n165#1:343,2\n169#1:362,6\n169#1:377,4\n169#1:387,2\n169#1:396\n165#1:401\n123#1:276,9\n123#1:297\n123#1:306,2\n165#1:324,9\n165#1:345\n169#1:368,9\n169#1:389\n169#1:394,2\n165#1:399,2\n123#1:289,6\n165#1:337,6\n169#1:381,6\n131#1:305\n171#1:348\n175#1:355\n193#1:393\n209#1:398\n165#1:310\n165#1:311,7\n165#1:346\n165#1:402\n188#1:391,2\n70#1:403\n71#1:404\n127#1:405\n*E\n"})
public final class DraftBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DraftBottomSheet(@NotNull Window window0, @Nullable DraftViewModel draftViewModel0, @Nullable Composer composer0, int v, int v1) {
        DraftViewModel draftViewModel1;
        int v2;
        Intrinsics.checkNotNullParameter(window0, "window");
        Composer composer1 = composer0.startRestartGroup(2014406847);
        if((v1 & 2) == 0) {
            draftViewModel1 = draftViewModel0;
            v2 = v;
        }
        else {
            composer1.startReplaceableGroup(0x671A9C9B);
            ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, 6);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
            ViewModel viewModel0 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(DraftViewModel.class), viewModelStoreOwner0, null, null, creationExtras0, composer1, 0, 0);
            composer1.endReplaceableGroup();
            v2 = v & 0xFFFFFF8F;
            draftViewModel1 = (DraftViewModel)viewModel0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2014406847, v2, -1, "com.kakao.tistory.presentation.view.editor.DraftBottomSheet (DraftBottomSheet.kt:57)");
        }
        Object object0 = composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
        composer1.startReplaceGroup(0x1FEEBBF);
        int v3 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(PrimitiveResources_androidKt.dimensionResource(dimen.editor_draft_minimum_height_top_padding, composer1, 0));
        composer1.endReplaceGroup();
        SwipeableState swipeableState0 = SwipeableKt.rememberSwipeableState(BottomSheetValue.Closed, null, null, composer1, 6, 6);
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(draftViewModel1.getDraftList(), null, composer1, 8, 1);
        State state0 = LiveDataAdapterKt.observeAsState(draftViewModel1.getDraftCount(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(draftViewModel1.getRefreshDraftList(), composer1, 8);
        Object object1 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        g g0 = new g(draftViewModel1, ((LifecycleOwner)object1), compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), swipeableState0, ((SoftwareKeyboardController)object0), lazyListState0, null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, g0, composer1, 70);
        EffectsKt.LaunchedEffect(((Event)state1.getValue()), new h(lazyPagingItems0, null), composer1, 72);
        BottomSheetModalKt.BottomSheetModal(window0, swipeableState0, v3, new i(draftViewModel1), ComposableLambdaKt.rememberComposableLambda(0x3F804469, true, new m(lazyListState0, lazyPagingItems0, state0, draftViewModel1), composer1, 54), composer1, 0x6008, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(window0, draftViewModel1, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DraftItemView(@NotNull DraftItem draftItem0, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(draftItem0, "draft");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(function01, "onLongClick");
        Composer composer1 = composer0.startRestartGroup(1556784008);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1556784008, v, -1, "com.kakao.tistory.presentation.view.editor.DraftItemView (DraftBottomSheet.kt:163)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        String s = draftItem0.getTitle();
        if(s == null || p.isBlank(s)) {
            s = null;
        }
        composer1.startReplaceGroup(-1250347586);
        if(s == null) {
            s = StringResources_androidKt.stringResource(string.label_draft_no_title, composer1, 0);
        }
        composer1.endReplaceGroup();
        boolean z = true;
        Modifier modifier1 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 75.0f), 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null);
        composer1.startReplaceGroup(-1250336221);
        boolean z1 = (v & 0x380 ^ 0x180) > 0x100 && composer1.changed(function01) || (v & 0x180) == 0x100;
        o o0 = composer1.rememberedValue();
        if(z1 || o0 == Composer.Companion.getEmpty()) {
            o0 = new o(function01);
            composer1.updateRememberedValue(o0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(-1250337153);
        if(((v & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(function00)) && (v & 0x30) != 0x20) {
            z = false;
        }
        com.kakao.tistory.presentation.view.editor.p p0 = composer1.rememberedValue();
        if(z || p0 == Composer.Companion.getEmpty()) {
            p0 = new com.kakao.tistory.presentation.view.editor.p(function00);
            composer1.updateRememberedValue(p0);
        }
        composer1.endReplaceGroup();
        Modifier modifier2 = SemanticsModifierKt.clearAndSetSemantics(PaddingKt.padding-VpY3zN4$default(ClickableKt.combinedClickable-cJG_KMw$default(modifier1, false, null, null, null, o0, null, p0, 0x2F, null), 20.0f, 0.0f, 2, null), q.a);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), alignment$Companion0.getStart(), composer1, 6);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        long v3 = ColorResources_androidKt.colorResource(color.gray1, composer1, 0);
        TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, v3, 0x141700000L, null, null, TypeKt.getTFont(), 0x1BDCCCCCDL, null, null, 0L, 2, false, false, 1, 0, null, null, composer1, 0x180C00, 0x6C30, 0x39732);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 2.0f), composer1, 6);
        TextStyle textStyle0 = new TextStyle(0L, 0x141400000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null);
        DateTimeTextKt.DateTimeText-Vc6wB30(draftItem0.getUpdatedAt(), DateTimeFormat.DATE_TIME_FORMAT_yyyy_M_d, true, null, null, 0L, 0L, textStyle0, composer1, 0x1B0, 120);
        composer1.endNode();
        DividerKt.Divider-oMI9zvI(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getBottomCenter()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.5f, 0.0f, composer1, 0x180, 8);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(draftItem0, function00, function01, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DraftList(@Nullable LazyListState lazyListState0, @NotNull LazyPagingItems lazyPagingItems0, @Nullable Long long0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @Nullable Composer composer0, int v, int v1) {
        Long long1;
        Long long2;
        LazyListState lazyListState2;
        int v3;
        int v2;
        LazyListState lazyListState1;
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "draftItems");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Intrinsics.checkNotNullParameter(function11, "onClickDelete");
        Intrinsics.checkNotNullParameter(function12, "onClickAccessibility");
        Composer composer1 = composer0.startRestartGroup(1404356100);
        if((v & 14) == 0) {
            if((v1 & 1) == 0) {
                lazyListState1 = lazyListState0;
                v2 = composer1.changed(lazyListState1) ? 4 : 2;
            }
            else {
                lazyListState1 = lazyListState0;
                v2 = 2;
            }
            v3 = v2 | v;
        }
        else {
            lazyListState1 = lazyListState0;
            v3 = v;
        }
        if((v1 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v3 |= (composer1.changed(lazyPagingItems0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v3 |= (composer1.changed(long0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v3 |= (composer1.changedInstance(function11) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v3 |= (composer1.changedInstance(function12) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v3) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    lazyListState1 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
                    v3 &= -15;
                }
                if((v1 & 4) == 0) {
                    lazyListState2 = lazyListState1;
                    long2 = long0;
                }
                else {
                    long2 = 0L;
                    lazyListState2 = lazyListState1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 1) != 0) {
                    v3 &= -15;
                }
                lazyListState2 = lazyListState1;
                long2 = long0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1404356100, v3, -1, "com.kakao.tistory.presentation.view.editor.DraftList (DraftBottomSheet.kt:121)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            CommonSwipeGroupState commonSwipeGroupState0 = SwipeableItemKt.rememberCommonSwipeGroupState(composer1, 0);
            composer1.startReplaceGroup(-1058099800);
            com.kakao.tistory.presentation.view.editor.d d0 = composer1.rememberedValue();
            if(d0 == Composer.Companion.getEmpty()) {
                d0 = new com.kakao.tistory.presentation.view.editor.d(function11);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceGroup();
            if(((Boolean)DragInteractionKt.collectIsDraggedAsState(lazyListState2.getInteractionSource(), composer1, 0).getValue()).booleanValue()) {
                commonSwipeGroupState0.clearSwipe();
            }
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 2.0f, 0.0f, 12.0f, 5, null);
            String s = StringResources_androidKt.stringResource(string.label_draft, composer1, 0);
            String s1 = StringResources_androidKt.stringResource(string.label_draft_description, composer1, 0);
            CommonTitleKt.TitleWithDescriptionView(modifier2, s, String.valueOf(long2), StringResources_androidKt.stringResource(string.label_draft, composer1, 0) + " " + long2 + "개", s1, composer1, 6, 0);
            LazyDslKt.LazyColumn(null, lazyListState2, null, false, null, null, null, false, new w(lazyPagingItems0, commonSwipeGroupState0, d0, function10, function12), composer1, v3 << 3 & 0x70, 0xFD);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            lazyListState1 = lazyListState2;
            long1 = long2;
        }
        else {
            composer1.skipToGroupEnd();
            long1 = long0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(lazyListState1, lazyPagingItems0, long1, function10, function11, function12, v, v1));
        }
    }

    public static final Long access$DraftBottomSheet$lambda$1(State state0) {
        return (Long)state0.getValue();
    }
}

