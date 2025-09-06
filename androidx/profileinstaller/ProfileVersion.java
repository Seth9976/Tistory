package androidx.profileinstaller;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public class ProfileVersion {
    public static final int MAX_SUPPORTED_SDK = 34;
    public static final int MIN_SUPPORTED_SDK = 24;
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;

    static {
        ProfileVersion.a = new byte[]{0x30, 49, 53, 0};
        ProfileVersion.b = new byte[]{0x30, 49, 0x30, 0};
        ProfileVersion.c = new byte[]{0x30, 0x30, 57, 0};
        ProfileVersion.d = new byte[]{0x30, 0x30, 53, 0};
        ProfileVersion.e = new byte[]{0x30, 0x30, 49, 0};
        ProfileVersion.f = new byte[]{0x30, 0x30, 49, 0};
        ProfileVersion.g = new byte[]{0x30, 0x30, 50, 0};
    }
}

