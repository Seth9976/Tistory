package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "", "type", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class TextUnitType {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "J", "getUnspecified-UIouoOA", "()J", "Sp", "getSp-UIouoOA", "Em", "getEm-UIouoOA", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getEm-UIouoOA() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getSp-UIouoOA() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getUnspecified-UIouoOA() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;
    public static final long d;

    static {
        TextUnitType.Companion = new Companion(null);
        TextUnitType.b = 0L;
        TextUnitType.c = 0x100000000L;
        TextUnitType.d = 0x200000000L;
    }

    public TextUnitType(long v) {
        this.a = v;
    }

    public static final long access$getEm$cp() [...] // 潜在的解密器

    public static final long access$getSp$cp() [...] // 潜在的解密器

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final TextUnitType box-impl(long v) {
        return new TextUnitType(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextUnitType.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof TextUnitType ? v == ((TextUnitType)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return TextUnitType.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    @NotNull
    public String toString() {
        return TextUnitType.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        if(TextUnitType.equals-impl0(v, 0L)) {
            return "Unspecified";
        }
        if(TextUnitType.equals-impl0(v, 0x100000000L)) {
            return "Sp";
        }
        return TextUnitType.equals-impl0(v, 0x200000000L) ? "Em" : "Invalid";
    }

    public final long unbox-impl() {
        return this.a;
    }
}

