package coil.decode;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\u0003\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lcoil/decode/ExifData;", "", "", "isFlipped", "", "rotationDegrees", "<init>", "(ZI)V", "a", "Z", "()Z", "b", "I", "getRotationDegrees", "()I", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ExifData {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/decode/ExifData$Companion;", "", "Lcoil/decode/ExifData;", "NONE", "Lcoil/decode/ExifData;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final ExifData NONE;
    public final boolean a;
    public final int b;

    static {
        ExifData.Companion = new Companion(null);
        ExifData.NONE = new ExifData(false, 0);
    }

    public ExifData(boolean z, int v) {
        this.a = z;
        this.b = v;
    }

    public final int getRotationDegrees() {
        return this.b;
    }

    public final boolean isFlipped() {
        return this.a;
    }
}

