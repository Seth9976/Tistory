package g3;

import androidx.core.location.LocationListenerCompat;
import androidx.core.util.ObjectsCompat;

public final class s {
    public final String a;
    public final LocationListenerCompat b;

    public s(String s, LocationListenerCompat locationListenerCompat0) {
        this.a = (String)ObjectsCompat.requireNonNull(s, "invalid null provider");
        this.b = (LocationListenerCompat)ObjectsCompat.requireNonNull(locationListenerCompat0, "invalid null listener");
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof s ? this.a.equals(((s)object0).a) && this.b.equals(((s)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return ObjectsCompat.hash(new Object[]{this.a, this.b});
    }
}

