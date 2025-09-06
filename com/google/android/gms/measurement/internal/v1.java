package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzkf;
import com.google.android.gms.internal.measurement.zznz;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class v1 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final int g;
    public final b h;
    public final zzkf i;

    public v1(b b0, String s, int v, zzkf zzkf0, int v1) {
        this.g = v1;
        this.h = b0;
        super();
        this.a = s;
        this.b = v;
        this.i = zzkf0;
    }

    public boolean a(Long long0, Long long1, zzft zzft0, long v, h h0, boolean z) {
        Boolean boolean1;
        zznz.zzc();
        b b0 = this.h;
        String s = this.a;
        boolean z1 = b0.zzt.zzf().zzs(s, zzdu.zzW);
        zzek zzek0 = (zzek)this.i;
        long v1 = zzek0.zzn() ? h0.e : v;
        boolean z2 = Log.isLoggable(b0.zzt.zzay().zzq(), 2);
        int v2 = this.b;
        if(z2) {
            b0.zzt.zzay().zzj().zzd("Evaluating filter. audience, filter, event", v2, (zzek0.zzp() ? zzek0.zzb() : null), b0.zzt.zzj().zzd(""));
            zzef zzef0 = b0.zzt.zzay().zzj();
            zzkv zzkv0 = b0.zzf.zzu();
            zzkv0.getClass();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("\nevent_filter {\n");
            if(zzek0.zzp()) {
                zzkv.h(stringBuilder0, 0, "filter_id", zzek0.zzb());
            }
            zzkv.h(stringBuilder0, 0, "event_name", zzkv0.zzt.zzj().zzd(""));
            String s1 = zzkv.f(zzek0.zzk(), zzek0.zzm(), zzek0.zzn());
            if(!s1.isEmpty()) {
                zzkv.h(stringBuilder0, 0, "filter_type", s1);
            }
            if(zzek0.zzo()) {
                zzkv.i(stringBuilder0, 1, "event_count_filter", zzek0.zzf());
            }
            if(zzek0.zza() > 0) {
                stringBuilder0.append("  filters {\n");
                for(Object object0: zzek0.zzh()) {
                    zzkv0.d(stringBuilder0, 2, ((zzem)object0));
                }
            }
            zzkv.e(1, stringBuilder0);
            stringBuilder0.append("}\n}\n");
            zzef0.zzb("Filter definition", stringBuilder0.toString());
        }
        if(zzek0.zzp() && zzek0.zzb() <= 0x100) {
            boolean z3 = zzek0.zzk() || zzek0.zzm() || zzek0.zzn();
            if(z && !z3) {
                b0.zzt.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", v2, (zzek0.zzp() ? zzek0.zzb() : null));
                return true;
            }
            if(zzek0.zzo()) {
                Boolean boolean0 = v1.e(v1, zzek0.zzf());
                if(boolean0 == null) {
                    boolean1 = null;
                }
                else {
                    if(!boolean0.booleanValue()) {
                        boolean1 = Boolean.FALSE;
                        goto label_76;
                    }
                    goto label_44;
                }
            }
            else {
            label_44:
                HashSet hashSet0 = new HashSet();
                Iterator iterator1 = zzek0.zzh().iterator();
                if(iterator1.hasNext()) {
                    iterator1.next();
                    b0.zzt.zzay().zzk().zzb("null or empty param name in filter. event", b0.zzt.zzj().zzd(""));
                }
                else {
                    ArrayMap arrayMap0 = new ArrayMap();
                    Iterator iterator2 = zzft0.zzi().iterator();
                    while(true) {
                        if(!iterator2.hasNext()) {
                            goto label_68;
                        }
                        Object object1 = iterator2.next();
                        zzfx zzfx0 = (zzfx)object1;
                        if(!hashSet0.contains("")) {
                        }
                        else if(zzfx0.zzw()) {
                            arrayMap0.put("", (zzfx0.zzw() ? zzfx0.zzd() : null));
                        }
                        else if(zzfx0.zzu()) {
                            arrayMap0.put("", (zzfx0.zzu() ? zzfx0.zza() : null));
                        }
                        else {
                            if(!zzfx0.zzy()) {
                                b0.zzt.zzay().zzk().zzc("Unknown value for param. event, param", b0.zzt.zzj().zzd(""), b0.zzt.zzj().zze(""));
                                break;
                            }
                            arrayMap0.put("", "");
                        }
                    }
                }
                boolean1 = null;
                goto label_76;
            label_68:
                Iterator iterator3 = zzek0.zzh().iterator();
                if(iterator3.hasNext()) {
                    Object object2 = iterator3.next();
                    boolean z4 = !((zzem)object2).zzh() || !((zzem)object2).zzg();
                    b0.zzt.zzay().zzk().zzb("Event has empty param name. event", b0.zzt.zzj().zzd(""));
                    boolean1 = null;
                }
                else {
                    boolean1 = Boolean.TRUE;
                }
            }
        label_76:
            zzef zzef1 = b0.zzt.zzay().zzj();
            String s2 = boolean1 == null ? "null" : boolean1;
            zzef1.zzb("Event filter result", s2);
            if(boolean1 == null) {
                return false;
            }
            this.c = Boolean.TRUE;
            if(!boolean1.booleanValue()) {
                return true;
            }
            this.d = Boolean.TRUE;
            if(z3 && zzft0.zzu()) {
                Long long2 = zzft0.zzd();
                if(zzek0.zzm()) {
                    if(z1 && zzek0.zzo()) {
                        long2 = long0;
                    }
                    this.f = long2;
                    return true;
                }
                if(z1 && zzek0.zzo()) {
                    long2 = long1;
                }
                this.e = long2;
            }
            return true;
        }
        b0.zzt.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzeh.zzn(s), String.valueOf((zzek0.zzp() ? zzek0.zzb() : null)));
        return false;
    }

    public boolean b(Long long0, Long long1, zzgm zzgm0, boolean z) {
        zznz.zzc();
        b b0 = this.h;
        boolean z1 = b0.zzt.zzf().zzs(this.a, zzdu.zzU);
        zzet zzet0 = (zzet)this.i;
        boolean z2 = zzet0.zzi();
        boolean z3 = zzet0.zzg() || zzet0.zzh() || z2;
        Integer integer0 = null;
        if(z && !z3) {
            zzef zzef0 = b0.zzt.zzay().zzj();
            Integer integer1 = this.b;
            if(zzet0.zzj()) {
                integer0 = zzet0.zza();
            }
            zzef0.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", integer1, integer0);
            return true;
        }
        zzem zzem0 = zzet0.zzb();
        boolean z4 = zzem0.zzg();
        if(!zzgm0.zzr()) {
            if(!zzgm0.zzq()) {
                if(!zzgm0.zzt()) {
                    b0.zzt.zzay().zzk().zzb("User property has no value, property", b0.zzt.zzj().zzf(""));
                }
                else if(zzem0.zzk()) {
                    integer0 = v1.f(v1.d("", zzem0.zzd(), b0.zzt.zzay()), z4);
                }
                else if(!zzem0.zzi()) {
                    b0.zzt.zzay().zzk().zzb("No string or number filter defined. property", b0.zzt.zzj().zzf(""));
                }
                else {
                    b0.zzt.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", b0.zzt.zzj().zzf(""), "");
                }
            }
            else if(!zzem0.zzi()) {
                b0.zzt.zzay().zzk().zzb("No number filter for double property. property", b0.zzt.zzj().zzf(""));
            }
            else {
                double f = zzgm0.zza();
                zzer zzer0 = zzem0.zzc();
                try {
                    integer0 = v1.c(new BigDecimal(f), zzer0, Math.ulp(f));
                }
                catch(NumberFormatException unused_ex) {
                }
                integer0 = v1.f(((Boolean)integer0), z4);
            }
        }
        else if(!zzem0.zzi()) {
            b0.zzt.zzay().zzk().zzb("No number filter for long property. property", b0.zzt.zzj().zzf(""));
        }
        else {
            integer0 = v1.f(v1.e(zzgm0.zzb(), zzem0.zzc()), z4);
        }
        zzef zzef1 = b0.zzt.zzay().zzj();
        String s = integer0 == null ? "null" : integer0;
        zzef1.zzb("Property filter result", s);
        if(integer0 == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if(z2 && !((Boolean)integer0).booleanValue()) {
            return true;
        }
        if(!z || zzet0.zzg()) {
            this.d = integer0;
        }
        if(((Boolean)integer0).booleanValue() && z3 && zzgm0.zzs()) {
            long v = long0 == null ? zzgm0.zzc() : ((long)long0);
            if(z1 && zzet0.zzg() && !zzet0.zzh() && long1 != null) {
                v = (long)long1;
            }
            if(zzet0.zzh()) {
                this.f = v;
                return true;
            }
            this.e = v;
        }
        return true;
    }

    public static Boolean c(BigDecimal bigDecimal0, zzer zzer0, double f) {
        boolean z = true;
        Preconditions.checkNotNull(zzer0);
        if(zzer0.zzg()) {
            switch(zzer0.zzm()) {
                case 1: {
                    break;
                }
                case 5: {
                    if(!zzer0.zzk() || !zzer0.zzj()) {
                        return null;
                    }
                label_8:
                    int v = zzer0.zzm();
                    if(zzer0.zzm() == 5 && false) {
                        try {
                            BigDecimal bigDecimal1 = new BigDecimal("");
                            BigDecimal bigDecimal2 = new BigDecimal("");
                            if(v == 5) {
                                goto label_13;
                            }
                        }
                        catch(NumberFormatException unused_ex) {
                        }
                        return null;
                    label_13:
                        if(bigDecimal0.compareTo(bigDecimal1) < 0 || bigDecimal0.compareTo(bigDecimal2) > 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    return null;
                }
                default: {
                    if(!zzer0.zzh()) {
                        return null;
                    }
                    goto label_8;
                }
            }
        }
        return null;
    }

    public static Boolean d(String s, zzey zzey0, zzeh zzeh0) {
        List list0;
        Preconditions.checkNotNull(zzey0);
        if(s == null) {
            return null;
        }
        if(zzey0.zzi() && zzey0.zzj() != 1) {
            if(zzey0.zzj() == 7) {
                if(zzey0.zza() == 0) {
                    return null;
                }
            }
            else if(!zzey0.zzh()) {
                return null;
            }
            int v = zzey0.zzj();
            boolean z = zzey0.zzf();
            if(zzey0.zza() == 0) {
                list0 = null;
            }
            else {
                list0 = zzey0.zze();
                if(!z) {
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        arrayList0.add(((String)object0).toUpperCase(Locale.ENGLISH));
                    }
                    list0 = Collections.unmodifiableList(arrayList0);
                }
            }
            String s1 = v == 2 ? "" : null;
            if(v != 7 || list0 != null && !list0.isEmpty()) {
                if(!z && v != 2) {
                    s = s.toUpperCase(Locale.ENGLISH);
                }
                switch(v - 1) {
                    case 1: {
                        if(s1 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(s1, (z ? 0 : 66)).matcher(s).matches());
                            }
                            catch(PatternSyntaxException unused_ex) {
                                if(zzeh0 != null) {
                                    zzeh0.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", s1);
                                }
                            }
                        }
                        break;
                    }
                    case 2: {
                        return Boolean.valueOf(s.startsWith(""));
                    }
                    case 3: {
                        return Boolean.valueOf(s.endsWith(""));
                    }
                    case 4: {
                        return Boolean.valueOf(s.contains(""));
                    }
                    case 5: {
                        return Boolean.valueOf(s.equals(""));
                    }
                    case 6: {
                        return list0 == null ? null : Boolean.valueOf(list0.contains(s));
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static Boolean e(long v, zzer zzer0) {
        try {
            return v1.c(new BigDecimal(v), zzer0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public static Boolean f(Boolean boolean0, boolean z) {
        if(boolean0 == null) {
            return null;
        }
        return boolean0.booleanValue() == z ? false : true;
    }
}

