package androidx.compose.ui.graphics;

import android.graphics.Path.Direction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0011\u0010\u0004\u001A\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u0014\u0010\u0006\u001A\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Path", "()Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "asComposePath", "(Landroid/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "asAndroidPath", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Path;", "", "message", "", "throwIllegalStateException", "(Ljava/lang/String;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidPath_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Direction.values().length];
            try {
                arr_v[Direction.CounterClockwise.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Direction.Clockwise.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Path Path() {
        return new AndroidPath(null, 1, null);
    }

    public static final Path.Direction access$toPlatformPathDirection(Direction path$Direction0) {
        switch(WhenMappings.$EnumSwitchMapping$0[path$Direction0.ordinal()]) {
            case 1: {
                return Path.Direction.CCW;
            }
            case 2: {
                return Path.Direction.CW;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final android.graphics.Path asAndroidPath(@NotNull Path path0) {
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return ((AndroidPath)path0).getInternalPath();
    }

    @NotNull
    public static final Path asComposePath(@NotNull android.graphics.Path path0) {
        return new AndroidPath(path0);
    }

    public static final void throwIllegalStateException(@NotNull String s) {
        throw new IllegalStateException(s);
    }
}

