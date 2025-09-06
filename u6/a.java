package u6;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import java.util.Collections;
import java.util.Map;

public abstract class a implements Factory {
    public final Map a;

    public a(Map map0) {
        this.a = Collections.unmodifiableMap(map0);
    }
}

