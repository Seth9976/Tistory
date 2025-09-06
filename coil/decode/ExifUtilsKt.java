package coil.decode;

import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0007\u001A\u00020\u0003*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001A\u00020\u0003*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "mimeType", "", "supports", "(Lcoil/decode/ExifOrientationPolicy;Ljava/lang/String;)Z", "Lcoil/decode/ExifData;", "isSwapped", "(Lcoil/decode/ExifData;)Z", "isRotated", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ExifUtilsKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ExifOrientationPolicy.values().length];
            try {
                arr_v[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Set a;

    static {
        ExifUtilsKt.a = f0.setOf(new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});
    }

    public static final boolean isRotated(@NotNull ExifData exifData0) {
        return exifData0.getRotationDegrees() > 0;
    }

    public static final boolean isSwapped(@NotNull ExifData exifData0) {
        switch(exifData0.getRotationDegrees()) {
            case 90: 
            case 270: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean supports(@NotNull ExifOrientationPolicy exifOrientationPolicy0, @Nullable String s) {
        switch(WhenMappings.$EnumSwitchMapping$0[exifOrientationPolicy0.ordinal()]) {
            case 1: {
                return s != null && ExifUtilsKt.a.contains(s);
            }
            case 2: {
                return false;
            }
            case 3: {
                return true;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

