package androidx.compose.foundation.lazy.grid;

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
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0007\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\u0003\u0012\u0006\u0010\u000F\u001A\u00020\u0003\u0012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001A\u00020\u0018\u0012\u0006\u0010\u001A\u001A\u00020\u0003\u0012\u0006\u0010\u001B\u001A\u00020\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0019\u0010\u001E\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001D\u0010\"\u001A\u00020\u00132\u0006\u0010\u0004\u001A\u00020\u0003H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b \u0010!J/\u0010(\u001A\u00020\'2\u0006\u0010#\u001A\u00020\u00032\u0006\u0010$\u001A\u00020\u00032\u0006\u0010%\u001A\u00020\u00032\u0006\u0010&\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b(\u0010)J=\u0010(\u001A\u00020\'2\u0006\u0010#\u001A\u00020\u00032\u0006\u0010$\u001A\u00020\u00032\u0006\u0010%\u001A\u00020\u00032\u0006\u0010&\u001A\u00020\u00032\u0006\u0010*\u001A\u00020\u00032\u0006\u0010+\u001A\u00020\u0003\u00A2\u0006\u0004\b(\u0010,J\u0015\u0010.\u001A\u00020\'2\u0006\u0010-\u001A\u00020\u0003\u00A2\u0006\u0004\b.\u0010/J\u0015\u00101\u001A\u00020\'2\u0006\u00100\u001A\u00020\u0003\u00A2\u0006\u0004\b1\u0010/J\u0015\u00104\u001A\u00020\'2\u0006\u00103\u001A\u000202\u00A2\u0006\u0004\b4\u00105R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b\b\u0010@R\u0017\u0010\t\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bA\u00107\u001A\u0004\bB\u00109R\u001C\u0010\u0015\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bC\u0010;\u001A\u0004\bD\u0010=R \u0010\u0019\u001A\u00020\u00188\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR\u001A\u0010\u001A\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bI\u00107\u001A\u0004\bJ\u00109R\u001A\u0010\u001B\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bK\u00107\u001A\u0004\bL\u00109R\u0017\u0010O\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bM\u00107\u001A\u0004\bN\u00109R\u001A\u0010R\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bP\u00107\u001A\u0004\bQ\u00109R \u0010V\u001A\u00020S8\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bT\u0010F\u001A\u0004\bU\u0010HR*\u0010Z\u001A\u00020\u00132\u0006\u0010W\u001A\u00020\u00138\u0016@RX\u0096\u000E\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bX\u0010F\u001A\u0004\bY\u0010HR$\u0010*\u001A\u00020\u00032\u0006\u0010W\u001A\u00020\u00038\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b[\u00107\u001A\u0004\b\\\u00109R$\u0010+\u001A\u00020\u00032\u0006\u0010W\u001A\u00020\u00038\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b]\u00107\u001A\u0004\b^\u00109R\"\u0010c\u001A\u00020\u00078\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b_\u0010?\u001A\u0004\b`\u0010@\"\u0004\ba\u0010bR\u0014\u0010e\u001A\u00020\u00038VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bd\u00109\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", "getOffset-Bjo55l4", "(I)J", "getOffset", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "position", "(IIII)V", "row", "column", "(IIIIII)V", "mainAxisLayoutSize", "updateMainAxisLayoutSize", "(I)V", "delta", "applyScrollDelta", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Z", "()Z", "d", "getCrossAxisSize", "k", "getContentType", "m", "J", "getConstraints-msEJaDk", "()J", "n", "getLane", "o", "getSpan", "p", "getMainAxisSize", "mainAxisSize", "q", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "Landroidx/compose/ui/unit/IntSize;", "u", "getSize-YbymL2g", "size", "<set-?>", "v", "getOffset-nOcc-ac", "offset", "w", "getRow", "x", "getColumn", "y", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "nonScrollableItem", "getPlaceablesCount", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n229#1:240\n229#1:241\n229#1:243\n33#2,6:234\n1#3:242\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n169#1:240\n173#1:241\n204#1:243\n79#1:234,6\n*E\n"})
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final LayoutDirection f;
    public final int g;
    public final int h;
    public final List i;
    public final long j;
    public final Object k;
    public final LazyLayoutItemAnimator l;
    public final long m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public final long u;
    public long v;
    public int w;
    public int x;
    public boolean y;

    public LazyGridMeasuredItem(int v, Object object0, boolean z, int v1, int v2, boolean z1, LayoutDirection layoutDirection0, int v3, int v4, List list0, long v5, Object object1, LazyLayoutItemAnimator lazyLayoutItemAnimator0, long v6, int v7, int v8, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = object0;
        this.c = z;
        this.d = v1;
        this.e = z1;
        this.f = layoutDirection0;
        this.g = v3;
        this.h = v4;
        this.i = list0;
        this.j = v5;
        this.k = object1;
        this.l = lazyLayoutItemAnimator0;
        this.m = v6;
        this.n = v7;
        this.o = v8;
        this.r = 0x80000000;
        int v9 = list0.size();
        int v11 = 0;
        for(int v10 = 0; v10 < v9; ++v10) {
            Placeable placeable0 = (Placeable)list0.get(v10);
            v11 = Math.max(v11, (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth()));
        }
        this.p = v11;
        this.q = c.coerceAtLeast(v11 + v2, 0);
        this.u = this.isVertical() ? IntSizeKt.IntSize(this.d, v11) : IntSizeKt.IntSize(v11, this.d);
        this.v = 0L;
        this.w = -1;
        this.x = -1;
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
        this.v = IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v1) : IntOffset.getX-impl(v1) + v), (this.isVertical() ? IntOffset.getY-impl(v1) + v : IntOffset.getY-impl(v1)));
        int v2 = this.getPlaceablesCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.l.getAnimation(this.getKey(), v3);
            if(lazyLayoutItemAnimation0 != null) {
                long v4 = lazyLayoutItemAnimation0.getRawOffset-nOcc-ac();
                lazyLayoutItemAnimation0.setRawOffset--gyyYBs(IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v4) : IntOffset.getX-impl(v4) + v), (this.isVertical() ? IntOffset.getY-impl(v4) + v : IntOffset.getY-impl(v4))));
            }
        }
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.x;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long getConstraints-msEJaDk() {
        return this.m;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @Nullable
    public Object getContentType() {
        return this.k;
    }

    public final int getCrossAxisSize() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @NotNull
    public Object getKey() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.n;
    }

    public final int getMainAxisSize() {
        return this.p;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.q;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.y;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long getOffset-Bjo55l4(int v) {
        return this.getOffset-nOcc-ac();
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public long getOffset-nOcc-ac() {
        return this.v;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @Nullable
    public Object getParentData(int v) {
        return ((Placeable)this.i.get(v)).getParentData();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.i.size();
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.w;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public long getSize-YbymL2g() {
        return this.u;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.c;
    }

    public final void place(@NotNull PlacementScope placeable$PlacementScope0) {
        GraphicsLayer graphicsLayer0;
        if(this.r == 0x80000000) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int v = this.getPlaceablesCount();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable placeable0 = (Placeable)this.i.get(v1);
            int v2 = this.s;
            int v3 = this.isVertical() ? placeable0.getHeight() : placeable0.getWidth();
            int v4 = this.t;
            long v5 = this.getOffset-nOcc-ac();
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.l.getAnimation(this.getKey(), v1);
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
            if(this.e) {
                v5 = IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v5) : this.r - IntOffset.getX-impl(v5) - (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth())), (this.isVertical() ? this.r - IntOffset.getY-impl(v5) - (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth()) : IntOffset.getY-impl(v5)));
            }
            long v7 = IntOffset.plus-qkQi6aY(v5, this.j);
            if(lazyLayoutItemAnimation0 != null) {
                lazyLayoutItemAnimation0.setFinalOffset--gyyYBs(v7);
            }
            if(this.isVertical()) {
                if(graphicsLayer0 == null) {
                    PlacementScope.placeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v7, 0.0f, null, 6, null);
                }
                else {
                    PlacementScope.placeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v7, graphicsLayer0, 0.0f, 4, null);
                }
            }
            else if(graphicsLayer0 == null) {
                PlacementScope.placeRelativeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v7, 0.0f, null, 6, null);
            }
            else {
                PlacementScope.placeRelativeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v7, graphicsLayer0, 0.0f, 4, null);
            }
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int v, int v1, int v2, int v3) {
        this.position(v, v1, v2, v3, -1, -1);
    }

    public final void position(int v, int v1, int v2, int v3, int v4, int v5) {
        this.r = this.isVertical() ? v3 : v2;
        if(!this.isVertical()) {
            v2 = v3;
        }
        if(this.isVertical() && this.f == LayoutDirection.Rtl) {
            v1 = v2 - v1 - this.d;
        }
        this.v = this.isVertical() ? IntOffsetKt.IntOffset(v1, v) : IntOffsetKt.IntOffset(v, v1);
        this.w = v4;
        this.x = v5;
        this.s = -this.g;
        this.t = this.r + this.h;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z) {
        this.y = z;
    }

    public final void updateMainAxisLayoutSize(int v) {
        this.r = v;
        this.t = v + this.h;
    }
}

