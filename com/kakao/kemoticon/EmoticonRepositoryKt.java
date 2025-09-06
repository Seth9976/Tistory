package com.kakao.kemoticon;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004\u001A\u0014\u0010\u0005\u001A\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0002\u001A\n\u0010\b\u001A\u00020\u0004*\u00020\t¨\u0006\n"}, d2 = {"getDrawableFromAssets", "Landroid/graphics/drawable/BitmapDrawable;", "Landroid/content/Context;", "path", "", "toDrawable", "Landroid/graphics/drawable/Drawable;", "context", "toEmoticonSizeType", "", "kemoticon_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class EmoticonRepositoryKt {
    @NotNull
    public static final BitmapDrawable getDrawableFromAssets(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "path");
        return new BitmapDrawable(context0.getResources(), context0.getAssets().open(s));
    }

    @Nullable
    public static final Drawable toDrawable(@NotNull String s, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        if(StringsKt__StringsKt.contains$default(s, "android_asset", false, 2, null)) {
            String s1 = Uri.parse(s).getPath();
            if(s1 != null) {
                List list0 = StringsKt__StringsKt.split$default(s1, new String[]{"android_asset"}, false, 0, 6, null);
                if(list0 != null) {
                    String s2 = (String)list0.get(1);
                    if(p.startsWith$default(s2, "/", false, 2, null)) {
                        s2 = s2.substring(1);
                        Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
                    }
                    return EmoticonRepositoryKt.getDrawableFromAssets(context0, s2);
                }
            }
            return null;
        }
        return Drawable.createFromPath(s);
    }

    @NotNull
    public static final String toEmoticonSizeType(int v) {
        return v <= 80 ? "small" : "large";
    }
}

