package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.DerivedState.Record;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import fg.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class d {
    public final Function1 a;
    public Object b;
    public MutableObjectIntMap c;
    public int d;
    public final ScopeMap e;
    public final MutableScatterMap f;
    public final MutableScatterSet g;
    public final MutableVector h;
    public final SnapshotStateObserver.ObservedScopeMap.derivedStateObserver.1 i;
    public int j;
    public final ScopeMap k;
    public final HashMap l;

    public d(Function1 function10) {
        this.a = function10;
        this.d = -1;
        this.e = new ScopeMap();
        this.f = new MutableScatterMap(0, 1, null);
        this.g = new MutableScatterSet(0, 1, null);
        this.h = new MutableVector(new DerivedState[16], 0);
        this.i = new SnapshotStateObserver.ObservedScopeMap.derivedStateObserver.1(this);
        this.k = new ScopeMap();
        this.l = new HashMap();
    }

    public final void a(Object object0, c c0, Function0 function00) {
        long[] arr_v2;
        long[] arr_v1;
        Object object1 = this.b;
        MutableObjectIntMap mutableObjectIntMap0 = this.c;
        int v = this.d;
        this.b = object0;
        this.c = (MutableObjectIntMap)this.f.get(object0);
        if(this.d == -1) {
            this.d = SnapshotKt.currentSnapshot().getId();
        }
        MutableVector mutableVector0 = SnapshotStateKt.derivedStateObservers();
        try {
            mutableVector0.add(this.i);
            Snapshot.Companion.observe(c0, null, function00);
        }
        finally {
            mutableVector0.removeAt(mutableVector0.getSize() - 1);
        }
        Object object2 = this.b;
        Intrinsics.checkNotNull(object2);
        int v2 = this.d;
        MutableObjectIntMap mutableObjectIntMap1 = this.c;
        if(mutableObjectIntMap1 != null) {
            long[] arr_v = mutableObjectIntMap1.metadata;
            int v3 = arr_v.length - 2;
            if(v3 >= 0) {
                int v4 = 0;
                while(true) {
                    long v5 = arr_v[v4];
                    if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                        arr_v2 = arr_v;
                    }
                    else {
                        int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                        int v7 = 0;
                        while(v7 < v6) {
                            if((v5 & 0xFFL) < 0x80L) {
                                int v8 = (v4 << 3) + v7;
                                Object object3 = mutableObjectIntMap1.keys[v8];
                                arr_v1 = arr_v;
                                boolean z = mutableObjectIntMap1.values[v8] != v2;
                                if(z) {
                                    this.d(object2, object3);
                                }
                                if(z) {
                                    mutableObjectIntMap1.removeValueAt(v8);
                                }
                            }
                            else {
                                arr_v1 = arr_v;
                            }
                            v5 >>= 8;
                            ++v7;
                            arr_v = arr_v1;
                        }
                        arr_v2 = arr_v;
                        if(v6 != 8) {
                            break;
                        }
                    }
                    if(v4 == v3) {
                        break;
                    }
                    ++v4;
                    arr_v = arr_v2;
                }
            }
        }
        this.b = object1;
        this.c = mutableObjectIntMap0;
        this.d = v;
    }

    public final boolean b(Set set0) {
        ScopeMap scopeMap9;
        Object[] arr_object19;
        MutableObjectIntMap mutableObjectIntMap1;
        int v67;
        Object[] arr_object18;
        long[] arr_v16;
        ScopeMap scopeMap8;
        Object[] arr_object17;
        HashMap hashMap6;
        Iterator iterator1;
        Object object13;
        HashMap hashMap8;
        Object object12;
        Object object11;
        HashMap hashMap7;
        int v43;
        Object[] arr_object11;
        long[] arr_v10;
        ScopeMap scopeMap7;
        Iterator iterator2;
        HashMap hashMap3;
        long v24;
        HashMap hashMap2;
        int v23;
        int v22;
        HashMap hashMap1;
        int v17;
        long v14;
        Object[] arr_object3;
        long[] arr_v3;
        int v11;
        int v10;
        ScopeMap scopeMap3;
        int v7;
        int v6;
        Object[] arr_object1;
        long[] arr_v1;
        boolean z;
        HashMap hashMap0 = this.l;
        MutableVector mutableVector0 = this.h;
        ScopeMap scopeMap0 = this.k;
        ScopeMap scopeMap1 = this.e;
        MutableScatterSet mutableScatterSet0 = this.g;
        if(set0 instanceof ScatterSetWrapper) {
            ScatterSet scatterSet0 = ((ScatterSetWrapper)set0).getSet$runtime_release();
            Object[] arr_object = scatterSet0.elements;
            long[] arr_v = scatterSet0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                ScopeMap scopeMap2 = scopeMap0;
                int v1 = 0;
                z = false;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_252;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(object0 instanceof StateObjectImpl) {
                                arr_v1 = arr_v;
                                if(((StateObjectImpl)object0).isReadIn-h_f27i8$runtime_release(2)) {
                                    goto label_26;
                                }
                                else {
                                    goto label_227;
                                }
                                goto label_25;
                            }
                            else {
                            label_25:
                                arr_v1 = arr_v;
                            }
                        label_26:
                            if(scopeMap2.contains(object0)) {
                                Object object1 = scopeMap2.getMap().get(object0);
                                if(object1 == null) {
                                    goto label_192;
                                }
                                else {
                                    arr_object1 = arr_object;
                                    if(object1 instanceof MutableScatterSet) {
                                        Object[] arr_object2 = ((MutableScatterSet)object1).elements;
                                        long[] arr_v2 = ((MutableScatterSet)object1).metadata;
                                        int v5 = arr_v2.length - 2;
                                        if(v5 >= 0) {
                                            v6 = v;
                                            v7 = v1;
                                            scopeMap3 = scopeMap2;
                                            int v8 = 0;
                                            while(true) {
                                                long v9 = arr_v2[v8];
                                                v10 = v3;
                                                v11 = v4;
                                                if((~v9 << 7 & v9 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                    goto label_129;
                                                }
                                                int v12 = 8 - (~(v8 - v5) >>> 0x1F);
                                                int v13 = 0;
                                                while(v13 < v12) {
                                                    if((v9 & 0xFFL) < 0x80L) {
                                                        arr_v3 = arr_v2;
                                                        DerivedState derivedState0 = (DerivedState)arr_object2[(v8 << 3) + v13];
                                                        Intrinsics.checkNotNull(derivedState0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                        arr_object3 = arr_object2;
                                                        Object object2 = hashMap0.get(derivedState0);
                                                        SnapshotMutationPolicy snapshotMutationPolicy0 = derivedState0.getPolicy();
                                                        if(snapshotMutationPolicy0 == null) {
                                                            snapshotMutationPolicy0 = SnapshotStateKt.structuralEqualityPolicy();
                                                        }
                                                        v14 = v2;
                                                        if(snapshotMutationPolicy0.equivalent(derivedState0.getCurrentRecord().getCurrentValue(), object2)) {
                                                            hashMap1 = hashMap0;
                                                            v23 = v8;
                                                            v17 = v12;
                                                            mutableVector0.add(derivedState0);
                                                        }
                                                        else {
                                                            Object object3 = scopeMap1.getMap().get(derivedState0);
                                                            if(object3 == null) {
                                                            label_98:
                                                                hashMap1 = hashMap0;
                                                                v23 = v8;
                                                                v17 = v12;
                                                            }
                                                            else if(object3 instanceof MutableScatterSet) {
                                                                Object[] arr_object4 = ((MutableScatterSet)object3).elements;
                                                                long[] arr_v4 = ((MutableScatterSet)object3).metadata;
                                                                int v15 = arr_v4.length - 2;
                                                                if(v15 >= 0) {
                                                                    int v16 = v8;
                                                                    v17 = v12;
                                                                    int v18 = 0;
                                                                    while(true) {
                                                                        long v19 = arr_v4[v18];
                                                                        hashMap1 = hashMap0;
                                                                        if((~v19 << 7 & v19 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                                            goto label_86;
                                                                        }
                                                                        int v20 = 8 - (~(v18 - v15) >>> 0x1F);
                                                                        int v21 = 0;
                                                                        while(v21 < v20) {
                                                                            if((v19 & 0xFFL) < 0x80L) {
                                                                                v22 = v16;
                                                                                mutableScatterSet0.add(arr_object4[(v18 << 3) + v21]);
                                                                                z = true;
                                                                            }
                                                                            else {
                                                                                v22 = v16;
                                                                            }
                                                                            v19 >>= 8;
                                                                            ++v21;
                                                                            v16 = v22;
                                                                        }
                                                                        v23 = v16;
                                                                        if(v20 == 8) {
                                                                            goto label_87;
                                                                        label_86:
                                                                            v23 = v16;
                                                                        label_87:
                                                                            if(v18 != v15) {
                                                                                ++v18;
                                                                                hashMap0 = hashMap1;
                                                                                v16 = v23;
                                                                                continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                else {
                                                                    goto label_98;
                                                                }
                                                            }
                                                            else {
                                                                hashMap1 = hashMap0;
                                                                v23 = v8;
                                                                v17 = v12;
                                                                mutableScatterSet0.add(object3);
                                                                z = true;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        arr_v3 = arr_v2;
                                                        hashMap1 = hashMap0;
                                                        arr_object3 = arr_object2;
                                                        v23 = v8;
                                                        v17 = v12;
                                                        v14 = v2;
                                                    }
                                                    v9 >>= 8;
                                                    ++v13;
                                                    arr_object2 = arr_object3;
                                                    arr_v2 = arr_v3;
                                                    v12 = v17;
                                                    v2 = v14;
                                                    hashMap0 = hashMap1;
                                                    v8 = v23;
                                                }
                                                long[] arr_v5 = arr_v2;
                                                hashMap2 = hashMap0;
                                                Object[] arr_object5 = arr_object2;
                                                v24 = v2;
                                                if(v12 == 8) {
                                                    int v25 = v8;
                                                    goto label_134;
                                                label_129:
                                                    arr_v5 = arr_v2;
                                                    hashMap2 = hashMap0;
                                                    arr_object5 = arr_object2;
                                                    v24 = v2;
                                                    v25 = v8;
                                                label_134:
                                                    if(v25 != v5) {
                                                        v8 = v25 + 1;
                                                        v3 = v10;
                                                        v4 = v11;
                                                        arr_object2 = arr_object5;
                                                        arr_v2 = arr_v5;
                                                        v2 = v24;
                                                        hashMap0 = hashMap2;
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        else {
                                            hashMap2 = hashMap0;
                                            v6 = v;
                                            v7 = v1;
                                            scopeMap3 = scopeMap2;
                                            v10 = v3;
                                            v11 = v4;
                                            v24 = v2;
                                        }
                                        hashMap3 = hashMap2;
                                    }
                                    else {
                                        v6 = v;
                                        v7 = v1;
                                        scopeMap3 = scopeMap2;
                                        v10 = v3;
                                        v11 = v4;
                                        v24 = v2;
                                        hashMap3 = hashMap0;
                                        Object object4 = hashMap3.get(((DerivedState)object1));
                                        SnapshotMutationPolicy snapshotMutationPolicy1 = ((DerivedState)object1).getPolicy();
                                        if(snapshotMutationPolicy1 == null) {
                                            snapshotMutationPolicy1 = SnapshotStateKt.structuralEqualityPolicy();
                                        }
                                        if(snapshotMutationPolicy1.equivalent(((DerivedState)object1).getCurrentRecord().getCurrentValue(), object4)) {
                                            mutableVector0.add(((DerivedState)object1));
                                        }
                                        else {
                                            Object object5 = scopeMap1.getMap().get(((DerivedState)object1));
                                            if(object5 != null) {
                                                if(object5 instanceof MutableScatterSet) {
                                                    Object[] arr_object6 = ((MutableScatterSet)object5).elements;
                                                    long[] arr_v6 = ((MutableScatterSet)object5).metadata;
                                                    int v26 = arr_v6.length - 2;
                                                    if(v26 >= 0) {
                                                        int v27 = 0;
                                                        while(true) {
                                                            long v28 = arr_v6[v27];
                                                            if((~v28 << 7 & v28 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                                goto label_184;
                                                            }
                                                            int v29 = 8 - (~(v27 - v26) >>> 0x1F);
                                                            for(int v30 = 0; v30 < v29; ++v30) {
                                                                if((v28 & 0xFFL) < 0x80L) {
                                                                    mutableScatterSet0.add(arr_object6[(v27 << 3) + v30]);
                                                                    z = true;
                                                                }
                                                                v28 >>= 8;
                                                            }
                                                            if(v29 == 8) {
                                                            label_184:
                                                                if(v27 != v26) {
                                                                    ++v27;
                                                                    continue;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    mutableScatterSet0.add(object5);
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                            label_192:
                                hashMap3 = hashMap0;
                                arr_object1 = arr_object;
                                v6 = v;
                                v7 = v1;
                                scopeMap3 = scopeMap2;
                                v10 = v3;
                                v11 = v4;
                                v24 = v2;
                            }
                            Object object6 = scopeMap1.getMap().get(object0);
                            if(object6 != null) {
                                if(object6 instanceof MutableScatterSet) {
                                    Object[] arr_object7 = ((MutableScatterSet)object6).elements;
                                    long[] arr_v7 = ((MutableScatterSet)object6).metadata;
                                    int v31 = arr_v7.length - 2;
                                    if(v31 >= 0) {
                                        int v32 = 0;
                                        while(true) {
                                            long v33 = arr_v7[v32];
                                            if((~v33 << 7 & v33 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                goto label_220;
                                            }
                                            int v34 = 8 - (~(v32 - v31) >>> 0x1F);
                                            for(int v35 = 0; v35 < v34; ++v35) {
                                                if((v33 & 0xFFL) < 0x80L) {
                                                    mutableScatterSet0.add(arr_object7[(v32 << 3) + v35]);
                                                    z = true;
                                                }
                                                v33 >>= 8;
                                            }
                                            if(v34 == 8) {
                                            label_220:
                                                if(v32 != v31) {
                                                    ++v32;
                                                    continue;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                                else {
                                    mutableScatterSet0.add(object6);
                                    z = true;
                                }
                            }
                        }
                        else {
                            arr_v1 = arr_v;
                        label_227:
                            hashMap3 = hashMap0;
                            v6 = v;
                            v7 = v1;
                            v10 = v3;
                            v11 = v4;
                            v24 = v2;
                            scopeMap3 = scopeMap2;
                            arr_object1 = arr_object;
                        }
                        v2 = v24 >> 8;
                        v4 = v11 + 1;
                        v = v6;
                        hashMap0 = hashMap3;
                        arr_object = arr_object1;
                        arr_v = arr_v1;
                        scopeMap2 = scopeMap3;
                        v1 = v7;
                        v3 = v10;
                    }
                    long[] arr_v8 = arr_v;
                    HashMap hashMap4 = hashMap0;
                    ScopeMap scopeMap4 = scopeMap2;
                    Object[] arr_object8 = arr_object;
                    if(v3 == 8) {
                        int v36 = v1;
                        goto label_257;
                    label_252:
                        arr_v8 = arr_v;
                        hashMap4 = hashMap0;
                        scopeMap4 = scopeMap2;
                        arr_object8 = arr_object;
                        v36 = v1;
                    label_257:
                        if(v36 != v) {
                            v1 = v36 + 1;
                            hashMap0 = hashMap4;
                            arr_object = arr_object8;
                            arr_v = arr_v8;
                            scopeMap2 = scopeMap4;
                            continue;
                        }
                    }
                    break;
                }
            }
            else {
                z = false;
            }
        }
        else {
            HashMap hashMap5 = hashMap0;
            ScopeMap scopeMap5 = scopeMap0;
            boolean z1 = false;
            Iterator iterator0 = set0.iterator();
            while(iterator0.hasNext()) {
                Object object7 = iterator0.next();
                if(!(object7 instanceof StateObjectImpl) || ((StateObjectImpl)object7).isReadIn-h_f27i8$runtime_release(2)) {
                    ScopeMap scopeMap6 = scopeMap5;
                    if(scopeMap6.contains(object7)) {
                        Object object8 = scopeMap6.getMap().get(object7);
                        if(object8 == null) {
                            iterator1 = iterator0;
                            object13 = object7;
                            scopeMap5 = scopeMap6;
                            hashMap6 = hashMap5;
                        }
                        else if(object8 instanceof MutableScatterSet) {
                            Object[] arr_object9 = ((MutableScatterSet)object8).elements;
                            long[] arr_v9 = ((MutableScatterSet)object8).metadata;
                            int v37 = arr_v9.length - 2;
                            if(v37 >= 0) {
                                int v38 = 0;
                                while(true) {
                                    long v39 = arr_v9[v38];
                                    if((~v39 << 7 & v39 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_382;
                                    }
                                    int v40 = 8 - (~(v38 - v37) >>> 0x1F);
                                    int v41 = 0;
                                    while(v41 < v40) {
                                        if((v39 & 0xFFL) < 0x80L) {
                                            iterator2 = iterator0;
                                            DerivedState derivedState1 = (DerivedState)arr_object9[(v38 << 3) + v41];
                                            boolean z2 = z1;
                                            Intrinsics.checkNotNull(derivedState1, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                            Object object9 = hashMap5.get(derivedState1);
                                            SnapshotMutationPolicy snapshotMutationPolicy2 = derivedState1.getPolicy();
                                            if(snapshotMutationPolicy2 == null) {
                                                snapshotMutationPolicy2 = SnapshotStateKt.structuralEqualityPolicy();
                                            }
                                            scopeMap7 = scopeMap6;
                                            arr_v10 = arr_v9;
                                            if(snapshotMutationPolicy2.equivalent(derivedState1.getCurrentRecord().getCurrentValue(), object9)) {
                                                hashMap7 = hashMap5;
                                                object12 = object7;
                                                arr_object11 = arr_object9;
                                                v43 = v37;
                                                mutableVector0.add(derivedState1);
                                            }
                                            else {
                                                Object object10 = scopeMap1.getMap().get(derivedState1);
                                                if(object10 == null) {
                                                label_345:
                                                    hashMap7 = hashMap5;
                                                    object12 = object7;
                                                    arr_object11 = arr_object9;
                                                    v43 = v37;
                                                }
                                                else if(object10 instanceof MutableScatterSet) {
                                                    Object[] arr_object10 = ((MutableScatterSet)object10).elements;
                                                    long[] arr_v11 = ((MutableScatterSet)object10).metadata;
                                                    int v42 = arr_v11.length - 2;
                                                    if(v42 >= 0) {
                                                        arr_object11 = arr_object9;
                                                        v43 = v37;
                                                        int v44 = 0;
                                                        while(true) {
                                                            long v45 = arr_v11[v44];
                                                            hashMap7 = hashMap5;
                                                            if((~v45 << 7 & v45 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                                goto label_332;
                                                            }
                                                            int v46 = 8 - (~(v44 - v42) >>> 0x1F);
                                                            int v47 = 0;
                                                            while(v47 < v46) {
                                                                if((v45 & 0xFFL) < 0x80L) {
                                                                    object11 = object7;
                                                                    mutableScatterSet0.add(arr_object10[(v44 << 3) + v47]);
                                                                    z2 = true;
                                                                }
                                                                else {
                                                                    object11 = object7;
                                                                }
                                                                v45 >>= 8;
                                                                ++v47;
                                                                object7 = object11;
                                                            }
                                                            object12 = object7;
                                                            if(v46 == 8) {
                                                                goto label_333;
                                                            label_332:
                                                                object12 = object7;
                                                            label_333:
                                                                if(v44 != v42) {
                                                                    ++v44;
                                                                    object7 = object12;
                                                                    hashMap5 = hashMap7;
                                                                    continue;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    else {
                                                        goto label_345;
                                                    }
                                                }
                                                else {
                                                    hashMap7 = hashMap5;
                                                    object12 = object7;
                                                    arr_object11 = arr_object9;
                                                    v43 = v37;
                                                    mutableScatterSet0.add(object10);
                                                    z1 = true;
                                                    goto label_364;
                                                }
                                            }
                                            z1 = z2;
                                        }
                                        else {
                                            hashMap7 = hashMap5;
                                            iterator2 = iterator0;
                                            object12 = object7;
                                            scopeMap7 = scopeMap6;
                                            arr_v10 = arr_v9;
                                            arr_object11 = arr_object9;
                                            v43 = v37;
                                        }
                                    label_364:
                                        v39 >>= 8;
                                        ++v41;
                                        iterator0 = iterator2;
                                        arr_object9 = arr_object11;
                                        arr_v9 = arr_v10;
                                        scopeMap6 = scopeMap7;
                                        v37 = v43;
                                        object7 = object12;
                                        hashMap5 = hashMap7;
                                    }
                                    hashMap8 = hashMap5;
                                    iterator1 = iterator0;
                                    object13 = object7;
                                    scopeMap5 = scopeMap6;
                                    long[] arr_v12 = arr_v9;
                                    Object[] arr_object12 = arr_object9;
                                    if(v40 == 8) {
                                        goto label_388;
                                    label_382:
                                        hashMap8 = hashMap5;
                                        iterator1 = iterator0;
                                        object13 = object7;
                                        scopeMap5 = scopeMap6;
                                        arr_v12 = arr_v9;
                                        arr_object12 = arr_object9;
                                    label_388:
                                        if(v38 != v37) {
                                            ++v38;
                                            iterator0 = iterator1;
                                            arr_object9 = arr_object12;
                                            arr_v9 = arr_v12;
                                            scopeMap6 = scopeMap5;
                                            object7 = object13;
                                            hashMap5 = hashMap8;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                hashMap8 = hashMap5;
                                iterator1 = iterator0;
                                object13 = object7;
                                scopeMap5 = scopeMap6;
                            }
                            hashMap6 = hashMap8;
                        }
                        else {
                            iterator1 = iterator0;
                            boolean z3 = z1;
                            object13 = object7;
                            scopeMap5 = scopeMap6;
                            hashMap6 = hashMap5;
                            Object object14 = hashMap6.get(((DerivedState)object8));
                            SnapshotMutationPolicy snapshotMutationPolicy3 = ((DerivedState)object8).getPolicy();
                            if(snapshotMutationPolicy3 == null) {
                                snapshotMutationPolicy3 = SnapshotStateKt.structuralEqualityPolicy();
                            }
                            if(snapshotMutationPolicy3.equivalent(((DerivedState)object8).getCurrentRecord().getCurrentValue(), object14)) {
                                mutableVector0.add(((DerivedState)object8));
                            }
                            else {
                                Object object15 = scopeMap1.getMap().get(((DerivedState)object8));
                                if(object15 != null) {
                                    if(object15 instanceof MutableScatterSet) {
                                        Object[] arr_object13 = ((MutableScatterSet)object15).elements;
                                        long[] arr_v13 = ((MutableScatterSet)object15).metadata;
                                        int v48 = arr_v13.length - 2;
                                        if(v48 >= 0) {
                                            int v49 = 0;
                                            while(true) {
                                                long v50 = arr_v13[v49];
                                                if((~v50 << 7 & v50 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                    goto label_433;
                                                }
                                                int v51 = 8 - (~(v49 - v48) >>> 0x1F);
                                                for(int v52 = 0; v52 < v51; ++v52) {
                                                    if((v50 & 0xFFL) < 0x80L) {
                                                        mutableScatterSet0.add(arr_object13[(v49 << 3) + v52]);
                                                        z3 = true;
                                                    }
                                                    v50 >>= 8;
                                                }
                                                if(v51 == 8) {
                                                label_433:
                                                    if(v49 != v48) {
                                                        ++v49;
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        mutableScatterSet0.add(object15);
                                        z3 = true;
                                    }
                                }
                            }
                            z1 = z3;
                        }
                    }
                    else {
                        iterator1 = iterator0;
                        object13 = object7;
                        scopeMap5 = scopeMap6;
                        hashMap6 = hashMap5;
                    }
                    boolean z4 = z1;
                    Object object16 = scopeMap1.getMap().get(object13);
                    if(object16 != null) {
                        if(object16 instanceof MutableScatterSet) {
                            Object[] arr_object14 = ((MutableScatterSet)object16).elements;
                            long[] arr_v14 = ((MutableScatterSet)object16).metadata;
                            int v53 = arr_v14.length - 2;
                            if(v53 >= 0) {
                                int v54 = 0;
                                while(true) {
                                    long v55 = arr_v14[v54];
                                    if((~v55 << 7 & v55 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_472;
                                    }
                                    int v56 = 8 - (~(v54 - v53) >>> 0x1F);
                                    for(int v57 = 0; v57 < v56; ++v57) {
                                        if((v55 & 0xFFL) < 0x80L) {
                                            mutableScatterSet0.add(arr_object14[(v54 << 3) + v57]);
                                            z4 = true;
                                        }
                                        v55 >>= 8;
                                    }
                                    if(v56 == 8) {
                                    label_472:
                                        if(v54 != v53) {
                                            ++v54;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        else {
                            mutableScatterSet0.add(object16);
                            z4 = true;
                        }
                    }
                    z1 = z4;
                }
                else {
                    iterator1 = iterator0;
                    hashMap6 = hashMap5;
                }
                hashMap5 = hashMap6;
                iterator0 = iterator1;
            }
            z = z1;
        }
        if(mutableVector0.isNotEmpty()) {
            int v58 = mutableVector0.getSize();
            if(v58 > 0) {
                Object[] arr_object15 = mutableVector0.getContent();
                int v59 = 0;
                while(true) {
                    DerivedState derivedState2 = (DerivedState)arr_object15[v59];
                    int v60 = SnapshotKt.currentSnapshot().getId();
                    Object object17 = scopeMap1.getMap().get(derivedState2);
                    if(object17 == null) {
                        arr_object19 = arr_object15;
                        scopeMap9 = scopeMap1;
                    }
                    else {
                        MutableScatterMap mutableScatterMap0 = this.f;
                        if(object17 instanceof MutableScatterSet) {
                            Object[] arr_object16 = ((MutableScatterSet)object17).elements;
                            long[] arr_v15 = ((MutableScatterSet)object17).metadata;
                            int v61 = arr_v15.length - 2;
                            if(v61 >= 0) {
                                int v62 = 0;
                                while(true) {
                                    long v63 = arr_v15[v62];
                                    int v64 = v62;
                                    if((~v63 << 7 & v63 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_542;
                                    }
                                    int v65 = 8 - (~(v64 - v61) >>> 0x1F);
                                    int v66 = 0;
                                    while(v66 < v65) {
                                        if((v63 & 0xFFL) < 0x80L) {
                                            arr_object17 = arr_object15;
                                            Object object18 = arr_object16[(v64 << 3) + v66];
                                            MutableObjectIntMap mutableObjectIntMap0 = (MutableObjectIntMap)mutableScatterMap0.get(object18);
                                            scopeMap8 = scopeMap1;
                                            if(mutableObjectIntMap0 == null) {
                                                arr_v16 = arr_v15;
                                                arr_object18 = arr_object16;
                                                v67 = v64;
                                                mutableObjectIntMap1 = new MutableObjectIntMap(0, 1, null);
                                                mutableScatterMap0.set(object18, mutableObjectIntMap1);
                                            }
                                            else {
                                                arr_v16 = arr_v15;
                                                arr_object18 = arr_object16;
                                                v67 = v64;
                                                mutableObjectIntMap1 = mutableObjectIntMap0;
                                            }
                                            this.c(derivedState2, v60, object18, mutableObjectIntMap1);
                                        }
                                        else {
                                            arr_object17 = arr_object15;
                                            scopeMap8 = scopeMap1;
                                            arr_v16 = arr_v15;
                                            arr_object18 = arr_object16;
                                            v67 = v64;
                                        }
                                        v63 >>= 8;
                                        ++v66;
                                        arr_object15 = arr_object17;
                                        scopeMap1 = scopeMap8;
                                        arr_v15 = arr_v16;
                                        arr_object16 = arr_object18;
                                        v64 = v67;
                                    }
                                    arr_object19 = arr_object15;
                                    scopeMap9 = scopeMap1;
                                    long[] arr_v17 = arr_v15;
                                    Object[] arr_object20 = arr_object16;
                                    if(v65 == 8) {
                                        int v68 = v64;
                                        goto label_547;
                                    label_542:
                                        arr_object19 = arr_object15;
                                        scopeMap9 = scopeMap1;
                                        arr_v17 = arr_v15;
                                        arr_object20 = arr_object16;
                                        v68 = v64;
                                    label_547:
                                        if(v68 != v61) {
                                            v62 = v68 + 1;
                                            arr_object15 = arr_object19;
                                            scopeMap1 = scopeMap9;
                                            arr_v15 = arr_v17;
                                            arr_object16 = arr_object20;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                arr_object19 = arr_object15;
                                scopeMap9 = scopeMap1;
                            }
                        }
                        else {
                            arr_object19 = arr_object15;
                            scopeMap9 = scopeMap1;
                            MutableObjectIntMap mutableObjectIntMap2 = (MutableObjectIntMap)mutableScatterMap0.get(object17);
                            if(mutableObjectIntMap2 == null) {
                                mutableObjectIntMap2 = new MutableObjectIntMap(0, 1, null);
                                mutableScatterMap0.set(object17, mutableObjectIntMap2);
                            }
                            this.c(derivedState2, v60, object17, mutableObjectIntMap2);
                        }
                    }
                    ++v59;
                    if(v59 >= v58) {
                        break;
                    }
                    arr_object15 = arr_object19;
                    scopeMap1 = scopeMap9;
                }
            }
            mutableVector0.clear();
        }
        return z;
    }

    public final void c(Object object0, int v, Object object1, MutableObjectIntMap mutableObjectIntMap0) {
        if(this.j > 0) {
            return;
        }
        int v1 = mutableObjectIntMap0.put(object0, v, -1);
        if(!(object0 instanceof DerivedState) || v1 == v) {
        label_32:
            if(v1 == -1) {
                if(object0 instanceof StateObjectImpl) {
                    ((StateObjectImpl)object0).recordReadIn-h_f27i8$runtime_release(2);
                }
                this.e.add(object0, object1);
            }
        }
        else {
            Record derivedState$Record0 = ((DerivedState)object0).getCurrentRecord();
            Object object2 = derivedState$Record0.getCurrentValue();
            this.l.put(object0, object2);
            ObjectIntMap objectIntMap0 = derivedState$Record0.getDependencies();
            ScopeMap scopeMap0 = this.k;
            scopeMap0.removeScope(object0);
            Object[] arr_object = objectIntMap0.keys;
            long[] arr_v = objectIntMap0.metadata;
            int v2 = arr_v.length - 2;
            if(v2 >= 0) {
                int v3 = 0;
                while(true) {
                    long v4 = arr_v[v3];
                    if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_29;
                    }
                    int v5 = 8 - (~(v3 - v2) >>> 0x1F);
                    for(int v6 = 0; v6 < v5; ++v6) {
                        if((v4 & 0xFFL) < 0x80L) {
                            StateObject stateObject0 = (StateObject)arr_object[(v3 << 3) + v6];
                            if(stateObject0 instanceof StateObjectImpl) {
                                ((StateObjectImpl)stateObject0).recordReadIn-h_f27i8$runtime_release(2);
                            }
                            scopeMap0.add(stateObject0, object0);
                        }
                        v4 >>= 8;
                    }
                    if(v5 == 8) {
                    label_29:
                        if(v3 != v2) {
                            ++v3;
                            continue;
                        }
                    }
                    goto label_32;
                }
            }
            else {
                goto label_32;
            }
        }
    }

    public final void d(Object object0, Object object1) {
        this.e.remove(object1, object0);
        if(object1 instanceof DerivedState && !this.e.contains(object1)) {
            this.k.removeScope(object1);
            this.l.remove(object1);
        }
    }

    public final void e(Function1 function10) {
        int v16;
        long[] arr_v4;
        long v11;
        int v10;
        int v7;
        long[] arr_v3;
        MutableScatterMap mutableScatterMap0 = this.f;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v4 = arr_v;
                }
                else {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object0 = mutableScatterMap0.keys[v5];
                            MutableObjectIntMap mutableObjectIntMap0 = (MutableObjectIntMap)mutableScatterMap0.values[v5];
                            Boolean boolean0 = (Boolean)function10.invoke(object0);
                            if(boolean0.booleanValue()) {
                                Object[] arr_object = mutableObjectIntMap0.keys;
                                int[] arr_v1 = mutableObjectIntMap0.values;
                                long[] arr_v2 = mutableObjectIntMap0.metadata;
                                int v6 = arr_v2.length - 2;
                                arr_v3 = arr_v;
                                if(v6 >= 0) {
                                    v7 = v3;
                                    int v8 = 0;
                                    while(true) {
                                        long v9 = arr_v2[v8];
                                        v10 = v1;
                                        v11 = v2;
                                        if((~v9 << 7 & v9 & 0x8080808080808080L) == 0x8080808080808080L) {
                                            goto label_40;
                                        }
                                        int v12 = 8 - (~(v8 - v6) >>> 0x1F);
                                        for(int v13 = 0; v13 < v12; ++v13) {
                                            if((v9 & 0xFFL) < 0x80L) {
                                                int v14 = (v8 << 3) + v13;
                                                Object object1 = arr_object[v14];
                                                int v15 = arr_v1[v14];
                                                this.d(object0, object1);
                                            }
                                            v9 >>= 8;
                                        }
                                        if(v12 == 8) {
                                        label_40:
                                            if(v8 != v6) {
                                                ++v8;
                                                v1 = v10;
                                                v2 = v11;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                                else {
                                    v10 = v1;
                                    v11 = v2;
                                    v7 = v3;
                                }
                            }
                            else {
                                arr_v3 = arr_v;
                                v10 = v1;
                                v11 = v2;
                                v7 = v3;
                            }
                            if(boolean0.booleanValue()) {
                                mutableScatterMap0.removeValueAt(v5);
                            }
                        }
                        else {
                            arr_v3 = arr_v;
                            v10 = v1;
                            v11 = v2;
                            v7 = v3;
                        }
                        v2 = v11 >> 8;
                        ++v4;
                        arr_v = arr_v3;
                        v3 = v7;
                        v1 = v10;
                    }
                    arr_v4 = arr_v;
                    if(v3 != 8) {
                        break;
                    }
                }
                v16 = v1;
                if(v16 == v) {
                    break;
                }
                v1 = v16 + 1;
                arr_v = arr_v4;
            }
        }
    }
}

