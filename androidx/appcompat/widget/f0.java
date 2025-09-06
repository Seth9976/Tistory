package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import androidx.core.graphics.drawable.WrappedDrawable;

public class f0 {
    public final AbsSeekBar a;
    public Bitmap b;
    public static final int[] c;

    static {
        f0.c = new int[]{0x101013B, 0x101013C};
    }

    public f0(AbsSeekBar absSeekBar0) {
        this.a = absSeekBar0;
    }

    public void a(AttributeSet attributeSet0, int v) {
        AbsSeekBar absSeekBar0 = this.a;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(absSeekBar0.getContext(), attributeSet0, f0.c, v, 0);
        Drawable drawable0 = tintTypedArray0.getDrawableIfKnown(0);
        if(drawable0 != null) {
            if(drawable0 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable0 = (AnimationDrawable)drawable0;
                int v1 = animationDrawable0.getNumberOfFrames();
                AnimationDrawable animationDrawable1 = new AnimationDrawable();
                animationDrawable1.setOneShot(animationDrawable0.isOneShot());
                for(int v2 = 0; v2 < v1; ++v2) {
                    Drawable drawable1 = this.b(animationDrawable0.getFrame(v2), true);
                    drawable1.setLevel(10000);
                    animationDrawable1.addFrame(drawable1, animationDrawable0.getDuration(v2));
                }
                animationDrawable1.setLevel(10000);
                drawable0 = animationDrawable1;
            }
            absSeekBar0.setIndeterminateDrawable(drawable0);
        }
        Drawable drawable2 = tintTypedArray0.getDrawableIfKnown(1);
        if(drawable2 != null) {
            absSeekBar0.setProgressDrawable(this.b(drawable2, false));
        }
        tintTypedArray0.recycle();
    }

    public final Drawable b(Drawable drawable0, boolean z) {
        if(drawable0 instanceof WrappedDrawable) {
            Drawable drawable1 = ((WrappedDrawable)drawable0).getWrappedDrawable();
            if(drawable1 != null) {
                ((WrappedDrawable)drawable0).setWrappedDrawable(this.b(drawable1, z));
                return drawable0;
            }
        }
        else {
            if(drawable0 instanceof LayerDrawable) {
                int v = ((LayerDrawable)drawable0).getNumberOfLayers();
                Drawable[] arr_drawable = new Drawable[v];
                for(int v2 = 0; v2 < v; ++v2) {
                    int v3 = ((LayerDrawable)drawable0).getId(v2);
                    arr_drawable[v2] = this.b(((LayerDrawable)drawable0).getDrawable(v2), v3 == 0x102000D || v3 == 0x102000F);
                }
                Drawable drawable2 = new LayerDrawable(arr_drawable);
                for(int v1 = 0; v1 < v; ++v1) {
                    ((LayerDrawable)drawable2).setId(v1, ((LayerDrawable)drawable0).getId(v1));
                    ((LayerDrawable)drawable2).setLayerGravity(v1, ((LayerDrawable)drawable0).getLayerGravity(v1));
                    ((LayerDrawable)drawable2).setLayerWidth(v1, ((LayerDrawable)drawable0).getLayerWidth(v1));
                    ((LayerDrawable)drawable2).setLayerHeight(v1, ((LayerDrawable)drawable0).getLayerHeight(v1));
                    ((LayerDrawable)drawable2).setLayerInsetLeft(v1, ((LayerDrawable)drawable0).getLayerInsetLeft(v1));
                    ((LayerDrawable)drawable2).setLayerInsetRight(v1, ((LayerDrawable)drawable0).getLayerInsetRight(v1));
                    ((LayerDrawable)drawable2).setLayerInsetTop(v1, ((LayerDrawable)drawable0).getLayerInsetTop(v1));
                    ((LayerDrawable)drawable2).setLayerInsetBottom(v1, ((LayerDrawable)drawable0).getLayerInsetBottom(v1));
                    ((LayerDrawable)drawable2).setLayerInsetStart(v1, ((LayerDrawable)drawable0).getLayerInsetStart(v1));
                    ((LayerDrawable)drawable2).setLayerInsetEnd(v1, ((LayerDrawable)drawable0).getLayerInsetEnd(v1));
                }
                return drawable2;
            }
            if(drawable0 instanceof BitmapDrawable) {
                Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
                if(this.b == null) {
                    this.b = bitmap0;
                }
                Drawable drawable3 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                ((ShapeDrawable)drawable3).getPaint().setShader(bitmapShader0);
                ((ShapeDrawable)drawable3).getPaint().setColorFilter(((BitmapDrawable)drawable0).getPaint().getColorFilter());
                return z ? new ClipDrawable(drawable3, 3, 1) : drawable3;
            }
        }
        return drawable0;
    }
}

