package com.google.android.gms.measurement.internal;

import a5.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.room.a;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzlb extends b0 {
    public SecureRandom b;
    public final AtomicLong c;
    public int d;
    public Integer e;
    public static final String[] f;
    public static final String[] g;

    static {
        zzlb.f = new String[]{"firebase_", "google_", "ga_"};
        zzlb.g = new String[]{"_err"};
    }

    public zzlb(zzfr zzfr0) {
        super(zzfr0);
        this.e = null;
        this.c = new AtomicLong(0L);
    }

    public static final boolean A(int v, Bundle bundle0) {
        if(bundle0.getLong("_err") == 0L) {
            bundle0.putLong("_err", ((long)v));
            return true;
        }
        return false;
    }

    public final int B(String s) {
        if("_ldl".equals(s)) {
            return 0x800;
        }
        if("_id".equals(s)) {
            return 0x100;
        }
        return "_lgclid".equals(s) ? 100 : 36;
    }

    public final Object C(int v, Object object0, boolean z, boolean z1) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Double)) {
            if(object0 instanceof Integer) {
                return (long)(((int)(((Integer)object0))));
            }
            if(object0 instanceof Byte) {
                return (long)(((byte)(((Byte)object0))));
            }
            if(object0 instanceof Short) {
                return (long)(((short)(((Short)object0))));
            }
            if(object0 instanceof Boolean) {
                return ((Boolean)object0).booleanValue() ? 1L : 0L;
            }
            if(object0 instanceof Float) {
                return ((Float)object0).doubleValue();
            }
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                if(z1 && (object0 instanceof Bundle[] || object0 instanceof Parcelable[])) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v1 = 0; v1 < ((Parcelable[])object0).length; ++v1) {
                        Parcelable parcelable0 = ((Parcelable[])object0)[v1];
                        if(parcelable0 instanceof Bundle) {
                            Bundle bundle0 = this.K(((Bundle)parcelable0));
                            if(!bundle0.isEmpty()) {
                                arrayList0.add(bundle0);
                            }
                        }
                    }
                    return arrayList0.toArray(new Bundle[arrayList0.size()]);
                }
                return null;
            }
            return this.zzD(object0.toString(), v, z);
        }
        return object0;
    }

    public static boolean D(String s, String[] arr_s) {
        Preconditions.checkNotNull(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            if(zzkz.zza(s, arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(40)
    public final int E(Object object0, String s) {
        return ("_ldl".equals(s) ? this.p("user property referrer", s, this.B(s), object0) : this.p("user property", s, this.B(s), object0)) ? 0 : 7;
    }

    public final int F(String s) {
        if(!this.q("event param", s)) {
            return 3;
        }
        if(!this.n("event param", null, null, s)) {
            return 14;
        }
        return this.m(40, "event param", s) ? 0 : 3;
    }

    public final int G(String s) {
        if(!this.r("event param", s)) {
            return 3;
        }
        if(!this.n("event param", null, null, s)) {
            return 14;
        }
        return this.m(40, "event param", s) ? 0 : 3;
    }

    public final int H(String s) {
        if(!this.q("user property", s)) {
            return 6;
        }
        if(!this.n("user property", zzgq.zza, null, s)) {
            return 15;
        }
        return this.m(24, "user property", s) ? 0 : 6;
    }

    public static long I(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        int v = 0;
        Preconditions.checkState(arr_b.length > 0);
        int v1 = arr_b.length - 1;
        long v2 = 0L;
        while(v1 >= 0 && v1 >= arr_b.length - 8) {
            v2 += (((long)arr_b[v1]) & 0xFFL) << v;
            v += 8;
            --v1;
        }
        return v2;
    }

    public final Bundle J(Uri uri0) {
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        if(uri0 != null) {
            try {
                if(uri0.isHierarchical()) {
                    s = uri0.getQueryParameter("utm_campaign");
                    s1 = uri0.getQueryParameter("utm_source");
                    s2 = uri0.getQueryParameter("utm_medium");
                    s3 = uri0.getQueryParameter("gclid");
                    s4 = uri0.getQueryParameter("utm_id");
                    s5 = uri0.getQueryParameter("dclid");
                    s6 = uri0.getQueryParameter("srsltid");
                }
                else {
                    s = null;
                    s1 = null;
                    s2 = null;
                    s3 = null;
                    s4 = null;
                    s5 = null;
                    s6 = null;
                }
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                this.zzt.zzay().zzk().zzb("Install referrer url isn\'t a hierarchical URI", unsupportedOperationException0);
                return null;
            }
            if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) && TextUtils.isEmpty(s4) && TextUtils.isEmpty(s5) && TextUtils.isEmpty(s6)) {
                return null;
            }
            Bundle bundle0 = new Bundle();
            if(!TextUtils.isEmpty(s)) {
                bundle0.putString("campaign", s);
            }
            if(!TextUtils.isEmpty(s1)) {
                bundle0.putString("source", s1);
            }
            if(!TextUtils.isEmpty(s2)) {
                bundle0.putString("medium", s2);
            }
            if(!TextUtils.isEmpty(s3)) {
                bundle0.putString("gclid", s3);
            }
            String s7 = uri0.getQueryParameter("utm_term");
            if(!TextUtils.isEmpty(s7)) {
                bundle0.putString("term", s7);
            }
            String s8 = uri0.getQueryParameter("utm_content");
            if(!TextUtils.isEmpty(s8)) {
                bundle0.putString("content", s8);
            }
            String s9 = uri0.getQueryParameter("aclid");
            if(!TextUtils.isEmpty(s9)) {
                bundle0.putString("aclid", s9);
            }
            String s10 = uri0.getQueryParameter("cp1");
            if(!TextUtils.isEmpty(s10)) {
                bundle0.putString("cp1", s10);
            }
            String s11 = uri0.getQueryParameter("anid");
            if(!TextUtils.isEmpty(s11)) {
                bundle0.putString("anid", s11);
            }
            if(!TextUtils.isEmpty(s4)) {
                bundle0.putString("campaign_id", s4);
            }
            if(!TextUtils.isEmpty(s5)) {
                bundle0.putString("dclid", s5);
            }
            String s12 = uri0.getQueryParameter("utm_source_platform");
            if(!TextUtils.isEmpty(s12)) {
                bundle0.putString("source_platform", s12);
            }
            String s13 = uri0.getQueryParameter("utm_creative_format");
            if(!TextUtils.isEmpty(s13)) {
                bundle0.putString("creative_format", s13);
            }
            String s14 = uri0.getQueryParameter("utm_marketing_tactic");
            if(!TextUtils.isEmpty(s14)) {
                bundle0.putString("marketing_tactic", s14);
            }
            if(!TextUtils.isEmpty(s6)) {
                bundle0.putString("srsltid", s6);
            }
            return bundle0;
        }
        return null;
    }

    public final Bundle K(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = this.a(bundle0.get(s), s);
                if(object1 == null) {
                    this.zzt.zzay().zzl().zzb("Param value can\'t be null", this.zzt.zzj().zze(s));
                }
                else {
                    this.j(bundle1, s, object1);
                }
            }
        }
        return bundle1;
    }

    public final Bundle L(String s, Bundle bundle0, List list0, boolean z) {
        String s2;
        int v2;
        boolean z1 = zzlb.D(s, zzgo.zzd);
        if(bundle0 != null) {
            Bundle bundle1 = new Bundle(bundle0);
            int v = this.zzt.zzf().zzc();
            int v1 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s1 = (String)object0;
                if(list0 == null || !list0.contains(s1)) {
                    int v3 = z ? 0 : this.G(s1);
                    v2 = v3 == 0 ? this.F(s1) : v3;
                }
                else {
                    v2 = 0;
                }
                switch(v2) {
                    case 0: {
                        int v4 = this.o(s, s1, bundle0.get(s1), bundle1, list0, z, z1);
                        if(v4 == 17) {
                            this.f(bundle1, 17, s1, Boolean.FALSE);
                        }
                        else if(v4 != 0 && !"_ev".equals(s1)) {
                            this.f(bundle1, v4, (v4 == 21 ? s : s1), bundle0.get(s1));
                            bundle1.remove(s1);
                            continue;
                        }
                        if(!zzlb.w(s1)) {
                            continue;
                        }
                        if(v1 + 1 > v) {
                            StringBuilder stringBuilder0 = b.s(v, "Event can\'t contain more than ", " params");
                            this.zzt.zzay().zze().zzc(stringBuilder0.toString(), this.zzt.zzj().zzd(s), this.zzt.zzj().zzb(bundle0));
                            zzlb.A(5, bundle1);
                            bundle1.remove(s1);
                        }
                        ++v1;
                        continue;
                    }
                    case 3: {
                        s2 = s1;
                        break;
                    }
                    default: {
                        s2 = null;
                    }
                }
                this.f(bundle1, v2, s1, s2);
                bundle1.remove(s1);
            }
            return bundle1;
        }
        return null;
    }

    public final zzaw M(String s, Bundle bundle0, String s1, long v, boolean z) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(this.zzh(s) == 0) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle1.putString("_o", s1);
            Bundle bundle2 = this.L(s, bundle1, CollectionUtils.listOf("_o"), true);
            if(z) {
                bundle2 = this.K(bundle2);
            }
            Preconditions.checkNotNull(bundle2);
            return new zzaw(s, new zzau(bundle2), s1, v);
        }
        this.zzt.zzay().zzd().zzb("Invalid conditional property event name", this.zzt.zzj().zzf(s));
        throw new IllegalArgumentException();
    }

    public final Object a(Object object0, String s) {
        if("_ev".equals(s)) {
            return this.C(0x100, object0, true, true);
        }
        return zzlb.v(s) ? this.C(0x100, object0, false, true) : this.C(100, object0, false, true);
    }

    // 去混淆评级： 低(20)
    public final Object b(Object object0, String s) {
        return "_ldl".equals(s) ? this.C(this.B(s), object0, true, false) : this.C(this.B(s), object0, false, false);
    }

    public static MessageDigest c() {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }

    public final SecureRandom d() {
        this.zzg();
        if(this.b == null) {
            this.b = new SecureRandom();
        }
        return this.b;
    }

    public final void e(Bundle bundle0, long v) {
        long v1 = bundle0.getLong("_et");
        if(v1 == 0L) {
            v1 = 0L;
        }
        else {
            this.zzt.zzay().zzk().zzb("Params already contained engagement", v1);
        }
        bundle0.putLong("_et", v + v1);
    }

    public final void f(Bundle bundle0, int v, String s, Object object0) {
        if(zzlb.A(v, bundle0)) {
            bundle0.putString("_ev", this.zzD(s, 40, true));
            if(object0 != null) {
                Preconditions.checkNotNull(bundle0);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    bundle0.putLong("_el", ((long)object0.toString().length()));
                }
            }
        }
    }

    public final void g(Bundle bundle0, Bundle bundle1) {
        if(bundle1 == null) {
            return;
        }
        for(Object object0: bundle1.keySet()) {
            String s = (String)object0;
            if(!bundle0.containsKey(s)) {
                this.zzt.zzv().j(bundle0, s, bundle1.get(s));
            }
        }
    }

    public final void h(zzei zzei0, int v) {
        int v1 = 0;
        for(Object object0: new TreeSet(zzei0.zzd.keySet())) {
            String s = (String)object0;
            if(zzlb.w(s)) {
                ++v1;
                if(v1 > v) {
                    StringBuilder stringBuilder0 = b.s(v, "Event can\'t contain more than ", " params");
                    this.zzt.zzay().zze().zzc(stringBuilder0.toString(), this.zzt.zzj().zzd(zzei0.zza), this.zzt.zzj().zzb(zzei0.zzd));
                    zzlb.A(5, zzei0.zzd);
                    zzei0.zzd.remove(s);
                }
            }
        }
    }

    public static void i(zzla zzla0, String s, int v, String s1, String s2, int v1) {
        Bundle bundle0 = new Bundle();
        zzlb.A(v, bundle0);
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            bundle0.putString(s1, s2);
        }
        if(v == 2 || v == 6 || v == 7) {
            bundle0.putLong("_el", ((long)v1));
        }
        zzla0.zza(s, "_err", bundle0);
    }

    public final void j(Bundle bundle0, String s, Object object0) {
        if(bundle0 == null) {
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong(s, ((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof String) {
            bundle0.putString(s, String.valueOf(object0));
            return;
        }
        if(object0 instanceof Double) {
            bundle0.putDouble(s, ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Bundle[]) {
            bundle0.putParcelableArray(s, ((Bundle[])object0));
            return;
        }
        if(s != null) {
            String s1 = object0 == null ? null : object0.getClass().getSimpleName();
            this.zzt.zzay().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzt.zzj().zze(s), s1);
        }
    }

    public final void k(String s, String s1, Bundle bundle0, List list0, boolean z) {
        String s3;
        int v3;
        int v1;
        if(bundle0 == null) {
            return;
        }
        int v = 0;
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s2 = (String)object0;
            if(list0 == null || !list0.contains(s2)) {
                int v2 = z ? 0 : this.G(s2);
                v1 = v2 == 0 ? this.F(s2) : v2;
            }
            else {
                v1 = 0;
            }
            switch(v1) {
                case 0: {
                    if(zzlb.t(bundle0.get(s2))) {
                        this.zzt.zzay().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s, s1, s2);
                        v3 = 22;
                    }
                    else {
                        v3 = this.o(s, s2, bundle0.get(s2), bundle0, list0, z, false);
                    }
                    if(v3 == 0 || "_ev".equals(s2)) {
                        if(!zzlb.w(s2) || zzlb.D(s2, zzgp.zzd)) {
                            continue;
                        }
                        ++v;
                        if(v <= 0) {
                            continue;
                        }
                        this.zzt.zzay().zze().zzc("Item cannot contain custom parameters", this.zzt.zzj().zzd(s), this.zzt.zzj().zzb(bundle0));
                        zzlb.A(23, bundle0);
                    }
                    else {
                        this.f(bundle0, v3, s2, bundle0.get(s2));
                    }
                    bundle0.remove(s2);
                    continue;
                }
                case 3: {
                    s3 = s2;
                    break;
                }
                default: {
                    s3 = null;
                }
            }
            this.f(bundle0, v1, s2, s3);
            bundle0.remove(s2);
        }
    }

    public final boolean l(String s, String s1) {
        if(!TextUtils.isEmpty(s)) {
            Preconditions.checkNotNull(s);
            if(s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if(this.zzt.zzL()) {
                this.zzt.zzay().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeh.zzn(s));
            }
            return false;
        }
        if(!TextUtils.isEmpty(s1)) {
            Preconditions.checkNotNull(s1);
            if(!s1.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                this.zzt.zzay().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzeh.zzn(s1));
                return false;
            }
            return true;
        }
        if(this.zzt.zzL()) {
            this.zzt.zzay().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final boolean m(int v, String s, String s1) {
        if(s1 == null) {
            this.zzt.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.codePointCount(0, s1.length()) > v) {
            this.zzt.zzay().zze().zzd("Name is too long. Type, maximum supported length, name", s, v, s1);
            return false;
        }
        return true;
    }

    public final boolean n(String s, String[] arr_s, String[] arr_s1, String s1) {
        if(s1 == null) {
            this.zzt.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        Preconditions.checkNotNull(s1);
        String[] arr_s2 = zzlb.f;
        for(int v = 0; v < 3; ++v) {
            if(s1.startsWith(arr_s2[v])) {
                this.zzt.zzay().zze().zzc("Name starts with reserved prefix. Type, name", s, s1);
                return false;
            }
        }
        if(arr_s != null && zzlb.D(s1, arr_s) && (arr_s1 == null || !zzlb.D(s1, arr_s1))) {
            this.zzt.zzay().zze().zzc("Name is reserved. Type, name", s, s1);
            return false;
        }
        return true;
    }

    public final int o(String s, String s1, Object object0, Bundle bundle0, List list0, boolean z, boolean z1) {
        int v1;
        int v;
        this.zzg();
        if(zzlb.t(object0)) {
            if(!z1) {
                return 21;
            }
            if(!zzlb.D(s1, zzgp.zzc)) {
                return 20;
            }
            zzjm zzjm0 = this.zzt.zzt();
            zzjm0.zzg();
            zzjm0.zza();
            if(zzjm0.c() && zzjm0.zzt.zzv().zzm() < 200900) {
                return 25;
            }
            if(object0 instanceof Parcelable[]) {
                v = ((Parcelable[])object0).length;
                goto label_15;
            }
            else if(object0 instanceof ArrayList) {
                v = ((ArrayList)object0).size();
            label_15:
                if(v > 200) {
                    this.zzt.zzay().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", s1, v);
                    if(!(object0 instanceof Parcelable[])) {
                        if(object0 instanceof ArrayList && ((ArrayList)object0).size() > 200) {
                            bundle0.putParcelableArrayList(s1, new ArrayList(((ArrayList)object0).subList(0, 200)));
                        }
                    }
                    else if(((Parcelable[])object0).length > 200) {
                        bundle0.putParcelableArray(s1, ((Parcelable[])Arrays.copyOf(((Parcelable[])object0), 200)));
                    }
                    v1 = 17;
                }
                else {
                    v1 = 0;
                }
            }
            else {
                v1 = 0;
            }
        }
        else {
            v1 = 0;
        }
        if(this.p("param", s1, (zzlb.v(s) || zzlb.v(s1) ? 0x100 : 100), object0)) {
            return v1;
        }
        if(z1) {
            if(object0 instanceof Bundle) {
                this.k(s, s1, ((Bundle)object0), list0, z);
                return v1;
            }
            if(object0 instanceof Parcelable[]) {
                for(int v2 = 0; v2 < ((Parcelable[])object0).length; ++v2) {
                    Parcelable parcelable0 = ((Parcelable[])object0)[v2];
                    if(!(parcelable0 instanceof Bundle)) {
                        this.zzt.zzay().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable0.getClass(), s1);
                        return 4;
                    }
                    this.k(s, s1, ((Bundle)parcelable0), list0, z);
                }
                return v1;
            }
            if(object0 instanceof ArrayList) {
                int v3 = ((ArrayList)object0).size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    Object object1 = ((ArrayList)object0).get(v4);
                    if(!(object1 instanceof Bundle)) {
                        zzef zzef0 = this.zzt.zzay().zzl();
                        Class class0 = object1 == null ? "null" : object1.getClass();
                        zzef0.zzc("All ArrayList elements must be of type Bundle. Value type, name", class0, s1);
                        return 4;
                    }
                    this.k(s, s1, ((Bundle)object1), list0, z);
                }
                return v1;
            }
        }
        return 4;
    }

    public final boolean p(String s, String s1, int v, Object object0) {
        if(object0 == null) {
            return true;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Float) && !(object0 instanceof Integer) && !(object0 instanceof Byte) && !(object0 instanceof Short) && !(object0 instanceof Boolean) && !(object0 instanceof Double)) {
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                return false;
            }
            String s2 = object0.toString();
            if(s2.codePointCount(0, s2.length()) > v) {
                this.zzt.zzay().zzl().zzd("Value is too long; discarded. Value kind, name, value length", s, s1, s2.length());
                return false;
            }
        }
        return true;
    }

    public final boolean q(String s, String s1) {
        if(s1 == null) {
            this.zzt.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.zzt.zzay().zze().zzb("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            if(v == 0x5F) {
                v = 0x5F;
                goto label_13;
            }
            this.zzt.zzay().zze().zzc("Name must start with a letter or _ (underscore). Type, name", s, s1);
            return false;
        }
    label_13:
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.zzt.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    public final boolean r(String s, String s1) {
        if(s1 == null) {
            this.zzt.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.zzt.zzay().zze().zzb("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            this.zzt.zzay().zze().zzc("Name must start with a letter. Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.zzt.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    public final boolean s(String s) {
        this.zzg();
        if(Wrappers.packageManager(this.zzt.zzau()).checkCallingOrSelfPermission(s) == 0) {
            return true;
        }
        this.zzt.zzay().zzc().zzb("Permission not granted", s);
        return false;
    }

    // 去混淆评级： 低(30)
    public static boolean t(Object object0) {
        return object0 instanceof Parcelable[] || object0 instanceof ArrayList || object0 instanceof Bundle;
    }

    public final boolean u(Context context0, String s) {
        X500Principal x500Principal0 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(s, 0x40);
            if(packageInfo0 != null) {
                Signature[] arr_signature = packageInfo0.signatures;
                if(arr_signature != null && arr_signature.length > 0) {
                    Signature signature0 = arr_signature[0];
                    return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()))).getSubjectX500Principal().equals(x500Principal0);
                }
            }
        }
        catch(CertificateException certificateException0) {
            this.zzt.zzay().zzd().zzb("Error obtaining certificate", certificateException0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.zzt.zzay().zzd().zzb("Package name not found", packageManager$NameNotFoundException0);
        }
        return true;
    }

    // 去混淆评级： 低(20)
    public static boolean v(String s) {
        return !TextUtils.isEmpty(s) && s.startsWith("_");
    }

    public static boolean w(String s) {
        Preconditions.checkNotEmpty(s);
        return s.charAt(0) != 0x5F || s.equals("_ep");
    }

    public static boolean x(Context context0) {
        Preconditions.checkNotNull(context0);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ActivityInfo activityInfo0 = packageManager0.getReceiverInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if(activityInfo0 != null) {
                return activityInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean y(String s, String s1, String s2, String s3) {
        boolean z = TextUtils.isEmpty(s);
        boolean z1 = TextUtils.isEmpty(s1);
        if(!z && !z1) {
            Preconditions.checkNotNull(s);
            return !s.equals(s1);
        }
        if(z && z1) {
            return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3) ? !TextUtils.isEmpty(s3) : !s2.equals(s3);
        }
        return z || !TextUtils.isEmpty(s3) ? TextUtils.isEmpty(s2) || !s2.equals(s3) : false;
    }

    public static byte[] z(Parcelable parcelable0) {
        if(parcelable0 == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcelable0.writeToParcel(parcel0, 0);
            return parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
    }

    public final String zzD(String s, int v, boolean z) {
        if(s == null) {
            return null;
        }
        if(s.codePointCount(0, s.length()) > v) {
            return z ? s.substring(0, s.offsetByCodePoints(0, v)) + "..." : null;
        }
        return s;
    }

    public final URL zzE(long v, String s, String s1, long v1) {
        try {
            Preconditions.checkNotEmpty(s1);
            Preconditions.checkNotEmpty(s);
            String s2 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v74029." + this.zzm()) + "&rdid=" + s1 + "&bundleid=" + s + "&retry=" + v1;
            if(s.equals(this.zzt.zzf().zzm())) {
                s2 = s2 + "&ddl_test=1";
            }
            return new URL(s2);
        }
        catch(MalformedURLException | IllegalArgumentException malformedURLException0) {
        }
        this.zzt.zzay().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", malformedURLException0.getMessage());
        return null;
    }

    public static ArrayList zzH(List list0) {
        if(list0 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("app_id", ((zzac)object0).zza);
            bundle0.putString("origin", ((zzac)object0).zzb);
            bundle0.putLong("creation_timestamp", ((zzac)object0).zzd);
            bundle0.putString("name", ((zzac)object0).zzc.zzb);
            zzgn.zzb(bundle0, Preconditions.checkNotNull(((zzac)object0).zzc.zza()));
            bundle0.putBoolean("active", ((zzac)object0).zze);
            String s = ((zzac)object0).zzf;
            if(s != null) {
                bundle0.putString("trigger_event_name", s);
            }
            zzaw zzaw0 = ((zzac)object0).zzg;
            if(zzaw0 != null) {
                bundle0.putString("timed_out_event_name", zzaw0.zza);
                zzau zzau0 = zzaw0.zzb;
                if(zzau0 != null) {
                    bundle0.putBundle("timed_out_event_params", zzau0.zzc());
                }
            }
            bundle0.putLong("trigger_timeout", ((zzac)object0).zzh);
            zzaw zzaw1 = ((zzac)object0).zzi;
            if(zzaw1 != null) {
                bundle0.putString("triggered_event_name", zzaw1.zza);
                zzau zzau1 = zzaw1.zzb;
                if(zzau1 != null) {
                    bundle0.putBundle("triggered_event_params", zzau1.zzc());
                }
            }
            bundle0.putLong("triggered_timestamp", ((zzac)object0).zzc.zzc);
            bundle0.putLong("time_to_live", ((zzac)object0).zzj);
            zzaw zzaw2 = ((zzac)object0).zzk;
            if(zzaw2 != null) {
                bundle0.putString("expired_event_name", zzaw2.zza);
                zzau zzau2 = zzaw2.zzb;
                if(zzau2 != null) {
                    bundle0.putBundle("expired_event_params", zzau2.zzc());
                }
            }
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    @WorkerThread
    public static void zzK(zzie zzie0, Bundle bundle0, boolean z) {
        if(bundle0 != null && zzie0 != null) {
            if(bundle0.containsKey("_sc") && !z) {
                z = false;
                goto label_16;
            }
            String s = zzie0.zza;
            if(s == null) {
                bundle0.remove("_sn");
            }
            else {
                bundle0.putString("_sn", s);
            }
            String s1 = zzie0.zzb;
            if(s1 == null) {
                bundle0.remove("_sc");
            }
            else {
                bundle0.putString("_sc", s1);
            }
            bundle0.putLong("_si", zzie0.zzc);
            return;
        }
    label_16:
        if(bundle0 != null && zzie0 == null && z) {
            bundle0.remove("_sn");
            bundle0.remove("_sc");
            bundle0.remove("_si");
        }
    }

    public final void zzP(zzcf zzcf0, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("r", z);
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzt.zzay().zzk().zzb("Error returning boolean value to wrapper", remoteException0);
        }
    }

    public final void zzQ(zzcf zzcf0, ArrayList arrayList0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("r", arrayList0);
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzt.zzay().zzk().zzb("Error returning bundle list to wrapper", remoteException0);
        }
    }

    public final void zzR(zzcf zzcf0, Bundle bundle0) {
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzt.zzay().zzk().zzb("Error returning bundle value to wrapper", remoteException0);
        }
    }

    public final void zzS(zzcf zzcf0, byte[] arr_b) {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("r", arr_b);
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzt.zzay().zzk().zzb("Error returning byte array to wrapper", remoteException0);
        }
    }

    public final void zzT(zzcf zzcf0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("r", v);
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzt.zzay().zzk().zzb("Error returning int value to wrapper", remoteException0);
        }
    }

    public final void zzU(zzcf zzcf0, long v) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("r", v);
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzt.zzay().zzk().zzb("Error returning long value to wrapper", remoteException0);
        }
    }

    public final void zzV(zzcf zzcf0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("r", s);
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzt.zzay().zzk().zzb("Error returning string value to wrapper", remoteException0);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.b0
    @WorkerThread
    public final void zzaA() {
        this.zzg();
        SecureRandom secureRandom0 = new SecureRandom();
        long v = secureRandom0.nextLong();
        if(v == 0L) {
            v = secureRandom0.nextLong();
            if(v == 0L) {
                a.A(this.zzt, "Utils falling back to Random for random id");
            }
        }
        this.c.set(v);
    }

    // 去混淆评级： 低(30)
    public static boolean zzal(String s) {
        return !"_err".equals(s);
    }

    @Override  // com.google.android.gms.measurement.internal.b0
    public final boolean zzf() {
        return true;
    }

    public final int zzh(String s) {
        if(!this.q("event", s)) {
            return 2;
        }
        if(!this.n("event", zzgo.zza, zzgo.zzb, s)) {
            return 13;
        }
        return this.m(40, "event", s) ? 0 : 2;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if(this.e == null) {
            this.e = (int)(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzt.zzau()) / 1000);
        }
        return (int)this.e;
    }

    public final int zzo(int v) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzt.zzau(), 12451000);
    }

    public final long zzq() {
        int v2;
        long v1;
        if(this.c.get() == 0L) {
            synchronized(this.c) {
                v1 = new Random(System.nanoTime() ^ this.zzt.zzav().currentTimeMillis()).nextLong();
                v2 = this.d + 1;
                this.d = v2;
            }
            return v1 + ((long)v2);
        }
        synchronized(this.c) {
            this.c.compareAndSet(-1L, 1L);
        }
        return this.c.getAndIncrement();
    }

    public final long zzr(long v, long v1) {
        return (v1 * 60000L + v) / 86400000L;
    }
}

