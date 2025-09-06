package androidx.core.view;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View.DragShadowBuilder;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class i0 {
    @DoNotInline
    public static void a(@NonNull View view0) {
        view0.cancelDragAndDrop();
    }

    @DoNotInline
    public static void b(View view0) {
        view0.dispatchFinishTemporaryDetach();
    }

    @DoNotInline
    public static void c(View view0) {
        view0.dispatchStartTemporaryDetach();
    }

    @DoNotInline
    public static void d(@NonNull View view0, PointerIcon pointerIcon0) {
        view0.setPointerIcon(pointerIcon0);
    }

    @DoNotInline
    public static boolean e(@NonNull View view0, @Nullable ClipData clipData0, @NonNull View.DragShadowBuilder view$DragShadowBuilder0, @Nullable Object object0, int v) {
        return view0.startDragAndDrop(clipData0, view$DragShadowBuilder0, object0, v);
    }

    @DoNotInline
    public static void f(@NonNull View view0, @NonNull View.DragShadowBuilder view$DragShadowBuilder0) {
        view0.updateDragShadow(view$DragShadowBuilder0);
    }
}

