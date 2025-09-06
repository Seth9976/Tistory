package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class o0 {
    @DoNotInline
    @Nullable
    public static String[] a(@NonNull View view0) {
        return view0.getReceiveContentMimeTypes();
    }

    @DoNotInline
    @Nullable
    public static ContentInfoCompat b(@NonNull View view0, @NonNull ContentInfoCompat contentInfoCompat0) {
        ContentInfo contentInfo0 = contentInfoCompat0.toContentInfo();
        ContentInfo contentInfo1 = view0.performReceiveContent(contentInfo0);
        if(contentInfo1 == null) {
            return null;
        }
        return contentInfo1 == contentInfo0 ? contentInfoCompat0 : ContentInfoCompat.toContentInfoCompat(contentInfo1);
    }

    @DoNotInline
    public static void c(@NonNull View view0, @Nullable String[] arr_s, @Nullable OnReceiveContentListener onReceiveContentListener0) {
        if(onReceiveContentListener0 == null) {
            view0.setOnReceiveContentListener(arr_s, null);
            return;
        }
        view0.setOnReceiveContentListener(arr_s, new p0(onReceiveContentListener0));
    }
}

