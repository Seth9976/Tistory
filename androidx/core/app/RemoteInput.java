package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class RemoteInput {
    public static final class Builder {
        public final String a;
        public final HashSet b;
        public final Bundle c;
        public CharSequence d;
        public CharSequence[] e;
        public boolean f;
        public int g;

        public Builder(@NonNull String s) {
            this.b = new HashSet();
            this.c = new Bundle();
            this.f = true;
            this.g = 0;
            if(s == null) {
                throw new IllegalArgumentException("Result key can\'t be null");
            }
            this.a = s;
        }

        @NonNull
        public Builder addExtras(@NonNull Bundle bundle0) {
            if(bundle0 != null) {
                this.c.putAll(bundle0);
            }
            return this;
        }

        @NonNull
        public RemoteInput build() {
            return new RemoteInput(this.a, this.d, this.e, this.f, this.g, this.c, this.b);
        }

        @NonNull
        public Bundle getExtras() {
            return this.c;
        }

        @NonNull
        public Builder setAllowDataType(@NonNull String s, boolean z) {
            HashSet hashSet0 = this.b;
            if(z) {
                hashSet0.add(s);
                return this;
            }
            hashSet0.remove(s);
            return this;
        }

        @NonNull
        public Builder setAllowFreeFormInput(boolean z) {
            this.f = z;
            return this;
        }

        @NonNull
        public Builder setChoices(@Nullable CharSequence[] arr_charSequence) {
            this.e = arr_charSequence;
            return this;
        }

        @NonNull
        public Builder setEditChoicesBeforeSending(int v) {
            this.g = v;
            return this;
        }

        @NonNull
        public Builder setLabel(@Nullable CharSequence charSequence0) {
            this.d = charSequence0;
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT;
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final HashSet g;

    public RemoteInput(String s, CharSequence charSequence0, CharSequence[] arr_charSequence, boolean z, int v, Bundle bundle0, HashSet hashSet0) {
        this.a = s;
        this.b = charSequence0;
        this.c = arr_charSequence;
        this.d = z;
        this.e = v;
        this.f = bundle0;
        this.g = hashSet0;
        if(this.getEditChoicesBeforeSending() == 2 && !this.getAllowFreeFormInput()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static android.app.RemoteInput a(RemoteInput remoteInput0) {
        RemoteInput.Builder remoteInput$Builder0 = new RemoteInput.Builder(remoteInput0.getResultKey()).setLabel(remoteInput0.getLabel()).setChoices(remoteInput0.getChoices()).setAllowFreeFormInput(remoteInput0.getAllowFreeFormInput()).addExtras(remoteInput0.getExtras());
        Set set0 = remoteInput0.getAllowedDataTypes();
        if(set0 != null) {
            for(Object object0: set0) {
                z2.d(remoteInput$Builder0, ((String)object0), true);
            }
        }
        if(Build.VERSION.SDK_INT >= 29) {
            b3.b(remoteInput$Builder0, remoteInput0.getEditChoicesBeforeSending());
        }
        return remoteInput$Builder0.build();
    }

    public static void addDataResultToIntent(@NonNull RemoteInput remoteInput0, @NonNull Intent intent0, @NonNull Map map0) {
        z2.a(remoteInput0, intent0, map0);
    }

    public static void addResultsToIntent(@NonNull RemoteInput[] arr_remoteInput, @NonNull Intent intent0, @NonNull Bundle bundle0) {
        y2.a(RemoteInput.b(arr_remoteInput), intent0, bundle0);
    }

    public static android.app.RemoteInput[] b(RemoteInput[] arr_remoteInput) {
        if(arr_remoteInput == null) {
            return null;
        }
        android.app.RemoteInput[] arr_remoteInput1 = new android.app.RemoteInput[arr_remoteInput.length];
        for(int v = 0; v < arr_remoteInput.length; ++v) {
            arr_remoteInput1[v] = RemoteInput.a(arr_remoteInput[v]);
        }
        return arr_remoteInput1;
    }

    public static Intent c(Intent intent0) {
        ClipData clipData0 = intent0.getClipData();
        if(clipData0 == null) {
            return null;
        }
        ClipDescription clipDescription0 = clipData0.getDescription();
        if(!clipDescription0.hasMimeType("text/vnd.android.intent")) {
            return null;
        }
        return clipDescription0.getLabel().toString().contentEquals("android.remoteinput.results") ? clipData0.getItemAt(0).getIntent() : null;
    }

    public boolean getAllowFreeFormInput() {
        return this.d;
    }

    @Nullable
    public Set getAllowedDataTypes() {
        return this.g;
    }

    @Nullable
    public CharSequence[] getChoices() {
        return this.c;
    }

    @Nullable
    public static Map getDataResultsFromIntent(@NonNull Intent intent0, @NonNull String s) {
        return z2.c(intent0, s);
    }

    public int getEditChoicesBeforeSending() {
        return this.e;
    }

    @NonNull
    public Bundle getExtras() {
        return this.f;
    }

    @Nullable
    public CharSequence getLabel() {
        return this.b;
    }

    @NonNull
    public String getResultKey() {
        return this.a;
    }

    @Nullable
    public static Bundle getResultsFromIntent(@NonNull Intent intent0) {
        return y2.b(intent0);
    }

    public static int getResultsSource(@NonNull Intent intent0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return a3.a(intent0);
        }
        Intent intent1 = RemoteInput.c(intent0);
        return intent1 == null ? 0 : intent1.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    // 去混淆评级： 低(30)
    public boolean isDataOnly() {
        return !this.getAllowFreeFormInput() && (this.getChoices() == null || this.getChoices().length == 0) && this.getAllowedDataTypes() != null && !this.getAllowedDataTypes().isEmpty();
    }

    public static void setResultsSource(@NonNull Intent intent0, int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            a3.b(intent0, v);
            return;
        }
        Intent intent1 = RemoteInput.c(intent0);
        if(intent1 == null) {
            intent1 = new Intent();
        }
        intent1.putExtra("android.remoteinput.resultsSource", v);
        intent0.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
    }
}

