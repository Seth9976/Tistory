package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import java.io.IOException;
import jeb.synthetic.TWR;
import m.c;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class SupportMenuInflater extends MenuInflater {
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;
    public static final Class[] e;
    public static final Class[] f;

    static {
        Class[] arr_class = {Context.class};
        SupportMenuInflater.e = arr_class;
        SupportMenuInflater.f = arr_class;
    }

    public SupportMenuInflater(Context context0) {
        super(context0);
        this.c = context0;
        Object[] arr_object = {context0};
        this.a = arr_object;
        this.b = arr_object;
    }

    public static Object a(Context context0) {
        if(context0 instanceof Activity) {
            return context0;
        }
        return context0 instanceof ContextWrapper ? SupportMenuInflater.a(((ContextWrapper)context0).getBaseContext()) : context0;
    }

    public final void b(XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Menu menu0) {
        c c0 = new c(this, menu0);
        int v = xmlResourceParser0.getEventType();
        do {
            if(v == 2) {
                String s = xmlResourceParser0.getName();
                if(!s.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + s);
                }
                v = xmlResourceParser0.next();
                break;
            }
            v = xmlResourceParser0.next();
        }
        while(v != 1);
        boolean z = false;
        String s1 = null;
        boolean z1 = false;
        while(!z1) {
            switch(v) {
                case 1: {
                    throw new RuntimeException("Unexpected end of document");
                }
                case 2: {
                    if(!z) {
                        String s2 = xmlResourceParser0.getName();
                        SupportMenuInflater supportMenuInflater0 = c0.E;
                        if(s2.equals("group")) {
                            TypedArray typedArray0 = supportMenuInflater0.c.obtainStyledAttributes(attributeSet0, styleable.MenuGroup);
                            c0.b = typedArray0.getResourceId(styleable.MenuGroup_android_id, 0);
                            c0.c = typedArray0.getInt(styleable.MenuGroup_android_menuCategory, 0);
                            c0.d = typedArray0.getInt(styleable.MenuGroup_android_orderInCategory, 0);
                            c0.e = typedArray0.getInt(styleable.MenuGroup_android_checkableBehavior, 0);
                            c0.f = typedArray0.getBoolean(styleable.MenuGroup_android_visible, true);
                            c0.g = typedArray0.getBoolean(styleable.MenuGroup_android_enabled, true);
                            typedArray0.recycle();
                        }
                        else if(s2.equals("item")) {
                            TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(supportMenuInflater0.c, attributeSet0, styleable.MenuItem);
                            c0.i = tintTypedArray0.getResourceId(styleable.MenuItem_android_id, 0);
                            c0.j = tintTypedArray0.getInt(styleable.MenuItem_android_menuCategory, c0.c) & 0xFFFF0000 | tintTypedArray0.getInt(styleable.MenuItem_android_orderInCategory, c0.d) & 0xFFFF;
                            c0.k = tintTypedArray0.getText(styleable.MenuItem_android_title);
                            c0.l = tintTypedArray0.getText(styleable.MenuItem_android_titleCondensed);
                            c0.m = tintTypedArray0.getResourceId(styleable.MenuItem_android_icon, 0);
                            String s3 = tintTypedArray0.getString(styleable.MenuItem_android_alphabeticShortcut);
                            c0.n = s3 == null ? '\u0000' : s3.charAt(0);
                            c0.o = tintTypedArray0.getInt(styleable.MenuItem_alphabeticModifiers, 0x1000);
                            String s4 = tintTypedArray0.getString(styleable.MenuItem_android_numericShortcut);
                            c0.p = s4 == null ? '\u0000' : s4.charAt(0);
                            c0.q = tintTypedArray0.getInt(styleable.MenuItem_numericModifiers, 0x1000);
                            c0.r = tintTypedArray0.hasValue(styleable.MenuItem_android_checkable) ? tintTypedArray0.getBoolean(styleable.MenuItem_android_checkable, false) : c0.e;
                            c0.s = tintTypedArray0.getBoolean(styleable.MenuItem_android_checked, false);
                            c0.t = tintTypedArray0.getBoolean(styleable.MenuItem_android_visible, c0.f);
                            c0.u = tintTypedArray0.getBoolean(styleable.MenuItem_android_enabled, c0.g);
                            c0.v = tintTypedArray0.getInt(styleable.MenuItem_showAsAction, -1);
                            c0.y = tintTypedArray0.getString(styleable.MenuItem_android_onClick);
                            c0.w = tintTypedArray0.getResourceId(styleable.MenuItem_actionLayout, 0);
                            c0.x = tintTypedArray0.getString(styleable.MenuItem_actionViewClass);
                            String s5 = tintTypedArray0.getString(styleable.MenuItem_actionProviderClass);
                            boolean z2 = s5 != null;
                            if(!z2 || c0.w != 0 || c0.x != null) {
                                if(z2) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute \'actionProviderClass\'. Action view already specified.");
                                }
                                c0.z = null;
                            }
                            else {
                                c0.z = (ActionProvider)c0.a(s5, SupportMenuInflater.f, supportMenuInflater0.b);
                            }
                            c0.A = tintTypedArray0.getText(styleable.MenuItem_contentDescription);
                            c0.B = tintTypedArray0.getText(styleable.MenuItem_tooltipText);
                            c0.D = tintTypedArray0.hasValue(styleable.MenuItem_iconTintMode) ? DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.MenuItem_iconTintMode, -1), c0.D) : null;
                            c0.C = tintTypedArray0.hasValue(styleable.MenuItem_iconTint) ? tintTypedArray0.getColorStateList(styleable.MenuItem_iconTint) : null;
                            tintTypedArray0.recycle();
                            c0.h = false;
                        }
                        else if(s2.equals("menu")) {
                            c0.h = true;
                            SubMenu subMenu0 = c0.a.addSubMenu(c0.b, c0.i, c0.j, c0.k);
                            c0.b(subMenu0.getItem());
                            this.b(xmlResourceParser0, attributeSet0, subMenu0);
                        }
                        else {
                            s1 = s2;
                            z = true;
                        }
                    }
                    break;
                }
                case 3: {
                    String s6 = xmlResourceParser0.getName();
                    if(z && s6.equals(s1)) {
                        z = false;
                        s1 = null;
                    }
                    else if(s6.equals("group")) {
                        c0.b = 0;
                        c0.c = 0;
                        c0.d = 0;
                        c0.e = 0;
                        c0.f = true;
                        c0.g = true;
                    }
                    else if(!s6.equals("item")) {
                        if(s6.equals("menu")) {
                            z1 = true;
                        }
                    }
                    else if(!c0.h) {
                        if(c0.z == null || !c0.z.hasSubMenu()) {
                            c0.h = true;
                            c0.b(c0.a.add(c0.b, c0.i, c0.j, c0.k));
                        }
                        else {
                            c0.h = true;
                            c0.b(c0.a.addSubMenu(c0.b, c0.i, c0.j, c0.k).getItem());
                        }
                    }
                }
            }
            v = xmlResourceParser0.next();
        }
    }

    @Override  // android.view.MenuInflater
    public void inflate(@LayoutRes int v, Menu menu0) {
        XmlResourceParser xmlResourceParser0;
        if(!(menu0 instanceof SupportMenu)) {
            super.inflate(v, menu0);
            return;
        }
        try {
            try {
                xmlResourceParser0 = null;
                xmlResourceParser0 = this.c.getResources().getLayout(v);
                this.b(xmlResourceParser0, Xml.asAttributeSet(xmlResourceParser0), menu0);
            }
            catch(XmlPullParserException xmlPullParserException0) {
                throw new InflateException("Error inflating menu XML", xmlPullParserException0);
            }
            catch(IOException iOException0) {
                throw new InflateException("Error inflating menu XML", iOException0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(xmlResourceParser0, throwable0);
            throw throwable0;
        }
        xmlResourceParser0.close();
    }
}

