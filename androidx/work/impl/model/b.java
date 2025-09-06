package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.l;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.kakao.kandinsky.signature.database.SignatureDao_Impl;
import com.kakao.kandinsky.signature.database.SignatureEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class b implements Callable {
    public final int a;
    public final Object b;
    public final Object c;

    public b(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    @Override
    public final Object call() {
        boolean z3;
        Integer integer0;
        int v31;
        boolean z2;
        int v29;
        boolean z1;
        int v28;
        boolean z;
        int v27;
        switch(this.a) {
            case 0: {
                try(Cursor cursor1 = DBUtil.query(((PreferenceDao_Impl)this.c).a, ((RoomSQLiteQuery)this.b), false, null)) {
                    return cursor1.moveToFirst() && !cursor1.isNull(0) ? cursor1.getLong(0) : null;
                }
            }
            case 1: {
                Boolean boolean0 = (Boolean)this.b;
                a7.b b0 = (a7.b)this.c;
                if(!boolean0.booleanValue()) {
                    Logger.getLogger().v("Deleting cached crash reports...");
                    for(Object object0: ((l)b0.c).g.getCommonFiles(l.s)) {
                        ((File)object0).delete();
                    }
                    l l0 = (l)b0.c;
                    l0.l.removeAllReports();
                    l0.q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                Logger.getLogger().d("Sending cached crash reports...");
                ((l)b0.c).b.grantDataCollectionPermission(boolean0.booleanValue());
                Executor executor0 = ((l)b0.c).e.getExecutor();
                a7.b b1 = new a7.b(this, executor0, false, 11);
                return ((Task)b0.b).onSuccessTask(executor0, b1);
            }
            case 2: {
                l.a(((l)this.c), ((String)this.b));
                return null;
            }
            case 3: {
                return CrashlyticsCore.a(((CrashlyticsCore)this.c), ((SettingsProvider)this.b));
            }
            default: {
                try(Cursor cursor0 = DBUtil.query(((SignatureDao_Impl)this.c).a, ((RoomSQLiteQuery)this.b), false, null)) {
                    int v = CursorUtil.getColumnIndexOrThrow(cursor0, "uid");
                    int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "type");
                    int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "updatedTime");
                    int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "data");
                    int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "size");
                    int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "angle");
                    int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "horizontalPaddingRatio");
                    int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "verticalPaddingRatio");
                    int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "originalSize");
                    int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "fontSize");
                    int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "lineHeight");
                    int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "color");
                    int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "alpha");
                    int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "background");
                    int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "backgroundAlpha");
                    int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "boundsSize");
                    int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "textPadding");
                    int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "bold");
                    int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "italic");
                    int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "underLine");
                    int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "align");
                    int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "font");
                    int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "watermark");
                    ArrayList arrayList0 = new ArrayList(cursor0.getCount());
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        int v23 = cursor0.getInt(v);
                        String s = cursor0.getString(v1);
                        long v24 = cursor0.getLong(v2);
                        String s1 = cursor0.getString(v3);
                        float f = cursor0.getFloat(v4);
                        float f1 = cursor0.getFloat(v5);
                        float f2 = cursor0.getFloat(v6);
                        float f3 = cursor0.getFloat(v7);
                        String s2 = cursor0.getString(v8);
                        float f4 = cursor0.getFloat(v9);
                        float f5 = cursor0.getFloat(v10);
                        int v25 = cursor0.getInt(v11);
                        float f6 = cursor0.getFloat(v12);
                        int v26 = cursor0.getInt(v13);
                        float f7 = cursor0.getFloat(v14);
                        String s3 = cursor0.getString(v15);
                        String s4 = cursor0.getString(v16);
                        if(cursor0.getInt(v17) == 0) {
                            v27 = v18;
                            z = false;
                        }
                        else {
                            v27 = v18;
                            z = true;
                        }
                        if(cursor0.getInt(v27) == 0) {
                            v18 = v27;
                            v28 = v19;
                            z1 = false;
                        }
                        else {
                            v18 = v27;
                            v28 = v19;
                            z1 = true;
                        }
                        if(cursor0.getInt(v28) == 0) {
                            v19 = v28;
                            v29 = v20;
                            z2 = false;
                        }
                        else {
                            v19 = v28;
                            v29 = v20;
                            z2 = true;
                        }
                        int v30 = cursor0.getInt(v29);
                        v20 = v29;
                        if(cursor0.isNull(v21)) {
                            v31 = v22;
                            integer0 = null;
                        }
                        else {
                            integer0 = cursor0.getInt(v21);
                            v31 = v22;
                        }
                        if(cursor0.getInt(v31) == 0) {
                            v22 = v31;
                            z3 = false;
                        }
                        else {
                            v22 = v31;
                            z3 = true;
                        }
                        arrayList0.add(new SignatureEntity(v23, s, v24, s1, f, f1, f2, f3, s2, f4, f5, v25, f6, v26, f7, s3, s4, z, z1, z2, v30, integer0, z3));
                    }
                    return arrayList0;
                }
            }
        }
    }

    @Override
    public void finalize() {
        switch(this.a) {
            case 0: {
                ((RoomSQLiteQuery)this.b).release();
                return;
            }
            case 4: {
                ((RoomSQLiteQuery)this.b).release();
                return;
            }
            default: {
                super.finalize();
            }
        }
    }
}

