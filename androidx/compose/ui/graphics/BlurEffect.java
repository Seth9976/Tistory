package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.m;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0015¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/TileMode;", "edgeTreatment", "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/RenderEffect;", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BlurEffect extends RenderEffect {
    public final RenderEffect b;
    public final float c;
    public final float d;
    public final int e;

    public BlurEffect(RenderEffect renderEffect0, float f, float f1, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(renderEffect0, f, ((v1 & 4) == 0 ? f1 : f), v, null);
    }

    public BlurEffect(RenderEffect renderEffect0, float f, float f1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
        this.b = renderEffect0;
        this.c = f;
        this.d = f1;
        this.e = v;
    }

    @Override  // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(0x1F)
    @NotNull
    public android.graphics.RenderEffect createRenderEffect() {
        return m.a.a(this.b, this.c, this.d, this.e);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlurEffect)) {
            return false;
        }
        return this.c == ((BlurEffect)object0).c && this.d == ((BlurEffect)object0).d && TileMode.equals-impl0(this.e, ((BlurEffect)object0).e) ? Intrinsics.areEqual(this.b, ((BlurEffect)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.b == null ? TileMode.hashCode-impl(this.e) + a.b(this.d, a.b(this.c, 0, 0x1F), 0x1F) : TileMode.hashCode-impl(this.e) + a.b(this.d, a.b(this.c, this.b.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "BlurEffect(renderEffect=" + this.b + ", radiusX=" + this.c + ", radiusY=" + this.d + ", edgeTreatment=" + TileMode.toString-impl(this.e) + ')';
    }
}

