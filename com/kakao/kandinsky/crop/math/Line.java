package com.kakao.kandinsky.crop.math;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import ce.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\n\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u000B\u001A\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0019\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001A\u00020\u00022\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00000\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001C\u001A\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001BJ\u0016\u0010\u001E\u001A\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001BJ\'\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001F\u0010 J\u0010\u0010#\u001A\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001A\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010\'J\u001A\u0010)\u001A\u00020\u00102\b\u0010(\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u001BR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010,\u001A\u0004\b/\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lcom/kakao/kandinsky/crop/math/Line;", "", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "point", "getPerpendicularLine-PeaRLWg", "(J)Landroidx/compose/ui/geometry/Offset;", "getPerpendicularLine", "line", "findIntersection-x-9fifI", "(Lcom/kakao/kandinsky/crop/math/Line;)Landroidx/compose/ui/geometry/Offset;", "findIntersection", "offset", "", "inRange-k-4lQ0M", "(J)Z", "inRange", "target", "", "candidates", "findNearestIntersection-H5M4yMg", "(JLjava/util/List;)Landroidx/compose/ui/geometry/Offset;", "findNearestIntersection", "component1-F1C5BW0", "()J", "component1", "component2-F1C5BW0", "component2", "copy-0a9Yr6o", "(JJ)Lcom/kakao/kandinsky/crop/math/Line;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getStart-F1C5BW0", "b", "getEnd-F1C5BW0", "Companion", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Line.kt\ncom/kakao/kandinsky/crop/math/Line\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1603#2,9:47\n1855#2:56\n1856#2:58\n1612#2:59\n2333#2,14:60\n1#3:57\n*S KotlinDebug\n*F\n+ 1 Line.kt\ncom/kakao/kandinsky/crop/math/Line\n*L\n39#1:47,9\n39#1:56\n39#1:58\n39#1:59\n43#1:60,14\n39#1:57\n*E\n"})
public final class Line {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/crop/math/Line$Companion;", "", "", "INTERSECT_THRESHOLD", "F", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public final LinearEquation c;

    static {
        Line.Companion = new Companion(null);
    }

    public Line(long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0L;
        }
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        this(v, v1, null);
    }

    public Line(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = LinearEquation.Companion.from-0a9Yr6o(v, v1);
    }

    public final long component1-F1C5BW0() {
        return this.a;
    }

    public final long component2-F1C5BW0() {
        return this.b;
    }

    @NotNull
    public final Line copy-0a9Yr6o(long v, long v1) {
        return new Line(v, v1, null);
    }

    public static Line copy-0a9Yr6o$default(Line line0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = line0.a;
        }
        if((v2 & 2) != 0) {
            v1 = line0.b;
        }
        return line0.copy-0a9Yr6o(v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Line)) {
            return false;
        }
        return Offset.equals-impl0(this.a, ((Line)object0).a) ? Offset.equals-impl0(this.b, ((Line)object0).b) : false;
    }

    @Nullable
    public final Offset findIntersection-x-9fifI(@NotNull Line line0) {
        Intrinsics.checkNotNullParameter(line0, "line");
        return this.c.intersection-x-9fifI(line0.c);
    }

    @Nullable
    public final Offset findNearestIntersection-H5M4yMg(long v, @NotNull List list0) {
        Offset offset0;
        Intrinsics.checkNotNullParameter(list0, "candidates");
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(true) {
            offset0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Line line0 = (Line)object0;
            Offset offset1 = this.findIntersection-x-9fifI(line0);
            if(offset1 != null) {
                long v1 = offset1.unbox-impl();
                if(this.inRange-k-4lQ0M(v1) && line0.inRange-k-4lQ0M(v1)) {
                    offset0 = offset1;
                }
            }
            if(offset0 != null) {
                arrayList0.add(offset0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(iterator1.hasNext()) {
            offset0 = iterator1.next();
            if(iterator1.hasNext()) {
                float f = Offset.getDistance-impl(Offset.minus-MK-Hz9U(offset0.unbox-impl(), v));
                while(true) {
                    Object object1 = iterator1.next();
                    float f1 = Offset.getDistance-impl(Offset.minus-MK-Hz9U(((Offset)object1).unbox-impl(), v));
                    if(Float.compare(f, f1) > 0) {
                        offset0 = object1;
                        f = f1;
                    }
                    if(!iterator1.hasNext()) {
                        break;
                    }
                }
            }
        }
        return offset0;
    }

    public final long getEnd-F1C5BW0() {
        return this.b;
    }

    @Nullable
    public final Offset getPerpendicularLine-PeaRLWg(long v) {
        Offset offset0 = this.c.perpendicularIntersection-PeaRLWg(v);
        if(offset0 != null) {
            long v1 = new Line(v, offset0.unbox-impl(), null).b;
            return this.inRange-k-4lQ0M(v1) ? Offset.box-impl(v1) : null;
        }
        return null;
    }

    public final long getStart-F1C5BW0() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Offset.hashCode-impl(this.b) + Offset.hashCode-impl(this.a) * 0x1F;
    }

    public final boolean inRange-k-4lQ0M(long v) {
        ClosedFloatingPointRange closedFloatingPointRange0 = Float.compare(Offset.getX-impl(this.a), Offset.getX-impl(this.b)) >= 0 ? e.rangeTo(Offset.getX-impl(this.b) - 0.1f, Offset.getX-impl(this.a) + 0.1f) : e.rangeTo(Offset.getX-impl(this.a) - 0.1f, Offset.getX-impl(this.b) + 0.1f);
        ClosedFloatingPointRange closedFloatingPointRange1 = Offset.getY-impl(this.a) < Offset.getY-impl(this.b) ? e.rangeTo(Offset.getY-impl(this.a) - 0.1f, Offset.getY-impl(this.b) + 0.1f) : e.rangeTo(Offset.getY-impl(this.b) - 0.1f, Offset.getY-impl(this.a) + 0.1f);
        return closedFloatingPointRange0.contains(Offset.getX-impl(v)) && closedFloatingPointRange1.contains(Offset.getY-impl(v));
    }

    @Override
    @NotNull
    public String toString() {
        return b.o("Line(start=", Offset.toString-impl(this.a), ", end=", Offset.toString-impl(this.b), ")");
    }
}

