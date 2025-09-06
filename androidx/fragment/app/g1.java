package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class g1 extends ViewModel {
    public final HashMap H0;
    public final HashMap I0;
    public final HashMap J0;
    public final boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public static final f1 O0;

    static {
        g1.O0 = new f1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public g1(boolean z) {
        this.H0 = new HashMap();
        this.I0 = new HashMap();
        this.J0 = new HashMap();
        this.L0 = false;
        this.M0 = false;
        this.N0 = false;
        this.K0 = z;
    }

    public final void a(Fragment fragment0) {
        if(this.N0) {
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        HashMap hashMap0 = this.H0;
        if(hashMap0.containsKey(fragment0.mWho)) {
            return;
        }
        hashMap0.put(fragment0.mWho, fragment0);
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment0);
        }
    }

    public final void b(Fragment fragment0, boolean z) {
        if(FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment0);
        }
        this.d(fragment0.mWho, z);
    }

    public final void c(String s, boolean z) {
        if(FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + s);
        }
        this.d(s, z);
    }

    public final void d(String s, boolean z) {
        HashMap hashMap0 = this.I0;
        g1 g10 = (g1)hashMap0.get(s);
        if(g10 != null) {
            if(z) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.addAll(g10.I0.keySet());
                for(Object object0: arrayList0) {
                    g10.c(((String)object0), true);
                }
            }
            g10.onCleared();
            hashMap0.remove(s);
        }
        HashMap hashMap1 = this.J0;
        ViewModelStore viewModelStore0 = (ViewModelStore)hashMap1.get(s);
        if(viewModelStore0 != null) {
            viewModelStore0.clear();
            hashMap1.remove(s);
        }
    }

    public final FragmentManagerNonConfig e() {
        HashMap hashMap0 = this.H0;
        HashMap hashMap1 = this.I0;
        HashMap hashMap2 = this.J0;
        if(hashMap0.isEmpty() && hashMap1.isEmpty() && hashMap2.isEmpty()) {
            return null;
        }
        HashMap hashMap3 = new HashMap();
        for(Object object0: hashMap1.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            FragmentManagerNonConfig fragmentManagerNonConfig0 = ((g1)map$Entry0.getValue()).e();
            if(fragmentManagerNonConfig0 != null) {
                hashMap3.put(((String)map$Entry0.getKey()), fragmentManagerNonConfig0);
            }
        }
        this.M0 = true;
        return !hashMap0.isEmpty() || !hashMap3.isEmpty() || !hashMap2.isEmpty() ? new FragmentManagerNonConfig(new ArrayList(hashMap0.values()), hashMap3, new HashMap(hashMap2)) : null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return g1.class == class0 && (this.H0.equals(((g1)object0).H0) && this.I0.equals(((g1)object0).I0) && this.J0.equals(((g1)object0).J0));
        }
        return false;
    }

    public final void f(Fragment fragment0) {
        if(this.N0) {
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if(this.H0.remove(fragment0.mWho) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment0);
        }
    }

    public final void g(FragmentManagerNonConfig fragmentManagerNonConfig0) {
        HashMap hashMap0 = this.H0;
        hashMap0.clear();
        HashMap hashMap1 = this.I0;
        hashMap1.clear();
        HashMap hashMap2 = this.J0;
        hashMap2.clear();
        if(fragmentManagerNonConfig0 != null) {
            List list0 = fragmentManagerNonConfig0.a;
            if(list0 != null) {
                for(Object object0: list0) {
                    Fragment fragment0 = (Fragment)object0;
                    if(fragment0 != null) {
                        hashMap0.put(fragment0.mWho, fragment0);
                    }
                }
            }
            HashMap hashMap3 = fragmentManagerNonConfig0.b;
            if(hashMap3 != null) {
                for(Object object1: hashMap3.entrySet()) {
                    g1 g10 = new g1(this.K0);
                    g10.g(((FragmentManagerNonConfig)((Map.Entry)object1).getValue()));
                    hashMap1.put(((String)((Map.Entry)object1).getKey()), g10);
                }
            }
            HashMap hashMap4 = fragmentManagerNonConfig0.c;
            if(hashMap4 != null) {
                hashMap2.putAll(hashMap4);
            }
        }
        this.M0 = false;
    }

    @Override
    public final int hashCode() {
        return this.J0.hashCode() + (this.I0.hashCode() + this.H0.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if(FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.L0 = true;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} Fragments (");
        Iterator iterator0 = this.H0.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") Child Non Config (");
        Iterator iterator1 = this.I0.keySet().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            stringBuilder0.append(((String)object1));
            if(iterator1.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") ViewModelStores (");
        Iterator iterator2 = this.J0.keySet().iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            stringBuilder0.append(((String)object2));
            if(iterator2.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

