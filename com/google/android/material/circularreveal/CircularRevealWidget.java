package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface CircularRevealWidget extends Delegate {
    public static class CircularRevealEvaluator implements TypeEvaluator {
        public static final TypeEvaluator CIRCULAR_REVEAL;
        public final RevealInfo a;

        static {
            CircularRevealEvaluator.CIRCULAR_REVEAL = new CircularRevealEvaluator();
        }

        public CircularRevealEvaluator() {
            this.a = new RevealInfo();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NonNull
        public RevealInfo evaluate(float f, @NonNull RevealInfo circularRevealWidget$RevealInfo0, @NonNull RevealInfo circularRevealWidget$RevealInfo1) {
            this.a.set(f * circularRevealWidget$RevealInfo1.centerX + (1.0f - f) * circularRevealWidget$RevealInfo0.centerX, f * circularRevealWidget$RevealInfo1.centerY + (1.0f - f) * circularRevealWidget$RevealInfo0.centerY, f * circularRevealWidget$RevealInfo1.radius + (1.0f - f) * circularRevealWidget$RevealInfo0.radius);
            return this.a;
        }

        @Override  // android.animation.TypeEvaluator
        @NonNull
        public Object evaluate(float f, @NonNull Object object0, @NonNull Object object1) {
            return this.evaluate(f, ((RevealInfo)object0), ((RevealInfo)object1));
        }
    }

    public static class CircularRevealProperty extends Property {
        public static final Property CIRCULAR_REVEAL;

        static {
            CircularRevealProperty.CIRCULAR_REVEAL = new CircularRevealProperty(RevealInfo.class, "circularReveal");  // 初始化器: Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V
        }

        @Nullable
        public RevealInfo get(@NonNull CircularRevealWidget circularRevealWidget0) {
            return circularRevealWidget0.getRevealInfo();
        }

        @Override  // android.util.Property
        @Nullable
        public Object get(@NonNull Object object0) {
            return this.get(((CircularRevealWidget)object0));
        }

        public void set(@NonNull CircularRevealWidget circularRevealWidget0, @Nullable RevealInfo circularRevealWidget$RevealInfo0) {
            circularRevealWidget0.setRevealInfo(circularRevealWidget$RevealInfo0);
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @Nullable Object object1) {
            this.set(((CircularRevealWidget)object0), ((RevealInfo)object1));
        }
    }

    public static class CircularRevealScrimColorProperty extends Property {
        public static final Property CIRCULAR_REVEAL_SCRIM_COLOR;

        static {
            CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealScrimColorProperty(Integer.class, "circularRevealScrimColor");  // 初始化器: Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V
        }

        @NonNull
        public Integer get(@NonNull CircularRevealWidget circularRevealWidget0) {
            return circularRevealWidget0.getCircularRevealScrimColor();
        }

        @Override  // android.util.Property
        @NonNull
        public Object get(@NonNull Object object0) {
            return this.get(((CircularRevealWidget)object0));
        }

        public void set(@NonNull CircularRevealWidget circularRevealWidget0, @NonNull Integer integer0) {
            circularRevealWidget0.setCircularRevealScrimColor(((int)integer0));
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @NonNull Object object1) {
            this.set(((CircularRevealWidget)object0), ((Integer)object1));
        }
    }

    public static class RevealInfo {
        public static final float INVALID_RADIUS = 3.402823E+38f;
        public float centerX;
        public float centerY;
        public float radius;

        public RevealInfo(float f, float f1, float f2) {
            this.centerX = f;
            this.centerY = f1;
            this.radius = f2;
        }

        public RevealInfo(@NonNull RevealInfo circularRevealWidget$RevealInfo0) {
            this(circularRevealWidget$RevealInfo0.centerX, circularRevealWidget$RevealInfo0.centerY, circularRevealWidget$RevealInfo0.radius);
        }

        public boolean isInvalid() {
            return this.radius == 3.402823E+38f;
        }

        public void set(float f, float f1, float f2) {
            this.centerX = f;
            this.centerY = f1;
            this.radius = f2;
        }

        public void set(@NonNull RevealInfo circularRevealWidget$RevealInfo0) {
            this.set(circularRevealWidget$RevealInfo0.centerX, circularRevealWidget$RevealInfo0.centerY, circularRevealWidget$RevealInfo0.radius);
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas arg1);

    @Nullable
    Drawable getCircularRevealOverlayDrawable();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    RevealInfo getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@Nullable Drawable arg1);

    void setCircularRevealScrimColor(@ColorInt int arg1);

    void setRevealInfo(@Nullable RevealInfo arg1);
}

