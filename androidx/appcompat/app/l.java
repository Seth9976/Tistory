package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class l {
    public NestedScrollView A;
    public int B;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final j P;
    public final e Q;
    public final Context a;
    public final AlertDialog b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController.RecycleListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    public l(Context context0, AlertDialog alertDialog0, Window window0) {
        this.n = false;
        this.B = 0;
        this.I = -1;
        this.Q = new e(this);
        this.a = context0;
        this.b = alertDialog0;
        this.c = window0;
        j j0 = new j();
        j0.b = new WeakReference(alertDialog0);
        this.P = j0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, styleable.AlertDialog, attr.alertDialogStyle, 0);
        this.J = typedArray0.getResourceId(styleable.AlertDialog_android_layout, 0);
        typedArray0.getResourceId(styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.K = typedArray0.getResourceId(styleable.AlertDialog_listLayout, 0);
        this.L = typedArray0.getResourceId(styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.M = typedArray0.getResourceId(styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.N = typedArray0.getResourceId(styleable.AlertDialog_listItemLayout, 0);
        this.O = typedArray0.getBoolean(styleable.AlertDialog_showTitle, true);
        this.d = typedArray0.getDimensionPixelSize(styleable.AlertDialog_buttonIconDimen, 0);
        typedArray0.recycle();
        alertDialog0.supportRequestWindowFeature(1);
    }

    public static boolean a(View view0) {
        if(view0.onCheckIsTextEditor()) {
            return true;
        }
        if(!(view0 instanceof ViewGroup)) {
            return false;
        }
        int v = ((ViewGroup)view0).getChildCount();
        while(v > 0) {
            --v;
            if(l.a(((ViewGroup)view0).getChildAt(v))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public static ViewGroup b(View view0, View view1) {
        if(view0 == null) {
            if(view1 instanceof ViewStub) {
                view1 = ((ViewStub)view1).inflate();
            }
            return (ViewGroup)view1;
        }
        if(view1 != null) {
            ViewParent viewParent0 = view1.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(view1);
            }
        }
        if(view0 instanceof ViewStub) {
            view0 = ((ViewStub)view0).inflate();
        }
        return (ViewGroup)view0;
    }

    public final void c(int v, CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0, Message message0, Drawable drawable0) {
        if(message0 == null && dialogInterface$OnClickListener0 != null) {
            message0 = this.P.obtainMessage(v, dialogInterface$OnClickListener0);
        }
        switch(v) {
            case -3: {
                this.x = charSequence0;
                this.y = message0;
                this.z = drawable0;
                return;
            }
            case -2: {
                this.t = charSequence0;
                this.u = message0;
                this.v = drawable0;
                return;
            }
            case -1: {
                this.p = charSequence0;
                this.q = message0;
                this.r = drawable0;
                return;
            }
            default: {
                throw new IllegalArgumentException("Button does not exist");
            }
        }
    }

    public final void d(int v) {
        this.C = null;
        this.B = v;
        ImageView imageView0 = this.D;
        if(imageView0 != null) {
            if(v != 0) {
                imageView0.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView0.setVisibility(8);
        }
    }
}

