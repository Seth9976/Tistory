package com.google.android.gms.internal.measurement;

import a5.b;
import android.util.Log;

public final class e0 extends zzib {
    public final int i;

    public e0(zzhy zzhy0, String s, Object object0, int v) {
        this.i = v;
        super(zzhy0, s, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final Object a(Object object0) {
        switch(this.i) {
            case 0: {
                try {
                    return Long.parseLong(((String)object0));
                }
                catch(NumberFormatException unused_ex) {
                    StringBuilder stringBuilder0 = b.v("Invalid long value for ", this.zzc(), ": ");
                    stringBuilder0.append(((String)object0));
                    Log.e("PhenotypeFlag", stringBuilder0.toString());
                    return null;
                }
            }
            case 1: {
                if(zzha.zzc.matcher(((CharSequence)object0)).matches()) {
                    return true;
                }
                if(zzha.zzd.matcher(((CharSequence)object0)).matches()) {
                    return false;
                }
                StringBuilder stringBuilder1 = b.v("Invalid boolean value for ", this.zzc(), ": ");
                stringBuilder1.append(((String)object0));
                Log.e("PhenotypeFlag", stringBuilder1.toString());
                return null;
            }
            case 2: {
                try {
                    return Double.parseDouble(((String)object0));
                }
                catch(NumberFormatException unused_ex) {
                    StringBuilder stringBuilder2 = b.v("Invalid double value for ", this.zzc(), ": ");
                    stringBuilder2.append(((String)object0));
                    Log.e("PhenotypeFlag", stringBuilder2.toString());
                    return null;
                }
            }
            default: {
                return object0;
            }
        }
    }
}

