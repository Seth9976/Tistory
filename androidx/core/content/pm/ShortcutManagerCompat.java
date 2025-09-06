package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.c2;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ShortcutManagerCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    public static volatile ShortcutInfoCompatSaver a;
    public static volatile ArrayList b;

    public static boolean a(Context context0, ShortcutInfoCompat shortcutInfoCompat0) {
        IconCompat iconCompat0 = shortcutInfoCompat0.i;
        if(iconCompat0 == null) {
            return false;
        }
        int v = iconCompat0.mType;
        if(v != 4 && v != 6) {
            return true;
        }
        InputStream inputStream0 = iconCompat0.getUriInputStream(context0);
        if(inputStream0 == null) {
            return false;
        }
        Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0);
        if(bitmap0 == null) {
            return false;
        }
        shortcutInfoCompat0.i = v == 6 ? IconCompat.createWithAdaptiveBitmap(bitmap0) : IconCompat.createWithBitmap(bitmap0);
        return true;
    }

    public static boolean addDynamicShortcuts(@NonNull Context context0, @NonNull List list0) {
        List list1 = ShortcutManagerCompat.e(list0);
        if(Build.VERSION.SDK_INT <= 29) {
            ShortcutManagerCompat.b(context0, list1);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list1) {
            arrayList0.add(((ShortcutInfoCompat)object0).toShortcutInfo());
        }
        if(!((ShortcutManager)context0.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList0)) {
            return false;
        }
        ShortcutManagerCompat.d(context0).addShortcuts(list1);
        Iterator iterator1 = ((ArrayList)ShortcutManagerCompat.c(context0)).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
        return true;
    }

    public static void b(Context context0, List list0) {
        for(Object object0: new ArrayList(list0)) {
            ShortcutInfoCompat shortcutInfoCompat0 = (ShortcutInfoCompat)object0;
            if(!ShortcutManagerCompat.a(context0, shortcutInfoCompat0)) {
                list0.remove(shortcutInfoCompat0);
            }
        }
    }

    public static List c(Context context0) {
        if(ShortcutManagerCompat.b == null) {
            ArrayList arrayList0 = new ArrayList();
            PackageManager packageManager0 = context0.getPackageManager();
            Intent intent0 = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent0.setPackage("net.daum.android.tistoryapp");
            for(Object object0: packageManager0.queryIntentActivities(intent0, 0x80)) {
                ActivityInfo activityInfo0 = ((ResolveInfo)object0).activityInfo;
                if(activityInfo0 != null) {
                    Bundle bundle0 = activityInfo0.metaData;
                    if(bundle0 != null) {
                        String s = bundle0.getString("androidx.core.content.pm.shortcut_listener_impl");
                        if(s != null) {
                            try {
                                arrayList0.add(((ShortcutInfoChangeListener)Class.forName(s, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context0)));
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                    }
                }
            }
            if(ShortcutManagerCompat.b == null) {
                ShortcutManagerCompat.b = arrayList0;
            }
        }
        return ShortcutManagerCompat.b;
    }

    @NonNull
    public static Intent createShortcutResultIntent(@NonNull Context context0, @NonNull ShortcutInfoCompat shortcutInfoCompat0) {
        Intent intent0 = ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).createShortcutResultIntent(shortcutInfoCompat0.toShortcutInfo());
        if(intent0 == null) {
            intent0 = new Intent();
        }
        Drawable drawable0 = null;
        intent0.putExtra("android.intent.extra.shortcut.INTENT", shortcutInfoCompat0.d[shortcutInfoCompat0.d.length - 1]).putExtra("android.intent.extra.shortcut.NAME", shortcutInfoCompat0.f.toString());
        if(shortcutInfoCompat0.i != null) {
            if(shortcutInfoCompat0.j) {
                PackageManager packageManager0 = shortcutInfoCompat0.a.getPackageManager();
                ComponentName componentName0 = shortcutInfoCompat0.e;
                if(componentName0 != null) {
                    try {
                        drawable0 = packageManager0.getActivityIcon(componentName0);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
                if(drawable0 == null) {
                    drawable0 = shortcutInfoCompat0.a.getApplicationInfo().loadIcon(packageManager0);
                }
            }
            shortcutInfoCompat0.i.addToShortcutIntent(intent0, drawable0, shortcutInfoCompat0.a);
        }
        return intent0;
    }

    public static ShortcutInfoCompatSaver d(Context context0) {
        if(ShortcutManagerCompat.a == null) {
            try {
                ShortcutManagerCompat.a = (ShortcutInfoCompatSaver)Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context0);
            }
            catch(Exception unused_ex) {
            }
            if(ShortcutManagerCompat.a == null) {
                ShortcutManagerCompat.a = new NoopImpl();
            }
        }
        return ShortcutManagerCompat.a;
    }

    public static void disableShortcuts(@NonNull Context context0, @NonNull List list0, @Nullable CharSequence charSequence0) {
        ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).disableShortcuts(list0, charSequence0);
        ShortcutManagerCompat.d(context0).removeShortcuts(list0);
        Iterator iterator0 = ((ArrayList)ShortcutManagerCompat.c(context0)).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static List e(List list0) {
        Objects.requireNonNull(list0);
        if(Build.VERSION.SDK_INT > 0x20) {
            return list0;
        }
        List list1 = new ArrayList(list0);
        for(Object object0: list0) {
            ShortcutInfoCompat shortcutInfoCompat0 = (ShortcutInfoCompat)object0;
            if(shortcutInfoCompat0.isExcludedFromSurfaces(1)) {
                ((ArrayList)list1).remove(shortcutInfoCompat0);
            }
        }
        return list1;
    }

    public static void enableShortcuts(@NonNull Context context0, @NonNull List list0) {
        List list1 = ShortcutManagerCompat.e(list0);
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list1) {
            arrayList0.add(((ShortcutInfoCompat)object0).b);
        }
        ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList0);
        ShortcutManagerCompat.d(context0).addShortcuts(list1);
        Iterator iterator1 = ((ArrayList)ShortcutManagerCompat.c(context0)).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
    }

    @NonNull
    public static List getDynamicShortcuts(@NonNull Context context0) {
        List list0 = ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            ((ArrayList)list1).add(new Builder(context0, ((ShortcutInfo)object0)).build());
        }
        return list1;
    }

    public static int getIconMaxHeight(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        return ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    public static int getIconMaxWidth(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        return ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    public static int getMaxShortcutCountPerActivity(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        return ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    @NonNull
    public static List getShortcuts(@NonNull Context context0, int v) {
        Class class0 = ShortcutManager.class;
        if(Build.VERSION.SDK_INT >= 30) {
            return ShortcutInfoCompat.a(context0, c2.n(((ShortcutManager)context0.getSystemService(class0)), v));
        }
        ShortcutManager shortcutManager0 = (ShortcutManager)context0.getSystemService(class0);
        ArrayList arrayList0 = new ArrayList();
        if((v & 1) != 0) {
            arrayList0.addAll(shortcutManager0.getManifestShortcuts());
        }
        if((v & 2) != 0) {
            arrayList0.addAll(shortcutManager0.getDynamicShortcuts());
        }
        if((v & 4) != 0) {
            arrayList0.addAll(shortcutManager0.getPinnedShortcuts());
        }
        return ShortcutInfoCompat.a(context0, arrayList0);
    }

    public static boolean isRateLimitingActive(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        return ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    public static boolean isRequestPinShortcutSupported(@NonNull Context context0) {
        return ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static boolean pushDynamicShortcut(@NonNull Context context0, @NonNull ShortcutInfoCompat shortcutInfoCompat0) {
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(shortcutInfoCompat0);
        int v = Build.VERSION.SDK_INT;
        if(v <= 0x20 && shortcutInfoCompat0.isExcludedFromSurfaces(1)) {
            for(Object object0: ((ArrayList)ShortcutManagerCompat.c(context0))) {
                ((ShortcutInfoChangeListener)object0).onShortcutAdded(Collections.singletonList(shortcutInfoCompat0));
            }
            return true;
        }
        int v1 = ShortcutManagerCompat.getMaxShortcutCountPerActivity(context0);
        if(v1 == 0) {
            return false;
        }
        if(v <= 29) {
            ShortcutManagerCompat.a(context0, shortcutInfoCompat0);
        }
        String s = null;
        int v2 = -1;
        Class class0 = ShortcutManager.class;
        if(v >= 30) {
            c2.p(((ShortcutManager)context0.getSystemService(class0)), shortcutInfoCompat0.toShortcutInfo());
        }
        else {
            ShortcutManager shortcutManager0 = (ShortcutManager)context0.getSystemService(class0);
            if(shortcutManager0.isRateLimitingActive()) {
                return false;
            }
            List list0 = shortcutManager0.getDynamicShortcuts();
            if(list0.size() >= v1) {
                String s1 = null;
                int v3 = -1;
                for(Object object1: list0) {
                    ShortcutInfo shortcutInfo0 = (ShortcutInfo)object1;
                    if(shortcutInfo0.getRank() > v3) {
                        s1 = shortcutInfo0.getId();
                        v3 = shortcutInfo0.getRank();
                    }
                }
                shortcutManager0.removeDynamicShortcuts(Arrays.asList(new String[]{s1}));
            }
            shortcutManager0.addDynamicShortcuts(Arrays.asList(new ShortcutInfo[]{shortcutInfoCompat0.toShortcutInfo()}));
        }
        ShortcutInfoCompatSaver shortcutInfoCompatSaver0 = ShortcutManagerCompat.d(context0);
        try {
            List list1 = shortcutInfoCompatSaver0.getShortcuts();
            if(list1.size() >= v1) {
                for(Object object2: list1) {
                    ShortcutInfoCompat shortcutInfoCompat1 = (ShortcutInfoCompat)object2;
                    if(shortcutInfoCompat1.getRank() > v2) {
                        s = shortcutInfoCompat1.getId();
                        v2 = shortcutInfoCompat1.getRank();
                    }
                }
                shortcutInfoCompatSaver0.removeShortcuts(Arrays.asList(new String[]{s}));
            }
            shortcutInfoCompatSaver0.addShortcuts(Arrays.asList(new ShortcutInfoCompat[]{shortcutInfoCompat0}));
            return true;
        }
        catch(Exception unused_ex) {
            for(Object object3: ((ArrayList)ShortcutManagerCompat.c(context0))) {
                ((ShortcutInfoChangeListener)object3).onShortcutAdded(Collections.singletonList(shortcutInfoCompat0));
            }
            ShortcutManagerCompat.reportShortcutUsed(context0, shortcutInfoCompat0.getId());
            return false;
        }
        finally {
            for(Object object4: ((ArrayList)ShortcutManagerCompat.c(context0))) {
                ((ShortcutInfoChangeListener)object4).onShortcutAdded(Collections.singletonList(shortcutInfoCompat0));
            }
            ShortcutManagerCompat.reportShortcutUsed(context0, shortcutInfoCompat0.getId());
        }
    }

    public static void removeAllDynamicShortcuts(@NonNull Context context0) {
        ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        ShortcutManagerCompat.d(context0).removeAllShortcuts();
        Iterator iterator0 = ((ArrayList)ShortcutManagerCompat.c(context0)).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static void removeDynamicShortcuts(@NonNull Context context0, @NonNull List list0) {
        ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list0);
        ShortcutManagerCompat.d(context0).removeShortcuts(list0);
        Iterator iterator0 = ((ArrayList)ShortcutManagerCompat.c(context0)).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static void removeLongLivedShortcuts(@NonNull Context context0, @NonNull List list0) {
        if(Build.VERSION.SDK_INT < 30) {
            ShortcutManagerCompat.removeDynamicShortcuts(context0, list0);
            return;
        }
        c2.q(((ShortcutManager)context0.getSystemService(ShortcutManager.class)), list0);
        ShortcutManagerCompat.d(context0).removeShortcuts(list0);
        Iterator iterator0 = ((ArrayList)ShortcutManagerCompat.c(context0)).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static void reportShortcutUsed(@NonNull Context context0, @NonNull String s) {
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(s);
        ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).reportShortcutUsed(s);
        for(Object object0: ((ArrayList)ShortcutManagerCompat.c(context0))) {
            ((ShortcutInfoChangeListener)object0).onShortcutUsageReported(Collections.singletonList(s));
        }
    }

    public static boolean requestPinShortcut(@NonNull Context context0, @NonNull ShortcutInfoCompat shortcutInfoCompat0, @Nullable IntentSender intentSender0) {
        return Build.VERSION.SDK_INT > 0x20 || !shortcutInfoCompat0.isExcludedFromSurfaces(1) ? ((ShortcutManager)context0.getSystemService(ShortcutManager.class)).requestPinShortcut(shortcutInfoCompat0.toShortcutInfo(), intentSender0) : false;
    }

    public static boolean setDynamicShortcuts(@NonNull Context context0, @NonNull List list0) {
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(list0);
        List list1 = ShortcutManagerCompat.e(list0);
        ArrayList arrayList0 = new ArrayList(list1.size());
        for(Object object0: list1) {
            arrayList0.add(((ShortcutInfoCompat)object0).toShortcutInfo());
        }
        if(!((ShortcutManager)context0.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList0)) {
            return false;
        }
        ShortcutManagerCompat.d(context0).removeAllShortcuts();
        ShortcutManagerCompat.d(context0).addShortcuts(list1);
        for(Object object1: ((ArrayList)ShortcutManagerCompat.c(context0))) {
            ((ShortcutInfoChangeListener)object1).onShortcutAdded(list0);
        }
        return true;
    }

    public static boolean updateShortcuts(@NonNull Context context0, @NonNull List list0) {
        List list1 = ShortcutManagerCompat.e(list0);
        if(Build.VERSION.SDK_INT <= 29) {
            ShortcutManagerCompat.b(context0, list1);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list1) {
            arrayList0.add(((ShortcutInfoCompat)object0).toShortcutInfo());
        }
        if(!((ShortcutManager)context0.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList0)) {
            return false;
        }
        ShortcutManagerCompat.d(context0).addShortcuts(list1);
        Iterator iterator1 = ((ArrayList)ShortcutManagerCompat.c(context0)).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
        return true;
    }
}

