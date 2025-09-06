package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.h;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import dev.chrisbanes.snapper.SnapperLayoutItemInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.CoroutineScope;

public final class c7 extends Lambda implements Function1 {
    public final Object A;
    public final Object B;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public c7(int v, int v1, Object object0, Object object1, Object object2, Object object3) {
        this.w = v1;
        this.y = object0;
        this.x = v;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        super(1);
    }

    public c7(Ref ref0, View view0, int v, MutableIntState mutableIntState0, MutableIntState mutableIntState1) {
        this.w = 2;
        this.y = ref0;
        this.z = view0;
        this.x = v;
        this.A = mutableIntState0;
        this.B = mutableIntState1;
        super(1);
    }

    public c7(FloatRef ref$FloatRef0, ScrollScope scrollScope0, FloatRef ref$FloatRef1, SnapperFlingBehavior snapperFlingBehavior0, int v) {
        this.w = 3;
        this.y = ref$FloatRef0;
        this.z = scrollScope0;
        this.A = ref$FloatRef1;
        this.B = snapperFlingBehavior0;
        this.x = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        List list0;
        switch(this.w) {
            case 0: {
                LazyGridState lazyGridState0 = (LazyGridState)this.y;
                int v = lazyGridState0.getFirstVisibleItemIndex();
                int v1 = this.x;
                if(v == v1) {
                    list0 = DatePickerKt.access$customScrollActions(lazyGridState0, ((CoroutineScope)this.z), ((String)this.A), ((String)this.B));
                }
                else {
                    LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)CollectionsKt___CollectionsKt.lastOrNull(lazyGridState0.getLayoutInfo().getVisibleItemsInfo());
                    list0 = lazyGridItemInfo0 != null && lazyGridItemInfo0.getIndex() == v1 ? DatePickerKt.access$customScrollActions(lazyGridState0, ((CoroutineScope)this.z), ((String)this.A), ((String)this.B)) : CollectionsKt__CollectionsKt.emptyList();
                }
                SemanticsPropertiesKt.setCustomActions(((SemanticsPropertyReceiver)object0), list0);
                return Unit.INSTANCE;
            }
            case 1: {
                ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$3(((MutableState)this.z), ((LayoutCoordinates)object0));
                int v2 = IntSize.getWidth-impl(((LayoutCoordinates)object0).getSize-YbymL2g());
                ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$6(((MutableIntState)this.A), v2);
                int v3 = ExposedDropdownMenu_androidKt.access$calculateMaxHeight(ExposedDropdownMenu_androidKt.access$getWindowBounds(((View)this.y).getRootView()), ExposedDropdownMenu_androidKt.access$getAnchorBounds(ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$2(((MutableState)this.z))), this.x);
                ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$9(((MutableIntState)this.B), v3);
                return Unit.INSTANCE;
            }
            case 2: {
                int v4 = IntSize.getWidth-impl(((LayoutCoordinates)object0).getSize-YbymL2g());
                androidx.compose.material.ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$2(((MutableIntState)this.A), v4);
                ((Ref)this.y).setValue(((LayoutCoordinates)object0));
                View view0 = ((View)this.z).getRootView();
                LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)((Ref)this.y).getValue();
                me me0 = new me(((MutableIntState)this.B), 2);
                androidx.compose.material.ExposedDropdownMenu_androidKt.access$updateHeight(view0, layoutCoordinates0, this.x, me0);
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((AnimationScope)object0), "$this$animateTo");
                float f = ((Number)((AnimationScope)object0).getValue()).floatValue() - ((FloatRef)this.y).element;
                ScrollScope scrollScope0 = (ScrollScope)this.z;
                float f1 = scrollScope0.scrollBy(f);
                ((FloatRef)this.y).element = ((Number)((AnimationScope)object0).getValue()).floatValue();
                ((FloatRef)this.A).element = ((Number)((AnimationScope)object0).getVelocity()).floatValue();
                SnapperFlingBehavior snapperFlingBehavior0 = (SnapperFlingBehavior)this.B;
                SnapperLayoutItemInfo snapperLayoutItemInfo0 = SnapperFlingBehavior.access$getLayoutInfo$p(snapperFlingBehavior0).getCurrentItem();
                if(snapperLayoutItemInfo0 == null) {
                    ((AnimationScope)object0).cancelAnimation();
                    return Unit.INSTANCE;
                }
                h h0 = new h(scrollScope0, 12);
                if(SnapperFlingBehavior.access$performSnapBackIfNeeded(snapperFlingBehavior0, ((AnimationScope)object0), snapperLayoutItemInfo0, this.x, h0)) {
                    ((AnimationScope)object0).cancelAnimation();
                    return Unit.INSTANCE;
                }
                if(Math.abs(f - f1) > 0.5f) {
                    ((AnimationScope)object0).cancelAnimation();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

