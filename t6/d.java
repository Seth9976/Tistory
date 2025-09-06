package t6;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import java.util.HashMap;
import retrofit2.p;

public final class d implements BackendRegistry {
    public final p a;
    public final c b;
    public final HashMap c;

    public d(Context context0, c c0) {
        p p0 = new p(context0);
        super();
        this.c = new HashMap();
        this.a = p0;
        this.b = c0;
    }

    @Override  // com.google.android.datatransport.runtime.backends.BackendRegistry
    public final TransportBackend get(String s) {
        synchronized(this) {
            if(this.c.containsKey(s)) {
                return (TransportBackend)this.c.get(s);
            }
            BackendFactory backendFactory0 = this.a.a(s);
            if(backendFactory0 == null) {
                return null;
            }
            TransportBackend transportBackend1 = backendFactory0.create(CreationContext.create(this.b.a, this.b.b, this.b.c, s));
            this.c.put(s, transportBackend1);
            return transportBackend1;
        }
    }
}

