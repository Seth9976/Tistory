package androidx.work.impl.utils;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.metadata.a;
import com.google.firebase.crashlytics.internal.metadata.c;
import com.google.firebase.crashlytics.internal.metadata.d;
import com.google.firebase.crashlytics.internal.metadata.i;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.kakao.kphotopicker.PickerViewModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class e implements Callable {
    public final int a;
    public final Object b;

    public e(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final Object call() {
        BufferedWriter bufferedWriter2;
        String s2;
        Map map0;
        BufferedWriter bufferedWriter1;
        c c0;
        String s;
        boolean z = false;
        BufferedWriter bufferedWriter0 = null;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((IdGenerator)this.b), "this$0");
                return IdGeneratorKt.access$nextId(((IdGenerator)this.b).a, "next_alarm_manager_id");
            }
            case 1: {
                UserMetadata userMetadata0 = (UserMetadata)this.b;
                synchronized(userMetadata0.f) {
                    if(userMetadata0.f.isMarked()) {
                        s = userMetadata0.getUserId();
                        userMetadata0.f.set(s, false);
                        z = true;
                    }
                    else {
                        s = null;
                    }
                }
                if(z) {
                    File file0 = userMetadata0.a.a.getSessionFile(userMetadata0.c, "user-data");
                    try {
                        c0 = new c();  // 初始化器: Lorg/json/JSONObject;-><init>()V
                        c0.put("userId", s);
                        bufferedWriter1 = null;
                        bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), d.b));
                        goto label_29;
                    }
                    catch(Exception exception0) {
                        goto label_33;
                    }
                    catch(Throwable throwable0) {
                    }
                    CommonUtils.closeOrLog(bufferedWriter0, "Failed to close user metadata file.");
                    throw throwable0;
                    try {
                        try {
                        label_29:
                            bufferedWriter1.write(c0.toString());
                            bufferedWriter1.flush();
                        }
                        catch(Exception exception0) {
                        label_33:
                            Logger.getLogger().w("Error serializing user metadata.", exception0);
                        }
                    }
                    catch(Throwable throwable0) {
                        bufferedWriter0 = bufferedWriter1;
                        CommonUtils.closeOrLog(bufferedWriter0, "Failed to close user metadata file.");
                        throw throwable0;
                    }
                    CommonUtils.closeOrLog(bufferedWriter1, "Failed to close user metadata file.");
                    return null;
                }
                return null;
            }
            case 2: {
                i i0 = (i)this.b;
                i0.b.set(null);
                synchronized(i0) {
                    if(i0.a.isMarked()) {
                        a a0 = (a)i0.a.getReference();
                        synchronized(a0) {
                            map0 = Collections.unmodifiableMap(new HashMap(a0.a));
                        }
                        a a1 = (a)i0.a.getReference();
                        i0.a.set(a1, false);
                    }
                    else {
                        map0 = null;
                    }
                }
                if(map0 != null) {
                    d d0 = i0.d.a;
                    String s1 = i0.d.c;
                    File file1 = i0.c ? d0.a.getSessionFile(s1, "internal-keys") : d0.a.getSessionFile(s1, "keys");
                    try {
                        s2 = new JSONObject(map0).toString();
                        bufferedWriter2 = null;
                        bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1), d.b));
                        goto label_73;
                    }
                    catch(Exception exception1) {
                        goto label_77;
                    }
                    catch(Throwable throwable2) {
                    }
                    CommonUtils.closeOrLog(bufferedWriter0, "Failed to close key/value metadata file.");
                    throw throwable2;
                    try {
                        try {
                        label_73:
                            bufferedWriter2.write(s2);
                            bufferedWriter2.flush();
                        }
                        catch(Exception exception1) {
                        label_77:
                            Logger.getLogger().w("Error serializing key/value metadata.", exception1);
                            d.d(file1);
                        }
                    }
                    catch(Throwable throwable2) {
                        bufferedWriter0 = bufferedWriter2;
                        CommonUtils.closeOrLog(bufferedWriter0, "Failed to close key/value metadata file.");
                        throw throwable2;
                    }
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                    return null;
                }
                return null;
            }
            case 3: {
                FirebaseInstallations firebaseInstallations0 = (FirebaseInstallations)this.b;
                synchronized(firebaseInstallations0) {
                    firebaseInstallations0.j = null;
                }
                PersistedInstallationEntry persistedInstallationEntry0 = firebaseInstallations0.c();
                if(persistedInstallationEntry0.isRegistered()) {
                    String s3 = firebaseInstallations0.a.getOptions().getApiKey();
                    String s4 = persistedInstallationEntry0.getFirebaseInstallationId();
                    String s5 = firebaseInstallations0.a.getOptions().getProjectId();
                    String s6 = persistedInstallationEntry0.getRefreshToken();
                    firebaseInstallations0.b.deleteFirebaseInstallation(s3, s4, s5, s6);
                }
                firebaseInstallations0.d(persistedInstallationEntry0.withNoGeneratedFid());
                return null;
            }
            default: {
                Intrinsics.checkNotNullParameter(((PickerViewModel)this.b), "this$0");
                return ((PickerViewModel)this.b).H0.getFolders();
            }
        }
    }
}

