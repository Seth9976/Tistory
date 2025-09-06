package y0;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.KeyInfo;
import androidx.compose.runtime.PreconditionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import w1.a;

public final class a0 {
    public final List a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final MutableIntObjectMap e;
    public final Lazy f;

    public a0(List list0, int v) {
        this.a = list0;
        this.b = v;
        if(v < 0) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.d = new ArrayList();
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        int v2 = list0.size();
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            KeyInfo keyInfo0 = (KeyInfo)this.a.get(v1);
            mutableIntObjectMap0.set(keyInfo0.getLocation(), new l(v1, v3, keyInfo0.getNodes()));
            v3 += keyInfo0.getNodes();
        }
        this.e = mutableIntObjectMap0;
        this.f = c.lazy(new a(this, 5));
    }

    public final int a(KeyInfo keyInfo0) {
        l l0 = (l)this.e.get(keyInfo0.getLocation());
        return l0 == null ? -1 : l0.b;
    }

    public final boolean b(int v, int v1) {
        MutableIntObjectMap mutableIntObjectMap0 = this.e;
        l l0 = (l)mutableIntObjectMap0.get(v);
        if(l0 != null) {
            int v2 = l0.b;
            int v3 = v1 - l0.c;
            l0.c = v1;
            if(v3 != 0) {
                Object[] arr_object = mutableIntObjectMap0.values;
                long[] arr_v = mutableIntObjectMap0.metadata;
                int v4 = arr_v.length - 2;
                if(v4 >= 0) {
                    int v5 = 0;
                    while(true) {
                        long v6 = arr_v[v5];
                        if((~v6 << 7 & v6 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v7 = 8 - (~(v5 - v4) >>> 0x1F);
                            for(int v8 = 0; v8 < v7; ++v8) {
                                if((0xFFL & v6) < 0x80L) {
                                    l l1 = (l)arr_object[(v5 << 3) + v8];
                                    if(l1.b >= v2 && !Intrinsics.areEqual(l1, l0)) {
                                        int v9 = l1.b + v3;
                                        if(v9 >= 0) {
                                            l1.b = v9;
                                        }
                                    }
                                }
                                v6 >>= 8;
                            }
                            if(v7 == 8) {
                                goto label_27;
                            }
                            break;
                        }
                    label_27:
                        if(v5 == v4) {
                            break;
                        }
                        ++v5;
                    }
                }
            }
            return true;
        }
        return false;
    }
}

