package com.kakao.kandinsky.crop.math;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.crop.contract.TouchCirclePoint;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010\u0007\n\u0002\b\u000E\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ\r\u0010\r\u001A\u00020\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u0016\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u0018J\u0016\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0018J;\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002H\u00C6\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J\u0010\u0010$\u001A\u00020#H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010\'\u001A\u00020&H\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0018R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b0\u0010.\u001A\u0004\b1\u0010\u0018R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010.\u001A\u0004\b3\u0010\u0018R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b4\u0010.\u001A\u0004\b5\u0010\u0018R\u0017\u0010;\u001A\u0002068\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0017\u0010>\u001A\u0002068\u0006\u00A2\u0006\f\n\u0004\b<\u00108\u001A\u0004\b=\u0010:R\u0017\u0010A\u001A\u0002068\u0006\u00A2\u0006\f\n\u0004\b?\u00108\u001A\u0004\b@\u0010:R\u0017\u0010D\u001A\u0002068\u0006\u00A2\u0006\f\n\u0004\bB\u00108\u001A\u0004\bC\u0010:R\u001D\u0010K\u001A\b\u0012\u0004\u0012\u00020F0E8\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR\u0017\u0010M\u001A\u00020\u00028F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bL\u0010\u0018\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006N"}, d2 = {"Lcom/kakao/kandinsky/crop/math/RectVertex;", "", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "translate-k-4lQ0M", "(J)Lcom/kakao/kandinsky/crop/math/RectVertex;", "translate", "sorted", "()Lcom/kakao/kandinsky/crop/math/RectVertex;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "()Landroidx/compose/ui/geometry/Rect;", "Lcom/kakao/kandinsky/crop/contract/TouchCirclePoint;", "point", "Lcom/kakao/kandinsky/crop/math/NamedVertex;", "toNamedVertex", "(Lcom/kakao/kandinsky/crop/contract/TouchCirclePoint;)Lcom/kakao/kandinsky/crop/math/NamedVertex;", "component1-F1C5BW0", "()J", "component1", "component2-F1C5BW0", "component2", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "copy-zwwh4xc", "(JJJJ)Lcom/kakao/kandinsky/crop/math/RectVertex;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getTopLeft-F1C5BW0", "b", "getTopRight-F1C5BW0", "c", "getBottomRight-F1C5BW0", "d", "getBottomLeft-F1C5BW0", "", "e", "F", "getTop", "()F", "top", "f", "getLeft", "left", "g", "getRight", "right", "h", "getBottom", "bottom", "", "Lcom/kakao/kandinsky/crop/math/Line;", "i", "Ljava/util/List;", "getLines", "()Ljava/util/List;", "lines", "getCenter-F1C5BW0", "center", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRectVertex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectVertex.kt\ncom/kakao/kandinsky/crop/math/RectVertex\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class RectVertex {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[TouchCirclePoint.values().length];
            try {
                arr_v[TouchCirclePoint.TopLeft.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchCirclePoint.TopRight.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchCirclePoint.BottomRight.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchCirclePoint.BottomLeft.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;

    public RectVertex(long v, long v1, long v2, long v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = Math.min(Offset.getY-impl(v), Offset.getY-impl(v1));
        this.f = Math.min(Offset.getX-impl(v), Offset.getX-impl(v3));
        this.g = Math.max(Offset.getX-impl(v1), Offset.getX-impl(v2));
        this.h = Math.max(Offset.getY-impl(v3), Offset.getY-impl(v2));
        this.i = CollectionsKt__CollectionsKt.listOf(new Line[]{new Line(v, v3, null), new Line(v1, v2, null), new Line(v, v1, null), new Line(v3, v2, null)});
    }

    public final long component1-F1C5BW0() {
        return this.a;
    }

    public final long component2-F1C5BW0() {
        return this.b;
    }

    public final long component3-F1C5BW0() {
        return this.c;
    }

    public final long component4-F1C5BW0() {
        return this.d;
    }

    @NotNull
    public final RectVertex copy-zwwh4xc(long v, long v1, long v2, long v3) {
        return new RectVertex(v, v1, v2, v3, null);
    }

    public static RectVertex copy-zwwh4xc$default(RectVertex rectVertex0, long v, long v1, long v2, long v3, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : rectVertex0.a;
        long v6 = (v4 & 2) == 0 ? v1 : rectVertex0.b;
        long v7 = (v4 & 4) == 0 ? v2 : rectVertex0.c;
        return (v4 & 8) == 0 ? rectVertex0.copy-zwwh4xc(v5, v6, v7, v3) : rectVertex0.copy-zwwh4xc(v5, v6, v7, rectVertex0.d);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RectVertex)) {
            return false;
        }
        if(!Offset.equals-impl0(this.a, ((RectVertex)object0).a)) {
            return false;
        }
        if(!Offset.equals-impl0(this.b, ((RectVertex)object0).b)) {
            return false;
        }
        return Offset.equals-impl0(this.c, ((RectVertex)object0).c) ? Offset.equals-impl0(this.d, ((RectVertex)object0).d) : false;
    }

    public final float getBottom() {
        return this.h;
    }

    public final long getBottomLeft-F1C5BW0() {
        return this.d;
    }

    public final long getBottomRight-F1C5BW0() {
        return this.c;
    }

    public final long getCenter-F1C5BW0() {
        return OffsetKt.Offset((this.f + this.g) / 2.0f, (this.e + this.h) / 2.0f);
    }

    public final float getLeft() {
        return this.f;
    }

    @NotNull
    public final List getLines() {
        return this.i;
    }

    public final float getRight() {
        return this.g;
    }

    public final float getTop() {
        return this.e;
    }

    public final long getTopLeft-F1C5BW0() {
        return this.a;
    }

    public final long getTopRight-F1C5BW0() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Offset.hashCode-impl(this.d) + (Offset.hashCode-impl(this.c) + (Offset.hashCode-impl(this.b) + Offset.hashCode-impl(this.a) * 0x1F) * 0x1F) * 0x1F;
    }

    @NotNull
    public final RectVertex sorted() {
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl(this.a), Offset.box-impl(this.b), Offset.box-impl(this.c), Offset.box-impl(this.d)});
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = Offset.getX-impl(((Offset)object0).unbox-impl()); iterator0.hasNext(); f = Math.min(f, Offset.getX-impl(((Offset)object1).unbox-impl()))) {
            Object object1 = iterator0.next();
        }
        Iterator iterator1 = iterable0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = iterator1.next();
        float f1;
        for(f1 = Offset.getY-impl(((Offset)object2).unbox-impl()); iterator1.hasNext(); f1 = Math.min(f1, Offset.getY-impl(((Offset)object3).unbox-impl()))) {
            Object object3 = iterator1.next();
        }
        Iterator iterator2 = iterable0.iterator();
        if(!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object4 = iterator2.next();
        float f2;
        for(f2 = Offset.getX-impl(((Offset)object4).unbox-impl()); iterator2.hasNext(); f2 = Math.max(f2, Offset.getX-impl(((Offset)object5).unbox-impl()))) {
            Object object5 = iterator2.next();
        }
        Iterator iterator3 = iterable0.iterator();
        if(!iterator3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object6 = iterator3.next();
        float f3;
        for(f3 = Offset.getY-impl(((Offset)object6).unbox-impl()); iterator3.hasNext(); f3 = Math.max(f3, Offset.getY-impl(((Offset)object7).unbox-impl()))) {
            Object object7 = iterator3.next();
        }
        return new RectVertex(OffsetKt.Offset(f, f1), OffsetKt.Offset(f2, f1), OffsetKt.Offset(f2, f3), OffsetKt.Offset(f, f3), null);
    }

    @NotNull
    public final NamedVertex toNamedVertex(@NotNull TouchCirclePoint touchCirclePoint0) {
        Intrinsics.checkNotNullParameter(touchCirclePoint0, "point");
        int v = WhenMappings.$EnumSwitchMapping$0[touchCirclePoint0.ordinal()];
        long v1 = this.b;
        long v2 = this.d;
        if(v != 1) {
            long v3 = this.c;
            long v4 = this.a;
            switch(v) {
                case 2: {
                    List list0 = CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl(v4), Offset.box-impl(v3)});
                    return new NamedVertex(this.d, this.b, list0, null);
                }
                case 3: {
                    List list1 = CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl(v2), Offset.box-impl(v1)});
                    return new NamedVertex(this.a, this.c, list1, null);
                }
                case 4: {
                    List list2 = CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl(v4), Offset.box-impl(v3)});
                    return new NamedVertex(this.b, this.d, list2, null);
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        List list3 = CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl(v1), Offset.box-impl(v2)});
        return new NamedVertex(this.c, this.a, list3, null);
    }

    @NotNull
    public final Rect toRect() {
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl(this.a), Offset.box-impl(this.b), Offset.box-impl(this.c), Offset.box-impl(this.d)});
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = Offset.getX-impl(((Offset)object0).unbox-impl()); iterator0.hasNext(); f = Math.min(f, Offset.getX-impl(((Offset)object1).unbox-impl()))) {
            Object object1 = iterator0.next();
        }
        Iterator iterator1 = iterable0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = iterator1.next();
        float f1;
        for(f1 = Offset.getY-impl(((Offset)object2).unbox-impl()); iterator1.hasNext(); f1 = Math.min(f1, Offset.getY-impl(((Offset)object3).unbox-impl()))) {
            Object object3 = iterator1.next();
        }
        Iterator iterator2 = iterable0.iterator();
        if(!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object4 = iterator2.next();
        float f2;
        for(f2 = Offset.getX-impl(((Offset)object4).unbox-impl()); iterator2.hasNext(); f2 = Math.max(f2, Offset.getX-impl(((Offset)object5).unbox-impl()))) {
            Object object5 = iterator2.next();
        }
        Iterator iterator3 = iterable0.iterator();
        if(!iterator3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object6 = iterator3.next();
        float f3;
        for(f3 = Offset.getY-impl(((Offset)object6).unbox-impl()); iterator3.hasNext(); f3 = Math.max(f3, Offset.getY-impl(((Offset)object7).unbox-impl()))) {
            Object object7 = iterator3.next();
        }
        return new Rect(f, f1, f2, f3);
    }

    @Override
    @NotNull
    public String toString() {
        String s = Offset.toString-impl(this.a);
        String s1 = Offset.toString-impl(this.b);
        String s2 = Offset.toString-impl(this.c);
        String s3 = Offset.toString-impl(this.d);
        return b.r(b.w("RectVertex(topLeft=", s, ", topRight=", s1, ", bottomRight="), s2, ", bottomLeft=", s3, ")");
    }

    @NotNull
    public final RectVertex translate-k-4lQ0M(long v) {
        return new RectVertex(Offset.plus-MK-Hz9U(this.a, v), Offset.plus-MK-Hz9U(this.b, v), Offset.plus-MK-Hz9U(this.c, v), Offset.plus-MK-Hz9U(this.d, v), null);
    }
}

