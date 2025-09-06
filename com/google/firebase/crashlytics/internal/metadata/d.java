package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class d {
    public final FileStore a;
    public static final Charset b;

    static {
        d.b = Charset.forName("UTF-8");
    }

    public d(FileStore fileStore0) {
        this.a = fileStore0;
    }

    public static HashMap a(String s) {
        JSONObject jSONObject0 = new JSONObject(s);
        HashMap hashMap0 = new HashMap();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            hashMap0.put(s1, (jSONObject0.isNull(s1) ? null : jSONObject0.optString(s1, null)));
        }
        return hashMap0;
    }

    public final Map b(String s, boolean z) {
        Map map0;
        Exception exception1;
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        File file0 = z ? this.a.getSessionFile(s, "internal-keys") : this.a.getSessionFile(s, "keys");
        if(file0.exists() && file0.length() != 0L) {
            try {
                fileInputStream0 = null;
                fileInputStream1 = null;
                fileInputStream1 = new FileInputStream(file0);
            }
            catch(Exception exception0) {
                exception1 = exception0;
                goto label_14;
            }
            catch(Throwable throwable0) {
                CommonUtils.closeOrLog(fileInputStream0, "Failed to close user metadata file.");
                throw throwable0;
            }
            try {
                map0 = d.a(CommonUtils.streamToString(fileInputStream1));
                goto label_22;
            }
            catch(Exception exception1) {
                try {
                label_14:
                    Logger.getLogger().w("Error deserializing user metadata.", exception1);
                    d.d(file0);
                }
                catch(Throwable throwable0) {
                    fileInputStream0 = fileInputStream1;
                    CommonUtils.closeOrLog(fileInputStream0, "Failed to close user metadata file.");
                    throw throwable0;
                }
                CommonUtils.closeOrLog(fileInputStream1, "Failed to close user metadata file.");
                return Collections.emptyMap();
            }
            catch(Throwable throwable0) {
                fileInputStream0 = fileInputStream1;
            }
            CommonUtils.closeOrLog(fileInputStream0, "Failed to close user metadata file.");
            throw throwable0;
        label_22:
            CommonUtils.closeOrLog(fileInputStream1, "Failed to close user metadata file.");
            return map0;
        }
        d.d(file0);
        return Collections.emptyMap();
    }

    public final String c(String s) {
        String s1;
        FileInputStream fileInputStream1;
        File file0 = this.a.getSessionFile(s, "user-data");
        FileInputStream fileInputStream0 = null;
        if(file0.exists() && file0.length() != 0L) {
            try {
                fileInputStream1 = null;
                fileInputStream1 = new FileInputStream(file0);
                goto label_8;
            }
            catch(Exception exception0) {
                goto label_13;
            }
            catch(Throwable throwable0) {
            }
            CommonUtils.closeOrLog(fileInputStream0, "Failed to close user metadata file.");
            throw throwable0;
            try {
                try {
                label_8:
                    JSONObject jSONObject0 = new JSONObject(CommonUtils.streamToString(fileInputStream1));
                    s1 = jSONObject0.isNull("userId") ? null : jSONObject0.optString("userId", null);
                    Logger.getLogger().d("Loaded userId " + s1 + " for session " + s);
                    goto label_21;
                }
                catch(Exception exception0) {
                }
            label_13:
                Logger.getLogger().w("Error deserializing user metadata.", exception0);
                d.d(file0);
            }
            catch(Throwable throwable0) {
                fileInputStream0 = fileInputStream1;
                CommonUtils.closeOrLog(fileInputStream0, "Failed to close user metadata file.");
                throw throwable0;
            }
            CommonUtils.closeOrLog(fileInputStream1, "Failed to close user metadata file.");
            return null;
        label_21:
            CommonUtils.closeOrLog(fileInputStream1, "Failed to close user metadata file.");
            return s1;
        }
        Logger.getLogger().d("No userId set for session " + s);
        d.d(file0);
        return null;
    }

    public static void d(File file0) {
        if(file0.exists() && file0.delete()) {
            Logger.getLogger().i("Deleted corrupt file: " + file0.getAbsolutePath());
        }
    }
}

