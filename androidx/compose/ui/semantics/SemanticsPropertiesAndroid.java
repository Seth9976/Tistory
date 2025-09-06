package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import g2.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001R&\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId$annotations", "()V", "TestTagsAsResourceId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsPropertiesAndroid {
    public static final int $stable;
    @NotNull
    public static final SemanticsPropertiesAndroid INSTANCE;
    public static final SemanticsPropertyKey a;

    static {
        SemanticsPropertiesAndroid.INSTANCE = new SemanticsPropertiesAndroid();  // 初始化器: Ljava/lang/Object;-><init>()V
        SemanticsPropertiesAndroid.a = new SemanticsPropertyKey("TestTagsAsResourceId", false, c.I);
        SemanticsPropertiesAndroid.$stable = 8;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final SemanticsPropertyKey getTestTagsAsResourceId() {
        return SemanticsPropertiesAndroid.a;
    }

    @ExperimentalComposeUiApi
    public static void getTestTagsAsResourceId$annotations() {
    }
}

