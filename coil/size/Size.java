package coil.size;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001B2\u00020\u0001:\u0001\u001BB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001A\u0004\b\u001A\u0010\b¨\u0006\u001C"}, d2 = {"Lcoil/size/Size;", "", "Lcoil/size/Dimension;", "width", "height", "<init>", "(Lcoil/size/Dimension;Lcoil/size/Dimension;)V", "component1", "()Lcoil/size/Dimension;", "component2", "copy", "(Lcoil/size/Dimension;Lcoil/size/Dimension;)Lcoil/size/Size;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcoil/size/Dimension;", "getWidth", "b", "getHeight", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Size {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/size/Size$Companion;", "", "Lcoil/size/Size;", "ORIGINAL", "Lcoil/size/Size;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final Size ORIGINAL;
    public final Dimension a;
    public final Dimension b;

    static {
        Size.Companion = new Companion(null);
        Size.ORIGINAL = new Size(Undefined.INSTANCE, Undefined.INSTANCE);
    }

    public Size(@NotNull Dimension dimension0, @NotNull Dimension dimension1) {
        this.a = dimension0;
        this.b = dimension1;
    }

    @NotNull
    public final Dimension component1() {
        return this.a;
    }

    @NotNull
    public final Dimension component2() {
        return this.b;
    }

    @NotNull
    public final Size copy(@NotNull Dimension dimension0, @NotNull Dimension dimension1) {
        return new Size(dimension0, dimension1);
    }

    public static Size copy$default(Size size0, Dimension dimension0, Dimension dimension1, int v, Object object0) {
        if((v & 1) != 0) {
            dimension0 = size0.a;
        }
        if((v & 2) != 0) {
            dimension1 = size0.b;
        }
        return size0.copy(dimension0, dimension1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Size)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((Size)object0).a) ? Intrinsics.areEqual(this.b, ((Size)object0).b) : false;
    }

    @NotNull
    public final Dimension getHeight() {
        return this.b;
    }

    @NotNull
    public final Dimension getWidth() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}

