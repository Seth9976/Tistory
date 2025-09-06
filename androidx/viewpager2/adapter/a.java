package androidx.viewpager2.adapter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {
    public CopyOnWriteArrayList a;

    public final ArrayList a(Fragment fragment0, State lifecycle$State0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            arrayList0.add(((FragmentTransactionCallback)object0).onFragmentMaxLifecyclePreUpdated(fragment0, lifecycle$State0));
        }
        return arrayList0;
    }

    public static void b(List list0) {
        for(Object object0: list0) {
            ((OnPostEventListener)object0).onPost();
        }
    }
}

