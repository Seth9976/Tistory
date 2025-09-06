package com.kakao.kandinsky.crop.math;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000B\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ7\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\nR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010\u001E\u001A\u0004\b!\u0010\nR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u000F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Lcom/kakao/kandinsky/crop/math/NamedVertex;", "", "Landroidx/compose/ui/geometry/Offset;", "fixPoint", "movePoint", "", "others", "<init>", "(JJLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-F1C5BW0", "()J", "component1", "component2-F1C5BW0", "component2", "component3", "()Ljava/util/List;", "copy-Wko1d7g", "(JJLjava/util/List;)Lcom/kakao/kandinsky/crop/math/NamedVertex;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getFixPoint-F1C5BW0", "b", "getMovePoint-F1C5BW0", "c", "Ljava/util/List;", "getOthers", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NamedVertex {
    public static final int $stable = 8;
    public final long a;
    public final long b;
    public final List c;

    public NamedVertex(long v, long v1, List list0, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(list0, "others");
        super();
        this.a = v;
        this.b = v1;
        this.c = list0;
    }

    public final long component1-F1C5BW0() {
        return this.a;
    }

    public final long component2-F1C5BW0() {
        return this.b;
    }

    @NotNull
    public final List component3() {
        return this.c;
    }

    @NotNull
    public final NamedVertex copy-Wko1d7g(long v, long v1, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "others");
        return new NamedVertex(v, v1, list0, null);
    }

    public static NamedVertex copy-Wko1d7g$default(NamedVertex namedVertex0, long v, long v1, List list0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = namedVertex0.a;
        }
        if((v2 & 2) != 0) {
            v1 = namedVertex0.b;
        }
        if((v2 & 4) != 0) {
            list0 = namedVertex0.c;
        }
        return namedVertex0.copy-Wko1d7g(v, v1, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof NamedVertex)) {
            return false;
        }
        if(!Offset.equals-impl0(this.a, ((NamedVertex)object0).a)) {
            return false;
        }
        return Offset.equals-impl0(this.b, ((NamedVertex)object0).b) ? Intrinsics.areEqual(this.c, ((NamedVertex)object0).c) : false;
    }

    public final long getFixPoint-F1C5BW0() {
        return this.a;
    }

    public final long getMovePoint-F1C5BW0() {
        return this.b;
    }

    @NotNull
    public final List getOthers() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (Offset.hashCode-impl(this.b) + Offset.hashCode-impl(this.a) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return a.e(b.w("NamedVertex(fixPoint=", Offset.toString-impl(this.a), ", movePoint=", Offset.toString-impl(this.b), ", others="), this.c, ")");
    }
}

