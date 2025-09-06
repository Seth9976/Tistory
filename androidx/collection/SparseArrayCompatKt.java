package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\"\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A)\u0010\u0004\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A/\u0010\u0004\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0007\u001A\'\u0010\t\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\t\u0010\n\u001A2\u0010\t\u001A\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0080\b\u00A2\u0006\u0004\b\t\u0010\u000E\u001A(\u0010\u0010\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000F\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b\u0010\u0010\n\u001A0\u0010\u0012\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A2\u0010\u0014\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u0014\u0010\u0007\u001A8\u0010\u0014\u001A\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u0014\u0010\u0017\u001A0\u0010\u0018\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A0\u0010\u001B\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000E\u0010\u001A\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A2\u0010\u001D\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\u001D\u0010\u0007\u001A \u0010\u001E\u001A\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001A \u0010 \u001A\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b \u0010!\u001A(\u0010\"\u001A\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000F\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b\"\u0010#\u001A(\u0010$\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000F\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b$\u0010\u0005\u001A0\u0010%\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\f\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b%\u0010\u0019\u001A(\u0010&\u001A\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b&\u0010#\u001A(\u0010\'\u001A\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\'\u0010(\u001A(\u0010)\u001A\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b)\u0010*\u001A(\u0010+\u001A\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b+\u0010,\u001A \u0010-\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b-\u0010.\u001A0\u0010/\u001A\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b/\u0010\u0019\u001A \u00101\u001A\u000200\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u00A2\u0006\u0004\b1\u00102\u00A8\u00063"}, d2 = {"E", "Landroidx/collection/SparseArrayCompat;", "", "key", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "", "commonRemove", "(Landroidx/collection/SparseArrayCompat;I)V", "", "value", "", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "index", "commonRemoveAt", "size", "commonRemoveAtRange", "(Landroidx/collection/SparseArrayCompat;II)V", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonPut", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "other", "commonPutAll", "(Landroidx/collection/SparseArrayCompat;Landroidx/collection/SparseArrayCompat;)V", "commonPutIfAbsent", "commonSize", "(Landroidx/collection/SparseArrayCompat;)I", "commonIsEmpty", "(Landroidx/collection/SparseArrayCompat;)Z", "commonKeyAt", "(Landroidx/collection/SparseArrayCompat;I)I", "commonValueAt", "commonSetValueAt", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonContainsKey", "(Landroidx/collection/SparseArrayCompat;I)Z", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonClear", "(Landroidx/collection/SparseArrayCompat;)V", "commonAppend", "", "commonToString", "(Landroidx/collection/SparseArrayCompat;)Ljava/lang/String;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
public final class SparseArrayCompatKt {
    public static final Object a;

    static {
        SparseArrayCompatKt.a = new Object();
    }

    public static final void access$gc(SparseArrayCompat sparseArrayCompat0) {
        int v = sparseArrayCompat0.size;
        int[] arr_v = sparseArrayCompat0.keys;
        Object[] arr_object = sparseArrayCompat0.values;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 != SparseArrayCompatKt.a) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_object[v2] = object0;
                    arr_object[v1] = null;
                }
                ++v2;
            }
        }
        sparseArrayCompat0.garbage = false;
        sparseArrayCompat0.size = v2;
    }

    public static final void commonAppend(@NotNull SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.size;
        if(v1 != 0 && v <= sparseArrayCompat0.keys[v1 - 1]) {
            sparseArrayCompat0.put(v, object0);
            return;
        }
        if(sparseArrayCompat0.garbage && v1 >= sparseArrayCompat0.keys.length) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        int v2 = sparseArrayCompat0.size;
        if(v2 >= sparseArrayCompat0.keys.length) {
            int v3 = ContainerHelpersKt.idealIntArraySize(v2 + 1);
            int[] arr_v = Arrays.copyOf(sparseArrayCompat0.keys, v3);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
            sparseArrayCompat0.keys = arr_v;
            Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.values, v3);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            sparseArrayCompat0.values = arr_object;
        }
        sparseArrayCompat0.keys[v2] = v;
        sparseArrayCompat0.values[v2] = object0;
        sparseArrayCompat0.size = v2 + 1;
    }

    public static final void commonClear(@NotNull SparseArrayCompat sparseArrayCompat0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v = sparseArrayCompat0.size;
        Object[] arr_object = sparseArrayCompat0.values;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        sparseArrayCompat0.size = 0;
        sparseArrayCompat0.garbage = false;
    }

    public static final boolean commonContainsKey(@NotNull SparseArrayCompat sparseArrayCompat0, int v) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.indexOfKey(v) >= 0;
    }

    public static final boolean commonContainsValue(@NotNull SparseArrayCompat sparseArrayCompat0, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.garbage) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        int v = sparseArrayCompat0.size;
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(sparseArrayCompat0.values[v1] == object0) {
                break;
            }
        }
        return v1 >= 0;
    }

    @Nullable
    public static final Object commonGet(@NotNull SparseArrayCompat sparseArrayCompat0, int v) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
        if(v1 >= 0) {
            Object object0 = sparseArrayCompat0.values[v1];
            return object0 == SparseArrayCompatKt.a ? null : object0;
        }
        return null;
    }

    public static final Object commonGet(@NotNull SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
        if(v1 >= 0) {
            Object object1 = sparseArrayCompat0.values[v1];
            return object1 == SparseArrayCompatKt.a ? object0 : object1;
        }
        return object0;
    }

    public static final int commonIndexOfKey(@NotNull SparseArrayCompat sparseArrayCompat0, int v) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.garbage) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
    }

    public static final int commonIndexOfValue(@NotNull SparseArrayCompat sparseArrayCompat0, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.garbage) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        int v = sparseArrayCompat0.size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(sparseArrayCompat0.values[v1] == object0) {
                return v1;
            }
        }
        return -1;
    }

    public static final boolean commonIsEmpty(@NotNull SparseArrayCompat sparseArrayCompat0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.size() == 0;
    }

    public static final int commonKeyAt(@NotNull SparseArrayCompat sparseArrayCompat0, int v) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.garbage) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        return sparseArrayCompat0.keys[v];
    }

    public static final void commonPut(@NotNull SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
        if(v1 >= 0) {
            sparseArrayCompat0.values[v1] = object0;
            return;
        }
        int v2 = ~v1;
        if(v2 < sparseArrayCompat0.size && sparseArrayCompat0.values[v2] == SparseArrayCompatKt.a) {
            sparseArrayCompat0.keys[v2] = v;
            sparseArrayCompat0.values[v2] = object0;
            return;
        }
        if(sparseArrayCompat0.garbage && sparseArrayCompat0.size >= sparseArrayCompat0.keys.length) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
            v2 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
        }
        int v3 = sparseArrayCompat0.size;
        if(v3 >= sparseArrayCompat0.keys.length) {
            int v4 = ContainerHelpersKt.idealIntArraySize(v3 + 1);
            int[] arr_v = Arrays.copyOf(sparseArrayCompat0.keys, v4);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
            sparseArrayCompat0.keys = arr_v;
            Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.values, v4);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            sparseArrayCompat0.values = arr_object;
        }
        int v5 = sparseArrayCompat0.size;
        if(v5 - v2 != 0) {
            ArraysKt___ArraysJvmKt.copyInto(sparseArrayCompat0.keys, sparseArrayCompat0.keys, v2 + 1, v2, v5);
            ArraysKt___ArraysJvmKt.copyInto(sparseArrayCompat0.values, sparseArrayCompat0.values, v2 + 1, v2, sparseArrayCompat0.size);
        }
        sparseArrayCompat0.keys[v2] = v;
        sparseArrayCompat0.values[v2] = object0;
        ++sparseArrayCompat0.size;
    }

    public static final void commonPutAll(@NotNull SparseArrayCompat sparseArrayCompat0, @NotNull SparseArrayCompat sparseArrayCompat1) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        Intrinsics.checkNotNullParameter(sparseArrayCompat1, "other");
        int v = sparseArrayCompat1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArrayCompat1.keyAt(v1);
            Object object0 = sparseArrayCompat1.valueAt(v1);
            int v3 = ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v2);
            if(v3 >= 0) {
                sparseArrayCompat0.values[v3] = object0;
            }
            else {
                int v4 = ~v3;
                if(v4 >= sparseArrayCompat0.size || sparseArrayCompat0.values[v4] != SparseArrayCompatKt.a) {
                    if(sparseArrayCompat0.garbage && sparseArrayCompat0.size >= sparseArrayCompat0.keys.length) {
                        SparseArrayCompatKt.access$gc(sparseArrayCompat0);
                        v4 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v2);
                    }
                    int v5 = sparseArrayCompat0.size;
                    if(v5 >= sparseArrayCompat0.keys.length) {
                        int v6 = ContainerHelpersKt.idealIntArraySize(v5 + 1);
                        int[] arr_v = Arrays.copyOf(sparseArrayCompat0.keys, v6);
                        Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
                        sparseArrayCompat0.keys = arr_v;
                        Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.values, v6);
                        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
                        sparseArrayCompat0.values = arr_object;
                    }
                    int v7 = sparseArrayCompat0.size;
                    if(v7 - v4 != 0) {
                        ArraysKt___ArraysJvmKt.copyInto(sparseArrayCompat0.keys, sparseArrayCompat0.keys, v4 + 1, v4, v7);
                        ArraysKt___ArraysJvmKt.copyInto(sparseArrayCompat0.values, sparseArrayCompat0.values, v4 + 1, v4, sparseArrayCompat0.size);
                    }
                    sparseArrayCompat0.keys[v4] = v2;
                    sparseArrayCompat0.values[v4] = object0;
                    ++sparseArrayCompat0.size;
                }
                else {
                    sparseArrayCompat0.keys[v4] = v2;
                    sparseArrayCompat0.values[v4] = object0;
                }
            }
        }
    }

    @Nullable
    public static final Object commonPutIfAbsent(@NotNull SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        Object object1 = SparseArrayCompatKt.commonGet(sparseArrayCompat0, v);
        if(object1 == null) {
            int v1 = ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
            if(v1 >= 0) {
                sparseArrayCompat0.values[v1] = object0;
                return null;
            }
            int v2 = ~v1;
            if(v2 < sparseArrayCompat0.size && sparseArrayCompat0.values[v2] == SparseArrayCompatKt.a) {
                sparseArrayCompat0.keys[v2] = v;
                sparseArrayCompat0.values[v2] = object0;
                return null;
            }
            if(sparseArrayCompat0.garbage && sparseArrayCompat0.size >= sparseArrayCompat0.keys.length) {
                SparseArrayCompatKt.access$gc(sparseArrayCompat0);
                v2 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
            }
            int v3 = sparseArrayCompat0.size;
            if(v3 >= sparseArrayCompat0.keys.length) {
                int v4 = ContainerHelpersKt.idealIntArraySize(v3 + 1);
                int[] arr_v = Arrays.copyOf(sparseArrayCompat0.keys, v4);
                Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
                sparseArrayCompat0.keys = arr_v;
                Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.values, v4);
                Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
                sparseArrayCompat0.values = arr_object;
            }
            int v5 = sparseArrayCompat0.size;
            if(v5 - v2 != 0) {
                ArraysKt___ArraysJvmKt.copyInto(sparseArrayCompat0.keys, sparseArrayCompat0.keys, v2 + 1, v2, v5);
                ArraysKt___ArraysJvmKt.copyInto(sparseArrayCompat0.values, sparseArrayCompat0.values, v2 + 1, v2, sparseArrayCompat0.size);
            }
            sparseArrayCompat0.keys[v2] = v;
            sparseArrayCompat0.values[v2] = object0;
            ++sparseArrayCompat0.size;
        }
        return object1;
    }

    public static final void commonRemove(@NotNull SparseArrayCompat sparseArrayCompat0, int v) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.binarySearch(sparseArrayCompat0.keys, sparseArrayCompat0.size, v);
        if(v1 >= 0) {
            Object[] arr_object = sparseArrayCompat0.values;
            Object object0 = SparseArrayCompatKt.a;
            if(arr_object[v1] != object0) {
                arr_object[v1] = object0;
                sparseArrayCompat0.garbage = true;
            }
        }
    }

    public static final boolean commonRemove(@NotNull SparseArrayCompat sparseArrayCompat0, int v, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.indexOfKey(v);
        if(v1 >= 0 && Intrinsics.areEqual(object0, sparseArrayCompat0.valueAt(v1))) {
            sparseArrayCompat0.removeAt(v1);
            return true;
        }
        return false;
    }

    public static final void commonRemoveAt(@NotNull SparseArrayCompat sparseArrayCompat0, int v) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.values[v] != SparseArrayCompatKt.a) {
            sparseArrayCompat0.values[v] = SparseArrayCompatKt.a;
            sparseArrayCompat0.garbage = true;
        }
    }

    public static final void commonRemoveAtRange(@NotNull SparseArrayCompat sparseArrayCompat0, int v, int v1) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v2 = Math.min(v1, v + v1);
        while(v < v2) {
            sparseArrayCompat0.removeAt(v);
            ++v;
        }
    }

    @Nullable
    public static final Object commonReplace(@NotNull SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.indexOfKey(v);
        if(v1 >= 0) {
            Object[] arr_object = sparseArrayCompat0.values;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
            return object1;
        }
        return null;
    }

    public static final boolean commonReplace(@NotNull SparseArrayCompat sparseArrayCompat0, int v, Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.indexOfKey(v);
        if(v1 >= 0 && Intrinsics.areEqual(sparseArrayCompat0.values[v1], object0)) {
            sparseArrayCompat0.values[v1] = object1;
            return true;
        }
        return false;
    }

    public static final void commonSetValueAt(@NotNull SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.garbage) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        sparseArrayCompat0.values[v] = object0;
    }

    public static final int commonSize(@NotNull SparseArrayCompat sparseArrayCompat0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.garbage) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        return sparseArrayCompat0.size;
    }

    @NotNull
    public static final String commonToString(@NotNull SparseArrayCompat sparseArrayCompat0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.size() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(sparseArrayCompat0.size * 28);
        stringBuilder0.append('{');
        int v = sparseArrayCompat0.size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(sparseArrayCompat0.keyAt(v1));
            stringBuilder0.append('=');
            Object object0 = sparseArrayCompat0.valueAt(v1);
            if(object0 == sparseArrayCompat0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        return q.l('}', "buffer.toString()", stringBuilder0);
    }

    public static final Object commonValueAt(@NotNull SparseArrayCompat sparseArrayCompat0, int v) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.garbage) {
            SparseArrayCompatKt.access$gc(sparseArrayCompat0);
        }
        return sparseArrayCompat0.values[v];
    }
}

