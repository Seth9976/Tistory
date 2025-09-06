package kotlin.text;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class o extends n {
    @NotNull
    public static final Void numberFormatError(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "input");
        throw new NumberFormatException("Invalid number format: \'" + s + '\'');
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return o.toByteOrNull(s, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Integer integer0 = o.toIntOrNull(s, v);
        if(integer0 != null) {
            int v1 = (int)integer0;
            return v1 < 0xFFFFFF80 || v1 > 0x7F ? null : ((byte)v1);
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Integer toIntOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return o.toIntOrNull(s, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Integer toIntOrNull(@NotNull String s, int v) {
        boolean z;
        Intrinsics.checkNotNullParameter(s, "<this>");
        b.checkRadix(v);
        int v1 = s.length();
        if(v1 == 0) {
            return null;
        }
        int v2 = 1;
        int v3 = 0;
        int v4 = s.charAt(0);
        int v5 = 0x80000001;
        if(Intrinsics.compare(v4, 0x30) < 0) {
            if(v1 == 1) {
                return null;
            }
            switch(v4) {
                case 43: {
                    z = false;
                    break;
                }
                case 45: {
                    v5 = 0x80000000;
                    z = true;
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        else {
            z = false;
            v2 = 0;
        }
        int v6 = 0xFC71C71D;
        while(v2 < v1) {
            int v7 = b.digitOf(s.charAt(v2), v);
            if(v7 < 0) {
                return null;
            }
            if(v3 < v6) {
                if(v6 == 0xFC71C71D) {
                    v6 = v5 / v;
                    if(v3 < v6) {
                        return null;
                    }
                    goto label_31;
                }
                return null;
            }
        label_31:
            int v8 = v3 * v;
            if(v8 < v5 + v7) {
                return null;
            }
            v3 = v8 - v7;
            ++v2;
        }
        return z ? v3 : ((int)(-v3));
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Long toLongOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return o.toLongOrNull(s, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Long toLongOrNull(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        b.checkRadix(v);
        int v1 = s.length();
        if(v1 == 0) {
            return null;
        }
        boolean z = true;
        int v2 = 0;
        int v3 = s.charAt(0);
        long v4 = 0x8000000000000001L;
        if(Intrinsics.compare(v3, 0x30) < 0) {
            if(v1 == 1) {
                return null;
            }
            switch(v3) {
                case 43: {
                    z = false;
                    v2 = 1;
                    break;
                }
                case 45: {
                    v4 = 0x8000000000000000L;
                    v2 = 1;
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        else {
            z = false;
        }
        long v5 = 0L;
        long v6 = -256204778801521550L;
        while(v2 < v1) {
            int v7 = b.digitOf(s.charAt(v2), v);
            if(v7 < 0) {
                return null;
            }
            if(v5 < v6) {
                if(v6 == -256204778801521550L) {
                    v6 = v4 / ((long)v);
                    if(v5 < v6) {
                        return null;
                    }
                    goto label_32;
                }
                return null;
            }
        label_32:
            long v8 = v5 * ((long)v);
            if(v8 < v4 + ((long)v7)) {
                return null;
            }
            v5 = v8 - ((long)v7);
            ++v2;
        }
        return z ? v5 : ((long)(-v5));
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return o.toShortOrNull(s, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Integer integer0 = o.toIntOrNull(s, v);
        if(integer0 != null) {
            int v1 = (int)integer0;
            return v1 < 0xFFFF8000 || v1 > 0x7FFF ? null : ((short)v1);
        }
        return null;
    }
}

