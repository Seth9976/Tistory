package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RequiresApi(24)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LocaleListHelper;", "", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "", "setHintLocales", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/intl/LocaleList;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,221:1\n1549#2:222\n1620#2,3:223\n37#3,2:226\n*S KotlinDebug\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n*L\n193#1:222\n193#1:223,3\n193#1:226,2\n*E\n"})
public final class LocaleListHelper {
    public static final int $stable;
    @NotNull
    public static final LocaleListHelper INSTANCE;

    static {
        LocaleListHelper.INSTANCE = new LocaleListHelper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setHintLocales(@NotNull EditorInfo editorInfo0, @NotNull LocaleList localeList0) {
        if(Intrinsics.areEqual(localeList0, LocaleList.Companion.getEmpty())) {
            editorInfo0.hintLocales = null;
            return;
        }
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(localeList0, 10));
        for(Object object0: localeList0) {
            arrayList0.add(((Locale)object0).getPlatformLocale());
        }
        java.util.Locale[] arr_locale = (java.util.Locale[])arrayList0.toArray(new java.util.Locale[0]);
        editorInfo0.hintLocales = new android.os.LocaleList(((java.util.Locale[])Arrays.copyOf(arr_locale, arr_locale.length)));
    }
}

