package com.example.android4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class MoneyAdapter extends BaseAdapter {
    private Context context;
    private List<Money> moneyList;

    public MoneyAdapter(Context context, List<Money> moneyList) {
        this.context = context;
        this.moneyList = moneyList;
    }


    @Override
    public int getCount() {
        return moneyList.size();
    }

    @Override
    public Object getItem(int i) {
        return moneyList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_money, null);
        }
        Money money = moneyList.get(i);

        ImageView moneyImageView = view.findViewById(R.id.moneyImageView);
        TextView codeTextView = view.findViewById(R.id.codeTextView);
        TextView nameTextView = view.findViewById(R.id.nameTextView);
        TextView buyValueTextView = view.findViewById(R.id.buyValueTextView);
        TextView sendValueTextView = view.findViewById(R.id.sendValueTextView);

        moneyImageView.setImageResource(money.getImageResourceId());

        codeTextView.setText(money.getCode());
        nameTextView.setText(money.getName());
        buyValueTextView.setText("Buy Value: " + money.getBuyValue());
        sendValueTextView.setText("Send Value: " + money.getSendValue());

        return view;
    }
}
