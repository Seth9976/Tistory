package j7;

import com.google.android.gms.internal.common.zzx;
import java.io.IOException;
import java.util.Iterator;

public final class j implements Iterable {
    public final CharSequence a;
    public final zzx b;

    public j(zzx zzx0, CharSequence charSequence0) {
        this.b = zzx0;
        this.a = charSequence0;
    }

    @Override
    public final Iterator iterator() {
        return new i(this.b.c, this.b, this.a);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        Iterator iterator0 = this.iterator();
        try {
            if(((i)iterator0).hasNext()) {
                Object object0 = ((i)iterator0).next();
                object0.getClass();
                CharSequence charSequence0 = object0 instanceof CharSequence ? ((CharSequence)object0) : object0.toString();
                stringBuilder0.append(charSequence0);
                while(((i)iterator0).hasNext()) {
                    stringBuilder0.append(", ");
                    Object object1 = ((i)iterator0).next();
                    object1.getClass();
                    CharSequence charSequence1 = object1 instanceof CharSequence ? ((CharSequence)object1) : object1.toString();
                    stringBuilder0.append(charSequence1);
                }
            }
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

