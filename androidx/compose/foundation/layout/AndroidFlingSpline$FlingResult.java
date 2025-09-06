package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0019"}, d2 = {"androidx/compose/foundation/layout/AndroidFlingSpline$FlingResult", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "getDistanceCoefficient-impl", "(J)F", "distanceCoefficient", "getVelocityCoefficient-impl", "velocityCoefficient", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,725:1\n72#2:726\n86#2:728\n22#3:727\n22#3:729\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n717#1:726\n722#1:728\n717#1:727\n722#1:729\n*E\n"})
public final class AndroidFlingSpline.FlingResult {
    public final long a;

    public AndroidFlingSpline.FlingResult(long v) {
        this.a = v;
    }

    public static final AndroidFlingSpline.FlingResult box-impl(long v) {
        return new AndroidFlingSpline.FlingResult(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return AndroidFlingSpline.FlingResult.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof AndroidFlingSpline.FlingResult ? v == ((AndroidFlingSpline.FlingResult)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final float getDistanceCoefficient-impl(long v) [...] // 潜在的解密器

    public static final float getVelocityCoefficient-impl(long v) [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return AndroidFlingSpline.FlingResult.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    public String toString() {
        return AndroidFlingSpline.FlingResult.toString-impl(this.a);
    }

    public static String toString-impl(long v) {
        return "FlingResult(packedValue=" + v + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

