package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.kakao.tistory.domain.home.entity.HomeSlot.Position;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001Ag\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001A\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A²\u0006\u0012\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u00008\nX\u008A\u0084\u0002"}, d2 = {"", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "slotList", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "positionEntries", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function1;", "Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$LastSlotInfo;", "Lkotlin/ParameterName;", "name", "info", "", "onUpdateLastViewSlot", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/kakao/tistory/presentation/screen/home/ui/SlotItemInfo;", "homeSlotArranged-942rkJo", "(Ljava/util/List;Ljava/util/List;FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "homeSlotArranged", "", "MEASURED_ITEM", "Ljava/lang/String;", "Lcom/kakao/tistory/presentation/screen/home/ui/GridItemInfo;", "visibleItemsInfo", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeSlotArranged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotArranged.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeSlotArrangedKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,143:1\n77#2:144\n1#3:145\n1223#4,6:146\n1223#4,6:152\n2624#5,3:158\n1747#5,3:161\n533#5,6:164\n81#6:170\n*S KotlinDebug\n*F\n+ 1 HomeSlotArranged.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeSlotArrangedKt\n*L\n25#1:144\n28#1:146,6\n33#1:152,6\n131#1:158,3\n138#1:161,3\n141#1:164,6\n28#1:170\n*E\n"})
public final class HomeSlotArrangedKt {
    @NotNull
    public static final String MEASURED_ITEM = "MEASURED_ITEM";

    public static final boolean access$hasCopyright(List list0) {
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(Intrinsics.areEqual(((GridItemInfo)object0).getKey(), "CopyRight")) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static final List access$homeSlotArranged_942rkJo$lambda$2(State state0) {
        return (List)state0.getValue();
    }

    public static final GridItemInfo access$lastItemInLastLane(List list0, List list1) {
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object0 = listIterator0.previous();
            GridItemInfo gridItemInfo0 = (GridItemInfo)object0;
            if(!Intrinsics.areEqual(gridItemInfo0.getKey(), "MEASURED_ITEM")) {
                Position homeSlot$Position0 = (Position)CollectionsKt___CollectionsKt.lastOrNull(list1);
                if(gridItemInfo0.getLane() == (homeSlot$Position0 == null ? 0 : homeSlot$Position0.ordinal())) {
                    return (GridItemInfo)object0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static final boolean access$notContains(List list0, int v) {
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(((SlotItemInfo)object0).getSlotListIndex() == v) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public static final void access$removeFromIndex(SnapshotStateList snapshotStateList0, int v) {
        if(v >= 0 && v < snapshotStateList0.size()) {
            snapshotStateList0.removeRange(v, snapshotStateList0.size());
        }
    }

    public static final GridItemInfo access$toMeasuredGridItem(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0) {
        return new GridItemInfo(lazyStaggeredGridItemInfo0.getIndex(), lazyStaggeredGridItemInfo0.getLane(), lazyStaggeredGridItemInfo0.getKey(), lazyStaggeredGridItemInfo0.getSize-YbymL2g(), lazyStaggeredGridItemInfo0.getContentType(), null);
    }

    @Composable
    @NotNull
    public static final SnapshotStateList homeSlotArranged-942rkJo(@NotNull List list0, @NotNull List list1, float f, @NotNull LazyStaggeredGridState lazyStaggeredGridState0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "slotList");
        Intrinsics.checkNotNullParameter(list1, "positionEntries");
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState0, "state");
        Intrinsics.checkNotNullParameter(function10, "onUpdateLastViewSlot");
        composer0.startReplaceGroup(1431488900);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1431488900, v, -1, "com.kakao.tistory.presentation.screen.home.ui.homeSlotArranged (HomeSlotArranged.kt:23)");
        }
        int v1 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(f);
        composer0.startReplaceGroup(340692673);
        State state0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(state0 == composer$Companion0.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new k(lazyStaggeredGridState0));
            composer0.updateRememberedValue(state0);
        }
        composer0.endReplaceGroup();
        SnapshotStateList snapshotStateList0 = SnapshotStateKt.toMutableStateList(list0);
        composer0.startReplaceGroup(340698755);
        SnapshotStateList snapshotStateList1 = composer0.rememberedValue();
        if(snapshotStateList1 == composer$Companion0.getEmpty()) {
            snapshotStateList1 = SnapshotStateKt.mutableStateListOf();
            composer0.updateRememberedValue(snapshotStateList1);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(((List)state0.getValue()), new i(state0, list1, snapshotStateList1, snapshotStateList0, function10, null), composer0, 72);
        EffectsKt.LaunchedEffect(((List)state0.getValue()), new j(state0, snapshotStateList1, snapshotStateList0, list1, v1, null), composer0, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return snapshotStateList1;
    }
}

