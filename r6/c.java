package r6;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.app.h;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo.ClientType;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal.Builder;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TimeZone;

public final class c implements TransportBackend {
    public final DataEncoder a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final Clock e;
    public final Clock f;
    public final int g;

    public c(Context context0, Clock clock0, Clock clock1) {
        this.a = BatchedLogRequest.createDataEncoder();
        this.c = context0;
        this.b = (ConnectivityManager)context0.getSystemService("connectivity");
        this.d = c.a("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3");
        this.e = clock1;
        this.f = clock0;
        this.g = 130000;
    }

    public static URL a(String s) {
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new IllegalArgumentException("Invalid url: " + s, malformedURLException0);
        }
    }

    @Override  // com.google.android.datatransport.runtime.backends.TransportBackend
    public final EventInternal decorate(EventInternal eventInternal0) {
        int v;
        NetworkInfo networkInfo0 = this.b.getActiveNetworkInfo();
        Builder eventInternal$Builder0 = eventInternal0.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata("device", Build.DEVICE).addMetadata("product", Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        Builder eventInternal$Builder1 = eventInternal$Builder0.addMetadata("tz-offset", ((long)(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000))).addMetadata("net-type", (networkInfo0 == null ? NetworkType.NONE.getValue() : networkInfo0.getType()));
        if(networkInfo0 == null) {
            v = MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        else {
            v = networkInfo0.getSubtype();
            if(v == -1) {
                v = MobileSubtype.COMBINED.getValue();
            }
            else if(MobileSubtype.forNumber(v) == null) {
                v = 0;
            }
        }
        Builder eventInternal$Builder2 = eventInternal$Builder1.addMetadata("mobile-subtype", v).addMetadata("country", Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage()).addMetadata("mcc_mnc", ((TelephonyManager)this.c.getSystemService("phone")).getSimOperator());
        try {
            return eventInternal$Builder2.addMetadata("application_build", Integer.toString(this.c.getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0).versionCode)).build();
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Logging.e("CctTransportBackend", "Unable to find version code for package", packageManager$NameNotFoundException0);
            return eventInternal$Builder2.addMetadata("application_build", "-1").build();
        }
    }

    @Override  // com.google.android.datatransport.runtime.backends.TransportBackend
    public final BackendResponse send(BackendRequest backendRequest0) {
        com.google.android.datatransport.cct.internal.LogEvent.Builder logEvent$Builder0;
        HashMap hashMap0 = new HashMap();
        for(Object object0: backendRequest0.getEvents()) {
            EventInternal eventInternal0 = (EventInternal)object0;
            String s = eventInternal0.getTransportName();
            if(hashMap0.containsKey(s)) {
                ((List)hashMap0.get(s)).add(eventInternal0);
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(eventInternal0);
                hashMap0.put(s, arrayList0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            EventInternal eventInternal1 = (EventInternal)((List)map$Entry0.getValue()).get(0);
            com.google.android.datatransport.cct.internal.LogRequest.Builder logRequest$Builder0 = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(this.f.getTime()).setRequestUptimeMs(this.e.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(eventInternal1.getInteger("sdk-version")).setModel(eventInternal1.get("model")).setHardware(eventInternal1.get("hardware")).setDevice(eventInternal1.get("device")).setProduct(eventInternal1.get("product")).setOsBuild(eventInternal1.get("os-uild")).setManufacturer(eventInternal1.get("manufacturer")).setFingerprint(eventInternal1.get("fingerprint")).setCountry(eventInternal1.get("country")).setLocale(eventInternal1.get("locale")).setMccMnc(eventInternal1.get("mcc_mnc")).setApplicationBuild(eventInternal1.get("application_build")).build()).build());
            try {
                logRequest$Builder0.setSource(Integer.parseInt(((String)map$Entry0.getKey())));
            }
            catch(NumberFormatException unused_ex) {
                logRequest$Builder0.setSource(((String)map$Entry0.getKey()));
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: ((List)map$Entry0.getValue())) {
                EventInternal eventInternal2 = (EventInternal)object2;
                EncodedPayload encodedPayload0 = eventInternal2.getEncodedPayload();
                Encoding encoding0 = encodedPayload0.getEncoding();
                if(encoding0.equals(Encoding.of("proto"))) {
                    logEvent$Builder0 = LogEvent.protoBuilder(encodedPayload0.getBytes());
                }
                else if(encoding0.equals(Encoding.of("json"))) {
                    logEvent$Builder0 = LogEvent.jsonBuilder(new String(encodedPayload0.getBytes(), Charset.forName("UTF-8")));
                }
                else {
                    goto label_40;
                }
                logEvent$Builder0.setEventTimeMs(eventInternal2.getEventMillis()).setEventUptimeMs(eventInternal2.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal2.getLong("tz-offset")).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkType.forNumber(eventInternal2.getInteger("net-type"))).setMobileSubtype(MobileSubtype.forNumber(eventInternal2.getInteger("mobile-subtype"))).build());
                if(eventInternal2.getCode() != null) {
                    logEvent$Builder0.setEventCode(eventInternal2.getCode());
                }
                arrayList2.add(logEvent$Builder0.build());
                continue;
            label_40:
                Logging.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding0);
            }
            logRequest$Builder0.setLogEvents(arrayList2);
            arrayList1.add(logRequest$Builder0.build());
        }
        BatchedLogRequest batchedLogRequest0 = BatchedLogRequest.create(arrayList1);
        byte[] arr_b = backendRequest0.getExtras();
        String s1 = null;
        URL uRL0 = this.d;
        if(arr_b != null) {
            try {
                CCTDestination cCTDestination0 = CCTDestination.fromByteArray(backendRequest0.getExtras());
                if(cCTDestination0.getAPIKey() != null) {
                    s1 = cCTDestination0.getAPIKey();
                }
                if(cCTDestination0.getEndPoint() != null) {
                    uRL0 = c.a(cCTDestination0.getEndPoint());
                }
            }
            catch(IllegalArgumentException unused_ex) {
                return BackendResponse.fatalError();
            }
        }
        try {
            b b0 = (b)Retries.retry(5, new a(uRL0, batchedLogRequest0, s1), new h(this, 25), new r8.a());  // 初始化器: Ljava/lang/Object;-><init>()V
            int v = b0.a;
            if(v == 200) {
                return BackendResponse.ok(b0.c);
            }
            if(v < 500) {
                switch(v) {
                    case 400: {
                        return BackendResponse.invalidPayload();
                    }
                    case 404: {
                        break;
                    }
                    default: {
                        return BackendResponse.fatalError();
                    }
                }
            }
            return BackendResponse.transientError();
        }
        catch(IOException iOException0) {
        }
        Logging.e("CctTransportBackend", "Could not make request to the backend", iOException0);
        return BackendResponse.transientError();
    }
}

