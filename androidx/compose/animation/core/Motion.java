package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0081@\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\'\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000F\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0018\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0011\u0010\u0007\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0011\u0010\b\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u001E\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/Motion;", "", "", "packedValue", "constructor-impl", "(J)J", "", "value", "velocity", "copy-XB9eQnU", "(JFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getPackedValue", "()J", "getValue-impl", "(J)F", "getVelocity-impl", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,243:1\n72#2:244\n86#2:246\n22#3:245\n22#3:247\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n47#1:244\n49#1:246\n47#1:245\n49#1:247\n*E\n"})
public final class Motion {
    public final long a;

    public Motion(long v) {
        this.a = v;
    }

    public static final Motion box-impl(long v) {
        return new Motion(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-XB9eQnU(long v, float f, float f1) {
        return SpringSimulationKt.Motion(f, f1);
    }

    public static long copy-XB9eQnU$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Motion.getValue-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = Motion.getVelocity-impl(v);
        }
        return Motion.copy-XB9eQnU(v, f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        return Motion.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Motion ? v == ((Motion)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public final long getPackedValue() {
        return this.a;
    }

    public static final float getValue-impl(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float getVelocity-impl(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return Motion.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    public String toString() {
        return Motion.toString-impl(this.a);
    }

    public static String toString-impl(long v) {
        return "Motion(packedValue=" + v + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

