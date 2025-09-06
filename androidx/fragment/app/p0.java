package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayList;
import java.util.Map;

public final class p0 implements ActivityResultCallback {
    public final int a;
    public final FragmentManager b;

    public p0(FragmentManager fragmentManager0, int v) {
        this.a = v;
        this.b = fragmentManager0;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        switch(this.a) {
            case 0: {
                String[] arr_s = (String[])((Map)object0).keySet().toArray(new String[0]);
                ArrayList arrayList0 = new ArrayList(((Map)object0).values());
                int[] arr_v = new int[arrayList0.size()];
                for(int v = 0; v < arrayList0.size(); ++v) {
                    arr_v[v] = ((Boolean)arrayList0.get(v)).booleanValue() ? 0 : -1;
                }
                FragmentManager fragmentManager1 = this.b;
                y0 y01 = (y0)fragmentManager1.F.pollFirst();
                if(y01 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String s1 = y01.a;
                Fragment fragment1 = fragmentManager1.c.c(s1);
                if(fragment1 == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + s1);
                    return;
                }
                fragment1.onRequestPermissionsResult(y01.b, arr_s, arr_v);
                return;
            }
            case 1: {
                FragmentManager fragmentManager2 = this.b;
                y0 y02 = (y0)fragmentManager2.F.pollLast();
                if(y02 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String s2 = y02.a;
                Fragment fragment2 = fragmentManager2.c.c(s2);
                if(fragment2 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + s2);
                    return;
                }
                fragment2.onActivityResult(y02.b, ((ActivityResult)object0).getResultCode(), ((ActivityResult)object0).getData());
                return;
            }
            default: {
                FragmentManager fragmentManager0 = this.b;
                y0 y00 = (y0)fragmentManager0.F.pollFirst();
                if(y00 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String s = y00.a;
                Fragment fragment0 = fragmentManager0.c.c(s);
                if(fragment0 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + s);
                    return;
                }
                fragment0.onActivityResult(y00.b, ((ActivityResult)object0).getResultCode(), ((ActivityResult)object0).getData());
            }
        }
    }
}

