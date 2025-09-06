package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b-\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0010\u001A\u00020\b\u0012\u0006\u0010\u0011\u001A\u00020\u0003\u0012\u0006\u0010\u0012\u001A\u00020\u0003\u0012\u0006\u0010\u0013\u001A\u00020\u0003\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u0012\u0006\u0010\u0017\u001A\u00020\u0016\u0012\b\u0010\u0018\u001A\u0004\u0018\u00010\u0016\u0012\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0019\u0010\u001F\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b\u001F\u0010 J/\u0010&\u001A\u00020%2\u0006\u0010!\u001A\u00020\u00032\u0006\u0010\"\u001A\u00020\u00032\u0006\u0010#\u001A\u00020\u00032\u0006\u0010$\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b&\u0010\'J%\u0010&\u001A\u00020%2\u0006\u0010!\u001A\u00020\u00032\u0006\u0010#\u001A\u00020\u00032\u0006\u0010$\u001A\u00020\u0003\u00A2\u0006\u0004\b&\u0010(J\u0015\u0010*\u001A\u00020%2\u0006\u0010)\u001A\u00020\u0003\u00A2\u0006\u0004\b*\u0010+J\u001D\u0010.\u001A\u00020\u00142\u0006\u0010\u0004\u001A\u00020\u0003H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b,\u0010-J\u001D\u00101\u001A\u00020%2\u0006\u0010/\u001A\u00020\u00032\u0006\u00100\u001A\u00020\b\u00A2\u0006\u0004\b1\u00102J\u001D\u00106\u001A\u00020%2\u0006\u00104\u001A\u0002032\u0006\u00105\u001A\u00020\b\u00A2\u0006\u0004\b6\u00107R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R\u001A\u0010\t\u001A\u00020\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b\t\u0010>R\u001A\u0010\u0017\u001A\u00020\u00168\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\u001C\u0010\u0018\u001A\u0004\u0018\u00010\u00168\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bC\u0010@\u001A\u0004\bD\u0010BR \u0010\u001C\u001A\u00020\u001B8\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR$\u0010K\u001A\u00020\u00032\u0006\u0010I\u001A\u00020\u00038\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\bJ\u00109\u001A\u0004\b.\u0010;R\u001A\u0010N\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bL\u00109\u001A\u0004\bM\u0010;R\u001A\u0010Q\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bO\u00109\u001A\u0004\bP\u0010;R\u0017\u0010T\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bR\u00109\u001A\u0004\bS\u0010;R\"\u0010Y\u001A\u00020\b8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bU\u0010=\u001A\u0004\bV\u0010>\"\u0004\bW\u0010XR\u001A\u0010Z\u001A\u00020\u00038\u0016X\u0096D\u00A2\u0006\f\n\u0004\bZ\u00109\u001A\u0004\b[\u0010;R\u001A\u0010\\\u001A\u00020\u00038\u0016X\u0096D\u00A2\u0006\f\n\u0004\b\\\u00109\u001A\u0004\b]\u0010;R\u0014\u0010_\u001A\u00020\u00038VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b^\u0010;\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006`"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "position", "(IIII)V", "(III)V", "mainAxisLayoutSize", "updateMainAxisLayoutSize", "(I)V", "getOffset-Bjo55l4", "(I)J", "getOffset", "delta", "updateAnimations", "applyScrollDelta", "(IZ)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "isLookingAhead", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", "a", "I", "getIndex", "()I", "c", "Z", "()Z", "l", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "m", "getContentType", "o", "J", "getConstraints-msEJaDk", "()J", "<set-?>", "p", "offset", "q", "getSize", "size", "r", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "s", "getCrossAxisSize", "crossAxisSize", "t", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "nonScrollableItem", "lane", "getLane", "span", "getSpan", "getPlaceablesCount", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n258#1:275\n258#1:277\n33#2,6:263\n69#2,6:269\n1#3:276\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n187#1:275\n231#1:277\n101#1:263,6\n137#1:269,6\n*E\n"})
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    public final int a;
    public final List b;
    public final boolean c;
    public final Horizontal d;
    public final Vertical e;
    public final LayoutDirection f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final LazyLayoutItemAnimator n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public final int[] x;

    @ExperimentalFoundationApi
    public LazyListMeasuredItem(int v, List list0, boolean z, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, LayoutDirection layoutDirection0, boolean z1, int v1, int v2, int v3, long v4, Object object0, Object object1, LazyLayoutItemAnimator lazyLayoutItemAnimator0, long v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = list0;
        this.c = z;
        this.d = alignment$Horizontal0;
        this.e = alignment$Vertical0;
        this.f = layoutDirection0;
        this.g = z1;
        this.h = v1;
        this.i = v2;
        this.j = v3;
        this.k = v4;
        this.l = object0;
        this.m = object1;
        this.n = lazyLayoutItemAnimator0;
        this.o = v5;
        this.u = 0x80000000;
        int v6 = list0.size();
        int v8 = 0;
        int v9 = 0;
        for(int v7 = 0; v7 < v6; ++v7) {
            Placeable placeable0 = (Placeable)list0.get(v7);
            v8 += (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth());
            v9 = Math.max(v9, (this.isVertical() ? placeable0.getWidth() : placeable0.getHeight()));
        }
        this.q = v8;
        this.r = c.coerceAtLeast(this.getSize() + this.j, 0);
        this.s = v9;
        this.x = new int[this.b.size() * 2];
    }

    // 去混淆评级： 低(20)
    public final int a(long v) {
        return this.isVertical() ? IntOffset.getY-impl(v) : IntOffset.getX-impl(v);
    }

    public final void applyScrollDelta(int v, boolean z) {
        if(this.getNonScrollableItem()) {
            return;
        }
        this.p = this.getOffset() + v;
        int[] arr_v = this.x;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            if(this.isVertical() && v2 % 2 == 1 || !this.isVertical() && v2 % 2 == 0) {
                arr_v[v2] += v;
            }
        }
        if(z) {
            int v3 = this.getPlaceablesCount();
            for(int v1 = 0; v1 < v3; ++v1) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.n.getAnimation(this.getKey(), v1);
                if(lazyLayoutItemAnimation0 != null) {
                    long v4 = lazyLayoutItemAnimation0.getRawOffset-nOcc-ac();
                    lazyLayoutItemAnimation0.setRawOffset--gyyYBs(IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v4) : IntOffset.getX-impl(v4) + v), (this.isVertical() ? IntOffset.getY-impl(v4) + v : IntOffset.getY-impl(v4))));
                }
            }
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long getConstraints-msEJaDk() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo
    @Nullable
    public Object getContentType() {
        return this.m;
    }

    public final int getCrossAxisSize() {
        return this.s;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @NotNull
    public Object getKey() {
        return this.l;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return 0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.r;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.t;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.p;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public long getOffset-Bjo55l4(int v) {
        return IntOffsetKt.IntOffset(this.x[v * 2], this.x[v * 2 + 1]);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @Nullable
    public Object getParentData(int v) {
        return ((Placeable)this.b.get(v)).getParentData();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.b.size();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.q;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return 1;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.c;
    }

    public final void place(@NotNull PlacementScope placeable$PlacementScope0, boolean z) {
        GraphicsLayer graphicsLayer0;
        if(this.u == 0x80000000) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int v = this.getPlaceablesCount();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable placeable0 = (Placeable)this.b.get(v1);
            int v2 = this.v;
            int v3 = this.isVertical() ? placeable0.getHeight() : placeable0.getWidth();
            int v4 = this.w;
            long v5 = this.getOffset-Bjo55l4(v1);
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = this.n.getAnimation(this.getKey(), v1);
            if(lazyLayoutItemAnimation0 == null) {
                graphicsLayer0 = null;
            }
            else {
                if(z) {
                    lazyLayoutItemAnimation0.setLookaheadOffset--gyyYBs(v5);
                }
                else {
                    if(!IntOffset.equals-impl0(lazyLayoutItemAnimation0.getLookaheadOffset-nOcc-ac(), 0x7FFFFFFF7FFFFFFFL)) {
                        v5 = lazyLayoutItemAnimation0.getLookaheadOffset-nOcc-ac();
                    }
                    long v6 = IntOffset.plus-qkQi6aY(v5, lazyLayoutItemAnimation0.getPlacementDelta-nOcc-ac());
                    if(this.a(v5) <= v2 - v3 && this.a(v6) <= v2 - v3 || this.a(v5) >= v4 && this.a(v6) >= v4) {
                        lazyLayoutItemAnimation0.cancelPlacementAnimation();
                    }
                    v5 = v6;
                }
                graphicsLayer0 = lazyLayoutItemAnimation0.getLayer();
            }
            if(this.g) {
                v5 = IntOffsetKt.IntOffset((this.isVertical() ? IntOffset.getX-impl(v5) : this.u - IntOffset.getX-impl(v5) - (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth())), (this.isVertical() ? this.u - IntOffset.getY-impl(v5) - (this.isVertical() ? placeable0.getHeight() : placeable0.getWidth()) : IntOffset.getY-impl(v5)));
            }
            long v7 = IntOffset.plus-qkQi6aY(v5, this.k);
            if(!z && lazyLayoutItemAnimation0 != null) {
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

    public final void position(int v, int v1, int v2) {
        int v5;
        this.p = v;
        this.u = this.isVertical() ? v2 : v1;
        List list0 = this.b;
        int v3 = list0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            Placeable placeable0 = (Placeable)list0.get(v4);
            int[] arr_v = this.x;
            if(this.isVertical()) {
                Horizontal alignment$Horizontal0 = this.d;
                if(alignment$Horizontal0 == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                arr_v[v4 * 2] = alignment$Horizontal0.align(placeable0.getWidth(), v1, this.f);
                arr_v[v4 * 2 + 1] = v;
                v5 = placeable0.getHeight();
            }
            else {
                arr_v[v4 * 2] = v;
                Vertical alignment$Vertical0 = this.e;
                if(alignment$Vertical0 == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                arr_v[v4 * 2 + 1] = alignment$Vertical0.align(placeable0.getHeight(), v2);
                v5 = placeable0.getWidth();
            }
            v = v5 + v;
        }
        this.v = -this.h;
        this.w = this.u + this.i;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int v, int v1, int v2, int v3) {
        this.position(v, v2, v3);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z) {
        this.t = z;
    }

    public final void updateMainAxisLayoutSize(int v) {
        this.u = v;
        this.w = v + this.i;
    }
}

