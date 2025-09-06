package androidx.core.content.pm;

import a5.b;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.c2;
import androidx.webkit.internal.k;
import androidx.work.impl.background.systemjob.a;
import b3.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShortcutInfoCompat {
    public static class Builder {
        public final ShortcutInfoCompat a;
        public boolean b;
        public HashSet c;
        public HashMap d;
        public Uri e;

        @RequiresApi(25)
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull Context context0, @NonNull ShortcutInfo shortcutInfo0) {
            Person[] arr_person;
            ShortcutInfoCompat shortcutInfoCompat0 = new ShortcutInfoCompat();
            this.a = shortcutInfoCompat0;
            shortcutInfoCompat0.a = context0;
            shortcutInfoCompat0.b = shortcutInfo0.getId();
            shortcutInfoCompat0.c = shortcutInfo0.getPackage();
            Intent[] arr_intent = shortcutInfo0.getIntents();
            shortcutInfoCompat0.d = (Intent[])Arrays.copyOf(arr_intent, arr_intent.length);
            shortcutInfoCompat0.e = shortcutInfo0.getActivity();
            shortcutInfoCompat0.f = shortcutInfo0.getShortLabel();
            shortcutInfoCompat0.g = shortcutInfo0.getLongLabel();
            shortcutInfoCompat0.h = shortcutInfo0.getDisabledMessage();
            if(Build.VERSION.SDK_INT >= 28) {
                shortcutInfoCompat0.A = a.a(shortcutInfo0);
            }
            else {
                shortcutInfoCompat0.A = shortcutInfo0.isEnabled() ? 0 : 3;
            }
            shortcutInfoCompat0.l = shortcutInfo0.getCategories();
            PersistableBundle persistableBundle0 = shortcutInfo0.getExtras();
            LocusIdCompat locusIdCompat0 = null;
            if(persistableBundle0 == null || !persistableBundle0.containsKey("extraPersonCount")) {
                arr_person = null;
            }
            else {
                int v1 = persistableBundle0.getInt("extraPersonCount");
                arr_person = new Person[v1];
                for(int v = 0; v < v1; ++v) {
                    arr_person[v] = Person.fromPersistableBundle(persistableBundle0.getPersistableBundle("extraPerson_" + (v + 1)));
                }
            }
            shortcutInfoCompat0.k = arr_person;
            this.a.s = shortcutInfo0.getUserHandle();
            this.a.r = shortcutInfo0.getLastChangedTimestamp();
            int v2 = Build.VERSION.SDK_INT;
            if(v2 >= 30) {
                this.a.t = c2.w(shortcutInfo0);
            }
            this.a.u = shortcutInfo0.isDynamic();
            this.a.v = shortcutInfo0.isPinned();
            this.a.w = shortcutInfo0.isDeclaredInManifest();
            this.a.x = shortcutInfo0.isImmutable();
            this.a.y = shortcutInfo0.isEnabled();
            this.a.z = shortcutInfo0.hasKeyFieldsOnly();
            ShortcutInfoCompat shortcutInfoCompat1 = this.a;
            if(v2 < 29) {
                PersistableBundle persistableBundle1 = shortcutInfo0.getExtras();
                if(persistableBundle1 != null) {
                    String s = persistableBundle1.getString("extraLocusId");
                    if(s != null) {
                        locusIdCompat0 = new LocusIdCompat(s);
                    }
                }
            }
            else if(k.e(shortcutInfo0) != null) {
                locusIdCompat0 = LocusIdCompat.toLocusIdCompat(k.e(shortcutInfo0));
            }
            shortcutInfoCompat1.m = locusIdCompat0;
            this.a.o = shortcutInfo0.getRank();
            this.a.p = shortcutInfo0.getExtras();
        }

        public Builder(@NonNull Context context0, @NonNull String s) {
            ShortcutInfoCompat shortcutInfoCompat0 = new ShortcutInfoCompat();
            this.a = shortcutInfoCompat0;
            shortcutInfoCompat0.a = context0;
            shortcutInfoCompat0.b = s;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull ShortcutInfoCompat shortcutInfoCompat0) {
            ShortcutInfoCompat shortcutInfoCompat1 = new ShortcutInfoCompat();
            this.a = shortcutInfoCompat1;
            shortcutInfoCompat1.a = shortcutInfoCompat0.a;
            shortcutInfoCompat1.b = shortcutInfoCompat0.b;
            shortcutInfoCompat1.c = shortcutInfoCompat0.c;
            shortcutInfoCompat1.d = (Intent[])Arrays.copyOf(shortcutInfoCompat0.d, shortcutInfoCompat0.d.length);
            shortcutInfoCompat1.e = shortcutInfoCompat0.e;
            shortcutInfoCompat1.f = shortcutInfoCompat0.f;
            shortcutInfoCompat1.g = shortcutInfoCompat0.g;
            shortcutInfoCompat1.h = shortcutInfoCompat0.h;
            shortcutInfoCompat1.A = shortcutInfoCompat0.A;
            shortcutInfoCompat1.i = shortcutInfoCompat0.i;
            shortcutInfoCompat1.j = shortcutInfoCompat0.j;
            shortcutInfoCompat1.s = shortcutInfoCompat0.s;
            shortcutInfoCompat1.r = shortcutInfoCompat0.r;
            shortcutInfoCompat1.t = shortcutInfoCompat0.t;
            shortcutInfoCompat1.u = shortcutInfoCompat0.u;
            shortcutInfoCompat1.v = shortcutInfoCompat0.v;
            shortcutInfoCompat1.w = shortcutInfoCompat0.w;
            shortcutInfoCompat1.x = shortcutInfoCompat0.x;
            shortcutInfoCompat1.y = shortcutInfoCompat0.y;
            shortcutInfoCompat1.m = shortcutInfoCompat0.m;
            shortcutInfoCompat1.n = shortcutInfoCompat0.n;
            shortcutInfoCompat1.z = shortcutInfoCompat0.z;
            shortcutInfoCompat1.o = shortcutInfoCompat0.o;
            Person[] arr_person = shortcutInfoCompat0.k;
            if(arr_person != null) {
                shortcutInfoCompat1.k = (Person[])Arrays.copyOf(arr_person, arr_person.length);
            }
            if(shortcutInfoCompat0.l != null) {
                shortcutInfoCompat1.l = new HashSet(shortcutInfoCompat0.l);
            }
            PersistableBundle persistableBundle0 = shortcutInfoCompat0.p;
            if(persistableBundle0 != null) {
                shortcutInfoCompat1.p = persistableBundle0;
            }
            shortcutInfoCompat1.B = shortcutInfoCompat0.B;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @NonNull
        public Builder addCapabilityBinding(@NonNull String s) {
            if(this.c == null) {
                this.c = new HashSet();
            }
            this.c.add(s);
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @NonNull
        public Builder addCapabilityBinding(@NonNull String s, @NonNull String s1, @NonNull List list0) {
            this.addCapabilityBinding(s);
            if(!list0.isEmpty()) {
                if(this.d == null) {
                    this.d = new HashMap();
                }
                if(this.d.get(s) == null) {
                    this.d.put(s, new HashMap());
                }
                ((Map)this.d.get(s)).put(s1, list0);
            }
            return this;
        }

        @NonNull
        public ShortcutInfoCompat build() {
            ShortcutInfoCompat shortcutInfoCompat0 = this.a;
            if(TextUtils.isEmpty(shortcutInfoCompat0.f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            if(shortcutInfoCompat0.d == null || shortcutInfoCompat0.d.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if(this.b) {
                if(shortcutInfoCompat0.m == null) {
                    shortcutInfoCompat0.m = new LocusIdCompat(shortcutInfoCompat0.b);
                }
                shortcutInfoCompat0.n = true;
            }
            if(this.c != null) {
                if(shortcutInfoCompat0.l == null) {
                    shortcutInfoCompat0.l = new HashSet();
                }
                shortcutInfoCompat0.l.addAll(this.c);
            }
            if(this.d != null) {
                if(shortcutInfoCompat0.p == null) {
                    shortcutInfoCompat0.p = new PersistableBundle();
                }
                for(Object object0: this.d.keySet()) {
                    String s = (String)object0;
                    Map map0 = (Map)this.d.get(s);
                    Set set0 = map0.keySet();
                    shortcutInfoCompat0.p.putStringArray(s, ((String[])set0.toArray(new String[0])));
                    for(Object object1: map0.keySet()) {
                        List list0 = (List)map0.get(((String)object1));
                        shortcutInfoCompat0.p.putStringArray(b.m(s, "/", ((String)object1)), (list0 == null ? new String[0] : ((String[])list0.toArray(new String[0]))));
                    }
                }
            }
            if(this.e != null) {
                if(shortcutInfoCompat0.p == null) {
                    shortcutInfoCompat0.p = new PersistableBundle();
                }
                shortcutInfoCompat0.p.putString("extraSliceUri", UriCompat.toSafeString(this.e));
            }
            return shortcutInfoCompat0;
        }

        @NonNull
        public Builder setActivity(@NonNull ComponentName componentName0) {
            this.a.e = componentName0;
            return this;
        }

        @NonNull
        public Builder setAlwaysBadged() {
            this.a.j = true;
            return this;
        }

        @NonNull
        public Builder setCategories(@NonNull Set set0) {
            ArraySet arraySet0 = new ArraySet();
            arraySet0.addAll(set0);
            this.a.l = arraySet0;
            return this;
        }

        @NonNull
        public Builder setDisabledMessage(@NonNull CharSequence charSequence0) {
            this.a.h = charSequence0;
            return this;
        }

        @NonNull
        public Builder setExcludedFromSurfaces(int v) {
            this.a.B = v;
            return this;
        }

        @NonNull
        public Builder setExtras(@NonNull PersistableBundle persistableBundle0) {
            this.a.p = persistableBundle0;
            return this;
        }

        @NonNull
        public Builder setIcon(IconCompat iconCompat0) {
            this.a.i = iconCompat0;
            return this;
        }

        @NonNull
        public Builder setIntent(@NonNull Intent intent0) {
            return this.setIntents(new Intent[]{intent0});
        }

        @NonNull
        public Builder setIntents(@NonNull Intent[] arr_intent) {
            this.a.d = arr_intent;
            return this;
        }

        @NonNull
        public Builder setIsConversation() {
            this.b = true;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable LocusIdCompat locusIdCompat0) {
            this.a.m = locusIdCompat0;
            return this;
        }

        @NonNull
        public Builder setLongLabel(@NonNull CharSequence charSequence0) {
            this.a.g = charSequence0;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setLongLived() {
            this.a.n = true;
            return this;
        }

        @NonNull
        public Builder setLongLived(boolean z) {
            this.a.n = z;
            return this;
        }

        @NonNull
        public Builder setPerson(@NonNull Person person0) {
            return this.setPersons(new Person[]{person0});
        }

        @NonNull
        public Builder setPersons(@NonNull Person[] arr_person) {
            this.a.k = arr_person;
            return this;
        }

        @NonNull
        public Builder setRank(int v) {
            this.a.o = v;
            return this;
        }

        @NonNull
        public Builder setShortLabel(@NonNull CharSequence charSequence0) {
            this.a.f = charSequence0;
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @NonNull
        public Builder setSliceUri(@NonNull Uri uri0) {
            this.e = uri0;
            return this;
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public Builder setTransientExtras(@NonNull Bundle bundle0) {
            this.a.q = (Bundle)Preconditions.checkNotNull(bundle0);
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Surface {
    }

    public int A;
    public int B;
    public static final int SURFACE_LAUNCHER = 1;
    public Context a;
    public String b;
    public String c;
    public Intent[] d;
    public ComponentName e;
    public CharSequence f;
    public CharSequence g;
    public CharSequence h;
    public IconCompat i;
    public boolean j;
    public Person[] k;
    public Set l;
    public LocusIdCompat m;
    public boolean n;
    public int o;
    public PersistableBundle p;
    public Bundle q;
    public long r;
    public UserHandle s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ShortcutInfoCompat() {
        this.y = true;
    }

    public static ArrayList a(Context context0, List list0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            arrayList0.add(new Builder(context0, ((ShortcutInfo)object0)).build());
        }
        return arrayList0;
    }

    @Nullable
    public ComponentName getActivity() {
        return this.e;
    }

    @Nullable
    public Set getCategories() {
        return this.l;
    }

    @Nullable
    public CharSequence getDisabledMessage() {
        return this.h;
    }

    public int getDisabledReason() {
        return this.A;
    }

    public int getExcludedFromSurfaces() {
        return this.B;
    }

    @Nullable
    public PersistableBundle getExtras() {
        return this.p;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public IconCompat getIcon() {
        return this.i;
    }

    @NonNull
    public String getId() {
        return this.b;
    }

    @NonNull
    public Intent getIntent() {
        return this.d[this.d.length - 1];
    }

    @NonNull
    public Intent[] getIntents() {
        return (Intent[])Arrays.copyOf(this.d, this.d.length);
    }

    public long getLastChangedTimestamp() {
        return this.r;
    }

    @Nullable
    public LocusIdCompat getLocusId() {
        return this.m;
    }

    @Nullable
    public CharSequence getLongLabel() {
        return this.g;
    }

    @NonNull
    public String getPackage() {
        return this.c;
    }

    public int getRank() {
        return this.o;
    }

    @NonNull
    public CharSequence getShortLabel() {
        return this.f;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public Bundle getTransientExtras() {
        return this.q;
    }

    @Nullable
    public UserHandle getUserHandle() {
        return this.s;
    }

    public boolean hasKeyFieldsOnly() {
        return this.z;
    }

    public boolean isCached() {
        return this.t;
    }

    public boolean isDeclaredInManifest() {
        return this.w;
    }

    public boolean isDynamic() {
        return this.u;
    }

    public boolean isEnabled() {
        return this.y;
    }

    public boolean isExcludedFromSurfaces(int v) {
        return (v & this.B) != 0;
    }

    public boolean isImmutable() {
        return this.x;
    }

    public boolean isPinned() {
        return this.v;
    }

    @RequiresApi(25)
    public ShortcutInfo toShortcutInfo() {
        ShortcutInfo.Builder shortcutInfo$Builder0 = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.f).setIntents(this.d);
        IconCompat iconCompat0 = this.i;
        if(iconCompat0 != null) {
            shortcutInfo$Builder0.setIcon(iconCompat0.toIcon(this.a));
        }
        if(!TextUtils.isEmpty(this.g)) {
            shortcutInfo$Builder0.setLongLabel(this.g);
        }
        if(!TextUtils.isEmpty(this.h)) {
            shortcutInfo$Builder0.setDisabledMessage(this.h);
        }
        ComponentName componentName0 = this.e;
        if(componentName0 != null) {
            shortcutInfo$Builder0.setActivity(componentName0);
        }
        Set set0 = this.l;
        if(set0 != null) {
            shortcutInfo$Builder0.setCategories(set0);
        }
        shortcutInfo$Builder0.setRank(this.o);
        PersistableBundle persistableBundle0 = this.p;
        if(persistableBundle0 != null) {
            shortcutInfo$Builder0.setExtras(persistableBundle0);
        }
        int v = 0;
        if(Build.VERSION.SDK_INT >= 29) {
            Person[] arr_person = this.k;
            if(arr_person != null && arr_person.length > 0) {
                android.app.Person[] arr_person1 = new android.app.Person[arr_person.length];
                while(v < arr_person.length) {
                    arr_person1[v] = this.k[v].toAndroidPerson();
                    ++v;
                }
                k.s(shortcutInfo$Builder0, arr_person1);
            }
            LocusIdCompat locusIdCompat0 = this.m;
            if(locusIdCompat0 != null) {
                k.q(shortcutInfo$Builder0, locusIdCompat0.toLocusId());
            }
            k.r(shortcutInfo$Builder0, this.n);
        }
        else {
            if(this.p == null) {
                this.p = new PersistableBundle();
            }
            Person[] arr_person2 = this.k;
            if(arr_person2 != null && arr_person2.length > 0) {
                this.p.putInt("extraPersonCount", arr_person2.length);
                while(v < this.k.length) {
                    this.p.putPersistableBundle("extraPerson_" + (v + 1), this.k[v].toPersistableBundle());
                    ++v;
                }
            }
            LocusIdCompat locusIdCompat1 = this.m;
            if(locusIdCompat1 != null) {
                this.p.putString("extraLocusId", locusIdCompat1.getId());
            }
            this.p.putBoolean("extraLongLived", this.n);
            shortcutInfo$Builder0.setExtras(this.p);
        }
        if(Build.VERSION.SDK_INT >= 33) {
            c.a(shortcutInfo$Builder0, this.B);
        }
        return shortcutInfo$Builder0.build();
    }
}

