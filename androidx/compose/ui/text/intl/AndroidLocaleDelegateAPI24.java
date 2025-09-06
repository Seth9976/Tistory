package androidx.compose.ui.text.intl;

import android.os.LocaleList;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(api = 24)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001B\u0010\b\u001A\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "<init>", "()V", "", "languageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "parseLanguageTag", "(Ljava/lang/String;)Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    public static final int $stable = 8;
    public LocaleList a;
    public androidx.compose.ui.text.intl.LocaleList b;
    public final SynchronizedObject c;

    public AndroidLocaleDelegateAPI24() {
        this.c = Synchronization_jvmKt.createSynchronizedObject();
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public androidx.compose.ui.text.intl.LocaleList getCurrent() {
        LocaleList localeList0 = LocaleList.getDefault();
        synchronized(this.c) {
            androidx.compose.ui.text.intl.LocaleList localeList1 = this.b;
            if(localeList1 != null && localeList0 == this.a) {
                return localeList1;
            }
            int v1 = localeList0.size();
            ArrayList arrayList0 = new ArrayList(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                arrayList0.add(new Locale(localeList0.get(v2)));
            }
            androidx.compose.ui.text.intl.LocaleList localeList2 = new androidx.compose.ui.text.intl.LocaleList(arrayList0);
            this.a = localeList0;
            this.b = localeList2;
            return localeList2;
        }
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public java.util.Locale parseLanguageTag(@NotNull String s) {
        java.util.Locale locale0 = java.util.Locale.forLanguageTag(s);
        if(Intrinsics.areEqual(locale0.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + s + " is not well-formed. Locale is resolved to Undetermined. Note that underscore \'_\' is not a valid subtag delimiter and must be replaced with \'-\'.");
        }
        return locale0;
    }
}

