package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ClassVerificationFailure"})
@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0087\n\u001A\r\u0010\u0000\u001A\u00020\u0003*\u00020\u0004H\u0087\n\u001A\r\u0010\u0000\u001A\u00020\u0003*\u00020\u0005H\u0086\n\u001A\r\u0010\u0006\u001A\u00020\u0001*\u00020\u0002H\u0087\n\u001A\r\u0010\u0006\u001A\u00020\u0003*\u00020\u0004H\u0087\n\u001A\r\u0010\u0006\u001A\u00020\u0003*\u00020\u0005H\u0086\n¨\u0006\u0007"}, d2 = {"component1", "", "Landroid/util/Size;", "", "Landroid/util/SizeF;", "Landroidx/core/util/SizeFCompat;", "component2", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SizeKt {
    @RequiresApi(21)
    public static final float component1(@NotNull SizeF sizeF0) {
        return sizeF0.getWidth();
    }

    public static final float component1(@NotNull SizeFCompat sizeFCompat0) {
        return sizeFCompat0.getWidth();
    }

    @RequiresApi(21)
    public static final int component1(@NotNull Size size0) {
        return size0.getWidth();
    }

    @RequiresApi(21)
    public static final float component2(@NotNull SizeF sizeF0) {
        return sizeF0.getHeight();
    }

    public static final float component2(@NotNull SizeFCompat sizeFCompat0) {
        return sizeFCompat0.getHeight();
    }

    @RequiresApi(21)
    public static final int component2(@NotNull Size size0) {
        return size0.getHeight();
    }
}

