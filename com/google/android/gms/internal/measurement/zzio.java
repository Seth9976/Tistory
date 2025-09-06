package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import wb.a;

public abstract class zzio implements zzlm {
    protected int zzb;

    public zzio() {
        this.zzb = 0;
    }

    public int a(zzlx zzlx0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlm
    public final zzje zzbs() {
        try {
            byte[] arr_b = new byte[this.zzbw()];
            zzjm zzjm0 = zzjm.zzC(arr_b);
            this.zzbN(zzjm0);
            zzjm0.zzD();
            return new q0(arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(a.d("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), iOException0);
        }
    }

    public static void zzbt(Iterable iterable0, List list0) {
        iterable0.getClass();
        if(iterable0 instanceof zzku) {
            List list1 = ((zzku)iterable0).zzh();
            int v = list0.size();
            for(Object object0: list1) {
                if(object0 == null) {
                    String s = "Element at index " + (((zzku)list0).size() - v) + " is null.";
                    int v1 = ((zzku)list0).size();
                    while(true) {
                        --v1;
                        if(v1 < v) {
                            break;
                        }
                        ((zzku)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzje) {
                    ((zzku)list0).zzi(((zzje)object0));
                }
                else {
                    ((zzku)list0).add(((String)object0));
                }
            }
            return;
        }
        if(!(iterable0 instanceof zzlt)) {
            if(list0 instanceof ArrayList && iterable0 instanceof Collection) {
                ((ArrayList)list0).ensureCapacity(((Collection)iterable0).size() + list0.size());
            }
            int v2 = list0.size();
            for(Object object1: iterable0) {
                if(object1 == null) {
                    String s1 = "Element at index " + (list0.size() - v2) + " is null.";
                    int v3 = list0.size();
                    while(true) {
                        --v3;
                        if(v3 < v2) {
                            break;
                        }
                        list0.remove(v3);
                    }
                    throw new NullPointerException(s1);
                }
                list0.add(object1);
            }
            return;
        }
        list0.addAll(((Collection)iterable0));
    }

    public final byte[] zzbu() {
        try {
            byte[] arr_b = new byte[this.zzbw()];
            zzjm zzjm0 = zzjm.zzC(arr_b);
            this.zzbN(zzjm0);
            zzjm0.zzD();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException(a.d("Serializing ", this.getClass().getName(), " to a byte array threw an IOException (should never happen)."), iOException0);
        }
    }
}

