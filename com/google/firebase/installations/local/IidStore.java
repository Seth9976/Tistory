package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class IidStore {
    public final SharedPreferences a;
    public final String b;
    public static final String[] c;

    static {
        IidStore.c = new String[]{"*", "FCM", "GCM", ""};
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences0, @Nullable String s) {
        this.a = sharedPreferences0;
        this.b = s;
    }

    public IidStore(@NonNull FirebaseApp firebaseApp0) {
        this.a = firebaseApp0.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        String s = firebaseApp0.getOptions().getGcmSenderId();
        if(s == null) {
            s = firebaseApp0.getOptions().getApplicationId();
            if(s.startsWith("1:") || s.startsWith("2:")) {
                String[] arr_s = s.split(":");
                if(arr_s.length == 4) {
                    s = arr_s[1];
                    if(s.isEmpty()) {
                        s = null;
                    }
                }
                else {
                    s = null;
                }
            }
        }
        this.b = s;
    }

    public final String a() {
        PublicKey publicKey0;
        synchronized(this.a) {
            String s = null;
            String s1 = this.a.getString("|S||P|", null);
            if(s1 == null) {
                return null;
            }
            try {
                byte[] arr_b = Base64.decode(s1, 8);
                publicKey0 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arr_b));
            }
            catch(IllegalArgumentException | InvalidKeySpecException | NoSuchAlgorithmException illegalArgumentException0) {
                Log.w("ContentValues", "Invalid key stored " + illegalArgumentException0);
                publicKey0 = null;
            }
            if(publicKey0 == null) {
                return null;
            }
            byte[] arr_b1 = publicKey0.getEncoded();
            try {
                byte[] arr_b2 = MessageDigest.getInstance("SHA1").digest(arr_b1);
                arr_b2[0] = (byte)((arr_b2[0] & 15) + 0x70 & 0xFF);
                s = Base64.encodeToString(arr_b2, 0, 8, 11);
            }
            catch(NoSuchAlgorithmException unused_ex) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return s;
        }
    }

    @Nullable
    public String readIid() {
        String s;
        synchronized(this.a) {
            synchronized(this.a) {
                s = this.a.getString("|S|id", null);
            }
            return s != null ? s : this.a();
        }
    }

    @Nullable
    public String readToken() {
        synchronized(this.a) {
            String[] arr_s = IidStore.c;
            for(int v1 = 0; true; ++v1) {
                String s = null;
                if(v1 >= 4) {
                    break;
                }
                String s1 = this.a.getString("|T|" + this.b + "|" + arr_s[v1], null);
                if(s1 != null && !s1.isEmpty()) {
                    if(s1.startsWith("{")) {
                        try {
                            s = new JSONObject(s1).getString("token");
                        }
                        catch(JSONException unused_ex) {
                        }
                        s1 = s;
                    }
                    return s1;
                }
            }
            return null;
        }
    }
}

