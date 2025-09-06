package s1;

import android.media.Image;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.ImageReader;

public final class d implements ImageReader.OnImageAvailableListener {
    @Override  // android.media.ImageReader$OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader0) {
        if(imageReader0 != null) {
            Image image0 = imageReader0.acquireLatestImage();
            if(image0 != null) {
                image0.close();
            }
        }
    }
}

