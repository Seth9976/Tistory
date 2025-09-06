package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001E\u0010\u0014\u001A\u00060\u0010j\u0002`\u00112\u0006\u0010\u000F\u001A\u00020\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001FR\u001A\u0010\"\u001A\u00020\u000E8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b \u0010!\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LinearGradient extends ShaderBrush {
    public final List f;
    public final List g;
    public final long h;
    public final long i;
    public final int j;

    public LinearGradient(List list0, List list1, long v, long v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0, ((v3 & 2) == 0 ? list1 : null), v, v1, ((v3 & 16) == 0 ? v2 : 0), null);
    }

    public LinearGradient(List list0, List list1, long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.f = list0;
        this.g = list1;
        this.h = v;
        this.i = v1;
        this.j = v2;
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    public Shader createShader-uvyYCjk(long v) {
        float f = Offset.getX-impl(this.h) == Infinityf ? Size.getWidth-impl(v) : Offset.getX-impl(this.h);
        float f1 = Offset.getY-impl(this.h) == Infinityf ? Size.getHeight-impl(v) : Offset.getY-impl(this.h);
        float f2 = Offset.getX-impl(this.i) == Infinityf ? Size.getWidth-impl(v) : Offset.getX-impl(this.i);
        return Offset.getY-impl(this.i) == Infinityf ? ShaderKt.LinearGradientShader-VjE6UOU(OffsetKt.Offset(f, f1), OffsetKt.Offset(f2, Size.getHeight-impl(v)), this.f, this.g, this.j) : ShaderKt.LinearGradientShader-VjE6UOU(OffsetKt.Offset(f, f1), OffsetKt.Offset(f2, Offset.getY-impl(this.i)), this.f, this.g, this.j);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LinearGradient)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((LinearGradient)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((LinearGradient)object0).g)) {
            return false;
        }
        if(!Offset.equals-impl0(this.h, ((LinearGradient)object0).h)) {
            return false;
        }
        return Offset.equals-impl0(this.i, ((LinearGradient)object0).i) ? TileMode.equals-impl0(this.j, ((LinearGradient)object0).j) : false;
    }

    @Override  // androidx.compose.ui.graphics.Brush
    public long getIntrinsicSize-NH-jbRc() {
        float f3;
        long v = this.h;
        float f = Offset.getX-impl(v);
        float f1 = NaNf;
        long v1 = this.i;
        if(Float.isInfinite(f) || Float.isNaN(f)) {
            f3 = NaNf;
        }
        else {
            float f2 = Offset.getX-impl(v1);
            f3 = Float.isInfinite(f2) || Float.isNaN(f2) ? NaNf : Math.abs(Offset.getX-impl(v) - Offset.getX-impl(v1));
        }
        float f4 = Offset.getY-impl(v);
        if(!Float.isInfinite(f4) && !Float.isNaN(f4)) {
            float f5 = Offset.getY-impl(v1);
            if(!Float.isInfinite(f5) && !Float.isNaN(f5)) {
                f1 = Math.abs(Offset.getY-impl(v) - Offset.getY-impl(v1));
            }
        }
        return SizeKt.Size(f3, f1);
    }

    @Override
    public int hashCode() {
        int v = this.f.hashCode();
        return this.g == null ? TileMode.hashCode-impl(this.j) + (Offset.hashCode-impl(this.i) + (Offset.hashCode-impl(this.h) + v * 961) * 0x1F) * 0x1F : TileMode.hashCode-impl(this.j) + (Offset.hashCode-impl(this.i) + (Offset.hashCode-impl(this.h) + (v * 0x1F + this.g.hashCode()) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "LinearGradient(colors=" + this.f + ", stops=" + this.g + ", " + ("start=" + Offset.toString-impl(this.h) + ", ") + ("end=" + Offset.toString-impl(this.i) + ", ") + "tileMode=" + TileMode.toString-impl(this.j) + ')';
    }
}

