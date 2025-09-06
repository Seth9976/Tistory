package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "", "", "multiplier", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", "hashCode", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "a", "F", "getMultiplier", "()F", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class BaselineShift {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R&\u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006R&\u0010\f\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\r\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift$Companion;", "", "Landroidx/compose/ui/text/style/BaselineShift;", "Superscript", "F", "getSuperscript-y9eOQZs", "()F", "getSuperscript-y9eOQZs$annotations", "()V", "Subscript", "getSubscript-y9eOQZs", "getSubscript-y9eOQZs$annotations", "None", "getNone-y9eOQZs", "getNone-y9eOQZs$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final float getNone-y9eOQZs() [...] // 潜在的解密器

        @Stable
        public static void getNone-y9eOQZs$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getSubscript-y9eOQZs() [...] // 潜在的解密器

        @Stable
        public static void getSubscript-y9eOQZs$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getSuperscript-y9eOQZs() [...] // 潜在的解密器

        @Stable
        public static void getSuperscript-y9eOQZs$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        BaselineShift.Companion = new Companion(null);
        BaselineShift.b = 0.5f;
        BaselineShift.c = -0.5f;
        BaselineShift.d = 0.0f;
    }

    public BaselineShift(float f) {
        this.a = f;
    }

    public static final float access$getNone$cp() [...] // 潜在的解密器

    public static final float access$getSubscript$cp() [...] // 潜在的解密器

    public static final float access$getSuperscript$cp() [...] // 潜在的解密器

    public static final BaselineShift box-impl(float f) {
        return new BaselineShift(f);
    }

    public static float constructor-impl(float f) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return BaselineShift.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(float f, Object object0) {
        return object0 instanceof BaselineShift ? Float.compare(f, ((BaselineShift)object0).unbox-impl()) == 0 : false;
    }

    public static final boolean equals-impl0(float f, float f1) {
        return Float.compare(f, f1) == 0;
    }

    public final float getMultiplier() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return BaselineShift.hashCode-impl(this.a);
    }

    public static int hashCode-impl(float f) {
        return Float.hashCode(f);
    }

    @Override
    public String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }

    public static String toString-impl(float f) [...] // Inlined contents

    public final float unbox-impl() {
        return this.a;
    }
}

