package androidx.transition;

import android.view.View;

public abstract class VisibilityPropagation extends TransitionPropagation {
    public static final String[] a;

    static {
        VisibilityPropagation.a = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    }

    @Override  // androidx.transition.TransitionPropagation
    public void captureValues(TransitionValues transitionValues0) {
        View view0 = transitionValues0.view;
        Integer integer0 = (Integer)transitionValues0.values.get("android:visibility:visibility");
        if(integer0 == null) {
            integer0 = view0.getVisibility();
        }
        transitionValues0.values.put("android:visibilityPropagation:visibility", integer0);
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        int v = arr_v[0];
        int v1 = Math.round(view0.getTranslationX()) + v;
        arr_v[0] = v1;
        arr_v[0] = view0.getWidth() / 2 + v1;
        int v2 = arr_v[1];
        int v3 = Math.round(view0.getTranslationY()) + v2;
        arr_v[1] = v3;
        arr_v[1] = view0.getHeight() / 2 + v3;
        transitionValues0.values.put("android:visibilityPropagation:center", arr_v);
    }

    @Override  // androidx.transition.TransitionPropagation
    public String[] getPropagationProperties() {
        return VisibilityPropagation.a;
    }

    public int getViewVisibility(TransitionValues transitionValues0) {
        if(transitionValues0 == null) {
            return 8;
        }
        Integer integer0 = (Integer)transitionValues0.values.get("android:visibilityPropagation:visibility");
        return integer0 == null ? 8 : ((int)integer0);
    }

    public int getViewX(TransitionValues transitionValues0) {
        if(transitionValues0 != null) {
            int[] arr_v = (int[])transitionValues0.values.get("android:visibilityPropagation:center");
            return arr_v == null ? -1 : arr_v[0];
        }
        return -1;
    }

    public int getViewY(TransitionValues transitionValues0) {
        if(transitionValues0 != null) {
            int[] arr_v = (int[])transitionValues0.values.get("android:visibilityPropagation:center");
            return arr_v == null ? -1 : arr_v[1];
        }
        return -1;
    }
}

