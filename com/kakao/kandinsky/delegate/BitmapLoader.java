package com.kakao.kandinsky.delegate;

import android.content.Context;
import android.util.Size;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bH¦@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/delegate/BitmapLoader;", "", "getBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "imageData", "requireSize", "Landroid/util/Size;", "(Landroid/content/Context;Ljava/lang/Object;Landroid/util/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delegate_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BitmapLoader {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getBitmap$default(BitmapLoader bitmapLoader0, Context context0, Object object0, Size size0, Continuation continuation0, int v, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBitmap");
            }
            if((v & 4) != 0) {
                size0 = null;
            }
            return bitmapLoader0.getBitmap(context0, object0, size0, continuation0);
        }
    }

    @Nullable
    Object getBitmap(@NotNull Context arg1, @NotNull Object arg2, @Nullable Size arg3, @NotNull Continuation arg4);
}

