package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "", "value", "Landroid/text/Layout$Alignment;", "get", "(I)Landroid/text/Layout$Alignment;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextAlignmentAdapter {
    public static final int $stable;
    @NotNull
    public static final TextAlignmentAdapter INSTANCE;
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        TextAlignmentAdapter.INSTANCE = new TextAlignmentAdapter();  // 初始化器: Ljava/lang/Object;-><init>()V
        Layout.Alignment[] arr_layout$Alignment = Layout.Alignment.values();
        Layout.Alignment layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment layout$Alignment1 = layout$Alignment0;
        for(int v = 0; v < arr_layout$Alignment.length; ++v) {
            Layout.Alignment layout$Alignment2 = arr_layout$Alignment[v];
            if(Intrinsics.areEqual(layout$Alignment2.name(), "ALIGN_LEFT")) {
                layout$Alignment0 = layout$Alignment2;
            }
            else if(Intrinsics.areEqual(layout$Alignment2.name(), "ALIGN_RIGHT")) {
                layout$Alignment1 = layout$Alignment2;
            }
        }
        TextAlignmentAdapter.a = layout$Alignment0;
        TextAlignmentAdapter.b = layout$Alignment1;
    }

    @NotNull
    public final Layout.Alignment get(int v) {
        switch(v) {
            case 0: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case 1: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 2: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 3: {
                return TextAlignmentAdapter.a;
            }
            case 4: {
                return TextAlignmentAdapter.b;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }
}

