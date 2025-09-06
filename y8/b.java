package y8;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor;
import com.google.firebase.tracing.FirebaseTrace;

public final class b implements ComponentFactory {
    public final int a;
    public final String b;
    public final Object c;

    public b(Object object0, int v, String s) {
        this.a = v;
        this.b = s;
        this.c = object0;
        super();
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer0) {
        if(this.a != 0) {
            try {
                FirebaseTrace.pushTrace(this.b);
                return ((Component)this.c).getFactory().create(componentContainer0);
            }
            finally {
                FirebaseTrace.popTrace();
            }
        }
        Context context0 = (Context)componentContainer0.get(Context.class);
        String s = ((VersionExtractor)this.c).extract(context0);
        return new a(this.b, s);
    }
}

