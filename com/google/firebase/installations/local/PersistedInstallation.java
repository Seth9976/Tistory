package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {
    public static enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR;

    }

    public File a;
    public final FirebaseApp b;

    public PersistedInstallation(@NonNull FirebaseApp firebaseApp0) {
        this.b = firebaseApp0;
    }

    public final File a() {
        if(this.a == null) {
            synchronized(this) {
                if(this.a == null) {
                    this.a = new File(this.b.getApplicationContext().getFilesDir(), "PersistedInstallation." + this.b.getPersistenceKey() + ".json");
                }
            }
        }
        return this.a;
    }

    public void clearForTesting() {
        this.a().delete();
    }

    @NonNull
    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(@NonNull PersistedInstallationEntry persistedInstallationEntry0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("Fid", persistedInstallationEntry0.getFirebaseInstallationId());
            jSONObject0.put("Status", persistedInstallationEntry0.getRegistrationStatus().ordinal());
            jSONObject0.put("AuthToken", persistedInstallationEntry0.getAuthToken());
            jSONObject0.put("RefreshToken", persistedInstallationEntry0.getRefreshToken());
            jSONObject0.put("TokenCreationEpochInSecs", persistedInstallationEntry0.getTokenCreationEpochInSecs());
            jSONObject0.put("ExpiresInSecs", persistedInstallationEntry0.getExpiresInSecs());
            jSONObject0.put("FisError", persistedInstallationEntry0.getFisError());
            File file0 = File.createTempFile("PersistedInstallation", "tmp", this.b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            fileOutputStream0.write(jSONObject0.toString().getBytes("UTF-8"));
            fileOutputStream0.close();
            file0.renameTo(this.a());
        }
        catch(JSONException | IOException unused_ex) {
        }
        return persistedInstallationEntry0;
    }

    @NonNull
    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject jSONObject0;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x4000];
        try(FileInputStream fileInputStream0 = new FileInputStream(this.a())) {
            int v;
            while((v = fileInputStream0.read(arr_b, 0, 0x4000)) >= 0) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            jSONObject0 = new JSONObject(byteArrayOutputStream0.toString());
        }
        catch(IOException | JSONException unused_ex) {
            jSONObject0 = new JSONObject();
        }
        String s = jSONObject0.optString("Fid", null);
        int v1 = jSONObject0.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String s1 = jSONObject0.optString("AuthToken", null);
        String s2 = jSONObject0.optString("RefreshToken", null);
        long v2 = jSONObject0.optLong("TokenCreationEpochInSecs", 0L);
        long v3 = jSONObject0.optLong("ExpiresInSecs", 0L);
        String s3 = jSONObject0.optString("FisError", null);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(s).setRegistrationStatus(RegistrationStatus.values()[v1]).setAuthToken(s1).setRefreshToken(s2).setTokenCreationEpochInSecs(v2).setExpiresInSecs(v3).setFisError(s3).build();
    }
}

