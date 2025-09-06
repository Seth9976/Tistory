package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000E\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0006¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getZOrder", "()I", "zOrder", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class AndroidExternalSurfaceZOrder {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder$Companion;", "", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "Behind", "I", "getBehind-B_4ceCc", "()I", "MediaOverlay", "getMediaOverlay-B_4ceCc", "OnTop", "getOnTop-B_4ceCc", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int getBehind-B_4ceCc() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getMediaOverlay-B_4ceCc() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getOnTop-B_4ceCc() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;

    static {
        AndroidExternalSurfaceZOrder.Companion = new Companion(null);
        AndroidExternalSurfaceZOrder.b = 1;
        AndroidExternalSurfaceZOrder.c = 2;
    }

    public AndroidExternalSurfaceZOrder(int v) {
        this.a = v;
    }

    public static final int access$getBehind$cp() [...] // Inlined contents

    public static final int access$getMediaOverlay$cp() [...] // 潜在的解密器

    public static final int access$getOnTop$cp() [...] // 潜在的解密器

    public static final AndroidExternalSurfaceZOrder box-impl(int v) {
        return new AndroidExternalSurfaceZOrder(v);
    }

    @Override
    public boolean equals(Object object0) {
        return AndroidExternalSurfaceZOrder.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof AndroidExternalSurfaceZOrder ? v == ((AndroidExternalSurfaceZOrder)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public final int getZOrder() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return AndroidExternalSurfaceZOrder.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    public String toString() {
        return AndroidExternalSurfaceZOrder.toString-impl(this.a);
    }

    public static String toString-impl(int v) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + v + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }
}

