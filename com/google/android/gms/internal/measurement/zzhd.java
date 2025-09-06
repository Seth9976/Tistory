package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jeb.synthetic.TWR;

public final class zzhd implements zzhj {
    public final zzhf zza;

    public zzhd(zzhf zzhf0) {
        this.zza = zzhf0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhj
    public final Object zza() {
        Map map0;
        ArrayMap arrayMap0;
        Cursor cursor0 = this.zza.a.query(this.zza.b, zzhf.zza, null, null, null);
        if(cursor0 == null) {
            return Collections.emptyMap();
        }
        try {
            int v = cursor0.getCount();
            if(v != 0) {
                arrayMap0 = v <= 0x100 ? new ArrayMap(v) : new HashMap(v, 1.0f);
                while(true) {
                    if(!cursor0.moveToNext()) {
                        goto label_12;
                    }
                    arrayMap0.put(cursor0.getString(0), cursor0.getString(1));
                }
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
            goto label_17;
        }
    label_12:
        cursor0.close();
        return arrayMap0;
        try {
        label_14:
            map0 = Collections.emptyMap();
        }
        catch(Throwable throwable0) {
        label_17:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }
}

