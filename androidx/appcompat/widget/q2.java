package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;

public final class q2 implements View.OnClickListener {
    public final SearchView a;

    public q2(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        SearchView searchView0 = this.a;
        SearchAutoComplete searchView$SearchAutoComplete0 = searchView0.p;
        if(view0 == searchView0.t) {
            searchView0.o(false);
            searchView$SearchAutoComplete0.requestFocus();
            searchView$SearchAutoComplete0.setImeVisibility(true);
            View.OnClickListener view$OnClickListener0 = searchView0.O;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(searchView0);
                return;
            }
        }
        else {
            if(view0 == searchView0.v) {
                searchView0.f();
                return;
            }
            if(view0 == searchView0.u) {
                searchView0.i();
                return;
            }
            if(view0 == searchView0.w) {
                SearchableInfo searchableInfo0 = searchView0.f0;
                if(searchableInfo0 != null) {
                    try {
                        if(searchableInfo0.getVoiceSearchLaunchWebSearch()) {
                            Intent intent0 = new Intent(searchView0.H);
                            ComponentName componentName0 = searchableInfo0.getSearchActivity();
                            intent0.putExtra("calling_package", (componentName0 == null ? null : componentName0.flattenToShortString()));
                            searchView0.getContext().startActivity(intent0);
                            return;
                        }
                        if(searchableInfo0.getVoiceSearchLaunchRecognizer()) {
                            Intent intent1 = searchView0.d(searchView0.I, searchableInfo0);
                            searchView0.getContext().startActivity(intent1);
                            return;
                        }
                    }
                    catch(ActivityNotFoundException unused_ex) {
                        Log.w("SearchView", "Could not find voice search activity");
                        return;
                    }
                }
            }
            else if(view0 == searchView$SearchAutoComplete0) {
                searchView0.e();
            }
        }
        try {
        }
        catch(ActivityNotFoundException unused_ex) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}

