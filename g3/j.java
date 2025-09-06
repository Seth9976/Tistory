package g3;

import android.location.Location;
import androidx.core.util.Consumer;

public final class j implements Runnable {
    public final int a;
    public final Consumer b;
    public final Location c;

    public j(Consumer consumer0, Location location0, int v) {
        this.a = v;
        this.b = consumer0;
        this.c = location0;
        super();
    }

    @Override
    public final void run() {
        Location location0 = this.c;
        Consumer consumer0 = this.b;
        if(this.a != 0) {
            consumer0.accept(location0);
            return;
        }
        consumer0.accept(location0);
    }
}

