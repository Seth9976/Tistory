package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,622:1\n26#2:623\n26#2:624\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt\n*L\n601#1:623\n602#1:624\n*E\n"})
public final class AndroidViewHolder_androidKt {
    public static final AndroidViewHolder_androidKt.NoOpScrollConnection.1 a;

    static {
        AndroidViewHolder_androidKt.a = new AndroidViewHolder_androidKt.NoOpScrollConnection.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final AndroidViewHolder_androidKt.NoOpScrollConnection.1 access$getNoOpScrollConnection$p() {
        return AndroidViewHolder_androidKt.a;
    }

    public static final void access$layoutAccordingTo(View view0, LayoutNode layoutNode0) {
        long v = LayoutCoordinatesKt.positionInRoot(layoutNode0.getCoordinates());
        int v1 = Math.round(Offset.getX-impl(v));
        int v2 = Math.round(Offset.getY-impl(v));
        view0.layout(v1, v2, view0.getMeasuredWidth() + v1, view0.getMeasuredHeight() + v2);
    }

    public static final float access$toComposeOffset(int v) [...] // Inlined contents

    public static final float access$toComposeVelocity(float f) [...] // Inlined contents

    // 去混淆评级： 中等(50)
    public static final int access$toNestedScrollSource(int v) {
        return v == 0 ? 1 : 2;
    }
}

