package coil.compose;

import android.graphics.ColorSpace;
import coil.memory.MemoryCache.Key;
import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001A\u00020\b2\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"coil/compose/EqualityDelegateKt$DefaultModelEqualityDelegate$1", "Lcoil/compose/EqualityDelegate;", "equals", "", "self", "", "other", "hashCode", "", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EqualityDelegateKt.DefaultModelEqualityDelegate.1 implements EqualityDelegate {
    @Override  // coil.compose.EqualityDelegate
    public boolean equals(@Nullable Object object0, @Nullable Object object1) {
        if(object0 == object1) {
            return true;
        }
        if(object0 instanceof ImageRequest && object1 instanceof ImageRequest) {
            ImageRequest imageRequest0 = (ImageRequest)object0;
            ImageRequest imageRequest1 = (ImageRequest)object1;
            return Intrinsics.areEqual(imageRequest0.getContext(), imageRequest1.getContext()) && Intrinsics.areEqual(imageRequest0.getData(), imageRequest1.getData()) && Intrinsics.areEqual(imageRequest0.getPlaceholderMemoryCacheKey(), imageRequest1.getPlaceholderMemoryCacheKey()) && Intrinsics.areEqual(imageRequest0.getMemoryCacheKey(), imageRequest1.getMemoryCacheKey()) && Intrinsics.areEqual(imageRequest0.getDiskCacheKey(), imageRequest1.getDiskCacheKey()) && imageRequest0.getBitmapConfig() == imageRequest1.getBitmapConfig() && Intrinsics.areEqual(imageRequest0.getColorSpace(), imageRequest1.getColorSpace()) && Intrinsics.areEqual(imageRequest0.getTransformations(), imageRequest1.getTransformations()) && Intrinsics.areEqual(imageRequest0.getHeaders(), imageRequest1.getHeaders()) && imageRequest0.getAllowConversionToBitmap() == imageRequest1.getAllowConversionToBitmap() && imageRequest0.getAllowHardware() == imageRequest1.getAllowHardware() && imageRequest0.getAllowRgb565() == imageRequest1.getAllowRgb565() && imageRequest0.getPremultipliedAlpha() == imageRequest1.getPremultipliedAlpha() && imageRequest0.getMemoryCachePolicy() == imageRequest1.getMemoryCachePolicy() && imageRequest0.getDiskCachePolicy() == imageRequest1.getDiskCachePolicy() && imageRequest0.getNetworkCachePolicy() == imageRequest1.getNetworkCachePolicy() && Intrinsics.areEqual(imageRequest0.getSizeResolver(), imageRequest1.getSizeResolver()) && imageRequest0.getScale() == imageRequest1.getScale() && imageRequest0.getPrecision() == imageRequest1.getPrecision() && Intrinsics.areEqual(imageRequest0.getParameters(), imageRequest1.getParameters());
        }
        return Intrinsics.areEqual(object0, object1);
    }

    @Override  // coil.compose.EqualityDelegate
    public int hashCode(@Nullable Object object0) {
        int v = 0;
        if(!(object0 instanceof ImageRequest)) {
            return object0 == null ? 0 : object0.hashCode();
        }
        ImageRequest imageRequest0 = (ImageRequest)object0;
        int v1 = imageRequest0.getContext().hashCode();
        int v2 = imageRequest0.getData().hashCode();
        Key memoryCache$Key0 = imageRequest0.getPlaceholderMemoryCacheKey();
        int v3 = memoryCache$Key0 == null ? 0 : memoryCache$Key0.hashCode();
        Key memoryCache$Key1 = imageRequest0.getMemoryCacheKey();
        int v4 = memoryCache$Key1 == null ? 0 : memoryCache$Key1.hashCode();
        String s = imageRequest0.getDiskCacheKey();
        int v5 = s == null ? 0 : s.hashCode();
        int v6 = imageRequest0.getBitmapConfig().hashCode();
        ColorSpace colorSpace0 = imageRequest0.getColorSpace();
        if(colorSpace0 != null) {
            v = colorSpace0.hashCode();
        }
        return imageRequest0.getParameters().hashCode() + (imageRequest0.getPrecision().hashCode() + (imageRequest0.getScale().hashCode() + (imageRequest0.getSizeResolver().hashCode() + (imageRequest0.getNetworkCachePolicy().hashCode() + (imageRequest0.getDiskCachePolicy().hashCode() + (imageRequest0.getMemoryCachePolicy().hashCode() + (Boolean.hashCode(imageRequest0.getPremultipliedAlpha()) + (Boolean.hashCode(imageRequest0.getAllowRgb565()) + (Boolean.hashCode(imageRequest0.getAllowHardware()) + (Boolean.hashCode(imageRequest0.getAllowConversionToBitmap()) + (imageRequest0.getHeaders().hashCode() + (imageRequest0.getTransformations().hashCode() + ((v6 + ((((v2 + v1 * 0x1F) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F) * 0x1F + v) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }
}

