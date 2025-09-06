package androidx.compose.ui.graphics;

import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import i3.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0014\u0010\u0005\u001A\u00020\u0006*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u000F\u0010\t\u001A\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidTileMode_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Shader.TileMode.values().length];
            try {
                arr_v[Shader.TileMode.CLAMP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Shader.TileMode.MIRROR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Shader.TileMode.REPEAT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    // 去混淆评级： 低(30)
    public static final boolean isSupported-0vamqd0(int v) {
        return Build.VERSION.SDK_INT >= 0x1F || !TileMode.equals-impl0(v, 3);
    }

    @NotNull
    public static final Shader.TileMode toAndroidTileMode-0vamqd0(int v) {
        if(TileMode.equals-impl0(v, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if(TileMode.equals-impl0(v, 1)) {
            return Shader.TileMode.REPEAT;
        }
        if(TileMode.equals-impl0(v, 2)) {
            return Shader.TileMode.MIRROR;
        }
        return !TileMode.equals-impl0(v, 3) || Build.VERSION.SDK_INT < 0x1F ? Shader.TileMode.CLAMP : c.a.b();
    }

    // 去混淆评级： 低(20)
    public static final int toComposeTileMode(@NotNull Shader.TileMode shader$TileMode0) {
        switch(WhenMappings.$EnumSwitchMapping$0[shader$TileMode0.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 1;
            }
            default: {
                return Build.VERSION.SDK_INT < 0x1F || shader$TileMode0 != a.f() ? 0 : 3;
            }
        }
    }
}

