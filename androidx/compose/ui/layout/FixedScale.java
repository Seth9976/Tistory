package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/layout/FixedScale;", "Landroidx/compose/ui/layout/ContentScale;", "", "value", "<init>", "(F)V", "Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/ScaleFactor;", "computeScaleFactor-H7hwNQA", "(JJ)J", "computeScaleFactor", "component1", "()F", "copy", "(F)Landroidx/compose/ui/layout/FixedScale;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getValue", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FixedScale implements ContentScale {
    public static final int $stable;
    public final float a;

    public FixedScale(float f) {
        this.a = f;
    }

    public final float component1() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.ContentScale
    public long computeScaleFactor-H7hwNQA(long v, long v1) {
        return ScaleFactorKt.ScaleFactor(this.a, this.a);
    }

    @NotNull
    public final FixedScale copy(float f) {
        return new FixedScale(f);
    }

    public static FixedScale copy$default(FixedScale fixedScale0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = fixedScale0.a;
        }
        return fixedScale0.copy(f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FixedScale ? Float.compare(this.a, ((FixedScale)object0).a) == 0 : false;
    }

    public final float getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override
    @NotNull
    public String toString() {
        return a.n(new StringBuilder("FixedScale(value="), this.a, ')');
    }
}

