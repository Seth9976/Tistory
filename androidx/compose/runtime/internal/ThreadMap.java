package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", "key", "get", "(J)Ljava/lang/Object;", "value", "", "trySet", "(JLjava/lang/Object;)Z", "newWith", "(JLjava/lang/Object;)Landroidx/compose/runtime/internal/ThreadMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12904#2,3:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:113,3\n*E\n"})
public final class ThreadMap {
    public static final int $stable = 8;
    public final int a;
    public final long[] b;
    public final Object[] c;

    public ThreadMap(int v, @NotNull long[] arr_v, @NotNull Object[] arr_object) {
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
    }

    public final int a(long v) {
        int v1 = this.a - 1;
        if(v1 != -1) {
            long[] arr_v = this.b;
            int v2 = 0;
            if(v1 != 0) {
                while(v2 <= v1) {
                    int v3 = v2 + v1 >>> 1;
                    int v4 = Long.compare(arr_v[v3] - v, 0L);
                    if(v4 < 0) {
                        v2 = v3 + 1;
                        continue;
                    }
                    if(v4 > 0) {
                        v1 = v3 - 1;
                        continue;
                    }
                    return v3;
                }
                return -(v2 + 1);
            }
            long v5 = arr_v[0];
            if(v5 == v) {
                return 0;
            }
            return v5 <= v ? -1 : -2;
        }
        return -1;
    }

    @Nullable
    public final Object get(long v) {
        int v1 = this.a(v);
        return v1 < 0 ? null : this.c[v1];
    }

    @NotNull
    public final ThreadMap newWith(long v, @Nullable Object object0) {
        long[] arr_v1;
        Object[] arr_object = this.c;
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            if(arr_object[v2] != null) {
                ++v3;
            }
        }
        long[] arr_v = new long[v3 + 1];
        Object[] arr_object1 = new Object[v3 + 1];
        if(v3 + 1 > 1) {
            int v4;
            for(v4 = 0; true; ++v4) {
                arr_v1 = this.b;
                int v5 = this.a;
                if(v1 >= v3 + 1 || v4 >= v5) {
                    break;
                }
                long v6 = arr_v1[v4];
                Object object1 = arr_object[v4];
                if(v6 > v) {
                    arr_v[v1] = v;
                    arr_object1[v1] = object0;
                    ++v1;
                    break;
                }
                if(object1 != null) {
                    arr_v[v1] = v6;
                    arr_object1[v1] = object1;
                    ++v1;
                }
            }
            if(v4 == v5) {
                arr_v[v3] = v;
                arr_object1[v3] = object0;
                return new ThreadMap(v3 + 1, arr_v, arr_object1);
            }
            while(v1 < v3 + 1) {
                long v7 = arr_v1[v4];
                Object object2 = arr_object[v4];
                if(object2 != null) {
                    arr_v[v1] = v7;
                    arr_object1[v1] = object2;
                    ++v1;
                }
                ++v4;
            }
            return new ThreadMap(v3 + 1, arr_v, arr_object1);
        }
        arr_v[0] = v;
        arr_object1[0] = object0;
        return new ThreadMap(v3 + 1, arr_v, arr_object1);
    }

    public final boolean trySet(long v, @Nullable Object object0) {
        int v1 = this.a(v);
        if(v1 < 0) {
            return false;
        }
        this.c[v1] = object0;
        return true;
    }
}

