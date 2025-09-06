package androidx.emoji2.text;

import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class h implements Runnable {
    public final ArrayList a;
    public final Throwable b;
    public final int c;

    public h(List list0, int v, Throwable throwable0) {
        Preconditions.checkNotNull(list0, "initCallbacks cannot be null");
        this.a = new ArrayList(list0);
        this.c = v;
        this.b = throwable0;
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        int v1 = 0;
        if(this.c != 1) {
            while(v1 < v) {
                ((InitCallback)arrayList0.get(v1)).onFailed(this.b);
                ++v1;
            }
            return;
        }
        while(v1 < v) {
            ((InitCallback)arrayList0.get(v1)).onInitialized();
            ++v1;
        }
    }
}

