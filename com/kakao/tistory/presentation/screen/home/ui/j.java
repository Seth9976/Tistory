package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.IntSize;
import com.kakao.tistory.domain.home.entity.HomeSlot.Position;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import ec.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;

public final class j extends SuspendLambda implements Function2 {
    public final State a;
    public final SnapshotStateList b;
    public final SnapshotStateList c;
    public final List d;
    public final int e;

    public j(State state0, SnapshotStateList snapshotStateList0, SnapshotStateList snapshotStateList1, List list0, int v, Continuation continuation0) {
        this.a = state0;
        this.b = snapshotStateList0;
        this.c = snapshotStateList1;
        this.d = list0;
        this.e = v;
        super(2, continuation0);
    }

    public static final SlotItemInfo a(SlotItemInfo slotItemInfo0) {
        Intrinsics.checkNotNull(slotItemInfo0);
        return SlotItemInfo.copy$default(slotItemInfo0, 0, 0, 0, 0, 7, null);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.a, this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
        ResultKt.throwOnFailure(object0);
        List list0 = HomeSlotArrangedKt.access$homeSlotArranged_942rkJo$lambda$2(this.a);
        SnapshotStateList snapshotStateList0 = this.b;
        SnapshotStateList snapshotStateList1 = this.c;
        for(Object object1: list0) {
            GridItemInfo gridItemInfo0 = (GridItemInfo)object1;
            SlotItemInfo slotItemInfo0 = (SlotItemInfo)CollectionsKt___CollectionsKt.getOrNull(snapshotStateList0, gridItemInfo0.getIndex());
            if(slotItemInfo0 == null) {
                continue;
            }
            HomeSlotUiState homeSlotUiState0 = (HomeSlotUiState)CollectionsKt___CollectionsKt.getOrNull(snapshotStateList1, slotItemInfo0.getSlotListIndex());
            if(homeSlotUiState0 != null && slotItemInfo0.getLane() == homeSlotUiState0.getPosition().ordinal()) {
                if(slotItemInfo0.getHeight() == IntSize.getHeight-impl(gridItemInfo0.getSize-YbymL2g())) {
                    continue;
                }
                snapshotStateList0.set(gridItemInfo0.getIndex(), SlotItemInfo.copy$default(slotItemInfo0, 0, 0, IntSize.getHeight-impl(gridItemInfo0.getSize-YbymL2g()), 0, 11, null));
                continue;
            }
            HomeSlotArrangedKt.access$removeFromIndex(snapshotStateList0, gridItemInfo0.getIndex());
            snapshotStateList0.replaceAll(new a());  // 初始化器: Ljava/lang/Object;-><init>()V
            return Unit.INSTANCE;
        }
        Object object2 = null;
        Iterator iterator1 = HomeSlotArrangedKt.access$homeSlotArranged_942rkJo$lambda$2(this.a).iterator();
        while(true) {
            object3 = null;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object4 = iterator1.next();
            if(Intrinsics.areEqual(((GridItemInfo)object4).getKey(), "MEASURED_ITEM")) {
                object2 = object4;
                break;
            }
        }
        if(((GridItemInfo)object2) != null) {
            List list1 = this.d;
            SnapshotStateList snapshotStateList2 = this.c;
            SnapshotStateList snapshotStateList3 = this.b;
            int v = this.e;
            int v1 = ((GridItemInfo)object2).getLane();
            Position homeSlot$Position0 = (Position)CollectionsKt___CollectionsKt.getOrNull(list1, v1);
            if(homeSlot$Position0 == null) {
                homeSlot$Position0 = (Position)CollectionsKt___CollectionsKt.first(list1);
            }
            for(Object object5: CollectionsKt___CollectionsKt.withIndex(snapshotStateList2)) {
                int v2 = ((IndexedValue)object5).component1();
                if(((HomeSlotUiState)((IndexedValue)object5).component2()).getPosition() != homeSlot$Position0 || !HomeSlotArrangedKt.access$notContains(snapshotStateList3, v2)) {
                    continue;
                }
                goto label_41;
            }
            object5 = null;
        label_41:
            if(((IndexedValue)object5) != null) {
                int v3 = ((IndexedValue)object5).component1();
                HomeSlotUiState homeSlotUiState1 = (HomeSlotUiState)((IndexedValue)object5).component2();
                snapshotStateList3.add(new SlotItemInfo(v3, v1, 0, 0, 8, null));
                return Unit.INSTANCE;
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object6: snapshotStateList3) {
                if(((SlotItemInfo)object6).getLane() == v1) {
                    arrayList0.add(object6);
                }
            }
            int v4 = 0;
            for(Object object7: arrayList0) {
                v4 += ((SlotItemInfo)object7).getHeight() + v;
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object8: snapshotStateList3) {
                if(((SlotItemInfo)object8).getLane() == (v1 + 1) % list1.size()) {
                    arrayList1.add(object8);
                }
            }
            int v5 = 0;
            for(Object object9: arrayList1) {
                v5 += ((SlotItemInfo)object9).getHeight() + v;
            }
            int v6 = c.coerceAtLeast(v5 - v4, 0);
            for(Object object10: CollectionsKt___CollectionsKt.withIndex(snapshotStateList3)) {
                if(((SlotItemInfo)((IndexedValue)object10).component2()).getLane() == v1) {
                    object3 = object10;
                }
            }
            if(((IndexedValue)object3) != null) {
                int v7 = ((IndexedValue)object3).component1();
                Object object11 = ((IndexedValue)object3).component2();
                snapshotStateList3.set(v7, SlotItemInfo.copy$default(((SlotItemInfo)object11), 0, 0, 0, ((SlotItemInfo)object11).getBottomPadding() + (v6 + 10), 7, null));
            }
        }
        return Unit.INSTANCE;
    }
}

