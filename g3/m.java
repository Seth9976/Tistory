package g3;

import android.location.Location;
import java.util.function.Consumer;

public final class m implements Consumer {
    public final androidx.core.util.Consumer a;

    public m(androidx.core.util.Consumer consumer0) {
        this.a = consumer0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.accept(((Location)object0));
    }
}

