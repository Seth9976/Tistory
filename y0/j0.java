package y0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function1 {
    public final List A;
    public final MutableScatterSet B;
    public final List C;
    public final MutableScatterSet D;
    public final Set E;
    public final Recomposer w;
    public final MutableScatterSet x;
    public final MutableScatterSet y;
    public final List z;

    public j0(Recomposer recomposer0, MutableScatterSet mutableScatterSet0, MutableScatterSet mutableScatterSet1, List list0, List list1, MutableScatterSet mutableScatterSet2, List list2, MutableScatterSet mutableScatterSet3, Set set0) {
        this.w = recomposer0;
        this.x = mutableScatterSet0;
        this.y = mutableScatterSet1;
        this.z = list0;
        this.A = list1;
        this.B = mutableScatterSet2;
        this.C = list2;
        this.D = mutableScatterSet3;
        this.E = set0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Set set2;
        Set set1;
        MutableScatterSet mutableScatterSet9;
        MutableScatterSet mutableScatterSet8;
        ControlledComposition controlledComposition0;
        int v21;
        MutableScatterSet mutableScatterSet7;
        MutableScatterSet mutableScatterSet6;
        Trace trace1;
        Object object5;
        long v15;
        int v14;
        int v13;
        Object[] arr_object2;
        long v9;
        int v8;
        int v7;
        Object[] arr_object1;
        MutableScatterSet mutableScatterSet5;
        MutableScatterSet mutableScatterSet4;
        Object object4;
        Object object3;
        long v = ((Number)object0).longValue();
        if(Recomposer.access$getHasBroadcastFrameClockAwaiters(this.w)) {
            Trace trace0 = Trace.INSTANCE;
            Object object1 = trace0.beginSection("Recomposer:animation");
            try {
                this.w.b.sendFrame(v);
                Snapshot.Companion.sendApplyNotifications();
            }
            catch(Throwable throwable0) {
                Trace.INSTANCE.endSection(object1);
                throw throwable0;
            }
            trace0.endSection(object1);
        }
        Recomposer recomposer0 = this.w;
        MutableScatterSet mutableScatterSet0 = this.x;
        MutableScatterSet mutableScatterSet1 = this.y;
        List list0 = this.z;
        List list1 = this.A;
        MutableScatterSet mutableScatterSet2 = this.B;
        List list2 = this.C;
        MutableScatterSet mutableScatterSet3 = this.D;
        Set set0 = this.E;
        Object object2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            Recomposer.access$recordComposerModifications(recomposer0);
            object3 = recomposer0.c;
            __monitor_enter(object3);
        }
        catch(Throwable throwable1) {
            object4 = object2;
            Trace.INSTANCE.endSection(object4);
            throw throwable1;
        }
        try {
            MutableVector mutableVector0 = recomposer0.i;
            int v1 = mutableVector0.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v2 = 0;
                while(true) {
                    list0.add(((ControlledComposition)arr_object[v2]));
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
            recomposer0.i.clear();
        }
        catch(Throwable throwable2) {
            try {
                object4 = object2;
                __monitor_exit(object3);
                throw throwable2;
            }
            catch(Throwable throwable1) {
                Trace.INSTANCE.endSection(object4);
                throw throwable1;
            }
        }
        try {
            __monitor_exit(object3);
            mutableScatterSet0.clear();
            mutableScatterSet1.clear();
            while(true) {
            label_41:
                if(list0.isEmpty() && list1.isEmpty()) {
                    if(!list2.isEmpty()) {
                        recomposer0.a = recomposer0.getChangeCount() + 1L;
                        break;
                    }
                    goto label_66;
                }
                goto label_176;
            }
        }
        catch(Throwable throwable1) {
            object4 = object2;
            Trace.INSTANCE.endSection(object4);
            throw throwable1;
        }
        try {
            try {
                int v3 = list2.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    mutableScatterSet3.add(((ControlledComposition)list2.get(v4)));
                }
                int v5 = list2.size();
                int v6 = 0;
                while(true) {
                    if(v6 >= v5) {
                        goto label_65;
                    }
                    ((ControlledComposition)list2.get(v6)).applyChanges();
                    ++v6;
                }
            }
            catch(Exception exception0) {
            }
            Recomposer.j(recomposer0, exception0, false, 6);
            k0.a(recomposer0, list0, list1, list2, mutableScatterSet2, mutableScatterSet3, mutableScatterSet0, mutableScatterSet1);
        }
        catch(Throwable throwable3) {
            goto label_63;
        }
        try {
            list2.clear();
            goto label_107;
        label_63:
            list2.clear();
            throw throwable3;
        label_65:
            list2.clear();
        label_66:
            if(!mutableScatterSet2.isNotEmpty()) {
                mutableScatterSet4 = mutableScatterSet0;
                mutableScatterSet5 = mutableScatterSet1;
                goto label_113;
            }
        }
        catch(Throwable throwable1) {
            object4 = object2;
            Trace.INSTANCE.endSection(object4);
            throw throwable1;
        }
        try {
            mutableScatterSet3.plusAssign(mutableScatterSet2);
            arr_object1 = mutableScatterSet2.elements;
            long[] arr_v = mutableScatterSet2.metadata;
            v7 = arr_v.length - 2;
            if(v7 >= 0) {
                v8 = 0;
                while(true) {
                label_76:
                    v9 = arr_v[v8];
                    mutableScatterSet4 = mutableScatterSet0;
                    mutableScatterSet5 = mutableScatterSet1;
                    if((~v9 << 7 & v9 & 0x8080808080808080L) != 0x8080808080808080L) {
                        goto label_80;
                    }
                    goto label_93;
                }
            }
            else {
                mutableScatterSet4 = mutableScatterSet0;
                mutableScatterSet5 = mutableScatterSet1;
            }
            goto label_112;
        }
        catch(Exception exception1) {
            goto label_102;
        }
        catch(Throwable throwable4) {
            goto label_110;
        }
    label_80:
        int v10 = 8 - (~(v8 - v7) >>> 0x1F);
        long v11 = v9;
        int v12 = 0;
        while(v12 < v10) {
            if((v11 & 0xFFL) < 0x80L) {
                try {
                    ((ControlledComposition)arr_object1[(v8 << 3) + v12]).applyLateChanges();
                    goto label_89;
                }
                catch(Exception exception1) {
                }
                catch(Throwable throwable4) {
                    goto label_110;
                }
                goto label_104;
            }
        label_89:
            v11 >>= 8;
            ++v12;
        }
        if(v10 == 8) {
        label_93:
            if(v8 != v7) {
                try {
                    ++v8;
                    mutableScatterSet0 = mutableScatterSet4;
                    mutableScatterSet1 = mutableScatterSet5;
                    goto label_76;
                }
                catch(Exception exception1) {
                label_102:
                    mutableScatterSet4 = mutableScatterSet0;
                    mutableScatterSet5 = mutableScatterSet1;
                    try {
                    label_104:
                        Recomposer.j(recomposer0, exception1, false, 6);
                        k0.a(recomposer0, list0, list1, list2, mutableScatterSet2, mutableScatterSet3, mutableScatterSet4, mutableScatterSet5);
                    }
                    catch(Throwable throwable4) {
                        goto label_110;
                    }
                    try {
                        mutableScatterSet2.clear();
                    }
                    catch(Throwable throwable1) {
                        object4 = object2;
                        Trace.INSTANCE.endSection(object4);
                        throw throwable1;
                    }
                label_107:
                    Trace.INSTANCE.endSection(object2);
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable4) {
                    try {
                    label_110:
                        mutableScatterSet2.clear();
                        throw throwable4;
                    label_112:
                        mutableScatterSet2.clear();
                    label_113:
                        if(mutableScatterSet3.isNotEmpty()) {
                            goto label_114;
                        }
                        else {
                            goto label_163;
                        }
                        goto label_164;
                    }
                    catch(Throwable throwable1) {
                        object4 = object2;
                        Trace.INSTANCE.endSection(object4);
                        throw throwable1;
                    }
                }
            }
        }
        goto label_112;
        try {
        label_114:
            arr_object2 = mutableScatterSet3.elements;
            long[] arr_v1 = mutableScatterSet3.metadata;
            v13 = arr_v1.length - 2;
            if(v13 >= 0) {
                v14 = 0;
                while(true) {
                label_119:
                    v15 = arr_v1[v14];
                    object5 = object2;
                    if((~v15 << 7 & v15 & 0x8080808080808080L) != 0x8080808080808080L) {
                        goto label_122;
                    }
                    goto label_135;
                }
            }
            else {
                object5 = object2;
            }
            goto label_157;
        }
        catch(Exception exception2) {
            goto label_142;
        }
        catch(Throwable throwable5) {
            goto label_153;
        }
    label_122:
        int v16 = 8 - (~(v14 - v13) >>> 0x1F);
        long v17 = v15;
        int v18 = 0;
        while(v18 < v16) {
            if((v17 & 0xFFL) < 0x80L) {
                try {
                    ((ControlledComposition)arr_object2[(v14 << 3) + v18]).changesApplied();
                    goto label_131;
                }
                catch(Exception exception2) {
                }
                catch(Throwable throwable5) {
                    goto label_154;
                }
                goto label_143;
            }
        label_131:
            v17 >>= 8;
            ++v18;
        }
        if(v16 == 8) {
        label_135:
            if(v14 != v13) {
                try {
                    ++v14;
                    object2 = object5;
                    goto label_119;
                }
                catch(Exception exception2) {
                label_142:
                    object5 = object2;
                    try {
                    label_143:
                        Recomposer.j(recomposer0, exception2, false, 6);
                        k0.a(recomposer0, list0, list1, list2, mutableScatterSet2, mutableScatterSet3, mutableScatterSet4, mutableScatterSet5);
                    }
                    catch(Throwable throwable5) {
                        goto label_154;
                    }
                    try {
                        mutableScatterSet3.clear();
                        trace1 = Trace.INSTANCE;
                        object4 = object5;
                        goto label_270;
                    }
                    catch(Throwable throwable1) {
                        object4 = object5;
                        Trace.INSTANCE.endSection(object4);
                        throw throwable1;
                    }
                }
                catch(Throwable throwable5) {
                label_153:
                    object5 = object2;
                }
                try {
                label_154:
                    object4 = object5;
                    mutableScatterSet3.clear();
                    throw throwable5;
                }
                catch(Throwable throwable1) {
                }
            }
        }
        else {
            try {
            label_157:
                mutableScatterSet3.clear();
                object4 = object5;
                goto label_164;
            }
            catch(Throwable throwable1) {
                object4 = object5;
                Trace.INSTANCE.endSection(object4);
                throw throwable1;
            }
            try {
            label_163:
                object4 = object2;
            label_164:
                synchronized(recomposer0.c) {
                    recomposer0.b();
                }
                Snapshot.Companion.notifyObjectsInitialized();
                mutableScatterSet5.clear();
                mutableScatterSet4.clear();
                recomposer0.o = null;
                goto label_269;
            }
            catch(Throwable throwable1) {
                Trace.INSTANCE.endSection(object4);
                throw throwable1;
            }
            try {
            label_176:
                mutableScatterSet6 = mutableScatterSet0;
                mutableScatterSet7 = mutableScatterSet1;
                object4 = object2;
            }
            catch(Throwable throwable1) {
                object4 = object2;
                Trace.INSTANCE.endSection(object4);
                throw throwable1;
            }
            try {
                int v20 = list0.size();
                v21 = 0;
                while(true) {
                label_185:
                    if(v21 >= v20) {
                        goto label_213;
                    }
                    controlledComposition0 = (ControlledComposition)list0.get(v21);
                    mutableScatterSet8 = mutableScatterSet6;
                    goto label_192;
                }
            }
            catch(Exception exception3) {
            }
            catch(Throwable throwable6) {
                goto label_211;
            }
            mutableScatterSet8 = mutableScatterSet6;
            mutableScatterSet9 = mutableScatterSet7;
            goto label_206;
            try {
            label_192:
                ControlledComposition controlledComposition1 = Recomposer.access$performRecompose(recomposer0, controlledComposition0, mutableScatterSet8);
                if(controlledComposition1 != null) {
                    list2.add(controlledComposition1);
                }
                mutableScatterSet9 = mutableScatterSet7;
                goto label_200;
            }
            catch(Exception exception3) {
            }
            catch(Throwable throwable6) {
                goto label_211;
            }
            mutableScatterSet9 = mutableScatterSet7;
            goto label_206;
            try {
            label_200:
                mutableScatterSet9.add(controlledComposition0);
                ++v21;
                mutableScatterSet6 = mutableScatterSet8;
                mutableScatterSet7 = mutableScatterSet9;
                goto label_185;
            }
            catch(Exception exception3) {
            }
            catch(Throwable throwable6) {
                goto label_211;
            }
            try {
            label_206:
                Recomposer.j(recomposer0, exception3, true, 2);
                k0.a(recomposer0, list0, list1, list2, mutableScatterSet2, mutableScatterSet3, mutableScatterSet8, mutableScatterSet9);
            }
            catch(Throwable throwable6) {
                goto label_211;
            }
            try {
                list0.clear();
                goto label_269;
            label_211:
                list0.clear();
                throw throwable6;
            label_213:
                MutableScatterSet mutableScatterSet10 = mutableScatterSet6;
                MutableScatterSet mutableScatterSet11 = mutableScatterSet7;
                list0.clear();
                if(mutableScatterSet10.isNotEmpty() || recomposer0.i.isNotEmpty()) {
                    synchronized(recomposer0.c) {
                        List list3 = recomposer0.e();
                        int v23 = list3.size();
                        for(int v24 = 0; v24 < v23; ++v24) {
                            ControlledComposition controlledComposition2 = (ControlledComposition)list3.get(v24);
                            if(!mutableScatterSet11.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set0)) {
                                list0.add(controlledComposition2);
                            }
                        }
                        MutableVector mutableVector1 = recomposer0.i;
                        int v25 = mutableVector1.getSize();
                        int v26 = 0;
                        int v27 = 0;
                        while(v26 < v25) {
                            ControlledComposition controlledComposition3 = (ControlledComposition)mutableVector1.getContent()[v26];
                            if(mutableScatterSet11.contains(controlledComposition3) || list0.contains(controlledComposition3)) {
                                set1 = set0;
                                if(v27 > 0) {
                                    mutableVector1.getContent()[v26 - v27] = mutableVector1.getContent()[v26];
                                }
                            }
                            else {
                                set1 = set0;
                                list0.add(controlledComposition3);
                                ++v27;
                            }
                            ++v26;
                            set0 = set1;
                        }
                        set2 = set0;
                        int v28 = v25 - v27;
                        ArraysKt___ArraysJvmKt.fill(mutableVector1.getContent(), null, v28, v25);
                        mutableVector1.setSize(v28);
                    }
                }
                else {
                    set2 = set0;
                }
                if(list0.isEmpty()) {
                    try {
                        k0.b(list1, recomposer0);
                        while(!list1.isEmpty()) {
                            mutableScatterSet2.plusAssign(recomposer0.h(list1, mutableScatterSet10));
                            k0.b(list1, recomposer0);
                        }
                    label_261:
                        mutableScatterSet0 = mutableScatterSet10;
                        mutableScatterSet1 = mutableScatterSet11;
                        set0 = set2;
                        object2 = object4;
                        goto label_41;
                    }
                    catch(Exception exception4) {
                    }
                }
                else {
                    goto label_261;
                }
                Recomposer.j(recomposer0, exception4, true, 2);
                k0.a(recomposer0, list0, list1, list2, mutableScatterSet2, mutableScatterSet3, mutableScatterSet10, mutableScatterSet11);
            }
            catch(Throwable throwable1) {
                Trace.INSTANCE.endSection(object4);
                throw throwable1;
            }
        label_269:
            trace1 = Trace.INSTANCE;
        label_270:
            trace1.endSection(object4);
            return Unit.INSTANCE;
        }
        Trace.INSTANCE.endSection(object4);
        throw throwable1;
    }
}

