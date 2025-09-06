package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DefaultEmojiCompatConfig {
    @RestrictTo({Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigFactory {
        public final DefaultEmojiCompatConfigHelper a;

        @RestrictTo({Scope.LIBRARY})
        public DefaultEmojiCompatConfigFactory(@Nullable DefaultEmojiCompatConfigHelper defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0) {
            if(defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0 == null) {
                defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0 = Build.VERSION.SDK_INT >= 28 ? new DefaultEmojiCompatConfigHelper_API28() : new DefaultEmojiCompatConfigHelper_API19();
            }
            this.a = defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0;
        }

        @Nullable
        @RestrictTo({Scope.LIBRARY})
        public Config create(@NonNull Context context0) {
            FontRequest fontRequest0;
            ProviderInfo providerInfo0 = null;
            PackageManager packageManager0 = context0.getPackageManager();
            Preconditions.checkNotNull(packageManager0, "Package manager required to locate emoji font provider");
            Intent intent0 = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
            DefaultEmojiCompatConfigHelper defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0 = this.a;
            for(Object object0: defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0.queryIntentContentProviders(packageManager0, intent0, 0)) {
                ProviderInfo providerInfo1 = defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0.getProviderInfo(((ResolveInfo)object0));
                if(providerInfo1 != null && (providerInfo1.applicationInfo != null && (providerInfo1.applicationInfo.flags & 1) == 1)) {
                    providerInfo0 = providerInfo1;
                    break;
                }
            }
            if(providerInfo0 == null) {
                fontRequest0 = null;
            }
            else {
                try {
                    String s = providerInfo0.authority;
                    String s1 = providerInfo0.packageName;
                    Signature[] arr_signature = defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0.getSigningSignatures(packageManager0, s1);
                    ArrayList arrayList0 = new ArrayList();
                    for(int v = 0; v < arr_signature.length; ++v) {
                        arrayList0.add(arr_signature[v].toByteArray());
                    }
                    fontRequest0 = new FontRequest(s, s1, "emojicompat-emoji-font", Collections.singletonList(arrayList0));
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.wtf("emoji2.text.DefaultEmojiConfig", packageManager$NameNotFoundException0);
                    fontRequest0 = null;
                }
            }
            return fontRequest0 != null ? new FontRequestEmojiCompatConfig(context0, fontRequest0) : null;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper {
        @Nullable
        public ProviderInfo getProviderInfo(@NonNull ResolveInfo resolveInfo0) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @NonNull
        public Signature[] getSigningSignatures(@NonNull PackageManager packageManager0, @NonNull String s) throws PackageManager.NameNotFoundException {
            return packageManager0.getPackageInfo(s, 0x40).signatures;
        }

        @NonNull
        public List queryIntentContentProviders(@NonNull PackageManager packageManager0, @NonNull Intent intent0, int v) {
            return Collections.emptyList();
        }
    }

    @RequiresApi(19)
    @RestrictTo({Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override  // androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
        @Nullable
        public ProviderInfo getProviderInfo(@NonNull ResolveInfo resolveInfo0) {
            return resolveInfo0.providerInfo;
        }

        @Override  // androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
        @NonNull
        public List queryIntentContentProviders(@NonNull PackageManager packageManager0, @NonNull Intent intent0, int v) {
            return packageManager0.queryIntentContentProviders(intent0, v);
        }
    }

    @RequiresApi(28)
    @RestrictTo({Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override  // androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
        @NonNull
        public Signature[] getSigningSignatures(@NonNull PackageManager packageManager0, @NonNull String s) throws PackageManager.NameNotFoundException {
            return packageManager0.getPackageInfo(s, 0x40).signatures;
        }
    }

    @Nullable
    public static FontRequestEmojiCompatConfig create(@NonNull Context context0) {
        return (FontRequestEmojiCompatConfig)new DefaultEmojiCompatConfigFactory(null).create(context0);
    }
}

