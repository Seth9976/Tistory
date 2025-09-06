package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.b;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseInstallations implements FirebaseInstallationsApi {
    public final FirebaseApp a;
    public final FirebaseInstallationServiceClient b;
    public final PersistedInstallation c;
    public final Utils d;
    public final Lazy e;
    public final RandomFidGenerator f;
    public final Object g;
    public final ThreadPoolExecutor h;
    public final ThreadPoolExecutor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;
    public static final Object m;
    public static final d n;

    static {
        FirebaseInstallations.m = new Object();
        FirebaseInstallations.n = new d();
    }

    public FirebaseInstallations(FirebaseApp firebaseApp0, Provider provider0) {
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 30L, timeUnit0, new LinkedBlockingQueue(), FirebaseInstallations.n);
        FirebaseInstallationServiceClient firebaseInstallationServiceClient0 = new FirebaseInstallationServiceClient(firebaseApp0.getApplicationContext(), provider0);
        PersistedInstallation persistedInstallation0 = new PersistedInstallation(firebaseApp0);
        Utils utils0 = Utils.getInstance();
        Lazy lazy0 = new Lazy(new b(firebaseApp0, 2));
        RandomFidGenerator randomFidGenerator0 = new RandomFidGenerator();
        super();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = firebaseApp0;
        this.b = firebaseInstallationServiceClient0;
        this.c = persistedInstallation0;
        this.d = utils0;
        this.e = lazy0;
        this.f = randomFidGenerator0;
        this.h = threadPoolExecutor0;
        this.i = new ThreadPoolExecutor(0, 1, 30L, timeUnit0, new LinkedBlockingQueue(), FirebaseInstallations.n);
    }

    public final void a(boolean z) {
        PersistedInstallationEntry persistedInstallationEntry0;
        String s;
        synchronized(FirebaseInstallations.m) {
            a7.b b0 = a7.b.a(this.a.getApplicationContext());
            try {
                persistedInstallationEntry0 = this.c.readPersistedInstallationEntryValue();
                if(persistedInstallationEntry0.isNotGenerated()) {
                    if((this.a.getName().equals("CHIME_ANDROID_SDK") || this.a.isDefaultApp()) && persistedInstallationEntry0.shouldAttemptMigration()) {
                        s = ((IidStore)this.e.get()).readIid();
                        if(TextUtils.isEmpty(s)) {
                            s = "dGZN_iU2RJ6y8pccZWZ5aT";
                        }
                    }
                    else {
                        s = "dGZN_iU2RJ6y8pccZWZ5aT";
                    }
                    PersistedInstallationEntry persistedInstallationEntry1 = persistedInstallationEntry0.withUnregisteredFid(s);
                    persistedInstallationEntry0 = this.c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry1);
                }
            }
            finally {
                if(b0 != null) {
                    b0.k();
                }
            }
        }
        if(z) {
            persistedInstallationEntry0 = persistedInstallationEntry0.withClearedAuthToken();
        }
        this.h(persistedInstallationEntry0);
        c c0 = new c(this, z, 1);
        this.i.execute(c0);
    }

    public final PersistedInstallationEntry b(PersistedInstallationEntry persistedInstallationEntry0) {
        String s = this.a.getOptions().getApiKey();
        String s1 = persistedInstallationEntry0.getFirebaseInstallationId();
        String s2 = this.a.getOptions().getProjectId();
        String s3 = persistedInstallationEntry0.getRefreshToken();
        TokenResult tokenResult0 = this.b.generateAuthToken(s, s1, s2, s3);
        switch(e.b[tokenResult0.getResponseCode().ordinal()]) {
            case 1: {
                return persistedInstallationEntry0.withAuthToken(tokenResult0.getToken(), tokenResult0.getTokenExpirationTimestamp(), this.d.currentTimeInSecs());
            }
            case 2: {
                return persistedInstallationEntry0.withFisError("BAD CONFIG");
            }
            case 3: {
                synchronized(this) {
                    this.j = null;
                }
                return persistedInstallationEntry0.withNoGeneratedFid();
            }
            default: {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
            }
        }
    }

    public final PersistedInstallationEntry c() {
        PersistedInstallationEntry persistedInstallationEntry0;
        synchronized(FirebaseInstallations.m) {
            a7.b b0 = a7.b.a(this.a.getApplicationContext());
            try {
                persistedInstallationEntry0 = this.c.readPersistedInstallationEntryValue();
            }
            catch(Throwable throwable0) {
                if(b0 != null) {
                    b0.k();
                }
                throw throwable0;
            }
            if(b0 != null) {
                b0.k();
            }
            return persistedInstallationEntry0;
        }
    }

    public final void d(PersistedInstallationEntry persistedInstallationEntry0) {
        synchronized(FirebaseInstallations.m) {
            a7.b b0 = a7.b.a(this.a.getApplicationContext());
            try {
                this.c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry0);
            }
            catch(Throwable throwable0) {
                if(b0 != null) {
                    b0.k();
                }
                throw throwable0;
            }
            if(b0 != null) {
                b0.k();
            }
        }
    }

    @Override  // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task delete() {
        androidx.work.impl.utils.e e0 = new androidx.work.impl.utils.e(this, 3);
        return Tasks.call(this.h, e0);
    }

    public final void e() {
        Preconditions.checkNotEmpty(this.a.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.a.getOptions().getProjectId(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.a.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(this.a.getOptions().getApplicationId().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String s = this.a.getOptions().getApiKey();
        Preconditions.checkArgument(Utils.b.matcher(s).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final PersistedInstallationEntry f(PersistedInstallationEntry persistedInstallationEntry0) {
        String s = persistedInstallationEntry0.getFirebaseInstallationId() == null || persistedInstallationEntry0.getFirebaseInstallationId().length() != 11 ? null : ((IidStore)this.e.get()).readToken();
        String s1 = this.a.getOptions().getApiKey();
        String s2 = persistedInstallationEntry0.getFirebaseInstallationId();
        String s3 = this.a.getOptions().getProjectId();
        String s4 = this.a.getOptions().getApplicationId();
        InstallationResponse installationResponse0 = this.b.createFirebaseInstallation(s1, s2, s3, s4, s);
        switch(e.a[installationResponse0.getResponseCode().ordinal()]) {
            case 1: {
                return persistedInstallationEntry0.withRegisteredFid(installationResponse0.getFid(), installationResponse0.getRefreshToken(), this.d.currentTimeInSecs(), installationResponse0.getAuthToken().getToken(), installationResponse0.getAuthToken().getTokenExpirationTimestamp());
            }
            case 2: {
                return persistedInstallationEntry0.withFisError("BAD CONFIG");
            }
            default: {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
            }
        }
    }

    public final void g(Exception exception0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((StateListener)object1).onException(exception0)) {
                    iterator0.remove();
                }
            }
        }
    }

    @Override  // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task getId() {
        String s;
        this.e();
        synchronized(this) {
            s = this.j;
        }
        if(s != null) {
            return Tasks.forResult(s);
        }
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        h h0 = new h(taskCompletionSource0);
        synchronized(this.g) {
            this.l.add(h0);
        }
        androidx.activity.h h1 = new androidx.activity.h(this, 14);
        this.h.execute(h1);
        return taskCompletionSource0.getTask();
    }

    @NonNull
    public static FirebaseInstallations getInstance() {
        return FirebaseInstallations.getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    public static FirebaseInstallations getInstance(@NonNull FirebaseApp firebaseApp0) {
        Preconditions.checkArgument(firebaseApp0 != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations)firebaseApp0.get(FirebaseInstallationsApi.class);
    }

    @Override  // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task getToken(boolean z) {
        this.e();
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        g g0 = new g(this.d, taskCompletionSource0);
        synchronized(this.g) {
            this.l.add(g0);
        }
        c c0 = new c(this, z, 0);
        this.h.execute(c0);
        return taskCompletionSource0.getTask();
    }

    public final void h(PersistedInstallationEntry persistedInstallationEntry0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((StateListener)object1).onStateReached(persistedInstallationEntry0)) {
                    iterator0.remove();
                }
            }
        }
    }

    @Override  // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public FidListenerHandle registerFidListener(@NonNull FidListener fidListener0) {
        synchronized(this) {
            this.k.add(fidListener0);
            return new a7.b(this, fidListener0, false, 16);
        }
    }
}

