package j7;

import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzs;
import java.util.NoSuchElementException;

public final class b extends zzak {
    public final int a;
    public int b;
    public final zzag c;

    public b(zzag zzag0, int v) {
        int v1 = zzag0.size();
        super();
        zzs.zzb(v, v1, "index");
        this.a = v1;
        this.b = v;
        this.c = zzag0;
    }

    public final Object a(int v) {
        return this.c.get(v);
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.b;
        this.b = v + 1;
        return this.a(v);
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.b - 1;
        this.b = v;
        return this.a(v);
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }
}

