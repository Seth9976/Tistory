package androidx.compose.ui.graphics;

import a5.b;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001E\u0010\u0011\u001A\u00060\rj\u0002`\u000E2\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Offset;", "center", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SweepGradient extends ShaderBrush {
    public final long f;
    public final List g;
    public final List h;

    public SweepGradient(long v, List list0, List list1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            list1 = null;
        }
        this(v, list0, list1, null);
    }

    public SweepGradient(long v, List list0, List list1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.f = v;
        this.g = list0;
        this.h = list1;
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    public Shader createShader-uvyYCjk(long v) {
        long v1 = this.f;
        if(OffsetKt.isUnspecified-k-4lQ0M(v1)) {
            return ShaderKt.SweepGradientShader-9KIMszo(SizeKt.getCenter-uvyYCjk(v), this.g, this.h);
        }
        float f = Offset.getX-impl(v1) == Infinityf ? Size.getWidth-impl(v) : Offset.getX-impl(v1);
        return Offset.getY-impl(v1) == Infinityf ? ShaderKt.SweepGradientShader-9KIMszo(OffsetKt.Offset(f, Size.getHeight-impl(v)), this.g, this.h) : ShaderKt.SweepGradientShader-9KIMszo(OffsetKt.Offset(f, Offset.getY-impl(v1)), this.g, this.h);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SweepGradient)) {
            return false;
        }
        if(!Offset.equals-impl0(this.f, ((SweepGradient)object0).f)) {
            return false;
        }
        return Intrinsics.areEqual(this.g, ((SweepGradient)object0).g) ? Intrinsics.areEqual(this.h, ((SweepGradient)object0).h) : false;
    }

    @Override
    public int hashCode() {
        int v = b.c(this.g, Offset.hashCode-impl(this.f) * 0x1F, 0x1F);
        return this.h == null ? v : v + this.h.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.v("SweepGradient(", (OffsetKt.isSpecified-k-4lQ0M(this.f) ? "center=" + Offset.toString-impl(this.f) + ", " : ""), "colors=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", stops=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

