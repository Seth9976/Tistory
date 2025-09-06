package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0014\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0018\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001D\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u0012\u0004\b \u0010!R\u0011\u0010\f\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\"\u0010\bR\u0011\u0010\r\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b#\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "pivotFractionX", "pivotFractionY", "copy-zey9I6w", "(JFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue$annotations", "()V", "getPivotFractionX-impl", "getPivotFractionY-impl", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,83:1\n72#2:84\n86#2:86\n22#3:85\n22#3:87\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:86\n46#1:85\n55#1:87\n*E\n"})
public final class TransformOrigin {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin$Companion;", "", "Landroidx/compose/ui/graphics/TransformOrigin;", "Center", "J", "getCenter-SzJe1aQ", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getCenter-SzJe1aQ() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;

    static {
        TransformOrigin.Companion = new Companion(null);
        TransformOrigin.b = 0x3F0000003F000000L;
    }

    public TransformOrigin(long v) {
        this.a = v;
    }

    public static final long access$getCenter$cp() [...] // 潜在的解密器

    public static final TransformOrigin box-impl(long v) {
        return new TransformOrigin(v);
    }

    @Stable
    public static final float component1-impl(long v) {
        return TransformOrigin.getPivotFractionX-impl(v);
    }

    @Stable
    public static final float component2-impl(long v) {
        return TransformOrigin.getPivotFractionY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-zey9I6w(long v, float f, float f1) {
        return TransformOriginKt.TransformOrigin(f, f1);
    }

    public static long copy-zey9I6w$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = TransformOrigin.getPivotFractionX-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = TransformOrigin.getPivotFractionY-impl(v);
        }
        return TransformOrigin.copy-zey9I6w(v, f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        return TransformOrigin.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof TransformOrigin ? v == ((TransformOrigin)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @PublishedApi
    public static void getPackedValue$annotations() {
    }

    public static final float getPivotFractionX-impl(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float getPivotFractionY-impl(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return TransformOrigin.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    public String toString() {
        return TransformOrigin.toString-impl(this.a);
    }

    public static String toString-impl(long v) {
        return "TransformOrigin(packedValue=" + v + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

