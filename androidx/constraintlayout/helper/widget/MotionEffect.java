package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;

public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    public static final int WEST = 3;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public int l;

    public MotionEffect(Context context0) {
        super(context0);
        this.e = 0.1f;
        this.f = 49;
        this.g = 50;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = -1;
        this.l = -1;
    }

    public MotionEffect(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e = 0.1f;
        this.f = 49;
        this.g = 50;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = -1;
        this.l = -1;
        this.f(context0, attributeSet0);
    }

    public MotionEffect(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e = 0.1f;
        this.f = 49;
        this.g = 50;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = -1;
        this.l = -1;
        this.f(context0, attributeSet0);
    }

    public final void f(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MotionEffect);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionEffect_motionEffect_start) {
                    this.f = Math.max(Math.min(typedArray0.getInt(v2, this.f), 99), 0);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_end) {
                    this.g = Math.max(Math.min(typedArray0.getInt(v2, this.g), 99), 0);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_translationX) {
                    this.h = typedArray0.getDimensionPixelOffset(v2, this.h);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_translationY) {
                    this.i = typedArray0.getDimensionPixelOffset(v2, this.i);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_alpha) {
                    this.e = typedArray0.getFloat(v2, this.e);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_move) {
                    this.l = typedArray0.getInt(v2, this.l);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_strict) {
                    this.j = typedArray0.getBoolean(v2, this.j);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_viewTransition) {
                    this.k = typedArray0.getResourceId(v2, this.k);
                }
            }
            int v3 = this.f;
            int v4 = this.g;
            if(v3 == v4) {
                if(v3 > 0) {
                    this.f = v3 - 1;
                }
                else {
                    this.g = v4 + 1;
                }
            }
            typedArray0.recycle();
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean isDecorator() {
        return true;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public void onPreSetup(MotionLayout motionLayout0, HashMap hashMap0) {
        KeyAttributes keyAttributes5;
        KeyAttributes keyAttributes4;
        KeyAttributes keyAttributes3;
        View[] arr_view = this.getViews(((ConstraintLayout)this.getParent()));
        if(arr_view == null) {
            Log.v("FadeMove", ".(null:-1) onPreSetup() views = null");
            return;
        }
        KeyAttributes keyAttributes0 = new KeyAttributes();
        KeyAttributes keyAttributes1 = new KeyAttributes();
        keyAttributes0.setValue("alpha", this.e);
        keyAttributes1.setValue("alpha", this.e);
        keyAttributes0.setFramePosition(this.f);
        keyAttributes1.setFramePosition(this.g);
        KeyPosition keyPosition0 = new KeyPosition();
        keyPosition0.setFramePosition(this.f);
        keyPosition0.setType(0);
        keyPosition0.setValue("percentX", 0);
        keyPosition0.setValue("percentY", 0);
        KeyPosition keyPosition1 = new KeyPosition();
        keyPosition1.setFramePosition(this.g);
        keyPosition1.setType(0);
        keyPosition1.setValue("percentX", 1);
        keyPosition1.setValue("percentY", 1);
        KeyAttributes keyAttributes2 = null;
        if(this.h > 0) {
            keyAttributes3 = new KeyAttributes();
            keyAttributes4 = new KeyAttributes();
            keyAttributes3.setValue("translationX", this.h);
            keyAttributes3.setFramePosition(this.g);
            keyAttributes4.setValue("translationX", 0);
            keyAttributes4.setFramePosition(this.g - 1);
        }
        else {
            keyAttributes3 = null;
            keyAttributes4 = null;
        }
        if(this.i > 0) {
            keyAttributes2 = new KeyAttributes();
            keyAttributes5 = new KeyAttributes();
            keyAttributes2.setValue("translationY", this.i);
            keyAttributes2.setFramePosition(this.g);
            keyAttributes5.setValue("translationY", 0);
            keyAttributes5.setFramePosition(this.g - 1);
        }
        else {
            keyAttributes5 = null;
        }
        int v1 = this.l;
        if(v1 == -1) {
            int[] arr_v = new int[4];
            for(int v2 = 0; v2 < arr_view.length; ++v2) {
                MotionController motionController0 = (MotionController)hashMap0.get(arr_view[v2]);
                if(motionController0 != null) {
                    float f = motionController0.getFinalX() - motionController0.getStartX();
                    float f1 = motionController0.getFinalY() - motionController0.getStartY();
                    if(f1 < 0.0f) {
                        ++arr_v[1];
                    }
                    if(f1 > 0.0f) {
                        ++arr_v[0];
                    }
                    if(f > 0.0f) {
                        ++arr_v[3];
                    }
                    if(f < 0.0f) {
                        ++arr_v[2];
                    }
                }
            }
            int v3 = arr_v[0];
            v1 = 0;
            for(int v = 1; v < 4; ++v) {
                int v4 = arr_v[v];
                if(v3 < v4) {
                    v3 = v4;
                    v1 = v;
                }
            }
        }
        int v5 = 0;
        while(v5 < arr_view.length) {
            MotionController motionController1 = (MotionController)hashMap0.get(arr_view[v5]);
            if(motionController1 != null) {
                float f2 = motionController1.getFinalX() - motionController1.getStartX();
                float f3 = motionController1.getFinalY() - motionController1.getStartY();
                if(v1 != 0) {
                    switch(v1) {
                        case 1: {
                            if(f3 >= 0.0f || this.j && f2 != 0.0f) {
                                goto label_85;
                            }
                            else {
                                break;
                            }
                            goto label_82;
                        }
                        case 2: {
                        label_82:
                            if(f2 >= 0.0f || this.j && f3 != 0.0f) {
                                goto label_85;
                            }
                            else {
                                break;
                            }
                            goto label_84;
                        }
                        case 3: {
                        label_84:
                            if(f2 <= 0.0f || this.j && f3 != 0.0f) {
                            label_85:
                                int v6 = this.k;
                                if(v6 == -1) {
                                    motionController1.addKey(keyAttributes0);
                                    motionController1.addKey(keyAttributes1);
                                    motionController1.addKey(keyPosition0);
                                    motionController1.addKey(keyPosition1);
                                    if(this.h > 0) {
                                        motionController1.addKey(keyAttributes3);
                                        motionController1.addKey(keyAttributes4);
                                    }
                                    if(this.i > 0) {
                                        motionController1.addKey(keyAttributes2);
                                        motionController1.addKey(keyAttributes5);
                                    }
                                }
                                else {
                                    motionLayout0.applyViewTransition(v6, motionController1);
                                }
                            }
                            break;
                        }
                        default: {
                            goto label_85;
                        }
                    }
                }
                else if(f3 <= 0.0f || this.j && f2 != 0.0f) {
                    goto label_85;
                }
            }
            ++v5;
        }
    }
}

