package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

public final class o1 implements zzej, zzla {
    public final int a;
    public final zzkt b;

    public o1(zzkt zzkt0, int v) {
        this.a = v;
        this.b = zzkt0;
        super();
    }

    public o1(zzkt zzkt0, String s) {
        this.a = 0;
        super();
        this.b = zzkt0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzej
    public void zza(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        e e1;
        if(this.a != 0) {
            this.b.h(s, v, throwable0, arr_b, map0);
            return;
        }
        zzkt zzkt0 = this.b;
        zzkt0.zzaz().zzg();
        zzkt0.b();
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            List list0 = (List)Preconditions.checkNotNull(zzkt0.x);
            zzkt0.x = null;
            if(v == 200) {
            label_14:
                if(throwable0 == null) {
                    try {
                        zzkt0.i.zzc.zzb(zzkt0.zzav().currentTimeMillis());
                        zzkt0.i.zzd.zzb(0L);
                        zzkt0.y();
                        zzkt0.zzay().zzj().zzc("Successful upload. Got network response. code, size", v, ((int)arr_b.length));
                        e e0 = zzkt0.c;
                        zzkt.D(e0);
                        e0.zzw();
                    }
                    catch(SQLiteException sQLiteException0) {
                        zzkt0.zzay().zzd().zzb("Database error while trying to delete uploaded bundles", sQLiteException0);
                        zzkt0.o = zzkt0.zzav().elapsedRealtime();
                        zzkt0.zzay().zzj().zzb("Disable upload, time", zzkt0.o);
                        return;
                    }
                    try {
                        for(Object object0: list0) {
                            Long long0 = (Long)object0;
                            try {
                                e1 = zzkt0.c;
                                zzkt.D(e1);
                                e1.zzg();
                                e1.zzW();
                                SQLiteDatabase sQLiteDatabase0 = e1.o();
                                String[] arr_s = {String.valueOf(((long)long0))};
                            }
                            catch(SQLiteException sQLiteException1) {
                                goto label_38;
                            }
                            try {
                                if(sQLiteDatabase0.delete("queue", "rowid=?", arr_s) != 1) {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }
                                continue;
                            }
                            catch(SQLiteException sQLiteException2) {
                                try {
                                    e1.zzt.zzay().zzd().zzb("Failed to delete a bundle in a queue table", sQLiteException2);
                                    throw sQLiteException2;
                                }
                                catch(SQLiteException sQLiteException1) {
                                }
                            }
                        label_38:
                            if(zzkt0.y == null || !zzkt0.y.contains(long0)) {
                                throw sQLiteException1;
                            }
                            if(false) {
                                break;
                            }
                        }
                        e e2 = zzkt0.c;
                        zzkt.D(e2);
                        e2.zzC();
                        goto label_51;
                    }
                    catch(Throwable throwable1) {
                        try {
                            e e3 = zzkt0.c;
                            zzkt.D(e3);
                            e3.z();
                            throw throwable1;
                        label_51:
                            e e4 = zzkt0.c;
                            zzkt.D(e4);
                            e4.z();
                            zzkt0.y = null;
                            zzkt.D(zzkt0.b);
                            if(!zzkt0.b.zza() || !zzkt0.A()) {
                                zzkt0.z = -1L;
                                zzkt0.y();
                            }
                            else {
                                zzkt0.p();
                            }
                            zzkt0.o = 0L;
                            return;
                        }
                        catch(SQLiteException sQLiteException0) {
                        }
                    }
                    zzkt0.zzay().zzd().zzb("Database error while trying to delete uploaded bundles", sQLiteException0);
                    zzkt0.o = zzkt0.zzav().elapsedRealtime();
                    zzkt0.zzay().zzj().zzb("Disable upload, time", zzkt0.o);
                }
                else {
                label_68:
                    zzkt0.zzay().zzj().zzc("Network upload failed. Will retry later. code, error", v, throwable0);
                    zzkt0.i.zzd.zzb(zzkt0.zzav().currentTimeMillis());
                    if(v == 429 || v == 503) {
                        zzkt0.i.zzb.zzb(zzkt0.zzav().currentTimeMillis());
                    }
                    e e5 = zzkt0.c;
                    zzkt.D(e5);
                    e5.A(list0);
                    zzkt0.y();
                }
            }
            else if(v == 204) {
                v = 204;
                goto label_14;
            }
            else {
                goto label_68;
            }
        }
        finally {
            zzkt0.t = false;
            zzkt0.w();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzla
    public void zza(String s, String s1, Bundle bundle0) {
        boolean z = TextUtils.isEmpty(s);
        zzkt zzkt0 = this.b;
        if(z) {
            zzfr zzfr0 = zzkt0.l;
            if(zzfr0 != null) {
                zzfr0.zzay().zzd().zzb("AppId not known when logging event", "_err");
            }
            return;
        }
        zzkt0.zzaz().zzp(new y0(this, s, 7, bundle0));
    }
}

