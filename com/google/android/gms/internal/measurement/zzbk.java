package com.google.android.gms.internal.measurement;

import a5.b;
import androidx.room.a;
import java.util.List;

public final class zzbk extends zzaw {
    public zzbk() {
        this.a.add(zzbl.zzd);
        this.a.add(zzbl.zzo);
        this.a.add(zzbl.zzr);
        this.a.add(zzbl.zzs);
        this.a.add(zzbl.zzy);
        this.a.add(zzbl.zzH);
        this.a.add(zzbl.zzJ);
        this.a.add(zzbl.zzK);
        this.a.add(zzbl.zzX);
        this.a.add(zzbl.zzag);
        this.a.add(zzbl.zzak);
        this.a.add(zzbl.zzal);
        this.a.add(zzbl.zzam);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String s, zzg zzg0, List list0) {
        int v = 0;
        switch(zzh.zze(s).ordinal()) {
            case 3: {
                zzap zzap0 = zzg0.zzb(((zzap)a.f(zzbl.zzd, 2, list0, 0)));
                if(!(zzap0 instanceof zzat)) {
                    throw new IllegalArgumentException(a.j("Expected string for assign var. got ", zzap0.getClass().getCanonicalName()));
                }
                if(!zzg0.zzh(zzap0.zzi())) {
                    throw new IllegalArgumentException(a.j("Attempting to assign undefined value ", zzap0.zzi()));
                }
                zzap zzap1 = zzg0.zzb(((zzap)list0.get(1)));
                zzg0.zzg(zzap0.zzi(), zzap1);
                return zzap1;
            }
            case 14: {
                zzh.zzi("CONST", 2, list0);
                if(list0.size() % 2 != 0) {
                    throw new IllegalArgumentException("CONST requires an even number of arguments, found " + list0.size());
                }
                while(v < list0.size() - 1) {
                    zzap zzap2 = zzg0.zzb(((zzap)list0.get(v)));
                    if(!(zzap2 instanceof zzat)) {
                        throw new IllegalArgumentException(a.j("Expected string for const name. got ", zzap2.getClass().getCanonicalName()));
                    }
                    zzg0.zzf(zzap2.zzi(), zzg0.zzb(((zzap)list0.get(v + 1))));
                    v += 2;
                }
                return zzap.zzf;
            }
            case 17: {
                if(list0.isEmpty()) {
                    return new zzae();
                }
                zzap zzap3 = new zzae();
                for(Object object0: list0) {
                    zzap zzap4 = zzg0.zzb(((zzap)object0));
                    if(zzap4 instanceof zzag) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    ((zzae)zzap3).zzq(v, zzap4);
                    ++v;
                }
                return zzap3;
            }
            case 18: {
                if(list0.isEmpty()) {
                    return new zzam();
                }
                if(list0.size() % 2 != 0) {
                    throw new IllegalArgumentException("CREATE_OBJECT requires an even number of arguments, found " + list0.size());
                }
                zzap zzap5 = new zzam();
                while(v < list0.size() - 1) {
                    zzap zzap6 = zzg0.zzb(((zzap)list0.get(v)));
                    zzap zzap7 = zzg0.zzb(((zzap)list0.get(v + 1)));
                    if(zzap6 instanceof zzag || zzap7 instanceof zzag) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    ((zzam)zzap5).zzr(zzap6.zzi(), zzap7);
                    v += 2;
                }
                return zzap5;
            }
            case 24: {
                zzh.zzi("EXPRESSION_LIST", 1, list0);
                zzap zzap8 = zzap.zzf;
                while(v < list0.size()) {
                    zzap8 = zzg0.zzb(((zzap)list0.get(v)));
                    if(zzap8 instanceof zzag) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    ++v;
                }
                return zzap8;
            }
            case 33: {
                zzap zzap9 = zzg0.zzb(((zzap)a.f(zzbl.zzH, 1, list0, 0)));
                if(!(zzap9 instanceof zzat)) {
                    throw new IllegalArgumentException(a.j("Expected string for get var. got ", zzap9.getClass().getCanonicalName()));
                }
                return zzg0.zzd(zzap9.zzi());
            }
            case 35: 
            case 36: {
                zzap zzap10 = zzg0.zzb(((zzap)a.f(zzbl.zzK, 2, list0, 0)));
                zzap zzap11 = zzg0.zzb(((zzap)list0.get(1)));
                if(zzap10 instanceof zzae && zzh.zzk(zzap11)) {
                    return ((zzae)zzap10).zze(zzap11.zzh().intValue());
                }
                if(zzap10 instanceof zzal) {
                    return ((zzal)zzap10).zzf(zzap11.zzi());
                }
                if(zzap10 instanceof zzat) {
                    if("length".equals(zzap11.zzi())) {
                        return new zzah(((double)zzap10.zzi().length()));
                    }
                    if(zzh.zzk(zzap11) && ((double)zzap11.zzh()) < ((double)zzap10.zzi().length())) {
                        return new zzat(String.valueOf(zzap10.zzi().charAt(zzap11.zzh().intValue())));
                    }
                }
                return zzap.zzf;
            }
            case 49: {
                zzh.zzh("NULL", 0, list0);
                return zzap.zzg;
            }
            case 58: {
                zzap zzap12 = zzg0.zzb(((zzap)a.f(zzbl.zzag, 3, list0, 0)));
                zzap zzap13 = zzg0.zzb(((zzap)list0.get(1)));
                zzap zzap14 = zzg0.zzb(((zzap)list0.get(2)));
                if(zzap12 == zzap.zzf || zzap12 == zzap.zzg) {
                    throw new IllegalStateException(b.n("Can\'t set property ", zzap13.zzi(), " of ", zzap12.zzi()));
                }
                if(zzap12 instanceof zzae && zzap13 instanceof zzah) {
                    ((zzae)zzap12).zzq(zzap13.zzh().intValue(), zzap14);
                    return zzap14;
                }
                if(zzap12 instanceof zzal) {
                    ((zzal)zzap12).zzr(zzap13.zzi(), zzap14);
                }
                return zzap14;
            }
            case 62: {
                zzap zzap15 = zzg0.zzb(((zzap)a.f(zzbl.zzak, 1, list0, 0)));
                if(zzap15 instanceof zzau) {
                    return new zzat("undefined");
                }
                if(zzap15 instanceof zzaf) {
                    return new zzat("boolean");
                }
                if(zzap15 instanceof zzah) {
                    return new zzat("number");
                }
                if(zzap15 instanceof zzat) {
                    return new zzat("string");
                }
                if(zzap15 instanceof zzao) {
                    return new zzat("function");
                }
                if(zzap15 instanceof zzaq || zzap15 instanceof zzag) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzap15));
                }
                return new zzat("object");
            }
            case 0x3F: {
                zzh.zzh("UNDEFINED", 0, list0);
                return zzap.zzf;
            }
            case 0x40: {
                zzh.zzi("VAR", 1, list0);
                for(Object object1: list0) {
                    zzap zzap16 = zzg0.zzb(((zzap)object1));
                    if(!(zzap16 instanceof zzat)) {
                        throw new IllegalArgumentException(a.j("Expected string for var name. got ", zzap16.getClass().getCanonicalName()));
                    }
                    zzg0.zze(zzap16.zzi(), zzap.zzf);
                }
                return zzap.zzf;
            }
            default: {
                this.a(s);
                throw null;
            }
        }
    }
}

