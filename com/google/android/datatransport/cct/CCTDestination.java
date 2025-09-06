package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class CCTDestination implements EncodedDestination {
    public static final CCTDestination INSTANCE;
    public static final CCTDestination LEGACY_INSTANCE;
    public final String a;
    public final String b;
    public static final String c;
    public static final Set d;

    // 去混淆评级： 低(28)
    static {
        CCTDestination.c = "https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3";
        CCTDestination.d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding[]{Encoding.of("proto"), Encoding.of("json")})));
        CCTDestination.INSTANCE = new CCTDestination("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3", null);
        CCTDestination.LEGACY_INSTANCE = new CCTDestination("https://firebaselogging-pa.googleapis.com/v1/firelog/legacy/batchlog", "AIzaSyCckkiH8i2ZARwOs1LEzFKld15aOG8ozKo");
    }

    public CCTDestination(@NonNull String s, @Nullable String s1) {
        this.a = s;
        this.b = s1;
    }

    @Nullable
    public byte[] asByteArray() {
        String s = this.a;
        String s1 = this.b;
        if(s1 == null && s == null) {
            return null;
        }
        if(s1 == null) {
            s1 = "";
        }
        return ("1$" + s + "\\" + s1).getBytes(Charset.forName("UTF-8"));
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] arr_b) {
        String s = new String(arr_b, Charset.forName("UTF-8"));
        if(!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] arr_s = s.substring(2).split("\\Q\\\\E", 2);
        if(arr_s.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String s1 = arr_s[0];
        if(s1.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String s2 = arr_s[1];
        if(s2.isEmpty()) {
            s2 = null;
        }
        return new CCTDestination(s1, s2);
    }

    @Nullable
    public String getAPIKey() {
        return this.b;
    }

    @NonNull
    public String getEndPoint() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.Destination
    @Nullable
    public byte[] getExtras() {
        return this.asByteArray();
    }

    @Override  // com.google.android.datatransport.runtime.Destination
    @NonNull
    public String getName() {
        return "cct";
    }

    @Override  // com.google.android.datatransport.runtime.EncodedDestination
    public Set getSupportedEncodings() {
        return CCTDestination.d;
    }
}

