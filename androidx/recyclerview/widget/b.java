package androidx.recyclerview.widget;

import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;

public final class b implements OpReorderer.Callback {
    public final SimplePool a;
    public final ArrayList b;
    public final ArrayList c;
    public final k1 d;
    public final b1 e;
    public int f;

    public b(k1 k10) {
        this.a = new SimplePool(30);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = 0;
        this.d = k10;
        this.e = new b1(this);
    }

    public final boolean a(int v) {
        ArrayList arrayList0 = this.c;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            a a0 = (a)arrayList0.get(v2);
            int v3 = a0.a;
            if(v3 == 8) {
                if(this.f(a0.d, v2 + 1) == v) {
                    return true;
                }
            }
            else if(v3 == 1) {
                int v4 = a0.b;
                int v5 = a0.d + v4;
                while(v4 < v5) {
                    if(this.f(v4, v2 + 1) == v) {
                        return true;
                    }
                    ++v4;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            a a0 = (a)arrayList0.get(v1);
            this.d.a(a0);
        }
        this.j(arrayList0);
        this.f = 0;
    }

    public final void c() {
        this.b();
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            a a0 = (a)arrayList0.get(v1);
            k1 k10 = this.d;
            switch(a0.a) {
                case 1: {
                    k10.a(a0);
                    k10.offsetPositionsForAdd(a0.b, a0.d);
                    break;
                }
                case 2: {
                    k10.a(a0);
                    k10.offsetPositionsForRemovingInvisible(a0.b, a0.d);
                    break;
                }
                case 4: {
                    k10.a(a0);
                    k10.markViewHoldersUpdated(a0.b, a0.d, a0.c);
                    break;
                }
                case 8: {
                    k10.a(a0);
                    k10.offsetPositionsForMove(a0.b, a0.d);
                }
            }
        }
        this.j(arrayList0);
        this.f = 0;
    }

    public final void d(a a0) {
        SimplePool pools$SimplePool0;
        int v3;
        int v = a0.a;
        if(v == 1 || v == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v1 = this.k(a0.b, v);
        int v2 = a0.b;
        switch(a0.a) {
            case 2: {
                v3 = 0;
                break;
            }
            case 4: {
                v3 = 1;
                break;
            }
            default: {
                throw new IllegalArgumentException("op should be remove or update." + a0);
            }
        }
        int v5 = 1;
        for(int v4 = 1; true; ++v4) {
            pools$SimplePool0 = this.a;
            if(v4 >= a0.d) {
                break;
            }
            int v6 = this.k(v3 * v4 + a0.b, a0.a);
            int v7 = a0.a;
            switch(v7) {
                case 2: {
                    if(v6 == v1) {
                        ++v5;
                        continue;
                    }
                    break;
                }
                case 4: {
                    if(v6 == v1 + 1) {
                        ++v5;
                        continue;
                    }
                }
            }
            a a1 = this.obtainUpdateOp(v7, v1, v5, a0.c);
            this.e(a1, v2);
            a1.c = null;
            pools$SimplePool0.release(a1);
            if(a0.a == 4) {
                v2 += v5;
            }
            v5 = 1;
            v1 = v6;
        }
        Object object0 = a0.c;
        a0.c = null;
        pools$SimplePool0.release(a0);
        if(v5 > 0) {
            a a2 = this.obtainUpdateOp(a0.a, v1, v5, object0);
            this.e(a2, v2);
            a2.c = null;
            pools$SimplePool0.release(a2);
        }
    }

    public final void e(a a0, int v) {
        k1 k10 = this.d;
        k10.a(a0);
        switch(a0.a) {
            case 2: {
                k10.offsetPositionsForRemovingInvisible(v, a0.d);
                return;
            }
            case 4: {
                k10.markViewHoldersUpdated(v, a0.d, a0.c);
                return;
            }
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
        }
    }

    public final int f(int v, int v1) {
        ArrayList arrayList0 = this.c;
        int v2 = arrayList0.size();
        while(v1 < v2) {
            a a0 = (a)arrayList0.get(v1);
            int v3 = a0.a;
            if(v3 == 8) {
                int v4 = a0.b;
                if(v4 == v) {
                    v = a0.d;
                }
                else {
                    if(v4 < v) {
                        --v;
                    }
                    if(a0.d <= v) {
                        ++v;
                    }
                }
            }
            else {
                int v5 = a0.b;
                if(v5 <= v) {
                    switch(v3) {
                        case 1: {
                            v += a0.d;
                            break;
                        }
                        case 2: {
                            int v6 = a0.d;
                            if(v < v5 + v6) {
                                return -1;
                            }
                            v -= v6;
                        }
                    }
                }
            }
            ++v1;
        }
        return v;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final void h(a a0) {
        this.c.add(a0);
        k1 k10 = this.d;
        switch(a0.a) {
            case 1: {
                k10.offsetPositionsForAdd(a0.b, a0.d);
                return;
            }
            case 2: {
                k10.offsetPositionsForRemovingLaidOutOrNewView(a0.b, a0.d);
                return;
            }
            case 4: {
                k10.markViewHoldersUpdated(a0.b, a0.d, a0.c);
                return;
            }
            case 8: {
                k10.offsetPositionsForMove(a0.b, a0.d);
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown update op type for " + a0);
            }
        }
    }

    // This method was un-flattened
    public final void i() {
        int v37;
        a a4;
        a a3;
        a a2;
        boolean z2;
        boolean z1;
        ArrayList arrayList0 = this.b;
        b1 b10 = this.e;
        b10.getClass();
        while(true) {
            int v = arrayList0.size() - 1;
            boolean z = false;
            while(true) {
                if(v < 0) {
                    v = -1;
                    break;
                }
                if(((a)arrayList0.get(v)).a != 8) {
                    z = true;
                }
                else if(z) {
                    break;
                }
                --v;
            }
            if(v == -1) {
                break;
            }
            a a0 = (a)arrayList0.get(v);
            a a1 = (a)arrayList0.get(v + 1);
            int v1 = a1.a;
            if(v1 == 1) {
                int v24 = a0.d;
                int v25 = a1.b;
                int v26 = v24 >= v25 ? 0 : -1;
                int v27 = a0.b;
                if(v27 < v25) {
                    ++v26;
                }
                if(v25 <= v27) {
                    a0.b = v27 + a1.d;
                }
                int v28 = a1.b;
                if(v28 <= v24) {
                    a0.d = v24 + a1.d;
                }
                a1.b = v28 + v26;
                arrayList0.set(v, a1);
                arrayList0.set(v + 1, a0);
            }
            else {
                b b0 = b10.a;
                switch(v1) {
                    case 2: {
                        int v2 = a0.b;
                        int v3 = a0.d;
                        if(v2 < v3) {
                            z1 = a1.b == v2 && a1.d == v3 - v2;
                            z2 = false;
                        }
                        else if(a1.b != v3 + 1 || a1.d != v2 - v3) {
                            z2 = true;
                            z1 = false;
                        }
                        else {
                            z1 = true;
                            z2 = true;
                        }
                        int v4 = a1.b;
                        if(v3 < v4) {
                            a1.b = v4 - 1;
                        }
                        else {
                            int v5 = a1.d;
                            if(v3 < v4 + v5) {
                                a1.d = v5 - 1;
                                a0.a = 2;
                                a0.d = 1;
                                if(a1.d != 0) {
                                    break;
                                }
                                arrayList0.remove(v + 1);
                                a1.c = null;
                                b0.a.release(a1);
                                break;
                            }
                        }
                        int v6 = a0.b;
                        int v7 = a1.b;
                        if(v6 <= v7) {
                            a1.b = v7 + 1;
                        }
                        else {
                            int v8 = v7 + a1.d;
                            if(v6 < v8) {
                                a2 = b0.obtainUpdateOp(2, v6 + 1, v8 - v6, null);
                                a1.d = a0.b - a1.b;
                                goto label_59;
                            }
                        }
                        a2 = null;
                    label_59:
                        if(z1) {
                            arrayList0.set(v, a1);
                            arrayList0.remove(v + 1);
                            a0.c = null;
                            b0.a.release(a0);
                        }
                        else {
                            if(z2) {
                                if(a2 != null) {
                                    int v9 = a0.b;
                                    if(v9 > a2.b) {
                                        a0.b = v9 - a2.d;
                                    }
                                    int v10 = a0.d;
                                    if(v10 > a2.b) {
                                        a0.d = v10 - a2.d;
                                    }
                                }
                                int v11 = a0.b;
                                if(v11 > a1.b) {
                                    a0.b = v11 - a1.d;
                                }
                                int v12 = a0.d;
                                if(v12 > a1.b) {
                                    a0.d = v12 - a1.d;
                                }
                            }
                            else {
                                if(a2 != null) {
                                    int v13 = a0.b;
                                    if(v13 >= a2.b) {
                                        a0.b = v13 - a2.d;
                                    }
                                    int v14 = a0.d;
                                    if(v14 >= a2.b) {
                                        a0.d = v14 - a2.d;
                                    }
                                }
                                int v15 = a0.b;
                                if(v15 >= a1.b) {
                                    a0.b = v15 - a1.d;
                                }
                                int v16 = a0.d;
                                if(v16 >= a1.b) {
                                    a0.d = v16 - a1.d;
                                }
                            }
                            arrayList0.set(v, a1);
                            if(a0.b == a0.d) {
                                arrayList0.remove(v + 1);
                            }
                            else {
                                arrayList0.set(v + 1, a0);
                            }
                            if(a2 == null) {
                                break;
                            }
                            arrayList0.add(v, a2);
                        }
                        break;
                    }
                    case 4: {
                        int v17 = a0.d;
                        int v18 = a1.b;
                        if(v17 < v18) {
                            a1.b = v18 - 1;
                        }
                        else {
                            int v19 = a1.d;
                            if(v17 < v18 + v19) {
                                a1.d = v19 - 1;
                                a3 = b0.obtainUpdateOp(4, a0.b, 1, a1.c);
                                goto label_112;
                            }
                        }
                        a3 = null;
                    label_112:
                        int v20 = a0.b;
                        int v21 = a1.b;
                        if(v20 <= v21) {
                            a1.b = v21 + 1;
                        }
                        else {
                            int v22 = v21 + a1.d;
                            if(v20 < v22) {
                                int v23 = v22 - v20;
                                a4 = b0.obtainUpdateOp(4, v20 + 1, v23, a1.c);
                                a1.d -= v23;
                                goto label_124;
                            }
                        }
                        a4 = null;
                    label_124:
                        arrayList0.set(v + 1, a0);
                        if(a1.d > 0) {
                            arrayList0.set(v, a1);
                        }
                        else {
                            arrayList0.remove(v);
                            a1.c = null;
                            b0.a.release(a1);
                        }
                        if(a3 != null) {
                            arrayList0.add(v, a3);
                        }
                        if(a4 == null) {
                            break;
                        }
                        arrayList0.add(v, a4);
                    }
                }
            }
        }
        int v29 = arrayList0.size();
        int v30 = 0;
        while(v30 < v29) {
            a a5 = (a)arrayList0.get(v30);
            int v31 = a5.a;
            if(v31 == 1) {
                this.h(a5);
            }
            else {
                SimplePool pools$SimplePool0 = this.a;
                k1 k10 = this.d;
                switch(v31) {
                    case 2: {
                        int v32 = a5.b;
                        int v33 = a5.d + v32;
                        int v34 = v32;
                        int v35 = 0;
                        int v36 = -1;
                        while(v34 < v33) {
                            if(k10.findViewHolder(v34) != null || this.a(v34)) {
                            label_175:
                                if(v36 == 0) {
                                    this.d(this.obtainUpdateOp(2, v32, v35, null));
                                    v37 = 1;
                                    v34 -= v35;
                                    v33 -= v35;
                                    v35 = 1;
                                    goto label_184;
                                }
                                else {
                                    v37 = 1;
                                }
                            }
                            else {
                                if(v36 == 1) {
                                    this.h(this.obtainUpdateOp(2, v32, v35, null));
                                    v37 = 0;
                                    v34 -= v35;
                                    v33 -= v35;
                                    v35 = 1;
                                    goto label_184;
                                }
                                else {
                                    v37 = 0;
                                    goto label_183;
                                }
                                goto label_175;
                            }
                        label_183:
                            ++v35;
                        label_184:
                            ++v34;
                            v36 = v37;
                        }
                        if(v35 != a5.d) {
                            a5.c = null;
                            pools$SimplePool0.release(a5);
                            a5 = this.obtainUpdateOp(2, v32, v35, null);
                        }
                        if(v36 == 0) {
                            this.d(a5);
                        }
                        else {
                            this.h(a5);
                        }
                        break;
                    }
                    case 4: {
                        int v38 = a5.b;
                        int v39 = a5.d + v38;
                        int v40 = -1;
                        int v41 = v38;
                        int v42 = 0;
                        while(v38 < v39) {
                            if(k10.findViewHolder(v38) != null || this.a(v38)) {
                                if(v40 == 0) {
                                    this.d(this.obtainUpdateOp(4, v41, v42, a5.c));
                                    v41 = v38;
                                    v42 = 0;
                                }
                                v40 = 1;
                            }
                            else {
                                if(v40 == 1) {
                                    this.h(this.obtainUpdateOp(4, v41, v42, a5.c));
                                    v41 = v38;
                                    v42 = 0;
                                }
                                v40 = 0;
                            }
                            ++v42;
                            ++v38;
                        }
                        if(v42 != a5.d) {
                            Object object0 = a5.c;
                            a5.c = null;
                            pools$SimplePool0.release(a5);
                            a5 = this.obtainUpdateOp(4, v41, v42, object0);
                        }
                        if(v40 == 0) {
                            this.d(a5);
                        }
                        else {
                            this.h(a5);
                        }
                        break;
                    }
                    case 8: {
                        this.h(a5);
                    }
                }
            }
            ++v30;
        }
        arrayList0.clear();
    }

    public final void j(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.recycleUpdateOp(((a)arrayList0.get(v1)));
        }
        arrayList0.clear();
    }

    public final int k(int v, int v1) {
        int v7;
        int v6;
        ArrayList arrayList0 = this.c;
        for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
            a a0 = (a)arrayList0.get(v2);
            int v3 = a0.a;
            if(v3 == 8) {
                int v4 = a0.b;
                int v5 = a0.d;
                if(v4 < v5) {
                    v6 = v4;
                    v7 = v5;
                }
                else {
                    v7 = v4;
                    v6 = v5;
                }
                if(v < v6 || v > v7) {
                    if(v < v4) {
                        if(v1 == 1) {
                            a0.b = v4 + 1;
                            a0.d = v5 + 1;
                        }
                        else if(v1 == 2) {
                            a0.b = v4 - 1;
                            a0.d = v5 - 1;
                        }
                    }
                }
                else if(v6 == v4) {
                    if(v1 == 1) {
                        a0.d = v5 + 1;
                    }
                    else if(v1 == 2) {
                        a0.d = v5 - 1;
                    }
                    ++v;
                }
                else {
                    if(v1 == 1) {
                        a0.b = v4 + 1;
                    }
                    else if(v1 == 2) {
                        a0.b = v4 - 1;
                    }
                    --v;
                }
            }
            else {
                int v8 = a0.b;
                if(v8 > v) {
                    if(v1 == 1) {
                        a0.b = v8 + 1;
                    }
                    else if(v1 == 2) {
                        a0.b = v8 - 1;
                    }
                }
                else if(v3 == 1) {
                    v -= a0.d;
                }
                else if(v3 == 2) {
                    v += a0.d;
                }
            }
        }
        for(int v9 = arrayList0.size() - 1; v9 >= 0; --v9) {
            a a1 = (a)arrayList0.get(v9);
            SimplePool pools$SimplePool0 = this.a;
            if(a1.a != 8) {
                if(a1.d <= 0) {
                    arrayList0.remove(v9);
                    a1.c = null;
                    pools$SimplePool0.release(a1);
                }
            }
            else if(a1.d == a1.b || a1.d < 0) {
                arrayList0.remove(v9);
                a1.c = null;
                pools$SimplePool0.release(a1);
            }
        }
        return v;
    }

    @Override  // androidx.recyclerview.widget.OpReorderer$Callback
    public final a obtainUpdateOp(int v, int v1, int v2, Object object0) {
        a a0 = (a)this.a.acquire();
        if(a0 == null) {
            a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            a0.a = v;
            a0.b = v1;
            a0.d = v2;
            a0.c = object0;
            return a0;
        }
        a0.a = v;
        a0.b = v1;
        a0.d = v2;
        a0.c = object0;
        return a0;
    }

    @Override  // androidx.recyclerview.widget.OpReorderer$Callback
    public final void recycleUpdateOp(a a0) {
        a0.c = null;
        this.a.release(a0);
    }
}

