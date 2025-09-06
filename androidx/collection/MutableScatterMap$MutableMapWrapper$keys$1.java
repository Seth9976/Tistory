package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import r.h;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\r\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0012\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\u0012\u0010\u000EJ\u001D\u0010\u0013\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\u0013\u0010\u000EJ\u0017\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001D\u0010\u0015\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\u0015\u0010\u000EJ\u0018\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u001A\u001A\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "clear", "()V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n633#2:1875\n634#2:1879\n636#2,2:1881\n638#2,4:1884\n642#2:1891\n643#2:1895\n644#2:1897\n645#2,4:1900\n651#2:1905\n652#2,8:1907\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1589#3,3:1876\n1603#3:1880\n1599#3:1883\n1779#3,3:1888\n1793#3,3:1892\n1717#3:1896\n1705#3:1898\n1699#3:1899\n1712#3:1904\n1802#3:1906\n1726#4,3:1915\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n*L\n1450#1:1835,6\n1450#1:1842,3\n1450#1:1846,9\n1461#1:1855,6\n1461#1:1862,3\n1461#1:1866,9\n1471#1:1875\n1471#1:1879\n1471#1:1881,2\n1471#1:1884,4\n1471#1:1891\n1471#1:1895\n1471#1:1897\n1471#1:1900,4\n1471#1:1905\n1471#1:1907,8\n1450#1:1841\n1450#1:1845\n1461#1:1861\n1461#1:1865\n1471#1:1876,3\n1471#1:1880\n1471#1:1883\n1471#1:1888,3\n1471#1:1892,3\n1471#1:1896\n1471#1:1898\n1471#1:1899\n1471#1:1904\n1471#1:1906\n1480#1:1915,3\n*E\n"})
public final class MutableScatterMap.MutableMapWrapper.keys.1 implements Set, KMutableSet {
    public final MutableScatterMap a;

    public MutableScatterMap.MutableMapWrapper.keys.1(MutableScatterMap mutableScatterMap0) {
        this.a = mutableScatterMap0;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.a.containsKey(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public int getSize() {
        return this.a._size;
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public int b;
            public final MutableScatterMap c;

            {
                this.c = mutableScatterMap0;
                this.a = SequencesKt__SequenceBuilderKt.iterator(new h(mutableScatterMap0, null));
                this.b = -1;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                Object object0 = this.a.next();
                int v = ((Number)object0).intValue();
                this.b = v;
                return this.c.keys[v];
            }

            @Override
            public void remove() {
                int v = this.b;
                if(v >= 0) {
                    this.c.removeValueAt(v);
                    this.b = -1;
                }
            }
        };
    }

    @Override
    public boolean remove(Object object0) {
        int v10;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        MutableScatterMap mutableScatterMap0 = this.a;
        int v2 = mutableScatterMap0._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = mutableScatterMap0.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | mutableScatterMap0.metadata[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(Intrinsics.areEqual(mutableScatterMap0.keys[v9], object0)) {
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
                mutableScatterMap0.removeValueAt(v10);
                return true;
            }
            return false;
        label_23:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        MutableScatterMap mutableScatterMap0 = this.a;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(CollectionsKt___CollectionsKt.contains(collection0, mutableScatterMap0.keys[v5])) {
                                mutableScatterMap0.removeValueAt(v5);
                                z = true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return z;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return z;
        }
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        MutableScatterMap mutableScatterMap0 = this.a;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(!CollectionsKt___CollectionsKt.contains(collection0, mutableScatterMap0.keys[v5])) {
                                mutableScatterMap0.removeValueAt(v5);
                                z = true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return z;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return z;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }
}

