package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import jeb.synthetic.TWR;

public final class zzkt implements zzgm {
    public final HashMap A;
    public final HashMap B;
    public zzie C;
    public String D;
    public final o1 E;
    public static volatile zzkt F;
    public final zzfi a;
    public final zzen b;
    public e c;
    public n d;
    public zzkf e;
    public b f;
    public final zzkv g;
    public q0 h;
    public zzjo i;
    public final zzki j;
    public zzez k;
    public final zzfr l;
    public boolean m;
    public boolean n;
    public long o;
    public ArrayList p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public FileLock v;
    public FileChannel w;
    public ArrayList x;
    public ArrayList y;
    public long z;

    public zzkt(zzku zzku0) {
        this.m = false;
        this.E = new o1(this, 2);
        Preconditions.checkNotNull(zzku0);
        this.l = zzfr.zzp(zzku0.a, null, null);
        this.z = -1L;
        this.j = new zzki(this);  // 初始化器: Lcom/google/android/gms/measurement/internal/l1;-><init>(Lcom/google/android/gms/measurement/internal/zzkt;)V
        zzkv zzkv0 = new zzkv(this);  // 初始化器: Lcom/google/android/gms/measurement/internal/m1;-><init>(Lcom/google/android/gms/measurement/internal/zzkt;)V
        zzkv0.zzX();
        this.g = zzkv0;
        zzen zzen0 = new zzen(this);
        zzen0.zzX();
        this.b = zzen0;
        zzfi zzfi0 = new zzfi(this);
        zzfi0.zzX();
        this.a = zzfi0;
        this.A = new HashMap();
        this.B = new HashMap();
        this.zzaz().zzp(new n1(this, zzku0));
    }

    public final boolean A() {
        this.zzaz().zzg();
        this.b();
        e e0 = this.c;
        zzkt.D(e0);
        if(e0.j("select count(1) > 0 from raw_events", null) == 0L) {
            e e1 = this.c;
            zzkt.D(e1);
            return !TextUtils.isEmpty(e1.zzr());
        }
        return true;
    }

    public final boolean B(zzfs zzfs0, zzfs zzfs1) {
        Preconditions.checkArgument("_e".equals(zzfs0.zzo()));
        zzkv zzkv0 = this.g;
        zzkt.D(zzkv0);
        String s = null;
        String s1 = zzkv.a(((zzft)zzfs0.zzaC()), "_sc") == null ? null : "";
        zzkt.D(zzkv0);
        if(zzkv.a(((zzft)zzfs1.zzaC()), "_pc") != null) {
            s = "";
        }
        if(s != null && s.equals(s1)) {
            Preconditions.checkArgument("_e".equals(zzfs0.zzo()));
            zzkt.D(zzkv0);
            zzfx zzfx0 = zzkv.a(((zzft)zzfs0.zzaC()), "_et");
            if(zzfx0 != null && zzfx0.zzw() && zzfx0.zzd() > 0L) {
                long v = zzfx0.zzd();
                zzkt.D(zzkv0);
                zzfx zzfx1 = zzkv.a(((zzft)zzfs1.zzaC()), "_et");
                if(zzfx1 != null && zzfx1.zzd() > 0L) {
                    v += zzfx1.zzd();
                }
                zzkt.D(zzkv0);
                zzkv.A(zzfs1, "_et", v);
                zzkt.D(zzkv0);
                zzkv.A(zzfs0, "_fr", 1L);
            }
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static final boolean C(zzq zzq0) {
        return !TextUtils.isEmpty(zzq0.zzb) || !TextUtils.isEmpty(zzq0.zzq);
    }

    public static final void D(m1 m10) {
        if(m10 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if(!m10.a) {
            throw new IllegalStateException("Component not initialized: " + m10.getClass());
        }
    }

    public final c0 E(zzq zzq0) {
        this.zzaz().zzg();
        this.b();
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        if(!zzq0.zzw.isEmpty()) {
            q1 q10 = new q1(this, zzq0.zzw);
            this.B.put(zzq0.zza, q10);
        }
        e e0 = this.c;
        zzkt.D(e0);
        c0 c00 = e0.p(zzq0.zza);
        zzai zzai0 = this.F(zzq0.zza).zzc(zzai.zzb(zzq0.zzv));
        zzah zzah0 = zzah.zza;
        String s = zzai0.zzi(zzah0) ? this.i.b(zzq0.zza, zzq0.zzo) : "";
        if(c00 == null) {
            c00 = new c0(this.l, zzq0.zza);
            if(zzai0.zzi(zzah.zzb)) {
                c00.c(this.G(zzai0));
            }
            if(zzai0.zzi(zzah0)) {
                c00.r(s);
            }
        }
        else if(!zzai0.zzi(zzah0) || s == null) {
        label_41:
            if(TextUtils.isEmpty(c00.x()) && zzai0.zzi(zzah.zzb)) {
                c00.c(this.G(zzai0));
            }
        }
        else {
            c00.a.zzaz().zzg();
            if(s.equals(c00.e)) {
                goto label_41;
            }
            else {
                c00.r(s);
                if(zzq0.zzo) {
                    zzjo zzjo0 = this.i;
                    zzjo0.getClass();
                    if(!"00000000-0000-0000-0000-000000000000".equals((zzai0.zzi(zzah0) ? zzjo0.a(zzq0.zza) : new Pair("", Boolean.FALSE)).first)) {
                        c00.c(this.G(zzai0));
                        e e1 = this.c;
                        zzkt.D(e1);
                        if(e1.t(zzq0.zza, "_id") != null) {
                            e e2 = this.c;
                            zzkt.D(e2);
                            if(e2.t(zzq0.zza, "_lair") == null) {
                                long v = this.zzav().currentTimeMillis();
                                r1 r10 = new r1(zzq0.zza, "auto", "_lair", v, 1L);
                                e e3 = this.c;
                                zzkt.D(e3);
                                e3.g(r10);
                            }
                        }
                    }
                }
            }
        }
        c00.k(zzq0.zzb);
        c00.b(zzq0.zzq);
        if(!TextUtils.isEmpty(zzq0.zzk)) {
            c00.j(zzq0.zzk);
        }
        long v1 = zzq0.zze;
        if(v1 != 0L) {
            c00.l(v1);
        }
        if(!TextUtils.isEmpty(zzq0.zzc)) {
            c00.e(zzq0.zzc);
        }
        c00.f(zzq0.zzj);
        String s1 = zzq0.zzd;
        if(s1 != null) {
            c00.d(s1);
        }
        c00.h(zzq0.zzf);
        c00.q(zzq0.zzh);
        if(!TextUtils.isEmpty(zzq0.zzg)) {
            c00.m(zzq0.zzg);
        }
        zzfr zzfr0 = c00.a;
        zzfr0.zzaz().zzg();
        c00.C |= c00.p != zzq0.zzo;
        c00.p = zzq0.zzo;
        zzfr0.zzaz().zzg();
        c00.C |= !zzg.zza(c00.r, zzq0.zzr);
        c00.r = zzq0.zzr;
        c00.i(zzq0.zzs);
        zzpd.zzc();
        if(this.zzg().zzs(null, zzdu.zzal) && this.zzg().zzs(zzq0.zza, zzdu.zzan)) {
            zzfr0.zzaz().zzg();
            c00.C |= true ^ zzg.zza(c00.u, zzq0.zzx);
            c00.u = zzq0.zzx;
        }
        zznt.zzc();
        if(this.zzg().zzs(null, zzdu.zzaj)) {
            c00.s(zzq0.zzt);
        }
        else {
            zznt.zzc();
            if(this.zzg().zzs(null, zzdu.zzai)) {
                c00.s(null);
            }
        }
        zzfr0.zzaz().zzg();
        if(c00.C) {
            e e4 = this.c;
            zzkt.D(e4);
            e4.b(c00);
        }
        return c00;
    }

    public final zzai F(String s) {
        String s1;
        this.zzaz().zzg();
        this.b();
        zzai zzai0 = (zzai)this.A.get(s);
        if(zzai0 == null) {
            e e0 = this.c;
            zzkt.D(e0);
            Preconditions.checkNotNull(s);
            e0.zzg();
            e0.zzW();
            SQLiteDatabase sQLiteDatabase0 = e0.o();
            Cursor cursor0 = null;
            try {
                try {
                    cursor0 = sQLiteDatabase0.rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{s});
                    if(cursor0.moveToFirst()) {
                        s1 = cursor0.getString(0);
                        goto label_21;
                    }
                    else {
                        goto label_23;
                    }
                    goto label_25;
                }
                catch(SQLiteException sQLiteException0) {
                    e0.zzt.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", sQLiteException0);
                    throw sQLiteException0;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_21:
            cursor0.close();
            goto label_25;
        label_23:
            cursor0.close();
            s1 = "G1";
        label_25:
            zzai0 = zzai.zzb(s1);
            this.n(s, zzai0);
            return zzai0;
        }
        return zzai0;
    }

    public final String G(zzai zzai0) {
        if(zzai0.zzi(zzah.zzb)) {
            byte[] arr_b = new byte[16];
            this.zzv().d().nextBytes(arr_b);
            return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        return null;
    }

    public final void a() {
        this.zzaz().zzg();
        this.b();
        if(!this.n) {
            this.n = true;
            this.zzaz().zzg();
            zzfr zzfr0 = this.l;
            if(this.v == null || !this.v.isValid()) {
                File file0 = new File(zzfr0.zzau().getFilesDir(), "google_app_measurement.db");
                try {
                    FileChannel fileChannel0 = new RandomAccessFile(file0, "rw").getChannel();
                    this.w = fileChannel0;
                    FileLock fileLock0 = fileChannel0.tryLock();
                    this.v = fileLock0;
                    if(fileLock0 == null) {
                        this.zzay().zzd().zza("Storage concurrent data access panic");
                        return;
                    }
                    this.zzay().zzj().zza("Storage concurrent access okay");
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    this.zzay().zzd().zzb("Failed to acquire storage lock", fileNotFoundException0);
                    return;
                }
                catch(IOException iOException0) {
                    this.zzay().zzd().zzb("Failed to access storage lock file", iOException0);
                    return;
                }
                catch(OverlappingFileLockException overlappingFileLockException0) {
                    this.zzay().zzk().zzb("Storage lock already acquired", overlappingFileLockException0);
                    return;
                }
            }
            else {
                this.zzay().zzj().zza("Storage concurrent access okay");
            }
            FileChannel fileChannel1 = this.w;
            this.zzaz().zzg();
            int v = 0;
            if(fileChannel1 == null || !fileChannel1.isOpen()) {
                this.zzay().zzd().zza("Bad channel to read from");
            }
            else {
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
                try {
                    fileChannel1.position(0L);
                    int v1 = fileChannel1.read(byteBuffer0);
                    if(v1 == 4) {
                        byteBuffer0.flip();
                        v = byteBuffer0.getInt();
                    }
                    else if(v1 != -1) {
                        this.zzay().zzk().zzb("Unexpected data length. Bytes read", v1);
                    }
                    goto label_46;
                }
                catch(IOException iOException1) {
                }
                this.zzay().zzd().zzb("Failed to read from channel", iOException1);
            }
        label_46:
            zzdy zzdy0 = zzfr0.zzh();
            zzdy0.zza();
            int v2 = zzdy0.d;
            this.zzaz().zzg();
            if(v > v2) {
                this.zzay().zzd().zzc("Panic: can\'t downgrade version. Previous, current version", v, v2);
                return;
            }
            if(v < v2) {
                FileChannel fileChannel2 = this.w;
                this.zzaz().zzg();
                if(fileChannel2 != null && fileChannel2.isOpen()) {
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(4);
                    byteBuffer1.putInt(v2);
                    byteBuffer1.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBuffer1);
                        fileChannel2.force(true);
                        if(fileChannel2.size() != 4L) {
                            this.zzay().zzd().zzb("Error writing to channel. Bytes written", fileChannel2.size());
                        }
                    }
                    catch(IOException iOException2) {
                        this.zzay().zzd().zzb("Failed to write to channel", iOException2);
                        this.zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", v, v2);
                        return;
                    }
                    this.zzay().zzj().zzc("Storage version upgraded. Previous, current version", v, v2);
                    return;
                }
                this.zzay().zzd().zza("Bad channel to read from");
                this.zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", v, v2);
            }
        }
    }

    public final void b() {
        if(!this.m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void c(zzgc zzgc0, String s) {
        zzfi zzfi0 = this.a;
        zzkt.D(zzfi0);
        zzfi0.zzg();
        zzfi0.c(s);
        ArrayMap arrayMap0 = zzfi0.c;
        Set set0 = (Set)arrayMap0.get(s);
        if(set0 != null) {
            zzgc0.zzi(set0);
        }
        zzkt.D(zzfi0);
        zzfi0.zzg();
        zzfi0.c(s);
        if(arrayMap0.get(s) != null && (((Set)arrayMap0.get(s)).contains("device_model") || ((Set)arrayMap0.get(s)).contains("device_info"))) {
            zzgc0.zzp();
        }
        zzkt.D(zzfi0);
        zzfi0.zzg();
        zzfi0.c(s);
        if(arrayMap0.get(s) != null && (((Set)arrayMap0.get(s)).contains("os_version") || ((Set)arrayMap0.get(s)).contains("device_info"))) {
            if(this.zzg().zzs(s, zzdu.zzaq)) {
                String s1 = zzgc0.zzar();
                if(!TextUtils.isEmpty(s1)) {
                    int v = s1.indexOf(".");
                    if(v != -1) {
                        zzgc0.zzY(s1.substring(0, v));
                    }
                }
            }
            else {
                zzgc0.zzu();
            }
        }
        zzkt.D(zzfi0);
        zzfi0.zzg();
        zzfi0.c(s);
        if(arrayMap0.get(s) != null && ((Set)arrayMap0.get(s)).contains("user_id")) {
            int v1 = zzkv.j(zzgc0, "_id");
            if(v1 != -1) {
                zzgc0.zzB(v1);
            }
        }
        zzkt.D(zzfi0);
        zzfi0.zzg();
        zzfi0.c(s);
        if(arrayMap0.get(s) != null && ((Set)arrayMap0.get(s)).contains("google_signals")) {
            zzgc0.zzq();
        }
        zzkt.D(zzfi0);
        zzfi0.zzg();
        zzfi0.c(s);
        if(arrayMap0.get(s) != null && ((Set)arrayMap0.get(s)).contains("app_instance_id")) {
            zzgc0.zzn();
            HashMap hashMap0 = this.B;
            q1 q10 = (q1)hashMap0.get(s);
            if(q10 == null) {
            label_48:
                zzlb zzlb0 = this.zzv();
                byte[] arr_b = new byte[16];
                zzlb0.d().nextBytes(arr_b);
                q10 = new q1(this, String.format(Locale.US, "%032x", new BigInteger(1, arr_b)));
                hashMap0.put(s, q10);
            }
            else {
                long v2 = this.zzg().zzi(s, zzdu.zzR);
                long v3 = this.zzav().elapsedRealtime();
                if(v2 + q10.b < v3) {
                    goto label_48;
                }
            }
            zzgc0.zzR(q10.a);
        }
        zzkt.D(zzfi0);
        zzfi0.zzg();
        zzfi0.c(s);
        if(arrayMap0.get(s) != null && ((Set)arrayMap0.get(s)).contains("enhanced_user_id")) {
            zzgc0.zzy();
        }
    }

    public final void d(c0 c00) {
        ArrayMap arrayMap1;
        ArrayMap arrayMap0;
        zzfi zzfi0 = this.a;
        this.zzaz().zzg();
        if(TextUtils.isEmpty(c00.A()) && TextUtils.isEmpty(c00.u())) {
            this.h(((String)Preconditions.checkNotNull(c00.w())), 204, null, null, null);
            return;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder();
        String s = c00.A();
        if(TextUtils.isEmpty(s)) {
            s = c00.u();
        }
        Uri.Builder uri$Builder1 = uri$Builder0.scheme("https").encodedAuthority("app-measurement.com").path("config/app/" + s).appendQueryParameter("platform", "android");
        this.j.zzt.zzf().zzh();
        uri$Builder1.appendQueryParameter("gmp_version", "74029").appendQueryParameter("runtime_version", "0");
        String s1 = uri$Builder0.build().toString();
        try {
            Object object0 = Preconditions.checkNotNull(c00.w());
            URL uRL0 = new URL(s1);
            this.zzay().zzj().zzb("Fetching remote configuration", ((String)object0));
            zzkt.D(zzfi0);
            zzff zzff0 = zzfi0.zze(((String)object0));
            zzkt.D(zzfi0);
            String s2 = zzfi0.zzh(((String)object0));
            if(zzff0 == null) {
                arrayMap1 = null;
            }
            else {
                if(TextUtils.isEmpty(s2)) {
                    arrayMap0 = null;
                }
                else {
                    arrayMap0 = new ArrayMap();
                    arrayMap0.put("If-Modified-Since", s2);
                }
                zzox.zzc();
                if(this.zzg().zzs(null, zzdu.zzao)) {
                    zzkt.D(zzfi0);
                    String s3 = zzfi0.zzf(((String)object0));
                    if(!TextUtils.isEmpty(s3)) {
                        if(arrayMap0 == null) {
                            arrayMap0 = new ArrayMap();
                        }
                        arrayMap0.put("If-None-Match", s3);
                    }
                }
                arrayMap1 = arrayMap0;
            }
            this.s = true;
            zzkt.D(this.b);
            o1 o10 = new o1(this, 1);
            this.b.zzg();
            this.b.zzW();
            Preconditions.checkNotNull(uRL0);
            Preconditions.checkNotNull(o10);
            this.b.zzt.zzaz().zzo(new m(this.b, ((String)object0), uRL0, null, arrayMap1, o10));
        }
        catch(MalformedURLException unused_ex) {
            this.zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeh.zzn(c00.w()), s1);
        }
    }

    public final void e(zzaw zzaw0, zzq zzq0) {
        List list3;
        List list2;
        zzfr zzfr0;
        List list1;
        zzaw zzaw2;
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        this.zzaz().zzg();
        this.b();
        String s = zzq0.zza;
        long v = zzaw0.zzd;
        zzei zzei0 = zzei.zzb(zzaw0);
        this.zzaz().zzg();
        zzlb.zzK((this.C == null || (this.D == null || !this.D.equals(s)) ? null : this.C), zzei0.zzd, false);
        zzaw zzaw1 = zzei0.zza();
        zzkt.D(this.g);
        Preconditions.checkNotNull(zzaw1);
        Preconditions.checkNotNull(zzq0);
        if(TextUtils.isEmpty(zzq0.zzb) && TextUtils.isEmpty(zzq0.zzq)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        List list0 = zzq0.zzt;
        if(list0 == null) {
            zzaw2 = zzaw1;
        }
        else {
            if(list0.contains(zzaw1.zza)) {
                Bundle bundle0 = zzaw1.zzb.zzc();
                bundle0.putLong("ga_safelisted", 1L);
                zzau zzau0 = new zzau(bundle0);
                zzaw2 = new zzaw(zzaw1.zza, zzau0, zzaw1.zzc, zzaw1.zzd);
                goto label_29;
            }
            this.zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", s, zzaw1.zza, zzaw1.zzc);
            return;
        }
    label_29:
        e e0 = this.c;
        zzkt.D(e0);
        e0.zzw();
        try {
            e e1 = this.c;
            zzkt.D(e1);
            Preconditions.checkNotEmpty(s);
            e1.zzg();
            e1.zzW();
            int v2 = Long.compare(v, 0L);
            if(v2 < 0) {
                e1.zzt.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeh.zzn(s), v);
                list1 = Collections.emptyList();
            }
            else {
                list1 = e1.w("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{s, String.valueOf(v)});
            }
            Iterator iterator0 = list1.iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                zzfr0 = this.l;
                if(!z) {
                    break;
                }
                Object object0 = iterator0.next();
                zzac zzac0 = (zzac)object0;
                if(zzac0 != null) {
                    this.zzay().zzj().zzd("User property timed out", zzac0.zza, zzfr0.zzj().zzf(zzac0.zzc.zzb), zzac0.zzc.zza());
                    zzaw zzaw3 = zzac0.zzg;
                    if(zzaw3 != null) {
                        this.q(new zzaw(zzaw3, v), zzq0);
                    }
                    e e2 = this.c;
                    zzkt.D(e2);
                    e2.k(s, zzac0.zzc.zzb);
                }
            }
            e e3 = this.c;
            zzkt.D(e3);
            Preconditions.checkNotEmpty(s);
            e3.zzg();
            e3.zzW();
            if(v2 < 0) {
                e3.zzt.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeh.zzn(s), v);
                list2 = Collections.emptyList();
            }
            else {
                list2 = e3.w("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{s, String.valueOf(v)});
            }
            ArrayList arrayList0 = new ArrayList(list2.size());
            for(Object object1: list2) {
                zzac zzac1 = (zzac)object1;
                if(zzac1 != null) {
                    this.zzay().zzj().zzd("User property expired", zzac1.zza, zzfr0.zzj().zzf(zzac1.zzc.zzb), zzac1.zzc.zza());
                    e e4 = this.c;
                    zzkt.D(e4);
                    e4.a(s, zzac1.zzc.zzb);
                    zzaw zzaw4 = zzac1.zzk;
                    if(zzaw4 != null) {
                        arrayList0.add(zzaw4);
                    }
                    e e5 = this.c;
                    zzkt.D(e5);
                    e5.k(s, zzac1.zzc.zzb);
                }
            }
            for(Object object2: arrayList0) {
                this.q(new zzaw(((zzaw)object2), v), zzq0);
            }
            e e6 = this.c;
            zzkt.D(e6);
            String s1 = zzaw2.zza;
            Preconditions.checkNotEmpty(s);
            Preconditions.checkNotEmpty(s1);
            e6.zzg();
            e6.zzW();
            if(v2 < 0) {
                e6.zzt.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeh.zzn(s), e6.zzt.zzj().zzd(s1), v);
                list3 = Collections.emptyList();
            }
            else {
                list3 = e6.w("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{s, s1, String.valueOf(v)});
            }
            ArrayList arrayList1 = new ArrayList(list3.size());
            for(Object object3: list3) {
                zzac zzac2 = (zzac)object3;
                if(zzac2 != null) {
                    zzkw zzkw0 = zzac2.zzc;
                    String s2 = (String)Preconditions.checkNotNull(zzac2.zza);
                    String s3 = zzac2.zzb;
                    Object object4 = Preconditions.checkNotNull(zzkw0.zza());
                    r1 r10 = new r1(s2, s3, zzkw0.zzb, v, object4);
                    Object object5 = r10.e;
                    String s4 = r10.c;
                    e e7 = this.c;
                    zzkt.D(e7);
                    if(e7.g(r10)) {
                        this.zzay().zzj().zzd("User property triggered", zzac2.zza, zzfr0.zzj().zzf(s4), object5);
                    }
                    else {
                        this.zzay().zzd().zzd("Too many active user properties, ignoring", zzeh.zzn(zzac2.zza), zzfr0.zzj().zzf(s4), object5);
                    }
                    zzaw zzaw5 = zzac2.zzi;
                    if(zzaw5 != null) {
                        arrayList1.add(zzaw5);
                    }
                    zzac2.zzc = new zzkw(r10);
                    zzac2.zze = true;
                    e e8 = this.c;
                    zzkt.D(e8);
                    e8.f(zzac2);
                }
            }
            this.q(zzaw2, zzq0);
            for(Object object6: arrayList1) {
                this.q(new zzaw(((zzaw)object6), v), zzq0);
            }
            e e9 = this.c;
            zzkt.D(e9);
            e9.zzC();
        }
        finally {
            e e10 = this.c;
            zzkt.D(e10);
            e10.z();
        }
    }

    public final void f(zzaw zzaw0, String s) {
        e e0 = this.c;
        zzkt.D(e0);
        c0 c00 = e0.p(s);
        if(c00 != null && !TextUtils.isEmpty(c00.y())) {
            Boolean boolean0 = this.v(c00);
            if(boolean0 != null) {
                if(!boolean0.booleanValue()) {
                    this.zzay().zzd().zzb("App version does not match; dropping event. appId", zzeh.zzn(s));
                    return;
                }
            }
            else if(!"_ui".equals(zzaw0.zza)) {
                this.zzay().zzk().zzb("Could not find package. appId", zzeh.zzn(s));
            }
            String s1 = c00.A();
            String s2 = c00.y();
            long v = c00.t();
            c00.a.zzaz().zzg();
            String s3 = c00.l;
            c00.a.zzaz().zzg();
            long v1 = c00.m;
            c00.a.zzaz().zzg();
            long v2 = c00.n;
            c00.a.zzaz().zzg();
            boolean z = c00.o;
            String s4 = c00.z();
            c00.a.zzaz().zzg();
            c00.a.zzaz().zzg();
            boolean z1 = c00.p;
            String s5 = c00.u();
            c00.a.zzaz().zzg();
            Boolean boolean1 = c00.r;
            c00.a.zzaz().zzg();
            long v3 = c00.s;
            c00.a.zzaz().zzg();
            this.g(zzaw0, new zzq(s, s1, s2, v, s3, v1, v2, null, z, false, s4, 0L, 0, z1, false, s5, boolean1, v3, c00.t, this.F(s).zzh(), "", null));
            return;
        }
        this.zzay().zzc().zzb("No app data available; dropping event", s);
    }

    public final void g(zzaw zzaw0, zzq zzq0) {
        Bundle bundle1;
        zzft zzft0;
        Cursor cursor1;
        Preconditions.checkNotEmpty(zzq0.zza);
        zzei zzei0 = zzei.zzb(zzaw0);
        zzlb zzlb0 = this.zzv();
        Bundle bundle0 = zzei0.zzd;
        e e0 = this.c;
        zzkt.D(e0);
        String s = zzq0.zza;
        e0.zzg();
        e0.zzW();
        Cursor cursor0 = null;
        try {
            cursor1 = null;
            cursor1 = e0.o().rawQuery("select parameters from default_event_params where app_id=?", new String[]{s});
            goto label_16;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_44;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_16:
                if(cursor1.moveToFirst()) {
                    byte[] arr_b = cursor1.getBlob(0);
                    try {
                        zzft0 = (zzft)((zzfs)zzkv.p(zzft.zze(), arr_b)).zzaC();
                    }
                    catch(IOException iOException0) {
                        e0.zzt.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzeh.zzn(s), iOException0);
                        goto label_46;
                    }
                    e0.zzf.zzu();
                    bundle1 = new Bundle();
                    Iterator iterator0 = zzft0.zzi().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_51;
                        }
                        Object object0 = iterator0.next();
                        zzfx zzfx0 = (zzfx)object0;
                        if(zzfx0.zzu()) {
                            bundle1.putDouble("", zzfx0.zza());
                        }
                        else if(zzfx0.zzv()) {
                            bundle1.putFloat("", zzfx0.zzb());
                        }
                        else if(zzfx0.zzy()) {
                            bundle1.putString("", "");
                        }
                        else {
                            if(!zzfx0.zzw()) {
                                continue;
                            }
                            bundle1.putLong("", zzfx0.zzd());
                        }
                    }
                }
                else {
                    e0.zzt.zzay().zzj().zza("Default event parameters not found");
                    goto label_46;
                }
            }
            catch(SQLiteException sQLiteException0) {
            label_44:
                e0.zzt.zzay().zzd().zzb("Error selecting default event parameters", sQLiteException0);
                if(cursor1 != null) {
                    goto label_46;
                }
            }
            goto label_53;
        }
        catch(Throwable throwable0) {
            goto label_49;
        }
    label_46:
        cursor1.close();
        goto label_53;
    label_49:
        TWR.safeClose$NT(cursor1, throwable0);
        throw throwable0;
    label_51:
        cursor1.close();
        cursor0 = bundle1;
    label_53:
        zzlb0.g(bundle0, ((Bundle)cursor0));
        this.zzv().h(zzei0, this.zzg().zzd(zzq0.zza));
        zzaw zzaw1 = zzei0.zza();
        if("_cmp".equals(zzaw1.zza) && "referrer API v2".equals(zzaw1.zzb.a.getString("_cis"))) {
            String s1 = zzaw1.zzb.a.getString("gclid");
            if(!TextUtils.isEmpty(s1)) {
                this.o(new zzkw(zzaw1.zzd, s1, "_lgclid", "auto"), zzq0);
            }
        }
        this.e(zzaw1, zzq0);
    }

    public final void h(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        String s2;
        boolean z1;
        this.zzaz().zzg();
        this.b();
        Preconditions.checkNotEmpty(s);
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            zzef zzef0 = this.zzay().zzj();
            Integer integer0 = (int)arr_b.length;
            zzef0.zzb("onConfigFetched. Response size", integer0);
            e e0 = this.c;
            zzkt.D(e0);
            e0.zzw();
            try {
                e e1 = this.c;
                zzkt.D(e1);
                c0 c00 = e1.p(s);
                boolean z = true;
                switch(v) {
                    case 200: 
                    case 204: {
                        z1 = throwable0 == null;
                        break;
                    }
                    case 304: {
                        v = 304;
                        z1 = throwable0 == null;
                        break;
                    }
                    default: {
                        z1 = false;
                    }
                }
                if(c00 == null) {
                    this.zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeh.zzn(s));
                }
                else {
                    zzfi zzfi0 = this.a;
                    if(z1 || v == 404) {
                        List list0 = map0 == null ? null : ((List)map0.get("Last-Modified"));
                        String s1 = list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
                        zzox.zzc();
                        if(this.zzg().zzs(null, zzdu.zzao)) {
                            List list1 = map0 == null ? null : ((List)map0.get("ETag"));
                            s2 = list1 == null || list1.isEmpty() ? null : ((String)list1.get(0));
                        }
                        else {
                            s2 = null;
                        }
                        if(v == 304 || v == 404) {
                            zzkt.D(zzfi0);
                            if(zzfi0.zze(s) == null) {
                                zzkt.D(zzfi0);
                                zzfi0.zzt(s, null, null, null);
                            }
                        }
                        else {
                            zzkt.D(zzfi0);
                            zzfi0.zzt(s, arr_b, s1, s2);
                        }
                        c00.g(this.zzav().currentTimeMillis());
                        e e2 = this.c;
                        zzkt.D(e2);
                        e2.b(c00);
                        if(v == 404) {
                            this.zzay().zzl().zzb("Config not found. Using empty config. appId", s);
                        }
                        else {
                            this.zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", v, integer0);
                        }
                        zzkt.D(this.b);
                        if(!this.b.zza() || !this.A()) {
                            this.y();
                        }
                        else {
                            this.p();
                        }
                    }
                    else {
                        long v2 = this.zzav().currentTimeMillis();
                        c00.a.zzaz().zzg();
                        boolean z2 = c00.C;
                        if(c00.E == v2) {
                            z = false;
                        }
                        c00.C = z2 | z;
                        c00.E = v2;
                        e e3 = this.c;
                        zzkt.D(e3);
                        e3.b(c00);
                        this.zzay().zzj().zzc("Fetching config failed. code, error", v, throwable0);
                        zzkt.D(zzfi0);
                        zzfi0.zzl(s);
                        this.i.zzd.zzb(this.zzav().currentTimeMillis());
                        if(v == 429 || v == 503) {
                            this.i.zzb.zzb(this.zzav().currentTimeMillis());
                        }
                        this.y();
                    }
                }
                e e4 = this.c;
                zzkt.D(e4);
                e4.zzC();
            }
            catch(Throwable throwable1) {
                e e5 = this.c;
                zzkt.D(e5);
                e5.z();
                throw throwable1;
            }
            e e6 = this.c;
            zzkt.D(e6);
            e6.z();
        }
        finally {
            this.s = false;
            this.w();
        }
    }

    public final void i(zzq zzq0) {
        ApplicationInfo applicationInfo0;
        int v9;
        PackageInfo packageInfo0;
        boolean z;
        h h0;
        zzfr zzfr1;
        int v2;
        this.zzaz().zzg();
        this.b();
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        if(zzkt.C(zzq0)) {
            e e0 = this.c;
            zzkt.D(e0);
            c0 c00 = e0.p(zzq0.zza);
            if(c00 != null && TextUtils.isEmpty(c00.A()) && !TextUtils.isEmpty(zzq0.zzb)) {
                c00.g(0L);
                e e1 = this.c;
                zzkt.D(e1);
                e1.b(c00);
                zzkt.D(this.a);
                this.a.zzg();
                this.a.f.remove(zzq0.zza);
            }
            if(!zzq0.zzh) {
                this.E(zzq0);
                return;
            }
            long v = zzq0.zzm == 0L ? this.zzav().currentTimeMillis() : zzq0.zzm;
            zzfr zzfr0 = this.l;
            zzaq zzaq0 = zzfr0.zzg();
            zzaq0.zzg();
            zzaq0.e = null;
            zzaq0.f = 0L;
            int v1 = zzq0.zzn;
            if(v1 == 0 || v1 == 1) {
                v2 = v1;
            }
            else {
                this.zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeh.zzn(zzq0.zza), v1);
                v2 = 0;
            }
            e e2 = this.c;
            zzkt.D(e2);
            e2.zzw();
            try {
                e e3 = this.c;
                zzkt.D(e3);
                r1 r10 = e3.t(zzq0.zza, "_npa");
                if(r10 == null || "auto".equals(r10.b)) {
                    if(zzq0.zzr != null) {
                        zzkw zzkw0 = new zzkw(v, ((long)(zzq0.zzr.booleanValue() ? 1L : 0L)), "_npa", "auto");
                        if(r10 == null || !r10.e.equals(zzkw0.zzd)) {
                            this.o(zzkw0, zzq0);
                        }
                    }
                    else if(r10 != null) {
                        this.k(new zzkw(v, null, "_npa", "auto"), zzq0);
                    }
                }
                e e4 = this.c;
                zzkt.D(e4);
                c0 c01 = e4.p(((String)Preconditions.checkNotNull(zzq0.zza)));
                if(c01 == null) {
                    zzfr1 = zzfr0;
                }
                else {
                    zzlb zzlb0 = this.zzv();
                    String s = c01.A();
                    String s1 = c01.u();
                    zzlb0.getClass();
                    if(zzlb.y(zzq0.zzb, s, zzq0.zzq, s1)) {
                        this.zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeh.zzn(c01.w()));
                        e e5 = this.c;
                        zzkt.D(e5);
                        String s2 = c01.w();
                        e5.zzW();
                        e5.zzg();
                        Preconditions.checkNotEmpty(s2);
                        try {
                            SQLiteDatabase sQLiteDatabase0 = e5.o();
                            String[] arr_s = {s2};
                            int v4 = sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("event_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("property_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("consent_settings", "app_id=?", arr_s);
                            zzoi.zzc();
                            zzfr1 = zzfr0;
                            if(e5.zzt.zzf().zzs(null, zzdu.zzat)) {
                                v4 += sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s);
                            }
                            if(v4 > 0) {
                                e5.zzt.zzay().zzj().zzc("Deleted application data. app, records", s2, v4);
                            }
                        }
                        catch(SQLiteException sQLiteException0) {
                            e5.zzt.zzay().zzd().zzc("Error deleting application data. appId, error", zzeh.zzn(s2), sQLiteException0);
                        }
                        c01 = null;
                    }
                    else {
                        zzfr1 = zzfr0;
                    }
                }
                if(c01 != null) {
                    int v5 = c01.t() == 0xFFFFFFFF80000000L || c01.t() == zzq0.zzj ? 0 : 1;
                    String s3 = c01.y();
                    if((v5 | (c01.t() != 0xFFFFFFFF80000000L || s3 == null || s3.equals(zzq0.zzc) ? 0 : 1)) != 0) {
                        Bundle bundle0 = new Bundle();
                        bundle0.putString("_pv", s3);
                        this.e(new zzaw("_au", new zzau(bundle0), "auto", v), zzq0);
                    }
                }
                this.E(zzq0);
                if(v2 == 0) {
                    e e6 = this.c;
                    zzkt.D(e6);
                    h0 = e6.s(zzq0.zza, "_f");
                    z = false;
                }
                else {
                    e e7 = this.c;
                    zzkt.D(e7);
                    h0 = e7.s(zzq0.zza, "_v");
                    z = true;
                }
                if(h0 == null) {
                    long v6 = (v / 3600000L + 1L) * 3600000L;
                    if(z) {
                        this.o(new zzkw(v, v6, "_fvt", "auto"), zzq0);
                        this.zzaz().zzg();
                        this.b();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong("_r", 1L);
                        bundle2.putLong("_et", 1L);
                        if(zzq0.zzp) {
                            bundle2.putLong("_dac", 1L);
                        }
                        this.g(new zzaw("_v", new zzau(bundle2), "auto", v), zzq0);
                    }
                    else {
                        this.o(new zzkw(v, v6, "_fot", "auto"), zzq0);
                        this.zzaz().zzg();
                        zzez zzez0 = (zzez)Preconditions.checkNotNull(this.k);
                        String s4 = zzq0.zza;
                        if(s4 == null || s4.isEmpty()) {
                            zzez0.a.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                        }
                        else {
                            zzez0.a.zzaz().zzg();
                            boolean z1 = zzez0.a();
                            zzfr zzfr2 = zzez0.a;
                            if(z1) {
                                zzey zzey0 = new zzey(zzez0, s4);
                                zzfr2.zzaz().zzg();
                                Intent intent0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager0 = zzfr2.zzau().getPackageManager();
                                if(packageManager0 == null) {
                                    zzfr2.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                }
                                else {
                                    List list0 = packageManager0.queryIntentServices(intent0, 0);
                                    if(list0 == null || list0.isEmpty()) {
                                        zzfr2.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    }
                                    else {
                                        ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                                        if(serviceInfo0 != null) {
                                            if(serviceInfo0.name == null || !"com.android.vending".equals(serviceInfo0.packageName) || !zzez0.a()) {
                                                zzfr2.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                            else {
                                                Intent intent1 = new Intent(intent0);
                                                try {
                                                    String s5 = "available";
                                                    boolean z2 = ConnectionTracker.getInstance().bindService(zzfr2.zzau(), intent1, zzey0, 1);
                                                    zzef zzef0 = zzfr2.zzay().zzj();
                                                    if(!z2) {
                                                        s5 = "not available";
                                                    }
                                                    zzef0.zzb("Install Referrer Service is", s5);
                                                }
                                                catch(RuntimeException runtimeException0) {
                                                    zzfr2.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", runtimeException0.getMessage());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                zzfr2.zzay().zzi().zza("Install Referrer Reporter is not available");
                            }
                        }
                        this.zzaz().zzg();
                        this.b();
                        Bundle bundle1 = new Bundle();
                        bundle1.putLong("_c", 1L);
                        bundle1.putLong("_r", 1L);
                        bundle1.putLong("_uwa", 0L);
                        bundle1.putLong("_pfo", 0L);
                        bundle1.putLong("_sys", 0L);
                        bundle1.putLong("_sysu", 0L);
                        bundle1.putLong("_et", 1L);
                        if(zzq0.zzp) {
                            bundle1.putLong("_dac", 1L);
                        }
                        String s6 = (String)Preconditions.checkNotNull(zzq0.zza);
                        e e8 = this.c;
                        zzkt.D(e8);
                        Preconditions.checkNotEmpty(s6);
                        e8.zzg();
                        e8.zzW();
                        long v7 = e8.m(s6);
                        if(zzfr1.zzau().getPackageManager() == null) {
                            this.zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(s6));
                        }
                        else {
                            try {
                                packageInfo0 = Wrappers.packageManager(zzfr1.zzau()).getPackageInfo(s6, 0);
                            }
                            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                                this.zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeh.zzn(s6), packageManager$NameNotFoundException0);
                                packageInfo0 = null;
                            }
                            if(packageInfo0 != null) {
                                long v8 = packageInfo0.firstInstallTime;
                                if(v8 != 0L) {
                                    if(v8 == packageInfo0.lastUpdateTime) {
                                        v9 = 1;
                                    }
                                    else if(!this.zzg().zzs(null, zzdu.zzab)) {
                                        bundle1.putLong("_uwa", 1L);
                                        v9 = 0;
                                    }
                                    else if(v7 == 0L) {
                                        bundle1.putLong("_uwa", 1L);
                                        v9 = 0;
                                        v7 = 0L;
                                    }
                                    else {
                                        v9 = 0;
                                    }
                                    this.o(new zzkw(v, ((long)(1 == v9 ? 1L : 0L)), "_fi", "auto"), zzq0);
                                }
                            }
                            try {
                                applicationInfo0 = Wrappers.packageManager(zzfr1.zzau()).getApplicationInfo(s6, 0);
                            }
                            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                                this.zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeh.zzn(s6), packageManager$NameNotFoundException1);
                                applicationInfo0 = null;
                            }
                            if(applicationInfo0 != null) {
                                if((applicationInfo0.flags & 1) != 0) {
                                    bundle1.putLong("_sys", 1L);
                                }
                                if((applicationInfo0.flags & 0x80) != 0) {
                                    bundle1.putLong("_sysu", 1L);
                                }
                            }
                        }
                        if(v7 >= 0L) {
                            bundle1.putLong("_pfo", v7);
                        }
                        this.g(new zzaw("_f", new zzau(bundle1), "auto", v), zzq0);
                    }
                }
                else if(zzq0.zzi) {
                    this.g(new zzaw("_cd", new zzau(new Bundle()), "auto", v), zzq0);
                }
                e e9 = this.c;
                zzkt.D(e9);
                e9.zzC();
            }
            finally {
                e e10 = this.c;
                zzkt.D(e10);
                e10.z();
            }
        }
    }

    public final void j(zzac zzac0, zzq zzq0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotEmpty(zzac0.zza);
        Preconditions.checkNotNull(zzac0.zzc);
        Preconditions.checkNotEmpty(zzac0.zzc.zzb);
        this.zzaz().zzg();
        this.b();
        if(!zzkt.C(zzq0)) {
            return;
        }
        if(zzq0.zzh) {
            e e0 = this.c;
            zzkt.D(e0);
            e0.zzw();
            try {
                this.E(zzq0);
                String s = (String)Preconditions.checkNotNull(zzac0.zza);
                e e1 = this.c;
                zzkt.D(e1);
                zzac zzac1 = e1.q(s, zzac0.zzc.zzb);
                zzfr zzfr0 = this.l;
                if(zzac1 == null) {
                    this.zzay().zzk().zzc("Conditional user property doesn\'t exist", zzeh.zzn(zzac0.zza), zzfr0.zzj().zzf(zzac0.zzc.zzb));
                }
                else {
                    this.zzay().zzc().zzc("Removing conditional user property", zzac0.zza, zzfr0.zzj().zzf(zzac0.zzc.zzb));
                    e e2 = this.c;
                    zzkt.D(e2);
                    e2.k(s, zzac0.zzc.zzb);
                    if(zzac1.zze) {
                        e e3 = this.c;
                        zzkt.D(e3);
                        e3.a(s, zzac0.zzc.zzb);
                    }
                    zzaw zzaw0 = zzac0.zzk;
                    if(zzaw0 != null) {
                        Bundle bundle0 = zzaw0.zzb == null ? null : zzaw0.zzb.zzc();
                        this.q(((zzaw)Preconditions.checkNotNull(this.zzv().M(((zzaw)Preconditions.checkNotNull(zzac0.zzk)).zza, bundle0, zzac1.zzb, zzac0.zzk.zzd, true))), zzq0);
                    }
                }
                e e4 = this.c;
                zzkt.D(e4);
                e4.zzC();
            }
            finally {
                e e5 = this.c;
                zzkt.D(e5);
                e5.z();
            }
            return;
        }
        this.E(zzq0);
    }

    public final void k(zzkw zzkw0, zzq zzq0) {
        this.zzaz().zzg();
        this.b();
        if(!zzkt.C(zzq0)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        if("_npa".equals(zzkw0.zzb) && zzq0.zzr != null) {
            this.zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
            this.o(new zzkw(this.zzav().currentTimeMillis(), ((long)(zzq0.zzr.booleanValue() ? 1L : 0L)), "_npa", "auto"), zzq0);
            return;
        }
        zzef zzef0 = this.zzay().zzc();
        zzfr zzfr0 = this.l;
        zzef0.zzb("Removing user property", zzfr0.zzj().zzf(zzkw0.zzb));
        e e0 = this.c;
        zzkt.D(e0);
        e0.zzw();
        try {
            this.E(zzq0);
            if("_id".equals(zzkw0.zzb)) {
                e e1 = this.c;
                zzkt.D(e1);
                e1.a(((String)Preconditions.checkNotNull(zzq0.zza)), "_lair");
            }
            e e2 = this.c;
            zzkt.D(e2);
            e2.a(((String)Preconditions.checkNotNull(zzq0.zza)), zzkw0.zzb);
            e e3 = this.c;
            zzkt.D(e3);
            e3.zzC();
            this.zzay().zzc().zzb("User property removed", zzfr0.zzj().zzf(zzkw0.zzb));
        }
        finally {
            e e4 = this.c;
            zzkt.D(e4);
            e4.z();
        }
    }

    public final void l(zzq zzq0) {
        if(this.x != null) {
            ArrayList arrayList0 = new ArrayList();
            this.y = arrayList0;
            arrayList0.addAll(this.x);
        }
        e e0 = this.c;
        zzkt.D(e0);
        String s = (String)Preconditions.checkNotNull(zzq0.zza);
        Preconditions.checkNotEmpty(s);
        e0.zzg();
        e0.zzW();
        try {
            SQLiteDatabase sQLiteDatabase0 = e0.o();
            String[] arr_s = {s};
            int v = sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("queue", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("main_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s);
            if(v > 0) {
                e0.zzt.zzay().zzj().zzc("Reset analytics data. app, records", s, v);
            }
        }
        catch(SQLiteException sQLiteException0) {
            e0.zzt.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeh.zzn(s), sQLiteException0);
        }
        if(zzq0.zzh) {
            this.i(zzq0);
        }
    }

    public final void m(zzac zzac0, zzq zzq0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotEmpty(zzac0.zza);
        Preconditions.checkNotNull(zzac0.zzb);
        Preconditions.checkNotNull(zzac0.zzc);
        Preconditions.checkNotEmpty(zzac0.zzc.zzb);
        this.zzaz().zzg();
        this.b();
        if(!zzkt.C(zzq0)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        zzac zzac1 = new zzac(zzac0);
        boolean z = false;
        zzac1.zze = false;
        e e0 = this.c;
        zzkt.D(e0);
        e0.zzw();
        try {
            e e1 = this.c;
            zzkt.D(e1);
            zzac zzac2 = e1.q(((String)Preconditions.checkNotNull(zzac1.zza)), zzac1.zzc.zzb);
            zzfr zzfr0 = this.l;
            if(zzac2 != null && !zzac2.zzb.equals(zzac1.zzb)) {
                this.zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzfr0.zzj().zzf(zzac1.zzc.zzb), zzac1.zzb, zzac2.zzb);
            }
            if(zzac2 != null && zzac2.zze) {
                zzac1.zzb = zzac2.zzb;
                zzac1.zzd = zzac2.zzd;
                zzac1.zzh = zzac2.zzh;
                zzac1.zzf = zzac2.zzf;
                zzac1.zzi = zzac2.zzi;
                zzac1.zze = true;
                zzac1.zzc = new zzkw(zzac2.zzc.zzc, zzac1.zzc.zza(), zzac1.zzc.zzb, zzac2.zzc.zzf);
            }
            else if(TextUtils.isEmpty(zzac1.zzf)) {
                zzac1.zzc = new zzkw(zzac1.zzd, zzac1.zzc.zza(), zzac1.zzc.zzb, zzac1.zzc.zzf);
                zzac1.zze = true;
                z = true;
            }
            if(zzac1.zze) {
                zzkw zzkw0 = zzac1.zzc;
                Object object0 = Preconditions.checkNotNull(zzac1.zza);
                String s = zzac1.zzb;
                Object object1 = Preconditions.checkNotNull(zzkw0.zza());
                r1 r10 = new r1(((String)object0), s, zzkw0.zzb, zzkw0.zzc, object1);
                Object object2 = r10.e;
                String s1 = r10.c;
                e e2 = this.c;
                zzkt.D(e2);
                if(e2.g(r10)) {
                    this.zzay().zzc().zzd("User property updated immediately", zzac1.zza, zzfr0.zzj().zzf(s1), object2);
                }
                else {
                    this.zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzeh.zzn(zzac1.zza), zzfr0.zzj().zzf(s1), object2);
                }
                if(z && zzac1.zzi != null) {
                    this.q(new zzaw(zzac1.zzi, zzac1.zzd), zzq0);
                }
            }
            e e3 = this.c;
            zzkt.D(e3);
            if(e3.f(zzac1)) {
                this.zzay().zzc().zzd("Conditional property added", zzac1.zza, zzfr0.zzj().zzf(zzac1.zzc.zzb), zzac1.zzc.zza());
            }
            else {
                this.zzay().zzd().zzd("Too many conditional properties, ignoring", zzeh.zzn(zzac1.zza), zzfr0.zzj().zzf(zzac1.zzc.zzb), zzac1.zzc.zza());
            }
            e e4 = this.c;
            zzkt.D(e4);
            e4.zzC();
        }
        finally {
            e e5 = this.c;
            zzkt.D(e5);
            e5.z();
        }
    }

    public final void n(String s, zzai zzai0) {
        this.zzaz().zzg();
        this.b();
        this.A.put(s, zzai0);
        e e0 = this.c;
        zzkt.D(e0);
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(zzai0);
        e0.zzg();
        e0.zzW();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("consent_state", zzai0.zzh());
        try {
            if(e0.o().insertWithOnConflict("consent_settings", null, contentValues0, 5) == -1L) {
                e0.zzt.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeh.zzn(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            e0.zzt.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeh.zzn(s), sQLiteException0);
        }
    }

    public final void o(zzkw zzkw0, zzq zzq0) {
        long v3;
        this.zzaz().zzg();
        this.b();
        if(!zzkt.C(zzq0)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        int v = this.zzv().H(zzkw0.zzb);
        o1 o10 = this.E;
        if(v != 0) {
            zzlb zzlb0 = this.zzv();
            this.zzg();
            this.zzv().getClass();
            zzlb.i(o10, zzq0.zza, v, "_ev", zzlb0.zzD(zzkw0.zzb, 24, true), (zzkw0.zzb == null ? 0 : zzkw0.zzb.length()));
            return;
        }
        int v1 = this.zzv().E(zzkw0.zza(), zzkw0.zzb);
        if(v1 != 0) {
            zzlb zzlb1 = this.zzv();
            this.zzg();
            Object object0 = zzkw0.zza();
            this.zzv().getClass();
            zzlb.i(o10, zzq0.zza, v1, "_ev", zzlb1.zzD(zzkw0.zzb, 24, true), (object0 != null && (object0 instanceof String || object0 instanceof CharSequence) ? object0.toString().length() : 0));
            return;
        }
        Object object1 = this.zzv().b(zzkw0.zza(), zzkw0.zzb);
        if(object1 == null) {
            return;
        }
        if("_sid".equals(zzkw0.zzb)) {
            long v2 = zzkw0.zzc;
            String s = zzkw0.zzf;
            String s1 = (String)Preconditions.checkNotNull(zzq0.zza);
            e e0 = this.c;
            zzkt.D(e0);
            r1 r10 = e0.t(s1, "_sno");
            if(r10 == null) {
            label_38:
                if(r10 != null) {
                    this.zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", r10.e);
                }
                e e1 = this.c;
                zzkt.D(e1);
                h h0 = e1.s(s1, "_s");
                if(h0 == null) {
                    v3 = 0L;
                }
                else {
                    this.zzay().zzj().zzb("Backfill the session number. Last used session number", h0.c);
                    v3 = h0.c;
                }
            }
            else {
                Object object2 = r10.e;
                if(object2 instanceof Long) {
                    v3 = (long)(((Long)object2));
                    goto label_48;
                }
                goto label_38;
            }
        label_48:
            this.o(new zzkw(v2, ((long)(v3 + 1L)), "_sno", s), zzq0);
        }
        r1 r11 = new r1(((String)Preconditions.checkNotNull(zzq0.zza)), ((String)Preconditions.checkNotNull(zzkw0.zzf)), zzkw0.zzb, zzkw0.zzc, object1);
        zzef zzef0 = this.zzay().zzj();
        zzfr zzfr0 = this.l;
        String s2 = r11.c;
        zzef0.zzc("Setting user property", zzfr0.zzj().zzf(s2), object1);
        e e2 = this.c;
        zzkt.D(e2);
        e2.zzw();
        try {
            Object object3 = r11.e;
            if("_id".equals(s2)) {
                e e3 = this.c;
                zzkt.D(e3);
                r1 r12 = e3.t(zzq0.zza, "_id");
                if(r12 != null && !object3.equals(r12.e)) {
                    e e4 = this.c;
                    zzkt.D(e4);
                    e4.a(zzq0.zza, "_lair");
                }
            }
            this.E(zzq0);
            e e5 = this.c;
            zzkt.D(e5);
            boolean z = e5.g(r11);
            e e6 = this.c;
            zzkt.D(e6);
            e6.zzC();
            if(!z) {
                this.zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", zzfr0.zzj().zzf(s2), object3);
                this.zzv().getClass();
                zzlb.i(o10, zzq0.zza, 9, null, null, 0);
            }
        }
        finally {
            e e7 = this.c;
            zzkt.D(e7);
            e7.z();
        }
    }

    public final void p() {
        String s3;
        String s1;
        zzkv zzkv1;
        zzgc zzgc0;
        List list0;
        byte[] arr_b2;
        ByteArrayOutputStream byteArrayOutputStream0;
        GZIPInputStream gZIPInputStream0;
        ByteArrayInputStream byteArrayInputStream0;
        zzkv zzkv0;
        byte[] arr_b;
        long v10;
        int v9;
        ArrayList arrayList0;
        Cursor cursor2;
        Cursor cursor1;
        String s4;
        Cursor cursor3;
        zzen zzen0 = this.b;
        this.zzaz().zzg();
        this.b();
        this.u = true;
        try {
            Boolean boolean0 = this.l.zzt().h();
            if(boolean0 == null) {
                this.zzay().zzk().zza("Upload data called on the client side before use of service was decided");
            }
            else if(boolean0.booleanValue()) {
                this.zzay().zzd().zza("Upload called in the client side when service should be used");
            }
            else if(this.o > 0L) {
                this.y();
            }
            else {
                this.zzaz().zzg();
                if(this.x == null) {
                    zzkt.D(zzen0);
                    if(zzen0.zza()) {
                        long v1 = this.zzav().currentTimeMillis();
                        Cursor cursor0 = null;
                        int v2 = this.zzg().zze(null, zzdu.zzP);
                        this.zzg();
                        long v3 = zzag.zzz();
                        for(int v4 = 0; v4 < v2 && this.z(v1 - v3); ++v4) {
                        }
                        long v5 = this.i.zzc.zza();
                        if(v5 != 0L) {
                            this.zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Math.abs(v1 - v5));
                        }
                        e e0 = this.c;
                        zzkt.D(e0);
                        String s = e0.zzr();
                        long v6 = -1L;
                        if(TextUtils.isEmpty(s)) {
                            this.z = -1L;
                            e e3 = this.c;
                            zzkt.D(e3);
                            this.zzg();
                            long v14 = zzag.zzz();
                            e3.zzg();
                            e3.zzW();
                            try {
                                cursor3 = null;
                                cursor3 = e3.o().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(v1 - v14)});
                                goto label_221;
                            }
                            catch(SQLiteException sQLiteException2) {
                                goto label_227;
                            }
                            catch(Throwable throwable2) {
                            }
                            Cursor cursor4 = null;
                            goto label_234;
                            try {
                                try {
                                label_221:
                                    if(cursor3.moveToFirst()) {
                                        s4 = cursor3.getString(0);
                                        goto label_238;
                                    }
                                    else {
                                        e3.zzt.zzay().zzj().zza("No expired configs for apps with pending events");
                                        goto label_229;
                                    }
                                }
                                catch(SQLiteException sQLiteException2) {
                                label_227:
                                    e3.zzt.zzay().zzd().zzb("Error selecting expired configs", sQLiteException2);
                                    if(cursor3 != null) {
                                        goto label_229;
                                    }
                                    s4 = null;
                                }
                                goto label_239;
                            }
                            catch(Throwable throwable2) {
                                goto label_233;
                            }
                        label_229:
                            cursor3.close();
                            s4 = null;
                            goto label_239;
                        label_233:
                            cursor4 = cursor3;
                        label_234:
                            if(cursor4 != null) {
                                cursor4.close();
                            }
                            throw throwable2;
                        label_238:
                            cursor3.close();
                        label_239:
                            if(!TextUtils.isEmpty(s4)) {
                                e e4 = this.c;
                                zzkt.D(e4);
                                c0 c00 = e4.p(s4);
                                if(c00 != null) {
                                    this.d(c00);
                                }
                            }
                        }
                        else {
                            if(this.z == -1L) {
                                e e1 = this.c;
                                zzkt.D(e1);
                                try {
                                    cursor1 = null;
                                    cursor1 = e1.o().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    goto label_49;
                                }
                                catch(SQLiteException sQLiteException0) {
                                    goto label_53;
                                }
                                catch(Throwable throwable0) {
                                }
                                goto label_59;
                                try {
                                    try {
                                    label_49:
                                        if(cursor1.moveToFirst()) {
                                            v6 = cursor1.getLong(0);
                                        }
                                        goto label_63;
                                    }
                                    catch(SQLiteException sQLiteException0) {
                                    }
                                label_53:
                                    e1.zzt.zzay().zzd().zzb("Error querying raw events", sQLiteException0);
                                    if(cursor1 != null) {
                                        goto label_55;
                                    }
                                    goto label_64;
                                }
                                catch(Throwable throwable0) {
                                    goto label_58;
                                }
                            label_55:
                                cursor1.close();
                                goto label_64;
                            label_58:
                                cursor0 = cursor1;
                            label_59:
                                if(cursor0 != null) {
                                    cursor0.close();
                                }
                                throw throwable0;
                            label_63:
                                cursor1.close();
                            label_64:
                                this.z = v6;
                            }
                            int v7 = this.zzg().zze(s, zzdu.zzf);
                            int v8 = Math.max(0, this.zzg().zze(s, zzdu.zzg));
                            e e2 = this.c;
                            zzkt.D(e2);
                            e2.zzg();
                            e2.zzW();
                            Preconditions.checkArgument(v7 > 0);
                            Preconditions.checkArgument(v8 > 0);
                            Preconditions.checkNotEmpty(s);
                            try {
                                try {
                                    cursor2 = null;
                                    cursor2 = e2.o().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{s}, null, null, "rowid", String.valueOf(v7));
                                    if(cursor2.moveToFirst()) {
                                        arrayList0 = new ArrayList();
                                        v9 = 0;
                                        while(true) {
                                        label_79:
                                            v10 = cursor2.getLong(0);
                                            try {
                                                arr_b = cursor2.getBlob(1);
                                                zzkv0 = e2.zzf.g;
                                                zzkt.D(zzkv0);
                                            }
                                            catch(IOException iOException0) {
                                                e2.zzt.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeh.zzn(s), iOException0);
                                                goto label_114;
                                            }
                                            try {
                                                byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                                                gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0);
                                                byteArrayOutputStream0 = new ByteArrayOutputStream();
                                            }
                                            catch(IOException iOException1) {
                                                goto label_96;
                                            }
                                            byte[] arr_b1 = new byte[0x400];
                                            try {
                                                int v11;
                                                while((v11 = gZIPInputStream0.read(arr_b1)) > 0) {
                                                    byteArrayOutputStream0.write(arr_b1, 0, v11);
                                                }
                                                gZIPInputStream0.close();
                                                byteArrayInputStream0.close();
                                                arr_b2 = byteArrayOutputStream0.toByteArray();
                                                goto label_101;
                                            }
                                            catch(IOException iOException1) {
                                                try {
                                                label_96:
                                                    zzkv0.zzt.zzay().zzd().zzb("Failed to ungzip content", iOException1);
                                                    throw iOException1;
                                                }
                                                catch(IOException iOException0) {
                                                }
                                            }
                                            e2.zzt.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeh.zzn(s), iOException0);
                                            goto label_114;
                                        }
                                    }
                                    else {
                                        list0 = Collections.emptyList();
                                        goto label_131;
                                    }
                                    goto label_132;
                                }
                                catch(SQLiteException sQLiteException1) {
                                    goto label_123;
                                }
                            }
                            catch(Throwable throwable1) {
                                goto label_127;
                            }
                        label_101:
                            if(arrayList0.isEmpty()) {
                                goto label_105;
                            label_115:
                                cursor2.close();
                                list0 = arrayList0;
                                goto label_132;
                                try {
                                    try {
                                        list0 = Collections.emptyList();
                                        goto label_131;
                                    }
                                    catch(SQLiteException sQLiteException1) {
                                    }
                                label_123:
                                    e2.zzt.zzay().zzd().zzc("Error querying bundles. appId", zzeh.zzn(s), sQLiteException1);
                                    list0 = Collections.emptyList();
                                    if(cursor2 != null) {
                                        goto label_131;
                                    }
                                    goto label_132;
                                }
                                catch(Throwable throwable1) {
                                    goto label_127;
                                }
                                goto label_131;
                            label_127:
                                if(cursor2 != null) {
                                    cursor2.close();
                                }
                                throw throwable1;
                            label_131:
                                cursor2.close();
                            }
                            else if(arr_b2.length + v9 <= v8) {
                                try {
                                    try {
                                        zzgc0 = (zzgc)zzkv.p(zzgd.zzt(), arr_b2);
                                        goto label_110;
                                    label_105:
                                        zzgc0 = (zzgc)zzkv.p(zzgd.zzt(), arr_b2);
                                    }
                                    catch(IOException iOException2) {
                                        e2.zzt.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzeh.zzn(s), iOException2);
                                        goto label_114;
                                    }
                                label_110:
                                    if(!cursor2.isNull(2)) {
                                        zzgc0.zzaf(cursor2.getInt(2));
                                    }
                                    v9 += arr_b2.length;
                                    arrayList0.add(Pair.create(((zzgd)zzgc0.zzaC()), v10));
                                label_114:
                                    if(cursor2.moveToNext() && v9 <= v8) {
                                        goto label_79;
                                    }
                                    goto label_115;
                                }
                                catch(SQLiteException sQLiteException1) {
                                    goto label_123;
                                }
                                catch(Throwable throwable1) {
                                    goto label_127;
                                }
                            }
                            else {
                                goto label_115;
                            }
                        label_132:
                            if(!list0.isEmpty()) {
                                if(this.F(s).zzi(zzah.zza)) {
                                    Iterator iterator0 = list0.iterator();
                                    while(iterator0.hasNext()) {
                                        iterator0.next();
                                    }
                                }
                                zzga zzga0 = zzgb.zza();
                                int v12 = list0.size();
                                ArrayList arrayList1 = new ArrayList(list0.size());
                                boolean z = this.zzg().zzt(s) && this.F(s).zzi(zzah.zza);
                                boolean z1 = this.F(s).zzi(zzah.zza);
                                boolean z2 = this.F(s).zzi(zzah.zzb);
                                zzpd.zzc();
                                boolean z3 = this.zzg().zzs(null, zzdu.zzal) && this.zzg().zzs(s, zzdu.zzan);
                                for(int v13 = 0; true; ++v13) {
                                    zzkv1 = this.g;
                                    if(v13 >= v12) {
                                        break;
                                    }
                                    zzgc zzgc1 = (zzgc)((zzgd)((Pair)list0.get(v13)).first).zzby();
                                    arrayList1.add(((Long)((Pair)list0.get(v13)).second));
                                    this.zzg().zzh();
                                    zzgc1.zzal(74029L);
                                    zzgc1.zzak(v1);
                                    zzgc1.zzag(false);
                                    if(!z) {
                                        zzgc1.zzq();
                                    }
                                    if(!z1) {
                                        zzgc1.zzx();
                                        zzgc1.zzt();
                                    }
                                    if(!z2) {
                                        zzgc1.zzn();
                                    }
                                    this.c(zzgc1, s);
                                    if(!z3) {
                                        zzgc1.zzy();
                                    }
                                    if(this.zzg().zzs(s, zzdu.zzT)) {
                                        byte[] arr_b3 = ((zzgd)zzgc1.zzaC()).zzbu();
                                        zzkt.D(zzkv1);
                                        zzgc1.zzJ(zzkv1.k(arr_b3));
                                    }
                                    zzga0.zza(zzgc1);
                                }
                                if(Log.isLoggable(this.zzay().zzq(), 2)) {
                                    zzkt.D(zzkv1);
                                    s1 = zzkv1.q(((zzgb)zzga0.zzaC()));
                                }
                                else {
                                    s1 = null;
                                }
                                zzkt.D(zzkv1);
                                byte[] arr_b4 = ((zzgb)zzga0.zzaC()).zzbu();
                                zzkt.D(this.j.zzf.a);
                                String s2 = this.j.zzf.a.g(s);
                                if(TextUtils.isEmpty(s2)) {
                                    s3 = "https://app-measurement.com/a";
                                }
                                else {
                                    Uri uri0 = Uri.parse("https://app-measurement.com/a");
                                    Uri.Builder uri$Builder0 = uri0.buildUpon();
                                    uri$Builder0.authority(s2 + "." + uri0.getAuthority());
                                    s3 = uri$Builder0.build().toString();
                                }
                                try {
                                    URL uRL0 = new URL(s3);
                                    Preconditions.checkArgument(!arrayList1.isEmpty());
                                    if(this.x == null) {
                                        this.x = new ArrayList(arrayList1);
                                    }
                                    else {
                                        this.zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                    }
                                    this.i.zzd.zzb(v1);
                                    this.zzay().zzj().zzd("Uploading data. app, uncompressed size, data", (v12 <= 0 ? "?" : ""), ((int)arr_b4.length), s1);
                                    this.t = true;
                                    zzkt.D(zzen0);
                                    o1 o10 = new o1(this, s);
                                    zzen0.zzg();
                                    zzen0.zzW();
                                    Preconditions.checkNotNull(uRL0);
                                    Preconditions.checkNotNull(arr_b4);
                                    Preconditions.checkNotNull(o10);
                                    zzen0.zzt.zzaz().zzo(new m(zzen0, s, uRL0, arr_b4, null, o10));
                                }
                                catch(MalformedURLException unused_ex) {
                                    this.zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeh.zzn(s), s3);
                                }
                            }
                        }
                    }
                    else {
                        this.zzay().zzj().zza("Network not connected, ignoring upload request");
                        this.y();
                    }
                }
                else {
                    this.zzay().zzj().zza("Uploading requested multiple times");
                }
            }
        }
        finally {
            this.u = false;
            this.w();
        }
    }

    public final void q(zzaw zzaw0, zzq zzq0) {
        int v23;
        long v22;
        ArrayList arrayList0;
        h h1;
        long v15;
        long v9;
        o1 o11;
        zzfi zzfi1;
        r1 r11;
        long v5;
        zzfi zzfi2;
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        long v = System.nanoTime();
        this.zzaz().zzg();
        this.b();
        String s = zzq0.zza;
        zzkv zzkv0 = this.g;
        zzkt.D(this.g);
        Preconditions.checkNotNull(zzaw0);
        Preconditions.checkNotNull(zzq0);
        if(TextUtils.isEmpty(zzq0.zzb) && TextUtils.isEmpty(zzq0.zzq)) {
            return;
        }
        if(zzq0.zzh) {
            zzfi zzfi0 = this.a;
            zzkt.D(zzfi0);
            boolean z = zzfi0.j(s, zzaw0.zza);
            o1 o10 = this.E;
            zzfr zzfr0 = this.l;
            if(z) {
                this.zzay().zzk().zzc("Dropping blocked event. appId", zzeh.zzn(s), zzfr0.zzj().zzd(zzaw0.zza));
                zzkt.D(zzfi0);
                if("1".equals(zzfi0.zza(s, "measurement.upload.blacklist_internal"))) {
                label_28:
                    e e0 = this.c;
                    zzkt.D(e0);
                    c0 c00 = e0.p(s);
                    if(c00 != null) {
                        c00.a.zzaz().zzg();
                        long v1 = c00.E;
                        c00.a.zzaz().zzg();
                        long v2 = Math.max(v1, c00.D);
                        long v3 = Math.abs(this.zzav().currentTimeMillis() - v2);
                        this.zzg();
                        if(v3 > ((long)(((Long)zzdu.zzy.zza(null))))) {
                            this.zzay().zzc().zza("Fetching config for blocked app");
                            this.d(c00);
                        }
                    }
                }
                else {
                    zzkt.D(zzfi0);
                    if("1".equals(zzfi0.zza(s, "measurement.upload.blacklist_public"))) {
                        goto label_28;
                    }
                    else if(!"_err".equals(zzaw0.zza)) {
                        this.zzv().getClass();
                        zzlb.i(o10, s, 11, "_ev", zzaw0.zza, 0);
                        return;
                    }
                }
                return;
            }
            zzei zzei0 = zzei.zzb(zzaw0);
            this.zzv().h(zzei0, this.zzg().zzd(s));
            zzaw zzaw1 = zzei0.zza();
            if(Log.isLoggable(this.zzay().zzq(), 2)) {
                this.zzay().zzj().zzb("Logging event", zzfr0.zzj().zzc(zzaw1));
            }
            e e1 = this.c;
            zzkt.D(e1);
            e1.zzw();
            try {
                this.E(zzq0);
                boolean z1 = "ecommerce_purchase".equals(zzaw1.zza) || ("purchase".equals(zzaw1.zza) || "refund".equals(zzaw1.zza));
                if("_iap".equals(zzaw1.zza)) {
                label_60:
                    String s1 = zzaw1.zzb.c();
                    if(z1) {
                        double f = ((double)zzaw1.zzb.a()) * 1000000.0;
                        if(f == 0.0) {
                            zzfi2 = zzfi0;
                            f = ((double)zzaw1.zzb.a.getLong("value")) * 1000000.0;
                        }
                        else {
                            zzfi2 = zzfi0;
                        }
                        if(f > 9223372036854776000.0 || f < -9223372036854776000.0) {
                            goto label_73;
                        }
                        v5 = Math.round(f);
                        if("refund".equals(zzaw1.zza)) {
                            v5 = -v5;
                            goto label_81;
                        label_73:
                            this.zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(s), f);
                            e e2 = this.c;
                            zzkt.D(e2);
                            e2.zzC();
                            return;
                        }
                    }
                    else {
                        zzfi2 = zzfi0;
                        v5 = zzaw1.zzb.a.getLong("value");
                    }
                label_81:
                    if(TextUtils.isEmpty(s1)) {
                        o11 = o10;
                        zzfi1 = zzfi2;
                    }
                    else {
                        String s2 = s1.toUpperCase(Locale.US);
                        if(s2.matches("[A-Z]{3}")) {
                            e e3 = this.c;
                            zzkt.D(e3);
                            r1 r10 = e3.t(s, "_ltv_" + s2);
                            if(r10 == null) {
                                o11 = o10;
                                zzfi1 = zzfi2;
                            label_100:
                                e e4 = this.c;
                                zzkt.D(e4);
                                int v7 = this.zzg().zze(s, zzdu.zzD);
                                Preconditions.checkNotEmpty(s);
                                e4.zzg();
                                e4.zzW();
                                try {
                                    e4.o().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);", new String[]{s, s, String.valueOf(v7 - 1)});
                                }
                                catch(SQLiteException sQLiteException0) {
                                    e4.zzt.zzay().zzd().zzc("Error pruning currencies. appId", zzeh.zzn(s), sQLiteException0);
                                }
                                long v8 = this.zzav().currentTimeMillis();
                                r11 = new r1(s, zzaw1.zzc, "_ltv_" + s2, v8, v5);
                            }
                            else {
                                Object object0 = r10.e;
                                if(object0 instanceof Long) {
                                    long v6 = this.zzav().currentTimeMillis();
                                    o11 = o10;
                                    zzfi1 = zzfi2;
                                    r11 = new r1(s, zzaw1.zzc, "_ltv_" + s2, v6, ((long)(((long)(((Long)object0))) + v5)));
                                }
                                else {
                                    o11 = o10;
                                    zzfi1 = zzfi2;
                                    goto label_100;
                                }
                            }
                            e e5 = this.c;
                            zzkt.D(e5);
                            if(!e5.g(r11)) {
                                this.zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(s), zzfr0.zzj().zzf(r11.c), r11.e);
                                this.zzv().getClass();
                                zzlb.i(o11, s, 9, null, null, 0);
                            }
                        }
                        else {
                            o11 = o10;
                            zzfi1 = zzfi2;
                        }
                    }
                }
                else if(z1) {
                    z1 = true;
                    goto label_60;
                }
                else {
                    zzfi1 = zzfi0;
                    o11 = o10;
                }
                boolean z2 = zzlb.w(zzaw1.zza);
                boolean z3 = "_err".equals(zzaw1.zza);
                this.zzv();
                zzau zzau0 = zzaw1.zzb;
                if(zzau0 == null) {
                    v9 = 0L;
                }
                else {
                    v9 = 0L;
                    for(Object object1: zzau0.a.keySet()) {
                        Object object2 = zzau0.b(((String)object1));
                        if(object2 instanceof Parcelable[]) {
                            v9 += (long)((Parcelable[])object2).length;
                        }
                    }
                }
                e e6 = this.c;
                zzkt.D(e6);
                zzak zzak0 = e6.r(this.r(), s, v9 + 1L, true, z2, false, z3, false);
                long v10 = zzak0.b;
                this.zzg();
                long v11 = v10 - ((long)(((int)(((Integer)zzdu.zzj.zza(null))))));
                if(Long.compare(v11, 0L) > 0) {
                    if(v11 % 1000L == 1L) {
                        this.zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeh.zzn(s), zzak0.b);
                    }
                    e e7 = this.c;
                    zzkt.D(e7);
                    e7.zzC();
                    return;
                }
                if(z2) {
                    long v12 = zzak0.a;
                    this.zzg();
                    long v13 = v12 - ((long)(((int)(((Integer)zzdu.zzl.zza(null))))));
                    if(v13 > 0L) {
                        if(v13 % 1000L == 1L) {
                            this.zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeh.zzn(s), zzak0.a);
                        }
                        this.zzv().getClass();
                        zzlb.i(o11, s, 16, "_ev", zzaw1.zza, 0);
                        e e8 = this.c;
                        zzkt.D(e8);
                        e8.zzC();
                        return;
                    }
                }
                if(z3) {
                    long v14 = zzak0.d - ((long)Math.max(0, Math.min(1000000, this.zzg().zze(zzq0.zza, zzdu.zzk))));
                    if(v14 > 0L) {
                        if(v14 == 1L) {
                            this.zzay().zzd().zzc("Too many error events logged. appId, count", zzeh.zzn(s), zzak0.d);
                        }
                        e e9 = this.c;
                        zzkt.D(e9);
                        e9.zzC();
                        return;
                    }
                }
                Bundle bundle0 = zzaw1.zzb.zzc();
                this.zzv().j(bundle0, "_o", zzaw1.zzc);
                zzlb zzlb0 = this.zzv();
                zzlb0.getClass();
                if((TextUtils.isEmpty(s) ? false : zzlb0.zzt.zzf().zzl().equals(s))) {
                    this.zzv().j(bundle0, "_dbg", 1L);
                    this.zzv().j(bundle0, "_r", 1L);
                }
                if("_s".equals(zzaw1.zza)) {
                    e e10 = this.c;
                    zzkt.D(e10);
                    r1 r12 = e10.t(zzq0.zza, "_sno");
                    if(r12 != null && r12.e instanceof Long) {
                        this.zzv().j(bundle0, "_sno", r12.e);
                    }
                }
                e e11 = this.c;
                zzkt.D(e11);
                Preconditions.checkNotEmpty(s);
                e11.zzg();
                e11.zzW();
                try {
                    v15 = (long)e11.o().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{s, String.valueOf(Math.max(0, Math.min(1000000, e11.zzt.zzf().zze(s, zzdu.zzo))))});
                }
                catch(SQLiteException sQLiteException1) {
                    e11.zzt.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeh.zzn(s), sQLiteException1);
                    v15 = 0L;
                }
                if(v15 > 0L) {
                    this.zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeh.zzn(s), v15);
                }
                zzar zzar0 = new zzar(this.l, zzaw1.zzc, s, zzaw1.zza, zzaw1.zzd, bundle0);
                String s3 = zzar0.b;
                e e12 = this.c;
                zzkt.D(e12);
                h h0 = e12.s(s, s3);
                if(h0 == null) {
                    e e13 = this.c;
                    zzkt.D(e13);
                    long v16 = e13.n(s);
                    zzag zzag0 = this.zzg();
                    zzag0.getClass();
                    zzdt zzdt0 = zzdu.zzG;
                    if(v16 >= ((long)zzag0.zzf(s, zzdt0, 500, 2000)) && z2) {
                        zzef zzef0 = this.zzay().zzd();
                        Object object3 = zzeh.zzn(s);
                        String s4 = zzfr0.zzj().zzd(s3);
                        zzag zzag1 = this.zzg();
                        zzag1.getClass();
                        zzef0.zzd("Too many event names used, ignoring event. appId, name, supported count", object3, s4, zzag1.zzf(s, zzdt0, 500, 2000));
                        this.zzv().getClass();
                        zzlb.i(o11, s, 8, null, null, 0);
                        return;
                    }
                    h1 = new h(s, zzar0.b, 0L, 0L, 0L, zzar0.d, 0L, null, null, null, null);
                }
                else {
                    zzar0 = zzar0.a(zzfr0, h0.f);
                    h1 = h0.b(zzar0.d);
                }
                e e14 = this.c;
                zzkt.D(e14);
                e14.c(h1);
                this.zzaz().zzg();
                this.b();
                Preconditions.checkNotNull(zzar0);
                Preconditions.checkNotNull(zzq0);
                Preconditions.checkNotEmpty(zzar0.a);
                Preconditions.checkArgument(zzar0.a.equals(zzq0.zza));
                zzgc zzgc0 = zzgd.zzt();
                zzgc0.zzad(1);
                zzgc0.zzZ("android");
                if(!TextUtils.isEmpty(zzq0.zza)) {
                    zzgc0.zzD(zzq0.zza);
                }
                if(!TextUtils.isEmpty(zzq0.zzd)) {
                    zzgc0.zzF(zzq0.zzd);
                }
                if(!TextUtils.isEmpty(zzq0.zzc)) {
                    zzgc0.zzG(zzq0.zzc);
                }
                zzpd.zzc();
                if(this.zzg().zzs(null, zzdu.zzal) && this.zzg().zzs(zzq0.zza, zzdu.zzan) && !TextUtils.isEmpty(zzq0.zzx)) {
                    zzgc0.zzah(zzq0.zzx);
                }
                long v17 = zzq0.zzj;
                if(v17 != 0xFFFFFFFF80000000L) {
                    zzgc0.zzH(((int)v17));
                }
                zzgc0.zzV(zzq0.zze);
                if(!TextUtils.isEmpty(zzq0.zzb)) {
                    zzgc0.zzU(zzq0.zzb);
                }
                zzgc0.zzL(this.F(((String)Preconditions.checkNotNull(zzq0.zza))).zzc(zzai.zzb(zzq0.zzv)).zzh());
                if(zzgc0.zzaq().isEmpty() && !TextUtils.isEmpty(zzq0.zzq)) {
                    zzgc0.zzC(zzq0.zzq);
                }
                long v18 = zzq0.zzf;
                if(v18 != 0L) {
                    zzgc0.zzM(v18);
                }
                zzgc0.zzP(zzq0.zzs);
                zzkt.D(zzkv0);
                Map map0 = zzdu.zzc(zzkv0.zzf.l.zzau());
                if(map0 != null && !map0.isEmpty()) {
                    arrayList0 = new ArrayList();
                    int v19 = (int)(((Integer)zzdu.zzO.zza(null)));
                    for(Object object4: map0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object4;
                        if(((String)map$Entry0.getKey()).startsWith("measurement.id.")) {
                            try {
                                int v20 = Integer.parseInt(((String)map$Entry0.getValue()));
                                if(v20 == 0) {
                                    continue;
                                }
                                arrayList0.add(v20);
                                if(arrayList0.size() < v19) {
                                    continue;
                                }
                                zzkv0.zzt.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", arrayList0.size());
                                break;
                            }
                            catch(NumberFormatException numberFormatException0) {
                                zzkv0.zzt.zzay().zzk().zzb("Experiment ID NumberFormatException", numberFormatException0);
                            }
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        arrayList0 = null;
                    }
                }
                else {
                    arrayList0 = null;
                }
                if(arrayList0 != null) {
                    zzgc0.zzh(arrayList0);
                }
                zzai zzai0 = this.F(((String)Preconditions.checkNotNull(zzq0.zza))).zzc(zzai.zzb(zzq0.zzv));
                zzah zzah0 = zzah.zza;
                if(zzai0.zzi(zzah0) && zzq0.zzo) {
                    zzjo zzjo0 = this.i;
                    zzjo0.getClass();
                    Pair pair0 = zzai0.zzi(zzah0) ? zzjo0.a(zzq0.zza) : new Pair("", Boolean.FALSE);
                    if(!TextUtils.isEmpty(((CharSequence)pair0.first)) && zzq0.zzo) {
                        zzgc0.zzae(((String)pair0.first));
                        Object object5 = pair0.second;
                        if(object5 != null) {
                            zzgc0.zzX(((Boolean)object5).booleanValue());
                        }
                    }
                }
                zzfr0.zzg().zzu();
                zzgc0.zzN(Build.MODEL);
                zzfr0.zzg().zzu();
                zzgc0.zzY(Build.VERSION.RELEASE);
                zzgc0.zzaj(((int)zzfr0.zzg().zzb()));
                zzgc0.zzan(zzfr0.zzg().zzc());
                if(zzfr0.zzJ() && !TextUtils.isEmpty(null)) {
                    zzgc0.zzO(null);
                }
                e e15 = this.c;
                zzkt.D(e15);
                c0 c01 = e15.p(zzq0.zza);
                if(c01 == null) {
                    c01 = new c0(zzfr0, zzq0.zza);
                    c01.c(this.G(zzai0));
                    c01.j(zzq0.zzk);
                    c01.k(zzq0.zzb);
                    if(zzai0.zzi(zzah0)) {
                        c01.r(this.i.b(zzq0.zza, zzq0.zzo));
                    }
                    c01.o(0L);
                    c01.p(0L);
                    c01.n(0L);
                    c01.e(zzq0.zzc);
                    c01.f(zzq0.zzj);
                    c01.d(zzq0.zzd);
                    c01.l(zzq0.zze);
                    c01.h(zzq0.zzf);
                    c01.q(zzq0.zzh);
                    c01.i(zzq0.zzs);
                    e e16 = this.c;
                    zzkt.D(e16);
                    e16.b(c01);
                }
                if(zzai0.zzi(zzah.zzb) && !TextUtils.isEmpty(c01.x())) {
                    zzgc0.zzE(((String)Preconditions.checkNotNull(c01.x())));
                }
                if(!TextUtils.isEmpty(c01.z())) {
                    zzgc0.zzT(((String)Preconditions.checkNotNull(c01.z())));
                }
                e e17 = this.c;
                zzkt.D(e17);
                List list0 = e17.x(zzq0.zza);
                for(int v21 = 0; v21 < list0.size(); ++v21) {
                    zzgl zzgl0 = com.google.android.gms.internal.measurement.zzgm.zzd();
                    zzgl0.zzf(((r1)list0.get(v21)).c);
                    zzgl0.zzg(((r1)list0.get(v21)).d);
                    zzkt.D(zzkv0);
                    zzkv0.v(zzgl0, ((r1)list0.get(v21)).e);
                    zzgc0.zzl(zzgl0);
                }
                try {
                    e e18 = this.c;
                    zzkt.D(e18);
                    zzgd zzgd0 = (zzgd)zzgc0.zzaC();
                    e18.zzg();
                    e18.zzW();
                    Preconditions.checkNotNull(zzgd0);
                    Preconditions.checkNotEmpty("");
                    byte[] arr_b = zzgd0.zzbu();
                    zzkt.D(e18.zzf.g);
                    v22 = e18.zzf.g.k(arr_b);
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("app_id", "");
                    contentValues0.put("metadata_fingerprint", v22);
                    contentValues0.put("metadata", arr_b);
                    try {
                        e18.o().insertWithOnConflict("raw_events_metadata", null, contentValues0, 4);
                    }
                    catch(SQLiteException sQLiteException2) {
                        e18.zzt.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeh.zzn(""), sQLiteException2);
                        throw sQLiteException2;
                    }
                }
                catch(IOException iOException0) {
                    this.zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeh.zzn(zzgc0.zzap()), iOException0);
                    goto label_400;
                }
                e e19 = this.c;
                zzkt.D(e19);
                for(Object object6: zzar0.f.a.keySet()) {
                    if(!"_r".equals(((String)object6))) {
                        continue;
                    }
                    v23 = 1;
                    goto label_380;
                }
                zzkt.D(zzfi1);
                boolean z4 = zzfi1.i(zzar0.a, zzar0.b);
                e e20 = this.c;
                zzkt.D(e20);
                v23 = z4 && e20.r(this.r(), zzar0.a, 1L, false, false, false, false, false).e < ((long)this.zzg().zze(zzar0.a, zzdu.zzn)) ? 1 : 0;
            label_380:
                e19.zzg();
                e19.zzW();
                Preconditions.checkNotNull(zzar0);
                Preconditions.checkNotEmpty(zzar0.a);
                zzkt.D(e19.zzf.g);
                byte[] arr_b1 = e19.zzf.g.o(zzar0).zzbu();
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("app_id", zzar0.a);
                contentValues1.put("name", zzar0.b);
                contentValues1.put("timestamp", zzar0.d);
                contentValues1.put("metadata_fingerprint", v22);
                contentValues1.put("data", arr_b1);
                contentValues1.put("realtime", v23);
                try {
                    if(e19.o().insert("raw_events", null, contentValues1) == -1L) {
                        e19.zzt.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeh.zzn(zzar0.a));
                    }
                    else {
                        this.o = 0L;
                    }
                }
                catch(SQLiteException sQLiteException3) {
                    e19.zzt.zzay().zzd().zzc("Error storing raw event. appId", zzeh.zzn(zzar0.a), sQLiteException3);
                }
            label_400:
                e e21 = this.c;
                zzkt.D(e21);
                e21.zzC();
            }
            finally {
                e e22 = this.c;
                zzkt.D(e22);
                e22.z();
            }
            this.y();
            this.zzay().zzj().zzb("Background event processing time, ms", ((long)((System.nanoTime() - v + 500000L) / 1000000L)));
            return;
        }
        this.E(zzq0);
    }

    public final long r() {
        long v = this.zzav().currentTimeMillis();
        zzjo zzjo0 = this.i;
        zzjo0.zzW();
        zzjo0.zzg();
        long v1 = zzjo0.zze.zza();
        if(v1 == 0L) {
            v1 = ((long)zzjo0.zzt.zzv().d().nextInt(86400000)) + 1L;
            zzjo0.zze.zzb(v1);
        }
        return (v + v1) / 1000L / 60L / 60L / 24L;
    }

    public static final void s(zzfs zzfs0, int v, String s) {
        List list0 = zzfs0.zzp();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if("_err".equals(((zzfx)list0.get(v1)).zzg())) {
                return;
            }
        }
        zzfw zzfw0 = zzfx.zze();
        zzfw0.zzj("_err");
        zzfw0.zzi(((long)v));
        zzfx zzfx0 = (zzfx)zzfw0.zzaC();
        zzfw zzfw1 = zzfx.zze();
        zzfw1.zzj("_ev");
        zzfw1.zzk(s);
        zzfx zzfx1 = (zzfx)zzfw1.zzaC();
        zzfs0.zzf(zzfx0);
        zzfs0.zzf(zzfx1);
    }

    public static final void t(zzfs zzfs0, String s) {
        List list0 = zzfs0.zzp();
        for(int v = 0; v < list0.size(); ++v) {
            if(s.equals(((zzfx)list0.get(v)).zzg())) {
                zzfs0.zzh(v);
                return;
            }
        }
    }

    public final zzq u(String s) {
        e e0 = this.c;
        zzkt.D(e0);
        c0 c00 = e0.p(s);
        if(c00 != null && !TextUtils.isEmpty(c00.y())) {
            Boolean boolean0 = this.v(c00);
            if(boolean0 != null && !boolean0.booleanValue()) {
                this.zzay().zzd().zzb("App version does not match; dropping. appId", zzeh.zzn(s));
                return null;
            }
            String s1 = c00.A();
            String s2 = c00.y();
            long v = c00.t();
            c00.a.zzaz().zzg();
            String s3 = c00.l;
            c00.a.zzaz().zzg();
            long v1 = c00.m;
            c00.a.zzaz().zzg();
            long v2 = c00.n;
            c00.a.zzaz().zzg();
            boolean z = c00.o;
            String s4 = c00.z();
            c00.a.zzaz().zzg();
            c00.a.zzaz().zzg();
            boolean z1 = c00.p;
            String s5 = c00.u();
            c00.a.zzaz().zzg();
            Boolean boolean1 = c00.r;
            c00.a.zzaz().zzg();
            long v3 = c00.s;
            c00.a.zzaz().zzg();
            return new zzq(s, s1, s2, v, s3, v1, v2, null, z, false, s4, 0L, 0, z1, false, s5, boolean1, v3, c00.t, this.F(s).zzh(), "", null);
        }
        this.zzay().zzc().zzb("No app data available; dropping", s);
        return null;
    }

    public final Boolean v(c0 c00) {
        try {
            long v = c00.t();
            zzfr zzfr0 = this.l;
            if(Long.compare(v, 0xFFFFFFFF80000000L) != 0) {
                int v1 = Wrappers.packageManager(zzfr0.zzau()).getPackageInfo(c00.w(), 0).versionCode;
                return c00.t() == ((long)v1);
            }
            String s = Wrappers.packageManager(zzfr0.zzau()).getPackageInfo(c00.w(), 0).versionName;
            String s1 = c00.y();
            return s1 == null || !s1.equals(s) ? false : true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    public final void w() {
        this.zzaz().zzg();
        if(!this.s && !this.t && !this.u) {
            this.zzay().zzj().zza("Stopping uploading service(s)");
            ArrayList arrayList0 = this.p;
            if(arrayList0 == null) {
                return;
            }
            for(Object object0: arrayList0) {
                ((Runnable)object0).run();
            }
            ((List)Preconditions.checkNotNull(this.p)).clear();
            return;
        }
        this.zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.u));
    }

    public final void x(zzgc zzgc0, long v, boolean z) {
        r1 r11;
        e e0 = this.c;
        zzkt.D(e0);
        r1 r10 = e0.t(zzgc0.zzap(), (z ? "_se" : "_lte"));
        if(r10 == null) {
            r11 = new r1(zzgc0.zzap(), "auto", (z ? "_se" : "_lte"), this.zzav().currentTimeMillis(), v);
        }
        else {
            Object object0 = r10.e;
            r11 = object0 == null ? new r1(zzgc0.zzap(), "auto", (z ? "_se" : "_lte"), this.zzav().currentTimeMillis(), v) : new r1(zzgc0.zzap(), "auto", (z ? "_se" : "_lte"), this.zzav().currentTimeMillis(), ((long)(((long)(((Long)object0))) + v)));
        }
        zzgl zzgl0 = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzgl0.zzf((z ? "_se" : "_lte"));
        zzgl0.zzg(this.zzav().currentTimeMillis());
        Object object1 = r11.e;
        zzgl0.zze(((long)(((Long)object1))));
        com.google.android.gms.internal.measurement.zzgm zzgm0 = (com.google.android.gms.internal.measurement.zzgm)zzgl0.zzaC();
        int v1 = zzkv.j(zzgc0, (z ? "_se" : "_lte"));
        if(v1 >= 0) {
            zzgc0.zzam(v1, zzgm0);
        }
        else {
            zzgc0.zzm(zzgm0);
        }
        if(v > 0L) {
            e e1 = this.c;
            zzkt.D(e1);
            e1.g(r11);
            this.zzay().zzj().zzc("Updated engagement user property. scope, value", (z ? "session-scoped" : "lifetime"), object1);
        }
    }

    public final void y() {
        long v3;
        boolean z;
        this.zzaz().zzg();
        this.b();
        if(this.o > 0L) {
            long v = Math.abs(this.zzav().elapsedRealtime() - this.o);
            if(3600000L - v > 0L) {
                this.zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", ((long)(3600000L - v)));
                this.zzm().a();
                zzkf zzkf0 = this.e;
                zzkt.D(zzkf0);
                zzkf0.zza();
                return;
            }
            this.o = 0L;
        }
        if(this.l.zzM() && this.A()) {
            long v1 = this.zzav().currentTimeMillis();
            this.zzg();
            long v2 = Math.max(0L, ((long)(((Long)zzdu.zzz.zza(null)))));
            e e0 = this.c;
            zzkt.D(e0);
            if(e0.j("select count(1) > 0 from raw_events where realtime = 1", null) == 0L) {
                e e1 = this.c;
                zzkt.D(e1);
                z = e1.j("select count(1) > 0 from queue where has_realtime = 1", null) == 0L ? false : true;
            }
            else {
                z = true;
            }
            if(z) {
                String s = this.zzg().zzl();
                if(TextUtils.isEmpty(s) || ".none.".equals(s)) {
                    this.zzg();
                    v3 = Math.max(0L, ((long)(((Long)zzdu.zzt.zza(null)))));
                }
                else {
                    this.zzg();
                    v3 = Math.max(0L, ((long)(((Long)zzdu.zzu.zza(null)))));
                }
            }
            else {
                this.zzg();
                v3 = Math.max(0L, ((long)(((Long)zzdu.zzs.zza(null)))));
            }
            long v4 = 0L;
            long v5 = this.i.zzc.zza();
            long v6 = this.i.zzd.zza();
            e e2 = this.c;
            zzkt.D(e2);
            long v7 = e2.l("select max(bundle_end_timestamp) from queue", null, 0L);
            e e3 = this.c;
            zzkt.D(e3);
            long v8 = Math.max(v7, e3.l("select max(timestamp) from raw_events", null, 0L));
            zzkv zzkv0 = this.g;
            if(Long.compare(v8, 0L) != 0) {
                long v9 = v1 - Math.abs(v8 - v1);
                long v10 = v1 - Math.abs(v6 - v1);
                long v11 = Math.max(v1 - Math.abs(v5 - v1), v10);
                zzkt.D(zzkv0);
                long v12 = zzkv0.x(v11, v3) ? (!z || v11 <= 0L ? v2 + v9 : Math.min(v9, v11) + v3) : v11 + v3;
                if(v10 != 0L && v10 >= v9) {
                    int v13 = 0;
                    while(true) {
                        this.zzg();
                        if(v13 >= Math.min(20, Math.max(0, ((int)(((Integer)zzdu.zzB.zza(null))))))) {
                            goto label_64;
                        }
                        this.zzg();
                        v12 += Math.max(0L, ((long)(((Long)zzdu.zzA.zza(null))))) * (1L << v13);
                        if(v12 > v10) {
                            break;
                        }
                        ++v13;
                    }
                }
                v4 = v12;
            }
        label_64:
            if(v4 != 0L) {
                zzkt.D(this.b);
                if(this.b.zza()) {
                    long v14 = this.i.zzb.zza();
                    this.zzg();
                    long v15 = Math.max(0L, ((long)(((Long)zzdu.zzq.zza(null)))));
                    zzkt.D(zzkv0);
                    if(!zzkv0.x(v14, v15)) {
                        v4 = Math.max(v4, v14 + v15);
                    }
                    this.zzm().a();
                    long v16 = v4 - this.zzav().currentTimeMillis();
                    if(v16 <= 0L) {
                        this.zzg();
                        v16 = Math.max(0L, ((long)(((Long)zzdu.zzv.zza(null)))));
                        this.i.zzc.zzb(this.zzav().currentTimeMillis());
                    }
                    this.zzay().zzj().zzb("Upload scheduled in approximately ms", v16);
                    zzkf zzkf1 = this.e;
                    zzkt.D(zzkf1);
                    zzkf1.zzd(v16);
                    return;
                }
                this.zzay().zzj().zza("No network");
                n n0 = this.zzm();
                zzkt zzkt0 = n0.a;
                zzkt0.b();
                zzkt0.zzaz().zzg();
                if(!n0.b) {
                    zzkt0.zzau().registerReceiver(n0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    n0.c = zzkt0.zzl().zza();
                    zzkt0.zzay().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(n0.c));
                    n0.b = true;
                }
                zzkf zzkf2 = this.e;
                zzkt.D(zzkf2);
                zzkf2.zza();
                return;
            }
            this.zzay().zzj().zza("Next upload time is 0");
            this.zzm().a();
            zzkf zzkf3 = this.e;
            zzkt.D(zzkf3);
            zzkf3.zza();
            return;
        }
        this.zzay().zzj().zza("Nothing to upload or uploading impossible");
        this.zzm().a();
        zzkf zzkf4 = this.e;
        zzkt.D(zzkf4);
        zzkf4.zza();
    }

    public final boolean z(long v) {
        byte[] arr_b1;
        long v28;
        long v27;
        c0 c01;
        Throwable throwable5;
        h h3;
        long v26;
        String s5;
        Long long3;
        Throwable throwable3;
        h h2;
        long v25;
        String s4;
        ArrayList arrayList2;
        zzfs zzfs7;
        zzgc zzgc5;
        int v24;
        p1 p12;
        HashMap hashMap1;
        zzkv zzkv3;
        Long long1;
        zzfi zzfi2;
        h h0;
        int v23;
        long v22;
        long v21;
        String s3;
        zzfr zzfr1;
        SecureRandom secureRandom1;
        zzfs zzfs6;
        p1 p11;
        zzfi zzfi1;
        zzgc zzgc4;
        int v20;
        SecureRandom secureRandom0;
        ArrayList arrayList1;
        HashMap hashMap0;
        int v19;
        zzkv zzkv2;
        int v17;
        Iterator iterator0;
        long v16;
        zzgc zzgc3;
        int v14;
        int v13;
        zzgc zzgc2;
        int v11;
        int v12;
        zzkv zzkv1;
        zzgc zzgc1;
        int v7;
        zzfs zzfs3;
        zzkv zzkv0;
        zzfi zzfi0;
        zzfr zzfr0;
        int v5;
        int v4;
        zzfs zzfs1;
        int v3;
        zzfs zzfs0;
        int v2;
        int v1;
        zzgc zzgc0;
        p1 p10;
        e e0 = this.c;
        zzkt.D(e0);
        e0.zzw();
        try {
            p10 = new p1(this);
            e e1 = this.c;
            zzkt.D(e1);
            e1.h(v, this.z, p10);
            if(p10.c != null && !p10.c.isEmpty()) {
                zzgc0 = (zzgc)p10.a.zzby();
                zzgc0.zzr();
                v1 = 0;
                v2 = 0;
                zzfs0 = null;
                v3 = -1;
                zzfs1 = null;
                v4 = -1;
                v5 = 0;
                while(true) {
                label_17:
                    zzfr0 = this.l;
                    zzfi0 = this.a;
                    zzkv0 = this.g;
                    if(v1 < p10.c.size()) {
                        goto label_21;
                    }
                    goto label_163;
                }
            }
            goto label_513;
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
        label_21:
            zzfs zzfs2 = (zzfs)((zzft)p10.c.get(v1)).zzby();
            zzkt.D(zzfi0);
            if(zzfi0.j("", zzfs2.zzo())) {
                this.zzay().zzk().zzc("Dropping blocked raw event. appId", zzeh.zzn(""), zzfr0.zzj().zzd(zzfs2.zzo()));
                zzkt.D(zzfi0);
                if(!"1".equals(zzfi0.zza("", "measurement.upload.blacklist_internal"))) {
                    zzkt.D(zzfi0);
                    if(!"1".equals(zzfi0.zza("", "measurement.upload.blacklist_public")) && !"_err".equals(zzfs2.zzo())) {
                        zzlb zzlb0 = this.zzv();
                        String s1 = zzfs2.zzo();
                        zzlb0.getClass();
                        zzlb.i(this.E, "", 11, "_ev", s1, 0);
                    }
                }
                zzgc2 = zzgc0;
                v14 = v1;
            }
            else {
                if(zzfs2.zzo().equals("ad_impression")) {
                    zzfs2.zzi("_ai");
                    this.zzay().zzj().zza("Renaming ad_impression to _ai");
                    if(Log.isLoggable(this.zzay().zzq(), 5)) {
                        for(int v6 = 0; v6 < zzfs2.zza(); ++v6) {
                        }
                    }
                }
                zzkt.D(zzfi0);
                boolean z = zzfi0.i("", zzfs2.zzo());
                if(z) {
                    zzfs3 = zzfs0;
                }
                else {
                    zzkt.D(zzkv0);
                    String s = zzfs2.zzo();
                    Preconditions.checkNotEmpty(s);
                    zzfs3 = zzfs0;
                    switch(s) {
                        case "_in": {
                            v7 = 0;
                            break;
                        }
                        case "_ug": {
                            v7 = 2;
                            break;
                        }
                        case "_ui": {
                            v7 = 1;
                            break;
                        }
                        default: {
                            v7 = -1;
                        }
                    }
                    if(v7 != 0 && v7 != 1 && v7 != 2) {
                        zzgc1 = zzgc0;
                        zzkv1 = zzkv0;
                        z = false;
                        goto label_88;
                    }
                }
                int v8 = 0;
                while(true) {
                    zzgc1 = zzgc0;
                    if(v8 >= zzfs2.zza()) {
                        break;
                    }
                    ++v8;
                    zzgc0 = zzgc1;
                }
                zzkv1 = zzkv0;
                if(z) {
                    this.zzay().zzj().zzb("Marking event as conversion", zzfr0.zzj().zzd(zzfs2.zzo()));
                    zzfw zzfw0 = zzfx.zze();
                    zzfw0.zzj("_c");
                    zzfw0.zzi(1L);
                    zzfs2.zze(zzfw0);
                }
                this.zzay().zzj().zzb("Marking event as real-time", zzfr0.zzj().zzd(zzfs2.zzo()));
                zzfw zzfw1 = zzfx.zze();
                zzfw1.zzj("_r");
                zzfw1.zzi(1L);
                zzfs2.zze(zzfw1);
                e e2 = this.c;
                zzkt.D(e2);
                if(e2.r(this.r(), "", 1L, false, false, false, false, true).e > ((long)this.zzg().zze("", zzdu.zzn))) {
                    zzkt.t(zzfs2, "_r");
                }
                else {
                    v5 = 1;
                }
                if(zzlb.w(zzfs2.zzo()) && z) {
                    e e3 = this.c;
                    zzkt.D(e3);
                    if(e3.r(this.r(), "", 1L, false, false, true, false, false).c > ((long)this.zzg().zze("", zzdu.zzm))) {
                        this.zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeh.zzn(""));
                        for(int v9 = 0; v9 < zzfs2.zza(); ++v9) {
                            zzfs2.zzn(v9);
                        }
                        this.zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(""));
                    }
                }
            label_88:
                if(z) {
                    ArrayList arrayList0 = new ArrayList(zzfs2.zzp());
                    for(int v10 = 0; v10 < arrayList0.size(); ++v10) {
                    }
                }
                if("_e".equals(zzfs2.zzo())) {
                    zzkt.D(zzkv1);
                    if(zzkv.a(((zzft)zzfs2.zzaC()), "_fr") == null) {
                        if(zzfs1 == null || Math.abs(zzfs1.zzc() - zzfs2.zzc()) > 1000L) {
                            zzgc2 = zzgc1;
                            zzfs0 = zzfs2;
                            v3 = v2;
                        }
                        else {
                            zzfs zzfs4 = (zzfs)zzfs1.zzaz();
                            if(this.B(zzfs2, zzfs4)) {
                                v12 = v4;
                                zzgc2 = zzgc1;
                                zzgc2.zzS(v12, zzfs4);
                                zzfs0 = null;
                                zzfs1 = null;
                            }
                            else {
                                v12 = v4;
                                zzgc2 = zzgc1;
                                zzfs0 = zzfs2;
                                v3 = v2;
                            }
                            v4 = v12;
                        }
                        goto label_144;
                    }
                    else {
                        v11 = v4;
                        zzgc2 = zzgc1;
                        goto label_142;
                    }
                    goto label_119;
                }
                else {
                label_119:
                    v11 = v4;
                    zzgc2 = zzgc1;
                    if("_vs".equals(zzfs2.zzo())) {
                        zzkt.D(zzkv1);
                        if(zzkv.a(((zzft)zzfs2.zzaC()), "_et") == null) {
                            if(zzfs3 == null || Math.abs(zzfs3.zzc() - zzfs2.zzc()) > 1000L) {
                                zzfs1 = zzfs2;
                                v4 = v2;
                                goto label_143;
                            }
                            else {
                                zzfs zzfs5 = (zzfs)zzfs3.zzaz();
                                if(this.B(zzfs5, zzfs2)) {
                                    v13 = v3;
                                    zzgc2.zzS(v13, zzfs5);
                                    v4 = v11;
                                    zzfs0 = null;
                                    zzfs1 = null;
                                }
                                else {
                                    v13 = v3;
                                    zzfs1 = zzfs2;
                                    v4 = v2;
                                    zzfs0 = zzfs3;
                                }
                                v3 = v13;
                                goto label_144;
                            }
                        }
                    }
                }
            label_142:
                v4 = v11;
            label_143:
                zzfs0 = zzfs3;
            label_144:
                v14 = v1;
                p10.c.set(v14, ((zzft)zzfs2.zzaC()));
                ++v2;
                zzgc2.zzk(zzfs2);
            }
            v1 = v14 + 1;
            zzgc0 = zzgc2;
            goto label_17;
        label_163:
            zzgc3 = zzgc0;
            v16 = 0L;
            for(int v15 = 0; v15 < v2; ++v15) {
                zzft zzft0 = zzgc3.zze(v15);
                zzkt.D(zzkv0);
                zzfx zzfx0 = zzkv.a(zzft0, "_et");
                if(zzfx0 != null) {
                    Long long0 = zzfx0.zzw() ? zzfx0.zzd() : null;
                    if(long0 != null && ((long)long0) > 0L) {
                        v16 += (long)long0;
                    }
                }
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
        try {
            this.x(zzgc3, v16, false);
            iterator0 = zzgc3.zzas().iterator();
            while(true) {
            label_178:
                if(!iterator0.hasNext()) {
                    if(zzkv.j(zzgc3, "_sid") < 0) {
                        v17 = zzkv.j(zzgc3, "_se");
                        if(v17 >= 0) {
                            break;
                        }
                    }
                    else {
                        goto label_185;
                    }
                    goto label_186;
                }
                goto label_508;
            }
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
            zzgc3.zzB(v17);
            this.zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeh.zzn(""));
            goto label_186;
        label_185:
            this.x(zzgc3, v16, true);
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
        try {
        label_186:
            zzkt.D(zzkv0);
            zzkv2 = zzkv0;
            zzkv2.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
            zzkt.D(zzkv2.zzf.a);
            String s2 = zzgc3.zzap();
            if(zzkv2.zzf.a.h(s2)) {
                goto label_192;
            }
            goto label_209;
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
        label_192:
            e e4 = zzkv2.zzf.c;
            zzkt.D(e4);
            c0 c00 = e4.p(zzgc3.zzap());
            if(c00 != null) {
                c00.a.zzaz().zzg();
                if(c00.p && zzkv2.zzt.zzg().b()) {
                    zzkv2.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                    zzgl zzgl0 = com.google.android.gms.internal.measurement.zzgm.zzd();
                    zzgl0.zzf("_npa");
                    zzgl0.zzg(zzkv2.zzt.zzg().a());
                    zzgl0.zze(1L);
                    com.google.android.gms.internal.measurement.zzgm zzgm0 = (com.google.android.gms.internal.measurement.zzgm)zzgl0.zzaC();
                    for(int v18 = 0; v18 < zzgc3.zzb(); ++v18) {
                    }
                    zzgc3.zzm(zzgm0);
                }
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
        try {
        label_209:
            zzgc3.zzai(0x7FFFFFFFFFFFFFFFL);
            zzgc3.zzQ(0x8000000000000000L);
            v19 = 0;
        alab1:
            while(true) {
            label_212:
                if(v19 >= zzgc3.zza()) {
                    zzgc3.zzz();
                    zzgc3.zzo();
                    b b0 = this.f;
                    zzkt.D(b0);
                    zzgc3.zzf(b0.a(zzgc3.zzap(), zzgc3.zzas(), zzgc3.zzat(), zzgc3.zzd(), zzgc3.zzc()));
                    if(this.zzg().zzw("")) {
                        hashMap0 = new HashMap();
                        arrayList1 = new ArrayList();
                        secureRandom0 = this.zzv().d();
                        v20 = 0;
                        while(true) {
                        label_223:
                            if(v20 >= zzgc3.zza()) {
                                zzgc4 = zzgc3;
                                zzfi1 = zzfi0;
                                if(arrayList1.size() < zzgc4.zza()) {
                                    zzgc4.zzr();
                                    zzgc4.zzg(arrayList1);
                                }
                                for(Object object0: hashMap0.entrySet()) {
                                    e e5 = this.c;
                                    zzkt.D(e5);
                                    e5.c(((h)((Map.Entry)object0).getValue()));
                                }
                                p11 = p10;
                                break;
                            }
                            zzfs6 = (zzfs)zzgc3.zze(v20).zzby();
                            if(zzfs6.zzo().equals("_ep")) {
                                goto label_349;
                            }
                            else {
                                secureRandom1 = secureRandom0;
                                zzfr1 = zzfr0;
                                zzkt.D(zzfi0);
                                s3 = zzfi0.zza("", "measurement.account.time_zone_offset_minutes");
                                if(TextUtils.isEmpty(s3)) {
                                    goto label_249;
                                }
                                else {
                                    break alab1;
                                }
                                goto label_250;
                            }
                            goto label_372;
                        }
                    }
                    else {
                        goto label_389;
                    }
                    goto label_392;
                }
                goto label_501;
            }
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
            try {
                v21 = Long.parseLong(s3);
                goto label_250;
            }
            catch(NumberFormatException numberFormatException0) {
                zzfi0.zzt.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeh.zzn(""), numberFormatException0);
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
    label_249:
        v21 = 0L;
        try {
        label_250:
            v22 = this.zzv().zzr(zzfs6.zzc(), v21);
            zzft zzft1 = (zzft)zzfs6.zzaC();
            if(!TextUtils.isEmpty("_dbg")) {
                goto label_253;
            }
            goto label_258;
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
        label_253:
            for(Object object1: zzft1.zzi()) {
                zzfx zzfx1 = (zzfx)object1;
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
        try {
        label_258:
            zzkt.D(zzfi0);
            v23 = zzfi0.f("", zzfs6.zzo());
            if(v23 > 0) {
                h0 = (h)hashMap0.get(zzfs6.zzo());
                if(h0 == null) {
                    goto label_263;
                }
                goto label_272;
            }
            else {
                goto label_345;
            }
            goto label_349;
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
        label_263:
            e e6 = this.c;
            zzkt.D(e6);
            h h1 = e6.s("", zzfs6.zzo());
            if(h1 == null) {
                zzfi2 = zzfi0;
                this.zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", "", zzfs6.zzo());
                h0 = new h("", zzfs6.zzo(), 1L, 1L, 1L, zzfs6.zzc(), 0L, null, null, null, null);
                goto label_273;
            }
            else {
                h0 = h1;
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
    label_272:
        zzfi2 = zzfi0;
        try {
        label_273:
            zzkt.D(zzkv2);
            long1 = (Long)zzkv.b(((zzft)zzfs6.zzaC()), "_eid");
            if(long1 == null) {
                goto label_278;
            }
            else {
                goto label_276;
            }
            goto label_279;
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
    label_276:
        boolean z1 = true;
        goto label_279;
    label_278:
        z1 = false;
    label_279:
        if(v23 == 1) {
            try {
                arrayList1.add(((zzft)zzfs6.zzaC()));
                if(z1 && (h0.i != null || h0.j != null || h0.k != null)) {
                    hashMap0.put(zzfs6.zzo(), h0.a(null, null, null));
                }
                zzgc3.zzS(v20, zzfs6);
                zzkv3 = zzkv2;
                hashMap1 = hashMap0;
                p12 = p10;
                v24 = v20;
                zzgc5 = zzgc3;
                goto label_378;
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                goto label_519;
            }
        }
        else {
            try {
                if(secureRandom1.nextInt(v23) == 0) {
                    goto label_321;
                }
                else {
                    zzkv3 = zzkv2;
                    p12 = p10;
                    zzfs7 = zzfs6;
                    if((h0.h == null ? this.zzv().zzr(zzfs7.zzb(), v21) : ((long)h0.h)) == v22) {
                        hashMap1 = hashMap0;
                        arrayList2 = arrayList1;
                        if(z1) {
                            hashMap1.put(zzfs7.zzo(), h0.a(long1, null, null));
                        }
                    }
                    else {
                        zzkt.D(zzkv3);
                        zzkv.A(zzfs7, "_efs", 1L);
                        zzkt.D(zzkv3);
                        Long long2 = (long)v23;
                        zzkv.A(zzfs7, "_sr", long2);
                        arrayList2 = arrayList1;
                        arrayList2.add(((zzft)zzfs7.zzaC()));
                        if(z1) {
                            h0 = h0.a(null, long2, Boolean.TRUE);
                        }
                        s4 = zzfs7.zzo();
                        v25 = zzfs7.zzc();
                        h2 = new h(h0.a, h0.b, h0.c, h0.d, h0.e, h0.f, v25, v22, h0.i, h0.j, h0.k);
                        hashMap1 = hashMap0;
                        goto label_317;
                    }
                    zzgc5 = zzgc3;
                    v24 = v20;
                }
                goto label_343;
            }
            catch(Throwable throwable0) {
                goto label_518;
            }
            try {
                h2 = new h(h0.a, h0.b, h0.c, h0.d, h0.e, h0.f, v25, v22, h0.i, h0.j, h0.k);
                hashMap1 = hashMap0;
                goto label_317;
            }
            catch(Throwable throwable2) {
                try {
                    throwable3 = throwable2;
                    throwable5 = throwable3;
                    goto label_519;
                label_317:
                    hashMap1.put(s4, h2);
                    zzgc5 = zzgc3;
                    v24 = v20;
                    goto label_343;
                label_321:
                    zzkt.D(zzkv2);
                    long3 = (long)v23;
                    zzkv.A(zzfs6, "_sr", long3);
                    arrayList1.add(((zzft)zzfs6.zzaC()));
                    if(z1) {
                        goto label_326;
                    }
                    goto label_327;
                }
                catch(Throwable throwable0) {
                    goto label_518;
                }
            }
            try {
            label_326:
                h0 = h0.a(null, long3, null);
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                goto label_519;
            }
            try {
            label_327:
                s5 = zzfs6.zzo();
                v26 = zzfs6.zzc();
            }
            catch(Throwable throwable0) {
                goto label_518;
            }
            try {
                p12 = p10;
                zzkv3 = zzkv2;
                zzfs7 = zzfs6;
                h3 = new h(h0.a, h0.b, h0.c, h0.d, h0.e, h0.f, v26, v22, h0.i, h0.j, h0.k);
                goto label_338;
            }
            catch(Throwable throwable4) {
                try {
                    throwable3 = throwable4;
                    throwable5 = throwable3;
                    goto label_519;
                label_338:
                    hashMap0.put(s5, h3);
                    hashMap1 = hashMap0;
                    zzgc5 = zzgc3;
                    v24 = v20;
                    arrayList2 = arrayList1;
                label_343:
                    zzgc5.zzS(v24, zzfs7);
                    goto label_379;
                }
                catch(Throwable throwable0) {
                    goto label_518;
                }
            }
        }
        try {
        label_345:
            this.zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfs6.zzo(), v23);
            arrayList1.add(((zzft)zzfs6.zzaC()));
            zzgc3.zzS(v20, zzfs6);
            goto label_372;
        label_349:
            zzkt.D(zzkv2);
            String s6 = (String)zzkv.b(((zzft)zzfs6.zzaC()), "_en");
            h h4 = (h)hashMap0.get(s6);
            if(h4 == null) {
                e e7 = this.c;
                zzkt.D(e7);
                zzfr1 = zzfr0;
                secureRandom1 = secureRandom0;
                h4 = e7.s("", ((String)Preconditions.checkNotNull(s6)));
                if(h4 != null) {
                    hashMap0.put(s6, h4);
                }
            }
            else {
                secureRandom1 = secureRandom0;
                zzfr1 = zzfr0;
            }
            if(h4 != null && h4.i == null) {
                if(h4.j != null && ((long)h4.j) > 1L) {
                    zzkt.D(zzkv2);
                    zzkv.A(zzfs6, "_sr", h4.j);
                }
                if(h4.k != null && h4.k.booleanValue()) {
                    zzkt.D(zzkv2);
                    zzkv.A(zzfs6, "_efs", 1L);
                }
                arrayList1.add(((zzft)zzfs6.zzaC()));
            }
            zzgc3.zzS(v20, zzfs6);
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
    label_372:
        zzkv3 = zzkv2;
        hashMap1 = hashMap0;
        p12 = p10;
        v24 = v20;
        zzgc5 = zzgc3;
        zzfi2 = zzfi0;
    label_378:
        arrayList2 = arrayList1;
        try {
        label_379:
            hashMap0 = hashMap1;
            zzgc3 = zzgc5;
            arrayList1 = arrayList2;
            zzfr0 = zzfr1;
            secureRandom0 = secureRandom1;
            zzfi0 = zzfi2;
            p10 = p12;
            v20 = v24 + 1;
            zzkv2 = zzkv3;
            goto label_223;
        label_389:
            zzgc4 = zzgc3;
            zzfi1 = zzfi0;
            p11 = p10;
        label_392:
            e e8 = this.c;
            zzkt.D(e8);
            c01 = e8.p("");
            if(c01 == null) {
                this.zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeh.zzn(""));
            }
            else if(zzgc4.zza() > 0) {
                goto label_399;
            }
            goto label_430;
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
        label_399:
            c01.a.zzaz().zzg();
            v27 = c01.i;
            if(v27 == 0L) {
                goto label_404;
            }
            else {
                goto label_402;
            }
            goto label_405;
        }
        catch(Throwable throwable6) {
            throwable5 = throwable6;
            goto label_519;
        }
        try {
        label_402:
            zzgc4.zzab(v27);
            goto label_405;
        label_404:
            zzgc4.zzv();
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
        label_405:
            c01.a.zzaz().zzg();
            v28 = c01.h;
            if(v28 != 0L) {
                goto label_408;
            }
            goto label_409;
        }
        catch(Throwable throwable6) {
            throwable5 = throwable6;
            goto label_519;
        }
    label_408:
        v27 = v28;
        try {
        label_409:
            if(v27 == 0L) {
                zzgc4.zzw();
            }
            else {
                zzgc4.zzac(v27);
            }
            c01.a();
        }
        catch(Throwable throwable0) {
            goto label_518;
        }
        try {
            c01.a.zzaz().zzg();
            goto label_419;
        }
        catch(Throwable throwable6) {
            try {
                throwable5 = throwable6;
                goto label_519;
            label_419:
                zzgc4.zzI(((int)c01.g));
                c01.p(zzgc4.zzd());
                c01.n(zzgc4.zzc());
                String s7 = c01.v();
                if(s7 == null) {
                    zzgc4.zzs();
                }
                else {
                    zzgc4.zzW(s7);
                }
                e e9 = this.c;
                zzkt.D(e9);
                e9.b(c01);
            label_430:
                if(zzgc4.zza() > 0) {
                    zzkt.D(zzfi1);
                    zzff zzff0 = zzfi1.zze("");
                    if(zzff0 == null || !zzff0.zzs()) {
                        zzgc4.zzK(-1L);
                    }
                    else {
                        zzgc4.zzK(zzff0.zzc());
                    }
                    e e10 = this.c;
                    zzkt.D(e10);
                    zzgd zzgd0 = (zzgd)zzgc4.zzaC();
                    e10.zzg();
                    e10.zzW();
                    Preconditions.checkNotNull(zzgd0);
                    Preconditions.checkNotEmpty("");
                    Preconditions.checkState(zzgd0.zzbe());
                    e10.zzz();
                    long v29 = e10.zzt.zzav().currentTimeMillis();
                    if(zzgd0.zzk() < v29 - zzag.zzA() || zzgd0.zzk() > zzag.zzA() + v29) {
                        e10.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(""), v29, zzgd0.zzk());
                    }
                    byte[] arr_b = zzgd0.zzbu();
                    try {
                        zzkt.D(e10.zzf.g);
                        arr_b1 = e10.zzf.g.z(arr_b);
                    }
                    catch(IOException iOException0) {
                        e10.zzt.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeh.zzn(""), iOException0);
                        goto label_469;
                    }
                    e10.zzt.zzay().zzj().zzb("Saving bundle, size", ((int)arr_b1.length));
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("app_id", "");
                    contentValues0.put("bundle_end_timestamp", zzgd0.zzk());
                    contentValues0.put("data", arr_b1);
                    contentValues0.put("has_realtime", v5);
                    if(zzgd0.zzbk()) {
                        contentValues0.put("retry_count", zzgd0.zze());
                    }
                    try {
                        if(e10.o().insert("queue", null, contentValues0) == -1L) {
                            e10.zzt.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeh.zzn(""));
                        }
                    }
                    catch(SQLiteException sQLiteException0) {
                        e10.zzt.zzay().zzd().zzc("Error storing bundle. appId", zzeh.zzn(""), sQLiteException0);
                    }
                }
            label_469:
                e e11 = this.c;
                zzkt.D(e11);
                ArrayList arrayList3 = p11.b;
                Preconditions.checkNotNull(arrayList3);
                e11.zzg();
                e11.zzW();
                StringBuilder stringBuilder0 = new StringBuilder("rowid in (");
                for(int v30 = 0; v30 < arrayList3.size(); ++v30) {
                    if(v30 != 0) {
                        stringBuilder0.append(",");
                    }
                    stringBuilder0.append(((long)(((Long)arrayList3.get(v30)))));
                }
                stringBuilder0.append(")");
                int v31 = e11.o().delete("raw_events", stringBuilder0.toString(), null);
                if(v31 != arrayList3.size()) {
                    e11.zzt.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", v31, arrayList3.size());
                }
                e e12 = this.c;
                zzkt.D(e12);
                SQLiteDatabase sQLiteDatabase0 = e12.o();
                try {
                    sQLiteDatabase0.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{"", ""});
                }
                catch(SQLiteException sQLiteException1) {
                    e12.zzt.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeh.zzn(""), sQLiteException1);
                }
                e e13 = this.c;
                zzkt.D(e13);
                e13.zzC();
            }
            catch(Throwable throwable0) {
                goto label_518;
            }
        }
        e e14 = this.c;
        zzkt.D(e14);
        e14.z();
        return true;
        try {
        label_501:
            zzft zzft2 = zzgc3.zze(v19);
            if(zzft2.zzd() < zzgc3.zzd()) {
                zzgc3.zzai(zzft2.zzd());
            }
            if(zzft2.zzd() > zzgc3.zzc()) {
                zzgc3.zzQ(zzft2.zzd());
            }
            ++v19;
            goto label_212;
        label_508:
            iterator0.next();
            goto label_178;
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_519;
        }
        try {
        label_513:
            e e15 = this.c;
            zzkt.D(e15);
            e15.zzC();
            goto label_523;
        }
        catch(Throwable throwable0) {
        label_518:
            throwable5 = throwable0;
        }
    label_519:
        e e16 = this.c;
        zzkt.D(e16);
        e16.z();
        throw throwable5;
    label_523:
        e e17 = this.c;
        zzkt.D(e17);
        e17.z();
        return false;
    }

    @WorkerThread
    public final void zzR(String s, zzie zzie0) {
        this.zzaz().zzg();
        if(this.D != null && !this.D.equals(s) && zzie0 == null) {
            return;
        }
        this.D = s;
        this.C = zzie0;
    }

    @WorkerThread
    public final void zzS() {
        this.zzaz().zzg();
        e e0 = this.c;
        zzkt.D(e0);
        e0.zzz();
        if(this.i.zzc.zza() == 0L) {
            this.i.zzc.zzb(this.zzav().currentTimeMillis());
        }
        this.y();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    public final Context zzau() {
        return this.l.zzau();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    public final Clock zzav() {
        return ((zzfr)Preconditions.checkNotNull(this.l)).zzav();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    public final zzab zzaw() {
        throw null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    public final zzeh zzay() {
        return ((zzfr)Preconditions.checkNotNull(this.l)).zzay();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    public final zzfo zzaz() {
        return ((zzfr)Preconditions.checkNotNull(this.l)).zzaz();
    }

    public final b zzf() {
        b b0 = this.f;
        zzkt.D(b0);
        return b0;
    }

    public final zzag zzg() {
        return ((zzfr)Preconditions.checkNotNull(this.l)).zzf();
    }

    public final e zzi() {
        e e0 = this.c;
        zzkt.D(e0);
        return e0;
    }

    public final zzec zzj() {
        return this.l.zzj();
    }

    public final zzen zzl() {
        zzkt.D(this.b);
        return this.b;
    }

    public final n zzm() {
        n n0 = this.d;
        if(n0 == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        }
        return n0;
    }

    public final zzfi zzo() {
        zzkt.D(this.a);
        return this.a;
    }

    public final q0 zzr() {
        q0 q00 = this.h;
        zzkt.D(q00);
        return q00;
    }

    public final zzjo zzs() {
        return this.i;
    }

    public static zzkt zzt(Context context0) {
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zzkt.F == null) {
            synchronized(zzkt.class) {
                if(zzkt.F == null) {
                    zzkt.F = new zzkt(((zzku)Preconditions.checkNotNull(new zzku(context0))));
                }
            }
        }
        return zzkt.F;
    }

    public final zzkv zzu() {
        zzkt.D(this.g);
        return this.g;
    }

    public final zzlb zzv() {
        return ((zzfr)Preconditions.checkNotNull(this.l)).zzv();
    }
}

