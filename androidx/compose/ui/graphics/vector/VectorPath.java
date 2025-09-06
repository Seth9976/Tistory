package androidx.compose.ui.graphics.vector;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B\u009B\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u000B\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0096\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u001D\u0010\b\u001A\u00020\u00078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010!R\u0019\u0010\n\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104R\u0019\u0010\r\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\b5\u0010.\u001A\u0004\b6\u00100R\u0017\u0010\u000E\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b7\u00102\u001A\u0004\b8\u00104R\u0017\u0010\u000F\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b9\u00102\u001A\u0004\b:\u00104R\u001D\u0010\u0011\u001A\u00020\u00108\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u0010+\u001A\u0004\b<\u0010!R\u001D\u0010\u0013\u001A\u00020\u00128\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b=\u0010+\u001A\u0004\b>\u0010!R\u0017\u0010\u0014\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b?\u00102\u001A\u0004\b@\u00104R\u0017\u0010\u0015\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bA\u00102\u001A\u0004\bB\u00104R\u0017\u0010\u0016\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bC\u00102\u001A\u0004\bD\u00104R\u0017\u0010\u0017\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bE\u00102\u001A\u0004\bF\u00104\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006G"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "name", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "c", "I", "getPathFillType-Rg-k1Os", "d", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "e", "F", "getFillAlpha", "()F", "f", "getStroke", "g", "getStrokeAlpha", "h", "getStrokeLineWidth", "i", "getStrokeLineCap-KaPHkGw", "j", "getStrokeLineJoin-LxFBmk8", "k", "getStrokeLineMiter", "l", "getTrimPathStart", "m", "getTrimPathEnd", "n", "getTrimPathOffset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorPath extends VectorNode {
    public static final int $stable;
    public final String a;
    public final List b;
    public final int c;
    public final Brush d;
    public final float e;
    public final Brush f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    // 去混淆评级： 低(20)
    public VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? s : ""), list0, v, ((v3 & 8) == 0 ? brush0 : null), ((v3 & 16) == 0 ? f : 1.0f), ((v3 & 0x20) == 0 ? brush1 : null), ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? f2 : 0.0f), ((v3 & 0x100) == 0 ? v1 : 0), ((v3 & 0x200) == 0 ? v2 : 0), ((v3 & 0x400) == 0 ? f3 : 4.0f), ((v3 & 0x800) == 0 ? f4 : 0.0f), ((v3 & 0x1000) == 0 ? f5 : 1.0f), ((v3 & 0x2000) == 0 ? f6 : 0.0f), null);
    }

    public VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
        this.a = s;
        this.b = list0;
        this.c = v;
        this.d = brush0;
        this.e = f;
        this.f = brush1;
        this.g = f1;
        this.h = f2;
        this.i = v1;
        this.j = v2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.n = f6;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(VectorPath.class != class0 || !Intrinsics.areEqual(this.a, ((VectorPath)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((VectorPath)object0).d)) {
                return false;
            }
            if(this.e != ((VectorPath)object0).e || !Intrinsics.areEqual(this.f, ((VectorPath)object0).f)) {
                return false;
            }
            if(this.g != ((VectorPath)object0).g || this.h != ((VectorPath)object0).h || !StrokeCap.equals-impl0(this.i, ((VectorPath)object0).i)) {
                return false;
            }
            if(!StrokeJoin.equals-impl0(this.j, ((VectorPath)object0).j)) {
                return false;
            }
            return this.k == ((VectorPath)object0).k && this.l == ((VectorPath)object0).l && this.m == ((VectorPath)object0).m && this.n == ((VectorPath)object0).n && PathFillType.equals-impl0(this.c, ((VectorPath)object0).c) ? Intrinsics.areEqual(this.b, ((VectorPath)object0).b) : false;
        }
        return false;
    }

    @Nullable
    public final Brush getFill() {
        return this.d;
    }

    public final float getFillAlpha() {
        return this.e;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @NotNull
    public final List getPathData() {
        return this.b;
    }

    public final int getPathFillType-Rg-k1Os() {
        return this.c;
    }

    @Nullable
    public final Brush getStroke() {
        return this.f;
    }

    public final float getStrokeAlpha() {
        return this.g;
    }

    public final int getStrokeLineCap-KaPHkGw() {
        return this.i;
    }

    public final int getStrokeLineJoin-LxFBmk8() {
        return this.j;
    }

    public final float getStrokeLineMiter() {
        return this.k;
    }

    public final float getStrokeLineWidth() {
        return this.h;
    }

    public final float getTrimPathEnd() {
        return this.m;
    }

    public final float getTrimPathOffset() {
        return this.n;
    }

    public final float getTrimPathStart() {
        return this.l;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.b(this.e, (b.c(this.b, this.a.hashCode() * 0x1F, 0x1F) + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F);
        Brush brush0 = this.f;
        if(brush0 != null) {
            v = brush0.hashCode();
        }
        return PathFillType.hashCode-impl(this.c) + a.b(this.n, a.b(this.m, a.b(this.l, a.b(this.k, (StrokeJoin.hashCode-impl(this.j) + (StrokeCap.hashCode-impl(this.i) + a.b(this.h, a.b(this.g, (v1 + v) * 0x1F, 0x1F), 0x1F)) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }
}

