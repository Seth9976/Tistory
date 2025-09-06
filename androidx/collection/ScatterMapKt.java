package androidx.collection;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001C\u001A%\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A%\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u00A2\u0006\u0004\b\u0006\u0010\u0007\u001AQ\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\n\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b\"\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u00A2\u0006\u0004\b\u0006\u0010\u000B\u001A\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0080\b\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001A\u0018\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000EH\u0080\b\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u0018\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000EH\u0080\b\u00A2\u0006\u0004\b\u0013\u0010\u0012\u001A\u0017\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0012\u001A\u0017\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0012\u001A\u0017\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0012\u001A\u0017\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0019\u0010\u0012\u001A \u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u000EH\u0081\b\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001A(\u0010\"\u001A\u00020!2\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u000E2\u0006\u0010 \u001A\u00020\u001DH\u0080\b\u00A2\u0006\u0004\b\"\u0010#\u001A \u0010\'\u001A\u00020&2\u0006\u0010$\u001A\u00020\u001A2\u0006\u0010%\u001A\u00020\u000EH\u0080\b\u00A2\u0006\u0004\b\'\u0010(\u001A \u0010)\u001A\u00020&2\u0006\u0010$\u001A\u00020\u001A2\u0006\u0010%\u001A\u00020\u000EH\u0080\b\u00A2\u0006\u0004\b)\u0010(\u001A \u0010*\u001A\u00020&2\u0006\u0010$\u001A\u00020\u001A2\u0006\u0010%\u001A\u00020\u000EH\u0080\b\u00A2\u0006\u0004\b*\u0010(\u001A\u0018\u0010*\u001A\u00020&2\u0006\u0010 \u001A\u00020\u001DH\u0081\b\u00A2\u0006\u0004\b*\u0010+\u001A\u0018\u0010-\u001A\u00020\u000E*\u00060\u001Dj\u0002`,H\u0081\b\u00A2\u0006\u0004\b-\u0010.\u001A\u0018\u00100\u001A\u00020\u000E*\u00060\u001Dj\u0002`/H\u0080\b\u00A2\u0006\u0004\b0\u0010.\u001A\u0018\u00101\u001A\u00020\u001D*\u00060\u001Dj\u0002`/H\u0080\b\u00A2\u0006\u0004\b1\u00102\u001A\u0018\u00103\u001A\u00020&*\u00060\u001Dj\u0002`/H\u0080\b\u00A2\u0006\u0004\b3\u0010+\u001A$\u00105\u001A\u00060\u001Dj\u0002`42\u0006\u0010$\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u000EH\u0080\b\u00A2\u0006\u0004\b5\u0010\u001F\u001A$\u00107\u001A\u00060\u001Dj\u0002`/*\u00060\u001Dj\u0002`42\u0006\u00106\u001A\u00020\u000EH\u0081\b\u00A2\u0006\u0004\b7\u00108\u001A\u001C\u00109\u001A\u00060\u001Dj\u0002`/*\u00060\u001Dj\u0002`4H\u0080\b\u00A2\u0006\u0004\b9\u00102\u001A\u001C\u0010:\u001A\u00060\u001Dj\u0002`/*\u00060\u001Dj\u0002`4H\u0081\b\u00A2\u0006\u0004\b:\u00102\"\u0014\u0010;\u001A\u00020\u001D8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b;\u0010<\"\u0014\u0010=\u001A\u00020\u001D8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b=\u0010<\"\u0014\u0010>\u001A\u00020\u001D8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b>\u0010<\"\u001A\u0010?\u001A\u00020\u001D8\u0000X\u0081T\u00A2\u0006\f\n\u0004\b?\u0010<\u0012\u0004\b@\u0010A\"\u0014\u0010B\u001A\u00020\u001A8\u0000X\u0081\u0004\u00A2\u0006\u0006\n\u0004\bB\u0010C\"\u0014\u0010D\u001A\u00020\u000E8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bD\u0010E\"\u0014\u0010F\u001A\u00020\u000E8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bF\u0010E\"\u0014\u0010G\u001A\u00020\u000E8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bG\u0010E\"\u0014\u0010H\u001A\u00020\u000E8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bH\u0010E\"\u001A\u0010I\u001A\u00020\u001D8\u0000X\u0081T\u00A2\u0006\f\n\u0004\bI\u0010<\u0012\u0004\bJ\u0010A\"\u001A\u0010K\u001A\u00020\u001D8\u0000X\u0081T\u00A2\u0006\f\n\u0004\bK\u0010<\u0012\u0004\bL\u0010A*\f\b\u0000\u0010M\"\u00020\u001D2\u00020\u001D*\f\b\u0000\u0010N\"\u00020\u001D2\u00020\u001D*\f\b\u0000\u0010O\"\u00020\u001D2\u00020\u001D\u00A8\u0006P"}, d2 = {"K", "V", "Landroidx/collection/ScatterMap;", "emptyScatterMap", "()Landroidx/collection/ScatterMap;", "Landroidx/collection/MutableScatterMap;", "mutableScatterMapOf", "()Landroidx/collection/MutableScatterMap;", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "", "k", "", "hash", "(Ljava/lang/Object;)I", "h1", "(I)I", "h2", "capacity", "nextCapacity", "n", "normalizeCapacity", "loadedCapacity", "unloadedCapacity", "", "data", "offset", "", "readRawMetadata", "([JI)J", "value", "", "writeRawMetadata", "([JIJ)V", "metadata", "index", "", "isEmpty", "([JI)Z", "isDeleted", "isFull", "(J)Z", "Landroidx/collection/StaticBitmask;", "lowestBitSet", "(J)I", "Landroidx/collection/Bitmask;", "get", "next", "(J)J", "hasNext", "Landroidx/collection/Group;", "group", "m", "match", "(JI)J", "maskEmpty", "maskEmptyOrDeleted", "AllEmpty", "J", "Empty", "Deleted", "Sentinel", "getSentinel$annotations", "()V", "EmptyGroup", "[J", "GroupWidth", "I", "ClonedMetadataCount", "DefaultScatterCapacity", "MurmurHashC1", "BitmaskLsb", "getBitmaskLsb$annotations", "BitmaskMsb", "getBitmaskMsb$annotations", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1645#1:1835\n1645#1:1836\n1645#1:1837\n1699#1:1838\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1664#1:1835\n1666#1:1836\n1669#1:1837\n1705#1:1838\n*E\n"})
public final class ScatterMapKt {
    public static final long AllEmpty = 0x8080808080808080L;
    public static final long BitmaskLsb = 0x101010101010101L;
    public static final long BitmaskMsb = 0x8080808080808080L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 0xFEL;
    public static final long Empty = 0x80L;
    @JvmField
    @NotNull
    public static final long[] EmptyGroup = null;
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = 0xCC9E2D51;
    public static final long Sentinel = 0xFFL;
    public static final MutableScatterMap a;

    static {
        ScatterMapKt.EmptyGroup = new long[]{0x80808080808080FFL, -1L};
        ScatterMapKt.a = new MutableScatterMap(0);
    }

    @NotNull
    public static final ScatterMap emptyScatterMap() {
        Intrinsics.checkNotNull(ScatterMapKt.a, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return ScatterMapKt.a;
    }

    public static final int get(long v) {
        return Long.numberOfTrailingZeros(v) >> 3;
    }

    @PublishedApi
    public static void getBitmaskLsb$annotations() {
    }

    @PublishedApi
    public static void getBitmaskMsb$annotations() {
    }

    @PublishedApi
    public static void getSentinel$annotations() {
    }

    public static final long group(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "metadata");
        int v1 = (v & 7) << 3;
        return -((long)v1) >> 0x3F & arr_v[(v >> 3) + 1] << 0x40 - v1 | arr_v[v >> 3] >>> v1;
    }

    public static final int h1(int v) {
        return v >>> 7;
    }

    public static final int h2(int v) {
        return v & 0x7F;
    }

    public static final boolean hasNext(long v) {
        return v != 0L;
    }

    public static final int hash(@Nullable Object object0) {
        if(object0 != null) {
            int v = object0.hashCode();
            return v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        }
        return 0;
    }

    public static final boolean isDeleted(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "metadata");
        return (arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL) == 0xFEL;
    }

    public static final boolean isEmpty(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "metadata");
        return (arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL) == 0x80L;
    }

    @PublishedApi
    public static final boolean isFull(long v) {
        return v < 0x80L;
    }

    public static final boolean isFull(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "metadata");
        return (arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL) < 0x80L;
    }

    public static final int loadedCapacity(int v) {
        return v == 7 ? 6 : v - v / 8;
    }

    @PublishedApi
    public static final int lowestBitSet(long v) {
        return Long.numberOfTrailingZeros(v) >> 3;
    }

    public static final long maskEmpty(long v) {
        return v & ~v << 6 & 0x8080808080808080L;
    }

    @PublishedApi
    public static final long maskEmptyOrDeleted(long v) {
        return v & ~v << 7 & 0x8080808080808080L;
    }

    @PublishedApi
    public static final long match(long v, int v1) {
        long v2 = v ^ ((long)v1) * 0x101010101010101L;
        return ~v2 & v2 - 0x101010101010101L & 0x8080808080808080L;
    }

    @NotNull
    public static final MutableScatterMap mutableScatterMapOf() {
        return new MutableScatterMap(0, 1, null);
    }

    @NotNull
    public static final MutableScatterMap mutableScatterMapOf(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        MutableScatterMap mutableScatterMap0 = new MutableScatterMap(arr_pair.length);
        mutableScatterMap0.putAll(arr_pair);
        return mutableScatterMap0;
    }

    public static final long next(long v) {
        return v & v - 1L;
    }

    public static final int nextCapacity(int v) {
        return v == 0 ? 6 : v * 2 + 1;
    }

    public static final int normalizeCapacity(int v) {
        return v <= 0 ? 0 : -1 >>> Integer.numberOfLeadingZeros(v);
    }

    @PublishedApi
    public static final long readRawMetadata(@NotNull long[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "data");
        return arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL;
    }

    public static final int unloadedCapacity(int v) {
        return v == 7 ? 8 : (v - 1) / 7 + v;
    }

    public static final void writeRawMetadata(@NotNull long[] arr_v, int v, long v1) {
        Intrinsics.checkNotNullParameter(arr_v, "data");
        int v2 = (v & 7) << 3;
        arr_v[v >> 3] = v1 << v2 | arr_v[v >> 3] & ~(0xFFL << v2);
    }
}

