package com.kakao.tiara;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.gson.Gson;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Install.Builder;
import com.kakao.tiara.data.Install;
import com.kakao.tiara.data.TiaraLog;
import com.kakao.tiara.track.App;
import com.kakao.tiara.track.Ecommerce;
import com.kakao.tiara.track.Event;
import com.kakao.tiara.track.Extra;
import com.kakao.tiara.track.Location;
import com.kakao.tiara.track.Page;
import com.kakao.tiara.track.Usage;
import com.kakao.tiara.track.ViewImp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TiaraTracker {
    public final Object[] a;
    public final List b;
    public final ConcurrentHashMap c;
    public final g d;
    public final TiaraSettings e;
    public SessionIds f;
    public String g;
    public long h;

    public TiaraTracker(String s, TiaraSettings tiaraSettings0) {
        this.a = new Object[0];
        this.b = Collections.synchronizedList(new ArrayList());
        this.c = new ConcurrentHashMap();
        this.h = SystemClock.elapsedRealtime();
        this.e = tiaraSettings0;
        tiaraSettings0.e = s;
        g g0 = f.a;
        this.d = g0;
        if(!g0.b) {
            return;
        }
        e e0 = g0.d;
        tiaraSettings0.a = e0.a;
        tiaraSettings0.b = e0.b;
        tiaraSettings0.d = e0.c;
        tiaraSettings0.c = e0.d;
        tiaraSettings0.f = e0.g;
        tiaraSettings0.h = e0.i;
        tiaraSettings0.i = e0.j;
        if(TextUtils.isEmpty(tiaraSettings0.n)) {
            tiaraSettings0.n = e0.e;
        }
        if(tiaraSettings0.x == null) {
            tiaraSettings0.x = Boolean.valueOf(!e0.h);
        }
        if(tiaraSettings0.h && tiaraSettings0.i) {
            if(TextUtils.isEmpty(tiaraSettings0.q)) {
                a.e("T_UACD", "", "Sat, 01-Jan-1972 00:00:00 GMT", a.a);
            }
            else {
                String s1 = b.a(1, tiaraSettings0.q);
                if(s1 != null) {
                    a.d("T_UACD", s1, 1, 10, a.a);
                }
            }
        }
        tiaraSettings0.b();
        tiaraSettings0.a();
        tiaraSettings0.c();
        this.f = g0.a();
        if(tiaraSettings0.x != null && tiaraSettings0.x.booleanValue()) {
            String s2 = g0.d.d;
            String s3 = g.b(g0.c, "app_version");
            if(!TextUtils.equals(s3, s2)) {
                g.e(g0.c, "app_version", s2);
                if(!TextUtils.isEmpty(s3)) {
                    new App(this, "앱업데이트", this.getSettings().getAppAdTrackId()).actionKind(ActionKind.AppUpdate).track().flush();
                    return;
                }
                g.e(g0.c, "install_first_launch_time", "1757117511");
                try {
                    c c0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
                    c0.c = 0;
                    c0.a = this;
                    InstallReferrerClient installReferrerClient0 = InstallReferrerClient.newBuilder(this.getContext()).build();
                    c0.b = installReferrerClient0;
                    installReferrerClient0.startConnection(c0);
                }
                catch(Exception exception0) {
                    a.a("c", exception0.toString(), new Object[0]);
                }
            }
        }
    }

    public void clearGlobalCustomProps() {
        this.c.clear();
    }

    public static void enableDebugLogger() {
        a.d = true;
        a.c(4, "TiaraTracker", "Tiara internal debugging log is enabled.", new Object[0]);
    }

    @RestrictTo({Scope.LIBRARY})
    public void enqueue(TiaraLog tiaraLog0) {
        if(!this.d.b) {
            return;
        }
        synchronized(this.a) {
            this.b.add(tiaraLog0);
            int v1 = this.b.size() - Math.max(10, this.e.getBatchSize());
            if(v1 > 0) {
                while(true) {
                    this.b.remove(0);
                    --v1;
                    if(v1 <= 0) {
                        break;
                    }
                }
            }
        }
        if(this.b.size() >= this.e.getBatchSize() || SystemClock.elapsedRealtime() - this.h > this.e.getBatchIntervalMillis()) {
            this.flush();
        }
    }

    public void flush() {
        List list0;
        if(!this.d.b) {
            return;
        }
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.getContext().getSystemService("connectivity");
        if(connectivityManager0 != null) {
            String s = null;
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                if(this.d.b) {
                    Object[] arr_object = this.a;
                    synchronized(arr_object) {
                        if(this.b.isEmpty()) {
                            list0 = null;
                        }
                        else {
                            list0 = new ArrayList(this.b);
                            this.b.clear();
                        }
                    }
                }
                else {
                    list0 = null;
                }
                if(list0 != null && !list0.isEmpty()) {
                    try {
                        s = new Gson().toJson(list0);
                    }
                    catch(Exception unused_ex) {
                    }
                    if(!TextUtils.isEmpty(s)) {
                        a.c(3, "TiaraTracker", "flush -> " + s, new Object[0]);
                        g g0 = this.d;
                        androidx.appcompat.widget.a a0 = new androidx.appcompat.widget.a();
                        a0.b = s;
                        if(g0.b) {
                            try {
                                g0.f.execute(a0);
                            }
                            catch(Exception unused_ex) {
                                return;
                            }
                            this.h = SystemClock.elapsedRealtime();
                        }
                    }
                    return;
                }
                a.c(4, "TiaraTracker", "log queue is empty.", new Object[0]);
                return;
            }
        }
        a.c(4, "TiaraTracker", "network is not available.", new Object[0]);
    }

    @Nullable
    public static TiaraTracker get(@NonNull String s) {
        return (TiaraTracker)f.a.a.get(s);
    }

    @RestrictTo({Scope.LIBRARY})
    public Context getContext() {
        return this.d.c;
    }

    @Nullable
    public String getGlobalCustomProperty(@NonNull String s) {
        return (String)this.c.get(s);
    }

    @NonNull
    public Map getGlobalCustomProps() {
        return new LinkedHashMap(this.c);
    }

    @RestrictTo({Scope.LIBRARY})
    public Install getInstall() {
        return this.d.d.f;
    }

    @Nullable
    public static String getIsuid() {
        return f.a.a().getIsuid();
    }

    @RestrictTo({Scope.LIBRARY})
    public SessionIds getSessionId() {
        return this.f;
    }

    public TiaraSettings getSettings() {
        return this.e;
    }

    @Nullable
    public static String getSuid() {
        return f.a.a().getSuid();
    }

    @Nullable
    public static String getTsid() {
        return f.a.a().getTsid();
    }

    @Nullable
    public static String getTuid() {
        return f.a.d.a;
    }

    @Nullable
    public static String getUuid() {
        return f.a.d.b;
    }

    public static void holdSessionForBackgroundTask() {
        g g0 = f.a;
        if(g0.b) {
            h h0 = g0.e;
            synchronized(h0) {
                if(h0.f) {
                    return;
                }
                h0.a();
                h0.f = true;
            }
        }
    }

    public static void initialize(@NonNull Application application0, @NonNull TiaraConfiguration tiaraConfiguration0) {
        SessionIds sessionIds0;
        g g0 = f.a;
        if(g0.b) {
            Log.w("g", "already initialized.");
            return;
        }
        g0.b = true;
        g0.c = application0;
        String s = g.b(application0, "tuid");
        if(TextUtils.isEmpty(s)) {
            s = "j9beJq2zIGYs_250906081151768";
            g.e(g0.c, "tuid", "j9beJq2zIGYs_250906081151768");
        }
        e e0 = g0.d;
        e0.a = s;
        String s1 = g.b(g0.c, "uuid");
        if(TextUtils.isEmpty(s1)) {
            s1 = "fpQW9PQcYdmK_250906736454194";
            g.e(g0.c, "uuid", "fpQW9PQcYdmK_250906736454194");
        }
        e0.b = s1;
        String s2 = g.b(g0.c, "install_date");
        if(TextUtils.isEmpty(s2)) {
            s2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Calendar.getInstance().getTime());
            g.e(g0.c, "install_date", s2);
        }
        e0.c = s2;
        String s3 = g.b(g0.c, "install_referrer");
        String s4 = g.b(g0.c, "install_campaign");
        String s5 = g.b(g0.c, "install_medium");
        String s6 = g.b(g0.c, "install_source");
        String s7 = g.b(g0.c, "install_term");
        String s8 = g.b(g0.c, "install_content");
        String s9 = g.b(g0.c, "install_referrer_click_time");
        String s10 = g.b(g0.c, "install_begin_time");
        String s11 = g.b(g0.c, "install_first_launch_time");
        e0.f = new Builder().referrer(s3).campaign(s4).medium(s5).source(s6).term(s7).content(s8).referrerClickTime(s9).installBeginTime(s10).firstLaunchTime(s11).build();
        e0.h = tiaraConfiguration0.d;
        int v = tiaraConfiguration0.a;
        e0.g = v;
        e0.i = tiaraConfiguration0.b;
        e0.j = tiaraConfiguration0.c;
        e0.k = tiaraConfiguration0.e;
        try {
            PackageManager packageManager0 = application0.getPackageManager();
            e0.d = packageManager0.getPackageInfo("net.daum.android.tistoryapp", 0x80).versionName;
            Bundle bundle0 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0x80).metaData;
            if(bundle0 != null) {
                e0.e = bundle0.getString("TIARA_DEPLOYMENT", "production");
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            packageManager$NameNotFoundException0.printStackTrace();
        }
        g0.f = new ThreadPoolExecutor(1, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new c6.b(2));
        h h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
        h0.a = SessionIds.generateNewIds();
        h0.b = g0;
        h0.c = (long)(v * 1000);
        h0.d = SystemClock.elapsedRealtime();
        h0.e = false;
        h0.f = false;
        g0.e = h0;
        if(e0.i) {
            String[] arr_s = tiaraConfiguration0.f;
            if(arr_s != null && arr_s.length >= 1) {
                String[] arr_s1 = new String[arr_s.length];
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    arr_s1[v1] = "tiara." + arr_s[v1];
                }
                a.a = arr_s1;
                a.b = arr_s;
            }
            a.d("TUID", s, 1, 10, a.a);
            a.d("_UUID", s1, 1, 10, a.a);
            synchronized(g0.e) {
                sessionIds0 = g0.e.a;
            }
            a.d("TSID", sessionIds0.getTsid(), 10, 12, a.a);
            a.d("_SUID", sessionIds0.getSuid(), 10, 12, a.a);
            a.d("_ISUID", sessionIds0.getIsuid(), 10, 12, a.a);
        }
        application0.registerActivityLifecycleCallbacks(new d(g0));
    }

    @NonNull
    public static TiaraTracker newInstance(@NonNull String s, @NonNull TiaraSettings tiaraSettings0) {
        HashMap hashMap0 = f.a.a;
        if(!hashMap0.containsKey(s)) {
            hashMap0.put(s, new TiaraTracker(s, tiaraSettings0));
        }
        return (TiaraTracker)hashMap0.get(s);
    }

    @Nullable
    public String putGlobalCustomProperty(@NonNull String s, String s1) {
        return (String)this.c.put(s, s1);
    }

    public void putGlobalCustomProps(@NonNull Map map0) {
        this.c.putAll(map0);
    }

    public static void releaseSessionForBackgroundTask() {
        g g0 = f.a;
        if(g0.b) {
            h h0 = g0.e;
            synchronized(h0) {
                if(!h0.f) {
                    return;
                }
                h0.d = SystemClock.elapsedRealtime();
                h0.f = false;
            }
        }
    }

    @Nullable
    public String removeGlobalCustomProperty(@NonNull String s) {
        return (String)this.c.remove(s);
    }

    public static void setAccountIdCookie(String s) {
        if(f.a.b && f.a.d.i) {
            if(TextUtils.isEmpty(s)) {
                a.e("T_UACD", "", "Sat, 01-Jan-1972 00:00:00 GMT", a.a);
                return;
            }
            String s1 = b.a(1, s);
            if(s1 != null) {
                a.d("T_UACD", s1, 1, 10, a.a);
            }
        }
    }

    @Deprecated
    public static void setAdidCookie(String s) {
        if(f.a.b && f.a.d.i && !TextUtils.isEmpty(s)) {
            a.d("DaumKakaoAdID", s, 1, 10, a.a);
        }
    }

    public static void setAdidCookie(String s, boolean z) {
        g g0 = f.a;
        if(g0.b && g0.d.i && !TextUtils.isEmpty(s)) {
            a.d("DaumKakaoAdID", s, 1, 10, a.a);
        }
        if(g0.b && g0.d.i) {
            a.d("DaumKakaoAdTrackingEnabled", (z ? "1" : "0"), 1, 10, a.a);
        }
        if(g0.b) {
            e e0 = g0.d;
            if(e0.i) {
                a.f(e0.b, Boolean.valueOf(z), s);
            }
        }
    }

    @Deprecated
    public static void setAdidTrackingEnabledCookie(boolean z) {
        if(f.a.b && f.a.d.i) {
            a.d("DaumKakaoAdTrackingEnabled", (z ? "1" : "0"), 1, 10, a.a);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public void startNewSessionIfExpired() {
        g g0 = f.a;
        if(g0.b) {
            g0.e.a();
        }
    }

    @NonNull
    @Deprecated
    public Ecommerce trackEcommerce(@NonNull String s) {
        return new Ecommerce(this, s);
    }

    @NonNull
    public Event trackEvent(@NonNull String s) {
        return new Event(this, s);
    }

    @NonNull
    public Extra trackExtra(@NonNull String s) {
        return new Extra(this, s);
    }

    @NonNull
    public Location trackLocation(@NonNull String s) {
        return new Location(this, s);
    }

    @NonNull
    public Page trackPage(@NonNull String s) {
        return new Page(this, s);
    }

    @NonNull
    public Usage trackUsage() {
        return new Usage(this, null);
    }

    @NonNull
    public Usage trackUsage(@NonNull String s) {
        return new Usage(this, s);
    }

    @NonNull
    public ViewImp trackViewImp() {
        return new ViewImp(this, null);
    }

    @NonNull
    public ViewImp trackViewImp(@NonNull String s) {
        return new ViewImp(this, s);
    }
}

