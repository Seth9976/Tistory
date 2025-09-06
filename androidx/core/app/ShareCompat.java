package androidx.core.app;

import android.app.Activity;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.util.Preconditions;
import java.util.ArrayList;

public final class ShareCompat {
    public static class IntentBuilder {
        public final Context a;
        public final Intent b;
        public CharSequence c;
        public ArrayList d;
        public ArrayList e;
        public ArrayList f;
        public ArrayList g;

        public IntentBuilder(@NonNull Context context0) {
            Activity activity0;
            this.a = (Context)Preconditions.checkNotNull(context0);
            Intent intent0 = new Intent().setAction("android.intent.action.SEND");
            this.b = intent0;
            intent0.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", "net.daum.android.tistoryapp");
            intent0.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", "net.daum.android.tistoryapp");
            intent0.addFlags(0x80000);
            while(true) {
                activity0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Activity) {
                    activity0 = (Activity)context0;
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
            }
            if(activity0 != null) {
                ComponentName componentName0 = activity0.getComponentName();
                this.b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName0);
                this.b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName0);
            }
        }

        public final void a(String s, ArrayList arrayList0) {
            Intent intent0 = this.b;
            String[] arr_s = intent0.getStringArrayExtra(s);
            int v = arr_s == null ? 0 : arr_s.length;
            String[] arr_s1 = new String[arrayList0.size() + v];
            arrayList0.toArray(arr_s1);
            if(arr_s != null) {
                System.arraycopy(arr_s, 0, arr_s1, arrayList0.size(), v);
            }
            intent0.putExtra(s, arr_s1);
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String s) {
            if(this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add(s);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String[] arr_s) {
            this.b("android.intent.extra.BCC", arr_s);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String s) {
            if(this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(s);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String[] arr_s) {
            this.b("android.intent.extra.CC", arr_s);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String s) {
            if(this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(s);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String[] arr_s) {
            this.b("android.intent.extra.EMAIL", arr_s);
            return this;
        }

        @NonNull
        public IntentBuilder addStream(@NonNull Uri uri0) {
            if(this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(uri0);
            return this;
        }

        public final void b(String s, String[] arr_s) {
            Intent intent0 = this.getIntent();
            String[] arr_s1 = intent0.getStringArrayExtra(s);
            int v = arr_s1 == null ? 0 : arr_s1.length;
            String[] arr_s2 = new String[arr_s.length + v];
            if(arr_s1 != null) {
                System.arraycopy(arr_s1, 0, arr_s2, 0, v);
            }
            System.arraycopy(arr_s, 0, arr_s2, v, arr_s.length);
            intent0.putExtra(s, arr_s2);
        }

        @NonNull
        public Intent createChooserIntent() {
            return Intent.createChooser(this.getIntent(), this.c);
        }

        @NonNull
        @Deprecated
        public static IntentBuilder from(@NonNull Activity activity0) {
            return new IntentBuilder(activity0);
        }

        @NonNull
        public Intent getIntent() {
            ArrayList arrayList0 = this.d;
            if(arrayList0 != null) {
                this.a("android.intent.extra.EMAIL", arrayList0);
                this.d = null;
            }
            ArrayList arrayList1 = this.e;
            if(arrayList1 != null) {
                this.a("android.intent.extra.CC", arrayList1);
                this.e = null;
            }
            ArrayList arrayList2 = this.f;
            if(arrayList2 != null) {
                this.a("android.intent.extra.BCC", arrayList2);
                this.f = null;
            }
            Intent intent0 = this.b;
            if(this.g != null && this.g.size() > 1) {
                intent0.setAction("android.intent.action.SEND_MULTIPLE");
                intent0.putParcelableArrayListExtra("android.intent.extra.STREAM", this.g);
                ShareCompat.a(intent0, this.g);
                return intent0;
            }
            intent0.setAction("android.intent.action.SEND");
            if(this.g != null && !this.g.isEmpty()) {
                intent0.putExtra("android.intent.extra.STREAM", ((Parcelable)this.g.get(0)));
                ShareCompat.a(intent0, this.g);
                return intent0;
            }
            intent0.removeExtra("android.intent.extra.STREAM");
            intent0.setClipData(null);
            intent0.setFlags(intent0.getFlags() & -2);
            return intent0;
        }

        @NonNull
        public IntentBuilder setChooserTitle(@StringRes int v) {
            return this.setChooserTitle(this.a.getText(v));
        }

        @NonNull
        public IntentBuilder setChooserTitle(@Nullable CharSequence charSequence0) {
            this.c = charSequence0;
            return this;
        }

        @NonNull
        public IntentBuilder setEmailBcc(@Nullable String[] arr_s) {
            this.b.putExtra("android.intent.extra.BCC", arr_s);
            return this;
        }

        @NonNull
        public IntentBuilder setEmailCc(@Nullable String[] arr_s) {
            this.b.putExtra("android.intent.extra.CC", arr_s);
            return this;
        }

        @NonNull
        public IntentBuilder setEmailTo(@Nullable String[] arr_s) {
            if(this.d != null) {
                this.d = null;
            }
            this.b.putExtra("android.intent.extra.EMAIL", arr_s);
            return this;
        }

        @NonNull
        public IntentBuilder setHtmlText(@Nullable String s) {
            this.b.putExtra("android.intent.extra.HTML_TEXT", s);
            if(!this.b.hasExtra("android.intent.extra.TEXT")) {
                this.setText(Html.fromHtml(s));
            }
            return this;
        }

        @NonNull
        public IntentBuilder setStream(@Nullable Uri uri0) {
            this.g = null;
            if(uri0 != null) {
                this.addStream(uri0);
            }
            return this;
        }

        @NonNull
        public IntentBuilder setSubject(@Nullable String s) {
            this.b.putExtra("android.intent.extra.SUBJECT", s);
            return this;
        }

        @NonNull
        public IntentBuilder setText(@Nullable CharSequence charSequence0) {
            this.b.putExtra("android.intent.extra.TEXT", charSequence0);
            return this;
        }

        @NonNull
        public IntentBuilder setType(@Nullable String s) {
            this.b.setType(s);
            return this;
        }

        public void startChooser() {
            Intent intent0 = this.createChooserIntent();
            this.a.startActivity(intent0);
        }
    }

    public static class IntentReader {
        public final Context a;
        public final Intent b;
        public final String c;
        public final ComponentName d;
        public ArrayList e;

        public IntentReader(@NonNull Activity activity0) {
            this(((Context)Preconditions.checkNotNull(activity0)), activity0.getIntent());
        }

        public IntentReader(@NonNull Context context0, @NonNull Intent intent0) {
            this.a = (Context)Preconditions.checkNotNull(context0);
            this.b = (Intent)Preconditions.checkNotNull(intent0);
            String s = intent0.getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE");
            if(s == null) {
                s = intent0.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
            }
            this.c = s;
            ComponentName componentName0 = (ComponentName)intent0.getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY");
            if(componentName0 == null) {
                componentName0 = (ComponentName)intent0.getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY");
            }
            this.d = componentName0;
        }

        @NonNull
        @Deprecated
        public static IntentReader from(@NonNull Activity activity0) {
            return new IntentReader(activity0);
        }

        @Nullable
        public ComponentName getCallingActivity() {
            return this.d;
        }

        @Nullable
        public Drawable getCallingActivityIcon() {
            ComponentName componentName0 = this.d;
            if(componentName0 == null) {
                return null;
            }
            PackageManager packageManager0 = this.a.getPackageManager();
            try {
                return packageManager0.getActivityIcon(componentName0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("IntentReader", "Could not retrieve icon for calling activity", packageManager$NameNotFoundException0);
                return null;
            }
        }

        @Nullable
        public Drawable getCallingApplicationIcon() {
            String s = this.c;
            if(s == null) {
                return null;
            }
            PackageManager packageManager0 = this.a.getPackageManager();
            try {
                return packageManager0.getApplicationIcon(s);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("IntentReader", "Could not retrieve icon for calling application", packageManager$NameNotFoundException0);
                return null;
            }
        }

        @Nullable
        public CharSequence getCallingApplicationLabel() {
            String s = this.c;
            if(s == null) {
                return null;
            }
            PackageManager packageManager0 = this.a.getPackageManager();
            try {
                return packageManager0.getApplicationLabel(packageManager0.getApplicationInfo(s, 0));
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("IntentReader", "Could not retrieve label for calling application", packageManager$NameNotFoundException0);
                return null;
            }
        }

        @Nullable
        public String getCallingPackage() {
            return this.c;
        }

        @Nullable
        public String[] getEmailBcc() {
            return this.b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @Nullable
        public String[] getEmailCc() {
            return this.b.getStringArrayExtra("android.intent.extra.CC");
        }

        @Nullable
        public String[] getEmailTo() {
            return this.b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @Nullable
        public String getHtmlText() {
            String s = this.b.getStringExtra("android.intent.extra.HTML_TEXT");
            if(s == null) {
                CharSequence charSequence0 = this.getText();
                if(charSequence0 instanceof Spanned) {
                    return Html.toHtml(((Spanned)charSequence0));
                }
                return charSequence0 == null ? null : Html.escapeHtml(charSequence0);
            }
            return s;
        }

        @Nullable
        public Uri getStream() {
            return (Uri)this.b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @Nullable
        public Uri getStream(int v) {
            Intent intent0 = this.b;
            if(this.e == null && this.isMultipleShare()) {
                this.e = intent0.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList0 = this.e;
            if(arrayList0 != null) {
                return (Uri)arrayList0.get(v);
            }
            if(v != 0) {
                throw new IndexOutOfBoundsException("Stream items available: " + this.getStreamCount() + " index requested: " + v);
            }
            return (Uri)intent0.getParcelableExtra("android.intent.extra.STREAM");
        }

        public int getStreamCount() {
            Intent intent0 = this.b;
            if(this.e == null && this.isMultipleShare()) {
                this.e = intent0.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList0 = this.e;
            return arrayList0 != null ? arrayList0.size() : intent0.hasExtra("android.intent.extra.STREAM");
        }

        @Nullable
        public String getSubject() {
            return this.b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @Nullable
        public CharSequence getText() {
            return this.b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @Nullable
        public String getType() {
            return this.b.getType();
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.b.getAction());
        }

        public boolean isShareIntent() {
            String s = this.b.getAction();
            return "android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s);
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.b.getAction());
        }
    }

    public static final String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    public static void a(Intent intent0, ArrayList arrayList0) {
        CharSequence charSequence0 = intent0.getCharSequenceExtra("android.intent.extra.TEXT");
        String s = intent0.getStringExtra("android.intent.extra.HTML_TEXT");
        ClipData clipData0 = new ClipData(null, new String[]{intent0.getType()}, new ClipData.Item(charSequence0, s, null, ((Uri)arrayList0.get(0))));
        int v = arrayList0.size();
        for(int v1 = 1; v1 < v; ++v1) {
            clipData0.addItem(new ClipData.Item(((Uri)arrayList0.get(v1))));
        }
        intent0.setClipData(clipData0);
        intent0.addFlags(1);
    }

    @Deprecated
    public static void configureMenuItem(@NonNull Menu menu0, @IdRes int v, @NonNull IntentBuilder shareCompat$IntentBuilder0) {
        MenuItem menuItem0 = menu0.findItem(v);
        if(menuItem0 == null) {
            throw new IllegalArgumentException("Could not find menu item with id " + v + " in the supplied menu");
        }
        ShareCompat.configureMenuItem(menuItem0, shareCompat$IntentBuilder0);
    }

    @Deprecated
    public static void configureMenuItem(@NonNull MenuItem menuItem0, @NonNull IntentBuilder shareCompat$IntentBuilder0) {
        ActionProvider actionProvider0 = menuItem0.getActionProvider();
        ShareActionProvider shareActionProvider0 = actionProvider0 instanceof ShareActionProvider ? ((ShareActionProvider)actionProvider0) : new ShareActionProvider(shareCompat$IntentBuilder0.a);
        shareActionProvider0.setShareHistoryFileName(".sharecompat_" + shareCompat$IntentBuilder0.a.getClass().getName());
        shareActionProvider0.setShareIntent(shareCompat$IntentBuilder0.getIntent());
        menuItem0.setActionProvider(shareActionProvider0);
    }

    @Nullable
    public static ComponentName getCallingActivity(@NonNull Activity activity0) {
        Intent intent0 = activity0.getIntent();
        ComponentName componentName0 = activity0.getCallingActivity();
        if(componentName0 == null) {
            componentName0 = (ComponentName)intent0.getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY");
            return componentName0 == null ? ((ComponentName)intent0.getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY")) : componentName0;
        }
        return componentName0;
    }

    @Nullable
    public static String getCallingPackage(@NonNull Activity activity0) {
        Intent intent0 = activity0.getIntent();
        String s = activity0.getCallingPackage();
        if(s == null && intent0 != null) {
            s = intent0.getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE");
            return s == null ? intent0.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE") : s;
        }
        return s;
    }
}

