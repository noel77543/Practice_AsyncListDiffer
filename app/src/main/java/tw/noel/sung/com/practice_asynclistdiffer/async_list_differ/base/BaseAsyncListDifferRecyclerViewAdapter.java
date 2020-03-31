package tw.noel.sung.com.practice_asynclistdiffer.async_list_differ.base;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public abstract class BaseAsyncListDifferRecyclerViewAdapter<T extends BaseAsyncListDifferModel> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private AsyncListDiffer<T> asyncListDiffer;

    @SuppressWarnings("unchecked")
    public BaseAsyncListDifferRecyclerViewAdapter(){
        asyncListDiffer = new AsyncListDiffer<T>(this,new CustomDiffUtilCallBack());
    }

    //----------

    /***
     * 更新資料
     * @param newList
     * @return
     */
    @SuppressWarnings("unchecked")
    public ArrayList<T> update(ArrayList<T> newList) {
        asyncListDiffer.submitList(new ArrayList<T>(newList));
        return newList;
    }

    //----------

    @Override
    public int getItemCount() {
        return asyncListDiffer.getCurrentList().size();
    }

}
