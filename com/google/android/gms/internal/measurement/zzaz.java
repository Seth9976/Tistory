package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.util.ArrayList;
import java.util.List;

public final class zzaz extends zzaw {
    public zzaz() {
        this.a.add(zzbl.zzc);
        this.a.add(zzbl.zzl);
        this.a.add(zzbl.zzm);
        this.a.add(zzbl.zzn);
        this.a.add(zzbl.zzt);
        this.a.add(zzbl.zzp);
        this.a.add(zzbl.zzu);
        this.a.add(zzbl.zzz);
        this.a.add(zzbl.zzP);
        this.a.add(zzbl.zzac);
        this.a.add(zzbl.zzaf);
        this.a.add(zzbl.zzai);
        this.a.add(zzbl.zzaj);
    }

    public static zzao b(zzg zzg0, List list0) {
        zzh.zzi(zzbl.zzz.name(), 2, list0);
        zzap zzap0 = zzg0.zzb(((zzap)list0.get(0)));
        zzap zzap1 = zzg0.zzb(((zzap)list0.get(1)));
        if(!(zzap1 instanceof zzae)) {
            throw new IllegalArgumentException(a.j("FN requires an ArrayValue of parameter names found ", zzap1.getClass().getCanonicalName()));
        }
        List list1 = ((zzae)zzap1).zzm();
        List list2 = new ArrayList();
        if(list0.size() > 2) {
            list2 = list0.subList(2, list0.size());
        }
        return new zzao(zzap0.zzi(), list1, list2, zzg0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String s, zzg zzg0, List list0) {
        zzap zzap12;
        zzap zzap8;
        zzap zzap0 = null;
        switch(zzh.zze(s).ordinal()) {
            case 2: {
                zzap zzap1 = zzg0.zzb(((zzap)a.f(zzbl.zzc, 3, list0, 0)));
                String s1 = zzg0.zzb(((zzap)list0.get(1))).zzi();
                zzap zzap2 = zzg0.zzb(((zzap)list0.get(2)));
                if(!(zzap2 instanceof zzae)) {
                    throw new IllegalArgumentException(a.j("Function arguments for Apply are not a list found ", zzap2.getClass().getCanonicalName()));
                }
                if(s1.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return zzap1.zzbR(s1, zzg0, ((zzae)zzap2).zzm());
            }
            case 11: {
                return zzg0.zza().zzc(new zzae(list0));
            }
            case 12: {
                zzh.zzh("BREAK", 0, list0);
                return zzap.zzi;
            }
            case 15: {
                zzh.zzh("BREAK", 0, list0);
                return zzap.zzh;
            }
            case 13: 
            case 19: {
                if(list0.isEmpty()) {
                    return zzap.zzf;
                }
                zzap zzap3 = zzg0.zzb(((zzap)list0.get(0)));
                return zzap3 instanceof zzae ? zzg0.zzc(((zzae)zzap3)) : zzap.zzf;
            }
            case 20: {
                zzh.zzi("DEFINE_FUNCTION", 2, list0);
                zzap zzap4 = zzaz.b(zzg0, list0);
                if(((zzai)zzap4).zzc() == null) {
                    zzg0.zzg("", zzap4);
                    return zzap4;
                }
                zzg0.zzg(((zzai)zzap4).zzc(), zzap4);
                return zzap4;
            }
            case 25: {
                return zzaz.b(zzg0, list0);
            }
            case 41: {
                zzh.zzi("IF", 2, list0);
                zzap zzap5 = zzg0.zzb(((zzap)list0.get(0)));
                zzap zzap6 = zzg0.zzb(((zzap)list0.get(1)));
                if(list0.size() > 2) {
                    zzap0 = zzg0.zzb(((zzap)list0.get(2)));
                }
                zzap zzap7 = zzap.zzf;
                if(zzap5.zzg().booleanValue()) {
                    zzap8 = zzg0.zzc(((zzae)zzap6));
                    return zzap8 instanceof zzag ? zzap8 : zzap7;
                }
                zzap8 = zzap0 == null ? zzap7 : zzg0.zzc(((zzae)zzap0));
                return zzap8 instanceof zzag ? zzap8 : zzap7;
            }
            case 54: {
                return new zzae(list0);
            }
            case 57: {
                return list0.isEmpty() ? zzap.zzj : new zzag("return", zzg0.zzb(((zzap)a.f(zzbl.zzaf, 1, list0, 0))));
            }
            case 60: {
                zzap zzap9 = zzg0.zzb(((zzap)a.f(zzbl.zzai, 3, list0, 0)));
                zzap zzap10 = zzg0.zzb(((zzap)list0.get(1)));
                zzap zzap11 = zzg0.zzb(((zzap)list0.get(2)));
                if(!(zzap10 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if(!(zzap11 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                boolean z = false;
                for(int v = 0; v < ((zzae)zzap10).zzc(); ++v) {
                    if(z || zzap9.equals(zzg0.zzb(((zzae)zzap10).zze(v)))) {
                        zzap12 = zzg0.zzb(((zzae)zzap11).zze(v));
                        if(zzap12 instanceof zzag) {
                            return ((zzag)zzap12).zzc().equals("break") ? zzap.zzf : zzap12;
                        }
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
                if(((zzae)zzap10).zzc() + 1 == ((zzae)zzap11).zzc()) {
                    zzap12 = zzg0.zzb(((zzae)zzap11).zze(((zzae)zzap10).zzc()));
                    if(zzap12 instanceof zzag) {
                        String s2 = ((zzag)zzap12).zzc();
                        return !s2.equals("return") && !s2.equals("continue") ? zzap.zzf : zzap12;
                    }
                }
                return zzap.zzf;
            }
            case 61: {
                return zzg0.zzb(((zzap)a.f(zzbl.zzaj, 3, list0, 0))).zzg().booleanValue() ? zzg0.zzb(((zzap)list0.get(1))) : zzg0.zzb(((zzap)list0.get(2)));
            }
            default: {
                this.a(s);
                throw null;
            }
        }
    }
}

