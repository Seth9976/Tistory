package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzbb {
    public static zzae a(zzae zzae0, zzg zzg0, zzao zzao0, Boolean boolean0, Boolean boolean1) {
        zzae zzae1 = new zzae();
        Iterator iterator0 = zzae0.zzk();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            int v = (int)(((Integer)object0));
            if(zzae0.zzs(v)) {
                zzap zzap0 = zzao0.zza(zzg0, Arrays.asList(new zzap[]{zzae0.zze(v), new zzah(((double)v)), zzae0}));
                if(zzap0.zzg().equals(boolean0)) {
                    return zzae1;
                }
                if(boolean1 == null || zzap0.zzg().equals(boolean1)) {
                    zzae1.zzq(v, zzap0);
                }
            }
        }
        return zzae1;
    }

    public static zzap b(zzae zzae0, zzg zzg0, List list0, boolean z) {
        zzap zzap1;
        int v = -1;
        zzh.zzi("reduce", 1, list0);
        zzh.zzj("reduce", 2, list0);
        zzap zzap0 = zzg0.zzb(((zzap)list0.get(0)));
        if(!(zzap0 instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if(list0.size() == 2) {
            zzap1 = zzg0.zzb(((zzap)list0.get(1)));
            if(zzap1 instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        }
        else {
            if(zzae0.zzc() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzap1 = null;
        }
        int v1 = zzae0.zzc();
        int v2 = z ? 0 : v1 - 1;
        if(z) {
            v = 1;
        }
        if(zzap1 == null) {
            zzap1 = zzae0.zze(v2);
            v2 += v;
        }
        while(((z ? v1 - 1 : 0) - v2) * v >= 0) {
            if(zzae0.zzs(v2)) {
                zzap1 = ((zzai)zzap0).zza(zzg0, Arrays.asList(new zzap[]{zzap1, zzae0.zze(v2), new zzah(((double)v2)), zzae0}));
                if(zzap1 instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
            }
            v2 += v;
        }
        return zzap1;
    }

    public static zzap zza(String s, zzae zzae0, zzg zzg0, List list0) {
        double f;
        int v;
        switch(s) {
            case "concat": {
                v = 0;
                break;
            }
            case "every": {
                v = 1;
                break;
            }
            case "filter": {
                v = 2;
                break;
            }
            case "forEach": {
                v = 3;
                break;
            }
            case "indexOf": {
                v = 4;
                break;
            }
            case "join": {
                v = 5;
                break;
            }
            case "lastIndexOf": {
                v = 6;
                break;
            }
            case "map": {
                v = 7;
                break;
            }
            case "pop": {
                v = 8;
                break;
            }
            case "push": {
                v = 9;
                break;
            }
            case "reduce": {
                v = 10;
                break;
            }
            case "reduceRight": {
                v = 11;
                break;
            }
            case "reverse": {
                v = 12;
                break;
            }
            case "shift": {
                v = 13;
                break;
            }
            case "slice": {
                v = 14;
                break;
            }
            case "some": {
                v = 15;
                break;
            }
            case "sort": {
                v = 16;
                break;
            }
            case "splice": {
                v = 17;
                break;
            }
            case "toString": {
                v = 18;
                break;
            }
            case "unshift": {
                v = 19;
                break;
            }
            default: {
                v = -1;
            }
        }
        String s1 = ",";
        zzai zzai0 = null;
        switch(v) {
            case 0: {
                zzap zzap0 = zzae0.zzd();
                if(!list0.isEmpty()) {
                    for(Object object0: list0) {
                        zzap zzap1 = zzg0.zzb(((zzap)object0));
                        if(zzap1 instanceof zzag) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int v1 = ((zzae)zzap0).zzc();
                        if(zzap1 instanceof zzae) {
                            zzae zzae1 = (zzae)zzap1;
                            Iterator iterator1 = zzae1.zzk();
                            while(iterator1.hasNext()) {
                                Object object1 = iterator1.next();
                                ((zzae)zzap0).zzq(((int)(((Integer)object1))) + v1, zzae1.zze(((int)(((Integer)object1)))));
                            }
                        }
                        else {
                            ((zzae)zzap0).zzq(v1, zzap1);
                        }
                    }
                }
                return zzap0;
            }
            case 1: {
                zzh.zzh("every", 1, list0);
                zzap zzap2 = zzg0.zzb(((zzap)list0.get(0)));
                if(!(zzap2 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(zzae0.zzc() == 0) {
                    return zzap.zzk;
                }
                return zzbb.a(zzae0, zzg0, ((zzao)zzap2), Boolean.FALSE, Boolean.TRUE).zzc() == zzae0.zzc() ? zzap.zzk : zzap.zzl;
            }
            case 2: {
                zzh.zzh("filter", 1, list0);
                zzap zzap3 = zzg0.zzb(((zzap)list0.get(0)));
                if(!(zzap3 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(zzae0.zzb() == 0) {
                    return new zzae();
                }
                zzap zzap4 = zzae0.zzd();
                zzae zzae2 = zzbb.a(zzae0, zzg0, ((zzao)zzap3), null, Boolean.TRUE);
                zzae zzae3 = new zzae();
                Iterator iterator2 = zzae2.zzk();
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    zzap zzap5 = ((zzae)zzap4).zze(((int)(((Integer)object2))));
                    zzae3.zzq(zzae3.zzc(), zzap5);
                }
                return zzae3;
            }
            case 3: {
                zzh.zzh("forEach", 1, list0);
                zzap zzap6 = zzg0.zzb(((zzap)list0.get(0)));
                if(!(zzap6 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(zzae0.zzb() == 0) {
                    return zzap.zzf;
                }
                zzbb.a(zzae0, zzg0, ((zzao)zzap6), null, null);
                return zzap.zzf;
            }
            case 4: {
                zzh.zzj("indexOf", 2, list0);
                zzap zzap7 = list0.isEmpty() ? zzap.zzf : zzg0.zzb(((zzap)list0.get(0)));
                if(list0.size() > 1) {
                    f = zzh.zza(((double)zzg0.zzb(((zzap)list0.get(1))).zzh()));
                    if(f >= ((double)zzae0.zzc())) {
                        return new zzah(-1.0);
                    }
                    if(f < 0.0) {
                        f += (double)zzae0.zzc();
                    }
                }
                else {
                    f = 0.0;
                }
                Iterator iterator3 = zzae0.zzk();
                while(iterator3.hasNext()) {
                    Object object3 = iterator3.next();
                    int v2 = (int)(((Integer)object3));
                    double f1 = (double)v2;
                    if(f1 >= f && zzh.zzl(zzae0.zze(v2), zzap7)) {
                        return new zzah(f1);
                    }
                    if(false) {
                        break;
                    }
                }
                return new zzah(-1.0);
            }
            case 5: {
                zzh.zzj("join", 1, list0);
                if(zzae0.zzc() == 0) {
                    return zzap.zzm;
                }
                if(!list0.isEmpty()) {
                    zzap zzap8 = zzg0.zzb(((zzap)list0.get(0)));
                    if(!(zzap8 instanceof zzan) && !(zzap8 instanceof zzau)) {
                        return new zzat(zzae0.zzj(zzap8.zzi()));
                    }
                    s1 = "";
                }
                return new zzat(zzae0.zzj(s1));
            }
            case 6: {
                zzh.zzj("lastIndexOf", 2, list0);
                zzap zzap9 = list0.isEmpty() ? zzap.zzf : zzg0.zzb(((zzap)list0.get(0)));
                double f2 = (double)(zzae0.zzc() - 1);
                if(list0.size() > 1) {
                    zzap zzap10 = zzg0.zzb(((zzap)list0.get(1)));
                    f2 = Double.isNaN(((double)zzap10.zzh())) ? ((double)(zzae0.zzc() - 1)) : zzh.zza(((double)zzap10.zzh()));
                    if(f2 < 0.0) {
                        f2 += (double)zzae0.zzc();
                    }
                }
                if(f2 < 0.0) {
                    return new zzah(-1.0);
                }
                for(int v3 = (int)Math.min(zzae0.zzc(), f2); v3 >= 0; --v3) {
                    if(zzae0.zzs(v3) && zzh.zzl(zzae0.zze(v3), zzap9)) {
                        return new zzah(((double)v3));
                    }
                }
                return new zzah(-1.0);
            }
            case 7: {
                zzh.zzh("map", 1, list0);
                zzap zzap11 = zzg0.zzb(((zzap)list0.get(0)));
                if(!(zzap11 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                return zzae0.zzc() == 0 ? new zzae() : zzbb.a(zzae0, zzg0, ((zzao)zzap11), null, null);
            }
            case 8: {
                zzh.zzh("pop", 0, list0);
                int v4 = zzae0.zzc();
                if(v4 == 0) {
                    return zzap.zzf;
                }
                zzap zzap12 = zzae0.zze(v4 - 1);
                zzae0.zzp(v4 - 1);
                return zzap12;
            }
            case 9: {
                if(!list0.isEmpty()) {
                    for(Object object4: list0) {
                        zzap zzap13 = zzg0.zzb(((zzap)object4));
                        zzae0.zzq(zzae0.zzc(), zzap13);
                    }
                }
                return new zzah(((double)zzae0.zzc()));
            }
            case 10: {
                return zzbb.b(zzae0, zzg0, list0, true);
            }
            case 11: {
                return zzbb.b(zzae0, zzg0, list0, false);
            }
            case 12: {
                zzh.zzh("reverse", 0, list0);
                int v5 = zzae0.zzc();
                if(v5 != 0) {
                    for(int v6 = 0; v6 < v5 / 2; ++v6) {
                        if(zzae0.zzs(v6)) {
                            zzap zzap14 = zzae0.zze(v6);
                            zzae0.zzq(v6, null);
                            int v7 = v5 - 1 - v6;
                            if(zzae0.zzs(v7)) {
                                zzae0.zzq(v6, zzae0.zze(v7));
                            }
                            zzae0.zzq(v7, zzap14);
                        }
                    }
                }
                return zzae0;
            }
            case 13: {
                zzh.zzh("shift", 0, list0);
                if(zzae0.zzc() == 0) {
                    return zzap.zzf;
                }
                zzap zzap15 = zzae0.zze(0);
                zzae0.zzp(0);
                return zzap15;
            }
            case 14: {
                zzh.zzj("slice", 2, list0);
                if(list0.isEmpty()) {
                    return zzae0.zzd();
                }
                double f3 = (double)zzae0.zzc();
                double f4 = zzh.zza(((double)zzg0.zzb(((zzap)list0.get(0))).zzh()));
                double f5 = f4 < 0.0 ? Math.max(f4 + f3, 0.0) : Math.min(f4, f3);
                if(list0.size() == 2) {
                    double f6 = zzh.zza(((double)zzg0.zzb(((zzap)list0.get(1))).zzh()));
                    f3 = f6 < 0.0 ? Math.max(f3 + f6, 0.0) : Math.min(f3, f6);
                }
                zzap zzap16 = new zzae();
                for(int v8 = (int)f5; ((double)v8) < f3; ++v8) {
                    zzap zzap17 = zzae0.zze(v8);
                    ((zzae)zzap16).zzq(((zzae)zzap16).zzc(), zzap17);
                }
                return zzap16;
            }
            case 15: {
                zzh.zzh("some", 1, list0);
                zzap zzap18 = zzg0.zzb(((zzap)list0.get(0)));
                if(!(zzap18 instanceof zzai)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(zzae0.zzc() == 0) {
                    return zzap.zzl;
                }
                Iterator iterator5 = zzae0.zzk();
                while(iterator5.hasNext()) {
                    Object object5 = iterator5.next();
                    int v9 = (int)(((Integer)object5));
                    if(zzae0.zzs(v9) && ((zzai)zzap18).zza(zzg0, Arrays.asList(new zzap[]{zzae0.zze(v9), new zzah(((double)v9)), zzae0})).zzg().booleanValue()) {
                        return zzap.zzk;
                    }
                    if(false) {
                        break;
                    }
                }
                return zzap.zzl;
            }
            case 16: {
                zzh.zzj("sort", 1, list0);
                if(zzae0.zzc() >= 2) {
                    List list1 = zzae0.zzm();
                    if(!list0.isEmpty()) {
                        zzap zzap19 = zzg0.zzb(((zzap)list0.get(0)));
                        if(!(zzap19 instanceof zzai)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzai0 = (zzai)zzap19;
                    }
                    Collections.sort(list1, new d(zzai0, zzg0));
                    zzae0.zzn();
                    int v10 = 0;
                    for(Object object6: list1) {
                        zzae0.zzq(v10, ((zzap)object6));
                        ++v10;
                    }
                }
                return zzae0;
            }
            case 17: {
                if(list0.isEmpty()) {
                    return new zzae();
                }
                int v11 = (int)zzh.zza(((double)zzg0.zzb(((zzap)list0.get(0))).zzh()));
                if(v11 < 0) {
                    v11 = Math.max(0, zzae0.zzc() + v11);
                }
                else if(v11 > zzae0.zzc()) {
                    v11 = zzae0.zzc();
                }
                int v12 = zzae0.zzc();
                zzae zzae4 = new zzae();
                if(list0.size() > 1) {
                    int v13 = Math.max(0, ((int)zzh.zza(((double)zzg0.zzb(((zzap)list0.get(1))).zzh()))));
                    if(v13 > 0) {
                        for(int v14 = v11; v14 < Math.min(v12, v11 + v13); ++v14) {
                            zzap zzap20 = zzae0.zze(v11);
                            zzae4.zzq(zzae4.zzc(), zzap20);
                            zzae0.zzp(v11);
                        }
                    }
                    if(list0.size() > 2) {
                        for(int v15 = 2; v15 < list0.size(); ++v15) {
                            zzap zzap21 = zzg0.zzb(((zzap)list0.get(v15)));
                            if(zzap21 instanceof zzag) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzae0.zzo(v11 + v15 - 2, zzap21);
                        }
                    }
                }
                else {
                    while(v11 < v12) {
                        zzap zzap22 = zzae0.zze(v11);
                        zzae4.zzq(zzae4.zzc(), zzap22);
                        zzae0.zzq(v11, null);
                        ++v11;
                    }
                }
                return zzae4;
            }
            case 18: {
                zzh.zzh("toString", 0, list0);
                return new zzat("");
            }
            case 19: {
                if(!list0.isEmpty()) {
                    zzae zzae5 = new zzae();
                    for(Object object7: list0) {
                        zzap zzap23 = zzg0.zzb(((zzap)object7));
                        if(zzap23 instanceof zzag) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzae5.zzq(zzae5.zzc(), zzap23);
                    }
                    int v16 = zzae5.zzc();
                    Iterator iterator8 = zzae0.zzk();
                    while(iterator8.hasNext()) {
                        Object object8 = iterator8.next();
                        zzae5.zzq(((int)(((Integer)object8))) + v16, zzae0.zze(((int)(((Integer)object8)))));
                    }
                    zzae0.zzn();
                    Iterator iterator9 = zzae5.zzk();
                    while(iterator9.hasNext()) {
                        Object object9 = iterator9.next();
                        zzae0.zzq(((int)(((Integer)object9))), zzae5.zze(((int)(((Integer)object9)))));
                    }
                }
                return new zzah(((double)zzae0.zzc()));
            }
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
        }
    }
}

