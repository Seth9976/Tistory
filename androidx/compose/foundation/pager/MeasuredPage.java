package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0018\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010 \u001A\u00020\u001B2\u0006\u0010\u001F\u001A\u00020\u001E¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001A\u00020\u001B2\u0006\u0010\"\u001A\u00020\u0002¢\u0006\u0004\b#\u0010$R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001A\u0004\b*\u0010(R\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u0017\u00101\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001A\u0004\b0\u0010(R$\u0010\u0018\u001A\u00020\u00022\u0006\u00102\u001A\u00020\u00028\u0016@RX\u0096\u000E¢\u0006\f\n\u0004\b3\u0010&\u001A\u0004\b4\u0010(¨\u00065"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "", "index", "size", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", "key", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "layoutWidth", "layoutHeight", "", "position", "(III)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "delta", "applyScrollDelta", "(I)V", "a", "I", "getIndex", "()I", "b", "getSize", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "k", "getCrossAxisSize", "crossAxisSize", "<set-?>", "m", "getOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n127#1:144\n33#2,6:132\n69#2,4:138\n74#2:143\n1#3:142\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n98#1:144\n50#1:132,6\n74#1:138,4\n74#1:143\n*E\n"})
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    public final int a;
    public final int b;
    public final List c;
    public final long d;
    public final Object e;
    public final Horizontal f;
    public final Vertical g;
    public final LayoutDirection h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int[] l;
    public int m;
    public int n;

    public MeasuredPage(int v, int v1, List list0, long v2, Object object0, Orientation orientation0, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, LayoutDirection layoutDirection0, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = list0;
        this.d = v2;
        this.e = object0;
        this.f = alignment$Horizontal0;
        this.g = alignment$Vertical0;
        this.h = layoutDirection0;
        this.i = z;
        this.j = orientation0 == Orientation.Vertical;
        int v4 = list0.size();
        int v5 = 0;
        for(int v3 = 0; v3 < v4; ++v3) {
            Placeable placeable0 = (Placeable)list0.get(v3);
            v5 = Math.max(v5, (this.j ? placeable0.getWidth() : placeable0.getHeight()));
        }
        this.k = v5;
        this.l = new int[this.c.size() * 2];
        this.n = 0x80000000;
    }

    public final void applyScrollDelta(int v) {
        this.m = this.getOffset() + v;
        int[] arr_v = this.l;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(this.j && v1 % 2 == 1 || !this.j && v1 % 2 == 0) {
                arr_v[v1] += v;
            }
        }
    }

    public final int getCrossAxisSize() {
        return this.k;
    }

    @Override  // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.pager.PageInfo
    @NotNull
    public Object getKey() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.m;
    }

    public final int getSize() {
        return this.b;
    }

    public final void place(@NotNull PlacementScope placeable$PlacementScope0) {
        if(this.n == 0x80000000) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list0 = this.c;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable placeable0 = (Placeable)list0.get(v1);
            long v2 = IntOffsetKt.IntOffset(this.l[v1 * 2], this.l[v1 * 2 + 1]);
            boolean z = this.j;
            if(this.i) {
                v2 = IntOffsetKt.IntOffset((z ? IntOffset.getX-impl(v2) : this.n - IntOffset.getX-impl(v2) - placeable0.getWidth()), (z ? this.n - IntOffset.getY-impl(v2) - placeable0.getHeight() : IntOffset.getY-impl(v2)));
            }
            long v3 = IntOffset.plus-qkQi6aY(v2, this.d);
            if(z) {
                PlacementScope.placeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v3, 0.0f, null, 6, null);
            }
            else {
                PlacementScope.placeRelativeWithLayer-aW-9-wM$default(placeable$PlacementScope0, placeable0, v3, 0.0f, null, 6, null);
            }
        }
    }

    public final void position(int v, int v1, int v2) {
        int v5;
        this.m = v;
        boolean z = this.j;
        this.n = z ? v2 : v1;
        List list0 = this.c;
        int v3 = list0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            Placeable placeable0 = (Placeable)list0.get(v4);
            int[] arr_v = this.l;
            if(z) {
                Horizontal alignment$Horizontal0 = this.f;
                if(alignment$Horizontal0 == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                arr_v[v4 * 2] = alignment$Horizontal0.align(placeable0.getWidth(), v1, this.h);
                arr_v[v4 * 2 + 1] = v;
                v5 = placeable0.getHeight();
            }
            else {
                arr_v[v4 * 2] = v;
                Vertical alignment$Vertical0 = this.g;
                if(alignment$Vertical0 == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                arr_v[v4 * 2 + 1] = alignment$Vertical0.align(placeable0.getHeight(), v2);
                v5 = placeable0.getWidth();
            }
            v = v5 + v;
        }
    }
}

