package tw.noel.sung.com.practice_asynclistdiffer.adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tw.noel.sung.com.practice_asynclistdiffer.base.BaseAsyncListDifferRecyclerViewAdapter;
import tw.noel.sung.com.practice_asynclistdiffer.databinding.ListTestBinding;
import tw.noel.sung.com.practice_asynclistdiffer.model.TestModel;


public class TestAdapterAsyncListDiffer extends BaseAsyncListDifferRecyclerViewAdapter<TestModel.DatasBean> {

    private ArrayList<TestModel.DatasBean> testModels = new ArrayList<>();

    //----------

    /***
     * 更新數據
     * @param newTestModels
     */
    public void setData(ArrayList<TestModel.DatasBean> newTestModels) {
        testModels = update(newTestModels);
    }

    //----------

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListTestBinding listTestBinding = ListTestBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(listTestBinding);
    }

    //----------------

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) holder;
            viewHolder.listTestBinding.textView.setText(testModels.get(position).getPharmacyName());
        }
    }

    //----------------

    static class ViewHolder extends RecyclerView.ViewHolder {
        ListTestBinding listTestBinding;

        ViewHolder(ListTestBinding listTestBinding) {
            super(listTestBinding.getRoot());
            this.listTestBinding = listTestBinding;
        }
    }
}
