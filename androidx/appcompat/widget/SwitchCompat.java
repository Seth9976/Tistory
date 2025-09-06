package androidx.appcompat.widget;

import a8.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;

public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public StaticLayout K;
    public StaticLayout L;
    public AllCapsTransformationMethod M;
    public ObjectAnimator N;
    public e0 O;
    public d3 P;
    public final Rect Q;
    public static final g R;
    public static final int[] S;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;
    public boolean s;
    public int t;
    public final int u;
    public float v;
    public float w;
    public final VelocityTracker x;
    public final int y;
    public float z;

    static {
        SwitchCompat.R = new g(5, "thumbPos", Float.class);
        SwitchCompat.S = new int[]{0x10100A0};
    }

    public SwitchCompat(@NonNull Context context0) {
        this(context0, null);
    }

    public SwitchCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.switchStyle);
    }

    public SwitchCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.x = VelocityTracker.obtain();
        this.H = true;
        this.Q = new Rect();
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        TextPaint textPaint0 = new TextPaint(1);
        this.I = textPaint0;
        textPaint0.density = this.getResources().getDisplayMetrics().density;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.SwitchCompat, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context0, styleable.SwitchCompat, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        Drawable drawable0 = tintTypedArray0.getDrawable(styleable.SwitchCompat_android_thumb);
        this.a = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        Drawable drawable1 = tintTypedArray0.getDrawable(styleable.SwitchCompat_track);
        this.f = drawable1;
        if(drawable1 != null) {
            drawable1.setCallback(this);
        }
        this.setTextOnInternal(tintTypedArray0.getText(styleable.SwitchCompat_android_textOn));
        this.setTextOffInternal(tintTypedArray0.getText(styleable.SwitchCompat_android_textOff));
        this.s = tintTypedArray0.getBoolean(styleable.SwitchCompat_showText, true);
        this.k = tintTypedArray0.getDimensionPixelSize(styleable.SwitchCompat_thumbTextPadding, 0);
        this.l = tintTypedArray0.getDimensionPixelSize(styleable.SwitchCompat_switchMinWidth, 0);
        this.m = tintTypedArray0.getDimensionPixelSize(styleable.SwitchCompat_switchPadding, 0);
        this.n = tintTypedArray0.getBoolean(styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateList0 = tintTypedArray0.getColorStateList(styleable.SwitchCompat_thumbTint);
        if(colorStateList0 != null) {
            this.b = colorStateList0;
            this.d = true;
        }
        PorterDuff.Mode porterDuff$Mode0 = DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.SwitchCompat_thumbTintMode, -1), null);
        if(this.c != porterDuff$Mode0) {
            this.c = porterDuff$Mode0;
            this.e = true;
        }
        if(this.d || this.e) {
            this.a();
        }
        ColorStateList colorStateList1 = tintTypedArray0.getColorStateList(styleable.SwitchCompat_trackTint);
        if(colorStateList1 != null) {
            this.g = colorStateList1;
            this.i = true;
        }
        PorterDuff.Mode porterDuff$Mode1 = DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.SwitchCompat_trackTintMode, -1), null);
        if(this.h != porterDuff$Mode1) {
            this.h = porterDuff$Mode1;
            this.j = true;
        }
        if(this.i || this.j) {
            this.b();
        }
        int v1 = tintTypedArray0.getResourceId(styleable.SwitchCompat_switchTextAppearance, 0);
        if(v1 != 0) {
            this.setSwitchTextAppearance(context0, v1);
        }
        new b1(this).f(attributeSet0, v);
        tintTypedArray0.recycle();
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.u = viewConfiguration0.getScaledTouchSlop();
        this.y = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.getEmojiTextViewHelper().a(attributeSet0, v);
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }

    public final void a() {
        Drawable drawable0 = this.a;
        if(drawable0 != null && (this.d || this.e)) {
            Drawable drawable1 = drawable0.mutate();
            this.a = drawable1;
            if(this.d) {
                DrawableCompat.setTintList(drawable1, this.b);
            }
            if(this.e) {
                DrawableCompat.setTintMode(this.a, this.c);
            }
            if(this.a.isStateful()) {
                this.a.setState(this.getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable0 = this.f;
        if(drawable0 != null && (this.i || this.j)) {
            Drawable drawable1 = drawable0.mutate();
            this.f = drawable1;
            if(this.i) {
                DrawableCompat.setTintList(drawable1, this.g);
            }
            if(this.j) {
                DrawableCompat.setTintMode(this.f, this.h);
            }
            if(this.f.isStateful()) {
                this.f.setState(this.getDrawableState());
            }
        }
    }

    public final void c() {
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        this.requestLayout();
    }

    public final void d() {
        if(this.P == null && this.O.b.isEnabled() && false) {
            EmojiCompat emojiCompat0 = EmojiCompat.get();
            switch(emojiCompat0.getLoadState()) {
                case 0: 
                case 3: {
                    d3 d30 = new d3(this);
                    this.P = d30;
                    emojiCompat0.registerInitCallback(d30);
                    break;
                }
            }
        }
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v12;
        int v7;
        int v = this.D;
        int v1 = this.E;
        int v2 = this.F;
        int v3 = this.G;
        int v4 = this.getThumbOffset() + v;
        Rect rect0 = this.a == null ? DrawableUtils.INSETS_NONE : DrawableUtils.getOpticalBounds(this.a);
        Drawable drawable0 = this.f;
        Rect rect1 = this.Q;
        if(drawable0 != null) {
            drawable0.getPadding(rect1);
            int v5 = rect1.left;
            v4 += v5;
            if(rect0 == null) {
                v7 = v1;
                v12 = v3;
            }
            else {
                int v6 = rect0.left;
                if(v6 > v5) {
                    v += v6 - v5;
                }
                v7 = rect0.top <= rect1.top ? v1 : rect0.top - rect1.top + v1;
                int v8 = rect0.right;
                int v9 = rect1.right;
                if(v8 > v9) {
                    v2 -= v8 - v9;
                }
                int v10 = rect0.bottom;
                int v11 = rect1.bottom;
                v12 = v10 > v11 ? v3 - (v10 - v11) : v3;
            }
            this.f.setBounds(v, v7, v2, v12);
        }
        Drawable drawable1 = this.a;
        if(drawable1 != null) {
            drawable1.getPadding(rect1);
            int v13 = v4 - rect1.left;
            int v14 = v4 + this.C + rect1.right;
            this.a.setBounds(v13, v1, v14, v3);
            Drawable drawable2 = this.getBackground();
            if(drawable2 != null) {
                DrawableCompat.setHotspotBounds(drawable2, v13, v1, v14, v3);
            }
        }
        super.draw(canvas0);
    }

    @Override  // android.widget.CompoundButton
    public void drawableHotspotChanged(float f, float f1) {
        super.drawableHotspotChanged(f, f1);
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setHotspot(drawable0, f, f1);
        }
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            DrawableCompat.setHotspot(drawable1, f, f1);
        }
    }

    @Override  // android.widget.CompoundButton
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.a;
        boolean z = drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v);
        Drawable drawable1 = this.f;
        if(drawable1 != null && drawable1.isStateful()) {
            z |= drawable1.setState(arr_v);
        }
        if(z) {
            this.invalidate();
        }
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        if(!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int v = super.getCompoundPaddingLeft() + this.A;
        return TextUtils.isEmpty(this.getText()) ? v : v + this.m;
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingRight() {
        if(ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int v = super.getCompoundPaddingRight() + this.A;
        return TextUtils.isEmpty(this.getText()) ? v : v + this.m;
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @NonNull
    private e0 getEmojiTextViewHelper() {
        if(this.O == null) {
            this.O = new e0(this);
        }
        return this.O;
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    private int getThumbOffset() {
        return ViewUtils.isLayoutRtl(this) ? ((int)((1.0f - this.z) * ((float)this.getThumbScrollRange()) + 0.5f)) : ((int)(this.z * ((float)this.getThumbScrollRange()) + 0.5f));
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float getThumbPosition() {
        return this.z;
    }

    private int getThumbScrollRange() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            Rect rect0 = this.Q;
            drawable0.getPadding(rect0);
            Drawable drawable1 = this.a;
            if(drawable1 != null) {
                Rect rect1 = DrawableUtils.getOpticalBounds(drawable1);
                return this.A - this.C - rect0.left - rect0.right - rect1.left - rect1.right;
            }
            return this.A - this.C - rect0.left - rect0.right - DrawableUtils.INSETS_NONE.left - DrawableUtils.INSETS_NONE.right;
        }
        return 0;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b.isEnabled();
    }

    @Override  // android.widget.CompoundButton
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
        }
        if(this.N != null && this.N.isStarted()) {
            this.N.end();
            this.N = null;
        }
    }

    @Override  // android.widget.CompoundButton
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, SwitchCompat.S);
        }
        return arr_v;
    }

    @Override  // android.widget.CompoundButton
    public void onDraw(Canvas canvas0) {
        int v4;
        super.onDraw(canvas0);
        Drawable drawable0 = this.f;
        Rect rect0 = this.Q;
        if(drawable0 == null) {
            rect0.setEmpty();
        }
        else {
            drawable0.getPadding(rect0);
        }
        int v = this.E + rect0.top;
        int v1 = this.G - rect0.bottom;
        Drawable drawable1 = this.a;
        if(drawable0 != null) {
            if(!this.n || drawable1 == null) {
                drawable0.draw(canvas0);
            }
            else {
                Rect rect1 = DrawableUtils.getOpticalBounds(drawable1);
                drawable1.copyBounds(rect0);
                rect0.left += rect1.left;
                rect0.right -= rect1.right;
                int v2 = canvas0.save();
                canvas0.clipRect(rect0, Region.Op.DIFFERENCE);
                drawable0.draw(canvas0);
                canvas0.restoreToCount(v2);
            }
        }
        int v3 = canvas0.save();
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
        StaticLayout staticLayout0 = this.getTargetCheckedState() ? this.K : this.L;
        if(staticLayout0 != null) {
            int[] arr_v = this.getDrawableState();
            ColorStateList colorStateList0 = this.J;
            TextPaint textPaint0 = this.I;
            if(colorStateList0 != null) {
                textPaint0.setColor(colorStateList0.getColorForState(arr_v, 0));
            }
            textPaint0.drawableState = arr_v;
            if(drawable1 == null) {
                v4 = this.getWidth();
            }
            else {
                Rect rect2 = drawable1.getBounds();
                v4 = rect2.left + rect2.right;
            }
            canvas0.translate(((float)(v4 / 2 - staticLayout0.getWidth() / 2)), ((float)((v + v1) / 2 - staticLayout0.getHeight() / 2)));
            staticLayout0.draw(canvas0);
        }
        canvas0.restoreToCount(v3);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.Switch");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.Switch");
        if(Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence0 = this.isChecked() ? this.o : this.q;
            if(!TextUtils.isEmpty(charSequence0)) {
                CharSequence charSequence1 = accessibilityNodeInfo0.getText();
                if(TextUtils.isEmpty(charSequence1)) {
                    accessibilityNodeInfo0.setText(charSequence0);
                    return;
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(charSequence1);
                stringBuilder0.append(' ');
                stringBuilder0.append(charSequence0);
                accessibilityNodeInfo0.setText(stringBuilder0);
            }
        }
    }

    @Override  // android.widget.TextView
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        super.onLayout(z, v, v1, v2, v3);
        int v4 = 0;
        if(this.a == null) {
            v5 = 0;
        }
        else {
            Drawable drawable0 = this.f;
            Rect rect0 = this.Q;
            if(drawable0 == null) {
                rect0.setEmpty();
            }
            else {
                drawable0.getPadding(rect0);
            }
            Rect rect1 = DrawableUtils.getOpticalBounds(this.a);
            v5 = Math.max(0, rect1.left - rect0.left);
            v4 = Math.max(0, rect1.right - rect0.right);
        }
        if(ViewUtils.isLayoutRtl(this)) {
            v6 = this.getPaddingLeft() + v5;
            v7 = this.A + v6 - v5 - v4;
        }
        else {
            v7 = this.getWidth() - this.getPaddingRight() - v4;
            v6 = v7 - this.A + v5 + v4;
        }
        switch(this.getGravity() & 0x70) {
            case 16: {
                int v10 = this.getPaddingTop();
                int v11 = (this.getHeight() + v10 - this.getPaddingBottom()) / 2 - this.B / 2;
                v9 = this.B + v11;
                v8 = v11;
                break;
            }
            case 80: {
                v9 = this.getHeight() - this.getPaddingBottom();
                v8 = v9 - this.B;
                break;
            }
            default: {
                v8 = this.getPaddingTop();
                v9 = this.B + v8;
            }
        }
        this.D = v6;
        this.E = v8;
        this.G = v9;
        this.F = v7;
    }

    @Override  // android.widget.TextView
    public void onMeasure(int v, int v1) {
        int v6;
        int v4;
        int v3;
        int v2 = 0;
        if(this.s) {
            TextPaint textPaint0 = this.I;
            if(this.K == null) {
                this.K = new StaticLayout(this.p, textPaint0, (this.p == null ? 0 : ((int)Math.ceil(Layout.getDesiredWidth(this.p, textPaint0)))), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if(this.L == null) {
                this.L = new StaticLayout(this.r, textPaint0, (this.r == null ? 0 : ((int)Math.ceil(Layout.getDesiredWidth(this.r, textPaint0)))), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable0 = this.a;
        Rect rect0 = this.Q;
        if(drawable0 == null) {
            v3 = 0;
            v4 = 0;
        }
        else {
            drawable0.getPadding(rect0);
            v3 = this.a.getIntrinsicWidth() - rect0.left - rect0.right;
            v4 = this.a.getIntrinsicHeight();
        }
        if(this.s) {
            int v5 = Math.max(this.K.getWidth(), this.L.getWidth());
            v6 = this.k * 2 + v5;
        }
        else {
            v6 = 0;
        }
        this.C = Math.max(v6, v3);
        Drawable drawable1 = this.f;
        if(drawable1 == null) {
            rect0.setEmpty();
        }
        else {
            drawable1.getPadding(rect0);
            v2 = this.f.getIntrinsicHeight();
        }
        int v7 = rect0.left;
        int v8 = rect0.right;
        Drawable drawable2 = this.a;
        if(drawable2 != null) {
            Rect rect1 = DrawableUtils.getOpticalBounds(drawable2);
            v7 = Math.max(v7, rect1.left);
            v8 = Math.max(v8, rect1.right);
        }
        int v9 = Math.max(v2, v4);
        this.A = this.H ? Math.max(this.l, this.C * 2 + v7 + v8) : this.l;
        this.B = v9;
        super.onMeasure(v, v1);
        if(this.getMeasuredHeight() < v9) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), v9);
        }
    }

    @Override  // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onPopulateAccessibilityEvent(accessibilityEvent0);
        CharSequence charSequence0 = this.isChecked() ? this.o : this.q;
        if(charSequence0 != null) {
            accessibilityEvent0.getText().add(charSequence0);
        }
    }

    @Override  // android.widget.TextView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        float f4;
        VelocityTracker velocityTracker0 = this.x;
        velocityTracker0.addMovement(motionEvent0);
        int v = motionEvent0.getActionMasked();
        int v1 = this.u;
        if(v == 0) {
            float f9 = motionEvent0.getX();
            float f10 = motionEvent0.getY();
            if(this.isEnabled() && this.a != null) {
                int v3 = this.getThumbOffset();
                this.a.getPadding(this.Q);
                int v4 = this.D + v3 - v1;
                if(f9 > ((float)v4) && f9 < ((float)(this.C + v4 + this.Q.left + this.Q.right + v1)) && f10 > ((float)(this.E - v1)) && f10 < ((float)(this.G + v1))) {
                    this.t = 1;
                    this.v = f9;
                    this.w = f10;
                }
            }
        }
        else {
            float f = 0.0f;
        alab1:
            switch(v) {
                case 2: {
                    switch(this.t) {
                        case 1: {
                            break alab1;
                        }
                        case 2: {
                            goto label_44;
                        }
                    }
                    return super.onTouchEvent(motionEvent0);
                label_44:
                    float f2 = motionEvent0.getX();
                    int v2 = this.getThumbScrollRange();
                    float f3 = f2 - this.v;
                    if(v2 == 0) {
                        f4 = f3 > 0.0f ? 1.0f : -1.0f;
                    }
                    else {
                        f4 = f3 / ((float)v2);
                    }
                    if(ViewUtils.isLayoutRtl(this)) {
                        f4 = -f4;
                    }
                    float f5 = this.z;
                    float f6 = f4 + f5;
                    if(f6 >= 0.0f) {
                        f = f6 > 1.0f ? 1.0f : f6;
                    }
                    if(f != f5) {
                        this.v = f2;
                        this.setThumbPosition(f);
                    }
                    return true;
                }
                case 1: 
                case 3: {
                    if(this.t == 2) {
                        this.t = 0;
                        boolean z = motionEvent0.getAction() == 1 && this.isEnabled();
                        boolean z1 = this.isChecked();
                        if(z) {
                            velocityTracker0.computeCurrentVelocity(1000);
                            float f1 = velocityTracker0.getXVelocity();
                            if(Math.abs(f1) <= ((float)this.y)) {
                                z2 = this.getTargetCheckedState();
                            }
                            else if(!ViewUtils.isLayoutRtl(this)) {
                                z2 = f1 > 0.0f;
                            }
                            else if(f1 < 0.0f) {
                                z2 = true;
                            }
                            else {
                                z2 = false;
                            }
                        }
                        else {
                            z2 = z1;
                        }
                        if(z2 != z1) {
                            this.playSoundEffect(0);
                        }
                        this.setChecked(z2);
                        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
                        motionEvent1.setAction(3);
                        super.onTouchEvent(motionEvent1);
                        motionEvent1.recycle();
                        super.onTouchEvent(motionEvent0);
                        return true;
                    }
                    this.t = 0;
                    velocityTracker0.clear();
                    return super.onTouchEvent(motionEvent0);
                }
                default: {
                    return super.onTouchEvent(motionEvent0);
                }
            }
            float f7 = motionEvent0.getX();
            float f8 = motionEvent0.getY();
            if(Math.abs(f7 - this.v) > ((float)v1) || Math.abs(f8 - this.w) > ((float)v1)) {
                this.t = 2;
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.v = f7;
                this.w = f8;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().b(z);
    }

    @Override  // android.widget.CompoundButton
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean z1 = this.isChecked();
        if(!z1) {
            if(Build.VERSION.SDK_INT >= 30) {
                CharSequence charSequence1 = this.q;
                if(charSequence1 == null) {
                    charSequence1 = this.getResources().getString(string.abc_capital_off);
                }
                ViewCompat.setStateDescription(this, charSequence1);
            }
        }
        else if(Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence0 = this.o;
            if(charSequence0 == null) {
                charSequence0 = this.getResources().getString(string.abc_capital_on);
            }
            ViewCompat.setStateDescription(this, charSequence0);
        }
        float f = 0.0f;
        if(this.getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            if(z1) {
                f = 1.0f;
            }
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, SwitchCompat.R, new float[]{f});
            this.N = objectAnimator0;
            objectAnimator0.setDuration(0xFAL);
            c3.a(this.N, true);
            this.N.start();
            return;
        }
        ObjectAnimator objectAnimator1 = this.N;
        if(objectAnimator1 != null) {
            objectAnimator1.cancel();
        }
        if(z1) {
            f = 1.0f;
        }
        this.setThumbPosition(f);
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().c(z);
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        this.requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.H = z;
        this.invalidate();
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().b.getFilters(arr_inputFilter));
    }

    public void setShowText(boolean z) {
        if(this.s != z) {
            this.s = z;
            this.requestLayout();
            if(z) {
                this.d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        this.invalidate();
    }

    public void setSwitchMinWidth(int v) {
        this.l = v;
        this.requestLayout();
    }

    public void setSwitchPadding(int v) {
        this.m = v;
        this.requestLayout();
    }

    public void setSwitchTextAppearance(Context context0, int v) {
        Typeface typeface0;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, v, styleable.TextAppearance);
        ColorStateList colorStateList0 = tintTypedArray0.getColorStateList(styleable.TextAppearance_android_textColor);
        this.J = colorStateList0 == null ? this.getTextColors() : colorStateList0;
        int v1 = tintTypedArray0.getDimensionPixelSize(styleable.TextAppearance_android_textSize, 0);
        if(v1 != 0) {
            TextPaint textPaint0 = this.I;
            if(((float)v1) != textPaint0.getTextSize()) {
                textPaint0.setTextSize(((float)v1));
                this.requestLayout();
            }
        }
        int v2 = tintTypedArray0.getInt(styleable.TextAppearance_android_typeface, -1);
        int v3 = tintTypedArray0.getInt(styleable.TextAppearance_android_textStyle, -1);
        switch(v2) {
            case 1: {
                typeface0 = Typeface.SANS_SERIF;
                break;
            }
            case 2: {
                typeface0 = Typeface.SERIF;
                break;
            }
            case 3: {
                typeface0 = Typeface.MONOSPACE;
                break;
            }
            default: {
                typeface0 = null;
            }
        }
        this.setSwitchTypeface(typeface0, v3);
        this.M = tintTypedArray0.getBoolean(styleable.TextAppearance_textAllCaps, false) ? new AllCapsTransformationMethod(this.getContext()) : null;
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        tintTypedArray0.recycle();
    }

    public void setSwitchTypeface(Typeface typeface0) {
        TextPaint textPaint0 = this.I;
        if(textPaint0.getTypeface() != null && !textPaint0.getTypeface().equals(typeface0) || textPaint0.getTypeface() == null && typeface0 != null) {
            textPaint0.setTypeface(typeface0);
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface0, int v) {
        float f = 0.0f;
        boolean z = false;
        TextPaint textPaint0 = this.I;
        if(v > 0) {
            Typeface typeface1 = typeface0 == null ? Typeface.defaultFromStyle(v) : Typeface.create(typeface0, v);
            this.setSwitchTypeface(typeface1);
            int v1 = ~(typeface1 == null ? 0 : typeface1.getStyle()) & v;
            if((v1 & 1) != 0) {
                z = true;
            }
            textPaint0.setFakeBoldText(z);
            if((v1 & 2) != 0) {
                f = -0.25f;
            }
            textPaint0.setTextSkewX(f);
            return;
        }
        textPaint0.setFakeBoldText(false);
        textPaint0.setTextSkewX(0.0f);
        this.setSwitchTypeface(typeface0);
    }

    public void setTextOff(CharSequence charSequence0) {
        this.setTextOffInternal(charSequence0);
        this.requestLayout();
        if(!this.isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence1 = this.q;
            if(charSequence1 == null) {
                charSequence1 = this.getResources().getString(string.abc_capital_off);
            }
            ViewCompat.setStateDescription(this, charSequence1);
        }
    }

    private void setTextOffInternal(CharSequence charSequence0) {
        this.q = charSequence0;
        TransformationMethod transformationMethod0 = this.getEmojiTextViewHelper().b.wrapTransformationMethod(this.M);
        if(transformationMethod0 != null) {
            charSequence0 = transformationMethod0.getTransformation(charSequence0, this);
        }
        this.r = charSequence0;
        this.L = null;
        if(this.s) {
            this.d();
        }
    }

    public void setTextOn(CharSequence charSequence0) {
        this.setTextOnInternal(charSequence0);
        this.requestLayout();
        if(this.isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence1 = this.o;
            if(charSequence1 == null) {
                charSequence1 = this.getResources().getString(string.abc_capital_on);
            }
            ViewCompat.setStateDescription(this, charSequence1);
        }
    }

    private void setTextOnInternal(CharSequence charSequence0) {
        this.o = charSequence0;
        TransformationMethod transformationMethod0 = this.getEmojiTextViewHelper().b.wrapTransformationMethod(this.M);
        if(transformationMethod0 != null) {
            charSequence0 = transformationMethod0.getTransformation(charSequence0, this);
        }
        this.p = charSequence0;
        this.K = null;
        if(this.s) {
            this.d();
        }
    }

    public void setThumbDrawable(Drawable drawable0) {
        Drawable drawable1 = this.a;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.a = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        this.requestLayout();
    }

    public void setThumbPosition(float f) {
        this.z = f;
        this.invalidate();
    }

    public void setThumbResource(int v) {
        this.setThumbDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setThumbTextPadding(int v) {
        this.k = v;
        this.requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList0) {
        this.b = colorStateList0;
        this.d = true;
        this.a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c = porterDuff$Mode0;
        this.e = true;
        this.a();
    }

    public void setTrackDrawable(Drawable drawable0) {
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.f = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        this.requestLayout();
    }

    public void setTrackResource(int v) {
        this.setTrackDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList0) {
        this.g = colorStateList0;
        this.i = true;
        this.b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.h = porterDuff$Mode0;
        this.j = true;
        this.b();
    }

    @Override  // android.widget.CompoundButton
    public void toggle() {
        this.setChecked(!this.isChecked());
    }

    @Override  // android.widget.CompoundButton
    public boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.a || drawable0 == this.f;
    }
}

