package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R.styleable;

public class MockView extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public boolean e;
    public final Rect f;
    public int g;
    public int h;
    public int i;
    public int j;
    protected String mText;

    public MockView(Context context0) {
        super(context0);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.mText = null;
        this.f = new Rect();
        this.g = Color.argb(0xFF, 0, 0, 0);
        this.h = Color.argb(0xFF, 200, 200, 200);
        this.i = Color.argb(0xFF, 50, 50, 50);
        this.j = 4;
        this.a(context0, null);
    }

    public MockView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.mText = null;
        this.f = new Rect();
        this.g = Color.argb(0xFF, 0, 0, 0);
        this.h = Color.argb(0xFF, 200, 200, 200);
        this.i = Color.argb(0xFF, 50, 50, 50);
        this.j = 4;
        this.a(context0, attributeSet0);
    }

    public MockView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.mText = null;
        this.f = new Rect();
        this.g = Color.argb(0xFF, 0, 0, 0);
        this.h = Color.argb(0xFF, 200, 200, 200);
        this.i = Color.argb(0xFF, 50, 50, 50);
        this.j = 4;
        this.a(context0, attributeSet0);
    }

    public final void a(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MockView);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MockView_mock_label) {
                    this.mText = typedArray0.getString(v2);
                }
                else if(v2 == styleable.MockView_mock_showDiagonals) {
                    this.d = typedArray0.getBoolean(v2, this.d);
                }
                else if(v2 == styleable.MockView_mock_diagonalsColor) {
                    this.g = typedArray0.getColor(v2, this.g);
                }
                else if(v2 == styleable.MockView_mock_labelBackgroundColor) {
                    this.i = typedArray0.getColor(v2, this.i);
                }
                else if(v2 == styleable.MockView_mock_labelColor) {
                    this.h = typedArray0.getColor(v2, this.h);
                }
                else if(v2 == styleable.MockView_mock_showLabel) {
                    this.e = typedArray0.getBoolean(v2, this.e);
                }
            }
            typedArray0.recycle();
        }
        if(this.mText == null) {
            try {
                this.mText = context0.getResources().getResourceEntryName(this.getId());
            }
            catch(Exception unused_ex) {
            }
        }
        this.a.setColor(this.g);
        this.a.setAntiAlias(true);
        this.b.setColor(this.h);
        this.b.setAntiAlias(true);
        this.c.setColor(this.i);
        float f = (float)this.j;
        this.j = Math.round(this.getResources().getDisplayMetrics().xdpi / 160.0f * f);
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.getWidth();
        int v1 = this.getHeight();
        if(this.d) {
            --v;
            --v1;
            canvas0.drawLine(0.0f, 0.0f, ((float)v), ((float)v1), this.a);
            canvas0.drawLine(0.0f, ((float)v1), ((float)v), 0.0f, this.a);
            canvas0.drawLine(0.0f, 0.0f, ((float)v), 0.0f, this.a);
            canvas0.drawLine(((float)v), 0.0f, ((float)v), ((float)v1), this.a);
            canvas0.drawLine(((float)v), ((float)v1), 0.0f, ((float)v1), this.a);
            canvas0.drawLine(0.0f, ((float)v1), 0.0f, 0.0f, this.a);
        }
        String s = this.mText;
        if(s != null && this.e) {
            this.b.getTextBounds(s, 0, s.length(), this.f);
            float f = ((float)(v - this.f.width())) / 2.0f;
            float f1 = ((float)(v1 - this.f.height())) / 2.0f + ((float)this.f.height());
            this.f.offset(((int)f), ((int)f1));
            this.f.set(this.f.left - this.j, this.f.top - this.j, this.f.right + this.j, this.f.bottom + this.j);
            canvas0.drawRect(this.f, this.c);
            canvas0.drawText(this.mText, f, f1, this.b);
        }
    }
}

