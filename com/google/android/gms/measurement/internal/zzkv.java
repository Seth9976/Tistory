package com.google.android.gms.measurement.internal;

import a5.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzjr;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzpd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class zzkv extends m1 {
    public static final void A(zzfs zzfs0, String s, Long long0) {
        List list0 = zzfs0.zzp();
        int v;
        for(v = 0; true; ++v) {
            if(v >= list0.size()) {
                v = -1;
                break;
            }
            if(s.equals(((zzfx)list0.get(v)).zzg())) {
                break;
            }
        }
        zzfw zzfw0 = zzfx.zze();
        zzfw0.zzj(s);
        if(long0 != null) {
            zzfw0.zzi(((long)long0));
        }
        if(v >= 0) {
            zzfs0.zzj(v, zzfw0);
            return;
        }
        zzfs0.zze(zzfw0);
    }

    public static final zzfx a(zzft zzft0, String s) {
        for(Object object0: zzft0.zzi()) {
            zzfx zzfx0 = (zzfx)object0;
            if(zzfx0.zzg().equals(s)) {
                return zzfx0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static final Serializable b(zzft zzft0, String s) {
        zzfx zzfx0 = zzkv.a(zzft0, s);
        if(zzfx0 != null) {
            if(zzfx0.zzy()) {
                return "";
            }
            if(zzfx0.zzw()) {
                return zzfx0.zzd();
            }
            if(zzfx0.zzu()) {
                return zzfx0.zza();
            }
            if(zzfx0.zzc() > 0) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: zzfx0.zzi()) {
                    zzfx zzfx1 = (zzfx)object0;
                    if(zzfx1 != null) {
                        Bundle bundle0 = new Bundle();
                        for(Object object1: zzfx1.zzi()) {
                            zzfx zzfx2 = (zzfx)object1;
                            if(zzfx2.zzy()) {
                                bundle0.putString("", "");
                            }
                            else if(zzfx2.zzw()) {
                                bundle0.putLong("", zzfx2.zzd());
                            }
                            else if(zzfx2.zzu()) {
                                bundle0.putDouble("", zzfx2.zza());
                            }
                        }
                        if(!bundle0.isEmpty()) {
                            arrayList0.add(bundle0);
                        }
                    }
                }
                return (Bundle[])arrayList0.toArray(new Bundle[arrayList0.size()]);
            }
        }
        return null;
    }

    public final void c(StringBuilder stringBuilder0, int v, List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            zzfx zzfx0 = (zzfx)object0;
            if(zzfx0 != null) {
                zzkv.e(v + 1, stringBuilder0);
                stringBuilder0.append("param {\n");
                Double double0 = null;
                zzkv.h(stringBuilder0, v + 1, "name", (zzfx0.zzx() ? this.zzt.zzj().zze("") : null));
                zzkv.h(stringBuilder0, v + 1, "string_value", (zzfx0.zzy() ? "" : null));
                zzkv.h(stringBuilder0, v + 1, "int_value", (zzfx0.zzw() ? zzfx0.zzd() : null));
                if(zzfx0.zzu()) {
                    double0 = zzfx0.zza();
                }
                zzkv.h(stringBuilder0, v + 1, "double_value", double0);
                if(zzfx0.zzc() > 0) {
                    this.c(stringBuilder0, v + 1, zzfx0.zzi());
                }
                zzkv.e(v + 1, stringBuilder0);
                stringBuilder0.append("}\n");
            }
        }
    }

    public final void d(StringBuilder stringBuilder0, int v, zzem zzem0) {
        String s;
        if(zzem0 == null) {
            return;
        }
        zzkv.e(v, stringBuilder0);
        stringBuilder0.append("filter {\n");
        if(zzem0.zzh()) {
            zzkv.h(stringBuilder0, v, "complement", Boolean.valueOf(zzem0.zzg()));
        }
        if(zzem0.zzj()) {
            zzkv.h(stringBuilder0, v, "param_name", this.zzt.zzj().zze(zzem0.zze()));
        }
        if(zzem0.zzk()) {
            zzey zzey0 = zzem0.zzd();
            if(zzey0 != null) {
                zzkv.e(v + 1, stringBuilder0);
                stringBuilder0.append("string_filter {\n");
                if(zzey0.zzi()) {
                    switch(zzey0.zzj()) {
                        case 1: {
                            s = "UNKNOWN_MATCH_TYPE";
                            break;
                        }
                        case 2: {
                            s = "REGEXP";
                            break;
                        }
                        case 3: {
                            s = "BEGINS_WITH";
                            break;
                        }
                        case 4: {
                            s = "ENDS_WITH";
                            break;
                        }
                        case 5: {
                            s = "PARTIAL";
                            break;
                        }
                        case 6: {
                            s = "EXACT";
                            break;
                        }
                        default: {
                            s = "IN_LIST";
                        }
                    }
                    zzkv.h(stringBuilder0, v + 1, "match_type", s);
                }
                if(zzey0.zzh()) {
                    zzkv.h(stringBuilder0, v + 1, "expression", zzey0.zzd());
                }
                if(zzey0.zzg()) {
                    zzkv.h(stringBuilder0, v + 1, "case_sensitive", Boolean.valueOf(zzey0.zzf()));
                }
                if(zzey0.zza() > 0) {
                    zzkv.e(v + 2, stringBuilder0);
                    stringBuilder0.append("expression_list {\n");
                    for(Object object0: zzey0.zze()) {
                        zzkv.e(v + 3, stringBuilder0);
                        stringBuilder0.append(((String)object0));
                        stringBuilder0.append("\n");
                    }
                    stringBuilder0.append("}\n");
                }
                zzkv.e(v + 1, stringBuilder0);
                stringBuilder0.append("}\n");
            }
        }
        if(zzem0.zzi()) {
            zzkv.i(stringBuilder0, v + 1, "number_filter", zzem0.zzc());
        }
        zzkv.e(v, stringBuilder0);
        stringBuilder0.append("}\n");
    }

    public static final void e(int v, StringBuilder stringBuilder0) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
    }

    public static final String f(boolean z, boolean z1, boolean z2) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            stringBuilder0.append("Dynamic ");
        }
        if(z1) {
            stringBuilder0.append("Sequence ");
        }
        if(z2) {
            stringBuilder0.append("Session-Scoped ");
        }
        return stringBuilder0.toString();
    }

    public static final void g(StringBuilder stringBuilder0, String s, zzgi zzgi0) {
        if(zzgi0 == null) {
            return;
        }
        zzkv.e(3, stringBuilder0);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzgi0.zzb() != 0) {
            zzkv.e(4, stringBuilder0);
            stringBuilder0.append("results: ");
            int v = 0;
            for(Object object0: zzgi0.zzk()) {
                if(v != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object0));
                ++v;
            }
            stringBuilder0.append('\n');
        }
        if(zzgi0.zzd() != 0) {
            zzkv.e(4, stringBuilder0);
            stringBuilder0.append("status: ");
            int v1 = 0;
            for(Object object1: zzgi0.zzn()) {
                if(v1 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object1));
                ++v1;
            }
            stringBuilder0.append('\n');
        }
        if(zzgi0.zza() != 0) {
            zzkv.e(4, stringBuilder0);
            stringBuilder0.append("dynamic_filter_timestamps: {");
            int v2 = 0;
            for(Object object2: zzgi0.zzj()) {
                zzfr zzfr0 = (zzfr)object2;
                if(v2 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzfr0.zzh() ? zzfr0.zza() : null));
                stringBuilder0.append(":");
                stringBuilder0.append((zzfr0.zzg() ? zzfr0.zzb() : null));
                ++v2;
            }
            stringBuilder0.append("}\n");
        }
        if(zzgi0.zzc() != 0) {
            zzkv.e(4, stringBuilder0);
            stringBuilder0.append("sequence_filter_timestamps: {");
            int v3 = 0;
            for(Object object3: zzgi0.zzm()) {
                zzgk zzgk0 = (zzgk)object3;
                if(v3 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzgk0.zzi() ? zzgk0.zzb() : null));
                stringBuilder0.append(": [");
                int v4 = 0;
                for(Object object4: zzgk0.zzf()) {
                    long v5 = (long)(((Long)object4));
                    if(v4 != 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(v5);
                    ++v4;
                }
                stringBuilder0.append("]");
                ++v3;
            }
            stringBuilder0.append("}\n");
        }
        zzkv.e(3, stringBuilder0);
        stringBuilder0.append("}\n");
    }

    public static final void h(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 == null) {
            return;
        }
        zzkv.e(v + 1, stringBuilder0);
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
        stringBuilder0.append('\n');
    }

    public static final void i(StringBuilder stringBuilder0, int v, String s, zzer zzer0) {
        String s1;
        if(zzer0 == null) {
            return;
        }
        zzkv.e(v, stringBuilder0);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzer0.zzg()) {
            switch(zzer0.zzm()) {
                case 1: {
                    s1 = "UNKNOWN_COMPARISON_TYPE";
                    break;
                }
                case 2: {
                    s1 = "LESS_THAN";
                    break;
                }
                case 3: {
                    s1 = "GREATER_THAN";
                    break;
                }
                case 4: {
                    s1 = "EQUAL";
                    break;
                }
                default: {
                    s1 = "BETWEEN";
                }
            }
            zzkv.h(stringBuilder0, v, "comparison_type", s1);
        }
        if(zzer0.zzi()) {
            zzkv.h(stringBuilder0, v, "match_as_float", Boolean.valueOf(zzer0.zzf()));
        }
        if(zzer0.zzh()) {
            zzkv.h(stringBuilder0, v, "comparison_value", "");
        }
        if(zzer0.zzk()) {
            zzkv.h(stringBuilder0, v, "min_comparison_value", "");
        }
        if(zzer0.zzj()) {
            zzkv.h(stringBuilder0, v, "max_comparison_value", "");
        }
        zzkv.e(v, stringBuilder0);
        stringBuilder0.append("}\n");
    }

    public static int j(zzgc zzgc0, String s) {
        for(int v = 0; v < zzgc0.zzb(); ++v) {
            if(s.equals(zzgc0.zzao(v).zzf())) {
                return v;
            }
        }
        return -1;
    }

    public final long k(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        this.zzt.zzv().zzg();
        MessageDigest messageDigest0 = zzlb.c();
        if(messageDigest0 == null) {
            a.v(this.zzt, "Failed to get MD5");
            return 0L;
        }
        return zzlb.I(messageDigest0.digest(arr_b));
    }

    public static Bundle l(Map map0, boolean z) {
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Object object1 = map0.get(s);
            if(object1 == null) {
                bundle0.putString(s, null);
            }
            else if(object1 instanceof Long) {
                bundle0.putLong(s, ((long)(((Long)object1))));
            }
            else if(object1 instanceof Double) {
                bundle0.putDouble(s, ((double)(((Double)object1))));
            }
            else if(!(object1 instanceof ArrayList)) {
                bundle0.putString(s, object1.toString());
            }
            else if(z) {
                ArrayList arrayList0 = (ArrayList)object1;
                ArrayList arrayList1 = new ArrayList();
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    arrayList1.add(zzkv.l(((Map)arrayList0.get(v1)), false));
                }
                bundle0.putParcelableArray(s, ((Parcelable[])arrayList1.toArray(new Parcelable[0])));
            }
        }
        return bundle0;
    }

    public final Parcelable m(byte[] arr_b, Parcelable.Creator parcelable$Creator0) {
        if(arr_b == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.unmarshall(arr_b, 0, arr_b.length);
            parcel0.setDataPosition(0);
            return (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        }
        catch(ParseException unused_ex) {
            this.zzt.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        }
        finally {
            parcel0.recycle();
        }
    }

    public static zzaw n(zzaa zzaa0) {
        String s;
        Bundle bundle0 = zzkv.l(zzaa0.zze(), true);
        if(bundle0.containsKey("_o")) {
            Object object0 = bundle0.get("_o");
            s = object0 == null ? "app" : object0.toString();
        }
        else {
            s = "app";
        }
        String s1 = zzgo.zzb(zzaa0.zzd());
        if(s1 == null) {
            s1 = zzaa0.zzd();
        }
        return new zzaw(s1, new zzau(bundle0), s, zzaa0.zza());
    }

    public final zzft o(zzar zzar0) {
        zzfs zzfs0 = zzft.zze();
        zzfs0.zzl(zzar0.e);
        zzau zzau0 = zzar0.f;
        for(Object object0: zzau0.a.keySet()) {
            zzfw zzfw0 = zzfx.zze();
            zzfw0.zzj(((String)object0));
            Object object1 = zzau0.a.get(((String)object0));
            Preconditions.checkNotNull(object1);
            Preconditions.checkNotNull(object1);
            zzfw0.zzg();
            zzfw0.zze();
            zzfw0.zzd();
            zzfw0.zzf();
            if(object1 instanceof String) {
                zzfw0.zzk(((String)object1));
            }
            else if(object1 instanceof Long) {
                zzfw0.zzi(((long)(((Long)object1))));
            }
            else if(object1 instanceof Double) {
                zzfw0.zzh(((double)(((Double)object1))));
            }
            else if(object1 instanceof Bundle[]) {
                Bundle[] arr_bundle = (Bundle[])object1;
                ArrayList arrayList0 = new ArrayList();
                int v = 0;
                while(v < arr_bundle.length) {
                    Bundle bundle0 = arr_bundle[v];
                    if(bundle0 != null) {
                        zzfw zzfw1 = zzfx.zze();
                        for(Object object2: bundle0.keySet()) {
                            zzfw zzfw2 = zzfx.zze();
                            zzfw2.zzj(((String)object2));
                            Object object3 = bundle0.get(((String)object2));
                            if(object3 instanceof Long) {
                                zzfw2.zzi(((long)(((Long)object3))));
                            }
                            else if(object3 instanceof String) {
                                zzfw2.zzk(((String)object3));
                            }
                            else {
                                if(!(object3 instanceof Double)) {
                                    continue;
                                }
                                zzfw2.zzh(((double)(((Double)object3))));
                            }
                            zzfw1.zzc(zzfw2);
                        }
                        if(zzfw1.zza() > 0) {
                            arrayList0.add(((zzfx)zzfw1.zzaC()));
                        }
                    }
                    ++v;
                }
                zzfw0.zzb(arrayList0);
            }
            else {
                this.zzt.zzay().zzd().zzb("Ignoring invalid (type) event param value", object1);
            }
            zzfs0.zze(zzfw0);
        }
        return (zzft)zzfs0.zzaC();
    }

    public static zzll p(zzkb zzkb0, byte[] arr_b) {
        zzjr zzjr0 = zzjr.zza();
        return zzjr0 == null ? zzkb0.zzax(arr_b) : zzkb0.zzay(arr_b, zzjr0);
    }

    public final String q(zzgb zzgb0) {
        if(zzgb0 == null) {
            return "";
        }
        StringBuilder stringBuilder0 = b.t("\nbatch {\n");
        for(Object object0: zzgb0.zzd()) {
            zzgd zzgd0 = (zzgd)object0;
            if(zzgd0 != null) {
                zzkv.e(1, stringBuilder0);
                stringBuilder0.append("bundle {\n");
                if(zzgd0.zzbj()) {
                    zzkv.h(stringBuilder0, 1, "protocol_version", zzgd0.zzd());
                }
                zzpd.zzc();
                if(this.zzt.zzf().zzs(null, zzdu.zzal) && this.zzt.zzf().zzs("", zzdu.zzan) && zzgd0.zzbm()) {
                    zzkv.h(stringBuilder0, 1, "session_stitching_token", "");
                }
                zzkv.h(stringBuilder0, 1, "platform", "");
                if(zzgd0.zzbf()) {
                    zzkv.h(stringBuilder0, 1, "gmp_version", zzgd0.zzm());
                }
                if(zzgd0.zzbq()) {
                    zzkv.h(stringBuilder0, 1, "uploading_gmp_version", zzgd0.zzr());
                }
                if(zzgd0.zzbd()) {
                    zzkv.h(stringBuilder0, 1, "dynamite_version", zzgd0.zzj());
                }
                if(zzgd0.zzba()) {
                    zzkv.h(stringBuilder0, 1, "config_version", zzgd0.zzh());
                }
                zzkv.h(stringBuilder0, 1, "gmp_app_id", "");
                zzkv.h(stringBuilder0, 1, "admob_app_id", "");
                zzkv.h(stringBuilder0, 1, "app_id", "");
                zzkv.h(stringBuilder0, 1, "app_version", "");
                if(zzgd0.zzaY()) {
                    zzkv.h(stringBuilder0, 1, "app_version_major", zzgd0.zza());
                }
                zzkv.h(stringBuilder0, 1, "firebase_instance_id", "");
                if(zzgd0.zzbc()) {
                    zzkv.h(stringBuilder0, 1, "dev_cert_hash", zzgd0.zzi());
                }
                zzkv.h(stringBuilder0, 1, "app_store", "");
                if(zzgd0.zzbp()) {
                    zzkv.h(stringBuilder0, 1, "upload_timestamp_millis", zzgd0.zzq());
                }
                if(zzgd0.zzbn()) {
                    zzkv.h(stringBuilder0, 1, "start_timestamp_millis", zzgd0.zzp());
                }
                if(zzgd0.zzbe()) {
                    zzkv.h(stringBuilder0, 1, "end_timestamp_millis", zzgd0.zzk());
                }
                if(zzgd0.zzbi()) {
                    zzkv.h(stringBuilder0, 1, "previous_bundle_start_timestamp_millis", zzgd0.zzo());
                }
                if(zzgd0.zzbh()) {
                    zzkv.h(stringBuilder0, 1, "previous_bundle_end_timestamp_millis", zzgd0.zzn());
                }
                zzkv.h(stringBuilder0, 1, "app_instance_id", "");
                zzkv.h(stringBuilder0, 1, "resettable_device_id", "");
                zzkv.h(stringBuilder0, 1, "ds_id", "");
                if(zzgd0.zzbg()) {
                    zzkv.h(stringBuilder0, 1, "limited_ad_tracking", Boolean.valueOf(zzgd0.zzaW()));
                }
                zzkv.h(stringBuilder0, 1, "os_version", "");
                zzkv.h(stringBuilder0, 1, "device_model", "");
                zzkv.h(stringBuilder0, 1, "user_default_language", "");
                if(zzgd0.zzbo()) {
                    zzkv.h(stringBuilder0, 1, "time_zone_offset_minutes", zzgd0.zzf());
                }
                if(zzgd0.zzaZ()) {
                    zzkv.h(stringBuilder0, 1, "bundle_sequential_index", zzgd0.zzb());
                }
                if(zzgd0.zzbl()) {
                    zzkv.h(stringBuilder0, 1, "service_upload", Boolean.valueOf(zzgd0.zzaX()));
                }
                zzkv.h(stringBuilder0, 1, "health_monitor", "");
                if(zzgd0.zzbk()) {
                    zzkv.h(stringBuilder0, 1, "retry_counter", zzgd0.zze());
                }
                if(zzgd0.zzbb()) {
                    zzkv.h(stringBuilder0, 1, "consent_signals", "");
                }
                List list0 = zzgd0.zzO();
                if(list0 != null) {
                    for(Object object1: list0) {
                        zzgm zzgm0 = (zzgm)object1;
                        if(zzgm0 != null) {
                            zzkv.e(2, stringBuilder0);
                            stringBuilder0.append("user_property {\n");
                            zzkv.h(stringBuilder0, 2, "set_timestamp_millis", (zzgm0.zzs() ? zzgm0.zzc() : null));
                            zzkv.h(stringBuilder0, 2, "name", this.zzt.zzj().zzf(""));
                            zzkv.h(stringBuilder0, 2, "string_value", "");
                            zzkv.h(stringBuilder0, 2, "int_value", (zzgm0.zzr() ? zzgm0.zzb() : null));
                            zzkv.h(stringBuilder0, 2, "double_value", (zzgm0.zzq() ? zzgm0.zza() : null));
                            zzkv.e(2, stringBuilder0);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list1 = zzgd0.zzM();
                if(list1 != null) {
                    for(Object object2: list1) {
                        zzfp zzfp0 = (zzfp)object2;
                        if(zzfp0 != null) {
                            zzkv.e(2, stringBuilder0);
                            stringBuilder0.append("audience_membership {\n");
                            if(zzfp0.zzk()) {
                                zzkv.h(stringBuilder0, 2, "audience_id", zzfp0.zza());
                            }
                            if(zzfp0.zzm()) {
                                zzkv.h(stringBuilder0, 2, "new_audience", Boolean.valueOf(zzfp0.zzj()));
                            }
                            zzkv.g(stringBuilder0, "current_data", zzfp0.zzd());
                            if(zzfp0.zzn()) {
                                zzkv.g(stringBuilder0, "previous_data", zzfp0.zze());
                            }
                            zzkv.e(2, stringBuilder0);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list2 = zzgd0.zzN();
                if(list2 != null) {
                    for(Object object3: list2) {
                        zzft zzft0 = (zzft)object3;
                        if(zzft0 != null) {
                            zzkv.e(2, stringBuilder0);
                            stringBuilder0.append("event {\n");
                            zzkv.h(stringBuilder0, 2, "name", this.zzt.zzj().zzd(""));
                            if(zzft0.zzu()) {
                                zzkv.h(stringBuilder0, 2, "timestamp_millis", zzft0.zzd());
                            }
                            if(zzft0.zzt()) {
                                zzkv.h(stringBuilder0, 2, "previous_timestamp_millis", zzft0.zzc());
                            }
                            if(zzft0.zzs()) {
                                zzkv.h(stringBuilder0, 2, "count", zzft0.zza());
                            }
                            if(zzft0.zzb() != 0) {
                                this.c(stringBuilder0, 2, zzft0.zzi());
                            }
                            zzkv.e(2, stringBuilder0);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                zzkv.e(1, stringBuilder0);
                stringBuilder0.append("}\n");
            }
        }
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }

    public final String r(zzet zzet0) {
        StringBuilder stringBuilder0 = b.t("\nproperty_filter {\n");
        if(zzet0.zzj()) {
            zzkv.h(stringBuilder0, 0, "filter_id", zzet0.zza());
        }
        zzkv.h(stringBuilder0, 0, "property_name", this.zzt.zzj().zzf(zzet0.zze()));
        String s = zzkv.f(zzet0.zzg(), zzet0.zzh(), zzet0.zzi());
        if(!s.isEmpty()) {
            zzkv.h(stringBuilder0, 0, "filter_type", s);
        }
        this.d(stringBuilder0, 1, zzet0.zzb());
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }

    public final List s(List list0, List list1) {
        int v3;
        ArrayList arrayList0 = new ArrayList(list0);
        for(Object object0: list1) {
            Integer integer0 = (Integer)object0;
            if(((int)integer0) < 0) {
                this.zzt.zzay().zzk().zzb("Ignoring negative bit index to be cleared", integer0);
            }
            else {
                int v = ((int)integer0) / 0x40;
                if(v >= arrayList0.size()) {
                    this.zzt.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", integer0, arrayList0.size());
                }
                else {
                    arrayList0.set(v, ((long)(((long)(((Long)arrayList0.get(v)))) & ~(1L << ((int)integer0) % 0x40))));
                }
            }
        }
        int v1 = arrayList0.size();
        for(int v2 = arrayList0.size() - 1; true; v2 = v1 - 1) {
            v3 = v1;
            v1 = v2;
            if(v1 < 0 || ((long)(((Long)arrayList0.get(v1)))) != 0L) {
                break;
            }
        }
        return arrayList0.subList(0, v3);
    }

    public static ArrayList t(BitSet bitSet0) {
        int v = (bitSet0.length() + 0x3F) / 0x40;
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = 0L;
            for(int v3 = 0; v3 < 0x40; ++v3) {
                int v4 = v1 * 0x40 + v3;
                if(v4 >= bitSet0.length()) {
                    break;
                }
                if(bitSet0.get(v4)) {
                    v2 |= 1L << v3;
                }
            }
            arrayList0.add(v2);
        }
        return arrayList0;
    }

    public static HashMap u(Bundle bundle0, boolean z) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            boolean z1 = object1 instanceof Parcelable[];
            if(!z1 && !(object1 instanceof ArrayList) && !(object1 instanceof Bundle)) {
                if(object1 == null) {
                    continue;
                }
                hashMap0.put(s, object1);
            }
            else if(z) {
                ArrayList arrayList0 = new ArrayList();
                if(z1) {
                    Parcelable[] arr_parcelable = (Parcelable[])object1;
                    for(int v = 0; v < arr_parcelable.length; ++v) {
                        Parcelable parcelable0 = arr_parcelable[v];
                        if(parcelable0 instanceof Bundle) {
                            arrayList0.add(zzkv.u(((Bundle)parcelable0), false));
                        }
                    }
                }
                else if(object1 instanceof ArrayList) {
                    ArrayList arrayList1 = (ArrayList)object1;
                    int v1 = arrayList1.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object2 = arrayList1.get(v2);
                        if(object2 instanceof Bundle) {
                            arrayList0.add(zzkv.u(((Bundle)object2), false));
                        }
                    }
                }
                else if(object1 instanceof Bundle) {
                    arrayList0.add(zzkv.u(((Bundle)object1), false));
                }
                hashMap0.put(s, arrayList0);
            }
        }
        return hashMap0;
    }

    public final void v(zzgl zzgl0, Object object0) {
        Preconditions.checkNotNull(object0);
        zzgl0.zzc();
        zzgl0.zzb();
        zzgl0.zza();
        if(object0 instanceof String) {
            zzgl0.zzh(((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            zzgl0.zze(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            zzgl0.zzd(((double)(((Double)object0))));
            return;
        }
        this.zzt.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", object0);
    }

    public static boolean w(int v, List list0) {
        return v < list0.size() * 0x40 && (1L << v % 0x40 & ((long)(((Long)list0.get(v / 0x40))))) != 0L;
    }

    public final boolean x(long v, long v1) {
        return v == 0L || v1 <= 0L || Math.abs(this.zzt.zzav().currentTimeMillis() - v) > v1;
    }

    public static boolean y(String s) [...] // 潜在的解密器

    public final byte[] z(byte[] arr_b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
            gZIPOutputStream0.write(arr_b);
            gZIPOutputStream0.close();
            byteArrayOutputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            this.zzt.zzay().zzd().zzb("Failed to gzip content", iOException0);
            throw iOException0;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.m1
    public final boolean zzb() {
        return false;
    }
}

