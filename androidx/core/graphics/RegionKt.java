package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\f\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f\u001A\u0015\u0010\u0004\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u0007H\u0086\n\u001A0\u0010\b\u001A\u00020\t*\u00020\u00012!\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\t0\u000BH\u0086\b\u001A\u0013\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00030\u0010*\u00020\u0001H\u0086\u0002\u001A\u0015\u0010\u0011\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\u0011\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\n\u001A\r\u0010\u0012\u001A\u00020\u0001*\u00020\u0001H\u0086\n\u001A\u0015\u0010\u0013\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\f\u001A\u0015\u0010\u0013\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f\u001A\u0015\u0010\u0014\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\u0014\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\n\u001A\r\u0010\u0015\u001A\u00020\u0001*\u00020\u0001H\u0086\n\u001A\u0015\u0010\u0016\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\f\u001A\u0015\u0010\u0016\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f¨\u0006\u0017"}, d2 = {"and", "Landroid/graphics/Region;", "r", "Landroid/graphics/Rect;", "contains", "", "p", "Landroid/graphics/Point;", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "rect", "iterator", "", "minus", "not", "or", "plus", "unaryMinus", "xor", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
public final class RegionKt {
    @NotNull
    public static final Region and(@NotNull Region region0, @NotNull Rect rect0) {
        Region region1 = new Region(region0);
        region1.op(rect0, Region.Op.INTERSECT);
        return region1;
    }

    @NotNull
    public static final Region and(@NotNull Region region0, @NotNull Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(@NotNull Region region0, @NotNull Point point0) {
        return region0.contains(point0.x, point0.y);
    }

    public static final void forEach(@NotNull Region region0, @NotNull Function1 function10) {
        RegionIterator regionIterator0 = new RegionIterator(region0);
        while(true) {
            Rect rect0 = new Rect();
            if(!regionIterator0.next(rect0)) {
                break;
            }
            function10.invoke(rect0);
        }
    }

    @NotNull
    public static final Iterator iterator(@NotNull Region region0) {
        return new Object() {
            public final RegionIterator a;
            public final Rect b;
            public boolean c;

            {
                Region region0 = region0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                RegionIterator regionIterator0 = new RegionIterator(region0);
                this.a = regionIterator0;
                Rect rect0 = new Rect();
                this.b = rect0;
                this.c = regionIterator0.next(rect0);
            }

            @Override
            public boolean hasNext() {
                return this.c;
            }

            @NotNull
            public Rect next() {
                if(!this.c) {
                    throw new IndexOutOfBoundsException();
                }
                Rect rect0 = new Rect(this.b);
                this.c = this.a.next(this.b);
                return rect0;
            }

            @Override
            public Object next() {
                return this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

    @NotNull
    public static final Region minus(@NotNull Region region0, @NotNull Rect rect0) {
        Region region1 = new Region(region0);
        region1.op(rect0, Region.Op.DIFFERENCE);
        return region1;
    }

    @NotNull
    public static final Region minus(@NotNull Region region0, @NotNull Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final Region not(@NotNull Region region0) {
        Region region1 = new Region(region0.getBounds());
        region1.op(region0, Region.Op.DIFFERENCE);
        return region1;
    }

    @NotNull
    public static final Region or(@NotNull Region region0, @NotNull Rect rect0) {
        Region region1 = new Region(region0);
        region1.union(rect0);
        return region1;
    }

    @NotNull
    public static final Region or(@NotNull Region region0, @NotNull Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.UNION);
        return region2;
    }

    @NotNull
    public static final Region plus(@NotNull Region region0, @NotNull Rect rect0) {
        Region region1 = new Region(region0);
        region1.union(rect0);
        return region1;
    }

    @NotNull
    public static final Region plus(@NotNull Region region0, @NotNull Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.UNION);
        return region2;
    }

    @NotNull
    public static final Region unaryMinus(@NotNull Region region0) {
        Region region1 = new Region(region0.getBounds());
        region1.op(region0, Region.Op.DIFFERENCE);
        return region1;
    }

    @NotNull
    public static final Region xor(@NotNull Region region0, @NotNull Rect rect0) {
        Region region1 = new Region(region0);
        region1.op(rect0, Region.Op.XOR);
        return region1;
    }

    @NotNull
    public static final Region xor(@NotNull Region region0, @NotNull Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.XOR);
        return region2;
    }
}

