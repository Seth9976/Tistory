package coil.size;

import androidx.annotation.Px;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001A\u0018\u0010\t\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u000B2\b\b\u0001\u0010\f\u001A\u00020\r\u001A\u0018\u0010\t\u001A\u00020\u00012\b\b\u0001\u0010\n\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000B\u001A\u001A\u0010\t\u001A\u00020\u00012\b\b\u0001\u0010\n\u001A\u00020\r2\b\b\u0001\u0010\f\u001A\u00020\r\"\u001A\u0010\u0000\u001A\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001A\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001A\u0004\b\u0006\u0010\b¨\u0006\u000E"}, d2 = {"OriginalSize", "Lcoil/size/Size;", "getOriginalSize$annotations", "()V", "getOriginalSize", "()Lcoil/size/Size;", "isOriginal", "", "(Lcoil/size/Size;)Z", "Size", "width", "Lcoil/size/Dimension;", "height", "", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Sizes")
public final class -Sizes {
    @NotNull
    public static final Size Size(@Px int v, @Px int v1) {
        return new Size(-Dimensions.Dimension(v), -Dimensions.Dimension(v1));
    }

    @NotNull
    public static final Size Size(@Px int v, @NotNull Dimension dimension0) {
        return new Size(-Dimensions.Dimension(v), dimension0);
    }

    @NotNull
    public static final Size Size(@NotNull Dimension dimension0, @Px int v) {
        return new Size(dimension0, -Dimensions.Dimension(v));
    }

    @NotNull
    public static final Size getOriginalSize() {
        return Size.ORIGINAL;
    }

    @Deprecated(message = "Migrate to \'coil.size.Size.ORIGINAL\'.", replaceWith = @ReplaceWith(expression = "Size.ORIGINAL", imports = {"coil.size.Size"}))
    public static void getOriginalSize$annotations() {
    }

    public static final boolean isOriginal(@NotNull Size size0) {
        return Intrinsics.areEqual(size0, Size.ORIGINAL);
    }
}

