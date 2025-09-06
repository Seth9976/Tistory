package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

public class CachedSettingsIo {
    public final File a;

    public CachedSettingsIo(FileStore fileStore0) {
        this.a = fileStore0.getCommonFile("com.crashlytics.settings.json");
    }

    public JSONObject readCachedSettings() {
        JSONObject jSONObject1;
        FileInputStream fileInputStream0;
        Logger.getLogger().d("Checking for cached settings...");
        JSONObject jSONObject0 = null;
        try {
            File file0 = this.a;
            if(file0.exists()) {
                fileInputStream0 = new FileInputStream(file0);
                jSONObject1 = new JSONObject(CommonUtils.streamToString(fileInputStream0));
                jSONObject0 = fileInputStream0;
            }
            else {
                goto label_10;
            }
            goto label_26;
        }
        catch(Exception exception0) {
            goto label_14;
        }
        catch(Throwable throwable0) {
            fileInputStream0 = null;
            throwable1 = throwable0;
            CommonUtils.closeOrLog(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
        try {
            jSONObject1 = new JSONObject(CommonUtils.streamToString(fileInputStream0));
            jSONObject0 = fileInputStream0;
            goto label_26;
        }
        catch(Exception exception0) {
            goto label_15;
            try {
            label_10:
                Logger.getLogger().v("Settings file does not exist.");
                jSONObject1 = null;
                goto label_26;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                fileInputStream0 = null;
                throwable1 = throwable0;
                CommonUtils.closeOrLog(fileInputStream0, "Error while closing settings cache file.");
                throw throwable1;
            }
        label_14:
            fileInputStream0 = null;
            try {
            label_15:
                Logger.getLogger().e("Failed to fetch cached settings", exception0);
                goto label_19;
            }
            catch(Throwable throwable1) {
            }
            CommonUtils.closeOrLog(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
        catch(Throwable throwable1) {
            CommonUtils.closeOrLog(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
    label_19:
        CommonUtils.closeOrLog(fileInputStream0, "Error while closing settings cache file.");
        return null;
    label_26:
        CommonUtils.closeOrLog(((Closeable)jSONObject0), "Error while closing settings cache file.");
        return jSONObject1;
    }

    public void writeCachedSettings(long v, JSONObject jSONObject0) {
        FileWriter fileWriter1;
        FileWriter fileWriter0;
        Logger.getLogger().v("Writing settings to cache file...");
        if(jSONObject0 != null) {
            try {
                fileWriter0 = null;
                jSONObject0.put("expires_at", v);
                fileWriter1 = new FileWriter(this.a);
                goto label_8;
            }
            catch(Exception exception0) {
                goto label_13;
                try {
                label_8:
                    fileWriter1.write(jSONObject0.toString());
                    fileWriter1.flush();
                    goto label_23;
                }
                catch(Exception exception0) {
                }
                catch(Throwable throwable0) {
                    fileWriter0 = fileWriter1;
                    CommonUtils.closeOrLog(fileWriter0, "Failed to close settings writer.");
                    throw throwable0;
                }
                fileWriter0 = fileWriter1;
                try {
                label_13:
                    Logger.getLogger().e("Failed to cache settings", exception0);
                    goto label_17;
                }
                catch(Throwable throwable0) {
                }
                CommonUtils.closeOrLog(fileWriter0, "Failed to close settings writer.");
                throw throwable0;
            }
            catch(Throwable throwable0) {
                CommonUtils.closeOrLog(fileWriter0, "Failed to close settings writer.");
                throw throwable0;
            }
        label_17:
            CommonUtils.closeOrLog(fileWriter0, "Failed to close settings writer.");
            return;
        label_23:
            CommonUtils.closeOrLog(fileWriter1, "Failed to close settings writer.");
        }
    }
}

