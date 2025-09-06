package androidx.constraintlayout.motion.utils;

import a5.b;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y2.a;

public class CustomSupport {
    public static int a(int v) {
        int v1 = (v & ~(v >> 0x1F)) - 0xFF;
        return (v1 & v1 >> 0x1F) + 0xFF;
    }

    public static void setInterpolatedValue(ConstraintAttribute constraintAttribute0, View view0, float[] arr_f) {
        Class class0 = view0.getClass();
        String s = "set" + constraintAttribute0.getName();
        try {
            boolean z = true;
            switch(a.a[constraintAttribute0.getType().ordinal()]) {
                case 1: {
                    class0.getMethod(s, Integer.TYPE).invoke(view0, ((int)arr_f[0]));
                    return;
                }
                case 2: {
                    class0.getMethod(s, Float.TYPE).invoke(view0, ((float)arr_f[0]));
                    return;
                }
                case 3: {
                    Method method0 = class0.getMethod(s, Drawable.class);
                    int v = CustomSupport.a(((int)(((float)Math.pow(arr_f[0], 0.454545)) * 255.0f)));
                    int v1 = CustomSupport.a(((int)(((float)Math.pow(arr_f[1], 0.454545)) * 255.0f)));
                    int v2 = CustomSupport.a(((int)(((float)Math.pow(arr_f[2], 0.454545)) * 255.0f)));
                    int v3 = CustomSupport.a(((int)(arr_f[3] * 255.0f)));
                    ColorDrawable colorDrawable0 = new ColorDrawable();
                    colorDrawable0.setColor(v << 16 | v3 << 24 | v1 << 8 | v2);
                    method0.invoke(view0, colorDrawable0);
                    return;
                }
                case 4: {
                    class0.getMethod(s, Integer.TYPE).invoke(view0, ((int)(CustomSupport.a(((int)(((float)Math.pow(arr_f[0], 0.454545)) * 255.0f))) << 16 | CustomSupport.a(((int)(arr_f[3] * 255.0f))) << 24 | CustomSupport.a(((int)(((float)Math.pow(arr_f[1], 0.454545)) * 255.0f))) << 8 | CustomSupport.a(((int)(((float)Math.pow(arr_f[2], 0.454545)) * 255.0f))))));
                    return;
                }
                case 5: {
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute0.getName());
                }
                case 6: {
                    Method method1 = class0.getMethod(s, Boolean.TYPE);
                    if(arr_f[0] <= 0.5f) {
                        z = false;
                    }
                    method1.invoke(view0, Boolean.valueOf(z));
                    return;
                }
                case 7: {
                    class0.getMethod(s, Float.TYPE).invoke(view0, ((float)arr_f[0]));
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch(NoSuchMethodException noSuchMethodException0) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            goto label_39;
        }
        catch(InvocationTargetException invocationTargetException0) {
            invocationTargetException0.printStackTrace();
            return;
        }
        StringBuilder stringBuilder0 = b.v("no method ", s, " on View \"");
        stringBuilder0.append(Debug.getName(view0));
        stringBuilder0.append("\"");
        Log.e("CustomSupport", stringBuilder0.toString());
        noSuchMethodException0.printStackTrace();
        return;
    label_39:
        StringBuilder stringBuilder1 = b.v("cannot access method ", s, " on View \"");
        stringBuilder1.append(Debug.getName(view0));
        stringBuilder1.append("\"");
        Log.e("CustomSupport", stringBuilder1.toString());
        illegalAccessException0.printStackTrace();
    }
}

