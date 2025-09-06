package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public class Space extends View {
    @Deprecated
    public Space(@NonNull Context context0) {
        this(context0, null);
    }

    @Deprecated
    public Space(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    @Deprecated
    public Space(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        if(this.getVisibility() == 0) {
            this.setVisibility(4);
        }
    }

    @Override  // android.view.View
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas0) {
    }

    @Override  // android.view.View
    @Deprecated
    public void onMeasure(int v, int v1) {
        int v2 = this.getSuggestedMinimumWidth();
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getSize(v);
        switch(v3) {
            case 0x80000000: {
                v2 = Math.min(v2, v4);
                break;
            }
            case 0x40000000: {
                v2 = v4;
            }
        }
        int v5 = this.getSuggestedMinimumHeight();
        int v6 = View.MeasureSpec.getMode(v1);
        int v7 = View.MeasureSpec.getSize(v1);
        switch(v6) {
            case 0x80000000: {
                v5 = Math.min(v5, v7);
                break;
            }
            case 0x40000000: {
                v5 = v7;
            }
        }
        this.setMeasuredDimension(v2, v5);
    }
}

