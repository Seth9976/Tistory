package androidx.emoji2.text.flatbuffer;

import java.util.Comparator;

public final class c implements Comparator {
    public final FlexBuffersBuilder a;

    public c(FlexBuffersBuilder flexBuffersBuilder0) {
        this.a = flexBuffersBuilder0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v3;
        int v2;
        int v = ((d)object0).e;
        int v1 = ((d)object1).e;
        do {
            v2 = this.a.a.get(v);
            v3 = this.a.a.get(v1);
            if(v2 == 0) {
                return -v3;
            }
            ++v;
            ++v1;
        }
        while(v2 == v3);
        return v2 - v3;
    }
}

