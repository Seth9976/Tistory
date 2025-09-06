package com.kakao.tiara;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.UrlQuerySanitizer.ValueSanitizer;
import android.net.UrlQuerySanitizer;
import android.os.SystemClock;
import android.text.TextUtils;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Install.Builder;
import com.kakao.tiara.data.Install;
import com.kakao.tiara.track.App;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g implements TiaraLifecycleCallbacks.Callback, TiaraSession.SessionCallback {
    public HashMap a;
    public boolean b;
    public Application c;
    public e d;
    public h e;
    public ThreadPoolExecutor f;
    public static final Pattern g;

    static {
        g.g = Pattern.compile("(\\bUUID=[^;]*)");
    }

    public final SessionIds a() {
        return this.b ? this.e.a : SessionIds.generateNullIds();
    }

    public static String b(Context context0, String s) {
        SharedPreferences sharedPreferences0 = context0 == null ? null : context0.getSharedPreferences("net.daum.android.tistoryapp_tiara", 0);
        return sharedPreferences0 == null ? null : sharedPreferences0.getString(s, null);
    }

    public final String c() {
        if(!this.b) {
            return null;
        }
        try {
            Map map0 = this.c.getSharedPreferences("net.daum.android.tiara", 0).getAll();
            if(map0 != null && !map0.isEmpty()) {
                Iterator iterator0 = map0.entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    String s = (String)map$Entry0.getKey();
                    if(s.endsWith("Cookies") && !s.contains("WebTransfer")) {
                        String s1 = (String)map$Entry0.getValue();
                        if(TextUtils.isEmpty(s1)) {
                            break;
                        }
                        Matcher matcher0 = g.g.matcher(s1);
                        if(!matcher0.find()) {
                            break;
                        }
                        return matcher0.group(1);
                    }
                }
            }
        }
        catch(Exception exception0) {
            a.a("g", exception0.toString(), new Object[0]);
        }
        return null;
    }

    public final void d(String s, String s1, String s2) {
        if(this.c != null && !TextUtils.isEmpty(s) && TextUtils.getTrimmedLength(s) >= 2) {
            UrlQuerySanitizer urlQuerySanitizer0 = new UrlQuerySanitizer();
            UrlQuerySanitizer.ValueSanitizer urlQuerySanitizer$ValueSanitizer0 = UrlQuerySanitizer.getAllButNulLegal();
            urlQuerySanitizer0.registerParameters(new String[]{"utm_campaign", "utm_medium", "utm_source", "utm_term", "utm_content"}, urlQuerySanitizer$ValueSanitizer0);
            urlQuerySanitizer0.parseQuery(s);
            String s3 = urlQuerySanitizer0.getValue("utm_campaign");
            String s4 = urlQuerySanitizer0.getValue("utm_medium");
            String s5 = urlQuerySanitizer0.getValue("utm_source");
            String s6 = urlQuerySanitizer0.getValue("utm_term");
            String s7 = urlQuerySanitizer0.getValue("utm_content");
            g.e(this.c, "install_referrer", s);
            g.e(this.c, "install_campaign", s3);
            g.e(this.c, "install_medium", s4);
            g.e(this.c, "install_source", s5);
            g.e(this.c, "install_term", s6);
            g.e(this.c, "install_content", s7);
            g.e(this.c, "install_referrer_click_time", s1);
            g.e(this.c, "install_begin_time", s2);
            String s8 = g.b(this.c, "install_first_launch_time");
            Install install0 = new Builder().referrer(s).campaign(s3).medium(s4).source(s5).term(s6).content(s7).referrerClickTime(s1).installBeginTime(s2).firstLaunchTime(s8).build();
            a.c(3, "g", "Tiara install referrer : %s.", new Object[]{install0});
            f.a.d.f = install0;
        }
    }

    public static void e(Context context0, String s, String s1) {
        SharedPreferences sharedPreferences0 = context0 == null ? null : context0.getSharedPreferences("net.daum.android.tistoryapp_tiara", 0);
        if(sharedPreferences0 == null) {
            return;
        }
        sharedPreferences0.edit().putString(s, s1).apply();
    }

    @Override  // com.kakao.tiara.TiaraLifecycleCallbacks$Callback
    public final void onBackground() {
        h h0 = this.e;
        synchronized(h0) {
            h0.d = SystemClock.elapsedRealtime();
            h0.e = false;
        }
        for(Object object0: new HashSet(this.a.keySet())) {
            TiaraTracker tiaraTracker0 = (TiaraTracker)this.a.get(((String)object0));
            Boolean boolean0 = tiaraTracker0.e.x;
            if(boolean0 != null && boolean0.booleanValue()) {
                new App(tiaraTracker0, "앱종료", tiaraTracker0.getSettings().getAppAdTrackId()).actionKind(ActionKind.AppExit).track().flush();
            }
        }
    }

    @Override  // com.kakao.tiara.TiaraLifecycleCallbacks$Callback
    public final void onForeground() {
        h h0 = this.e;
        synchronized(h0) {
            h0.a();
            h0.e = true;
        }
        for(Object object0: new HashSet(this.a.keySet())) {
            TiaraTracker tiaraTracker0 = (TiaraTracker)this.a.get(((String)object0));
            String s = tiaraTracker0.f.getTsid();
            if(!s.equals(tiaraTracker0.g)) {
                tiaraTracker0.g = s;
                Boolean boolean0 = tiaraTracker0.e.x;
                if(boolean0 != null && boolean0.booleanValue()) {
                    new App(tiaraTracker0, "앱실행", tiaraTracker0.getSettings().getAppAdTrackId()).actionKind(ActionKind.AppLaunch).track().flush();
                }
            }
        }
    }

    @Override  // com.kakao.tiara.TiaraSession$SessionCallback
    public final void onStartNewSession(SessionIds sessionIds0) {
        HashMap hashMap0 = this.a;
        for(Object object0: new HashSet(hashMap0.keySet())) {
            TiaraTracker tiaraTracker0 = (TiaraTracker)hashMap0.get(((String)object0));
            tiaraTracker0.e.g = 1;
            tiaraTracker0.f = this.a();
        }
        if(!this.d.i) {
            return;
        }
        a.d("TSID", sessionIds0.getTsid(), 10, 12, a.a);
        a.d("_SUID", sessionIds0.getSuid(), 10, 12, a.a);
        a.d("_ISUID", sessionIds0.getIsuid(), 10, 12, a.a);
    }
}

