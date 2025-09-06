package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.util.Iterator;
import java.util.List;

public final class zzbh extends zzaw {
    public zzbh() {
        this.a.add(zzbl.zzA);
        this.a.add(zzbl.zzB);
        this.a.add(zzbl.zzC);
        this.a.add(zzbl.zzD);
        this.a.add(zzbl.zzE);
        this.a.add(zzbl.zzF);
        this.a.add(zzbl.zzG);
        this.a.add(zzbl.zzan);
    }

    public static zzap b(zzbf zzbf0, zzap zzap0, zzap zzap1) {
        if(!(zzap0 instanceof Iterable)) {
            throw new IllegalArgumentException("Non-iterable type in for...of loop.");
        }
        Iterator iterator0 = ((Iterable)zzap0).iterator();
        if(iterator0 != null) {
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzap zzap2 = zzbf0.zza(((zzap)object0)).zzc(((zzae)zzap1));
                if(zzap2 instanceof zzag) {
                    if("break".equals(((zzag)zzap2).zzc())) {
                        return zzap.zzf;
                    }
                    if("return".equals(((zzag)zzap2).zzc())) {
                        return (zzag)zzap2;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String s, zzg zzg0, List list0) {
        zzap zzap25;
        int v = zzh.zze(s).ordinal();
        if(v != 65) {
            switch(v) {
                case 26: {
                    if(!(a.f(zzbl.zzA, 3, list0, 0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    }
                    String s1 = ((zzap)list0.get(0)).zzi();
                    zzap zzap0 = zzg0.zzb(((zzap)list0.get(1)));
                    zzap zzap1 = zzg0.zzb(((zzap)list0.get(2)));
                    Iterator iterator0 = zzap0.zzl();
                    if(iterator0 != null) {
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            zzg0.zze(s1, ((zzap)object0));
                            zzap zzap2 = zzg0.zzc(((zzae)zzap1));
                            if(zzap2 instanceof zzag) {
                                if("break".equals(((zzag)zzap2).zzc())) {
                                    return zzap.zzf;
                                }
                                if("return".equals(((zzag)zzap2).zzc())) {
                                    return (zzag)zzap2;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                    }
                    return zzap.zzf;
                }
                case 27: {
                    if(!(a.f(zzbl.zzB, 3, list0, 0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    }
                    String s2 = ((zzap)list0.get(0)).zzi();
                    zzap zzap3 = zzg0.zzb(((zzap)list0.get(1)));
                    zzap zzap4 = zzg0.zzb(((zzap)list0.get(2)));
                    Iterator iterator1 = zzap3.zzl();
                    if(iterator1 != null) {
                        while(iterator1.hasNext()) {
                            Object object1 = iterator1.next();
                            zzg zzg1 = zzg0.zza();
                            zzg1.zzf(s2, ((zzap)object1));
                            zzap zzap5 = zzg1.zzc(((zzae)zzap4));
                            if(zzap5 instanceof zzag) {
                                if("break".equals(((zzag)zzap5).zzc())) {
                                    return zzap.zzf;
                                }
                                if("return".equals(((zzag)zzap5).zzc())) {
                                    return (zzag)zzap5;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                    }
                    return zzap.zzf;
                }
                case 28: {
                    if(!(a.f(zzbl.zzC, 3, list0, 0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    }
                    String s3 = ((zzap)list0.get(0)).zzi();
                    zzap zzap6 = zzg0.zzb(((zzap)list0.get(1)));
                    zzap zzap7 = zzg0.zzb(((zzap)list0.get(2)));
                    Iterator iterator2 = zzap6.zzl();
                    if(iterator2 != null) {
                        while(iterator2.hasNext()) {
                            Object object2 = iterator2.next();
                            zzg zzg2 = zzg0.zza();
                            zzg2.zze(s3, ((zzap)object2));
                            zzap zzap8 = zzg2.zzc(((zzae)zzap7));
                            if(zzap8 instanceof zzag) {
                                if("break".equals(((zzag)zzap8).zzc())) {
                                    return zzap.zzf;
                                }
                                if("return".equals(((zzag)zzap8).zzc())) {
                                    return (zzag)zzap8;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                    }
                    return zzap.zzf;
                }
                case 29: {
                    zzap zzap9 = zzg0.zzb(((zzap)a.f(zzbl.zzD, 4, list0, 0)));
                    if(!(zzap9 instanceof zzae)) {
                        throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                    }
                    zzap zzap10 = (zzap)list0.get(1);
                    zzap zzap11 = (zzap)list0.get(2);
                    zzap zzap12 = zzg0.zzb(((zzap)list0.get(3)));
                    zzg zzg3 = zzg0.zza();
                    for(int v1 = 0; v1 < ((zzae)zzap9).zzc(); ++v1) {
                        String s4 = ((zzae)zzap9).zze(v1).zzi();
                        zzg3.zzg(s4, zzg0.zzd(s4));
                    }
                    while(zzg0.zzb(zzap10).zzg().booleanValue()) {
                        zzap zzap13 = zzg0.zzc(((zzae)zzap12));
                        if(zzap13 instanceof zzag) {
                            if("break".equals(((zzag)zzap13).zzc())) {
                                return zzap.zzf;
                            }
                            if("return".equals(((zzag)zzap13).zzc())) {
                                return (zzag)zzap13;
                            }
                        }
                        zzg zzg4 = zzg0.zza();
                        for(int v2 = 0; v2 < ((zzae)zzap9).zzc(); ++v2) {
                            String s5 = ((zzae)zzap9).zze(v2).zzi();
                            zzg4.zzg(s5, zzg3.zzd(s5));
                        }
                        zzg4.zzb(zzap11);
                        zzg3 = zzg4;
                    }
                    return zzap.zzf;
                }
                case 30: {
                    if(!(a.f(zzbl.zzE, 3, list0, 0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    }
                    String s6 = ((zzap)list0.get(0)).zzi();
                    zzap zzap14 = zzg0.zzb(((zzap)list0.get(1)));
                    zzap zzap15 = zzg0.zzb(((zzap)list0.get(2)));
                    return zzbh.b(new e(zzg0, s6, 2), zzap14, zzap15);
                }
                case 0x1F: {
                    if(!(a.f(zzbl.zzF, 3, list0, 0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    }
                    String s7 = ((zzap)list0.get(0)).zzi();
                    zzap zzap16 = zzg0.zzb(((zzap)list0.get(1)));
                    zzap zzap17 = zzg0.zzb(((zzap)list0.get(2)));
                    return zzbh.b(new e(zzg0, s7, 0), zzap16, zzap17);
                }
                case 0x20: {
                    if(!(a.f(zzbl.zzG, 3, list0, 0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    }
                    String s8 = ((zzap)list0.get(0)).zzi();
                    zzap zzap18 = zzg0.zzb(((zzap)list0.get(1)));
                    zzap zzap19 = zzg0.zzb(((zzap)list0.get(2)));
                    return zzbh.b(new e(zzg0, s8, 1), zzap18, zzap19);
                }
                default: {
                    this.a(s);
                    throw null;
                }
            }
        }
        zzap zzap20 = (zzap)a.f(zzbl.zzan, 4, list0, 0);
        zzap zzap21 = (zzap)list0.get(1);
        zzap zzap22 = (zzap)list0.get(2);
        zzap zzap23 = zzg0.zzb(((zzap)list0.get(3)));
        if(zzg0.zzb(zzap22).zzg().booleanValue()) {
            zzap zzap24 = zzg0.zzc(((zzae)zzap23));
            if(zzap24 instanceof zzag) {
                zzap25 = (zzag)zzap24;
                if("break".equals(((zzag)zzap25).zzc())) {
                    return zzap.zzf;
                }
                if(!"return".equals(((zzag)zzap25).zzc())) {
                    goto label_121;
                }
                return zzap25;
            }
        }
    label_121:
        while(zzg0.zzb(zzap20).zzg().booleanValue()) {
            zzap zzap26 = zzg0.zzc(((zzae)zzap23));
            if(zzap26 instanceof zzag) {
                zzap25 = (zzag)zzap26;
                if("break".equals(((zzag)zzap25).zzc())) {
                    return zzap.zzf;
                }
                if("return".equals(((zzag)zzap25).zzc())) {
                    return zzap25;
                }
            }
            zzg0.zzb(zzap21);
        }
        return zzap.zzf;
    }
}

