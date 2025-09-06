package androidx.collection;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u000E\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000EH\u0086\u0002¢\u0006\u0004\b\f\u0010\u0012J\u0015\u0010\u0010\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0013J\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0014J\u0015\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\u0018\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0017\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0017\u0010\u0011J\u0018\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000EH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0015\u0010\u0017\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0018\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0018\u001A\u00020\u000B¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/collection/MutableFloatSet;", "Landroidx/collection/FloatSet;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "add", "(F)Z", "", "plusAssign", "(F)V", "", "elements", "addAll", "([F)Z", "([F)V", "(Landroidx/collection/FloatSet;)Z", "(Landroidx/collection/FloatSet;)V", "remove", "minusAssign", "removeAll", "clear", "()V", "trim", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,837:1\n816#1,2:981\n820#1,5:989\n816#1,2:1020\n820#1,5:1028\n816#1,2:1045\n820#1,5:1053\n1#2:838\n1656#3,6:839\n1810#3:858\n1672#3:862\n1603#3:879\n1599#3:882\n1779#3,3:886\n1793#3,3:890\n1717#3:894\n1705#3:896\n1699#3:897\n1712#3:902\n1802#3:904\n1603#3:918\n1599#3:921\n1779#3,3:925\n1793#3,3:929\n1717#3:933\n1705#3:935\n1699#3:936\n1712#3:941\n1802#3:943\n1810#3:965\n1672#3:969\n1656#3,6:983\n1656#3,6:994\n1599#3:1003\n1603#3:1004\n1779#3,3:1005\n1793#3,3:1008\n1717#3:1011\n1705#3:1012\n1699#3:1013\n1712#3:1014\n1802#3:1015\n1666#3:1016\n1645#3:1017\n1664#3:1018\n1645#3:1019\n1656#3,6:1022\n1779#3,3:1033\n1810#3:1036\n1699#3:1037\n1669#3:1038\n1645#3:1039\n1599#3:1043\n1603#3:1044\n1656#3,6:1047\n1656#3,6:1058\n1656#3,6:1064\n13614#4,2:845\n13614#4,2:952\n262#5,4:847\n232#5,7:851\n243#5,3:859\n246#5,2:863\n266#5,2:865\n249#5,6:867\n268#5:873\n442#5:874\n443#5:878\n445#5,2:880\n447#5,3:883\n450#5:889\n451#5:893\n452#5:895\n453#5,4:898\n459#5:903\n460#5,8:905\n442#5:913\n443#5:917\n445#5,2:919\n447#5,3:922\n450#5:928\n451#5:932\n452#5:934\n453#5,4:937\n459#5:942\n460#5,8:944\n262#5,4:954\n232#5,7:958\n243#5,3:966\n246#5,2:970\n266#5,2:972\n249#5,6:974\n268#5:980\n833#6,3:875\n833#6,3:914\n833#6,3:1000\n833#6,3:1040\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n*L\n673#1:981,2\n673#1:989,5\n731#1:1020,2\n731#1:1028,5\n804#1:1045,2\n804#1:1053,5\n526#1:839,6\n595#1:858\n595#1:862\n607#1:879\n607#1:882\n607#1:886,3\n607#1:890,3\n607#1:894\n607#1:896\n607#1:897\n607#1:902\n607#1:904\n620#1:918\n620#1:921\n620#1:925,3\n620#1:929,3\n620#1:933\n620#1:935\n620#1:936\n620#1:941\n620#1:943\n663#1:965\n663#1:969\n673#1:983,6\n683#1:994,6\n697#1:1003\n698#1:1004\n705#1:1005,3\n706#1:1008,3\n707#1:1011\n708#1:1012\n708#1:1013\n712#1:1014\n715#1:1015\n724#1:1016\n724#1:1017\n730#1:1018\n730#1:1019\n731#1:1022,6\n745#1:1033,3\n746#1:1036\n748#1:1037\n799#1:1038\n799#1:1039\n802#1:1043\n804#1:1044\n804#1:1047,6\n817#1:1058,6\n823#1:1064,6\n573#1:845,2\n642#1:952,2\n595#1:847,4\n595#1:851,7\n595#1:859,3\n595#1:863,2\n595#1:865,2\n595#1:867,6\n595#1:873\n607#1:874\n607#1:878\n607#1:880,2\n607#1:883,3\n607#1:889\n607#1:893\n607#1:895\n607#1:898,4\n607#1:903\n607#1:905,8\n620#1:913\n620#1:917\n620#1:919,2\n620#1:922,3\n620#1:928\n620#1:932\n620#1:934\n620#1:937,4\n620#1:942\n620#1:944,8\n663#1:954,4\n663#1:958,7\n663#1:966,3\n663#1:970,2\n663#1:972,2\n663#1:974,6\n663#1:980\n607#1:875,3\n620#1:914,3\n696#1:1000,3\n801#1:1040,3\n*E\n"})
public final class MutableFloatSet extends FloatSet {
    public int a;

    public MutableFloatSet() {
        this(0, 1, null);
    }

    public MutableFloatSet(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.c(ScatterMapKt.unloadedCapacity(v));
    }

    public MutableFloatSet(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    public final int a(float f) {
        int v = Float.hashCode(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = v6 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.elements[v9] == f) {
                    return v9;
                }
            }
            if(Long.compare(~v6 << 6 & v6 & 0x8080808080808080L, 0L) != 0) {
                int v10 = this.b(v1 >>> 7);
                if(this.a == 0 && (this.metadata[v10 >> 3] >> ((v10 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this._capacity > 8 && Long.compareUnsigned(q.f(this._size, 0x20L), q.f(this._capacity, 25L)) <= 0) {
                    }
                    this.e(ScatterMapKt.nextCapacity(this._capacity));
                    v10 = this.b(v1 >>> 7);
                }
                ++this._size;
                int v11 = this.a;
                long[] arr_v = this.metadata;
                long v12 = arr_v[v10 >> 3];
                int v13 = (v10 & 7) << 3;
                this.a = v11 - ((v12 >> v13 & 0xFFL) == 0x80L ? 1 : 0);
                arr_v[v10 >> 3] = v12 & ~(0xFFL << v13) | ((long)(v1 & 0x7F)) << v13;
                int v14 = (v10 - 7 & this._capacity) + (this._capacity & 7);
                int v15 = (v14 & 7) << 3;
                arr_v[v14 >> 3] = arr_v[v14 >> 3] & ~(0xFFL << v15) | ((long)(v1 & 0x7F)) << v15;
                return v10;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean add(float f) {
        int v = this._size;
        this.elements[this.a(f)] = f;
        return this._size != v;
    }

    public final boolean addAll(@NotNull FloatSet floatSet0) {
        Intrinsics.checkNotNullParameter(floatSet0, "elements");
        int v = this._size;
        this.plusAssign(floatSet0);
        return v != this._size;
    }

    public final boolean addAll(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        int v = this._size;
        this.plusAssign(arr_f);
        return v != this._size;
    }

    public final int b(int v) {
        long v6;
        int v1 = this._capacity;
        int v2 = v & v1;
        int v3 = 0;
        while(true) {
            int v4 = (v2 & 7) << 3;
            long v5 = this.metadata[(v2 >> 3) + 1] << 0x40 - v4 & -((long)v4) >> 0x3F | this.metadata[v2 >> 3] >>> v4;
            v6 = v5 & ~v5 << 7 & 0x8080808080808080L;
            if(v6 != 0L) {
                break;
            }
            v3 += 8;
            v2 = v2 + v3 & v1;
        }
        return v2 + (Long.numberOfTrailingZeros(v6) >> 3) & v1;
    }

    public final void c(int v) {
        long[] arr_v;
        int v1 = v <= 0 ? 0 : Math.max(7, ScatterMapKt.normalizeCapacity(v));
        this._capacity = v1;
        if(v1 == 0) {
            arr_v = ScatterMapKt.EmptyGroup;
        }
        else {
            arr_v = new long[(v1 + 15 & -8) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(arr_v, 0x8080808080808080L, 0, 0, 6, null);
        }
        this.metadata = arr_v;
        arr_v[v1 >> 3] |= 0xFFL << ((v1 & 7) << 3);
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
        this.elements = new float[v1];
    }

    public final void clear() {
        this._size = 0;
        long[] arr_v = this.metadata;
        if(arr_v != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this._capacity >> 3;
            this.metadata[v] |= 0xFFL << ((this._capacity & 7) << 3);
        }
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
    }

    public final void d(int v) {
        --this._size;
        long[] arr_v = this.metadata;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this._capacity) + (this._capacity & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
    }

    public final void e(int v) {
        long[] arr_v = this.metadata;
        float[] arr_f = this.elements;
        int v1 = this._capacity;
        this.c(v);
        float[] arr_f1 = this.elements;
        for(int v2 = 0; v2 < v1; ++v2) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                float f = arr_f[v2];
                int v3 = Float.hashCode(f);
                int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
                int v5 = this.b(v4 >>> 7);
                long[] arr_v1 = this.metadata;
                int v6 = (v5 & 7) << 3;
                arr_v1[v5 >> 3] = ~(0xFFL << v6) & arr_v1[v5 >> 3] | ((long)(v4 & 0x7F)) << v6;
                int v7 = (v5 - 7 & this._capacity) + (this._capacity & 7);
                int v8 = (v7 & 7) << 3;
                arr_v1[v7 >> 3] = ~(0xFFL << v8) & arr_v1[v7 >> 3] | ((long)(v4 & 0x7F)) << v8;
                arr_f1[v5] = f;
            }
        }
    }

    public final void minusAssign(float f) {
        int v10;
        int v = Float.hashCode(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.elements[v9] == f) {
                    v10 = v9;
                    goto label_18;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_21;
            }
            else {
                v10 = -1;
            }
        label_18:
            if(v10 >= 0) {
                this.d(v10);
            }
            return;
        label_21:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final void minusAssign(@NotNull FloatSet floatSet0) {
        Intrinsics.checkNotNullParameter(floatSet0, "elements");
        float[] arr_f = floatSet0.elements;
        long[] arr_v = floatSet0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.minusAssign(arr_f[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void minusAssign(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        for(int v = 0; v < arr_f.length; ++v) {
            this.minusAssign(arr_f[v]);
        }
    }

    public final void plusAssign(float f) {
        this.elements[this.a(f)] = f;
    }

    public final void plusAssign(@NotNull FloatSet floatSet0) {
        Intrinsics.checkNotNullParameter(floatSet0, "elements");
        float[] arr_f = floatSet0.elements;
        long[] arr_v = floatSet0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.plusAssign(arr_f[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void plusAssign(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        for(int v = 0; v < arr_f.length; ++v) {
            this.plusAssign(arr_f[v]);
        }
    }

    public final boolean remove(float f) {
        int v10;
        int v = Float.hashCode(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        boolean z = false;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.elements[v9] == f) {
                    v10 = v9;
                    goto label_19;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_23;
            }
            else {
                v10 = -1;
            }
        label_19:
            if(v10 >= 0) {
                z = true;
                this.d(v10);
            }
            return z;
        label_23:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean removeAll(@NotNull FloatSet floatSet0) {
        Intrinsics.checkNotNullParameter(floatSet0, "elements");
        int v = this._size;
        this.minusAssign(floatSet0);
        return v != this._size;
    }

    public final boolean removeAll(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        int v = this._size;
        this.minusAssign(arr_f);
        return v != this._size;
    }

    @IntRange(from = 0L)
    public final int trim() {
        int v = this._capacity;
        int v1 = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if(v1 < v) {
            this.e(v1);
            return v - this._capacity;
        }
        return 0;
    }
}

