package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jeb.synthetic.TWR;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ShortcutXmlParser {
    public static volatile ArrayList a;
    public static final Object b;

    static {
        ShortcutXmlParser.b = new Object();
    }

    public static HashSet a(Context context0) {
        HashSet hashSet0 = new HashSet();
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.addCategory("android.intent.category.LAUNCHER");
        intent0.setPackage("net.daum.android.tistoryapp");
        List list0 = context0.getPackageManager().queryIntentActivities(intent0, 0x80);
        if(list0 != null && list0.size() != 0) {
            try {
                for(Object object0: list0) {
                    ActivityInfo activityInfo0 = ((ResolveInfo)object0).activityInfo;
                    if(activityInfo0.metaData != null && activityInfo0.metaData.containsKey("android.app.shortcuts")) {
                        XmlResourceParser xmlResourceParser0 = activityInfo0.loadXmlMetaData(context0.getPackageManager(), "android.app.shortcuts");
                        TWR.declareResource(xmlResourceParser0);
                        if(xmlResourceParser0 == null) {
                            throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo0.name);
                        }
                        TWR.useResource$NT(xmlResourceParser0);
                        hashSet0.addAll(ShortcutXmlParser.parseShortcutIds(xmlResourceParser0));
                    }
                }
            }
            catch(Exception exception0) {
                Log.e("ShortcutXmlParser", "Failed to parse the Xml resource: ", exception0);
            }
        }
        return hashSet0;
    }

    @NonNull
    @WorkerThread
    public static List getShortcutIds(@NonNull Context context0) {
        if(ShortcutXmlParser.a == null) {
            Object object0 = ShortcutXmlParser.b;
            synchronized(object0) {
                if(ShortcutXmlParser.a == null) {
                    ShortcutXmlParser.a = new ArrayList();
                    ShortcutXmlParser.a.addAll(ShortcutXmlParser.a(context0));
                }
            }
        }
        return ShortcutXmlParser.a;
    }

    @NonNull
    @VisibleForTesting
    public static List parseShortcutIds(@NonNull XmlPullParser xmlPullParser0) throws IOException, XmlPullParserException {
        List list0 = new ArrayList(1);
        while(true) {
            int v = xmlPullParser0.next();
            if(v == 1 || v == 3 && xmlPullParser0.getDepth() <= 0) {
                break;
            }
            if(v == 2 && xmlPullParser0.getDepth() == 2 && "shortcut".equals(xmlPullParser0.getName())) {
                String s = xmlPullParser0.getAttributeValue("http://schemas.android.com/apk/res/android", "shortcutId");
                if(s == null) {
                    s = xmlPullParser0.getAttributeValue(null, "shortcutId");
                }
                if(s != null) {
                    ((ArrayList)list0).add(s);
                }
            }
        }
        return list0;
    }
}

