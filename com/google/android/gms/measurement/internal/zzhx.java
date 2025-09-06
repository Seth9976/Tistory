package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzpd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzhx extends p {
    public zzgr b;
    public final CopyOnWriteArraySet c;
    public boolean d;
    public final AtomicReference e;
    public final Object f;
    public zzai g;
    public int h;
    public final AtomicLong i;
    public long j;
    public int k;
    public final zzs l;
    public final r m;
    @VisibleForTesting
    protected n0 zza;
    @VisibleForTesting
    protected boolean zzc;

    public zzhx(zzfr zzfr0) {
        super(zzfr0);
        this.c = new CopyOnWriteArraySet();
        this.f = new Object();
        this.zzc = true;
        this.m = new r(this);
        this.e = new AtomicReference();
        this.g = new zzai(null, null);
        this.h = 100;
        this.j = -1L;
        this.k = 100;
        this.i = new AtomicLong(0L);
        this.l = new zzs(zzfr0);
    }

    public final void a(String s, String s1, Bundle bundle0) {
        this.zzg();
        this.b(s, s1, bundle0, this.zzt.zzav().currentTimeMillis());
    }

    public final void b(String s, String s1, Bundle bundle0, long v) {
        this.zzg();
        this.zzI(s, s1, v, bundle0, true, this.b == null || zzlb.v(s1), true, null);
    }

    public final void c(long v, boolean z) {
        this.zzg();
        this.zza();
        this.zzt.zzay().zzc().zza("Resetting analytics data (FE)");
        zzkc zzkc0 = this.zzt.zzu();
        zzkc0.zzg();
        zzkc0.zzb.c.a();
        zzkc0.zzb.a = 0L;
        zzkc0.zzb.b = 0L;
        zzpd.zzc();
        if(this.zzt.zzf().zzs(null, zzdu.zzam)) {
            this.zzt.zzh().a();
        }
        boolean z1 = this.zzt.zzJ();
        o o0 = this.zzt.zzm();
        o0.d.zzb(v);
        if(!TextUtils.isEmpty(o0.zzt.zzm().s.zza())) {
            o0.s.zzb(null);
        }
        zzof.zzc();
        zzdt zzdt0 = zzdu.zzad;
        if(o0.zzt.zzf().zzs(null, zzdt0)) {
            o0.m.zzb(0L);
        }
        o0.n.zzb(0L);
        if(!o0.zzt.zzf().zzv()) {
            o0.c(!z1);
        }
        o0.t.zzb(null);
        o0.u.zzb(0L);
        o0.v.zzb(null);
        if(z) {
            this.zzt.zzt().zzC();
        }
        zzof.zzc();
        if(this.zzt.zzf().zzs(null, zzdt0)) {
            this.zzt.zzu().zza.a();
        }
        this.zzc = !z1;
    }

    public final void d(zzai zzai0) {
        boolean z;
        this.zzg();
        if(zzai0.zzi(zzah.zzb) && zzai0.zzi(zzah.zza)) {
            z = true;
        }
        else if(!this.zzt.zzt().b()) {
            z = false;
        }
        else {
            z = true;
        }
        if(z != this.zzt.zzK()) {
            this.zzt.zzG(z);
            o o0 = this.zzt.zzm();
            o0.zzg();
            Boolean boolean0 = o0.a().contains("measurement_enabled_from_api") ? Boolean.valueOf(o0.a().getBoolean("measurement_enabled_from_api", true)) : null;
            if(!z || boolean0 == null || boolean0.booleanValue()) {
                this.f(Boolean.valueOf(z), false);
            }
        }
    }

    public final void e(long v, Object object0, String s, String s1) {
        String s3;
        Object object1;
        String s2 = "false";
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.zza();
        if(!"allow_personalized_ads".equals(s1)) {
            object1 = object0;
            s3 = s1;
        }
        else if(object0 instanceof String && !TextUtils.isEmpty(((String)object0))) {
            long v1 = "false".equals(((String)object0).toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
            object0 = v1;
            zzev zzev0 = this.zzt.zzm().k;
            if(v1 == 1L) {
                s2 = "true";
            }
            zzev0.zzb(s2);
            object1 = object0;
            s3 = "_npa";
        }
        else if(object0 == null) {
            this.zzt.zzm().k.zzb("unset");
            object1 = null;
            s3 = "_npa";
        }
        else {
            object1 = object0;
            s3 = s1;
        }
        if(!this.zzt.zzJ()) {
            a.B(this.zzt, "User property not set since app measurement is disabled");
            return;
        }
        if(!this.zzt.zzM()) {
            return;
        }
        zzkw zzkw0 = new zzkw(v, object1, s3, s);
        this.zzt.zzt().zzK(zzkw0);
    }

    public final void f(Boolean boolean0, boolean z) {
        this.zzg();
        this.zza();
        this.zzt.zzay().zzc().zzb("Setting app measurement enabled (FE)", boolean0);
        o o0 = this.zzt.zzm();
        o0.zzg();
        SharedPreferences.Editor sharedPreferences$Editor0 = o0.a().edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("measurement_enabled");
        }
        else {
            sharedPreferences$Editor0.putBoolean("measurement_enabled", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
        if(z) {
            o o1 = this.zzt.zzm();
            o1.zzg();
            SharedPreferences.Editor sharedPreferences$Editor1 = o1.a().edit();
            if(boolean0 == null) {
                sharedPreferences$Editor1.remove("measurement_enabled_from_api");
            }
            else {
                sharedPreferences$Editor1.putBoolean("measurement_enabled_from_api", boolean0.booleanValue());
            }
            sharedPreferences$Editor1.apply();
        }
        if(!this.zzt.zzK() && (boolean0 == null || boolean0.booleanValue())) {
            return;
        }
        this.g();
    }

    public final void g() {
        this.zzg();
        String s = this.zzt.zzm().k.zza();
        if(s != null) {
            if("unset".equals(s)) {
                this.e(this.zzt.zzav().currentTimeMillis(), null, "app", "_npa");
            }
            else {
                this.e(this.zzt.zzav().currentTimeMillis(), ((long)("true".equals(s) ? 1L : 0L)), "app", "_npa");
            }
        }
        if(this.zzt.zzJ() && this.zzc) {
            this.zzt.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            this.zzz();
            zzof.zzc();
            if(this.zzt.zzf().zzs(null, zzdu.zzad)) {
                this.zzt.zzu().zza.a();
            }
            this.zzt.zzaz().zzp(new n1(this));
            return;
        }
        this.zzt.zzay().zzc().zza("Updating Scion state (FE)");
        this.zzt.zzt().zzI();
    }

    public static void h(zzhx zzhx0, zzai zzai0, zzai zzai1) {
        zzah[] arr_zzah = {zzah.zzb, zzah.zza};
        boolean z = false;
        for(int v = 0; v < 2; ++v) {
            zzah zzah0 = arr_zzah[v];
            if(!zzai1.zzi(zzah0) && zzai0.zzi(zzah0)) {
                z = true;
                break;
            }
        }
        if(!z && !zzai0.zzl(zzai1, new zzah[]{zzah.zzb, zzah.zza})) {
            return;
        }
        zzhx0.zzt.zzh().a();
    }

    public static void i(zzhx zzhx0, zzai zzai0, int v, long v1, boolean z, boolean z1) {
        zzhx0.zzg();
        zzhx0.zza();
        if(v1 <= zzhx0.j && zzai.zzj(zzhx0.k, v)) {
            zzhx0.zzt.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzai0);
            return;
        }
        o o0 = zzhx0.zzt.zzm();
        o0.zzg();
        if(zzai.zzj(v, o0.a().getInt("consent_source", 100))) {
            SharedPreferences.Editor sharedPreferences$Editor0 = o0.a().edit();
            sharedPreferences$Editor0.putString("consent_settings", zzai0.zzh());
            sharedPreferences$Editor0.putInt("consent_source", v);
            sharedPreferences$Editor0.apply();
            zzhx0.j = v1;
            zzhx0.k = v;
            zzhx0.zzt.zzt().zzF(z);
            if(z1) {
                zzhx0.zzt.zzt().zzu(new AtomicReference());
            }
            return;
        }
        zzhx0.zzt.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", v);
    }

    public final void zzA(String s, String s1, Bundle bundle0) {
        long v = this.zzt.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(s);
        Bundle bundle1 = new Bundle();
        bundle1.putString("name", s);
        bundle1.putLong("creation_timestamp", v);
        if(s1 != null) {
            bundle1.putString("expired_event_name", s1);
            bundle1.putBundle("expired_event_params", bundle0);
        }
        this.zzt.zzaz().zzp(new g0(this, bundle1, 1));
    }

    public final void zzB() {
        if(this.zzt.zzau().getApplicationContext() instanceof Application && this.zza != null) {
            ((Application)this.zzt.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final void zzD(String s, String s1, Bundle bundle0) {
        this.zzE(s, s1, bundle0, true, true, this.zzt.zzav().currentTimeMillis());
    }

    public final void zzE(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        Bundle bundle1 = bundle0 == null ? new Bundle() : bundle0;
        switch(s1) {
            case 0: {
                this.zzM((s == null ? "app" : s), s1, v, bundle1, z1, !z1 || this.b == null || zzlb.v(s1), z, null);
                return;
            }
            case 120999: {
                break;
            }
            default: {
                if(!s1.equals("screen_view")) {
                    this.zzM((s == null ? "app" : s), s1, v, bundle1, z1, !z1 || this.b == null || zzlb.v(s1), z, null);
                    return;
                }
            }
        }
        this.zzt.zzs().zzx(bundle1, v);
    }

    public final void zzF(String s, String s1, Bundle bundle0, String s2) {
        throw new IllegalStateException("Unexpected call on client side");
    }

    // 检测为 Lambda 实现
    @WorkerThread
    public final void zzI(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) [...]

    public final void zzJ(zzgs zzgs0) {
        this.zza();
        Preconditions.checkNotNull(zzgs0);
        if(!this.c.add(zzgs0)) {
            a.A(this.zzt, "OnEventListener already registered");
        }
    }

    public final void zzK(long v) {
        this.e.set(null);
        this.zzt.zzaz().zzp(new d0(this, v, 1));
    }

    public final void zzM(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) {
        Bundle bundle1 = new Bundle(bundle0);
        Iterator iterator0 = bundle1.keySet().iterator();
        while(iterator0.hasNext()) {
            int v1 = 0;
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            Object object1 = bundle1.get(s3);
            if(object1 instanceof Bundle) {
                bundle1.putBundle(s3, new Bundle(((Bundle)object1)));
            }
            else if(object1 instanceof Parcelable[]) {
                Parcelable[] arr_parcelable = (Parcelable[])object1;
                while(v1 < arr_parcelable.length) {
                    Parcelable parcelable0 = arr_parcelable[v1];
                    if(parcelable0 instanceof Bundle) {
                        arr_parcelable[v1] = new Bundle(((Bundle)parcelable0));
                    }
                    ++v1;
                }
            }
            else if(object1 instanceof List) {
                List list0 = (List)object1;
                while(v1 < list0.size()) {
                    Object object2 = list0.get(v1);
                    if(object2 instanceof Bundle) {
                        list0.set(v1, new Bundle(((Bundle)object2)));
                    }
                    ++v1;
                }
            }
        }
        this.zzt.zzaz().zzp(() -> {
            Bundle[] arr_bundle;
            ArrayList arrayList1;
            boolean z5;
            int v2;
            Preconditions.checkNotEmpty(s);
            Preconditions.checkNotNull(bundle1);
            this.zzg();
            this.zza();
            if(this.zzt.zzJ()) {
                List list0 = this.zzt.zzh().h;
                if(list0 != null && !list0.contains(s1)) {
                    this.zzt.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", s1, s);
                    return;
                }
                if(!this.d) {
                    try {
                        this.d = true;
                        Class class0 = this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService") : Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzau().getClassLoader());
                        try {
                            class0.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzau());
                        }
                        catch(Exception exception0) {
                            this.zzt.zzay().zzk().zzb("Failed to invoke Tag Manager\'s initialize() method", exception0);
                        }
                    }
                    catch(ClassNotFoundException unused_ex) {
                        this.zzt.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
                    }
                }
                if("_cmp".equals(s1) && bundle1.containsKey("gclid")) {
                    String s3 = bundle1.getString("gclid");
                    this.e(this.zzt.zzav().currentTimeMillis(), s3, "auto", "_lgclid");
                }
                if(z && zzlb.zzal(s1)) {
                    this.zzt.zzv().g(bundle1, this.zzt.zzm().v.zza());
                }
                r r0 = this.m;
                int v1 = 0;
                if(!z2 && !"_iap".equals(s1)) {
                    zzlb zzlb0 = this.zzt.zzv();
                    if(!zzlb0.r("event", s1)) {
                        v2 = 2;
                    }
                    else if(!zzlb0.n("event", zzgo.zza, zzgo.zzb, s1)) {
                        v2 = 13;
                    }
                    else if(zzlb0.m(40, "event", s1)) {
                        v2 = 0;
                    }
                    else {
                        v2 = 2;
                    }
                    if(v2 != 0) {
                        this.zzt.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(s1));
                        String s4 = this.zzt.zzv().zzD(s1, 40, true);
                        if(s1 != null) {
                            v1 = s1.length();
                        }
                        this.zzt.zzv().getClass();
                        zzlb.i(r0, null, v2, "_ev", s4, v1);
                        return;
                    }
                }
                zzie zzie0 = this.zzt.zzs().zzj(false);
                if(zzie0 != null && !bundle1.containsKey("_sc")) {
                    zzie0.a = true;
                }
                zzlb.zzK(zzie0, bundle1, z && !z2);
                boolean z3 = "am".equals(s);
                boolean z4 = zzlb.v(s1);
                if(!z || this.b == null || z4) {
                    z5 = z3;
                }
                else {
                    if(z3) {
                        z5 = true;
                        goto label_60;
                    }
                    this.zzt.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(s1), this.zzt.zzj().zzb(bundle1));
                    Preconditions.checkNotNull(this.b);
                    this.b.interceptEvent(s, s1, bundle1, v);
                    return;
                }
            label_60:
                if(this.zzt.zzM()) {
                    int v3 = this.zzt.zzv().zzh(s1);
                    if(v3 != 0) {
                        this.zzt.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(s1));
                        String s5 = this.zzt.zzv().zzD(s1, 40, true);
                        if(s1 != null) {
                            v1 = s1.length();
                        }
                        this.zzt.zzv().getClass();
                        zzlb.i(r0, s2, v3, "_ev", s5, v1);
                        return;
                    }
                    List list1 = CollectionUtils.listOf(new String[]{"_o", "_sn", "_sc", "_si"});
                    Bundle bundle1 = this.zzt.zzv().L(s1, bundle1, list1, z2);
                    Preconditions.checkNotNull(bundle1);
                    if(this.zzt.zzs().zzj(false) != null && "_ae".equals(s1)) {
                        zzkc zzkc0 = this.zzt.zzu();
                        long v4 = zzkc0.zzb.d.zzt.zzav().elapsedRealtime();
                        long v5 = v4 - zzkc0.zzb.b;
                        zzkc0.zzb.b = v4;
                        if(v5 > 0L) {
                            this.zzt.zzv().e(bundle1, v5);
                        }
                    }
                    zznw.zzc();
                    if(this.zzt.zzf().zzs(null, zzdu.zzac)) {
                        if(!"auto".equals(s) && "_ssr".equals(s1)) {
                            zzlb zzlb1 = this.zzt.zzv();
                            String s6 = bundle1.getString("_ffr");
                            if(Strings.isEmptyOrWhitespace(s6)) {
                                s6 = null;
                            }
                            else if(s6 != null) {
                                s6 = s6.trim();
                            }
                            if(!zzkz.zza(s6, zzlb1.zzt.zzm().s.zza())) {
                                zzlb1.zzt.zzm().s.zzb(s6);
                                goto label_99;
                            }
                            zzlb1.zzt.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                        else if("_ae".equals(s1)) {
                            String s7 = this.zzt.zzv().zzt.zzm().s.zza();
                            if(!TextUtils.isEmpty(s7)) {
                                bundle1.putString("_ffr", s7);
                            }
                        }
                    }
                label_99:
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(bundle1);
                    if(this.zzt.zzm().m.zza() <= 0L || !this.zzt.zzm().d(v) || !this.zzt.zzm().p.zzb()) {
                        arrayList1 = arrayList0;
                    }
                    else {
                        a.B(this.zzt, "Current session is expired, remove the session number, ID, and engagement time");
                        arrayList1 = arrayList0;
                        this.e(this.zzt.zzav().currentTimeMillis(), null, "auto", "_sid");
                        this.e(this.zzt.zzav().currentTimeMillis(), null, "auto", "_sno");
                        this.e(this.zzt.zzav().currentTimeMillis(), null, "auto", "_se");
                        this.zzt.zzm().n.zzb(0L);
                    }
                    if(bundle1.getLong("extend_session", 0L) == 1L) {
                        a.B(this.zzt, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        this.zzt.zzu().zza.b(v, true);
                    }
                    ArrayList arrayList2 = new ArrayList(bundle1.keySet());
                    Collections.sort(arrayList2);
                    int v6 = arrayList2.size();
                    for(int v7 = 0; v7 < v6; ++v7) {
                        String s8 = (String)arrayList2.get(v7);
                        if(s8 != null) {
                            this.zzt.zzv();
                            Object object0 = bundle1.get(s8);
                            if(object0 instanceof Bundle) {
                                arr_bundle = new Bundle[]{((Bundle)object0)};
                            }
                            else if(object0 instanceof Parcelable[]) {
                                arr_bundle = (Bundle[])Arrays.copyOf(((Parcelable[])object0), ((Parcelable[])object0).length, Bundle[].class);
                            }
                            else {
                                arr_bundle = object0 instanceof ArrayList ? ((Bundle[])((ArrayList)object0).toArray(new Bundle[((ArrayList)object0).size()])) : null;
                            }
                            if(arr_bundle != null) {
                                bundle1.putParcelableArray(s8, arr_bundle);
                            }
                        }
                    }
                    for(int v8 = 0; v8 < arrayList1.size(); ++v8) {
                        Bundle bundle2 = (Bundle)arrayList1.get(v8);
                        bundle2.putString("_o", s);
                        if(z1) {
                            bundle2 = this.zzt.zzv().K(bundle2);
                        }
                        Bundle bundle3 = bundle2;
                        zzaw zzaw0 = new zzaw((v8 == 0 ? s1 : "_ep"), new zzau(bundle2), s, v);
                        this.zzt.zzt().zzA(zzaw0, s2);
                        if(!z5) {
                            for(Object object1: this.c) {
                                ((zzgs)object1).onEvent(s, s1, new Bundle(bundle3), v);
                            }
                        }
                    }
                    if(this.zzt.zzs().zzj(false) != null && "_ae".equals(s1)) {
                        zzkc zzkc1 = this.zzt.zzu();
                        long v9 = this.zzt.zzav().elapsedRealtime();
                        zzkc1.zzb.a(v9, true, true);
                    }
                }
                return;
            }
            this.zzt.zzay().zzc().zza("Event not sent since app measurement is disabled");
        });
    }

    public final void zzP(Bundle bundle0) {
        this.zzQ(bundle0, this.zzt.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle0, long v) {
        Preconditions.checkNotNull(bundle0);
        Bundle bundle1 = new Bundle(bundle0);
        if(!TextUtils.isEmpty(bundle1.getString("app_id"))) {
            a.A(this.zzt, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle1.remove("app_id");
        Preconditions.checkNotNull(bundle1);
        zzgn.zza(bundle1, "app_id", String.class, null);
        zzgn.zza(bundle1, "origin", String.class, null);
        zzgn.zza(bundle1, "name", String.class, null);
        zzgn.zza(bundle1, "value", Object.class, null);
        zzgn.zza(bundle1, "trigger_event_name", String.class, null);
        zzgn.zza(bundle1, "trigger_timeout", Long.class, 0L);
        zzgn.zza(bundle1, "timed_out_event_name", String.class, null);
        zzgn.zza(bundle1, "timed_out_event_params", Bundle.class, null);
        zzgn.zza(bundle1, "triggered_event_name", String.class, null);
        zzgn.zza(bundle1, "triggered_event_params", Bundle.class, null);
        zzgn.zza(bundle1, "time_to_live", Long.class, 0L);
        zzgn.zza(bundle1, "expired_event_name", String.class, null);
        zzgn.zza(bundle1, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle1.getString("name"));
        Preconditions.checkNotEmpty(bundle1.getString("origin"));
        Preconditions.checkNotNull(bundle1.get("value"));
        bundle1.putLong("creation_timestamp", v);
        String s = bundle1.getString("name");
        Object object0 = bundle1.get("value");
        if(this.zzt.zzv().H(s) == 0) {
            if(this.zzt.zzv().E(object0, s) == 0) {
                Object object1 = this.zzt.zzv().b(object0, s);
                if(object1 == null) {
                    this.zzt.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(s), object0);
                    return;
                }
                zzgn.zzb(bundle1, object1);
                long v1 = bundle1.getLong("trigger_timeout");
                if(!TextUtils.isEmpty(bundle1.getString("trigger_event_name")) && (v1 > 15552000000L || v1 < 1L)) {
                    this.zzt.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(s), v1);
                    return;
                }
                long v2 = bundle1.getLong("time_to_live");
                if(v2 <= 15552000000L && v2 >= 1L) {
                    this.zzt.zzaz().zzp(new g0(this, bundle1, 0));
                    return;
                }
                this.zzt.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(s), v2);
                return;
            }
            this.zzt.zzay().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(s), object0);
            return;
        }
        this.zzt.zzay().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(s));
    }

    public final void zzR(Bundle bundle0, int v, long v1) {
        this.zza();
        String s = zzai.zzg(bundle0);
        if(s != null) {
            this.zzt.zzay().zzl().zzb("Ignoring invalid consent setting", s);
            this.zzt.zzay().zzl().zza("Valid consent values are \'granted\', \'denied\'");
        }
        this.zzS(zzai.zza(bundle0), v, v1);
    }

    public final void zzS(zzai zzai0, int v, long v1) {
        zzai zzai2;
        boolean z2;
        boolean z1;
        zzai zzai1 = zzai0;
        this.zza();
        if(v != -10 && zzai0.zze() == null && zzai0.zzf() == null) {
            this.zzt.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized(this.f) {
            zzai2 = this.g;
            boolean z = false;
            if(zzai.zzj(v, this.h)) {
                z1 = zzai1.zzk(this.g);
                if(zzai1.zzi(zzah.zzb) && !this.g.zzi(zzah.zzb)) {
                    z = true;
                }
                zzai1 = zzai1.zzd(this.g);
                this.g = zzai1;
                this.h = v;
                z2 = z;
                z = true;
            }
            else {
                z1 = false;
                z2 = false;
            }
        }
        if(!z) {
            this.zzt.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzai1);
            return;
        }
        long v3 = this.i.getAndIncrement();
        if(z1) {
            this.e.set(null);
            this.zzt.zzaz().zzq(new k0(this, zzai1, v1, v, v3, z2, zzai2));
            return;
        }
        l0 l00 = new l0(this, zzai1, v, v3, z2, zzai2);
        if(v != -10 && v != 30) {
            this.zzt.zzaz().zzp(l00);
            return;
        }
        this.zzt.zzaz().zzq(l00);
    }

    @WorkerThread
    public final void zzT(zzgr zzgr0) {
        this.zzg();
        this.zza();
        if(zzgr0 != null) {
            zzgr zzgr1 = this.b;
            if(zzgr0 != zzgr1) {
                Preconditions.checkState(zzgr1 == null, "EventInterceptor already set.");
            }
        }
        this.b = zzgr0;
    }

    public final void zzU(Boolean boolean0) {
        this.zza();
        this.zzt.zzaz().zzp(new f(6, this, boolean0));
    }

    public final void zzW(String s, String s1, Object object0, boolean z) {
        this.zzX("auto", "_ldl", object0, true, this.zzt.zzav().currentTimeMillis());
    }

    public final void zzX(String s, String s1, Object object0, boolean z, long v) {
        int v2;
        String s2 = s == null ? "app" : s;
        int v1 = 0;
        if(z) {
            v2 = this.zzt.zzv().H(s1);
        }
        else {
            zzlb zzlb0 = this.zzt.zzv();
            v2 = 6;
            if(zzlb0.r("user property", s1)) {
                if(!zzlb0.n("user property", zzgq.zza, null, s1)) {
                    v2 = 15;
                }
                else if(zzlb0.m(24, "user property", s1)) {
                    v2 = 0;
                }
            }
        }
        r r0 = this.m;
        if(v2 != 0) {
            String s3 = this.zzt.zzv().zzD(s1, 24, true);
            if(s1 != null) {
                v1 = s1.length();
            }
            this.zzt.zzv().getClass();
            zzlb.i(r0, null, v2, "_ev", s3, v1);
            return;
        }
        if(object0 != null) {
            int v3 = this.zzt.zzv().E(object0, s1);
            if(v3 != 0) {
                String s4 = this.zzt.zzv().zzD(s1, 24, true);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    v1 = object0.toString().length();
                }
                this.zzt.zzv().getClass();
                zzlb.i(r0, null, v3, "_ev", s4, v1);
                return;
            }
            Object object1 = this.zzt.zzv().b(object0, s1);
            if(object1 != null) {
                this.zzt.zzaz().zzp(new r0(this, s2, s1, object1, v, 2));
            }
            return;
        }
        this.zzt.zzaz().zzp(new r0(this, s2, s1, null, v, 2));
    }

    public final void zzZ(zzgs zzgs0) {
        this.zza();
        Preconditions.checkNotNull(zzgs0);
        if(!this.c.remove(zzgs0)) {
            a.A(this.zzt, "OnEventListener had not been registered");
        }
    }

    @Override  // com.google.android.gms.measurement.internal.p
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String s) {
        Preconditions.checkNotEmpty(s);
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Boolean)this.zzt.zzaz().a(atomicReference0, 15000L, "boolean test flag value", new i0(this, atomicReference0, 0));
    }

    public final Double zzj() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Double)this.zzt.zzaz().a(atomicReference0, 15000L, "double test flag value", new i0(this, atomicReference0, 4));
    }

    public final Integer zzl() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Integer)this.zzt.zzaz().a(atomicReference0, 15000L, "int test flag value", new i0(this, atomicReference0, 3));
    }

    public final Long zzm() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Long)this.zzt.zzaz().a(atomicReference0, 15000L, "long test flag value", new i0(this, atomicReference0, 2));
    }

    public final String zzo() {
        return (String)this.e.get();
    }

    public final String zzp() {
        zzie zzie0 = this.zzt.zzs().zzi();
        return zzie0 == null ? null : zzie0.zzb;
    }

    public final String zzq() {
        zzie zzie0 = this.zzt.zzs().zzi();
        return zzie0 == null ? null : zzie0.zza;
    }

    public final String zzr() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (String)this.zzt.zzaz().a(atomicReference0, 15000L, "String test flag value", new i0(this, atomicReference0, 1));
    }

    public final ArrayList zzs(String s, String s1) {
        if(this.zzt.zzaz().zzs()) {
            this.zzt.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if(zzab.zza()) {
            this.zzt.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzt.zzaz().a(atomicReference0, 5000L, "get conditional user properties", new h0(0, s, this, atomicReference0, s1));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzt.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzlb.zzH(list0);
    }

    public final List zzt(boolean z) {
        this.zza();
        a.B(this.zzt, "Getting user properties (FE)");
        if(!this.zzt.zzaz().zzs()) {
            if(zzab.zza()) {
                this.zzt.zzay().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference0 = new AtomicReference();
            this.zzt.zzaz().a(atomicReference0, 5000L, "get user properties", new f0(this, atomicReference0, z));
            List list0 = (List)atomicReference0.get();
            if(list0 == null) {
                this.zzt.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
            return list0;
        }
        this.zzt.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String s, String s1, boolean z) {
        if(this.zzt.zzaz().zzs()) {
            this.zzt.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if(zzab.zza()) {
            this.zzt.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzt.zzaz().a(atomicReference0, 5000L, "get user properties", new j0(this, atomicReference0, s, s1, z, 0));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzt.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap0 = new ArrayMap(list0.size());
        for(Object object0: list0) {
            zzkw zzkw0 = (zzkw)object0;
            Object object1 = zzkw0.zza();
            if(object1 != null) {
                arrayMap0.put(zzkw0.zzb, object1);
            }
        }
        return arrayMap0;
    }

    @WorkerThread
    public final void zzz() {
        this.zzg();
        this.zza();
        if(this.zzt.zzM()) {
            if(this.zzt.zzf().zzs(null, zzdu.zzX)) {
                Boolean boolean0 = this.zzt.zzf().c("google_analytics_deferred_deep_link_enabled");
                if(boolean0 != null && boolean0.booleanValue()) {
                    this.zzt.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaz().zzp(new zzgy(this));
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            o o0 = this.zzt.zzm();
            o0.zzg();
            String s = o0.a().getString("previous_os_version", null);
            o0.zzt.zzg().zzu();
            String s1 = Build.VERSION.RELEASE;
            if(!TextUtils.isEmpty(s1) && !s1.equals(s)) {
                SharedPreferences.Editor sharedPreferences$Editor0 = o0.a().edit();
                sharedPreferences$Editor0.putString("previous_os_version", s1);
                sharedPreferences$Editor0.apply();
            }
            if(!TextUtils.isEmpty(s)) {
                this.zzt.zzg().zzu();
                if(!s.equals(s1)) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("_po", s);
                    this.a("auto", "_ou", bundle0);
                }
            }
        }
    }
}

