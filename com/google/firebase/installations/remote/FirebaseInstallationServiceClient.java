package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException.Status;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;
import w8.a;

public class FirebaseInstallationServiceClient {
    public final Context a;
    public final Provider b;
    public final a c;
    public static final Pattern d;
    public static final Charset e;

    static {
        FirebaseInstallationServiceClient.d = Pattern.compile("[0-9]+s");
        FirebaseInstallationServiceClient.e = Charset.forName("UTF-8");
    }

    public FirebaseInstallationServiceClient(@NonNull Context context0, @NonNull Provider provider0) {
        this.a = context0;
        this.b = provider0;
        this.c = new a();
    }

    public static URL a(String s) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new FirebaseInstallationsException(malformedURLException0.getMessage(), Status.UNAVAILABLE);
        }
    }

    public static void b(HttpURLConnection httpURLConnection0, String s, String s1, String s2) {
        InputStream inputStream0 = httpURLConnection0.getErrorStream();
        CharSequence charSequence0 = null;
        if(inputStream0 != null) {
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, FirebaseInstallationServiceClient.e));
            try {
                StringBuilder stringBuilder0 = new StringBuilder();
                String s3;
                while((s3 = bufferedReader0.readLine()) != null) {
                    stringBuilder0.append(s3);
                    stringBuilder0.append('\n');
                }
                charSequence0 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", httpURLConnection0.getResponseCode(), httpURLConnection0.getResponseMessage(), stringBuilder0);
            }
            catch(IOException unused_ex) {
            }
            finally {
                bufferedReader0.close();
            }
            try {
            }
            catch(IOException unused_ex) {
            }
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            Log.w("Firebase-Installations", ((String)charSequence0));
            Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + s1 + ", " + s2 + (TextUtils.isEmpty(s) ? "" : ", " + s));
        }
    }

    public final HttpURLConnection c(URL uRL0, String s) {
        String s1;
        HttpURLConnection httpURLConnection0;
        try {
            httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        }
        catch(IOException unused_ex) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
        }
        httpURLConnection0.setConnectTimeout(10000);
        httpURLConnection0.setUseCaches(false);
        httpURLConnection0.setReadTimeout(10000);
        httpURLConnection0.addRequestProperty("Content-Type", "application/json");
        httpURLConnection0.addRequestProperty("Accept", "application/json");
        httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.addRequestProperty("Cache-Control", "no-cache");
        Context context0 = this.a;
        httpURLConnection0.addRequestProperty("X-Android-Package", "net.daum.android.tistoryapp");
        HeartBeatController heartBeatController0 = (HeartBeatController)this.b.get();
        if(heartBeatController0 != null) {
            try {
                httpURLConnection0.addRequestProperty("x-firebase-client", ((String)Tasks.await(heartBeatController0.getHeartBeatsHeader())));
            }
            catch(ExecutionException executionException0) {
                Log.w("ContentValues", "Failed to get heartbeats header", executionException0);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                Log.w("ContentValues", "Failed to get heartbeats header", interruptedException0);
            }
        }
        try {
            s1 = null;
            byte[] arr_b = AndroidUtilsLight.getPackageCertificateHashBytes(context0, "net.daum.android.tistoryapp");
            if(arr_b == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: net.daum.android.tistoryapp");
            }
            else {
                s1 = Hex.bytesToStringUppercase(arr_b, false);
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("ContentValues", "No such package: net.daum.android.tistoryapp", packageManager$NameNotFoundException0);
        }
        httpURLConnection0.addRequestProperty("X-Android-Cert", s1);
        httpURLConnection0.addRequestProperty("x-goog-api-key", s);
        return httpURLConnection0;
    }

    @NonNull
    public InstallationResponse createFirebaseInstallation(@NonNull String s, @Nullable String s1, @NonNull String s2, @NonNull String s3, @Nullable String s4) throws FirebaseInstallationsException {
        InstallationResponse installationResponse0;
        a a0 = this.c;
        if(!a0.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
        }
        URL uRL0 = FirebaseInstallationServiceClient.a(("projects/" + s2 + "/installations"));
        int v = 0;
        while(v <= 1) {
            TrafficStats.setThreadStatsTag(0x8001);
            HttpURLConnection httpURLConnection0 = this.c(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setDoOutput(true);
                if(s4 != null) {
                    httpURLConnection0.addRequestProperty("x-goog-fis-android-iid-migration-auth", s4);
                }
                FirebaseInstallationServiceClient.g(httpURLConnection0, s1, s3);
                int v1 = httpURLConnection0.getResponseCode();
                a0.b(v1);
                if(v1 < 200 || v1 >= 300) {
                    FirebaseInstallationServiceClient.b(httpURLConnection0, s3, s, s2);
                    if(v1 == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", Status.TOO_MANY_REQUESTS);
                    }
                    if(v1 >= 500 && v1 < 600) {
                        goto label_31;
                    }
                    else {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        installationResponse0 = InstallationResponse.builder().setResponseCode(ResponseCode.BAD_CONFIG).build();
                    }
                }
                else {
                    installationResponse0 = FirebaseInstallationServiceClient.e(httpURLConnection0);
                }
                goto label_28;
            }
            catch(AssertionError | IOException unused_ex) {
                goto label_31;
            }
            catch(Throwable throwable0) {
            }
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        label_28:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            return installationResponse0;
        label_31:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++v;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
    }

    public static long d(String s) {
        Preconditions.checkArgument(FirebaseInstallationServiceClient.d.matcher(s).matches(), "Invalid Expiration Timestamp.");
        return s == null || s.length() == 0 ? 0L : Long.parseLong(s.substring(0, s.length() - 1));
    }

    @NonNull
    public void deleteFirebaseInstallation(@NonNull String s, @NonNull String s1, @NonNull String s2, @NonNull String s3) throws FirebaseInstallationsException {
        URL uRL0 = FirebaseInstallationServiceClient.a(("projects/" + s2 + "/installations/" + s1));
        for(int v = 0; v <= 1; ++v) {
            TrafficStats.setThreadStatsTag(0x8002);
            HttpURLConnection httpURLConnection0 = this.c(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("DELETE");
                httpURLConnection0.addRequestProperty("Authorization", "FIS_v2 " + s3);
                int v2 = httpURLConnection0.getResponseCode();
                if(v2 == 200 || v2 == 401 || v2 == 404) {
                    return;
                }
                FirebaseInstallationServiceClient.b(httpURLConnection0, null, s, s2);
                if(v2 != 429 && (v2 < 500 || v2 >= 600)) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", Status.BAD_CONFIG);
                }
            }
            catch(IOException unused_ex) {
            }
            finally {
                httpURLConnection0.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
    }

    public static InstallationResponse e(HttpURLConnection httpURLConnection0) {
        InputStream inputStream0 = httpURLConnection0.getInputStream();
        JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, FirebaseInstallationServiceClient.e));
        Builder tokenResult$Builder0 = TokenResult.builder();
        com.google.firebase.installations.remote.InstallationResponse.Builder installationResponse$Builder0 = InstallationResponse.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("name")) {
                installationResponse$Builder0.setUri(jsonReader0.nextString());
            }
            else if(s.equals("fid")) {
                installationResponse$Builder0.setFid(jsonReader0.nextString());
            }
            else if(s.equals("refreshToken")) {
                installationResponse$Builder0.setRefreshToken(jsonReader0.nextString());
            }
            else if(s.equals("authToken")) {
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    if(s1.equals("token")) {
                        tokenResult$Builder0.setToken(jsonReader0.nextString());
                    }
                    else if(s1.equals("expiresIn")) {
                        tokenResult$Builder0.setTokenExpirationTimestamp(FirebaseInstallationServiceClient.d(jsonReader0.nextString()));
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                installationResponse$Builder0.setAuthToken(tokenResult$Builder0.build());
                jsonReader0.endObject();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        jsonReader0.close();
        inputStream0.close();
        return installationResponse$Builder0.setResponseCode(ResponseCode.OK).build();
    }

    public static TokenResult f(HttpURLConnection httpURLConnection0) {
        InputStream inputStream0 = httpURLConnection0.getInputStream();
        JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, FirebaseInstallationServiceClient.e));
        Builder tokenResult$Builder0 = TokenResult.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("token")) {
                tokenResult$Builder0.setToken(jsonReader0.nextString());
            }
            else if(s.equals("expiresIn")) {
                tokenResult$Builder0.setTokenExpirationTimestamp(FirebaseInstallationServiceClient.d(jsonReader0.nextString()));
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        jsonReader0.close();
        inputStream0.close();
        return tokenResult$Builder0.setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.OK).build();
    }

    public static void g(HttpURLConnection httpURLConnection0, String s, String s1) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = new JSONObject();
            jSONObject0.put("fid", s);
            jSONObject0.put("appId", s1);
            jSONObject0.put("authVersion", "FIS_v2");
            jSONObject0.put("sdkVersion", "a:17.1.0");
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
        FirebaseInstallationServiceClient.i(httpURLConnection0, jSONObject0.toString().getBytes("UTF-8"));
    }

    @NonNull
    public TokenResult generateAuthToken(@NonNull String s, @NonNull String s1, @NonNull String s2, @NonNull String s3) throws FirebaseInstallationsException {
        a a0 = this.c;
        if(!a0.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
        }
        URL uRL0 = FirebaseInstallationServiceClient.a(("projects/" + s2 + "/installations/" + s1 + "/authTokens:generate"));
        int v = 0;
        while(v <= 1) {
            TrafficStats.setThreadStatsTag(0x8003);
            HttpURLConnection httpURLConnection0 = this.c(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.addRequestProperty("Authorization", "FIS_v2 " + s3);
                httpURLConnection0.setDoOutput(true);
                FirebaseInstallationServiceClient.h(httpURLConnection0);
                int v2 = httpURLConnection0.getResponseCode();
                a0.b(v2);
                if(v2 >= 200 && v2 < 300) {
                    return FirebaseInstallationServiceClient.f(httpURLConnection0);
                }
                FirebaseInstallationServiceClient.b(httpURLConnection0, null, s, s2);
                switch(v2) {
                    case 401: 
                    case 404: {
                        return TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR).build();
                    }
                    case 429: {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", Status.TOO_MANY_REQUESTS);
                    label_22:
                        if(v2 < 500 || v2 >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            return TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG).build();
                        }
                        break;
                    }
                    default: {
                        goto label_22;
                    }
                }
            }
            catch(AssertionError | IOException unused_ex) {
            }
            finally {
                httpURLConnection0.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            ++v;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
    }

    public static void h(HttpURLConnection httpURLConnection0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("sdkVersion", "a:17.1.0");
            new JSONObject().put("installation", jSONObject0);
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
        FirebaseInstallationServiceClient.i(httpURLConnection0, "{\"installation\":{\"sdkVersion\":\"a:17.1.0\"}}".getBytes("UTF-8"));
    }

    public static void i(HttpURLConnection httpURLConnection0, byte[] arr_b) {
        OutputStream outputStream0 = httpURLConnection0.getOutputStream();
        if(outputStream0 == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0);
        int v = FIN.finallyOpen$NT();
        gZIPOutputStream0.write(arr_b);
        try {
            FIN.finallyCodeBegin$NT(v);
            gZIPOutputStream0.close();
            outputStream0.close();
            FIN.finallyCodeEnd$NT(v);
        }
        catch(IOException unused_ex) {
        }
    }
}

