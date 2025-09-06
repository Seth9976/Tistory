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
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001E\u0010\u0014\u001A\u00060\u0010j\u0002`\u00112\u0006\u0010\u000F\u001A\u00020\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001FR\u001A\u0010\"\u001A\u00020\u000E8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b \u0010!\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "center", "radius", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RadialGradient extends ShaderBrush {
    public final List f;
    public final List g;
    public final long h;
    public final float i;
    public final int j;

    public RadialGradient(List list0, List list1, long v, float f, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0, ((v2 & 2) == 0 ? list1 : null), v, f, ((v2 & 16) == 0 ? v1 : 0), null);
    }

    public RadialGradient(List list0, List list1, long v, float f, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.f = list0;
        this.g = list1;
        this.h = v;
        this.i = f;
        this.j = v1;
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    public Shader createShader-uvyYCjk(long v) {
        float f1;
        float f;
        long v1 = this.h;
        if(OffsetKt.isUnspecified-k-4lQ0M(v1)) {
            long v2 = SizeKt.getCenter-uvyYCjk(v);
            f = Offset.getX-impl(v2);
            f1 = Offset.getY-impl(v2);
        }
        else {
            f = Offset.getX-impl(v1) == Infinityf ? Size.getWidth-impl(v) : Offset.getX-impl(v1);
            f1 = Offset.getY-impl(v1) == Infinityf ? Size.getHeight-impl(v) : Offset.getY-impl(v1);
        }
        long v3 = OffsetKt.Offset(f, f1);
        return this.i == Infinityf ? ShaderKt.RadialGradientShader-8uybcMk(v3, Size.getMinDimension-impl(v) / 2.0f, this.f, this.g, this.j) : ShaderKt.RadialGradientShader-8uybcMk(v3, this.i, this.f, this.g, this.j);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RadialGradient)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((RadialGradient)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((RadialGradient)object0).g)) {
            return false;
        }
        return Offset.equals-impl0(this.h, ((RadialGradient)object0).h) ? this.i == ((RadialGradient)object0).i && TileMode.equals-impl0(this.j, ((RadialGradient)object0).j) : false;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.ui.graphics.Brush
    public long getIntrinsicSize-NH-jbRc() {
        return Float.isInfinite(this.i) || Float.isNaN(this.i) ? 0x7FC000007FC00000L : SizeKt.Size(this.i * 2.0f, this.i * 2.0f);
    }

    @Override
    public int hashCode() {
        int v = this.f.hashCode();
        return this.g == null ? TileMode.hashCode-impl(this.j) + a.b(this.i, (Offset.hashCode-impl(this.h) + v * 961) * 0x1F, 0x1F) : TileMode.hashCode-impl(this.j) + a.b(this.i, (Offset.hashCode-impl(this.h) + (v * 0x1F + this.g.hashCode()) * 0x1F) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        String s = "";
        String s1 = OffsetKt.isSpecified-k-4lQ0M(this.h) ? "center=" + Offset.toString-impl(this.h) + ", " : "";
        float f = this.i;
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            s = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.f + ", stops=" + this.g + ", " + s1 + s + "tileMode=" + TileMode.toString-impl(this.j) + ')';
    }
}

