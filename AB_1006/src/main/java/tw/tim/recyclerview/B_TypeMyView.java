package tw.tim.recyclerview;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.HashMap;

public class B_TypeMyView extends MyViewHolders {

    public TextView tvShow;

    public B_TypeMyView(@NonNull View itemView) {
        super(itemView);
        tvShow = itemView.findViewById(R.id.textView_Word);
    }
    /**將資料綁到介面Ｂ的內容*/
    @Override
    public void bindViewHolder(HashMap<String, String> hashMap) {
        tvShow.setText(hashMap.get("startTime")+"\n"+hashMap.get("endTime")+"\n"+hashMap.get("parameterStr"));
    }
}