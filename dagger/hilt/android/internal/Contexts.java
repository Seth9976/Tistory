package dagger.hilt.android.internal;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

public final class Contexts {
    public static Application getApplication(Context context0) {
        if(context0 instanceof Application) {
            return (Application)context0;
        }
        Context context1 = context0;
        while(context1 instanceof ContextWrapper) {
            context1 = ((ContextWrapper)context1).getBaseContext();
            if(context1 instanceof Application) {
                return (Application)context1;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context0);
    }
}

