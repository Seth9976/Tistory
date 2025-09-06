package androidx.core.view;

import android.content.ClipData;
import android.util.Pair;
import android.view.ContentInfo.Builder;
import android.view.ContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.content.o;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class b {
    @DoNotInline
    @NonNull
    public static Pair a(@NonNull ContentInfo contentInfo0, @NonNull Predicate predicate0) {
        ClipData clipData0 = contentInfo0.getClip();
        if(clipData0.getItemCount() == 1) {
            boolean z = predicate0.test(clipData0.getItemAt(0));
            ContentInfo contentInfo1 = z ? contentInfo0 : null;
            if(z) {
                contentInfo0 = null;
            }
            return Pair.create(contentInfo1, contentInfo0);
        }
        Objects.requireNonNull(predicate0);
        Pair pair0 = ContentInfoCompat.b(clipData0, new o(predicate0, 2));
        if(pair0.first == null) {
            return Pair.create(null, contentInfo0);
        }
        return pair0.second == null ? Pair.create(contentInfo0, null) : Pair.create(new ContentInfo.Builder(contentInfo0).setClip(((ClipData)pair0.first)).build(), new ContentInfo.Builder(contentInfo0).setClip(((ClipData)pair0.second)).build());
    }
}

