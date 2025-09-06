package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.e;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";
    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 0x40;
    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 0x400;
    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 0x2000;
    public static final String USERDATA_FILENAME = "user-data";
    public final d a;
    public final CrashlyticsBackgroundWorker b;
    public final String c;
    public final i d;
    public final i e;
    public final AtomicMarkableReference f;

    public UserMetadata(String s, FileStore fileStore0, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker0) {
        this.d = new i(this, false);
        this.e = new i(this, true);
        this.f = new AtomicMarkableReference(null, false);
        this.c = s;
        this.a = new d(fileStore0);
        this.b = crashlyticsBackgroundWorker0;
    }

    public Map getCustomKeys() {
        a a0 = (a)this.d.a.getReference();
        synchronized(a0) {
            return Collections.unmodifiableMap(new HashMap(a0.a));
        }
    }

    public Map getInternalKeys() {
        a a0 = (a)this.e.a.getReference();
        synchronized(a0) {
            return Collections.unmodifiableMap(new HashMap(a0.a));
        }
    }

    @Nullable
    public String getUserId() {
        return (String)this.f.getReference();
    }

    public static UserMetadata loadFromExistingSession(String s, FileStore fileStore0, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker0) {
        d d0 = new d(fileStore0);
        UserMetadata userMetadata0 = new UserMetadata(s, fileStore0, crashlyticsBackgroundWorker0);
        ((a)userMetadata0.d.a.getReference()).c(d0.b(s, false));
        ((a)userMetadata0.e.a.getReference()).c(d0.b(s, true));
        String s1 = d0.c(s);
        userMetadata0.f.set(s1, false);
        return userMetadata0;
    }

    @Nullable
    public static String readUserId(String s, FileStore fileStore0) {
        return new d(fileStore0).c(s);
    }

    public boolean setCustomKey(String s, String s1) {
        return this.d.a(s, s1);
    }

    public void setCustomKeys(Map map0) {
        i i0 = this.d;
        synchronized(i0) {
            ((a)i0.a.getReference()).c(map0);
            a a0 = (a)i0.a.getReference();
            i0.a.set(a0, true);
        }
        e e0 = new e(i0, 2);
        AtomicReference atomicReference0 = i0.b;
        do {
            if(atomicReference0.compareAndSet(null, e0)) {
                i0.d.b.submit(e0);
                return;
            }
        }
        while(atomicReference0.get() == null);
    }

    public boolean setInternalKey(String s, String s1) {
        return this.e.a(s, s1);
    }

    public void setUserId(String s) {
        String s1 = a.a(0x400, s);
        synchronized(this.f) {
            if(CommonUtils.nullSafeEquals(s1, ((String)this.f.getReference()))) {
                return;
            }
            this.f.set(s1, true);
        }
        e e0 = new e(this, 1);
        this.b.submit(e0);
    }
}

