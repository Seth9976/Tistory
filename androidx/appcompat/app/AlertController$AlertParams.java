package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class AlertController.AlertParams {
    public interface OnPrepareListViewListener {
        void onPrepareListView(ListView arg1);
    }

    public ListAdapter mAdapter;
    public boolean mCancelable;
    public int mCheckedItem;
    public boolean[] mCheckedItems;
    public final Context mContext;
    public Cursor mCursor;
    public View mCustomTitleView;
    public boolean mForceInverseBackground;
    public Drawable mIcon;
    public int mIconAttrId;
    public int mIconId;
    public final LayoutInflater mInflater;
    public String mIsCheckedColumn;
    public boolean mIsMultiChoice;
    public boolean mIsSingleChoice;
    public CharSequence[] mItems;
    public String mLabelColumn;
    public CharSequence mMessage;
    public Drawable mNegativeButtonIcon;
    public DialogInterface.OnClickListener mNegativeButtonListener;
    public CharSequence mNegativeButtonText;
    public Drawable mNeutralButtonIcon;
    public DialogInterface.OnClickListener mNeutralButtonListener;
    public CharSequence mNeutralButtonText;
    public DialogInterface.OnCancelListener mOnCancelListener;
    public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
    public DialogInterface.OnClickListener mOnClickListener;
    public DialogInterface.OnDismissListener mOnDismissListener;
    public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    public DialogInterface.OnKeyListener mOnKeyListener;
    public OnPrepareListViewListener mOnPrepareListViewListener;
    public Drawable mPositiveButtonIcon;
    public DialogInterface.OnClickListener mPositiveButtonListener;
    public CharSequence mPositiveButtonText;
    public boolean mRecycleOnMeasure;
    public CharSequence mTitle;
    public View mView;
    public int mViewLayoutResId;
    public int mViewSpacingBottom;
    public int mViewSpacingLeft;
    public int mViewSpacingRight;
    public boolean mViewSpacingSpecified;
    public int mViewSpacingTop;

    public AlertController.AlertParams(Context context0) {
        this.mIconId = 0;
        this.mIconAttrId = 0;
        this.mViewSpacingSpecified = false;
        this.mCheckedItem = -1;
        this.mRecycleOnMeasure = true;
        this.mContext = context0;
        this.mCancelable = true;
        this.mInflater = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    public void apply(l l0) {
        ListAdapter listAdapter0;
        View view0 = this.mCustomTitleView;
        if(view0 == null) {
            CharSequence charSequence0 = this.mTitle;
            if(charSequence0 != null) {
                l0.e = charSequence0;
                TextView textView0 = l0.E;
                if(textView0 != null) {
                    textView0.setText(charSequence0);
                }
            }
            Drawable drawable0 = this.mIcon;
            if(drawable0 != null) {
                l0.C = drawable0;
                l0.B = 0;
                ImageView imageView0 = l0.D;
                if(imageView0 != null) {
                    imageView0.setVisibility(0);
                    l0.D.setImageDrawable(drawable0);
                }
            }
            int v = this.mIconId;
            if(v != 0) {
                l0.d(v);
            }
            int v1 = this.mIconAttrId;
            if(v1 != 0) {
                l0.getClass();
                TypedValue typedValue0 = new TypedValue();
                l0.a.getTheme().resolveAttribute(v1, typedValue0, true);
                l0.d(typedValue0.resourceId);
            }
        }
        else {
            l0.G = view0;
        }
        CharSequence charSequence1 = this.mMessage;
        if(charSequence1 != null) {
            l0.f = charSequence1;
            TextView textView1 = l0.F;
            if(textView1 != null) {
                textView1.setText(charSequence1);
            }
        }
        CharSequence charSequence2 = this.mPositiveButtonText;
        if(charSequence2 != null || this.mPositiveButtonIcon != null) {
            l0.c(-1, charSequence2, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
        }
        CharSequence charSequence3 = this.mNegativeButtonText;
        if(charSequence3 != null || this.mNegativeButtonIcon != null) {
            l0.c(-2, charSequence3, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
        }
        CharSequence charSequence4 = this.mNeutralButtonText;
        if(charSequence4 != null || this.mNeutralButtonIcon != null) {
            l0.c(-3, charSequence4, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
        }
        if(this.mItems != null || this.mCursor != null || this.mAdapter != null) {
            View view1 = this.mInflater.inflate(l0.K, null);
            if(!this.mIsMultiChoice) {
                int v2 = this.mIsSingleChoice ? l0.M : l0.N;
                if(this.mCursor == null) {
                    listAdapter0 = this.mAdapter;
                    if(listAdapter0 == null) {
                        listAdapter0 = new k(this.mContext, v2, 0x1020014, this.mItems);  // 初始化器: Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V
                    }
                }
                else {
                    listAdapter0 = new SimpleCursorAdapter(this.mContext, v2, this.mCursor, new String[]{this.mLabelColumn}, new int[]{0x1020014});
                }
            }
            else if(this.mCursor == null) {
                listAdapter0 = new f(this, this.mContext, l0.L, this.mItems, ((AlertController.RecycleListView)view1));
            }
            else {
                listAdapter0 = new g(this, this.mContext, this.mCursor, ((AlertController.RecycleListView)view1), l0);
            }
            OnPrepareListViewListener alertController$AlertParams$OnPrepareListViewListener0 = this.mOnPrepareListViewListener;
            if(alertController$AlertParams$OnPrepareListViewListener0 != null) {
                alertController$AlertParams$OnPrepareListViewListener0.onPrepareListView(((AlertController.RecycleListView)view1));
            }
            l0.H = listAdapter0;
            l0.I = this.mCheckedItem;
            if(this.mOnClickListener != null) {
                ((AlertController.RecycleListView)view1).setOnItemClickListener(new h(this, l0));
            }
            else if(this.mOnCheckboxClickListener != null) {
                ((AlertController.RecycleListView)view1).setOnItemClickListener(new i(this, ((AlertController.RecycleListView)view1), l0));
            }
            AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0 = this.mOnItemSelectedListener;
            if(adapterView$OnItemSelectedListener0 != null) {
                ((AlertController.RecycleListView)view1).setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
            }
            if(this.mIsSingleChoice) {
                ((AlertController.RecycleListView)view1).setChoiceMode(1);
            }
            else if(this.mIsMultiChoice) {
                ((AlertController.RecycleListView)view1).setChoiceMode(2);
            }
            l0.g = (AlertController.RecycleListView)view1;
        }
        View view2 = this.mView;
        if(view2 != null) {
            if(this.mViewSpacingSpecified) {
                l0.h = view2;
                l0.i = 0;
                l0.n = true;
                l0.j = this.mViewSpacingLeft;
                l0.k = this.mViewSpacingTop;
                l0.l = this.mViewSpacingRight;
                l0.m = this.mViewSpacingBottom;
                return;
            }
            l0.h = view2;
            l0.i = 0;
            l0.n = false;
            return;
        }
        int v3 = this.mViewLayoutResId;
        if(v3 != 0) {
            l0.h = null;
            l0.i = v3;
            l0.n = false;
        }
    }
}

