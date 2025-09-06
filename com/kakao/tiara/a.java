package com.kakao.tiara;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;

public abstract class a {
    public static String[] a = null;
    public static String[] b = null;
    public static final char[] c = null;
    public static boolean d = false;

    static {
        a.a = new String[]{"tiara.daum.net", "tiara.kakao.com", "tiara.melon.com"};
        a.b = new String[]{"daum.net", "kakao.com", "melon.com"};
        a.c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    }

    public static void a(String s, String s1, Object[] arr_object) {
        a.c(6, s, s1, arr_object);
    }

    public static String b(boolean z) [...] // 潜在的解密器

    public static void c(int v, String s, String s1, Object[] arr_object) {
        if(a.d && v >= 3) {
            String s2 = String.format(s1, arr_object);
            switch(v) {
                case 2: {
                    Log.v(s, s2);
                    break;
                }
                case 3: {
                    Log.d(s, s2);
                    return;
                }
                case 4: {
                    Log.i(s, s2);
                    return;
                }
                case 5: {
                    Log.w(s, s2);
                    return;
                }
                case 6: {
                    Log.e(s, s2);
                }
            }
        }
    }

    public static void d(String s, String s1, int v, int v1, String[] arr_s) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss \'GMT\'", Locale.US);
        simpleDateFormat0.setTimeZone(new SimpleTimeZone(0, "GMT"));
        Calendar calendar0 = Calendar.getInstance();
        calendar0.add(v, v1);
        a.e(s, s1, simpleDateFormat0.format(calendar0.getTime()), arr_s);
    }

    public static void e(String s, String s1, String s2, String[] arr_s) {
        String s4;
        String s3;
        try {
            CookieManager cookieManager0 = CookieManager.getInstance();
            if(Build.VERSION.SDK_INT >= 0x1F) {
                s3 = "%s=%s; path=/; expires=%s; domain=.%s; SameSite=None; Secure; HttpOnly";
                s4 = "https://";
            }
            else {
                s3 = "%s=%s; path=/; expires=%s; domain=.%s; HttpOnly;";
                s4 = "";
            }
            for(int v = 0; true; ++v) {
                if(v >= arr_s.length) {
                    return;
                }
                String s5 = arr_s[v];
                String s6 = String.format(s3, s, s1, s2, s5);
                cookieManager0.setCookie(s4 + "." + s5, s6);
                cookieManager0.setCookie(s4 + s5, s6);
                a.c(3, "a", "[cookie] " + s6, new Object[0]);
            }
        }
        catch(Exception exception0) {
        }
        a.a("a", exception0.toString(), new Object[0]);
    }

    public static void f(String s, Boolean boolean0, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder("uuid=" + s);
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append(",adid=");
            stringBuilder0.append(s1);
        }
        if(boolean0 != null) {
            stringBuilder0.append(",adid_enabled=");
            stringBuilder0.append((boolean0.booleanValue() ? "1" : "0"));
        }
        a.d("_T_ANO", b.a(2, stringBuilder0.toString()), 1, 10, a.b);
    }
}

