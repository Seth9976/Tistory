package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\u0003\u0012\u0006\u0010\r\u001A\u00020\u0003\u0012\u0006\u0010\u000E\u001A\u00020\u0003\u0012\u0006\u0010\u000F\u001A\u00020\u0003\u0012\u0006\u0010\u0010\u001A\u00020\u0003\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0004\u001A\u00020\u0003H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ%\u0010\"\u001A\u00020!2\u0006\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u001F\u001A\u00020\u00032\u0006\u0010 \u001A\u00020\u0003\u00A2\u0006\u0004\b\"\u0010#J/\u0010\"\u001A\u00020!2\u0006\u0010$\u001A\u00020\u00032\u0006\u0010%\u001A\u00020\u00032\u0006\u0010&\u001A\u00020\u00032\u0006\u0010\'\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b\"\u0010(J\u001D\u0010-\u001A\u00020!2\u0006\u0010*\u001A\u00020)2\u0006\u0010,\u001A\u00020+\u00A2\u0006\u0004\b-\u0010.J\u0015\u0010/\u001A\u00020!2\u0006\u0010 \u001A\u00020\u0003\u00A2\u0006\u0004\b/\u00100J\u0015\u00102\u001A\u00020!2\u0006\u00101\u001A\u00020\u0003\u00A2\u0006\u0004\b2\u00100J\u000F\u00104\u001A\u000203H\u0016\u00A2\u0006\u0004\b4\u00105R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b\u000B\u0010@R\u001A\u0010\r\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bA\u00107\u001A\u0004\bB\u00109R\u001A\u0010\u000E\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bC\u00107\u001A\u0004\bD\u00109R\u001C\u0010\u0011\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bE\u0010;\u001A\u0004\bF\u0010=R \u0010\u0015\u001A\u00020\u00148\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR\"\u0010L\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010?\u001A\u0004\bL\u0010@\"\u0004\bM\u0010NR\u0017\u0010Q\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bO\u00107\u001A\u0004\bP\u00109R\u001A\u0010T\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bR\u00107\u001A\u0004\bS\u00109R\u0017\u0010W\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bU\u00107\u001A\u0004\bV\u00109R\"\u0010[\u001A\u00020\n8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bX\u0010?\u001A\u0004\bY\u0010@\"\u0004\bZ\u0010NR \u0010_\u001A\u00020\\8\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b]\u0010H\u001A\u0004\b^\u0010JR*\u0010c\u001A\u00020\u001A2\u0006\u0010`\u001A\u00020\u001A8\u0016@RX\u0096\u000E\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\ba\u0010H\u001A\u0004\bb\u0010JR\u0014\u0010e\u001A\u00020\u00038VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bd\u00109R\u0011\u0010$\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\bf\u00109\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006g"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "mainAxis", "crossAxis", "mainAxisLayoutSize", "", "position", "(III)V", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "(IIII)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "context", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)V", "updateMainAxisLayoutSize", "(I)V", "delta", "applyScrollDelta", "", "toString", "()Ljava/lang/String;", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "d", "Z", "()Z", "e", "getLane", "f", "getSpan", "i", "getContentType", "k", "J", "getConstraints-msEJaDk", "()J", "l", "isVisible", "setVisible", "(Z)V", "m", "getMainAxisSize", "mainAxisSize", "n", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "o", "getCrossAxisSize", "crossAxisSize", "s", "getNonScrollableItem", "setNonScrollableItem", "nonScrollableItem", "Landroidx/compose/ui/unit/IntSize;", "t", "getSize-YbymL2g", "size", "<set-?>", "u", "getOffset-nOcc-ac", "offset", "getPlaceablesCount", "placeablesCount", "getMainAxisOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1334:1\n1321#1:1356\n1323#1:1357\n1321#1:1358\n1323#1:1360\n1323#1:1361\n317#2,8:1335\n317#2,8:1343\n69#2,4:1352\n74#2:1359\n1#3:1351\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1263#1:1356\n1283#1:1357\n1284#1:1358\n1311#1:1360\n1315#1:1361\n1200#1:1335,8\n1206#1:1343,8\n1262#1:1352,4\n1262#1:1359\n*E\n"})
public final class LazyStaggeredGridMeasuredItem implements LazyLayoutMeasuredItem, LazyStaggeredGridItemInfo {
    public static final int $stable = 8;
    public final int a;
    public final Object b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    public final LazyLayoutItemAnimator j;
    public final long k;
    public boolean l;
    public final int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final long t;
    public long u;

    public LazyStaggeredGridMeasuredItem(int v, Object object0, List list0, boolean z, int v1, int v2, int v3, int v4, int v5, Object object1, LazyLayoutItemAnimator lazyLayoutItemAnimator0, long v6, DefaultConstructorMarker defaultConstructorMarker0) {
        Integer integer1;
        this.a = v;
        this.b = object0;
        this.c = list0;
        this.d = z;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = v5;
        this.i = object1;
        this.j = lazyLayoutItemAnimator0;
        this.k = v6;
        this.l = true;
        Integer integer0 = null;
        int v8 = 0;
        if(list0.isEmpty()) {
            integer1 = null;
        }
        else {
            Placeable placeable0 = (Placeable)list0.get(0);
            integer1 = (int)(this.isVertical() ? placeable0.getHeight() : placeable0.getWidth());
            int v9 = CollectionsKt__CollectionsKt.getLastIndex(list0);
            if(1 <= v9) {
                for(int v10 = 1; true; ++v10) {
                    Placeable placeable1 = (Placeable)list0.get(v10);
                    Integer integer2 = (int)(this.isVertical() ? placeable1.getHeight() : placeable1.getWidth());
                    if(integer2.compareTo(integer1) > 0) {
                        integer1 = integer2;
                    }
                    if(v10 == v9) {
                        break;
                    }
                }
            }
        }
        int v11 = integer1 == null ? 0 : ((int)integer1);
        this.m = v11;
        this.n = c.coerceAtLeast(v11 + v1, 0);
        List list1 = this.c;
        if(!list1.isEmpty()) {
            Placeable placeable2 = (Placeable)list1.get(0);
            Integer integer3 = (int)(this.isVertical() ? placeable2.getWidth() : placeable2.getHeight());
            int v12 = CollectionsKt__CollectionsKt.getLastIndex(list1);
            if(1 <= v12) {
                for(int v7 = 1; true; ++v7) {
                    Placeable placeable3 = (Placeable)list1.get(v7);
                    Integer integer4 = (int)(this.isVertical() ? placeable3.getWidth() : placeable3.getHeight());
                    if(integer4.compareTo(integer3) > 0) {
                        integer3 = integer4;
                    }
                    if(v7 == v12) {
                        break;
                    }
                }
            }
            integer0 = integer3;
        }
        if(integer0 != null) {
            v8 = (int)integer0;
        }
        this.o = v8;
        this.p = -1;
        this.t = this.isVertical() ? IntSizeKt.IntSize(v8, this.m) : IntSizeKt.IntSize(this.m, v8);
        this.u = 0L;
    }

    // 去混淆评级： 低(20)
    public final int a(long v) {
        return this.isVertical() ? IntOffset.getY-impl(v) : IntOffset.getX-impl(v);
    }

    public final void applyScrollDelta(int v) {
        if(this.getNonScrollableItem()) {
            return;
        }
        long v1 = this.getOffset-nOcc-ac();
        this.u = IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v1) : IntOffset.getX-impl(v1) + v), (this.isVertical() ? IntOffset.getY-impl(v1) + v : IntOffset.getY-impl(v1)));
        int v2 = this.getPlaceablesCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.j.getAnimation(this.getKey(), v3);
            if(lazyLayoutItemAnimation0 != null) {
                long v4 = lazyLayoutItemAnimation0.getRawOffset-nOcc-ac();
                lazyLayoutItemAnimation0.setRawOffset--gyyYBs(IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v4) : IntOffset.getX-impl(v4) + v), (this.isVertical() ? IntOffset.getY-impl(v4) + v : IntOffset.getY-impl(v4))));
            }
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long getConstraints-msEJaDk() {
        return this.k;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @Nullable
    public Object getContentType() {
        return this.i;
    }

    public final int getCrossAxisSize() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @NotNull
    public Object getKey() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.e;
    }

    public final int getMainAxisOffset() {
        return this.isVertical() ? IntOffset.getY-impl(this.getOffset-nOcc-ac()) : IntOffset.getX-impl(this.getOffset-nOcc-ac());
    }

    public final int getMainAxisSize() {
        return this.m;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.n;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.s;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long getOffset-Bjo55l4(int v) {
        return this.getOffset-nOcc-ac();
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public long getOffset-nOcc-ac() {
        return this.u;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @Nullable
    public Object getParentData(int v) {
        return ((Placeable)this.c.get(v)).getParentData();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.c.size();
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public long getSize-YbymL2g() {
        return this.t;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.f;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.d;
    }

    public final boolean isVisible() {
        return this.l;
    }

    public final void place(@NotNull PlacementScope placeable$PlacementScope0, @NotNull LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0) {
        GraphicsLayer graphicsLayer0;
        if(this.p == -1) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list0 = this.c;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable placeable0 = (Placeable)list0.get(v1);
            int v2 = this.q;
            int v3 = this.isVertical() ? placeable0.getHeight() : placeable0.getWidth();
            int v4 = this.r;
            long v5 = this.getOffset-nOcc-ac();
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.j.getAnimation(this.getKey(), v1);
            if(lazyLayoutItemAnimation0 == null) {
                graphicsLayer0 = null;
            }
            else {
                long v6 = IntOffset.plus-qkQi6aY(v5, lazyLayoutItemAnimation0.getPlacementDelta-nOcc-ac());
                if(this.a(v5) <= v2 - v3 && this.a(v6) <= v2 - v3 || this.a(v5) >= v4 && this.a(v6) >= v4) {
                    lazyLayoutItemAnimation0.cancelPlacementAnimation();
                }
                graphicsLayer0 = lazyLayoutItemAnimation0.getLayer();
                v5 = v6;
            }
            if(lazyStaggeredGridMeasureContext0.getReverseLayout()) {
                v5 = IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v5) : this.p - IntOffset.getX-impl(v5) - (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth())), (this.isVertical() ? this.p - IntOffset.getY-impl(v5) - (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth()) : IntOffset.getY-impl(v5)));
            }
            long v7 = IntOffset.plus-qkQi6aY(v5, lazyStaggeredGridMeasureContext0.getContentOffset-nOcc-ac());
            if(lazyLayoutItemAnimation0 != null) {
                lazyLayoutItemAnimation0.setFinalOffset--gyyYBs(v7);
            }
            if(graphicsLayer0 == null) {
                PlacementScope.placeRelativeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v7, 0.0f, null, 6, null);
            }
            else {
                PlacementScope.placeRelativeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v7, graphicsLayer0, 0.0f, 4, null);
            }
        }
    }

    public final void position(int v, int v1, int v2) {
        this.p = v2;
        this.q = -this.g;
        this.r = v2 + this.h;
        this.u = this.isVertical() ? IntOffsetKt.IntOffset(v1, v) : IntOffsetKt.IntOffset(v, v1);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int v, int v1, int v2, int v3) {
        if(this.isVertical()) {
            v2 = v3;
        }
        this.position(v, v1, v2);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z) {
        this.s = z;
    }

    public final void setVisible(boolean z) {
        this.l = z;
    }

    @Override
    @NotNull
    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int v) {
        this.p = v;
        this.r = v + this.h;
    }
}

