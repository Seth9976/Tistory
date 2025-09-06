package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class l1 {
    public final ArrayList a;
    public final HashMap b;
    public final HashMap c;
    public g1 d;

    public l1() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final void a(Fragment fragment0) {
        if(this.a.contains(fragment0)) {
            throw new IllegalStateException("Fragment already added: " + fragment0);
        }
        synchronized(this.a) {
            this.a.add(fragment0);
        }
        fragment0.mAdded = true;
    }

    public final Fragment b(String s) {
        k1 k10 = (k1)this.b.get(s);
        return k10 == null ? null : k10.c;
    }

    public final Fragment c(String s) {
        for(Object object0: this.b.values()) {
            k1 k10 = (k1)object0;
            if(k10 != null) {
                Fragment fragment0 = k10.c.findFragmentByWho(s);
                if(fragment0 != null) {
                    return fragment0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.b.values()) {
            k1 k10 = (k1)object0;
            if(k10 != null) {
                arrayList0.add(k10);
            }
        }
        return arrayList0;
    }

    public final ArrayList e() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.b.values()) {
            k1 k10 = (k1)object0;
            if(k10 == null) {
                arrayList0.add(null);
            }
            else {
                arrayList0.add(k10.c);
            }
        }
        return arrayList0;
    }

    public final List f() {
        if(this.a.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList0 = this.a;
        return new ArrayList(this.a);
    }

    public final void g(k1 k10) {
        Fragment fragment0 = k10.c;
        HashMap hashMap0 = this.b;
        if(hashMap0.get(fragment0.mWho) != null) {
            return;
        }
        hashMap0.put(fragment0.mWho, k10);
        if(fragment0.mRetainInstanceChangedWhileDetached) {
            if(fragment0.mRetainInstance) {
                this.d.a(fragment0);
            }
            else {
                this.d.f(fragment0);
            }
            fragment0.mRetainInstanceChangedWhileDetached = false;
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment0);
        }
    }

    public final void h(k1 k10) {
        Fragment fragment0 = k10.c;
        if(fragment0.mRetainInstance) {
            this.d.f(fragment0);
        }
        HashMap hashMap0 = this.b;
        if(hashMap0.get(fragment0.mWho) != k10) {
            return;
        }
        if(((k1)hashMap0.put(fragment0.mWho, null)) == null) {
            return;
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment0);
        }
    }

    public final Bundle i(String s, Bundle bundle0) {
        return bundle0 == null ? ((Bundle)this.c.remove(s)) : ((Bundle)this.c.put(s, bundle0));
    }
}

