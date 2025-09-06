package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"zf/g"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() [...] // 潜在的解密器

    public static final int systemProp(@NotNull String s, int v, int v1, int v2) {
        return (int)SystemPropsKt.systemProp(s, ((long)v), ((long)v1), ((long)v2));
    }

    public static final long systemProp(@NotNull String s, long v, long v1, long v2) {
        String s1 = SystemPropsKt.systemProp(s);
        if(s1 != null) {
            Long long0 = o.toLongOrNull(s1);
            if(long0 == null) {
                throw new IllegalStateException(("System property \'" + s + "\' has unrecognized value \'" + s1 + '\'').toString());
            }
            long v3 = (long)long0;
            if(v1 > v3 || v3 > v2) {
                throw new IllegalStateException(("System property \'" + s + "\' should be in range " + v1 + ".." + v2 + ", but is \'" + v3 + '\'').toString());
            }
            return v3;
        }
        return v;
    }

    @Nullable
    public static final String systemProp(@NotNull String s) {
        try {
            return System.getProperty(s);
        }
        catch(SecurityException unused_ex) {
            return null;
        }
    }

    @NotNull
    public static final String systemProp(@NotNull String s, @NotNull String s1) {
        String s2 = SystemPropsKt.systemProp(s);
        return s2 == null ? s1 : s2;
    }

    public static final boolean systemProp(@NotNull String s, boolean z) {
        String s1 = SystemPropsKt.systemProp(s);
        return s1 == null ? z : Boolean.parseBoolean(s1);
    }

    public static int systemProp$default(String s, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v1 = 1;
        }
        if((v3 & 8) != 0) {
            v2 = 0x7FFFFFFF;
        }
        return SystemPropsKt.systemProp(s, v, v1, v2);
    }

    public static long systemProp$default(String s, long v, long v1, long v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v1 = 1L;
        }
        if((v3 & 8) != 0) {
            v2 = 0x7FFFFFFFFFFFFFFFL;
        }
        return SystemPropsKt.systemProp(s, v, v1, v2);
    }
}

