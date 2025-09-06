package androidx.core.provider;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import java.util.ArrayList;

public final class k implements Consumer {
    public final String a;

    public k(String s) {
        this.a = s;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        ArrayList arrayList0;
        synchronized(m.c) {
            SimpleArrayMap simpleArrayMap0 = m.d;
            arrayList0 = (ArrayList)simpleArrayMap0.get(this.a);
            if(arrayList0 == null) {
                return;
            }
            simpleArrayMap0.remove(this.a);
        }
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            ((Consumer)arrayList0.get(v1)).accept(((l)object0));
        }
    }
}

