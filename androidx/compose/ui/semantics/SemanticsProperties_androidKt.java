package androidx.compose.ui.semantics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\"5\u0010\u0002\u001A\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\u00018G@GX\u0087\u008E\u0002¢\u0006\u0018\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000B*\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"<set-?>", "", "testTagsAsResourceId", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getTestTagsAsResourceId$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getTestTagsAsResourceId$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsProperties_androidKt {
    public static final KProperty[] a;

    static {
        SemanticsProperties_androidKt.a = new KProperty[]{a.s(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};
    }

    @ExperimentalComposeUiApi
    public static final boolean getTestTagsAsResourceId(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Boolean)SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver0, SemanticsProperties_androidKt.a[0])).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static void getTestTagsAsResourceId$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
    }

    @ExperimentalComposeUiApi
    public static final void setTestTagsAsResourceId(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver0, SemanticsProperties_androidKt.a[0], Boolean.valueOf(z));
    }
}

