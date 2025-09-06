package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\b2\u0006\u0010\u0006\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u0001\u00A2\u0006\u0004\b\t\u0010\nJ\u001D\u0010\f\u001A\u00020\b2\u0006\u0010\u0006\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0001\u00A2\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J;\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0006\u001A\u00028\u00002!\u0010\u0014\u001A\u001D\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0011H\u0086\b\u00A2\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u0006\u001A\u00028\u00002!\u0010\u0014\u001A\u001D\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000E0\u0011H\u0086\b\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\b\u00A2\u0006\u0004\b\u0019\u0010\u0005J\u001D\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u0006\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ5\u0010\u001D\u001A\u00020\b2#\b\u0004\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000E0\u0011H\u0086\b\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\u001F\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u001F\u0010#\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0!\u00A2\u0006\u0004\b#\u0010$R#\u0010*\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010%8\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0011\u0010.\u001A\u00020+8F\u00A2\u0006\u0006\u001A\u0004\b,\u0010-\u00A8\u0006/"}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "<init>", "()V", "key", "scope", "", "add", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", "set", "element", "", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "block", "forEachScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "anyScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "clear", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeScopeIf", "(Lkotlin/jvm/functions/Function1;)V", "removeScope", "(Ljava/lang/Object;)V", "", "", "asMap", "()Ljava/util/Map;", "Landroidx/collection/MutableScatterMap;", "a", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "map", "", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,194:1\n77#1,5:240\n85#1,4:272\n874#2,18:195\n1047#2:276\n1049#2:290\n1050#2,3:318\n1053#2:327\n1047#2:328\n1049#2,4:342\n1053#2:352\n267#3,4:213\n237#3,7:217\n248#3,3:225\n251#3,2:229\n272#3,2:231\n254#3,6:233\n274#3:239\n267#3,4:245\n237#3,7:249\n248#3,3:257\n251#3,2:261\n272#3,2:263\n254#3,6:265\n274#3:271\n237#3,7:293\n248#3,3:301\n251#3,2:305\n254#3,6:311\n1810#4:224\n1672#4:228\n1810#4:256\n1672#4:260\n1810#4:283\n1672#4:287\n1810#4:300\n1672#4:304\n1810#4:335\n1672#4:339\n1810#4:363\n1672#4:367\n363#5,6:277\n373#5,3:284\n376#5,2:288\n379#5,6:321\n363#5,6:329\n373#5,3:336\n376#5,2:340\n379#5,6:346\n391#5,4:353\n363#5,6:357\n373#5,3:364\n376#5,2:368\n396#5,2:370\n379#5,6:372\n398#5:378\n842#6,2:291\n845#6,4:307\n849#6:317\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n91#1:240,5\n91#1:272,4\n37#1:195,18\n138#1:276\n138#1:290\n138#1:318,3\n138#1:327\n159#1:328\n159#1:342,4\n159#1:352\n81#1:213,4\n81#1:217,7\n81#1:225,3\n81#1:229,2\n81#1:231,2\n81#1:233,6\n81#1:239\n91#1:245,4\n91#1:249,7\n91#1:257,3\n91#1:261,2\n91#1:263,2\n91#1:265,6\n91#1:271\n143#1:293,7\n143#1:301,3\n143#1:305,2\n143#1:311,6\n81#1:224\n81#1:228\n91#1:256\n91#1:260\n138#1:283\n138#1:287\n143#1:300\n143#1:304\n159#1:335\n159#1:339\n180#1:363\n180#1:367\n138#1:277,6\n138#1:284,3\n138#1:288,2\n138#1:321,6\n159#1:329,6\n159#1:336,3\n159#1:340,2\n159#1:346,6\n180#1:353,4\n180#1:357,6\n180#1:364,3\n180#1:368,2\n180#1:370,2\n180#1:372,6\n180#1:378\n143#1:291,2\n143#1:307,4\n143#1:317\n*E\n"})
public final class ScopeMap {
    public static final int $stable = 8;
    public final MutableScatterMap a;

    public ScopeMap() {
        this.a = ScatterMapKt.mutableScatterMapOf();
    }

    public final void add(@NotNull Object object0, @NotNull Object object1) {
        MutableScatterMap mutableScatterMap0 = this.a;
        int v = mutableScatterMap0.findInsertIndex(object0);
        Object object2 = v >= 0 ? null : mutableScatterMap0.values[v];
        if(object2 != null) {
            if(object2 instanceof MutableScatterSet) {
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((MutableScatterSet)object2).add(object1);
                object1 = object2;
            }
            else if(object2 == object1) {
                object1 = object2;
            }
            else {
                MutableScatterSet mutableScatterSet0 = new MutableScatterSet(0, 1, null);
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                mutableScatterSet0.add(object2);
                mutableScatterSet0.add(object1);
                object1 = mutableScatterSet0;
            }
        }
        if(v < 0) {
            mutableScatterMap0.keys[~v] = object0;
            mutableScatterMap0.values[~v] = object1;
            return;
        }
        mutableScatterMap0.values[v] = object1;
    }

    public final boolean anyScopeOf(@NotNull Object object0, @NotNull Function1 function10) {
        Object object1 = this.getMap().get(object0);
        if(object1 != null) {
            if(!(object1 instanceof MutableScatterSet)) {
                return ((Boolean)function10.invoke(object1)).booleanValue();
            }
            Object[] arr_object = ((MutableScatterSet)object1).elements;
            long[] arr_v = ((MutableScatterSet)object1).metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_19;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && ((Boolean)function10.invoke(arr_object[(v1 << 3) + v4])).booleanValue()) {
                            return true;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_19:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    return false;
                }
                return ((Boolean)function10.invoke(object1)).booleanValue();
            }
        }
        return false;
    }

    @NotNull
    public final Map asMap() {
        Set set0;
        Map map0 = new HashMap();
        Object[] arr_object = this.a.keys;
        Object[] arr_object1 = this.a.values;
        long[] arr_v = this.a.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object0 = arr_object[v5];
                            Object object1 = arr_object1[v5];
                            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4");
                            if(object1 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4>");
                                set0 = ((MutableScatterSet)object1).asSet();
                            }
                            else {
                                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4");
                                set0 = f0.mutableSetOf(new Object[]{object1});
                            }
                            map0.put(object0, set0);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_28;
                    }
                    break;
                }
            label_28:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return map0;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(@NotNull Object object0) {
        return this.a.containsKey(object0);
    }

    public final void forEachScopeOf(@NotNull Object object0, @NotNull Function1 function10) {
        Object object1 = this.getMap().get(object0);
        if(object1 != null) {
            if(object1 instanceof MutableScatterSet) {
                Object[] arr_object = ((MutableScatterSet)object1).elements;
                long[] arr_v = ((MutableScatterSet)object1).metadata;
                int v = arr_v.length - 2;
                if(v >= 0) {
                    int v1 = 0;
                    while(true) {
                        long v2 = arr_v[v1];
                        if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_19;
                        }
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                function10.invoke(arr_object[(v1 << 3) + v4]);
                            }
                            v2 >>= 8;
                        }
                        if(v3 == 8) {
                        label_19:
                            if(v1 != v) {
                                ++v1;
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
            else {
                function10.invoke(object1);
            }
        }
    }

    @NotNull
    public final MutableScatterMap getMap() {
        return this.a;
    }

    public final int getSize() {
        return this.a.getSize();
    }

    public final boolean remove(@NotNull Object object0, @NotNull Object object1) {
        MutableScatterMap mutableScatterMap0 = this.a;
        Object object2 = mutableScatterMap0.get(object0);
        if(object2 == null) {
            return false;
        }
        if(object2 instanceof MutableScatterSet) {
            boolean z = ((MutableScatterSet)object2).remove(object1);
            if(z && ((MutableScatterSet)object2).isEmpty()) {
                mutableScatterMap0.remove(object0);
            }
            return z;
        }
        if(Intrinsics.areEqual(object2, object1)) {
            mutableScatterMap0.remove(object0);
            return true;
        }
        return false;
    }

    public final void removeScope(@NotNull Object object0) {
        boolean z;
        MutableScatterMap mutableScatterMap0 = this.a;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = mutableScatterMap0.keys[v5];
                            Object object2 = mutableScatterMap0.values[v5];
                            if(object2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                                ((MutableScatterSet)object2).remove(object0);
                                z = ((MutableScatterSet)object2).isEmpty();
                            }
                            else {
                                z = object2 == object0;
                            }
                            if(z) {
                                mutableScatterMap0.removeValueAt(v5);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_26;
                    }
                    break;
                }
            label_26:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void removeScopeIf(@NotNull Function1 function10) {
        int v15;
        long[] arr_v3;
        boolean z;
        int v14;
        int v13;
        int v9;
        long[] arr_v2;
        MutableScatterMap mutableScatterMap0 = this.getMap();
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v3 = arr_v;
                }
                else {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object0 = mutableScatterMap0.keys[v5];
                            Object object1 = mutableScatterMap0.values[v5];
                            if(object1 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                MutableScatterSet mutableScatterSet0 = (MutableScatterSet)object1;
                                Object[] arr_object = mutableScatterSet0.elements;
                                long[] arr_v1 = mutableScatterSet0.metadata;
                                int v6 = arr_v1.length - 2;
                                arr_v2 = arr_v;
                                if(v6 >= 0) {
                                    int v7 = 0;
                                    while(true) {
                                        long v8 = arr_v1[v7];
                                        v9 = v3;
                                        if((~v8 << 7 & v8 & 0x8080808080808080L) == 0x8080808080808080L) {
                                            goto label_43;
                                        }
                                        int v10 = 8 - (~(v7 - v6) >>> 0x1F);
                                        int v11 = 0;
                                        while(v11 < v10) {
                                            if((v8 & 0xFFL) < 0x80L) {
                                                int v12 = (v7 << 3) + v11;
                                                v13 = v1;
                                                if(((Boolean)function10.invoke(arr_object[v12])).booleanValue()) {
                                                    mutableScatterSet0.removeElementAt(v12);
                                                }
                                            }
                                            else {
                                                v13 = v1;
                                            }
                                            v8 >>= 8;
                                            ++v11;
                                            v1 = v13;
                                        }
                                        v14 = v1;
                                        if(v10 == 8) {
                                            goto label_44;
                                        label_43:
                                            v14 = v1;
                                        label_44:
                                            if(v7 != v6) {
                                                ++v7;
                                                v3 = v9;
                                                v1 = v14;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                                else {
                                    v14 = v1;
                                    v9 = v3;
                                }
                                z = mutableScatterSet0.isEmpty();
                            }
                            else {
                                arr_v2 = arr_v;
                                v14 = v1;
                                v9 = v3;
                                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z = ((Boolean)function10.invoke(object1)).booleanValue();
                            }
                            if(z) {
                                mutableScatterMap0.removeValueAt(v5);
                            }
                        }
                        else {
                            arr_v2 = arr_v;
                            v14 = v1;
                            v9 = v3;
                        }
                        v2 >>= 8;
                        ++v4;
                        arr_v = arr_v2;
                        v3 = v9;
                        v1 = v14;
                    }
                    arr_v3 = arr_v;
                    if(v3 != 8) {
                        break;
                    }
                }
                v15 = v1;
                if(v15 == v) {
                    break;
                }
                v1 = v15 + 1;
                arr_v = arr_v3;
            }
        }
    }

    public final void set(@NotNull Object object0, @NotNull Object object1) {
        this.a.set(object0, object1);
    }
}

