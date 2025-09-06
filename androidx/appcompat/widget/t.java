package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class t extends DataSetObservable {
    public final Object a;
    public final ArrayList b;
    public final ArrayList c;
    public final Context d;
    public final String e;
    public Intent f;
    public final r g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public y2 m;
    public static final Object n;
    public static final HashMap o;

    static {
        t.n = new Object();
        t.o = new HashMap();
    }

    public t(Context context0, String s) {
        this.a = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = new r(0);
        this.h = 50;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = false;
        this.d = context0.getApplicationContext();
        if(!TextUtils.isEmpty(s) && !s.endsWith(".xml")) {
            this.e = s + ".xml";
            return;
        }
        this.e = s;
    }

    public final void a(ActivityChooserModel.HistoricalRecord activityChooserModel$HistoricalRecord0) {
        ArrayList arrayList0 = this.c;
        if(arrayList0.add(activityChooserModel$HistoricalRecord0)) {
            this.k = true;
            this.h();
            if(!this.j) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if(this.k) {
                this.k = false;
                String s = this.e;
                if(!TextUtils.isEmpty(s)) {
                    new s(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(arrayList0), s});
                }
            }
            this.i();
            this.notifyChanged();
        }
    }

    public final Intent b(int v) {
        synchronized(this.a) {
            if(this.f == null) {
                return null;
            }
            this.c();
            ActivityInfo activityInfo0 = ((ActivityChooserModel.ActivityResolveInfo)this.b.get(v)).resolveInfo.activityInfo;
            ComponentName componentName0 = new ComponentName(activityInfo0.packageName, activityInfo0.name);
            Intent intent0 = new Intent(this.f);
            intent0.setComponent(componentName0);
            if(this.m != null) {
                Intent intent1 = new Intent(intent0);
                this.m.onChooseActivity(this, intent1);
            }
            this.a(new ActivityChooserModel.HistoricalRecord(componentName0, System.currentTimeMillis(), 1.0f));
            return intent0;
        }
    }

    public final void c() {
        ArrayList arrayList1;
        XmlPullParser xmlPullParser0;
        FileInputStream fileInputStream0;
        int v4;
        int v = 1;
        Context context0 = this.d;
        if(!this.l || this.f == null) {
            v4 = 0;
        }
        else {
            this.l = false;
            ArrayList arrayList0 = this.b;
            arrayList0.clear();
            List list0 = context0.getPackageManager().queryIntentActivities(this.f, 0);
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                arrayList0.add(new ActivityChooserModel.ActivityResolveInfo(((ResolveInfo)list0.get(v3))));
            }
            v4 = 1;
        }
        if(!this.i || !this.k) {
            v = 0;
        }
        else {
            String s = this.e;
            if(TextUtils.isEmpty(s)) {
                v = 0;
            }
            else {
                try {
                    this.i = false;
                    this.j = true;
                    fileInputStream0 = context0.openFileInput(s);
                }
                catch(FileNotFoundException unused_ex) {
                    goto label_61;
                }
                try {
                    xmlPullParser0 = Xml.newPullParser();
                    xmlPullParser0.setInput(fileInputStream0, "UTF-8");
                    for(int v1 = 0; v1 != 1 && v1 != 2; v1 = xmlPullParser0.next()) {
                    }
                    if(!"historical-records".equals(xmlPullParser0.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    arrayList1 = this.c;
                    arrayList1.clear();
                    while(true) {
                    label_32:
                        int v5 = xmlPullParser0.next();
                        if(v5 == 1) {
                            break;
                        }
                        goto label_37;
                    }
                }
                catch(XmlPullParserException xmlPullParserException0) {
                    goto label_47;
                }
                catch(IOException iOException0) {
                    goto label_51;
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
                if(fileInputStream0 == null) {
                    goto label_61;
                }
                try {
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                goto label_61;
            label_37:
                if(v5 == 3 || v5 == 4) {
                    goto label_32;
                }
                try {
                    try {
                        if(!"historical-record".equals(xmlPullParser0.getName())) {
                            throw new XmlPullParserException("Share records file not well-formed.");
                        }
                        arrayList1.add(new ActivityChooserModel.HistoricalRecord(xmlPullParser0.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParser0.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParser0.getAttributeValue(null, "weight"))));
                        goto label_32;
                    }
                    catch(XmlPullParserException xmlPullParserException0) {
                    }
                    catch(IOException iOException0) {
                        goto label_51;
                    }
                label_47:
                    Log.e("t", "Error reading historical recrod file: " + s, xmlPullParserException0);
                    if(fileInputStream0 != null) {
                        goto label_49;
                    }
                    goto label_61;
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
                try {
                label_49:
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                goto label_61;
                try {
                label_51:
                    Log.e("t", "Error reading historical recrod file: " + s, iOException0);
                    if(fileInputStream0 != null) {
                        goto label_53;
                    }
                    goto label_61;
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
                try {
                label_53:
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                goto label_61;
            label_55:
                if(fileInputStream0 != null) {
                    try {
                        fileInputStream0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                throw throwable0;
            }
        }
    label_61:
        this.h();
        if((v | v4) != 0) {
            this.i();
            this.notifyChanged();
        }
    }

    public static t d(Context context0, String s) {
        synchronized(t.n) {
            HashMap hashMap0 = t.o;
            t t0 = (t)hashMap0.get(s);
            if(t0 == null) {
                t0 = new t(context0, s);
                hashMap0.put(s, t0);
            }
            return t0;
        }
    }

    public final ResolveInfo e(int v) {
        synchronized(this.a) {
            this.c();
        }
        return ((ActivityChooserModel.ActivityResolveInfo)this.b.get(v)).resolveInfo;
    }

    public final int f() {
        synchronized(this.a) {
            this.c();
        }
        return this.b.size();
    }

    public final ResolveInfo g() {
        synchronized(this.a) {
            this.c();
            return !this.b.isEmpty() ? ((ActivityChooserModel.ActivityResolveInfo)this.b.get(0)).resolveInfo : null;
        }
    }

    public final void h() {
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size() - this.h;
        if(v <= 0) {
            return;
        }
        this.k = true;
        for(int v1 = 0; v1 < v; ++v1) {
            ActivityChooserModel.HistoricalRecord activityChooserModel$HistoricalRecord0 = (ActivityChooserModel.HistoricalRecord)arrayList0.remove(0);
        }
    }

    public final void i() {
        r r0 = this.g;
        if(r0 != null && this.f != null) {
            ArrayList arrayList0 = this.b;
            if(!arrayList0.isEmpty()) {
                ArrayList arrayList1 = this.c;
                if(!arrayList1.isEmpty()) {
                    r0.sort(this.f, arrayList0, Collections.unmodifiableList(arrayList1));
                }
            }
        }
    }
}

