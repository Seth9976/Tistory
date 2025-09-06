package com.google.android.gms.internal.measurement;

import a5.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.a;

public final class zzat implements zzap, Iterable {
    public final String a;

    public zzat(String s) {
        if(s == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzat ? this.a.equals(((zzat)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new c(this, 1);
    }

    @Override
    public final String toString() {
        return a.o(new StringBuilder("\""), this.a, "\"");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String s, zzg zzg0, List list0) {
        int v4;
        int v3;
        int v;
        if(!"charAt".equals(s) && !"concat".equals(s) && !"hasOwnProperty".equals(s) && !"indexOf".equals(s) && !"lastIndexOf".equals(s) && !"match".equals(s) && !"replace".equals(s) && !"search".equals(s) && !"slice".equals(s) && !"split".equals(s) && !"substring".equals(s) && !"toLowerCase".equals(s) && !"toLocaleLowerCase".equals(s) && !"toString".equals(s) && !"toUpperCase".equals(s) && !"toLocaleUpperCase".equals(s) && !"trim".equals(s)) {
            throw new IllegalArgumentException(s + " is not a String function");
        }
        switch(s) {
            case "charAt": {
                v = 0;
                break;
            }
            case "concat": {
                v = 1;
                break;
            }
            case "hasOwnProperty": {
                v = 2;
                break;
            }
            case "indexOf": {
                v = 3;
                break;
            }
            case "lastIndexOf": {
                v = 4;
                break;
            }
            case "match": {
                v = 5;
                break;
            }
            case "replace": {
                v = 6;
                break;
            }
            case "search": {
                v = 7;
                break;
            }
            case "slice": {
                v = 8;
                break;
            }
            case "split": {
                v = 9;
                break;
            }
            case "substring": {
                v = 10;
                break;
            }
            case "toLocaleLowerCase": {
                v = 12;
                break;
            }
            case "toLocaleUpperCase": {
                v = 11;
                break;
            }
            case "toLowerCase": {
                v = 13;
                break;
            }
            case "toString": {
                v = 14;
                break;
            }
            case "toUpperCase": {
                v = 15;
                break;
            }
            case "trim": {
                v = 16;
                break;
            }
            default: {
                v = -1;
            }
        }
        String s1 = "undefined";
        String s2 = this.a;
        switch(v) {
            case 0: {
                zzh.zzj("charAt", 1, list0);
                int v1 = list0.isEmpty() ? 0 : ((int)zzh.zza(((double)zzg0.zzb(((zzap)list0.get(0))).zzh())));
                return v1 >= 0 && v1 < s2.length() ? new zzat(String.valueOf(s2.charAt(v1))) : zzap.zzm;
            }
            case 1: {
                if(!list0.isEmpty()) {
                    StringBuilder stringBuilder0 = new StringBuilder(s2);
                    for(int v7 = 0; v7 < list0.size(); ++v7) {
                        stringBuilder0.append(zzg0.zzb(((zzap)list0.get(v7))).zzi());
                    }
                    return new zzat(stringBuilder0.toString());
                }
                break;
            }
            case 2: {
                zzh.zzh("hasOwnProperty", 1, list0);
                zzap zzap0 = zzg0.zzb(((zzap)list0.get(0)));
                if("length".equals(zzap0.zzi())) {
                    return zzap.zzk;
                }
                double f = (double)zzap0.zzh();
                return f != Math.floor(f) || ((int)f) < 0 || ((int)f) >= s2.length() ? zzap.zzl : zzap.zzk;
            }
            case 3: {
                zzh.zzj("indexOf", 2, list0);
                if(list0.size() > 0) {
                    s1 = zzg0.zzb(((zzap)list0.get(0))).zzi();
                }
                return list0.size() >= 2 ? new zzah(((double)s2.indexOf(s1, ((int)zzh.zza(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())))))) : new zzah(((double)s2.indexOf(s1, ((int)zzh.zza(0.0)))));
            }
            case 4: {
                zzh.zzj("lastIndexOf", 2, list0);
                if(list0.size() > 0) {
                    s1 = zzg0.zzb(((zzap)list0.get(0))).zzi();
                }
                double f1 = list0.size() >= 2 ? ((double)zzg0.zzb(((zzap)list0.get(1))).zzh()) : NaN;
                return Double.isNaN(f1) ? new zzah(((double)s2.lastIndexOf(s1, 0x7FFFFFFF))) : new zzah(((double)s2.lastIndexOf(s1, ((int)zzh.zza(f1)))));
            }
            case 5: {
                zzh.zzj("match", 1, list0);
                Matcher matcher0 = Pattern.compile((list0.size() > 0 ? zzg0.zzb(((zzap)list0.get(0))).zzi() : "")).matcher(s2);
                return matcher0.find() ? new zzae(Arrays.asList(new zzap[]{new zzat(matcher0.group())})) : zzap.zzg;
            }
            case 6: {
                zzh.zzj("replace", 2, list0);
                zzap zzap1 = zzap.zzf;
                if(!list0.isEmpty()) {
                    s1 = zzg0.zzb(((zzap)list0.get(0))).zzi();
                    if(list0.size() > 1) {
                        zzap1 = zzg0.zzb(((zzap)list0.get(1)));
                    }
                }
                int v8 = s2.indexOf(s1);
                if(v8 >= 0) {
                    if(zzap1 instanceof zzai) {
                        zzap1 = ((zzai)zzap1).zza(zzg0, Arrays.asList(new zzap[]{new zzat(s1), new zzah(((double)v8)), this}));
                    }
                    return new zzat(b.m(s2.substring(0, v8), zzap1.zzi(), s2.substring(s1.length() + v8)));
                }
                break;
            }
            case 7: {
                zzh.zzj("search", 1, list0);
                if(!list0.isEmpty()) {
                    s1 = zzg0.zzb(((zzap)list0.get(0))).zzi();
                }
                Matcher matcher1 = Pattern.compile(s1).matcher(s2);
                return matcher1.find() ? new zzah(((double)matcher1.start())) : new zzah(-1.0);
            }
            case 8: {
                zzh.zzj("slice", 2, list0);
                double f2 = zzh.zza((list0.isEmpty() ? 0.0 : ((double)zzg0.zzb(((zzap)list0.get(0))).zzh())));
                double f3 = f2 < 0.0 ? Math.max(((double)s2.length()) + f2, 0.0) : Math.min(f2, s2.length());
                double f4 = zzh.zza((list0.size() <= 1 ? ((double)s2.length()) : ((double)zzg0.zzb(((zzap)list0.get(1))).zzh())));
                return f4 < 0.0 ? new zzat(s2.substring(((int)f3), Math.max(0, ((int)Math.max(((double)s2.length()) + f4, 0.0)) - ((int)f3)) + ((int)f3))) : new zzat(s2.substring(((int)f3), Math.max(0, ((int)Math.min(f4, s2.length())) - ((int)f3)) + ((int)f3)));
            }
            case 9: {
                zzh.zzj("split", 2, list0);
                if(s2.length() == 0) {
                    return new zzae(Arrays.asList(new zzap[]{this}));
                }
                ArrayList arrayList0 = new ArrayList();
                if(list0.isEmpty()) {
                    arrayList0.add(this);
                    return new zzae(arrayList0);
                }
                String s3 = zzg0.zzb(((zzap)list0.get(0))).zzi();
                long v2 = list0.size() <= 1 ? 0x7FFFFFFFL : zzh.zzd(((double)zzg0.zzb(((zzap)list0.get(1))).zzh()));
                if(v2 == 0L) {
                    return new zzae();
                }
                String[] arr_s = s2.split(Pattern.quote(s3), ((int)v2) + 1);
                if(!s3.isEmpty() || arr_s.length <= 0) {
                    v4 = arr_s.length;
                    v3 = 0;
                }
                else {
                    v3 = arr_s[0].isEmpty();
                    v4 = arr_s.length - 1;
                    if(!arr_s[v4].isEmpty()) {
                        v4 = arr_s.length;
                    }
                }
                if(((long)arr_s.length) > v2) {
                    --v4;
                }
                while(v3 < v4) {
                    arrayList0.add(new zzat(arr_s[v3]));
                    ++v3;
                }
                return new zzae(arrayList0);
            }
            case 10: {
                zzh.zzj("substring", 2, list0);
                int v5 = Math.min(Math.max((list0.isEmpty() ? 0 : ((int)zzh.zza(((double)zzg0.zzb(((zzap)list0.get(0))).zzh())))), 0), s2.length());
                int v6 = Math.min(Math.max((list0.size() <= 1 ? s2.length() : ((int)zzh.zza(((double)zzg0.zzb(((zzap)list0.get(1))).zzh())))), 0), s2.length());
                return new zzat(s2.substring(Math.min(v5, v6), Math.max(v5, v6)));
            }
            case 11: {
                zzh.zzh("toLocaleUpperCase", 0, list0);
                return new zzat(s2.toUpperCase());
            }
            case 12: {
                zzh.zzh("toLocaleLowerCase", 0, list0);
                return new zzat(s2.toLowerCase());
            }
            case 13: {
                zzh.zzh("toLowerCase", 0, list0);
                return new zzat(s2.toLowerCase(Locale.ENGLISH));
            }
            case 14: {
                zzh.zzh("toString", 0, list0);
                return this;
            }
            case 15: {
                zzh.zzh("toUpperCase", 0, list0);
                return new zzat(s2.toUpperCase(Locale.ENGLISH));
            }
            case 16: {
                zzh.zzh("toUpperCase", 0, list0);
                return new zzat(s2.trim());
            }
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
        }
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        String s = this.a;
        if(s.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(s);
        }
        catch(NumberFormatException unused_ex) {
            return NaN;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new c(this, 0);
    }
}

