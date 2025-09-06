package androidx.collection;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000F\u001A\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000BJ\u0010\u0010\u0011\u001A\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000BJ\u001A\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000BJ\u000F\u0010\u001A\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u0011\u0010\u0002\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0016\u0010\u0007\u001A\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000B\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006\u001E"}, d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
public final class IntIntPair {
    @JvmField
    public final long packedValue;

    public IntIntPair(long v) {
        this.packedValue = v;
    }

    public static final IntIntPair box-impl(long v) {
        return new IntIntPair(v);
    }

    public static final int component1-impl(long v) {
        return (int)(v >> 0x20);
    }

    public static final int component2-impl(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static long constructor-impl(int v, int v1) [...] // 潜在的解密器

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return IntIntPair.equals-impl(this.packedValue, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof IntIntPair ? v == ((IntIntPair)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final int getFirst-impl(long v) {
        return (int)(v >> 0x20);
    }

    @PublishedApi
    public static void getPackedValue$annotations() {
    }

    public static final int getSecond-impl(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    @Override
    public int hashCode() {
        return IntIntPair.hashCode-impl(this.packedValue);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    @NotNull
    public String toString() {
        return IntIntPair.toString-impl(this.packedValue);
    }

    @NotNull
    public static String toString-impl(long v) {
        return "(" + IntIntPair.getFirst-impl(v) + ", " + IntIntPair.getSecond-impl(v) + ')';
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

