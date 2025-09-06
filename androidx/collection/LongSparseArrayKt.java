package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u001A*\u0010\u0004\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A0\u0010\u0004\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u0004\u0010\u0007\u001A<\u0010\t\u001A\u00028\u0000\"\n\b\u0000\u0010\b*\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\t\u0010\u0007\u001A(\u0010\u000B\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b\u000B\u0010\f\u001A0\u0010\u000B\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u000B\u0010\u000F\u001A(\u0010\u0012\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001A\u00020\u0010H\u0080\b\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A2\u0010\u0014\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u0014\u0010\u0007\u001A8\u0010\u0014\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u0014\u0010\u0017\u001A \u0010\u0018\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A0\u0010\u001A\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A0\u0010\u001D\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000E\u0010\u001C\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A2\u0010\u001F\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u001F\u0010\u0007\u001A \u0010 \u001A\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b \u0010!\u001A \u0010\"\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b\"\u0010#\u001A(\u0010$\u001A\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001A\u00020\u0010H\u0080\b\u00A2\u0006\u0004\b$\u0010%\u001A(\u0010&\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001A\u00020\u0010H\u0080\b\u00A2\u0006\u0004\b&\u0010\'\u001A0\u0010(\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b(\u0010)\u001A(\u0010*\u001A\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b*\u0010+\u001A(\u0010,\u001A\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b,\u0010-\u001A(\u0010.\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b.\u0010/\u001A(\u00100\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b0\u00101\u001A \u00102\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b2\u0010\u0019\u001A0\u00103\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b3\u0010\u001B\u001A \u00105\u001A\u000204\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b5\u00106\u001A(\u00107\u001A\u00020\u000E\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\n\u00A2\u0006\u0004\b7\u0010/\u001A0\u00108\u001A\u00020\n\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0004\b8\u0010\u001B\u001A4\u00109\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u00A2\u0006\u0004\b9\u0010:\u001A0\u0010;\u001A\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00028\u0000H\u0086\b\u00A2\u0006\u0004\b;\u0010\u0007\u001A9\u0010=\u001A\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000<H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010>\u001A \u0010?\u001A\u00020\u000E\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u00A2\u0006\u0004\b?\u0010#\u001A/\u0010@\u001A\u00020\u000E\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0007\u00A2\u0006\u0004\b@\u0010\u000F\u001A[\u0010E\u001A\u00020\n\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010D\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0AH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bE\u0010F\u001A\u001D\u0010H\u001A\u00020G\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001\u00A2\u0006\u0004\bH\u0010I\u001A#\u0010K\u001A\b\u0012\u0004\u0012\u00028\u00000J\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001\u00A2\u0006\u0004\bK\u0010L\"(\u0010O\u001A\u00020\u0010\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00018\u00C6\u0002\u00A2\u0006\f\u0012\u0004\bN\u0010\u0019\u001A\u0004\bM\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006P"}, d2 = {"E", "Landroidx/collection/LongSparseArray;", "", "key", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "T", "commonGetInternal", "", "commonRemove", "(Landroidx/collection/LongSparseArray;J)V", "value", "", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "", "index", "commonRemoveAt", "(Landroidx/collection/LongSparseArray;I)V", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonGc", "(Landroidx/collection/LongSparseArray;)V", "commonPut", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "other", "commonPutAll", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)V", "commonPutIfAbsent", "commonSize", "(Landroidx/collection/LongSparseArray;)I", "commonIsEmpty", "(Landroidx/collection/LongSparseArray;)Z", "commonKeyAt", "(Landroidx/collection/LongSparseArray;I)J", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonIndexOfKey", "(Landroidx/collection/LongSparseArray;J)I", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonContainsKey", "(Landroidx/collection/LongSparseArray;J)Z", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "(Landroidx/collection/LongSparseArray;)Ljava/lang/String;", "contains", "set", "plus", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)Landroidx/collection/LongSparseArray;", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "(Landroidx/collection/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "remove", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", "forEach", "(Landroidx/collection/LongSparseArray;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/collections/LongIterator;", "keyIterator", "(Landroidx/collection/LongSparseArray;)Lkotlin/collections/LongIterator;", "", "valueIterator", "(Landroidx/collection/LongSparseArray;)Ljava/util/Iterator;", "getSize", "getSize$annotations", "size", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
public final class LongSparseArrayKt {
    public static final Object a;

    static {
        LongSparseArrayKt.a = new Object();
    }

    public static final void commonAppend(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = longSparseArray0.size;
        if(v1 != 0 && v <= longSparseArray0.keys[v1 - 1]) {
            longSparseArray0.put(v, object0);
            return;
        }
        if(longSparseArray0.garbage) {
            long[] arr_v = longSparseArray0.keys;
            if(v1 >= arr_v.length) {
                Object[] arr_object = longSparseArray0.values;
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object1 = arr_object[v2];
                    if(object1 != LongSparseArrayKt.a) {
                        if(v2 != v3) {
                            arr_v[v3] = arr_v[v2];
                            arr_object[v3] = object1;
                            arr_object[v2] = null;
                        }
                        ++v3;
                    }
                }
                longSparseArray0.garbage = false;
                longSparseArray0.size = v3;
            }
        }
        int v4 = longSparseArray0.size;
        if(v4 >= longSparseArray0.keys.length) {
            int v5 = ContainerHelpersKt.idealLongArraySize(v4 + 1);
            long[] arr_v1 = Arrays.copyOf(longSparseArray0.keys, v5);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            longSparseArray0.keys = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(longSparseArray0.values, v5);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            longSparseArray0.values = arr_object1;
        }
        longSparseArray0.keys[v4] = v;
        longSparseArray0.values[v4] = object0;
        longSparseArray0.size = v4 + 1;
    }

    public static final void commonClear(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v = longSparseArray0.size;
        Object[] arr_object = longSparseArray0.values;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        longSparseArray0.size = 0;
        longSparseArray0.garbage = false;
    }

    public static final boolean commonContainsKey(@NotNull LongSparseArray longSparseArray0, long v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return longSparseArray0.indexOfKey(v) >= 0;
    }

    public static final boolean commonContainsValue(@NotNull LongSparseArray longSparseArray0, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return longSparseArray0.indexOfValue(object0) >= 0;
    }

    public static final void commonGc(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v = longSparseArray0.size;
        long[] arr_v = longSparseArray0.keys;
        Object[] arr_object = longSparseArray0.values;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 != LongSparseArrayKt.a) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_object[v2] = object0;
                    arr_object[v1] = null;
                }
                ++v2;
            }
        }
        longSparseArray0.garbage = false;
        longSparseArray0.size = v2;
    }

    @Nullable
    public static final Object commonGet(@NotNull LongSparseArray longSparseArray0, long v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(longSparseArray0.keys, longSparseArray0.size, v);
        return v1 < 0 || longSparseArray0.values[v1] == LongSparseArrayKt.a ? null : longSparseArray0.values[v1];
    }

    public static final Object commonGet(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(longSparseArray0.keys, longSparseArray0.size, v);
        return v1 < 0 || longSparseArray0.values[v1] == LongSparseArrayKt.a ? object0 : longSparseArray0.values[v1];
    }

    public static final Object commonGetInternal(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(longSparseArray0.keys, longSparseArray0.size, v);
        return v1 < 0 || longSparseArray0.values[v1] == LongSparseArrayKt.a ? object0 : longSparseArray0.values[v1];
    }

    public static final int commonIndexOfKey(@NotNull LongSparseArray longSparseArray0, long v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(longSparseArray0.garbage) {
            int v1 = longSparseArray0.size;
            long[] arr_v = longSparseArray0.keys;
            Object[] arr_object = longSparseArray0.values;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = arr_object[v2];
                if(object0 != LongSparseArrayKt.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object0;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            longSparseArray0.garbage = false;
            longSparseArray0.size = v3;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray0.keys, longSparseArray0.size, v);
    }

    public static final int commonIndexOfValue(@NotNull LongSparseArray longSparseArray0, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(longSparseArray0.garbage) {
            int v1 = longSparseArray0.size;
            long[] arr_v = longSparseArray0.keys;
            Object[] arr_object = longSparseArray0.values;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object1 = arr_object[v2];
                if(object1 != LongSparseArrayKt.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object1;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            longSparseArray0.garbage = false;
            longSparseArray0.size = v3;
        }
        int v4 = longSparseArray0.size;
        for(int v = 0; v < v4; ++v) {
            if(longSparseArray0.values[v] == object0) {
                return v;
            }
        }
        return -1;
    }

    public static final boolean commonIsEmpty(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return longSparseArray0.size() == 0;
    }

    public static final long commonKeyAt(@NotNull LongSparseArray longSparseArray0, int v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(v >= 0) {
            int v1 = longSparseArray0.size;
            if(v < v1) {
                if(longSparseArray0.garbage) {
                    long[] arr_v = longSparseArray0.keys;
                    Object[] arr_object = longSparseArray0.values;
                    int v3 = 0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object0 = arr_object[v2];
                        if(object0 != LongSparseArrayKt.a) {
                            if(v2 != v3) {
                                arr_v[v3] = arr_v[v2];
                                arr_object[v3] = object0;
                                arr_object[v2] = null;
                            }
                            ++v3;
                        }
                    }
                    longSparseArray0.garbage = false;
                    longSparseArray0.size = v3;
                }
                return longSparseArray0.keys[v];
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public static final void commonPut(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(longSparseArray0.keys, longSparseArray0.size, v);
        if(v1 >= 0) {
            longSparseArray0.values[v1] = object0;
            return;
        }
        int v2 = ~v1;
        if(v2 < longSparseArray0.size && longSparseArray0.values[v2] == LongSparseArrayKt.a) {
            longSparseArray0.keys[v2] = v;
            longSparseArray0.values[v2] = object0;
            return;
        }
        if(longSparseArray0.garbage) {
            int v3 = longSparseArray0.size;
            long[] arr_v = longSparseArray0.keys;
            if(v3 >= arr_v.length) {
                Object[] arr_object = longSparseArray0.values;
                int v5 = 0;
                for(int v4 = 0; v4 < v3; ++v4) {
                    Object object1 = arr_object[v4];
                    if(object1 != LongSparseArrayKt.a) {
                        if(v4 != v5) {
                            arr_v[v5] = arr_v[v4];
                            arr_object[v5] = object1;
                            arr_object[v4] = null;
                        }
                        ++v5;
                    }
                }
                longSparseArray0.garbage = false;
                longSparseArray0.size = v5;
                v2 = ~ContainerHelpersKt.binarySearch(longSparseArray0.keys, v5, v);
            }
        }
        int v6 = longSparseArray0.size;
        if(v6 >= longSparseArray0.keys.length) {
            int v7 = ContainerHelpersKt.idealLongArraySize(v6 + 1);
            long[] arr_v1 = Arrays.copyOf(longSparseArray0.keys, v7);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            longSparseArray0.keys = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(longSparseArray0.values, v7);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            longSparseArray0.values = arr_object1;
        }
        int v8 = longSparseArray0.size;
        if(v8 - v2 != 0) {
            ArraysKt___ArraysJvmKt.copyInto(longSparseArray0.keys, longSparseArray0.keys, v2 + 1, v2, v8);
            ArraysKt___ArraysJvmKt.copyInto(longSparseArray0.values, longSparseArray0.values, v2 + 1, v2, longSparseArray0.size);
        }
        longSparseArray0.keys[v2] = v;
        longSparseArray0.values[v2] = object0;
        ++longSparseArray0.size;
    }

    public static final void commonPutAll(@NotNull LongSparseArray longSparseArray0, @NotNull LongSparseArray longSparseArray1) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        Intrinsics.checkNotNullParameter(longSparseArray1, "other");
        int v = longSparseArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            longSparseArray0.put(longSparseArray1.keyAt(v1), longSparseArray1.valueAt(v1));
        }
    }

    @Nullable
    public static final Object commonPutIfAbsent(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        Object object1 = longSparseArray0.get(v);
        if(object1 == null) {
            longSparseArray0.put(v, object0);
        }
        return object1;
    }

    public static final void commonRemove(@NotNull LongSparseArray longSparseArray0, long v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(longSparseArray0.keys, longSparseArray0.size, v);
        if(v1 >= 0 && longSparseArray0.values[v1] != LongSparseArrayKt.a) {
            longSparseArray0.values[v1] = LongSparseArrayKt.a;
            longSparseArray0.garbage = true;
        }
    }

    public static final boolean commonRemove(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = longSparseArray0.indexOfKey(v);
        if(v1 >= 0 && Intrinsics.areEqual(object0, longSparseArray0.valueAt(v1))) {
            longSparseArray0.removeAt(v1);
            return true;
        }
        return false;
    }

    public static final void commonRemoveAt(@NotNull LongSparseArray longSparseArray0, int v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(longSparseArray0.values[v] != LongSparseArrayKt.a) {
            longSparseArray0.values[v] = LongSparseArrayKt.a;
            longSparseArray0.garbage = true;
        }
    }

    @Nullable
    public static final Object commonReplace(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = longSparseArray0.indexOfKey(v);
        if(v1 >= 0) {
            Object[] arr_object = longSparseArray0.values;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
            return object1;
        }
        return null;
    }

    public static final boolean commonReplace(@NotNull LongSparseArray longSparseArray0, long v, Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        int v1 = longSparseArray0.indexOfKey(v);
        if(v1 >= 0 && Intrinsics.areEqual(longSparseArray0.values[v1], object0)) {
            longSparseArray0.values[v1] = object1;
            return true;
        }
        return false;
    }

    public static final void commonSetValueAt(@NotNull LongSparseArray longSparseArray0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(v >= 0) {
            int v1 = longSparseArray0.size;
            if(v < v1) {
                if(longSparseArray0.garbage) {
                    long[] arr_v = longSparseArray0.keys;
                    Object[] arr_object = longSparseArray0.values;
                    int v3 = 0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object1 = arr_object[v2];
                        if(object1 != LongSparseArrayKt.a) {
                            if(v2 != v3) {
                                arr_v[v3] = arr_v[v2];
                                arr_object[v3] = object1;
                                arr_object[v2] = null;
                            }
                            ++v3;
                        }
                    }
                    longSparseArray0.garbage = false;
                    longSparseArray0.size = v3;
                }
                longSparseArray0.values[v] = object0;
                return;
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public static final int commonSize(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(longSparseArray0.garbage) {
            int v = longSparseArray0.size;
            long[] arr_v = longSparseArray0.keys;
            Object[] arr_object = longSparseArray0.values;
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 != LongSparseArrayKt.a) {
                    if(v1 != v2) {
                        arr_v[v2] = arr_v[v1];
                        arr_object[v2] = object0;
                        arr_object[v1] = null;
                    }
                    ++v2;
                }
            }
            longSparseArray0.garbage = false;
            longSparseArray0.size = v2;
        }
        return longSparseArray0.size;
    }

    @NotNull
    public static final String commonToString(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(longSparseArray0.size() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(longSparseArray0.size * 28);
        stringBuilder0.append('{');
        int v = longSparseArray0.size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(longSparseArray0.keyAt(v1));
            stringBuilder0.append('=');
            Object object0 = longSparseArray0.valueAt(v1);
            if(object0 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        return q.l('}', "StringBuilder(capacity).…builderAction).toString()", stringBuilder0);
    }

    public static final Object commonValueAt(@NotNull LongSparseArray longSparseArray0, int v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        if(v >= 0) {
            int v1 = longSparseArray0.size;
            if(v < v1) {
                if(longSparseArray0.garbage) {
                    long[] arr_v = longSparseArray0.keys;
                    Object[] arr_object = longSparseArray0.values;
                    int v3 = 0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object0 = arr_object[v2];
                        if(object0 != LongSparseArrayKt.a) {
                            if(v2 != v3) {
                                arr_v[v3] = arr_v[v2];
                                arr_object[v3] = object0;
                                arr_object[v2] = null;
                            }
                            ++v3;
                        }
                    }
                    longSparseArray0.garbage = false;
                    longSparseArray0.size = v3;
                }
                return longSparseArray0.values[v];
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public static final boolean contains(@NotNull LongSparseArray longSparseArray0, long v) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return longSparseArray0.containsKey(v);
    }

    public static final void forEach(@NotNull LongSparseArray longSparseArray0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = longSparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(longSparseArray0.keyAt(v1), longSparseArray0.valueAt(v1));
        }
    }

    public static final Object getOrDefault(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return longSparseArray0.get(v, object0);
    }

    public static final Object getOrElse(@NotNull LongSparseArray longSparseArray0, long v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object0 = longSparseArray0.get(v);
        return object0 == null ? function00.invoke() : object0;
    }

    public static final int getSize(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return longSparseArray0.size();
    }

    public static void getSize$annotations(LongSparseArray longSparseArray0) {
    }

    public static final boolean isNotEmpty(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return !longSparseArray0.isEmpty();
    }

    @NotNull
    public static final LongIterator keyIterator(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return new LongIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < longSparseArray0.size();
            }

            @Override  // kotlin.collections.LongIterator
            public long nextLong() {
                int v = this.a;
                this.a = v + 1;
                return longSparseArray0.keyAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }

    @NotNull
    public static final LongSparseArray plus(@NotNull LongSparseArray longSparseArray0, @NotNull LongSparseArray longSparseArray1) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        Intrinsics.checkNotNullParameter(longSparseArray1, "other");
        LongSparseArray longSparseArray2 = new LongSparseArray(longSparseArray1.size() + longSparseArray0.size());
        longSparseArray2.putAll(longSparseArray0);
        longSparseArray2.putAll(longSparseArray1);
        return longSparseArray2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final boolean remove(LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return longSparseArray0.remove(v, object0);
    }

    public static final void set(@NotNull LongSparseArray longSparseArray0, long v, Object object0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        longSparseArray0.put(v, object0);
    }

    @NotNull
    public static final Iterator valueIterator(@NotNull LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(longSparseArray0, "<this>");
        return new Object() {
            public int a;
            public final LongSparseArray b;

            {
                LongSparseArray longSparseArray0 = longSparseArray0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = longSparseArray0;
            }

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b.size();
            }

            @Override
            public Object next() {
                int v = this.a;
                this.a = v + 1;
                return this.b.valueAt(v);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }
}

