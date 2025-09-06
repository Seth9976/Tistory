package com.google.firebase.crashlytics.internal.common;

import a7.b;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.concurrent.Callable;

public final class n implements Callable {
    public final int a;
    public final Object b;

    public n(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                try {
                    b b0 = ((CrashlyticsCore)this.b).e;
                    if(!((FileStore)b0.c).getCommonFile(((String)b0.b)).delete()) {
                        Logger.getLogger().w("Initialization marker file was not properly removed.");
                        return false;
                    }
                    return true;
                }
                catch(Exception exception0) {
                }
                Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", exception0);
                return false;
            }
            case 1: {
                l l0 = ((CrashlyticsCore)this.b).h;
                b b1 = l0.c;
                String s = (String)b1.b;
                FileStore fileStore0 = (FileStore)b1.c;
                if(!fileStore0.getCommonFile(s).exists()) {
                    String s1 = l0.f();
                    return s1 != null && l0.j.hasCrashDataForSession(s1);
                }
                Logger.getLogger().v("Found previous crash marker.");
                fileStore0.getCommonFile(((String)b1.b)).delete();
                return true;
            }
            default: {
                ((j)this.b).run();
                return null;
            }
        }
    }
}

