package com.kakao.tistory.presentation;

import android.content.Context;
import android.util.Size;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.delegate.BitmapLoader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\u0010\t\u001A\u0004\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/CoilBitmapLoader;", "Lcom/kakao/kandinsky/delegate/BitmapLoader;", "()V", "getBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "imageData", "", "requireSize", "Landroid/util/Size;", "(Landroid/content/Context;Ljava/lang/Object;Landroid/util/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CoilBitmapLoader implements BitmapLoader {
    public static final int $stable;

    @Override  // com.kakao.kandinsky.delegate.BitmapLoader
    @Nullable
    public Object getBitmap(@NotNull Context context0, @NotNull Object object0, @Nullable Size size0, @NotNull Continuation continuation0) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(context0, object0, size0, null), continuation0);
    }
}

