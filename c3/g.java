package c3;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import androidx.core.util.ObjectsCompat;

public final class g {
    public final Resources a;
    public final Resources.Theme b;

    public g(Resources resources0, Resources.Theme resources$Theme0) {
        this.a = resources0;
        this.b = resources$Theme0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return g.class == class0 && (this.a.equals(((g)object0).a) && ObjectsCompat.equals(this.b, ((g)object0).b));
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ObjectsCompat.hash(new Object[]{this.a, this.b});
    }
}

