package androidx.constraintlayout.core;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.f;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.v;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.color.utilities.l;
import e5.d;
import java.util.Comparator;

public final class c implements Comparator {
    public final int a;

    public c(int v) {
        this.a = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                return ((SolverVariable)object0).id - ((SolverVariable)object1).id;
            }
            case 1: {
                return Integer.compare(((f)object0).a, ((f)object1).a);
            }
            case 2: {
                return ((v)object0).a - ((v)object1).a;
            }
            case 3: {
                RecyclerView recyclerView0 = ((d0)object0).d;
                if((recyclerView0 == null ? 1 : 0) != (((d0)object1).d == null ? 1 : 0)) {
                    return recyclerView0 == null ? 1 : -1;
                }
                boolean z = ((d0)object0).a;
                if(z != ((d0)object1).a) {
                    return z ? -1 : 1;
                }
                int v = ((d0)object1).b - ((d0)object0).b;
                if(v != 0) {
                    return v;
                }
                int v1 = ((d0)object0).c - ((d0)object1).c;
                return v1 == 0 ? 0 : v1;
            }
            case 4: {
                return ((Comparable)object0).compareTo(object1);
            }
            case 5: {
                return ((com.google.android.material.color.c)object0).c - ((com.google.android.material.color.c)object1).c;
            }
            case 6: {
                return Double.compare(((l)object1).b, ((l)object0).b);
            }
            case 7: {
                return ((View)object0).getTop() - ((View)object1).getTop();
            }
            case 8: {
                return ((Comparable)object0).compareTo(((Comparable)object1));
            }
            case 9: {
                return ((Comparable)object0).compareTo(((Comparable)object1));
            }
            case 10: {
                return ((d)object0).b - ((d)object1).b;
            }
            case 11: {
                return ((int[])object0)[0] - ((int[])object1)[0];
            }
            case 12: {
                float f = ViewCompat.getZ(((View)object0));
                float f1 = ViewCompat.getZ(((View)object1));
                if(f > f1) {
                    return -1;
                }
                return f < f1 ? 1 : 0;
            }
            default: {
                return ((Scope)object0).getScopeUri().compareTo(((Scope)object1).getScopeUri());
            }
        }
    }
}

