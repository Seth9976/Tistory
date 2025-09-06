package u7;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R.string;
import com.google.android.material.chip.Chip;
import java.util.List;

public final class b extends ExploreByTouchHelper {
    public final Chip q;

    public b(Chip chip0, Chip chip1) {
        this.q = chip0;
        super(chip1);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f, float f1) {
        return !this.q.c() || !this.q.getCloseIconTouchBounds().contains(f, f1) ? 0 : 1;
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List list0) {
        list0.add(0);
        if(this.q.c() && this.q.isCloseIconVisible() && this.q.h != null) {
            list0.add(1);
        }
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int v, int v1, Bundle bundle0) {
        if(v1 == 16) {
            Chip chip0 = this.q;
            if(v == 0) {
                return chip0.performClick();
            }
            return v == 1 ? chip0.performCloseIconClick() : false;
        }
        return false;
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        accessibilityNodeInfoCompat0.setCheckable(this.q.isCheckable());
        accessibilityNodeInfoCompat0.setClickable(this.q.isClickable());
        accessibilityNodeInfoCompat0.setClassName(this.q.getAccessibilityClassName());
        accessibilityNodeInfoCompat0.setText(this.q.getText());
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForVirtualView(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        CharSequence charSequence0 = "";
        if(v == 1) {
            Chip chip0 = this.q;
            CharSequence charSequence1 = chip0.getCloseIconContentDescription();
            if(charSequence1 == null) {
                CharSequence charSequence2 = chip0.getText();
                Context context0 = chip0.getContext();
                int v1 = string.mtrl_chip_close_icon_content_description;
                if(!TextUtils.isEmpty(charSequence2)) {
                    charSequence0 = charSequence2;
                }
                accessibilityNodeInfoCompat0.setContentDescription(context0.getString(v1, new Object[]{charSequence0}).trim());
            }
            else {
                accessibilityNodeInfoCompat0.setContentDescription(charSequence1);
            }
            accessibilityNodeInfoCompat0.setBoundsInParent(chip0.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat0.setEnabled(chip0.isEnabled());
            return;
        }
        accessibilityNodeInfoCompat0.setContentDescription("");
        accessibilityNodeInfoCompat0.setBoundsInParent(Chip.y);
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final void onVirtualViewKeyboardFocusChanged(int v, boolean z) {
        if(v == 1) {
            this.q.n = z;
            this.q.refreshDrawableState();
        }
    }
}

