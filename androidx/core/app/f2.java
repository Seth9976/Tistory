package androidx.core.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class f2 {
    public static RemoteInput[] a(Bundle[] arr_bundle) {
        if(arr_bundle == null) {
            return null;
        }
        RemoteInput[] arr_remoteInput = new RemoteInput[arr_bundle.length];
        for(int v = 0; v < arr_bundle.length; ++v) {
            Bundle bundle0 = arr_bundle[v];
            ArrayList arrayList0 = bundle0.getStringArrayList("allowedDataTypes");
            HashSet hashSet0 = new HashSet();
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    hashSet0.add(((String)object0));
                }
            }
            arr_remoteInput[v] = new RemoteInput(bundle0.getString("resultKey"), bundle0.getCharSequence("label"), bundle0.getCharSequenceArray("choices"), bundle0.getBoolean("allowFreeFormInput"), 0, bundle0.getBundle("extras"), hashSet0);
        }
        return arr_remoteInput;
    }
}

