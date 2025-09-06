package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup arg1, @IdRes int arg2, boolean arg3);
    }

    public final ArrayList a;
    public final f b;
    public final LinkedHashSet c;
    public final c d;
    public Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public HashSet j;
    public static final int k;

    static {
        MaterialButtonToggleGroup.k = style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    }

    public MaterialButtonToggleGroup(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialButtonToggleGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, MaterialButtonToggleGroup.k), attributeSet0, v);
        this.a = new ArrayList();
        this.b = new f(this);
        this.c = new LinkedHashSet();
        this.d = new c(this, 0);
        this.f = false;
        this.j = new HashSet();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(this.getContext(), attributeSet0, styleable.MaterialButtonToggleGroup, v, MaterialButtonToggleGroup.k, new int[0]);
        this.setSingleSelection(typedArray0.getBoolean(styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.i = typedArray0.getResourceId(styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.h = typedArray0.getBoolean(styleable.MaterialButtonToggleGroup_selectionRequired, false);
        this.setChildrenDrawingOrderEnabled(true);
        this.setEnabled(typedArray0.getBoolean(styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArray0.recycle();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public final void a() {
        int v = this.getFirstVisibleChildIndex();
        if(v == -1) {
            return;
        }
        for(int v1 = v + 1; v1 < this.getChildCount(); ++v1) {
            MaterialButton materialButton0 = (MaterialButton)this.getChildAt(v1);
            int v2 = Math.min(materialButton0.getStrokeWidth(), ((MaterialButton)this.getChildAt(v1 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = materialButton0.getLayoutParams();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams0) : new LinearLayout.LayoutParams(viewGroup$LayoutParams0.width, viewGroup$LayoutParams0.height);
            if(this.getOrientation() == 0) {
                MarginLayoutParamsCompat.setMarginEnd(linearLayout$LayoutParams0, 0);
                MarginLayoutParamsCompat.setMarginStart(linearLayout$LayoutParams0, -v2);
                linearLayout$LayoutParams0.topMargin = 0;
            }
            else {
                linearLayout$LayoutParams0.bottomMargin = 0;
                linearLayout$LayoutParams0.topMargin = -v2;
                MarginLayoutParamsCompat.setMarginStart(linearLayout$LayoutParams0, 0);
            }
            materialButton0.setLayoutParams(linearLayout$LayoutParams0);
        }
        if(this.getChildCount() != 0 && v != -1) {
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)((MaterialButton)this.getChildAt(v)).getLayoutParams();
            if(this.getOrientation() == 1) {
                linearLayout$LayoutParams1.topMargin = 0;
                linearLayout$LayoutParams1.bottomMargin = 0;
                return;
            }
            MarginLayoutParamsCompat.setMarginEnd(linearLayout$LayoutParams1, 0);
            MarginLayoutParamsCompat.setMarginStart(linearLayout$LayoutParams1, 0);
            linearLayout$LayoutParams1.leftMargin = 0;
            linearLayout$LayoutParams1.rightMargin = 0;
        }
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener materialButtonToggleGroup$OnButtonCheckedListener0) {
        this.c.add(materialButtonToggleGroup$OnButtonCheckedListener0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!(view0 instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
        this.setGeneratedIdIfNeeded(((MaterialButton)view0));
        this.setupButtonChild(((MaterialButton)view0));
        this.b(((MaterialButton)view0).getId(), ((MaterialButton)view0).isChecked());
        ShapeAppearanceModel shapeAppearanceModel0 = ((MaterialButton)view0).getShapeAppearanceModel();
        e e0 = new e(shapeAppearanceModel0.getTopLeftCornerSize(), shapeAppearanceModel0.getBottomLeftCornerSize(), shapeAppearanceModel0.getTopRightCornerSize(), shapeAppearanceModel0.getBottomRightCornerSize());
        this.a.add(e0);
        ((MaterialButton)view0).setEnabled(this.isEnabled());
        ViewCompat.setAccessibilityDelegate(((MaterialButton)view0), new d(this));
    }

    public final void b(int v, boolean z) {
        if(v == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + -1);
            return;
        }
        HashSet hashSet0 = new HashSet(this.j);
        if(z && !hashSet0.contains(v)) {
            if(this.g && !hashSet0.isEmpty()) {
                hashSet0.clear();
            }
            hashSet0.add(v);
            this.d(hashSet0);
            return;
        }
        if(!z && hashSet0.contains(v)) {
            if(!this.h || hashSet0.size() > 1) {
                hashSet0.remove(v);
            }
            this.d(hashSet0);
        }
    }

    public final boolean c(int v) {
        return this.getChildAt(v).getVisibility() != 8;
    }

    public void check(@IdRes int v) {
        this.b(v, true);
    }

    public void clearChecked() {
        this.d(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.c.clear();
    }

    public final void d(Set set0) {
        HashSet hashSet0 = this.j;
        this.j = new HashSet(set0);
        for(int v = 0; v < this.getChildCount(); ++v) {
            int v1 = ((MaterialButton)this.getChildAt(v)).getId();
            boolean z = set0.contains(v1);
            View view0 = this.findViewById(v1);
            if(view0 instanceof MaterialButton) {
                this.f = true;
                ((MaterialButton)view0).setChecked(z);
                this.f = false;
            }
            if(hashSet0.contains(v1) != set0.contains(v1)) {
                boolean z1 = set0.contains(v1);
                for(Object object0: this.c) {
                    ((OnButtonCheckedListener)object0).onButtonChecked(this, v1, z1);
                }
            }
        }
        this.invalidate();
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NonNull Canvas canvas0) {
        TreeMap treeMap0 = new TreeMap(this.d);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            treeMap0.put(((MaterialButton)this.getChildAt(v1)), v1);
        }
        this.e = (Integer[])treeMap0.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas0);
    }

    public final void e() {
        e e1;
        int v = this.getChildCount();
        int v1 = this.getFirstVisibleChildIndex();
        int v2 = this.getLastVisibleChildIndex();
        for(int v3 = 0; v3 < v; ++v3) {
            MaterialButton materialButton0 = (MaterialButton)this.getChildAt(v3);
            if(materialButton0.getVisibility() != 8) {
                Builder shapeAppearanceModel$Builder0 = materialButton0.getShapeAppearanceModel().toBuilder();
                e e0 = (e)this.a.get(v3);
                if(v1 != v2) {
                    boolean z = this.getOrientation() == 0;
                    if(v3 == v1) {
                        if(z) {
                            e1 = ViewUtils.isLayoutRtl(this) ? new e(e.e, e.e, e0.b, e0.c) : new e(e0.a, e0.d, e.e, e.e);
                        }
                        else {
                            e1 = new e(e0.a, e.e, e0.b, e.e);
                        }
                        e0 = e1;
                    }
                    else if(v3 == v2) {
                        if(!z) {
                            e1 = new e(e.e, e0.d, e.e, e0.c);
                        }
                        else if(ViewUtils.isLayoutRtl(this)) {
                            e1 = new e(e0.a, e0.d, e.e, e.e);
                        }
                        else {
                            e1 = new e(e.e, e.e, e0.b, e0.c);
                        }
                        e0 = e1;
                    }
                    else {
                        e0 = null;
                    }
                }
                if(e0 == null) {
                    shapeAppearanceModel$Builder0.setAllCornerSizes(0.0f);
                }
                else {
                    shapeAppearanceModel$Builder0.setTopLeftCornerSize(e0.a).setBottomLeftCornerSize(e0.d).setTopRightCornerSize(e0.b).setBottomRightCornerSize(e0.c);
                }
                materialButton0.setShapeAppearanceModel(shapeAppearanceModel$Builder0.build());
            }
        }
    }

    @IdRes
    public int getCheckedButtonId() {
        return this.g && !this.j.isEmpty() ? this.j.iterator().next() : -1;
    }

    @NonNull
    public List getCheckedButtonIds() {
        List list0 = new ArrayList();
        for(int v = 0; v < this.getChildCount(); ++v) {
            int v1 = ((MaterialButton)this.getChildAt(v)).getId();
            if(this.j.contains(v1)) {
                ((ArrayList)list0).add(v1);
            }
        }
        return list0;
    }

    @Override  // android.view.ViewGroup
    public int getChildDrawingOrder(int v, int v1) {
        Integer[] arr_integer = this.e;
        if(arr_integer != null && v1 < arr_integer.length) {
            return (int)arr_integer[v1];
        }
        Log.w("MButtonToggleGroup", "Child order wasn\'t updated");
        return v1;
    }

    private int getFirstVisibleChildIndex() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.c(v1)) {
                return v1;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for(int v = this.getChildCount() - 1; v >= 0; --v) {
            if(this.c(v)) {
                return v;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) instanceof MaterialButton && this.c(v)) {
                ++v1;
            }
        }
        return v1;
    }

    public boolean isSelectionRequired() {
        return this.h;
    }

    public boolean isSingleSelection() {
        return this.g;
    }

    @Override  // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int v = this.i;
        if(v != -1) {
            this.d(Collections.singleton(v));
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0).setCollectionInfo(CollectionInfoCompat.obtain(1, this.getVisibleButtonCount(), false, (this.isSingleSelection() ? 1 : 2)));
    }

    @Override  // android.widget.LinearLayout
    public void onMeasure(int v, int v1) {
        this.e();
        this.a();
        super.onMeasure(v, v1);
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        if(view0 instanceof MaterialButton) {
            ((MaterialButton)view0).setOnPressedChangeListenerInternal(null);
        }
        int v = this.indexOfChild(view0);
        if(v >= 0) {
            this.a.remove(v);
        }
        this.e();
        this.a();
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener materialButtonToggleGroup$OnButtonCheckedListener0) {
        this.c.remove(materialButtonToggleGroup$OnButtonCheckedListener0);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for(int v = 0; v < this.getChildCount(); ++v) {
            ((MaterialButton)this.getChildAt(v)).setEnabled(z);
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton0) {
        if(materialButton0.getId() == -1) {
            materialButton0.setId(ViewCompat.generateViewId());
        }
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(@BoolRes int v) {
        this.setSingleSelection(this.getResources().getBoolean(v));
    }

    public void setSingleSelection(boolean z) {
        if(this.g != z) {
            this.g = z;
            this.clearChecked();
        }
        for(int v = 0; v < this.getChildCount(); ++v) {
            Class class0 = this.g ? RadioButton.class : ToggleButton.class;
            ((MaterialButton)this.getChildAt(v)).setA11yClassName(class0.getName());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton0) {
        materialButton0.setMaxLines(1);
        materialButton0.setEllipsize(TextUtils.TruncateAt.END);
        materialButton0.setCheckable(true);
        materialButton0.setOnPressedChangeListenerInternal(this.b);
        materialButton0.setShouldDrawSurfaceColorStroke(true);
    }

    public void uncheck(@IdRes int v) {
        this.b(v, false);
    }
}

