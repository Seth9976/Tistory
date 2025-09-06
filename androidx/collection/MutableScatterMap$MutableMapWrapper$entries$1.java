package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import r.g;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u000F\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0007\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ)\u0010\u000E\u001A\u00020\u00032\u0018\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ$\u0010\u0011\u001A\u00020\u00032\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001A\u00020\u00032\u0018\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000FJ#\u0010\u0014\u001A\u00020\u00032\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001A\u00020\u00032\u0018\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000FJ)\u0010\u0016\u001A\u00020\u00032\u0018\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000FJ#\u0010\u0017\u001A\u00020\u00032\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0012R\u0014\u0010\u001B\u001A\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1", "", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "clear", "()V", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/util/Map$Entry;)Z", "addAll", "add", "retainAll", "removeAll", "remove", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1726#2,3:1835\n363#3,6:1838\n373#3,3:1845\n376#3,9:1849\n363#3,6:1858\n373#3,3:1865\n376#3,9:1869\n633#3:1878\n634#3:1882\n636#3,2:1884\n638#3,4:1887\n642#3:1894\n643#3:1898\n644#3:1900\n645#3,4:1903\n651#3:1908\n652#3,8:1910\n1810#4:1844\n1672#4:1848\n1810#4:1864\n1672#4:1868\n1589#4,3:1879\n1603#4:1883\n1599#4:1886\n1779#4,3:1891\n1793#4,3:1895\n1717#4:1899\n1705#4:1901\n1699#4:1902\n1712#4:1907\n1802#4:1909\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n*L\n1342#1:1835,3\n1360#1:1838,6\n1360#1:1845,3\n1360#1:1849,9\n1382#1:1858,6\n1382#1:1865,3\n1382#1:1869,9\n1397#1:1878\n1397#1:1882\n1397#1:1884,2\n1397#1:1887,4\n1397#1:1894\n1397#1:1898\n1397#1:1900\n1397#1:1903,4\n1397#1:1908\n1397#1:1910,8\n1360#1:1844\n1360#1:1848\n1382#1:1864\n1382#1:1868\n1397#1:1879,3\n1397#1:1883\n1397#1:1886\n1397#1:1891,3\n1397#1:1895,3\n1397#1:1899\n1397#1:1901\n1397#1:1902\n1397#1:1907\n1397#1:1909\n*E\n"})
public final class MutableScatterMap.MutableMapWrapper.entries.1 implements Set, KMutableSet {
    public final MutableScatterMap a;

    public MutableScatterMap.MutableMapWrapper.entries.1(MutableScatterMap mutableScatterMap0) {
        this.a = mutableScatterMap0;
    }

    @Override
    public boolean add(Object object0) {
        return this.add(((Map.Entry)object0));
    }

    public boolean add(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
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
    public final boolean contains(Object object0) {
        return TypeIntrinsics.isMutableMapEntry(object0) ? this.contains(((Map.Entry)object0)) : false;
    }

    public boolean contains(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        Object object0 = map$Entry0.getKey();
        return Intrinsics.areEqual(this.a.get(object0), map$Entry0.getValue());
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                Object object1 = ((Map.Entry)object0).getKey();
                if(!Intrinsics.areEqual(this.a.get(object1), ((Map.Entry)object0).getValue())) {
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
            public Iterator a;
            public int b;
            public final MutableScatterMap c;

            {
                this.c = mutableScatterMap0;
                this.b = -1;
                this.a = SequencesKt__SequenceBuilderKt.iterator(new g(mutableScatterMap0, this, null));
            }

            public final int getCurrent() {
                return this.b;
            }

            @NotNull
            public final Iterator getIterator() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.next();
            }

            @NotNull
            public Map.Entry next() {
                return this.a.next();
            }

            @Override
            public void remove() {
                int v = this.b;
                if(v != -1) {
                    this.c.removeValueAt(v);
                    this.b = -1;
                }
            }

            public final void setCurrent(int v) {
                this.b = v;
            }

            public final void setIterator(@NotNull Iterator iterator0) {
                Intrinsics.checkNotNullParameter(iterator0, "<set-?>");
                this.a = iterator0;
            }
        };
    }

    @Override
    public final boolean remove(Object object0) {
        return TypeIntrinsics.isMutableMapEntry(object0) ? this.remove(((Map.Entry)object0)) : false;
    }

    public boolean remove(@NotNull Map.Entry map$Entry0) {
        int v10;
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        Object object0 = map$Entry0.getKey();
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
                    goto label_21;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_25;
            }
            else {
                v10 = -1;
            }
        label_21:
            if(v10 >= 0 && Intrinsics.areEqual(mutableScatterMap0.values[v10], map$Entry0.getValue())) {
                mutableScatterMap0.removeValueAt(v10);
                return true;
            }
            return false;
        label_25:
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
                            for(Object object0: collection0) {
                                if(Intrinsics.areEqual(((Map.Entry)object0).getKey(), mutableScatterMap0.keys[v5]) && Intrinsics.areEqual(((Map.Entry)object0).getValue(), mutableScatterMap0.values[v5])) {
                                    mutableScatterMap0.removeValueAt(v5);
                                    z = true;
                                    break;
                                }
                                if(false) {
                                    break;
                                }
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
            int v1 = 0;
            boolean z = false;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Iterator iterator0 = collection0.iterator();
                            while(true) {
                                if(iterator0.hasNext()) {
                                    Object object0 = iterator0.next();
                                    if(Intrinsics.areEqual(((Map.Entry)object0).getKey(), mutableScatterMap0.keys[v5]) && Intrinsics.areEqual(((Map.Entry)object0).getValue(), mutableScatterMap0.values[v5])) {
                                        break;
                                    }
                                    else {
                                        continue;
                                    }
                                }
                                mutableScatterMap0.removeValueAt(v5);
                                z = true;
                                break;
                            }
                        }
                        v2 >>= 8;
                        ++v4;
                    }
                    if(v3 != 8) {
                        return z;
                    }
                }
                if(v1 == v) {
                    break;
                }
                ++v1;
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

