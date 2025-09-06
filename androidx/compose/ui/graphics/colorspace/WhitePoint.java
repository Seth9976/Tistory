package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u000F\u0010\f\u001A\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000EJ$\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001D\u001A\u0004\b \u0010\u000E¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "", "x", "y", "<init>", "(FF)V", "z", "(FFF)V", "", "toXyz$ui_graphics_release", "()[F", "toXyz", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getX", "b", "getY", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WhitePoint {
    public final float a;
    public final float b;

    public WhitePoint(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public WhitePoint(float f, float f1, float f2) {
        float f3 = f + f1 + f2;
        this(f / f3, f1 / f3);
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    @NotNull
    public final WhitePoint copy(float f, float f1) {
        return new WhitePoint(f, f1);
    }

    public static WhitePoint copy$default(WhitePoint whitePoint0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = whitePoint0.a;
        }
        if((v & 2) != 0) {
            f1 = whitePoint0.b;
        }
        return whitePoint0.copy(f, f1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WhitePoint)) {
            return false;
        }
        return Float.compare(this.a, ((WhitePoint)object0).a) == 0 ? Float.compare(this.b, ((WhitePoint)object0).b) == 0 : false;
    }

    public final float getX() {
        return this.a;
    }

    public final float getY() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("WhitePoint(x=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", y=");
        return a.n(stringBuilder0, this.b, ')');
    }

    @Size(3L)
    @NotNull
    public final float[] toXyz$ui_graphics_release() {
        return new float[]{this.a / this.b, 1.0f, (1.0f - this.a - this.b) / this.b};
    }
}

