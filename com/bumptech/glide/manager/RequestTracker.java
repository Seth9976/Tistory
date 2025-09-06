package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class RequestTracker {
    public final Set a;
    public final HashSet b;
    public boolean c;

    public RequestTracker() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.b = new HashSet();
    }

    public boolean clearAndRemove(@Nullable Request request0) {
        if(request0 == null) {
            return true;
        }
        boolean z = this.a.remove(request0);
        if(!this.b.remove(request0) && !z) {
            return false;
        }
        request0.clear();
        return true;
    }

    public void clearRequests() {
        for(Object object0: Util.getSnapshot(this.a)) {
            this.clearAndRemove(((Request)object0));
        }
        this.b.clear();
    }

    public boolean isPaused() {
        return this.c;
    }

    public void pauseAllRequests() {
        this.c = true;
        for(Object object0: Util.getSnapshot(this.a)) {
            Request request0 = (Request)object0;
            if(request0.isRunning() || request0.isComplete()) {
                request0.clear();
                this.b.add(request0);
            }
        }
    }

    public void pauseRequests() {
        this.c = true;
        for(Object object0: Util.getSnapshot(this.a)) {
            Request request0 = (Request)object0;
            if(request0.isRunning()) {
                request0.pause();
                this.b.add(request0);
            }
        }
    }

    public void restartRequests() {
        for(Object object0: Util.getSnapshot(this.a)) {
            Request request0 = (Request)object0;
            if(!request0.isComplete() && !request0.isCleared()) {
                request0.clear();
                if(this.c) {
                    this.b.add(request0);
                }
                else {
                    request0.begin();
                }
            }
        }
    }

    public void resumeRequests() {
        this.c = false;
        for(Object object0: Util.getSnapshot(this.a)) {
            Request request0 = (Request)object0;
            if(!request0.isComplete() && !request0.isRunning()) {
                request0.begin();
            }
        }
        this.b.clear();
    }

    public void runRequest(@NonNull Request request0) {
        this.a.add(request0);
        if(!this.c) {
            request0.begin();
            return;
        }
        request0.clear();
        if(Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.b.add(request0);
    }

    @Override
    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}

