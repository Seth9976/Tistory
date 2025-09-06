package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.dimen;
import com.google.android.material.R.plurals;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale.Category;
import java.util.Locale;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class BadgeState {
    public static final class State implements Parcelable {
        public Integer A;
        public Integer B;
        public Integer C;
        public static final Parcelable.Creator CREATOR;
        public Boolean D;
        public int a;
        public Integer b;
        public Integer c;
        public Integer d;
        public Integer e;
        public Integer f;
        public Integer g;
        public Integer h;
        public int i;
        public String j;
        public int k;
        public int l;
        public int m;
        public Locale n;
        public CharSequence o;
        public CharSequence p;
        public int q;
        public int r;
        public Integer s;
        public Boolean t;
        public Integer u;
        public Integer v;
        public Integer w;
        public Integer x;
        public Integer y;
        public Integer z;

        static {
            State.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public State() {
            this.i = 0xFF;
            this.k = -2;
            this.l = -2;
            this.m = -2;
            this.t = Boolean.TRUE;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeSerializable(this.b);
            parcel0.writeSerializable(this.c);
            parcel0.writeSerializable(this.d);
            parcel0.writeSerializable(this.e);
            parcel0.writeSerializable(this.f);
            parcel0.writeSerializable(this.g);
            parcel0.writeSerializable(this.h);
            parcel0.writeInt(this.i);
            parcel0.writeString(this.j);
            parcel0.writeInt(this.k);
            parcel0.writeInt(this.l);
            parcel0.writeInt(this.m);
            String s = null;
            parcel0.writeString((this.o == null ? null : this.o.toString()));
            CharSequence charSequence0 = this.p;
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            parcel0.writeString(s);
            parcel0.writeInt(this.q);
            parcel0.writeSerializable(this.s);
            parcel0.writeSerializable(this.u);
            parcel0.writeSerializable(this.v);
            parcel0.writeSerializable(this.w);
            parcel0.writeSerializable(this.x);
            parcel0.writeSerializable(this.y);
            parcel0.writeSerializable(this.z);
            parcel0.writeSerializable(this.C);
            parcel0.writeSerializable(this.A);
            parcel0.writeSerializable(this.B);
            parcel0.writeSerializable(this.t);
            parcel0.writeSerializable(this.n);
            parcel0.writeSerializable(this.D);
        }
    }

    public final State a;
    public final State b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public BadgeState(Context context0, int v, int v1, int v2, State badgeState$State0) {
        AttributeSet attributeSet1;
        int v4;
        State badgeState$State1 = new State();
        this.b = badgeState$State1;
        if(badgeState$State0 == null) {
            badgeState$State0 = new State();
        }
        if(v != 0) {
            badgeState$State0.a = v;
        }
        int v3 = badgeState$State0.a;
        if(v3 == 0) {
            attributeSet1 = null;
            v4 = 0;
        }
        else {
            AttributeSet attributeSet0 = DrawableUtils.parseDrawableXml(context0, v3, "badge");
            v4 = attributeSet0.getStyleAttribute();
            attributeSet1 = attributeSet0;
        }
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context0, attributeSet1, styleable.Badge, v1, (v4 == 0 ? v2 : v4), new int[0]);
        Resources resources0 = context0.getResources();
        this.c = (float)typedArray0.getDimensionPixelSize(styleable.Badge_badgeRadius, -1);
        this.i = context0.getResources().getDimensionPixelSize(dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context0.getResources().getDimensionPixelSize(dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = (float)typedArray0.getDimensionPixelSize(styleable.Badge_badgeWithTextRadius, -1);
        this.e = typedArray0.getDimension(styleable.Badge_badgeWidth, resources0.getDimension(dimen.m3_badge_size));
        this.g = typedArray0.getDimension(styleable.Badge_badgeWithTextWidth, resources0.getDimension(dimen.m3_badge_with_text_size));
        this.f = typedArray0.getDimension(styleable.Badge_badgeHeight, resources0.getDimension(dimen.m3_badge_size));
        this.h = typedArray0.getDimension(styleable.Badge_badgeWithTextHeight, resources0.getDimension(dimen.m3_badge_with_text_size));
        boolean z = true;
        this.k = typedArray0.getInt(styleable.Badge_offsetAlignmentMode, 1);
        badgeState$State1.i = badgeState$State0.i == -2 ? 0xFF : badgeState$State0.i;
        int v5 = badgeState$State0.k;
        if(v5 != -2) {
            badgeState$State1.k = v5;
        }
        else if(typedArray0.hasValue(styleable.Badge_number)) {
            badgeState$State1.k = typedArray0.getInt(styleable.Badge_number, 0);
        }
        else {
            badgeState$State1.k = -1;
        }
        String s = badgeState$State0.j;
        if(s != null) {
            badgeState$State1.j = s;
        }
        else if(typedArray0.hasValue(styleable.Badge_badgeText)) {
            badgeState$State1.j = typedArray0.getString(styleable.Badge_badgeText);
        }
        badgeState$State1.o = badgeState$State0.o;
        CharSequence charSequence0 = badgeState$State0.p;
        if(charSequence0 == null) {
            charSequence0 = context0.getString(string.mtrl_badge_numberless_content_description);
        }
        badgeState$State1.p = charSequence0;
        badgeState$State1.q = badgeState$State0.q == 0 ? plurals.mtrl_badge_content_description : badgeState$State0.q;
        badgeState$State1.r = badgeState$State0.r == 0 ? string.mtrl_exceed_max_badge_number_content_description : badgeState$State0.r;
        if(badgeState$State0.t != null && !badgeState$State0.t.booleanValue()) {
            z = false;
        }
        badgeState$State1.t = Boolean.valueOf(z);
        badgeState$State1.l = badgeState$State0.l == -2 ? typedArray0.getInt(styleable.Badge_maxCharacterCount, -2) : badgeState$State0.l;
        badgeState$State1.m = badgeState$State0.m == -2 ? typedArray0.getInt(styleable.Badge_maxNumber, -2) : badgeState$State0.m;
        badgeState$State1.e = (int)(badgeState$State0.e == null ? typedArray0.getResourceId(styleable.Badge_badgeShapeAppearance, style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : ((int)badgeState$State0.e));
        badgeState$State1.f = (int)(badgeState$State0.f == null ? typedArray0.getResourceId(styleable.Badge_badgeShapeAppearanceOverlay, 0) : ((int)badgeState$State0.f));
        badgeState$State1.g = (int)(badgeState$State0.g == null ? typedArray0.getResourceId(styleable.Badge_badgeWithTextShapeAppearance, style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : ((int)badgeState$State0.g));
        badgeState$State1.h = (int)(badgeState$State0.h == null ? typedArray0.getResourceId(styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : ((int)badgeState$State0.h));
        badgeState$State1.b = (int)(badgeState$State0.b == null ? MaterialResources.getColorStateList(context0, typedArray0, styleable.Badge_backgroundColor).getDefaultColor() : ((int)badgeState$State0.b));
        badgeState$State1.d = (int)(badgeState$State0.d == null ? typedArray0.getResourceId(styleable.Badge_badgeTextAppearance, style.TextAppearance_MaterialComponents_Badge) : ((int)badgeState$State0.d));
        Integer integer0 = badgeState$State0.c;
        if(integer0 != null) {
            badgeState$State1.c = integer0;
        }
        else if(typedArray0.hasValue(styleable.Badge_badgeTextColor)) {
            badgeState$State1.c = MaterialResources.getColorStateList(context0, typedArray0, styleable.Badge_badgeTextColor).getDefaultColor();
        }
        else {
            badgeState$State1.c = new TextAppearance(context0, ((int)badgeState$State1.d)).getTextColor().getDefaultColor();
        }
        badgeState$State1.s = (int)(badgeState$State0.s == null ? typedArray0.getInt(styleable.Badge_badgeGravity, 0x800035) : ((int)badgeState$State0.s));
        badgeState$State1.u = (int)(badgeState$State0.u == null ? typedArray0.getDimensionPixelSize(styleable.Badge_badgeWidePadding, resources0.getDimensionPixelSize(dimen.mtrl_badge_long_text_horizontal_padding)) : ((int)badgeState$State0.u));
        badgeState$State1.v = (int)(badgeState$State0.v == null ? typedArray0.getDimensionPixelSize(styleable.Badge_badgeVerticalPadding, resources0.getDimensionPixelSize(dimen.m3_badge_with_text_vertical_padding)) : ((int)badgeState$State0.v));
        badgeState$State1.w = (int)(badgeState$State0.w == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_horizontalOffset, 0) : ((int)badgeState$State0.w));
        badgeState$State1.x = (int)(badgeState$State0.x == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_verticalOffset, 0) : ((int)badgeState$State0.x));
        badgeState$State1.y = (int)(badgeState$State0.y == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_horizontalOffsetWithText, ((int)badgeState$State1.w)) : ((int)badgeState$State0.y));
        badgeState$State1.z = (int)(badgeState$State0.z == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_verticalOffsetWithText, ((int)badgeState$State1.x)) : ((int)badgeState$State0.z));
        badgeState$State1.C = (int)(badgeState$State0.C == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : ((int)badgeState$State0.C));
        badgeState$State1.A = (int)(badgeState$State0.A == null ? 0 : ((int)badgeState$State0.A));
        badgeState$State1.B = (int)(badgeState$State0.B == null ? 0 : ((int)badgeState$State0.B));
        badgeState$State1.D = Boolean.valueOf((badgeState$State0.D == null ? typedArray0.getBoolean(styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : badgeState$State0.D.booleanValue()));
        typedArray0.recycle();
        Locale locale0 = badgeState$State0.n;
        badgeState$State1.n = locale0 == null ? Locale.getDefault(Locale.Category.FORMAT) : locale0;
        this.a = badgeState$State0;
    }
}

