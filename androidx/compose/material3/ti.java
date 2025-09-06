package androidx.compose.material3;

import androidx.compose.runtime.snapshots.ReadonlySnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.TestModifierUpdater;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.ViewModel;
import ce.e;
import com.kakao.kdtracker.KDTracker;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.time.Duration;
import kotlinx.coroutines.DelayKt;

public final class ti extends Lambda implements Function1 {
    public final int w;
    public final Function1 x;

    public ti(Function1 function10, int v) {
        this.w = v;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                if(((FocusState)object0).isFocused()) {
                    this.x.invoke(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                long v = ((SliderRange)object0).unbox-impl();
                ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(SliderRange.getStart-impl(v), SliderRange.getEndInclusive-impl(v));
                this.x.invoke(closedFloatingPointRange0);
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "it");
                Rect rect0 = LayoutCoordinatesKt.boundsInParent(((LayoutCoordinates)object0));
                this.x.invoke(rect0);
                return Unit.INSTANCE;
            }
            case 3: {
                this.x.invoke(object0);
                return Unit.INSTANCE;
            }
            case 4: {
                return (ViewModel)this.x.invoke(object0);
            }
            case 5: {
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object0), "it");
                return this.x.invoke(((KotlinType)object0)).toString();
            }
            case 6: {
                this.x.invoke(((float)(((Number)object0).floatValue() / 100.0f)));
                return Unit.INSTANCE;
            }
            case 7: {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                if(((List)object0).size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                for(int v1 = 0; v1 < ((List)object0).size(); v1 += 2) {
                    Object object1 = ((List)object0).get(v1);
                    Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap0.put(((String)object1), ((List)object0).get(v1 + 1));
                }
                return this.x.invoke(linkedHashMap0);
            }
            case 8: {
                Object object2 = SnapshotKt.getLock();
                synchronized(object2) {
                    SnapshotKt.access$setNextSnapshotId$p(4);
                }
                return new ReadonlySnapshot(3, ((SnapshotIdSet)object0), this.x);
            }
            case 9: {
                Snapshot snapshot0 = (Snapshot)this.x.invoke(((SnapshotIdSet)object0));
                Object object3 = SnapshotKt.getLock();
                synchronized(object3) {
                    SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(snapshot0.getId()));
                    return snapshot0;
                }
            }
            case 10: {
                this.x.invoke(object0);
                return object0;
            }
            case 11: {
                this.x.invoke(((ContentDrawScope)object0));
                ((ContentDrawScope)object0).drawContent();
                return Unit.INSTANCE;
            }
            case 12: {
                Offset offset0 = Offset.box-impl(((Offset)object0).unbox-impl());
                this.x.invoke(offset0);
                return Unit.INSTANCE;
            }
            case 13: {
                int v4 = ((Number)object0).intValue();
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "size-tab", "size" + v4, null, "setsize", 4, null);
                this.x.invoke(v4);
                return Unit.INSTANCE;
            }
            case 14: {
                Integer integer0 = IntSize.getWidth-impl(((IntSize)object0).unbox-impl());
                return IntOffset.box-impl(IntOffsetKt.IntOffset(((Number)this.x.invoke(integer0)).intValue(), 0));
            }
            case 15: {
                Integer integer1 = IntSize.getHeight-impl(((IntSize)object0).unbox-impl());
                return IntOffset.box-impl(IntOffsetKt.IntOffset(0, ((Number)this.x.invoke(integer1)).intValue()));
            }
            case 16: {
                Integer integer2 = IntSize.getWidth-impl(((IntSize)object0).unbox-impl());
                return IntOffset.box-impl(IntOffsetKt.IntOffset(((Number)this.x.invoke(integer2)).intValue(), 0));
            }
            case 17: {
                Integer integer3 = IntSize.getHeight-impl(((IntSize)object0).unbox-impl());
                return IntOffset.box-impl(IntOffsetKt.IntOffset(0, ((Number)this.x.invoke(integer3)).intValue()));
            }
            case 18: {
                return this.x.invoke(((Number)object0).longValue());
            }
            case 19: {
                return DelayKt.toDelayMillis-LRDsOJo(((Duration)this.x.invoke(object0)).unbox-impl());
            }
            default: {
                TestModifierUpdater testModifierUpdater0 = new TestModifierUpdater(((LayoutNode)object0));
                this.x.invoke(testModifierUpdater0);
                return Unit.INSTANCE;
            }
        }
    }
}

