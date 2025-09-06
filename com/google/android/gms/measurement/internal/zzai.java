package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

public final class zzai {
    public final EnumMap a;
    public static final zzai zza;

    static {
        zzai.zza = new zzai(null, null);
    }

    public zzai(Boolean boolean0, Boolean boolean1) {
        EnumMap enumMap0 = new EnumMap(zzah.class);
        this.a = enumMap0;
        enumMap0.put(zzah.zza, boolean0);
        enumMap0.put(zzah.zzb, boolean1);
    }

    public zzai(EnumMap enumMap0) {
        EnumMap enumMap1 = new EnumMap(zzah.class);
        this.a = enumMap1;
        enumMap1.putAll(enumMap0);
    }

    @Override
    public final boolean equals(Object object0) {
        int v2;
        if(!(object0 instanceof zzai)) {
            return false;
        }
        zzah[] arr_zzah = zzah.values();
        for(int v = 0; true; ++v) {
            int v1 = 1;
            if(v >= arr_zzah.length) {
                break;
            }
            zzah zzah0 = arr_zzah[v];
            Boolean boolean0 = (Boolean)this.a.get(zzah0);
            if(boolean0 == null) {
                v2 = 0;
            }
            else {
                v2 = boolean0.booleanValue() ? 1 : 2;
            }
            Boolean boolean1 = (Boolean)((zzai)object0).a.get(zzah0);
            if(boolean1 == null) {
                v1 = 0;
            }
            else if(!boolean1.booleanValue()) {
                v1 = 2;
            }
            if(v2 != v1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = 17;
        for(Object object0: this.a.values()) {
            Boolean boolean0 = (Boolean)object0;
            if(boolean0 == null) {
                v1 = 0;
            }
            else {
                v1 = boolean0.booleanValue() ? 1 : 2;
            }
            v = v * 0x1F + v1;
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("settings: ");
        zzah[] arr_zzah = zzah.values();
        for(int v = 0; v < arr_zzah.length; ++v) {
            zzah zzah0 = arr_zzah[v];
            if(v != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(zzah0.name());
            stringBuilder0.append("=");
            Boolean boolean0 = (Boolean)this.a.get(zzah0);
            if(boolean0 == null) {
                stringBuilder0.append("uninitialized");
            }
            else {
                stringBuilder0.append((boolean0.booleanValue() ? "granted" : "denied"));
            }
        }
        return stringBuilder0.toString();
    }

    public static zzai zza(Bundle bundle0) {
        if(bundle0 == null) {
            return zzai.zza;
        }
        EnumMap enumMap0 = new EnumMap(zzah.class);
        zzah[] arr_zzah = zzah.values();
        for(int v = 0; v < arr_zzah.length; ++v) {
            zzah zzah0 = arr_zzah[v];
            String s = bundle0.getString(zzah0.zzd);
            Boolean boolean0 = null;
            if(s != null) {
                if(s.equals("granted")) {
                    boolean0 = Boolean.TRUE;
                }
                else if(s.equals("denied")) {
                    boolean0 = Boolean.FALSE;
                }
            }
            enumMap0.put(zzah0, boolean0);
        }
        return new zzai(enumMap0);
    }

    public static zzai zzb(String s) {
        EnumMap enumMap0 = new EnumMap(zzah.class);
        if(s != null) {
            for(int v = 0; true; ++v) {
                zzah[] arr_zzah = zzah.zzc;
                if(v >= 2) {
                    break;
                }
                zzah zzah0 = arr_zzah[v];
                if(v + 2 < s.length()) {
                    Boolean boolean0 = null;
                    switch(s.charAt(v + 2)) {
                        case 0x30: {
                            boolean0 = Boolean.FALSE;
                            break;
                        }
                        case 49: {
                            boolean0 = Boolean.TRUE;
                        }
                    }
                    enumMap0.put(zzah0, boolean0);
                }
            }
        }
        return new zzai(enumMap0);
    }

    public final zzai zzc(zzai zzai0) {
        EnumMap enumMap0 = new EnumMap(zzah.class);
        zzah[] arr_zzah = zzah.values();
        for(int v = 0; v < arr_zzah.length; ++v) {
            zzah zzah0 = arr_zzah[v];
            Boolean boolean0 = (Boolean)this.a.get(zzah0);
            Boolean boolean1 = (Boolean)zzai0.a.get(zzah0);
            if(boolean0 == null) {
                boolean0 = boolean1;
            }
            else if(boolean1 != null) {
                boolean0 = Boolean.valueOf(boolean0.booleanValue() && boolean1.booleanValue());
            }
            enumMap0.put(zzah0, boolean0);
        }
        return new zzai(enumMap0);
    }

    public final zzai zzd(zzai zzai0) {
        EnumMap enumMap0 = new EnumMap(zzah.class);
        zzah[] arr_zzah = zzah.values();
        for(int v = 0; v < arr_zzah.length; ++v) {
            zzah zzah0 = arr_zzah[v];
            Boolean boolean0 = (Boolean)this.a.get(zzah0);
            if(boolean0 == null) {
                boolean0 = (Boolean)zzai0.a.get(zzah0);
            }
            enumMap0.put(zzah0, boolean0);
        }
        return new zzai(enumMap0);
    }

    public final Boolean zze() {
        return (Boolean)this.a.get(zzah.zza);
    }

    public final Boolean zzf() {
        return (Boolean)this.a.get(zzah.zzb);
    }

    public static String zzg(Bundle bundle0) {
        zzah[] arr_zzah = zzah.values();
        for(int v = 0; true; ++v) {
            Boolean boolean0 = null;
            if(v >= arr_zzah.length) {
                break;
            }
            zzah zzah0 = arr_zzah[v];
            if(bundle0.containsKey(zzah0.zzd)) {
                String s = bundle0.getString(zzah0.zzd);
                if(s != null && !s.equals("granted")) {
                    if(s.equals("denied")) {
                        boolean0 = Boolean.FALSE;
                    }
                    if(boolean0 == null) {
                        return s;
                    }
                }
            }
        }
        return null;
    }

    public final String zzh() {
        int v1;
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        zzah[] arr_zzah = zzah.zzc;
        for(int v = 0; v < 2; ++v) {
            Boolean boolean0 = (Boolean)this.a.get(arr_zzah[v]);
            if(boolean0 == null) {
                v1 = 45;
            }
            else {
                v1 = boolean0.booleanValue() ? 49 : 0x30;
            }
            stringBuilder0.append(((char)v1));
        }
        return stringBuilder0.toString();
    }

    public final boolean zzi(zzah zzah0) {
        Boolean boolean0 = (Boolean)this.a.get(zzah0);
        return boolean0 == null || boolean0.booleanValue();
    }

    public static boolean zzj(int v, int v1) {
        return v <= v1;
    }

    public final boolean zzk(zzai zzai0) {
        return this.zzl(zzai0, ((zzah[])this.a.keySet().toArray(new zzah[0])));
    }

    public final boolean zzl(zzai zzai0, zzah[] arr_zzah) {
        for(int v = 0; v < arr_zzah.length; ++v) {
            zzah zzah0 = arr_zzah[v];
            Boolean boolean0 = (Boolean)this.a.get(zzah0);
            Boolean boolean1 = (Boolean)zzai0.a.get(zzah0);
            if(boolean0 == Boolean.FALSE && boolean1 != Boolean.FALSE) {
                return true;
            }
        }
        return false;
    }
}

