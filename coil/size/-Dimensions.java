package coil.size;

import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u0003\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b¨\u0006\b"}, d2 = {"Dimension", "Lcoil/size/Dimension$Pixels;", "px", "", "pxOrElse", "Lcoil/size/Dimension;", "block", "Lkotlin/Function0;", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Dimensions")
public final class -Dimensions {
    @NotNull
    public static final Pixels Dimension(@Px int v) {
        return new Pixels(v);
    }

    // 去混淆评级： 低(20)
    public static final int pxOrElse(@NotNull Dimension dimension0, @NotNull Function0 function00) {
        return dimension0 instanceof Pixels ? ((Pixels)dimension0).px : ((Number)function00.invoke()).intValue();
    }
}

