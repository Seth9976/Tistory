package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzid;
import com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class zzc {
    public static final HashSet a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        zzc.a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
        zzc.b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});
        zzc.c = Arrays.asList(new String[]{"auto", "app", "am"});
        zzc.d = Arrays.asList(new String[]{"_r", "_dbg"});
        zzc.e = Arrays.asList(((String[])ArrayUtils.concat(new String[][]{zzgq.zza, zzgq.zzb})));
        zzc.f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
    }

    public static Bundle zza(ConditionalUserProperty analyticsConnector$ConditionalUserProperty0) {
        Bundle bundle0 = new Bundle();
        String s = analyticsConnector$ConditionalUserProperty0.origin;
        if(s != null) {
            bundle0.putString("origin", s);
        }
        String s1 = analyticsConnector$ConditionalUserProperty0.name;
        if(s1 != null) {
            bundle0.putString("name", s1);
        }
        Object object0 = analyticsConnector$ConditionalUserProperty0.value;
        if(object0 != null) {
            zzgn.zzb(bundle0, object0);
        }
        String s2 = analyticsConnector$ConditionalUserProperty0.triggerEventName;
        if(s2 != null) {
            bundle0.putString("trigger_event_name", s2);
        }
        bundle0.putLong("trigger_timeout", analyticsConnector$ConditionalUserProperty0.triggerTimeout);
        String s3 = analyticsConnector$ConditionalUserProperty0.timedOutEventName;
        if(s3 != null) {
            bundle0.putString("timed_out_event_name", s3);
        }
        Bundle bundle1 = analyticsConnector$ConditionalUserProperty0.timedOutEventParams;
        if(bundle1 != null) {
            bundle0.putBundle("timed_out_event_params", bundle1);
        }
        String s4 = analyticsConnector$ConditionalUserProperty0.triggeredEventName;
        if(s4 != null) {
            bundle0.putString("triggered_event_name", s4);
        }
        Bundle bundle2 = analyticsConnector$ConditionalUserProperty0.triggeredEventParams;
        if(bundle2 != null) {
            bundle0.putBundle("triggered_event_params", bundle2);
        }
        bundle0.putLong("time_to_live", analyticsConnector$ConditionalUserProperty0.timeToLive);
        String s5 = analyticsConnector$ConditionalUserProperty0.expiredEventName;
        if(s5 != null) {
            bundle0.putString("expired_event_name", s5);
        }
        Bundle bundle3 = analyticsConnector$ConditionalUserProperty0.expiredEventParams;
        if(bundle3 != null) {
            bundle0.putBundle("expired_event_params", bundle3);
        }
        bundle0.putLong("creation_timestamp", analyticsConnector$ConditionalUserProperty0.creationTimestamp);
        bundle0.putBoolean("active", analyticsConnector$ConditionalUserProperty0.active);
        bundle0.putLong("triggered_timestamp", analyticsConnector$ConditionalUserProperty0.triggeredTimestamp);
        return bundle0;
    }

    public static ConditionalUserProperty zzb(Bundle bundle0) {
        Preconditions.checkNotNull(bundle0);
        ConditionalUserProperty analyticsConnector$ConditionalUserProperty0 = new ConditionalUserProperty();
        analyticsConnector$ConditionalUserProperty0.origin = (String)Preconditions.checkNotNull(((String)zzgn.zza(bundle0, "origin", String.class, null)));
        analyticsConnector$ConditionalUserProperty0.name = (String)Preconditions.checkNotNull(((String)zzgn.zza(bundle0, "name", String.class, null)));
        analyticsConnector$ConditionalUserProperty0.value = zzgn.zza(bundle0, "value", Object.class, null);
        analyticsConnector$ConditionalUserProperty0.triggerEventName = (String)zzgn.zza(bundle0, "trigger_event_name", String.class, null);
        analyticsConnector$ConditionalUserProperty0.triggerTimeout = (long)(((Long)zzgn.zza(bundle0, "trigger_timeout", Long.class, 0L)));
        analyticsConnector$ConditionalUserProperty0.timedOutEventName = (String)zzgn.zza(bundle0, "timed_out_event_name", String.class, null);
        analyticsConnector$ConditionalUserProperty0.timedOutEventParams = (Bundle)zzgn.zza(bundle0, "timed_out_event_params", Bundle.class, null);
        analyticsConnector$ConditionalUserProperty0.triggeredEventName = (String)zzgn.zza(bundle0, "triggered_event_name", String.class, null);
        analyticsConnector$ConditionalUserProperty0.triggeredEventParams = (Bundle)zzgn.zza(bundle0, "triggered_event_params", Bundle.class, null);
        analyticsConnector$ConditionalUserProperty0.timeToLive = (long)(((Long)zzgn.zza(bundle0, "time_to_live", Long.class, 0L)));
        analyticsConnector$ConditionalUserProperty0.expiredEventName = (String)zzgn.zza(bundle0, "expired_event_name", String.class, null);
        analyticsConnector$ConditionalUserProperty0.expiredEventParams = (Bundle)zzgn.zza(bundle0, "expired_event_params", Bundle.class, null);
        analyticsConnector$ConditionalUserProperty0.active = ((Boolean)zzgn.zza(bundle0, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        analyticsConnector$ConditionalUserProperty0.creationTimestamp = (long)(((Long)zzgn.zza(bundle0, "creation_timestamp", Long.class, 0L)));
        analyticsConnector$ConditionalUserProperty0.triggeredTimestamp = (long)(((Long)zzgn.zza(bundle0, "triggered_timestamp", Long.class, 0L)));
        return analyticsConnector$ConditionalUserProperty0;
    }

    public static String zzc(String s) {
        String s1 = zzgo.zza(s);
        return s1 == null ? s : s1;
    }

    public static String zzd(String s) {
        String s1 = zzgo.zzb(s);
        return s1 == null ? s : s1;
    }

    public static void zze(String s, String s1, Bundle bundle0) {
        if("clx".equals(s) && "_ae".equals(s1)) {
            bundle0.putLong("_r", 1L);
        }
    }

    public static boolean zzf(String s) {
        if(s == null) {
            return false;
        }
        if(s.length() == 0) {
            return false;
        }
        int v = s.codePointAt(0);
        if(!Character.isLetter(v) && v != 0x5F) {
            return false;
        }
        int v1 = s.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzg(String s) {
        if(s == null) {
            return false;
        }
        if(s.length() == 0) {
            return false;
        }
        int v = s.codePointAt(0);
        if(!Character.isLetter(v)) {
            return false;
        }
        int v1 = s.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzh(String s, String s1, Bundle bundle0) {
        if(!"_cmp".equals(s1)) {
            return true;
        }
        if(!zzc.zzl(s)) {
            return false;
        }
        if(bundle0 == null) {
            return false;
        }
        for(Object object0: zzc.d) {
            if(bundle0.containsKey(((String)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        switch(s) {
            case "fcm": {
                bundle0.putString("_cis", "fcm_integration");
                return true;
            }
            case "fdl": {
                bundle0.putString("_cis", "fdl_integration");
                return true;
            }
            case "fiam": {
                bundle0.putString("_cis", "fiam_integration");
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean zzi(ConditionalUserProperty analyticsConnector$ConditionalUserProperty0) {
        if(analyticsConnector$ConditionalUserProperty0 == null) {
            return false;
        }
        String s = analyticsConnector$ConditionalUserProperty0.origin;
        if(s == null || s.isEmpty() || analyticsConnector$ConditionalUserProperty0.value != null && zzid.zza(analyticsConnector$ConditionalUserProperty0.value) == null) {
            return false;
        }
        if(!zzc.zzl(s)) {
            return false;
        }
        if(!zzc.zzm(s, analyticsConnector$ConditionalUserProperty0.name)) {
            return false;
        }
        String s1 = analyticsConnector$ConditionalUserProperty0.expiredEventName;
        if(s1 != null) {
            if(!zzc.zzj(s1, analyticsConnector$ConditionalUserProperty0.expiredEventParams)) {
                return false;
            }
            if(!zzc.zzh(s, analyticsConnector$ConditionalUserProperty0.expiredEventName, analyticsConnector$ConditionalUserProperty0.expiredEventParams)) {
                return false;
            }
        }
        String s2 = analyticsConnector$ConditionalUserProperty0.triggeredEventName;
        if(s2 != null) {
            if(!zzc.zzj(s2, analyticsConnector$ConditionalUserProperty0.triggeredEventParams)) {
                return false;
            }
            if(!zzc.zzh(s, analyticsConnector$ConditionalUserProperty0.triggeredEventName, analyticsConnector$ConditionalUserProperty0.triggeredEventParams)) {
                return false;
            }
        }
        String s3 = analyticsConnector$ConditionalUserProperty0.timedOutEventName;
        if(s3 != null) {
            return zzc.zzj(s3, analyticsConnector$ConditionalUserProperty0.timedOutEventParams) ? zzc.zzh(s, analyticsConnector$ConditionalUserProperty0.timedOutEventName, analyticsConnector$ConditionalUserProperty0.timedOutEventParams) : false;
        }
        return true;
    }

    public static boolean zzj(String s, Bundle bundle0) {
        if(zzc.b.contains(s)) {
            return false;
        }
        if(bundle0 != null) {
            for(Object object0: zzc.d) {
                if(bundle0.containsKey(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public static boolean zzk(String s) {
        return !zzc.a.contains(s);
    }

    public static boolean zzl(String s) {
        return !zzc.c.contains(s);
    }

    public static boolean zzm(String s, String s1) {
        if(!"_ce1".equals(s1) && !"_ce2".equals(s1)) {
            if("_ln".equals(s1)) {
                return s.equals("fcm") || s.equals("fiam");
            }
            if(zzc.e.contains(s1)) {
                return false;
            }
            for(Object object0: zzc.f) {
                if(s1.matches(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return s.equals("fcm") || s.equals("frc");
    }
}

