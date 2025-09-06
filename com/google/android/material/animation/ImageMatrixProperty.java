package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

public class ImageMatrixProperty extends Property {
    public final Matrix a;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @NonNull
    public Matrix get(@NonNull ImageView imageView0) {
        Matrix matrix0 = imageView0.getImageMatrix();
        this.a.set(matrix0);
        return this.a;
    }

    @Override  // android.util.Property
    @NonNull
    public Object get(@NonNull Object object0) {
        return this.get(((ImageView)object0));
    }

    public void set(@NonNull ImageView imageView0, @NonNull Matrix matrix0) {
        imageView0.setImageMatrix(matrix0);
    }

    @Override  // android.util.Property
    public void set(@NonNull Object object0, @NonNull Object object1) {
        this.set(((ImageView)object0), ((Matrix)object1));
    }
}

