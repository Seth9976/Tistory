package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListFragment extends Fragment {
    public final m A;
    public final z1 B;
    public ListAdapter C;
    public ListView D;
    public View E;
    public TextView F;
    public View G;
    public View H;
    public CharSequence I;
    public boolean J;
    public final Handler z;

    public ListFragment() {
        this.z = new Handler();
        this.A = new m(this, 3);
        this.B = new z1(this);
    }

    @Nullable
    public ListAdapter getListAdapter() {
        return this.C;
    }

    @NonNull
    public ListView getListView() {
        this.h();
        return this.D;
    }

    public long getSelectedItemId() {
        this.h();
        return this.D.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        this.h();
        return this.D.getSelectedItemPosition();
    }

    public final void h() {
        if(this.D != null) {
            return;
        }
        View view0 = this.getView();
        if(view0 == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if(view0 instanceof ListView) {
            this.D = (ListView)view0;
        }
        else {
            TextView textView0 = (TextView)view0.findViewById(0xFF0001);
            this.F = textView0;
            if(textView0 == null) {
                this.E = view0.findViewById(0x1020004);
            }
            else {
                textView0.setVisibility(8);
            }
            this.G = view0.findViewById(0xFF0002);
            this.H = view0.findViewById(0xFF0003);
            View view1 = view0.findViewById(0x102000A);
            if(!(view1 instanceof ListView)) {
                throw view1 == null ? new RuntimeException("Your content must have a ListView whose id attribute is \'android.R.id.list\'") : new RuntimeException("Content has view with id attribute \'android.R.id.list\' that is not a ListView class");
            }
            this.D = (ListView)view1;
            View view2 = this.E;
            if(view2 == null) {
                CharSequence charSequence0 = this.I;
                if(charSequence0 != null) {
                    this.F.setText(charSequence0);
                    this.D.setEmptyView(this.F);
                }
            }
            else {
                ((ListView)view1).setEmptyView(view2);
            }
        }
        this.J = true;
        this.D.setOnItemClickListener(this.B);
        ListAdapter listAdapter0 = this.C;
        if(listAdapter0 != null) {
            this.C = null;
            this.setListAdapter(listAdapter0);
        }
        else if(this.G != null) {
            this.i(false, false);
        }
        this.z.post(this.A);
    }

    public final void i(boolean z, boolean z1) {
        this.h();
        View view0 = this.G;
        if(view0 == null) {
            throw new IllegalStateException("Can\'t be used with a custom content view");
        }
        if(this.J == z) {
            return;
        }
        this.J = z;
        if(z) {
            if(z1) {
                view0.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0001));
                this.H.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0000));
            }
            else {
                view0.clearAnimation();
                this.H.clearAnimation();
            }
            this.G.setVisibility(8);
            this.H.setVisibility(0);
            return;
        }
        if(z1) {
            view0.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0000));
            this.H.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0001));
        }
        else {
            view0.clearAnimation();
            this.H.clearAnimation();
        }
        this.G.setVisibility(0);
        this.H.setVisibility(8);
    }

    @Override  // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Context context0 = this.requireContext();
        View view0 = new FrameLayout(context0);
        LinearLayout linearLayout0 = new LinearLayout(context0);
        linearLayout0.setId(0xFF0002);
        linearLayout0.setOrientation(1);
        linearLayout0.setVisibility(8);
        linearLayout0.setGravity(17);
        linearLayout0.addView(new ProgressBar(context0, null, 0x101007A), new FrameLayout.LayoutParams(-2, -2));
        ((ViewGroup)view0).addView(linearLayout0, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setId(0xFF0003);
        TextView textView0 = new TextView(context0);
        textView0.setId(0xFF0001);
        textView0.setGravity(17);
        frameLayout0.addView(textView0, new FrameLayout.LayoutParams(-1, -1));
        ListView listView0 = new ListView(context0);
        listView0.setId(0x102000A);
        listView0.setDrawSelectorOnTop(false);
        frameLayout0.addView(listView0, new FrameLayout.LayoutParams(-1, -1));
        ((ViewGroup)view0).addView(frameLayout0, new FrameLayout.LayoutParams(-1, -1));
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.z.removeCallbacks(this.A);
        this.D = null;
        this.J = false;
        this.H = null;
        this.G = null;
        this.E = null;
        this.F = null;
        super.onDestroyView();
    }

    public void onListItemClick(@NonNull ListView listView0, @NonNull View view0, int v, long v1) {
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view0, @Nullable Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        this.h();
    }

    @NonNull
    public final ListAdapter requireListAdapter() {
        ListAdapter listAdapter0 = this.getListAdapter();
        if(listAdapter0 == null) {
            throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
        }
        return listAdapter0;
    }

    public void setEmptyText(@Nullable CharSequence charSequence0) {
        this.h();
        TextView textView0 = this.F;
        if(textView0 == null) {
            throw new IllegalStateException("Can\'t be used with a custom content view");
        }
        textView0.setText(charSequence0);
        if(this.I == null) {
            this.D.setEmptyView(this.F);
        }
        this.I = charSequence0;
    }

    public void setListAdapter(@Nullable ListAdapter listAdapter0) {
        boolean z = false;
        boolean z1 = this.C != null;
        this.C = listAdapter0;
        ListView listView0 = this.D;
        if(listView0 != null) {
            listView0.setAdapter(listAdapter0);
            if(!this.J && !z1) {
                if(this.requireView().getWindowToken() != null) {
                    z = true;
                }
                this.i(true, z);
            }
        }
    }

    public void setListShown(boolean z) {
        this.i(z, true);
    }

    public void setListShownNoAnimation(boolean z) {
        this.i(z, false);
    }

    public void setSelection(int v) {
        this.h();
        this.D.setSelection(v);
    }
}

