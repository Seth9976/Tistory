package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import androidx.appcompat.R.styleable;

public class AlertController.RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController.RecycleListView(Context context0) {
        this(context0, null);
    }

    public AlertController.RecycleListView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RecycleListView);
        this.b = typedArray0.getDimensionPixelOffset(styleable.RecycleListView_paddingBottomNoButtons, -1);
        this.a = typedArray0.getDimensionPixelOffset(styleable.RecycleListView_paddingTopNoTitle, -1);
    }

    // 去混淆评级： 低(20)
    public void setHasDecor(boolean z, boolean z1) {
        if(!z1 || !z) {
            this.setPadding(this.getPaddingLeft(), (z ? this.getPaddingTop() : this.a), this.getPaddingRight(), (z1 ? this.getPaddingBottom() : this.b));
        }
    }
}

