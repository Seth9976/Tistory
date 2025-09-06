package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RequiresApi(24)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "localeSpan", "(Landroidx/compose/ui/text/intl/LocaleList;)Ljava/lang/Object;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "", "setTextLocales", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/intl/LocaleList;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,47:1\n1549#2:48\n1620#2,3:49\n1549#2:54\n1620#2,3:55\n37#3,2:52\n37#3,2:58\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n36#1:48\n36#1:49,3\n43#1:54\n43#1:55,3\n36#1:52,2\n43#1:58,2\n*E\n"})
public final class LocaleListHelperMethods {
    public static final int $stable;
    @NotNull
    public static final LocaleListHelperMethods INSTANCE;

    static {
        LocaleListHelperMethods.INSTANCE = new LocaleListHelperMethods();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(24)
    @NotNull
    public final Object localeSpan(@NotNull LocaleList localeList0) {
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(localeList0, 10));
        for(Object object0: localeList0) {
            arrayList0.add(((Locale)object0).getPlatformLocale());
        }
        java.util.Locale[] arr_locale = (java.util.Locale[])arrayList0.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList(((java.util.Locale[])Arrays.copyOf(arr_locale, arr_locale.length))));
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setTextLocales(@NotNull AndroidTextPaint androidTextPaint0, @NotNull LocaleList localeList0) {
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(localeList0, 10));
        for(Object object0: localeList0) {
            arrayList0.add(((Locale)object0).getPlatformLocale());
        }
        java.util.Locale[] arr_locale = (java.util.Locale[])arrayList0.toArray(new java.util.Locale[0]);
        androidTextPaint0.setTextLocales(new android.os.LocaleList(((java.util.Locale[])Arrays.copyOf(arr_locale, arr_locale.length))));
    }
}

