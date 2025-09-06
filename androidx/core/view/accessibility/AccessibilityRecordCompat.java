package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class AccessibilityRecordCompat {
    public final AccessibilityRecord a;

    @Deprecated
    public AccessibilityRecordCompat(Object object0) {
        this.a = (AccessibilityRecord)object0;
    }

    @Override
    @Deprecated
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityRecordCompat)) {
            return false;
        }
        return this.a == null ? ((AccessibilityRecordCompat)object0).a == null : this.a.equals(((AccessibilityRecordCompat)object0).a);
    }

    @Deprecated
    public int getAddedCount() {
        return this.a.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.a.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.a.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.a.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.a.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.a.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.a;
    }

    @Deprecated
    public int getItemCount() {
        return this.a.getItemCount();
    }

    public static int getMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord0) {
        return accessibilityRecord0.getMaxScrollX();
    }

    @Deprecated
    public int getMaxScrollX() {
        return AccessibilityRecordCompat.getMaxScrollX(this.a);
    }

    public static int getMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord0) {
        return accessibilityRecord0.getMaxScrollY();
    }

    @Deprecated
    public int getMaxScrollY() {
        return AccessibilityRecordCompat.getMaxScrollY(this.a);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.a.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.a.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.a.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public AccessibilityNodeInfoCompat getSource() {
        return AccessibilityNodeInfoCompat.e(this.a.getSource());
    }

    @Deprecated
    public List getText() {
        return this.a.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.a.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.a.getWindowId();
    }

    @Override
    @Deprecated
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.a.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.a.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.a.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.a.isScrollable();
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain() {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityRecordCompat0) {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain(accessibilityRecordCompat0.a));
    }

    @Deprecated
    public void recycle() {
        this.a.recycle();
    }

    @Deprecated
    public void setAddedCount(int v) {
        this.a.setAddedCount(v);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence0) {
        this.a.setBeforeText(charSequence0);
    }

    @Deprecated
    public void setChecked(boolean z) {
        this.a.setChecked(z);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence0) {
        this.a.setClassName(charSequence0);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence0) {
        this.a.setContentDescription(charSequence0);
    }

    @Deprecated
    public void setCurrentItemIndex(int v) {
        this.a.setCurrentItemIndex(v);
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    @Deprecated
    public void setFromIndex(int v) {
        this.a.setFromIndex(v);
    }

    @Deprecated
    public void setFullScreen(boolean z) {
        this.a.setFullScreen(z);
    }

    @Deprecated
    public void setItemCount(int v) {
        this.a.setItemCount(v);
    }

    public static void setMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord0, int v) {
        accessibilityRecord0.setMaxScrollX(v);
    }

    @Deprecated
    public void setMaxScrollX(int v) {
        AccessibilityRecordCompat.setMaxScrollX(this.a, v);
    }

    public static void setMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord0, int v) {
        accessibilityRecord0.setMaxScrollY(v);
    }

    @Deprecated
    public void setMaxScrollY(int v) {
        AccessibilityRecordCompat.setMaxScrollY(this.a, v);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable0) {
        this.a.setParcelableData(parcelable0);
    }

    @Deprecated
    public void setPassword(boolean z) {
        this.a.setPassword(z);
    }

    @Deprecated
    public void setRemovedCount(int v) {
        this.a.setRemovedCount(v);
    }

    @Deprecated
    public void setScrollX(int v) {
        this.a.setScrollX(v);
    }

    @Deprecated
    public void setScrollY(int v) {
        this.a.setScrollY(v);
    }

    @Deprecated
    public void setScrollable(boolean z) {
        this.a.setScrollable(z);
    }

    public static void setSource(@NonNull AccessibilityRecord accessibilityRecord0, @Nullable View view0, int v) {
        accessibilityRecord0.setSource(view0, v);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void setSource(View view0) {
        this.a.setSource(view0);
    }

    @Deprecated
    public void setSource(View view0, int v) {
        AccessibilityRecordCompat.setSource(this.a, view0, v);
    }

    @Deprecated
    public void setToIndex(int v) {
        this.a.setToIndex(v);
    }
}

