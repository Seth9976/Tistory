package androidx.constraintlayout.core.parser;

import com.google.android.gms.internal.measurement.zzae;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator {
    public final int a;
    public int b;
    public Iterable c;

    public a() {
        this.a = 0;
        super();
    }

    public a(zzae zzae0) {
        this.a = 1;
        super();
        this.c = zzae0;
        this.b = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.a == 0 ? this.b < ((CLObject)this.c).size() : this.b < ((zzae)this.c).zzc();
    }

    @Override
    public final Object next() {
        if(this.a != 0) {
            int v = this.b;
            zzae zzae0 = (zzae)this.c;
            if(v >= zzae0.zzc()) {
                throw new NoSuchElementException("Out of bounds index: " + this.b);
            }
            int v1 = this.b;
            this.b = v1 + 1;
            return zzae0.zze(v1);
        }
        CLKey cLKey0 = (CLKey)((CLObject)this.c).c.get(this.b);
        ++this.b;
        return cLKey0;
    }
}

