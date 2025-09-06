package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.impl.background.systemjob.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(28)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceHelperMethodsApi28;", "", "Landroid/graphics/Typeface;", "typeface", "", "finalFontWeight", "", "finalFontStyle", "create", "(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TypefaceHelperMethodsApi28 {
    public static final int $stable;
    @NotNull
    public static final TypefaceHelperMethodsApi28 INSTANCE;

    static {
        TypefaceHelperMethodsApi28.INSTANCE = new TypefaceHelperMethodsApi28();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(28)
    @NotNull
    public final Typeface create(@NotNull Typeface typeface0, int v, boolean z) {
        return a.i(typeface0, v, z);
    }
}

