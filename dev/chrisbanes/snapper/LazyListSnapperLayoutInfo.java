package dev.chrisbanes.snapper;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vc.a;

@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00126\u0010\u000B\u001A2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004\u0012\b\b\u0002\u0010\f\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u001B\u001A\u00020\n2\u0006\u0010\u0017\u001A\u00020\u00162\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u001A\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u001B\u0010\u001CR+\u0010\f\u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\n8@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001D\u0010(\u001A\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001A\u0010)\u001A\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010!R\u0014\u0010-\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b,\u0010!R\u0014\u0010/\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b.\u0010!R\u001A\u00103\u001A\b\u0012\u0004\u0012\u00020\b008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b1\u00102¨\u00064"}, d2 = {"Ldev/chrisbanes/snapper/LazyListSnapperLayoutInfo;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "layoutInfo", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "item", "", "snapOffsetForItem", "endContentPadding", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;I)V", "index", "distanceToIndexSnap", "(I)I", "", "canScrollTowardsStart", "()Z", "canScrollTowardsEnd", "", "velocity", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "maximumFlingDistance", "determineTargetIndex", "(FLandroidx/compose/animation/core/DecayAnimationSpec;F)I", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getEndContentPadding$lib_release", "()I", "setEndContentPadding$lib_release", "(I)V", "d", "Landroidx/compose/runtime/State;", "getCurrentItem", "()Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "currentItem", "startScrollOffset", "I", "getStartScrollOffset", "getEndScrollOffset", "endScrollOffset", "getTotalItemsCount", "totalItemsCount", "Lkotlin/sequences/Sequence;", "getVisibleItems", "()Lkotlin/sequences/Sequence;", "visibleItems", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class LazyListSnapperLayoutInfo extends SnapperLayoutInfo {
    public static final int $stable;
    public final LazyListState a;
    public final Function2 b;
    public final MutableState c;
    public final State d;

    public LazyListSnapperLayoutInfo(@NotNull LazyListState lazyListState0, @NotNull Function2 function20, int v) {
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        Intrinsics.checkNotNullParameter(function20, "snapOffsetForItem");
        super();
        this.a = lazyListState0;
        this.b = function20;
        this.c = SnapshotStateKt.mutableStateOf$default(v, null, 2, null);
        this.d = SnapshotStateKt.derivedStateOf(new e(this, 29));
    }

    public LazyListSnapperLayoutInfo(LazyListState lazyListState0, Function2 function20, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(lazyListState0, function20, v);
    }

    public final float a() {
        Object object1;
        LazyListState lazyListState0 = this.a;
        LazyListLayoutInfo lazyListLayoutInfo0 = lazyListState0.getLayoutInfo();
        if(lazyListLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            return -1.0f;
        }
        Iterator iterator0 = lazyListLayoutInfo0.getVisibleItemsInfo().iterator();
        Object object0 = null;
        if(iterator0.hasNext()) {
            object1 = iterator0.next();
            if(iterator0.hasNext()) {
                int v = ((LazyListItemInfo)object1).getOffset();
                while(true) {
                    Object object2 = iterator0.next();
                    int v1 = ((LazyListItemInfo)object2).getOffset();
                    if(v > v1) {
                        object1 = object2;
                        v = v1;
                    }
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
            }
        }
        else {
            object1 = null;
        }
        if(((LazyListItemInfo)object1) == null) {
            return -1.0f;
        }
        Iterator iterator1 = lazyListLayoutInfo0.getVisibleItemsInfo().iterator();
        if(iterator1.hasNext()) {
            object0 = iterator1.next();
            if(iterator1.hasNext()) {
                int v2 = ((LazyListItemInfo)object0).getOffset();
                int v3 = ((LazyListItemInfo)object0).getSize() + v2;
                while(true) {
                    Object object3 = iterator1.next();
                    int v4 = ((LazyListItemInfo)object3).getOffset();
                    int v5 = ((LazyListItemInfo)object3).getSize() + v4;
                    if(v3 < v5) {
                        object0 = object3;
                        v3 = v5;
                    }
                    if(!iterator1.hasNext()) {
                        break;
                    }
                }
            }
        }
        if(((LazyListItemInfo)object0) == null) {
            return -1.0f;
        }
        int v6 = Math.min(((LazyListItemInfo)object1).getOffset(), ((LazyListItemInfo)object0).getOffset());
        int v7 = ((LazyListItemInfo)object1).getOffset();
        int v8 = ((LazyListItemInfo)object1).getSize();
        int v9 = ((LazyListItemInfo)object0).getOffset();
        int v10 = Math.max(v8 + v7, ((LazyListItemInfo)object0).getSize() + v9) - v6;
        if(v10 != 0) {
            LazyListLayoutInfo lazyListLayoutInfo1 = lazyListState0.getLayoutInfo();
            int v11 = 0;
            if(lazyListLayoutInfo1.getVisibleItemsInfo().size() >= 2) {
                LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)lazyListLayoutInfo1.getVisibleItemsInfo().get(0);
                int v12 = ((LazyListItemInfo)lazyListLayoutInfo1.getVisibleItemsInfo().get(1)).getOffset();
                int v13 = lazyListItemInfo0.getSize();
                v11 = v12 - (lazyListItemInfo0.getOffset() + v13);
            }
            return ((float)(v10 + v11)) / ((float)lazyListLayoutInfo0.getVisibleItemsInfo().size());
        }
        return -1.0f;
    }

    public static final Function2 access$getSnapOffsetForItem$p(LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo0) {
        return lazyListSnapperLayoutInfo0.b;
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    public boolean canScrollTowardsEnd() {
        LazyListState lazyListState0 = this.a;
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)CollectionsKt___CollectionsKt.lastOrNull(lazyListState0.getLayoutInfo().getVisibleItemsInfo());
        if(lazyListItemInfo0 != null) {
            if(lazyListItemInfo0.getIndex() >= lazyListState0.getLayoutInfo().getTotalItemsCount() - 1) {
                int v = lazyListItemInfo0.getOffset();
                return lazyListItemInfo0.getSize() + v > this.getEndScrollOffset();
            }
            return true;
        }
        return false;
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    public boolean canScrollTowardsStart() {
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)CollectionsKt___CollectionsKt.firstOrNull(this.a.getLayoutInfo().getVisibleItemsInfo());
        return lazyListItemInfo0 != null && (lazyListItemInfo0.getIndex() > 0 || lazyListItemInfo0.getOffset() < 0);
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    public int determineTargetIndex(float f, @NotNull DecayAnimationSpec decayAnimationSpec0, float f1) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec0, "decayAnimationSpec");
        SnapperLayoutItemInfo snapperLayoutItemInfo0 = this.getCurrentItem();
        if(snapperLayoutItemInfo0 == null) {
            return -1;
        }
        float f2 = this.a();
        if(f2 <= 0.0f) {
            return snapperLayoutItemInfo0.getIndex();
        }
        int v = this.distanceToIndexSnap(snapperLayoutItemInfo0.getIndex());
        int v1 = this.distanceToIndexSnap(snapperLayoutItemInfo0.getIndex() + 1);
        LazyListState lazyListState0 = this.a;
        if(Float.compare(Math.abs(f), 0.5f) < 0) {
            return Math.abs(v) >= Math.abs(v1) ? c.coerceIn(snapperLayoutItemInfo0.getIndex() + 1, 0, lazyListState0.getLayoutInfo().getTotalItemsCount() - 1) : c.coerceIn(snapperLayoutItemInfo0.getIndex(), 0, lazyListState0.getLayoutInfo().getTotalItemsCount() - 1);
        }
        float f3 = c.coerceIn(DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec0, 0.0f, f), -f1, f1);
        int v2 = zd.c.roundToInt(((double)(f < 0.0f ? c.coerceAtMost(f3 + ((float)v1), 0.0f) : c.coerceAtLeast(f3 + ((float)v), 0.0f))) / ((double)f2) - ((double)v) / ((double)f2));
        return c.coerceIn(snapperLayoutItemInfo0.getIndex() + v2, 0, lazyListState0.getLayoutInfo().getTotalItemsCount() - 1);
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    public int distanceToIndexSnap(int v) {
        Object object0 = null;
        for(Object object1: this.getVisibleItems()) {
            if(((SnapperLayoutItemInfo)object1).getIndex() == v) {
                object0 = object1;
                break;
            }
        }
        Function2 function20 = this.b;
        if(((SnapperLayoutItemInfo)object0) != null) {
            return ((SnapperLayoutItemInfo)object0).getOffset() - ((Number)function20.invoke(this, ((SnapperLayoutItemInfo)object0))).intValue();
        }
        SnapperLayoutItemInfo snapperLayoutItemInfo0 = this.getCurrentItem();
        if(snapperLayoutItemInfo0 == null) {
            return 0;
        }
        int v1 = snapperLayoutItemInfo0.getIndex();
        int v2 = zd.c.roundToInt(this.a() * ((float)(v - v1)));
        return snapperLayoutItemInfo0.getOffset() + v2 - ((Number)function20.invoke(this, snapperLayoutItemInfo0)).intValue();
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    @Nullable
    public SnapperLayoutItemInfo getCurrentItem() {
        return (SnapperLayoutItemInfo)this.d.getValue();
    }

    public final int getEndContentPadding$lib_release() {
        return ((Number)this.c.getValue()).intValue();
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    public int getEndScrollOffset() {
        return this.a.getLayoutInfo().getViewportEndOffset() - this.getEndContentPadding$lib_release();
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    public int getStartScrollOffset() [...] // Inlined contents

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    public int getTotalItemsCount() {
        return this.a.getLayoutInfo().getTotalItemsCount();
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutInfo
    @NotNull
    public Sequence getVisibleItems() {
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.a.getLayoutInfo().getVisibleItemsInfo()), a.a);
    }

    public final void setEndContentPadding$lib_release(int v) {
        this.c.setValue(v);
    }
}

