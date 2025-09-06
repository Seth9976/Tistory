package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R.styleable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class ShapeAppearanceModel {
    public static final class Builder {
        public CornerTreatment a;
        public CornerTreatment b;
        public CornerTreatment c;
        public CornerTreatment d;
        public CornerSize e;
        public CornerSize f;
        public CornerSize g;
        public CornerSize h;
        public EdgeTreatment i;
        public EdgeTreatment j;
        public EdgeTreatment k;
        public EdgeTreatment l;

        public Builder() {
            this.a = new RoundedCornerTreatment();
            this.b = new RoundedCornerTreatment();
            this.c = new RoundedCornerTreatment();
            this.d = new RoundedCornerTreatment();
            this.e = new AbsoluteCornerSize(0.0f);
            this.f = new AbsoluteCornerSize(0.0f);
            this.g = new AbsoluteCornerSize(0.0f);
            this.h = new AbsoluteCornerSize(0.0f);
            this.i = new EdgeTreatment();
            this.j = new EdgeTreatment();
            this.k = new EdgeTreatment();
            this.l = new EdgeTreatment();
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
            this.a = new RoundedCornerTreatment();
            this.b = new RoundedCornerTreatment();
            this.c = new RoundedCornerTreatment();
            this.d = new RoundedCornerTreatment();
            this.e = new AbsoluteCornerSize(0.0f);
            this.f = new AbsoluteCornerSize(0.0f);
            this.g = new AbsoluteCornerSize(0.0f);
            this.h = new AbsoluteCornerSize(0.0f);
            this.i = new EdgeTreatment();
            this.j = new EdgeTreatment();
            this.k = new EdgeTreatment();
            this.a = shapeAppearanceModel0.a;
            this.b = shapeAppearanceModel0.b;
            this.c = shapeAppearanceModel0.c;
            this.d = shapeAppearanceModel0.d;
            this.e = shapeAppearanceModel0.e;
            this.f = shapeAppearanceModel0.f;
            this.g = shapeAppearanceModel0.g;
            this.h = shapeAppearanceModel0.h;
            this.i = shapeAppearanceModel0.i;
            this.j = shapeAppearanceModel0.j;
            this.k = shapeAppearanceModel0.k;
            this.l = shapeAppearanceModel0.l;
        }

        public static float a(CornerTreatment cornerTreatment0) {
            if(cornerTreatment0 instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment)cornerTreatment0).a;
            }
            return cornerTreatment0 instanceof CutCornerTreatment ? ((CutCornerTreatment)cornerTreatment0).a : -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            ShapeAppearanceModel shapeAppearanceModel0 = new ShapeAppearanceModel();  // 初始化器: Ljava/lang/Object;-><init>()V
            shapeAppearanceModel0.a = this.a;
            shapeAppearanceModel0.b = this.b;
            shapeAppearanceModel0.c = this.c;
            shapeAppearanceModel0.d = this.d;
            shapeAppearanceModel0.e = this.e;
            shapeAppearanceModel0.f = this.f;
            shapeAppearanceModel0.g = this.g;
            shapeAppearanceModel0.h = this.h;
            shapeAppearanceModel0.i = this.i;
            shapeAppearanceModel0.j = this.j;
            shapeAppearanceModel0.k = this.k;
            shapeAppearanceModel0.l = this.l;
            return shapeAppearanceModel0;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@Dimension float f) {
            return this.setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomRightCornerSize(f).setBottomLeftCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize0) {
            return this.setTopLeftCornerSize(cornerSize0).setTopRightCornerSize(cornerSize0).setBottomRightCornerSize(cornerSize0).setBottomLeftCornerSize(cornerSize0);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(int v, @Dimension float f) {
            return this.setAllCorners(MaterialShapeUtils.a(v)).setAllCornerSizes(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment0) {
            return this.setTopLeftCorner(cornerTreatment0).setTopRightCorner(cornerTreatment0).setBottomRightCorner(cornerTreatment0).setBottomLeftCorner(cornerTreatment0);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment0) {
            return this.setLeftEdge(edgeTreatment0).setTopEdge(edgeTreatment0).setRightEdge(edgeTreatment0).setBottomEdge(edgeTreatment0);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment0) {
            this.k = edgeTreatment0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int v, @Dimension float f) {
            return this.setBottomLeftCorner(MaterialShapeUtils.a(v)).setBottomLeftCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int v, @NonNull CornerSize cornerSize0) {
            return this.setBottomLeftCorner(MaterialShapeUtils.a(v)).setBottomLeftCornerSize(cornerSize0);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment0) {
            this.d = cornerTreatment0;
            float f = Builder.a(cornerTreatment0);
            if(f != -1.0f) {
                this.setBottomLeftCornerSize(f);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@Dimension float f) {
            this.h = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize0) {
            this.h = cornerSize0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int v, @Dimension float f) {
            return this.setBottomRightCorner(MaterialShapeUtils.a(v)).setBottomRightCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int v, @NonNull CornerSize cornerSize0) {
            return this.setBottomRightCorner(MaterialShapeUtils.a(v)).setBottomRightCornerSize(cornerSize0);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment0) {
            this.c = cornerTreatment0;
            float f = Builder.a(cornerTreatment0);
            if(f != -1.0f) {
                this.setBottomRightCornerSize(f);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@Dimension float f) {
            this.g = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize0) {
            this.g = cornerSize0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment0) {
            this.l = edgeTreatment0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment0) {
            this.j = edgeTreatment0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment0) {
            this.i = edgeTreatment0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int v, @Dimension float f) {
            return this.setTopLeftCorner(MaterialShapeUtils.a(v)).setTopLeftCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int v, @NonNull CornerSize cornerSize0) {
            return this.setTopLeftCorner(MaterialShapeUtils.a(v)).setTopLeftCornerSize(cornerSize0);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment0) {
            this.a = cornerTreatment0;
            float f = Builder.a(cornerTreatment0);
            if(f != -1.0f) {
                this.setTopLeftCornerSize(f);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@Dimension float f) {
            this.e = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize0) {
            this.e = cornerSize0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int v, @Dimension float f) {
            return this.setTopRightCorner(MaterialShapeUtils.a(v)).setTopRightCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int v, @NonNull CornerSize cornerSize0) {
            return this.setTopRightCorner(MaterialShapeUtils.a(v)).setTopRightCornerSize(cornerSize0);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment0) {
            this.b = cornerTreatment0;
            float f = Builder.a(cornerTreatment0);
            if(f != -1.0f) {
                this.setTopRightCornerSize(f);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@Dimension float f) {
            this.f = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize0) {
            this.f = cornerSize0;
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize arg1);
    }

    public static final CornerSize PILL;
    public CornerTreatment a;
    public CornerTreatment b;
    public CornerTreatment c;
    public CornerTreatment d;
    public CornerSize e;
    public CornerSize f;
    public CornerSize g;
    public CornerSize h;
    public EdgeTreatment i;
    public EdgeTreatment j;
    public EdgeTreatment k;
    public EdgeTreatment l;

    static {
        ShapeAppearanceModel.PILL = new RelativeCornerSize(0.5f);
    }

    public ShapeAppearanceModel() {
        this.a = new RoundedCornerTreatment();
        this.b = new RoundedCornerTreatment();
        this.c = new RoundedCornerTreatment();
        this.d = new RoundedCornerTreatment();
        this.e = new AbsoluteCornerSize(0.0f);
        this.f = new AbsoluteCornerSize(0.0f);
        this.g = new AbsoluteCornerSize(0.0f);
        this.h = new AbsoluteCornerSize(0.0f);
        this.i = new EdgeTreatment();
        this.j = new EdgeTreatment();
        this.k = new EdgeTreatment();
        this.l = new EdgeTreatment();
    }

    public static Builder a(Context context0, int v, int v1, CornerSize cornerSize0) {
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, v);
        if(v1 != 0) {
            contextThemeWrapper0 = new ContextThemeWrapper(contextThemeWrapper0, v1);
        }
        TypedArray typedArray0 = contextThemeWrapper0.obtainStyledAttributes(styleable.ShapeAppearance);
        try {
            int v3 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamily, 0);
            int v4 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyTopLeft, v3);
            int v5 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyTopRight, v3);
            int v6 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyBottomRight, v3);
            int v7 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyBottomLeft, v3);
            CornerSize cornerSize1 = ShapeAppearanceModel.b(typedArray0, styleable.ShapeAppearance_cornerSize, cornerSize0);
            CornerSize cornerSize2 = ShapeAppearanceModel.b(typedArray0, styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize1);
            CornerSize cornerSize3 = ShapeAppearanceModel.b(typedArray0, styleable.ShapeAppearance_cornerSizeTopRight, cornerSize1);
            CornerSize cornerSize4 = ShapeAppearanceModel.b(typedArray0, styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize1);
            CornerSize cornerSize5 = ShapeAppearanceModel.b(typedArray0, styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize1);
            return new Builder().setTopLeftCorner(v4, cornerSize2).setTopRightCorner(v5, cornerSize3).setBottomRightCorner(v6, cornerSize4).setBottomLeftCorner(v7, cornerSize5);
        }
        finally {
            typedArray0.recycle();
        }
    }

    public static CornerSize b(TypedArray typedArray0, int v, CornerSize cornerSize0) {
        TypedValue typedValue0 = typedArray0.peekValue(v);
        if(typedValue0 == null) {
            return cornerSize0;
        }
        int v1 = typedValue0.type;
        if(v1 == 5) {
            return new AbsoluteCornerSize(((float)TypedValue.complexToDimensionPixelSize(typedValue0.data, typedArray0.getResources().getDisplayMetrics())));
        }
        return v1 == 6 ? new RelativeCornerSize(typedValue0.getFraction(1.0f, 1.0f)) : cornerSize0;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static Builder builder(Context context0, @StyleRes int v, @StyleRes int v1) {
        return ShapeAppearanceModel.a(context0, v, v1, new AbsoluteCornerSize(0.0f));
    }

    @NonNull
    public static Builder builder(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        return ShapeAppearanceModel.builder(context0, attributeSet0, v, v1, 0);
    }

    @NonNull
    public static Builder builder(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1, int v2) {
        return ShapeAppearanceModel.builder(context0, attributeSet0, v, v1, new AbsoluteCornerSize(((float)v2)));
    }

    @NonNull
    public static Builder builder(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1, @NonNull CornerSize cornerSize0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MaterialShape, v, v1);
        int v2 = typedArray0.getResourceId(styleable.MaterialShape_shapeAppearance, 0);
        int v3 = typedArray0.getResourceId(styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArray0.recycle();
        return ShapeAppearanceModel.a(context0, v2, v3, cornerSize0);
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.k;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.d;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.h;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.c;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.g;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.l;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.j;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.i;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.a;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.e;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.b;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.f;
    }

    // 去混淆评级： 低(36)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF0) {
        boolean z = this.l.getClass().equals(EdgeTreatment.class) && this.j.getClass().equals(EdgeTreatment.class) && this.i.getClass().equals(EdgeTreatment.class) && this.k.getClass().equals(EdgeTreatment.class);
        float f = this.e.getCornerSize(rectF0);
        return z && (this.f.getCornerSize(rectF0) == f && this.h.getCornerSize(rectF0) == f && this.g.getCornerSize(rectF0) == f) && (this.b instanceof RoundedCornerTreatment && this.a instanceof RoundedCornerTreatment && this.c instanceof RoundedCornerTreatment && this.d instanceof RoundedCornerTreatment);
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f) {
        return this.toBuilder().setAllCornerSizes(f).build();
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize0) {
        return this.toBuilder().setAllCornerSizes(cornerSize0).build();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator shapeAppearanceModel$CornerSizeUnaryOperator0) {
        return this.toBuilder().setTopLeftCornerSize(shapeAppearanceModel$CornerSizeUnaryOperator0.apply(this.getTopLeftCornerSize())).setTopRightCornerSize(shapeAppearanceModel$CornerSizeUnaryOperator0.apply(this.getTopRightCornerSize())).setBottomLeftCornerSize(shapeAppearanceModel$CornerSizeUnaryOperator0.apply(this.getBottomLeftCornerSize())).setBottomRightCornerSize(shapeAppearanceModel$CornerSizeUnaryOperator0.apply(this.getBottomRightCornerSize())).build();
    }
}

