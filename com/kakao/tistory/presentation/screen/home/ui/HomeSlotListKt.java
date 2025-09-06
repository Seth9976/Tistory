package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.Fixed;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Banner;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Best;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Focus;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Subscription;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Tip;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Today;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import com.kakao.tistory.presentation.screen.home.ui.slot.BannerKt;
import com.kakao.tistory.presentation.screen.home.ui.slot.BestKt;
import com.kakao.tistory.presentation.screen.home.ui.slot.CategoryKt;
import com.kakao.tistory.presentation.screen.home.ui.slot.CreatorKt;
import com.kakao.tistory.presentation.screen.home.ui.slot.FocusKt;
import com.kakao.tistory.presentation.screen.home.ui.slot.SubscriptionKt;
import com.kakao.tistory.presentation.screen.home.ui.slot.TipKt;
import com.kakao.tistory.presentation.screen.home.ui.slot.TodayKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\u001AP\u0010\u000E\u001A\u00020\f2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052!\u0010\r\u001A\u001D\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u0007H\u0007¢\u0006\u0004\b\u000E\u0010\u000F\"\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u0012\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008A\u0084\u0002"}, d2 = {"", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "slotList", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "gridState", "Lkotlin/Function1;", "Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$LastSlotInfo;", "Lkotlin/ParameterName;", "name", "info", "", "onUpdateLastViewSlot", "HomeSlotList", "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHomeListSingleLane", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "HomeListSingleLane", "slotListState", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeSlotList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotList.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeSlotListKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,199:1\n148#2:200\n148#2:202\n148#2:207\n148#2:208\n77#3:201\n1549#4:203\n1620#4,3:204\n1223#5,6:209\n1223#5,6:215\n1223#5,6:221\n81#6:227\n*S KotlinDebug\n*F\n+ 1 HomeSlotList.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeSlotListKt\n*L\n28#1:200\n70#1:202\n86#1:207\n87#1:208\n65#1:201\n79#1:203\n79#1:204,3\n138#1:209,6\n144#1:215,6\n165#1:221,6\n142#1:227\n*E\n"})
public final class HomeSlotListKt {
    public static final ProvidableCompositionLocal a;

    static {
        HomeSlotListKt.a = CompositionLocalKt.compositionLocalOf$default(null, l.a, 1, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeSlotList(@NotNull List list0, @NotNull LazyListState lazyListState0, @NotNull LazyStaggeredGridState lazyStaggeredGridState0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "slotList");
        Intrinsics.checkNotNullParameter(lazyListState0, "listState");
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState0, "gridState");
        Intrinsics.checkNotNullParameter(function10, "onUpdateLastViewSlot");
        Composer composer1 = composer0.startRestartGroup(-1576007190);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1576007190, v, -1, "com.kakao.tistory.presentation.screen.home.ui.HomeSlotList (HomeSlotList.kt:26)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(0xE348B1D4, true, new p(720.0f, list0, lazyListState0, function10, lazyStaggeredGridState0), composer1, 54), composer1, 0xC06, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(list0, lazyListState0, lazyStaggeredGridState0, function10, v));
        }
    }

    public static final void access$HomeSlot(HomeSlotUiState homeSlotUiState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(579986065);
        int v1 = (v & 14) == 0 ? (composer1.changed(homeSlotUiState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(579986065, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.HomeSlot (HomeSlotList.kt:187)");
            }
            if(homeSlotUiState0 instanceof Today) {
                composer1.startReplaceGroup(1781651307);
                TodayKt.Today(((Today)homeSlotUiState0), composer1, 8);
            }
            else if(homeSlotUiState0 instanceof Best) {
                composer1.startReplaceGroup(0x6A31DDCA);
                BestKt.Best(((Best)homeSlotUiState0), composer1, 8);
            }
            else if(homeSlotUiState0 instanceof Banner) {
                composer1.startReplaceGroup(1781654604);
                BannerKt.Banner(((Banner)homeSlotUiState0), composer1, 8);
            }
            else if(homeSlotUiState0 instanceof Category) {
                composer1.startReplaceGroup(0x6A31EB4E);
                CategoryKt.Category(((Category)homeSlotUiState0), composer1, 8);
            }
            else if(homeSlotUiState0 instanceof Creator) {
                composer1.startReplaceGroup(0x6A31F26D);
                CreatorKt.Creator(((Creator)homeSlotUiState0), composer1, 8);
            }
            else if(homeSlotUiState0 instanceof Subscription) {
                composer1.startReplaceGroup(0x6A31FA12);
                SubscriptionKt.Subscription(((Subscription)homeSlotUiState0), composer1, 8);
            }
            else if(homeSlotUiState0 instanceof Focus) {
                composer1.startReplaceGroup(0x6A32016B);
                FocusKt.Focus(((Focus)homeSlotUiState0), composer1, 8);
            }
            else if(homeSlotUiState0 instanceof Tip) {
                composer1.startReplaceGroup(0x6A3207A9);
                TipKt.Tip(((Tip)homeSlotUiState0), composer1, 8);
            }
            else {
                composer1.startReplaceGroup(0xDC0F3586);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(homeSlotUiState0, v));
        }
    }

    public static final void access$MultiLane(BoxWithConstraintsScope boxWithConstraintsScope0, List list0, LazyStaggeredGridState lazyStaggeredGridState0, List list1, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2063094572);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2063094572, v, -1, "com.kakao.tistory.presentation.screen.home.ui.MultiLane (HomeSlotList.kt:63)");
        }
        Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
        EffectsKt.LaunchedEffect(Dp.box-impl(boxWithConstraintsScope0.getMaxWidth-D9Ej5fM()), new r(lazyStaggeredGridState0, null), composer1, 0x40);
        SnapshotStateList snapshotStateList0 = HomeSlotArrangedKt.homeSlotArranged-942rkJo(list0, list1, 20.0f, lazyStaggeredGridState0, function10, composer1, LazyStaggeredGridState.$stable << 9 | 456 | v << 3 & 0x1C00 | 0xE000 & v);
        ArrayList arrayList0 = new ArrayList(kotlin.collections.l.collectionSizeOrDefault(snapshotStateList0, 10));
        for(Object object1: snapshotStateList0) {
            arrayList0.add(TuplesKt.to(CollectionsKt___CollectionsKt.getOrNull(list0, ((SlotItemInfo)object1).getSlotListIndex()), ((SlotItemInfo)object1).getBottomPadding()));
        }
        Fixed staggeredGridCells$Fixed0 = new Fixed(list1.size());
        Modifier modifier0 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(20.0f);
        LazyStaggeredGridDslKt.LazyVerticalStaggeredGrid-zadm560(staggeredGridCells$Fixed0, modifier0, lazyStaggeredGridState0, PaddingKt.PaddingValues-0680j_4(20.0f), false, 20.0f, arrangement$HorizontalOrVertical0, null, false, new t(arrayList0, snapshotStateList0, list0, ((Density)object0)), composer1, LazyStaggeredGridState.$stable << 6 | 0x1B0C30 | v & 0x380, 400);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(boxWithConstraintsScope0, list0, lazyStaggeredGridState0, list1, function10, v));
        }
    }

    public static final void access$SingleLane(List list0, LazyListState lazyListState0, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x18DAB432);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x18DAB432, v, -1, "com.kakao.tistory.presentation.screen.home.ui.SingleLane (HomeSlotList.kt:136)");
        }
        Object object0 = CollectionsKt___CollectionsKt.firstOrNull(list0);
        composer1.startReplaceGroup(0x461E71F);
        int v1 = v & 0x70 ^ 0x30;
        int v2 = 0;
        boolean z = v1 > 0x20 && composer1.changed(lazyListState0) || (v & 0x30) == 0x20;
        v v3 = composer1.rememberedValue();
        if(z || v3 == Composer.Companion.getEmpty()) {
            v3 = new v(lazyListState0, null);
            composer1.updateRememberedValue(v3);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(object0, v3, composer1, 0x40);
        State state0 = SnapshotStateKt.rememberUpdatedState(list0, composer1, 8);
        List list1 = (List)state0.getValue();
        composer1.startReplaceGroup(0x461FCD1);
        boolean z1 = v1 > 0x20 && composer1.changed(lazyListState0) || (v & 0x30) == 0x20;
        boolean z2 = composer1.changed(state0);
        if((v & 0x380 ^ 0x180) > 0x100 && composer1.changed(function10) || (v & 0x180) == 0x100) {
            v2 = 1;
        }
        y y0 = composer1.rememberedValue();
        if((z1 | z2 | v2) != 0 || y0 == Composer.Companion.getEmpty()) {
            y0 = new y(lazyListState0, state0, function10, null);
            composer1.updateRememberedValue(y0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(lazyListState0, list1, y0, composer1, v >> 3 & 14 | 0x240);
        composer1.startReplaceGroup(0x46251FE);
        boolean z3 = composer1.changed(state0);
        a0 a00 = composer1.rememberedValue();
        if(z3 || a00 == Composer.Companion.getEmpty()) {
            a00 = new a0(state0);
            composer1.updateRememberedValue(a00);
        }
        composer1.endReplaceGroup();
        LazyDslKt.LazyColumn(null, lazyListState0, null, false, null, null, null, false, a00, composer1, v & 0x70, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(list0, lazyListState0, function10, v));
        }
    }

    public static final List access$SingleLane$lambda$2(State state0) {
        return (List)state0.getValue();
    }

    @NotNull
    public static final ProvidableCompositionLocal getHomeListSingleLane() {
        return HomeSlotListKt.a;
    }
}

