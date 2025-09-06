package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.m;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/RenderEffect;", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OffsetEffect extends RenderEffect {
    public final RenderEffect b;
    public final long c;

    public OffsetEffect(RenderEffect renderEffect0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
        this.b = renderEffect0;
        this.c = v;
    }

    @Override  // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(0x1F)
    @NotNull
    public android.graphics.RenderEffect createRenderEffect() {
        return m.a.b(this.b, this.c);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OffsetEffect)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((OffsetEffect)object0).b) ? Offset.equals-impl0(this.c, ((OffsetEffect)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return this.b == null ? Offset.hashCode-impl(this.c) : Offset.hashCode-impl(this.c) + this.b.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.b + ", offset=" + Offset.toString-impl(this.c) + ')';
    }
}

